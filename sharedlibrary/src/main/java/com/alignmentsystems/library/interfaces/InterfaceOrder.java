package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOrder
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.enumerations.OrderBookSide;

import quickfix.FieldNotFound;
import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOrder{
	public OffsetDateTime getTimestamp();	
	public NewOrderSingle getNewOrderSingle();
	public void setNewOrderSingle(
			NewOrderSingle nos
			, SessionID sessionId
			, UUID orderId
			, OrderBookSide orderBookSide
			) throws FieldNotFound;
	public OrderBookSide getOrderBookSide();
	public Long getOrderQty();
	public Long getLimitPrice();
	public SessionID getSessionId();
	public String getSymbol();
	public String getSender();
	public String getTarget();
	public UUID getClOrdID();
	public void execute(ExecutionReport execution);
	public List<ExecutionReport> getExecutionReports();
	public void setOrderId(UUID OrderId);
	public UUID getOrderId();
	public String getOrderUniquenessTuple();
	public short getAlignmentType();
	public void setAlignmentType(short alignmentType);
	public char getTimeInForce();
	public void setTimeInForce(char timeInForce);
	public long getCumQty();
	public long getAvgPx();
	public Long getLeavesQty();
	public AlignmentKafkaSender getBytesForMemberAsSBEInSender();
	public AlignmentKafkaSender getBytesForMarketDataAsSBEInSender();
	public InterfaceOrder getAlignmentOrderFromBuffer(byte[] message, short msgType);
	public InterfaceOrder getAlignmentOrderFromBuffer(byte[] message);
	public InterfaceExecutionReport getCancelledExecutionReport();

	public void reCreateOrder(
			String symbol
			, Character timeInForce
			, OrderBookSide orderBookSide
			, Long orderQty 
			, Long limitPrice 
			, OffsetDateTime ts
			, String sender 
			, String target
			, UUID orderId 
			, UUID clOrdId);
}