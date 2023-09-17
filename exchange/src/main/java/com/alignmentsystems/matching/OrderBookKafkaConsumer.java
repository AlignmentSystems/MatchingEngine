package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBookKafkaConsumer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.enumerations.InstanceType;

public class OrderBookKafkaConsumer  extends KafkaAbstractSimple implements Runnable{
	public final static String CLASSNAME = OrderBookKafkaConsumer.class.getSimpleName();
	private final int TIME_OUT_MS = 5000;
	private KafkaConsumer<String, byte[]> kafkaConsumer = null;
	private final AtomicBoolean closed = new AtomicBoolean(false);
	private LogEncapsulation log = null;
	private Properties props = null;



	public OrderBookKafkaConsumer() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean initialise(LogEncapsulation log) throws FileNotFoundException , NullPointerException{
		this.log = log;

		try {
			props = LibraryFunctions.getProperties(OrderBookKafkaConsumer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException  |NullPointerException e) {
			throw e;
		}

		return Boolean.TRUE;			
	}

	public void setKafkaConsumer(KafkaConsumer<String, byte[]> kafkaConsumer) {
		this.kafkaConsumer = kafkaConsumer;
	}

	void run(String topicName, KafkaMessageHandler callback, Integer numberOfRecords) throws Exception {
		// See if the number of records is provided
		Optional<Integer> recs = Optional.ofNullable(numberOfRecords);

		// adjust the number of records to get accordingly
		Integer numOfRecs = recs.orElseGet(() -> Integer.parseInt(props.getProperty("max.poll.records")));
		props.setProperty("max.poll.records", String.valueOf(numOfRecs));

		// create the consumer
		KafkaConsumer<String, byte[]> consumer = new KafkaConsumer<>(props);

		// make the consumer available for graceful shutdown
		setKafkaConsumer(consumer);
		consumer.assign(Collections.singleton(new TopicPartition(topicName, 0)));

		int recNum = numOfRecs;
		while (recNum > 0) {
			ConsumerRecords<String, byte[]> records = consumer.poll(Duration.ofMillis(TIME_OUT_MS));
			recNum = records.count();
			if (recNum == 0) {
				log.info("No records retrieved");
				break;
			}

			for (ConsumerRecord<String, byte[]> record : records) {
				callback.processMessage(topicName, record);
				recNum--;
			}
		}

		consumer.close();
	}

	public KafkaConsumer<String, byte[]> getKafkaConsumer() {
		return kafkaConsumer;
	}

	private void close() throws Exception {
		if (this.getKafkaConsumer() == null) {
			log.info("The internal consumer is NULL");
			return;
		}
		log.info("Closing consumer");
		if (this.getKafkaConsumer() != null)
			this.getKafkaConsumer().close();
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
	public void runAlways(List<String> topicNames, KafkaMessageHandler callback) throws Exception {
		
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
