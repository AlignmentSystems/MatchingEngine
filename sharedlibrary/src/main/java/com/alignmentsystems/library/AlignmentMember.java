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
import java.util.Iterator;
import java.util.List;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentMember {
	private List<AlignmentMemberConnectionDetails>  connections = new ArrayList<AlignmentMemberConnectionDetails>();
	private Boolean selfTradeProtection = Boolean.TRUE;


	/**
	 * @param connections
	 * @param selfTradeProtection
	 */
	public AlignmentMember(List<AlignmentMemberConnectionDetails> connections, Boolean selfTradeProtection) {
		super();
		this.connections = connections;
		this.selfTradeProtection = selfTradeProtection;
	}


	/**
	 * 
	 * @param senderCompId
	 * @param targetCompId
	 * @return Default is TRUE
	 */
	public Boolean isMemberConnectionCancelOnDisconnect(String senderCompId, String targetCompId) {

		final Boolean defaultReturn = Boolean.TRUE;

		Iterator<AlignmentMemberConnectionDetails> iter = connections.iterator();

		while(iter.hasNext()) {
			AlignmentMemberConnectionDetails element = iter.next();
			if(element.getSenderCompId().compareToIgnoreCase(senderCompId)==0) {
				if(element.getTargetCompId().compareToIgnoreCase(targetCompId)==0) {
					return element.getCancelOnDisconnect();
				}
			}
		}

		return defaultReturn;
	}

	/**
	 * 
	 * @return
	 */
	public List<AlignmentMemberConnectionDetails> getConnections() {
		return connections;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean getSelfTradeProtection() {
		return selfTradeProtection;
	}
}