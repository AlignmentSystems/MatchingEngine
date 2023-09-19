package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentMember
 *	Description		:
 *****************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class AlignmentMember {
	private List<AlignmentMemberConnectionDetails>  connections = new ArrayList<AlignmentMemberConnectionDetails>();
	private Boolean selfTradeProtection = Boolean.TRUE;

	
	/**
	 * @param connections
	 * @param selfTradeProtection
	 */
	protected AlignmentMember(List<AlignmentMemberConnectionDetails> connections, Boolean selfTradeProtection) {
		super();
		this.connections = connections;
		this.selfTradeProtection = selfTradeProtection;
	}
	
	
	protected List<AlignmentMemberConnectionDetails> getConnections() {
		return connections;
	}


	protected Boolean getSelfTradeProtection() {
		return selfTradeProtection;
	}

}
