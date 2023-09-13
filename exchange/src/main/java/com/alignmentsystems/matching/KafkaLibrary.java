package com.alignmentsystems.matching;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	8th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LibraryKafka
 *	Description		:
 *****************************************************************************/

import javax.json.Json;
import javax.json.JsonObject;

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class KafkaLibrary {

	public static JsonObject getMessageLogEntryJSON(String source, String topic, String key, String message)
			throws Exception {

		String bootstrapServers = LibraryFunctions.getProperty(KafkaLibrary.class.getClassLoader(), InstanceType.KAFKA.getProperties(),
				ConfigurationProperties.BOOTSTRAPSERVERS);

		JsonObject model = Json.createObjectBuilder().add("bootstrapServers", bootstrapServers).add("source", source)
				.add("topic", topic).add("key", key).add("message", message).build();

		return model;
	}
}