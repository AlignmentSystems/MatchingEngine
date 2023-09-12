package com.alignmentsystems.library.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	ConfigurationProperties
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum ConfigurationProperties {
	PASSWORD("Password"),
	USERNAME("Username"),
	LOGFILEDIRECTORY("LogFileDirectory"),
	LOGFILENAMESUFFIX("LogFileNameSuffix"),
	MULTICASTHOST("Host"),
	MULTICASTPORT("Port"),
	BOOTSTRAPSERVERS("bootstrap.servers")	;

	public final String targetProperty;

	ConfigurationProperties(String requestedProperty){
		this.targetProperty = requestedProperty;
	}
}

