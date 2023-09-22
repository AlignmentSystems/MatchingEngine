package com.alignmentsystems.killer;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	22nd September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	KillerKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceKafkaProducer;

public class KillerKafkaProducer implements InterfaceKafkaProducer{
	public final static String CLASSNAME = KillerKafkaProducer.class.getSimpleName();
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null; 

	@Override
	public void send(String topicName, String key, byte[] binaryMessage) {

		// create the ProducerRecord object which will represent the message to the
		// Kafka broker.
		ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<>(topicName, key, binaryMessage);

		// Send the message to the Kafka broker using the internal
		// KafkaProducer
		this.kafkaProducerB.send(producerRecord);
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
				props = AlignmentFunctions.getProperties(KillerKafkaProducer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		return true;
	}
}