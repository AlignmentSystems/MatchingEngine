package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentFIXEngineKafkaConsumer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceKafkaAbstractSimple;
import com.alignmentsystems.library.interfaces.InterfaceKafkaMessageHandler;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentFIXEngineKafkaConsumer extends InterfaceKafkaAbstractSimple implements Runnable {
	public final static String CLASSNAME = AlignmentFIXEngineKafkaConsumer.class.getSimpleName();
	private final int TIME_OUT_MS = 5000;
	private KafkaConsumer<String, byte[]> kafkaConsumer = null;
	private final AtomicBoolean closed = new AtomicBoolean(false);
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null; 
	private Properties props = null;

	public AlignmentFIXEngineKafkaConsumer() throws Exception {
		super();
	}

	
	/**
	 * 
	 * @param kafkaConsumer
	 */
	public void setKafkaConsumer(KafkaConsumer<String, byte[]> kafkaConsumer) {
		this.kafkaConsumer = kafkaConsumer;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public KafkaConsumer<String, byte[]> getKafkaConsumer() {
		return kafkaConsumer;
	}
	
	private synchronized void waiter() throws IllegalArgumentException, InterruptedException , IllegalMonitorStateException {
		wait(2000);
	} 
	
	
	
	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);
		
		AlignmentUEH ueh = new AlignmentUEH();	
		Thread.setDefaultUncaughtExceptionHandler(ueh);
		
		while (run.get()) {
			try {
				waiter();
			} catch (IllegalArgumentException | InterruptedException | IllegalMonitorStateException e) {
				log.error(e.getMessage() , e );
			}
		}
	}

	@Override
	public void shutdown() throws Exception {
		closed.set(true);
		log.info("Shutting down consumer");
		getKafkaConsumer().wakeup();
	}
	
	@Override
	public void runAlways(String topicName, InterfaceKafkaMessageHandler callback) throws Exception {
		
		List<String> topicNames = List.of(topicName);
		runAlways(topicNames, callback);	
	}

	@Override
	public void runAlways(List<String> topicNames , InterfaceKafkaMessageHandler callback) throws Exception {
		
		try {
			this.props = AlignmentFunctions.getProperties(AlignmentFIXEngineKafkaConsumer.class.getClassLoader() , InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException | NullPointerException e) {
			//log.error(e.getMessage() , e);
			throw e;
		}
		// make the consumer available for graceful shutdown
		setKafkaConsumer(new KafkaConsumer<>(props));

		// keep running forever or until shutdown() is called from another thread.
		try {
			getKafkaConsumer().subscribe(topicNames);
			while (!closed.get()) {
				ConsumerRecords<String, byte[]> records = getKafkaConsumer().poll(Duration.ofMillis(TIME_OUT_MS));
				if (records.count() == 0) {
					log.info("No records retrieved");
				}else {

					for (ConsumerRecord<String, byte[]> record : records) {
						log.info("Records retrieved - execute callback");
						callback.processMessage(record.topic(), record);
					}
				}
			}
		} catch (WakeupException e) {
			// Ignore exception if closing
			if (!closed.get())
				throw e;
		}
	}


	@Override
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger) throws FileNotFoundException , NullPointerException{
		final String METHOD = "initialise";
				 
		this.log = log;
		this.debugger = debugger; 
		
		log.info(CLASSNAME + "." + METHOD);

		
		try {
			this.props = AlignmentFunctions.getProperties(AlignmentFIXEngineKafkaConsumer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException |NullPointerException e) {
			throw e;
		}

		return Boolean.TRUE;			

	}
}