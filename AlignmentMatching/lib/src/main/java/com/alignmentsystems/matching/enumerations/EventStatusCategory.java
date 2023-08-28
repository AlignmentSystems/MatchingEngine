package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	EventStatusCategory
 * 
 *****************************************************************************/

/**
* @author John Greenan john.greenan@alignment-systems.com
*/
public enum EventStatusCategory {
	
		INFO ("[INFO]"),
		ERROR("[ERROR]"),
		DEBUG("[DEBUG]");
		public final String messageType;
		
		EventStatusCategory(String messageType){
			this.messageType = messageType;
		}
	}