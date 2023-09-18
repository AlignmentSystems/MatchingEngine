package com.alignmentsystems.matching;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceFIXToBinaryProcessor;
import com.alignmentsystems.library.interfaces.InterfaceOrder;



/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class FIXToBinaryProcessor implements Runnable, InterfaceFIXToBinaryProcessor {
	protected final static String CLASSNAME = FIXToBinaryProcessor.class.getSimpleName().toString();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inQueue = null;
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private AtomicBoolean running = new AtomicBoolean(false);
	private final static int MILLISLEEP = 200;
	private static BinaryFromToCanonical binaryFromToCanonical = new BinaryFromToCanonical();

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





	@Override
	public void run() {
		running.set(true);

		while (running.get()) {

			InterfaceOrder inSeq = inQueue.poll();

			if (inSeq != null) {
				Sender sender = binaryFromToCanonical.getBufferFromAlignmentOrder(inSeq);
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