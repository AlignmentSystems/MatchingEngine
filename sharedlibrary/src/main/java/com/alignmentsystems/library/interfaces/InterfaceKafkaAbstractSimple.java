package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	KafkaAbstractSimple
 *	Description		:
 *****************************************************************************/

import java.util.List;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 * @see <a href="https://kafka.apache.org/documentation/#quickstart">Kafka</a>
 *
 */
public abstract class InterfaceKafkaAbstractSimple {
	/**
	 * Instantiates a new Abstract class, SimpleKafka.
	 * <p>
	 * This abstract class's constructor provides graceful shutdown behavior for
	 * Kafka producers and consumers
	 *
	 * @throws Exception the exception
	 */
	public InterfaceKafkaAbstractSimple() throws Exception {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					shutdown();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// log.info(MessageHelper.getSimpleJSONObject("Created the Shutdown Hook"));
	}

	/**
	 * The inherited classes will provide the behavior necessary to shut down
	 * gracefully.
	 *
	 * @throws Exception the exception that get thrown upon error
	 */
	public abstract void shutdown() throws Exception;

	/**
	 * This purpose of this method is to provide continuous behavior to produce or
	 * consume messages from a Kafka broker
	 *
	 * @param topicName the topicName to execute against
	 * @param callback  a callback function to provide processing logic after a
	 *                  message is produced or after a message is consumed
	 * @throws Exception the exception that get thrown upon error
	 */
	public abstract void runAlways(String topicName, InterfaceKafkaMessageHandler callback) throws Exception;
	
	
	
	/**
	 * This purpose of this method is to provide continuous behavior to produce or
	 * consume messages from a Kafka broker
	 *
	 * @param topicNames the topicNames to execute against
	 * @param callback  a callback function to provide processing logic after a
	 *                  message is produced or after a message is consumed
	 * @throws Exception the exception that get thrown upon error
	 */
	public abstract void runAlways(List<String> topicNames , InterfaceKafkaMessageHandler callback) throws Exception;
}