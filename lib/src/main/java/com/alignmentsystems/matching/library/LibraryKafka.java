package com.alignmentsystems.matching.library;
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

import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.ConfigurationProperties;


public class LibraryKafka {

	public LibraryKafka() {
		// TODO Auto-generated constructor stub
	}

	 public static JsonObject getMessageLogEntryJSON(String source, String topic, String key, String message) throws Exception {

		 String bootstrapServers = LibraryFunctions.getProperty(Actors.KAFKA, ConfigurationProperties.BOOTSTRAPSERVERS);
		 
		 
			JsonObject model = Json.createObjectBuilder()	        
	        .add("bootstrapServers", bootstrapServers)
			.add("source", source)
			.add("topic", topic)
			.add("key", key)
			.add("message", message)
			.build();

	        return model;
	    }
	
}
