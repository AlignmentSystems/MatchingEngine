package com.alignmentsystems.library.interfaces;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	20th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;

import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;

public interface InterfaceKafkaProducer {
	public abstract boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger) throws FileNotFoundException , NullPointerException;
	public default void send(AlignmentKafkaSender sender) {
		this.send(sender.getTopic(), sender.getKey(), sender.getBinaryMessage());
	}
	public abstract void send(String topicName, String key, byte[] binaryMessage);
}
