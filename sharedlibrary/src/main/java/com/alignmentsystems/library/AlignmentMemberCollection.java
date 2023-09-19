package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentMemberCollection
 *	Description		:
 *****************************************************************************/

import java.util.HashMap;
import java.util.List;

public class AlignmentMemberCollection {

	private HashMap<Short, AlignmentMember>  members = new HashMap<Short, AlignmentMember>();
	private HashMap<String , Short>  memberLookuponMemberId = new HashMap<String , Short>();

	
	public AlignmentMemberCollection() {
		final Boolean memberACancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberASelfTradeProtection  = Boolean.TRUE;
		final String memberACompId = "MEMBER_A";
		
		List<AlignmentMemberConnectionDetails>  connectionDetailsMemberA = List.of(new AlignmentMemberConnectionDetails(memberACompId, "EXCHANGE", "FIX.4.4", memberACancelOnDisconnect));
		AlignmentMember memberA = new AlignmentMember(connectionDetailsMemberA, memberASelfTradeProtection);
		Short memberAShortCode = Short.MAX_VALUE;
		this.members.put(memberAShortCode , memberA);
		this.memberLookuponMemberId.put(memberACompId, memberAShortCode);

		
		
		final Boolean memberBCancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberBSelfTradeProtection  = Boolean.TRUE;
		final String memberBCompId = "MEMBER_B";
		
		List<AlignmentMemberConnectionDetails>  connectionDetailsMemberB = List.of(new AlignmentMemberConnectionDetails("MEMBER_B", "EXCHANGE", "FIX.4.4", memberACancelOnDisconnect));
		AlignmentMember memberB = new AlignmentMember(connectionDetailsMemberA, memberASelfTradeProtection);
		Short memberBShortCode = Short.MAX_VALUE - 1;
		this.members.put(memberBShortCode , memberB);
		this.memberLookuponMemberId.put(memberBCompId, memberBShortCode);
	}

	protected HashMap<Short, AlignmentMember> getMembers() {
		return members;
	}

	protected AlignmentMember getMember(Short memberId) {
		return members.get(memberId);
	}

	protected AlignmentMember getMember(String memberCompId) {
		Short memberId = memberLookuponMemberId.get(memberCompId);
		return members.get(memberId);
	}
}
