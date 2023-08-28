package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	EventStatusCategory
 * 
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.List;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.OrderQty;
import com.alignmentsystems.fix44.field.Price;
import com.alignmentsystems.fix44.field.Side;

import quickfix.FieldNotFound;
import quickfix.SessionID;

public interface InterfaceOrder extends Comparable<InterfaceOrder>{
	public OffsetDateTime getTimestamp();	
	public NewOrderSingle getNewOrderSingle();
	public void setNewOrderSingle(NewOrderSingle nos, SessionID sessionId) throws FieldNotFound;
	public Side getOrderSide();
	public OrderQty getOrderQty();
	public Price getLimitPrice();
	public SessionID getSessionId();
	public ClOrdID getClOrdID() throws FieldNotFound;
	public void execute(ExecutionReport execution);
	public List<ExecutionReport> getExecutionReports();
}
