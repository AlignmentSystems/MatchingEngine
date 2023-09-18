package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentExecutionReport
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;

public class AlignmentExecutionReport implements InterfaceExecutionReport {
	public final static Short EXCHANGEMESSAGETYPE = DataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT;
	
	private UUID execID = null;
	private String buySenderId = null; 
	private String buyTargetId = null;
	private String sellSenderId = null;
	private String sellTargetId = null;
	private OffsetDateTime timestamp = null;
	private Long executionQuantity = null;
	private Long executionPrice = null;
	private Long leavesQuantity = null;
	private Long cumQuantity = null;
	private Long averagePrice = null;
	private UUID clOrdID = null;
	private UUID orderID = null;
	private Short ordStatus = null;
	private Short execType = null;
	private Short sideCode = null;
	
	
	@Override
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
			) {
		this.execID = execID;
		this.clOrdID = clOrdID;
		this.orderID = orderID;
		this.buySenderId = buySenderId; 
		this.buyTargetId = buyTargetId;
		this.sellSenderId = sellSenderId;
		this.sellTargetId = sellTargetId;
		this.timestamp = timestamp;
		this.executionQuantity = executionQuantity;
		this.executionPrice = executionPrice;
		this.leavesQuantity = leavesQuantity;
		this.cumQuantity = cumQuantity;
		this.averagePrice = averagePrice;
		this.ordStatus = ordStatus;
		this.execType = execType;
		this.sideCode = sideCode;
	}

	@Override
	public UUID getExecID() {
		return this.execID;
	}

	@Override
	public String getBuySenderId() {
		return this.buySenderId;
	}

	@Override
	public String getBuyTargetId() {
		return this.buyTargetId;
	}

	@Override
	public String getSellSenderId() {
		return this.sellSenderId;
	}

	@Override
	public String getSellTargetId() {
		return this.sellTargetId;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.timestamp;
	}

	@Override
	public Long getExecutionQuantity() {
		return this.executionQuantity;
	}

	@Override
	public Long getExecutionPrice() {
		return this.executionPrice;
	}

	@Override
	public Long getLeavesQuantity() {
		return this.leavesQuantity;
	}

	@Override
	public Long getCumQuantity() {
		return this.cumQuantity;
	}

	@Override
	public Long getAveragePrice() {
		return this.averagePrice;
	}

	@Override
	public UUID getClOrdID() {
		return this.clOrdID;
	}

	@Override
	public UUID getOrderID() {
		return this.orderID;
	}

	@Override
	public Short getOrdStatus() {
		return this.ordStatus;
	}

	@Override
	public Short getExecType() {
		return this.execType;
	}

	@Override
	public Short getSideCode() {
		return this.sideCode;
	}
}