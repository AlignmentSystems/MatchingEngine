package com.alignmentsystems.matching.interfaces;
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

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.OrderQty;
import com.alignmentsystems.fix44.field.Price;
import com.alignmentsystems.matching.enumerations.MessageDirection;
import com.alignmentsystems.matching.enumerations.OrderBookSide;

import quickfix.FieldNotFound;
import quickfix.SessionID;

public interface InterfaceOrder extends Comparable<InterfaceOrder>{
	public OffsetDateTime getTimestamp();	
	public NewOrderSingle getNewOrderSingle();
	public void setNewOrderSingle(NewOrderSingle nos, SessionID sessionId, MessageDirection messageDirection, String orderId, OrderBookSide orderBookSide) throws FieldNotFound;
	public OrderBookSide getOrderBookSide();
	public OrderQty getOrderQty();
	public Price getLimitPrice();
	public SessionID getSessionId();
	public String getSymbol();
	public String getSender();
	public String getTarget();
	public String getClOrdID();
	public void execute(ExecutionReport execution);
	public List<ExecutionReport> getExecutionReports();
	public void setOrderId(String OrderId);
	public String getOrderId();
	public String getOrderUniquenessTuple();
}
