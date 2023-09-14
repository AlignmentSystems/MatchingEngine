package com.alignmentsystems.matching;

public class FIXSessionContainer {
	private String versionFIX = null;
	private String senderCompID = null; 
	private String targetCompID = null;


	
	
	
	
	//	FIX.4.4:MEMBER_A->EXCHANGE
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder()
		.append(versionFIX)
		.append(":")
		.append(senderCompID)
		.append("->")
		.append(targetCompID)
		;
		
		return builder.toString();
	}


	protected FIXSessionContainer(String versionFIX, String senderCompID, String targetCompID) {
		super();
		this.versionFIX = versionFIX;
		this.senderCompID = senderCompID;
		this.targetCompID = targetCompID;
	}

	
	protected String getVersionFIX() {
		return versionFIX;
	}


	protected String getSenderCompID() {
		return senderCompID;
	}


	protected String getTargetCompID() {
		return targetCompID;
	}


	
	
	public FIXSessionContainer() {
		// TODO Auto-generated constructor stub
			}

}
