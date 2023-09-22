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

import java.util.Properties;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.apache.kafka.clients.admin.ListTopicsResult;

import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentKafkaLibrary {

	/**
	 * 
	 * @param props
	 * @return
	 */
	public static Boolean isKafkaRunning(Properties props) {

		try (AdminClient client = KafkaAdminClient.create(props)) {
			ListTopicsResult topics = client.listTopics();
			Set<String> names = topics.names().get();
			if (names.isEmpty()){
				// case: if no topic found.
				System.err.println("No Kafka Topics Found");
				return false;
			}else {
				return true;
			}
			
		}
		catch (Exception e){
			// Kafka is not available
			System.err.println("Kafka is not available".toUpperCase());
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.KAFKA_NOT_RUNNING);		    
		}
		return false;
	}




	public static JsonObject getMessageLogEntryJSON(String source, String topic, String key, String message)
			throws Exception {

		String bootstrapServers = AlignmentFunctions.getProperty(AlignmentKafkaLibrary.class.getClassLoader(), InstanceType.KAFKA.getProperties(),
				ConfigurationProperties.BOOTSTRAPSERVERS);

		JsonObject model = Json.createObjectBuilder().add("bootstrapServers", bootstrapServers).add("source", source)
				.add("topic", topic).add("key", key).add("message", message).build();

		return model;
	}
}