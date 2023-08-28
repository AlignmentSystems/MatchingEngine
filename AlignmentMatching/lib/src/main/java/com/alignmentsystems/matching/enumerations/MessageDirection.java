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

public enum MessageDirection {
	
		Sent("SENT"),
		Received("RECD");


		public final String value;
		MessageDirection(String value){
				this.value = value;
			}
}
