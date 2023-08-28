package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	LibraryFunctions
 * 
 *****************************************************************************/

import com.alignmentsystems.matching.constants.Constants;

/**
 * Actors - used by Helper to get properties from the configuration file.
 * @author John Greenan john.greenan@alignment-systems.com
 */
public enum Actors {
		A("MemberA"),
		B("MemberB"),
		EXCHANGE("Exchange");
		
		public final String targetActor;
		
		Actors(String actor){
			this.targetActor = actor + Constants.DOTPROPERTIES;
		}
	}