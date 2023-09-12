package com.alignmentsystems.library.enumerations;
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

import com.alignmentsystems.library.constants.Constants;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum InstanceType {
	UNKNOWN("Unknown", Boolean.FALSE, Boolean.TRUE),
	PERSISTENCE("Persistence" , Boolean.FALSE , Boolean.FALSE),
	MATCHINGENGINE("MatchingEngine" , Boolean.TRUE, Boolean.FALSE),
	EXCHANGEFIXACCEPTOR("ExchangeFIXAcceptor" , Boolean.TRUE, Boolean.FALSE),
	MULTICASTSERVER("MulticastServer" , Boolean.FALSE, Boolean.FALSE),
	ORDERBOOK("OrderBook" , Boolean.TRUE, Boolean.FALSE),
	MEMBERA("MemberA" , Boolean.TRUE, Boolean.FALSE),
	KAFKA("Kafka" , Boolean.FALSE, Boolean.FALSE),
	MEMBERB("MemberB" , Boolean.TRUE, Boolean.FALSE)
	;

	public final String type;
	public final Boolean creatable;
	public final Boolean isDefault;

	public String getProperties() {
		return new StringBuilder(this.type).append(Constants.DOTPROPERTIES).toString();
	};
	
	
	InstanceType(String actor, Boolean creatable , Boolean isDefault){
		this.type = actor;
		this.creatable = creatable;
		this.isDefault = isDefault;
	}
}