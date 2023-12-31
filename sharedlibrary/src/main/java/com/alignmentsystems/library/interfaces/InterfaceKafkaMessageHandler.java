package com.alignmentsystems.library.interfaces;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	KafkaMessageHandler
 *	Description		:
 *****************************************************************************/

import org.apache.kafka.clients.consumer.ConsumerRecord;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 * The interface KafkaMessageHandler.
 *
 * This interface is the template callback functions that can be passed to an
 * instance of the {@link com.alignmentsystems.matching.OrderBookKafkaConsumer}
 */
@FunctionalInterface
public interface InterfaceKafkaMessageHandler {
	/**
	 * The method that defines the message processing behavior
	 *
	 * @param topicName The name of the topic being consumed
	 * @param message   The message that was consumed
	 * @throws Exception Thrown if an exception occurs
	 */
	void processMessage(String topicName, ConsumerRecord<String, byte[]> message) throws Exception;
}