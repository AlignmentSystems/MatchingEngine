package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	FIXEngineKafkaListener
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

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.enumerations.InstanceType;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class FIXEngineKafkaListener extends KafkaAbstractSimple implements Runnable {
	public final static String CLASSNAME = OrderBookKafkaConsumer.class.getSimpleName();
	private final int TIME_OUT_MS = 5000;
	private KafkaConsumer<String, byte[]> kafkaConsumer = null;
	private final AtomicBoolean closed = new AtomicBoolean(false);
	private LogEncapsulation log = null;
	private Properties props = null;

	public FIXEngineKafkaListener() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * 
	 * @param log
	 * @return
	 * @throws FileNotFoundException
	 * @throws NullPointerException
	 */
	public Boolean initialise(LogEncapsulation log) throws FileNotFoundException , NullPointerException{
		this.log = log;

		try {
			this.props = LibraryFunctions.getProperties(FIXEngineKafkaListener.class.getClassLoader(), InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException  |NullPointerException e) {
			throw e;
		}

		return Boolean.TRUE;			
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
	public void shutdown() throws Exception {
		closed.set(true);
		log.info("Shutting down consumer");
		getKafkaConsumer().wakeup();
	}
	
	@Override
	public void runAlways(String topicName, KafkaMessageHandler callback) throws Exception {
		
		List<String> topicNames = List.of(topicName);
		runAlways(topicNames, callback);	
	}

	@Override
	public void runAlways(List<String> topicNames , KafkaMessageHandler callback) throws Exception {
		Properties props;
		try {
			props = LibraryFunctions.getProperties(OrderBookKafkaConsumer.class.getClassLoader() , InstanceType.KAFKA.getProperties());
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
}