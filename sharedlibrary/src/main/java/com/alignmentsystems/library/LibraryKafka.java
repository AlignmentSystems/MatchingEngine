package com.alignmentsystems.library;
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

import com.alignmentsystems.library.enumerations.Actors;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;


public class LibraryKafka {

	public LibraryKafka() {
		// TODO Auto-generated constructor stub
	}

	 public static JsonObject getMessageLogEntryJSON(String source, String topic, String key, String message) throws Exception {

		 String bootstrapServers = LibraryFunctions.getProperty(InstanceType.KAFKA, ConfigurationProperties.BOOTSTRAPSERVERS);
		 
		 
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