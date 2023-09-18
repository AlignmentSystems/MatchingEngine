package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	17th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBookKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.AlignmentExecutionReport;
import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.OperationEventType;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;

public class OrderBookKafkaProducer implements InterfaceMatchEvent, InterfaceAddedOrderToOrderBook, Runnable {
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private LogEncapsulation log = null;
	private static BinaryFromToCanonical binaryFromToCanonical = new BinaryFromToCanonical();





	public OrderBookKafkaProducer() {
		// TODO Auto-generated constructor stub
	}


	public boolean initialise(LogEncapsulation log) throws Exception{

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



	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);
		while (run.get()) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}

	}


	@Override
	public void matchHappened(InterfaceMatch match) {
		@SuppressWarnings("unused")
		final String methodName = "matchHappened";
		final String TOPIC = "FILL";

		log.infoMatchingEvent(OperationEventType.MATCHEVENT, match);

		AlignmentExecutionReport buyRpt = match.getBuyReport(); 
		AlignmentExecutionReport sellRpt = match.getSellReport(); 
		final byte[] buy = binaryFromToCanonical.getBufferFromExecutionReport(buyRpt);
		final byte[] sell = binaryFromToCanonical.getBufferFromExecutionReport(sellRpt);
		
		this.send(TOPIC , match.getSellOrderId().toString(), buy);
		this.send(TOPIC , match.getBuyOrderId().toString(), sell);
	}

	@Override
	public void addedOrderToOrderBook(InterfaceExecutionReport er) {
		@SuppressWarnings("unused")
		final String methodName = "addedOrderToOrderBook";
		final String TOPIC = "ACK";

		//log.infoMatchingEvent(OperationEventType.NEWORDEREVENT, er);
		
		byte[] ack = binaryFromToCanonical.getBufferFromExecutionReport(er);
		this.send(TOPIC, er.getExecID().toString(), ack);		
	}
}
