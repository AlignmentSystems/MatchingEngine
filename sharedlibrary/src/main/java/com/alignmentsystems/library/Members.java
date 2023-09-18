package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Members
 *	Description		:
 *****************************************************************************/

import java.util.HashMap;
import java.util.List;

public class Members {

	private HashMap<Short, Member>  members = new HashMap<Short, Member>();
	private HashMap<String , Short>  memberLookuponMemberId = new HashMap<String , Short>();

	
	public Members() {
		final Boolean memberACancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberASelfTradeProtection  = Boolean.TRUE;
		final String memberACompId = "MEMBER_A";
		
		List<ConnectionDetails>  connectionDetailsMemberA = List.of(new ConnectionDetails(memberACompId, "EXCHANGE", "FIX.4.4", memberACancelOnDisconnect));
		Member memberA = new Member(connectionDetailsMemberA, memberASelfTradeProtection);
		Short memberAShortCode = Short.MAX_VALUE;
		this.members.put(memberAShortCode , memberA);
		this.memberLookuponMemberId.put(memberACompId, memberAShortCode);

		
		
		final Boolean memberBCancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberBSelfTradeProtection  = Boolean.TRUE;
		final String memberBCompId = "MEMBER_B";
		
		List<ConnectionDetails>  connectionDetailsMemberB = List.of(new ConnectionDetails("MEMBER_B", "EXCHANGE", "FIX.4.4", memberACancelOnDisconnect));
		Member memberB = new Member(connectionDetailsMemberA, memberASelfTradeProtection);
		Short memberBShortCode = Short.MAX_VALUE - 1;
		this.members.put(memberBShortCode , memberB);
		this.memberLookuponMemberId.put(memberBCompId, memberBShortCode);
	}

	protected HashMap<Short, Member> getMembers() {
		return members;
	}

	protected Member getMember(Short memberId) {
		return members.get(memberId);
	}

	protected Member getMember(String memberCompId) {
		Short memberId = memberLookuponMemberId.get(memberCompId);
		return members.get(memberId);
	}
}
