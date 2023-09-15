package com.alignmentsystems.matching;

import java.io.FileNotFoundException;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	12th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	FIXToBinaryProcessor
 *	Description		:	
 *****************************************************************************/

import java.nio.ByteBuffer;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceFIXToBinaryProcessor;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

public class FIXToBinaryProcessor implements Runnable, InterfaceFIXToBinaryProcessor {
	protected final static String CLASSNAME = FIXToBinaryProcessor.class.getSimpleName().toString();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inQueue = null;
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private AtomicBoolean running = new AtomicBoolean(false);
	private final static int MILLISLEEP = 200;
	
	public FIXToBinaryProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue, LogEncapsulation log) throws Exception{
		this.inQueue = inQueue;
		this.log = log;

		if (this.kafkaProducerB == null) {
			Properties props;
			try {
				props = LibraryFunctions.getProperties(FIXToBinaryProcessor.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		return true;
	}

	private Sender getBufferFromOrder(InterfaceOrder inSeq) {

		ByteBuffer buf = null;
		String receivedSymbol = null;
		String orderId = null;
		
		try {
		receivedSymbol = inSeq.getSymbol();
		orderId = inSeq.getOrderId().toString();
		final String receivedSender = inSeq.getSender();
		final String receivedTarget = inSeq.getTarget();
		final String receivedSide = inSeq.getOrderBookSide().getSideFIXStringValue();
		//get mappings...
		final Long exchangeIdMappedFromSenderCompID = DataMapper.getExchangeIdMappedFromSenderCompID(receivedSender);
		final Long exchangeIdMappedFromTargetCompID = DataMapper.getExchangeIdMappedFromTargetCompID(receivedTarget);
		final Long exchangeInstrumentIdMappedFromSymbol = DataMapper.getExchangeIdMappedFromInstrumentId(receivedSymbol);
		final Long exchangeSideCodeMappedFromSideCode = DataMapper.getExchangeSideCodeMappedFromMemberSideCode(receivedSide);
		
		final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
		
		
		final int bufferLength = 
				Long.BYTES * 2 //ClOrdId 
				+
				Long.BYTES * 2 //OrderId
				+
				Long.BYTES //exchangeIdMappedFromSenderCompID.BYTES
				+
				Long.BYTES //exchangeIdMappedFromTargetCompID.BYTES
				+
				Long.BYTES //this.orderQty
				+
				Long.BYTES //this.limitPrice
				+
				Long.BYTES //exchangeInstrumentIdMappedFromSymbol.BYTES
				+
				Long.BYTES //this.ts  getEpochSecond
				+
				Integer.BYTES // this.ts getNano()
				+
				Long.BYTES //this.SideCode
				;

		buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());
		buf.putLong(inSeq.getClOrdID().getLeastSignificantBits());
		buf.putLong(inSeq.getClOrdID().getMostSignificantBits());
		buf.putLong(inSeq.getOrderId().getLeastSignificantBits());
		buf.putLong(inSeq.getOrderId().getMostSignificantBits());
		buf.putLong(exchangeIdMappedFromSenderCompID);
		buf.putLong(exchangeIdMappedFromTargetCompID);
		buf.putLong(inSeq.getOrderQty());
		buf.putLong(inSeq.getLimitPrice());
		buf.putLong(exchangeInstrumentIdMappedFromSymbol);
		buf.putLong(inSeq.getTimestamp().toInstant().getEpochSecond());
		buf.putInt(inSeq.getTimestamp().toInstant().getNano());		
		buf.putLong(exchangeSideCodeMappedFromSideCode);
		
		buf.flip();
		} catch (Exception e) {
			this.log.error(e.getMessage() , e);
			throw e;
		}
		
		
		Sender sender = new Sender(buf.array(), receivedSymbol, orderId);

		return sender;
	}




	@Override
	public void run() {
		running.set(true);

		while (running.get()) {

			InterfaceOrder inSeq = inQueue.poll();

			if (inSeq != null) {
				Sender sender = getBufferFromOrder(inSeq);
				this.send(sender.getSymbol(), sender.getOrderId(), sender.getBinaryMessage());
			}
			try {
				Thread.currentThread();
				Thread.sleep(MILLISLEEP);

			} catch (InterruptedException e) {

				running.set(false);

				Thread.currentThread().interrupt();

				System.err.println(e.getMessage());

				System.err.println(new StringBuilder().append(CLASSNAME).append(Constants.SPACE).append(e.getMessage())
						.toString());
			}

		}

	}

	protected void send(String topicName, String key, byte[] binaryMessage) {

		// create the ProducerRecord object which will represent the message to the
		// Kafka broker.
		ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<>(topicName, key, binaryMessage);

		// Use the helper to create an informative log entry in JSON format
		// JsonObject obj = LibraryKafka.getMessageLogEntryJSON(CLASSNAME, topicName,
		// key, message);
		// log.info(obj.asJsonObject().toString());
		// Send the message to the Kafka broker using the internal
		// KafkaProducer
		this.kafkaProducerB.send(producerRecord);
	}

}