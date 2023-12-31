package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	20th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentFIXEngineKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceKafkaProducer;

public class AlignmentFIXEngineKafkaProducer implements InterfaceKafkaProducer, Runnable  {
	public final static String CLASSNAME = AlignmentFIXEngineKafkaProducer.class.getSimpleName();
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null; 
	private final static int MILLISLEEP = 2000;






	@Override
	public void send(String topicName, String key, byte[] binaryMessage) {

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

	private synchronized void waiter() throws IllegalArgumentException , InterruptedException , IllegalMonitorStateException {
		wait(MILLISLEEP);
	} 

	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);

		while (run.get()) {
			try {
				waiter();
			} catch (IllegalArgumentException | InterruptedException | IllegalMonitorStateException e) {
				log.error(e.getMessage() , e );
			}
		}

	}

	@Override
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger)
			throws FileNotFoundException, NullPointerException {

		this.log = log;
		this.debugger = debugger;


		AlignmentUEH ueh = new AlignmentUEH(this.debugger);	
		Thread.setDefaultUncaughtExceptionHandler(ueh);

		if (this.kafkaProducerB == null) {
			Properties props;
			try {
				props = AlignmentFunctions.getProperties(AlignmentFIXEngineKafkaProducer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		return true;
	}
}