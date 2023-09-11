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
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum InstanceType {
	UNKNOWN("Unknown", Boolean.FALSE, Boolean.FALSE),
	PERSISTENCE("Persistence" , Boolean.FALSE , Boolean.FALSE),
	MATCHINGENGINE("MatchingEngine" , Boolean.TRUE, Boolean.FALSE),
	MULTICASTSERVER("MulticastServer" , Boolean.FALSE, Boolean.FALSE),
	ORDERBOOK("OrderBook" , Boolean.TRUE, Boolean.FALSE),
	KAFKA("Kafka" , Boolean.FALSE, Boolean.FALSE),
	ALLINONE("AllInOne" , Boolean.TRUE , Boolean.TRUE)
	;

	public final String type;
	public final Boolean creatable;
	public final Boolean isDefault;

	InstanceType(String actor, Boolean creatable , Boolean isDefault){
		this.type = actor;
		this.creatable = creatable;
		this.isDefault = isDefault;
	}
}