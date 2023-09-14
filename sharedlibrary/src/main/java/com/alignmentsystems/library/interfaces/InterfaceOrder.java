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

import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.MessageDirection;
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

	public void reCreateOrder(
			String symbol
			, OrderBookSide orderBookSide
			, Long orderQty 
			, Long limitPrice 
			, OffsetDateTime ts
			, String sender 
			, String target
			, UUID orderId 
			, UUID clOrdId);
}