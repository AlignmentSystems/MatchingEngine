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
	FIXMESSAGINGINFRA("FIXMessagingInfra" , Boolean.TRUE, Boolean.FALSE),
	EXCHANGEFIXACCEPTOR("ExchangeFIXAcceptor" , Boolean.FALSE, Boolean.FALSE),
	MULTICASTSERVER("MulticastServer" , Boolean.FALSE, Boolean.FALSE),
	ORDERBOOK("OrderBook" , Boolean.TRUE, Boolean.FALSE),
	KAFKA("Kafka" , Boolean.FALSE, Boolean.FALSE),
	MEMBERA("MemberA" , Boolean.TRUE, Boolean.FALSE),
	MEMBERB("MemberB" , Boolean.TRUE, Boolean.FALSE),
	;

	public final String type;
	public final Boolean creatable;
	public final Boolean isDefault;
	private final static String LOG = "Log";

	InstanceType(String actor, Boolean creatable , Boolean isDefault){
		this.type = actor;
		this.creatable = creatable;
		this.isDefault = isDefault;
	}

	
	public String getProperties() {
		return new StringBuilder(this.type).append(Constants.DOTPROPERTIES).toString();
	};

	public String getLoggerProperties() {
		return new StringBuilder(this.type).append(LOG).append(Constants.DOTPROPERTIES).toString();
	};

	
	
}