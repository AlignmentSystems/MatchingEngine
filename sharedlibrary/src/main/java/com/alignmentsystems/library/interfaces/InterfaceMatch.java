package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatch
 *	Description		:
 *****************************************************************************/
import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.library.AlignmentExecutionReport;
import com.alignmentsystems.library.enumerations.OrderBookSide;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceMatch {
	public OffsetDateTime getTimestamp();
	public Long getMatchQuantity();
	public Long getMatchPrice();
	public OrderBookSide getAggressorSide();
	public UUID getBuyClOrdId();
	public UUID getSellClOrdId();
	public UUID getBuyOrderId();
	public UUID getSellOrderId();
	public UUID getMatchId();
	public Long getBuyCumQty();
	public Long getSellCumQty();
	public Long getBuyOrderQty();
	public Long getSellOrderQty();
	public Long getBuyAvgPx();
	public Long getSellAvgPx();
	public String getBuySenderId();
	public String getBuyTargetId();
	public String getSellSenderId();
	public String getSellTargetId();
	public void setBuyAvgPx(Long avgPx);
	public Short getBuyOrdStatus();
	public Short getBuyExecType();
	public Short getSellOrdStatus();
	public Short getSellExecType();

	public void getSellAvgPx(Long avgPx);
	public void setMatchId(UUID matchID);
	public Boolean getIsEligibleForMarketData();
	public AlignmentExecutionReport getBuyReport();
	public AlignmentExecutionReport getSellReport();
	
}