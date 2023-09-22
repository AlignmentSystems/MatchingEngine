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


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentMemberCollection {
	private HashMap<Long, AlignmentMember>  members = new HashMap<Long, AlignmentMember>();
	private HashMap<String , Long>  memberLookuponMemberId = new HashMap<String , Long>();

	
	public AlignmentMemberCollection() {
		final Boolean memberACancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberASelfTradeProtection  = Boolean.TRUE;
		final String memberACompId = "MEMBER_A";
		final String targetCompId = "EXCHANGE";
		final String fixVersion = "FIX.4.4";
		
		List<AlignmentMemberConnectionDetails>  connectionDetailsMemberA = List.of(new AlignmentMemberConnectionDetails(memberACompId, targetCompId , fixVersion, memberACancelOnDisconnect));
		AlignmentMember memberA = new AlignmentMember(connectionDetailsMemberA, memberASelfTradeProtection);
		final Long memberALongCode = AlignmentDataMapper.getExchangeIdMappedFromSenderCompID(memberACompId);
		this.members.put(memberALongCode , memberA);
		this.memberLookuponMemberId.put(memberACompId, memberALongCode);

		
		
		final Boolean memberBCancelOnDisconnect  = Boolean.TRUE;
		final Boolean memberBSelfTradeProtection  = Boolean.TRUE;
		final String memberBCompId = "MEMBER_B";
		
		List<AlignmentMemberConnectionDetails>  connectionDetailsMemberB = List.of(new AlignmentMemberConnectionDetails(memberBCompId, targetCompId , fixVersion , memberBCancelOnDisconnect));
		AlignmentMember memberB = new AlignmentMember(connectionDetailsMemberB, memberBSelfTradeProtection);
		Long memberBLongCode = AlignmentDataMapper.getExchangeIdMappedFromSenderCompID(memberACompId);
		this.members.put(memberBLongCode , memberB);
		this.memberLookuponMemberId.put(memberBCompId, memberBLongCode);
	}

	/**
	 * 
	 * @return
	 */
	public HashMap<Long, AlignmentMember> getMembers() {
		return members;
	}

	/**
	 * 
	 * @param memberId
	 * @return
	 */
	public  AlignmentMember getMember(Long memberId) {
		return members.get(memberId);
	}

	/**
	 * 
	 * @param memberCompId
	 * @return
	 */
	public AlignmentMember getMember(String memberCompId) {
		Long memberId = memberLookuponMemberId.get(memberCompId);
		return members.get(memberId);
	}
}
