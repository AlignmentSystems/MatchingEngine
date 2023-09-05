package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MessageDirection
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum MessageDirection {
		INDETERMINATE("INDETERMINATE"),
		SENT("SENT"),
		RECEIVED("RECD");


		public final String value;
		MessageDirection(String value){
				this.value = value;
			}
}
