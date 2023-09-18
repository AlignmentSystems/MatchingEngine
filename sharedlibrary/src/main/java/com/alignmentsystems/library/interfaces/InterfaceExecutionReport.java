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
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceExecutionReport {

	
	/**
	 * 
	 * @param execID
	 * @param clOrdID
	 * @param orderID
	 * @param buySenderId
	 * @param buyTargetId
	 * @param sellSenderId
	 * @param sellTargetId
	 * @param timestamp
	 * @param executionQuantity
	 * @param executionPrice
	 * @param leavesQuantity
	 * @param cumQuantity
	 * @param averagePrice
	 * @param ordStatus
	 * @param execType
	 * @param sideCode
	 */
	public void setExecutionReport(
			UUID execID
			, UUID clOrdID
			, UUID orderID
			, String buySenderId 
			, String buyTargetId 
			, String sellSenderId
			, String sellTargetId
			, OffsetDateTime timestamp
			, Long executionQuantity
			, Long executionPrice
			, Long leavesQuantity
			, Long cumQuantity
			, Long averagePrice
			, Short ordStatus
			, Short execType
			, Short sideCode
			);

	/**
	 * 
	 * @return
	 */
	public UUID getClOrdID();
	public UUID getOrderID();
	public UUID getExecID();
	public String getBuySenderId(); 
	public String getBuyTargetId(); 
	public String getSellSenderId();
	public String getSellTargetId();
	public OffsetDateTime getTimestamp();
	public Long getExecutionQuantity();
	public Long getExecutionPrice();
	public Long getLeavesQuantity();
	public Long getCumQuantity();
	public Long getAveragePrice();
	public Short getOrdStatus();
	public Short getExecType();
	public Short getSideCode();
}