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

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
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
	public AlignmentMemberConnectionDetails(String senderCompId, String targetCompId, String fixVersion,
			Boolean cancelOnDisconnect) {
		super();
		this.senderCompId = senderCompId;
		this.targetCompId = targetCompId;
		this.fixVersion = fixVersion;
		this.cancelOnDisconnect = cancelOnDisconnect;
	}

	/**
	 * 
	 * @return
	 */
	public String getSenderCompId() {
		return senderCompId;
	}

	/**
	 * 
	 * @return
	 */
	public String getTargetCompId() {
		return targetCompId;
	}

	/**
	 * 
	 * @return
	 */
	public String getFixVersion() {
		return fixVersion;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean getCancelOnDisconnect() {
		return cancelOnDisconnect;
	}
}