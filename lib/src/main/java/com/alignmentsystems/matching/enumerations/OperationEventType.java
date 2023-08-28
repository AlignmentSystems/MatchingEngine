package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OperationEventType
 *	Description		:
 *****************************************************************************/

public enum OperationEventType {
MatchEvent("Match"),
NewOrderEvent("NewOrder");


public final String value;
	OperationEventType(String value){
		this.value = value;
	}
}
