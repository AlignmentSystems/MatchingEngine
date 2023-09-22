package com.alignmentsystems.library;
import java.time.OffsetDateTime;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	22nd September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentKillDetail
 *	Description		:
 *****************************************************************************/
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.interfaces.InterfaceKillDetail;


public class AlignmentKillDetail implements InterfaceKillDetail{
	private String senderCompId = null;
	private String targetCompId = null;
	private String killString  = null;
	private OffsetDateTime timestamp = null;
	/**
	 * @param senderCompId
	 * @param targetCompId
	 * @param killString
	 */
	public AlignmentKillDetail(String senderCompId, String targetCompId) {
		super();
		this.senderCompId = senderCompId;
		this.targetCompId = targetCompId;
		this.killString = this.targetCompId + Constants.FULLSTOP + this.senderCompId;
		this.timestamp = OffsetDateTime.now(Constants.HERE);
	}

	@Override
	public String getSenderCompId() {
		return senderCompId;
	}
	
	@Override
	public String getTargetCompId() {
		return targetCompId;
	}
	
	@Override
	public String getKillString() {
		return killString;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.timestamp;
	}
}