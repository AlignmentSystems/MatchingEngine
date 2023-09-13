package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MatchingEngineWrapper
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public abstract class KafkaAbstractSimple {
	/**
	 * Instantiates a new Abstract class, SimpleKafka.
	 * <p>
	 * This abstract class's constructor provides graceful shutdown behavior for
	 * Kafka producers and consumers
	 *
	 * @throws Exception the exception
	 */
	public KafkaAbstractSimple() throws Exception {
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
	public abstract void runAlways(String topicName, KafkaMessageHandler callback) throws Exception;
}