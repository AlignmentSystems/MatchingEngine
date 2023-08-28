package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	ConfigurationProperties
 * 
 *****************************************************************************/

/**
 * ConfigurationProperties - used by LibraryFunctions to get properties from the configuration file.
 * @author John Greenan john.greenan@alignment-systems.com
 */

public enum ConfigurationProperties {
		PASSWORD("Password"),
		USERNAME("Username"),
		LOGFILEDIRECTORY("LogFileDirectory"),
		LOGFILENAMESUFFIX("LogFileNameSuffix"),
		KEY("KeyFor360T");
		
		public final String targetProperty;
		
		ConfigurationProperties(String requestedProperty){
			this.targetProperty = requestedProperty;
		}
	}

