package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentMemberConnectionDetails
 *	Description		:
 *****************************************************************************/
public class AlignmentMemberConnectionDetails {

	private String senderCompId = null;
	private String targetCompId = null;
	private String fixVersion = null;
	private Boolean cancelOnDisconnect = Boolean.TRUE;

	/**
	 * @param senderCompId
	 * @param targetCompId
	 * @param fixVersion
	 * @param cancelOnDisconnect
	 */
	protected AlignmentMemberConnectionDetails(String senderCompId, String targetCompId, String fixVersion,
			Boolean cancelOnDisconnect) {
		super();
		this.senderCompId = senderCompId;
		this.targetCompId = targetCompId;
		this.fixVersion = fixVersion;
		this.cancelOnDisconnect = cancelOnDisconnect;
	}

	protected String getSenderCompId() {
		return senderCompId;
	}


	protected String getTargetCompId() {
		return targetCompId;
	}


	protected String getFixVersion() {
		return fixVersion;
	}


	protected Boolean getCancelOnDisconnect() {
		return cancelOnDisconnect;
	}


}
