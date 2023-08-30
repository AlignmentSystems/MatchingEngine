package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Actors
 *	Description		:
 *****************************************************************************/

/**
* @author John Greenan john.greenan@alignment-systems.com
*/
public enum  PersistenceRecordType {
	INFO ("[INFO] "),
	ERROR("[ERROR] "),
	DEBUG("[DEBUG] ");
	public final String recordType;
	
	PersistenceRecordType(String recordType){
		this.recordType = recordType;
	}

}
