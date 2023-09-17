package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	29th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceExecutionReport
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;

import com.alignmentsystems.fix44.ExecutionReport;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceExecutionReport {
	public void setExecutionReport(
			String execID
			, String buySenderId 
			, String buyTargetId 
			, String sellSenderId
			, String sellTargetId
			, OffsetDateTime timestamp
			, Long executionQuantity
			, Long executionPrice
			);
	
	public String getExecID();
	public String getBuySenderId(); 
	public String getBuyTargetId(); 
	public String getSellSenderId();
	public String getSellTargetId();
	public OffsetDateTime getTimestamp();
	public Long getExecutionQuantity();
	public Long getExecutionPrice();
}
