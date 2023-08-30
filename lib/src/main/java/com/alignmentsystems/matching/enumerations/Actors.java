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

import com.alignmentsystems.matching.constants.Constants;

/**
 * Actors - used by Helper to get properties from the configuration file.
 * @author John Greenan john.greenan@alignment-systems.com
 */
public enum Actors {
		A("MemberA"),
		B("MemberB"),
		EXCHANGE("Exchange"),
		PERSISTENCE("Persistence");
		
		public final String targetActor;
		public final String targetActorProperties;
		Actors(String actor){
			this.targetActor = actor;
			this.targetActorProperties = actor + Constants.DOTPROPERTIES;
		}
	}