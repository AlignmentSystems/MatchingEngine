package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Member
 *	Description		:
 *****************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class Member {
	private List<ConnectionDetails>  connections = new ArrayList<ConnectionDetails>();
	private Boolean selfTradeProtection = Boolean.TRUE;

	
	/**
	 * @param connections
	 * @param selfTradeProtection
	 */
	protected Member(List<ConnectionDetails> connections, Boolean selfTradeProtection) {
		super();
		this.connections = connections;
		this.selfTradeProtection = selfTradeProtection;
	}
	
	
	protected List<ConnectionDetails> getConnections() {
		return connections;
	}


	protected Boolean getSelfTradeProtection() {
		return selfTradeProtection;
	}

}
