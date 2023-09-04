package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	31st August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatchingEngine
 *	Description		:
 *****************************************************************************/

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;
import com.alignmentsystems.matching.enumerations.OperationEventType;
import com.alignmentsystems.matching.library.LibraryOrders;
import com.alignmentsystems.matching.udp.MulticastServer;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;

public interface InterfaceMatchingEngine {
	
	
	public boolean initialise(
			String[] args
			, LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced
			, PersistenceToFileClient debugger
			, MulticastServer mdOut);

	public void publishMarketDataToPublishQueue(InterfaceMatchTrade match);

	
	
	
	public default void sendExecutionReportAcknowledgementForReceivedOrder(InterfaceOrder nos , LogEncapsulation log) {
		final String methodName ="sendExecutionReportAcknowledgementForReceivedOrder";
		ExecutionReport er;
		
		try {
			er = LibraryOrders.getExecutionReportAcknowledgementForOrder(nos);
		} catch (FieldNotFound e) {
			return;
		}
		
		SessionID sessionID  = nos.getSessionId();
				
		try {
			Session.sendToTarget(er, sessionID);
		} catch (SessionNotFound e) {
			log.error(e.getMessage(), e);
		};			
	}
	

	public default void sendExecutionReportsForMatch(InterfaceMatchTrade match, LogEncapsulation log) {
		final String methodName ="matchHappened";

		log.infoMatchingEvent(OperationEventType.MATCHEVENT, match);

		NewOrderSingle buy = match.getBuyOrder().getNewOrderSingle();
		NewOrderSingle sell = match.getSellOrder().getNewOrderSingle();
		SessionID buySession  = match.getBuyOrder().getSessionId();
		SessionID sellSession  = match.getSellOrder().getSessionId();
		Double executionQuantity = match.getMatchQuantity();


		OrderID b_orderId = new OrderID(match.getBuyOrderId());
		ClOrdID b_ClOrdId = null;
		ExecID b_execID = new ExecID(UUID.randomUUID().toString());
		CumQty b_cumQty = new CumQty(match.getMatchQuantity());
		AvgPx b_avgPx = new AvgPx(match.getMatchPrice());
		Side b_side = new Side(Side.BUY);

		ExecType b_execType = null; 
		OrdStatus b_ordStatus = null; 
		Double b_orderQty = null;
		LeavesQty b_leavesQty =  null;

		try {
			b_orderQty = buy.getOrderQty().getValue();
			b_leavesQty = new LeavesQty(buy.getOrderQty().getValue() - b_cumQty.getValue());	
		} catch (FieldNotFound e) {
			log.error(e.getMessage() , e);
		}

		//int java.lang.Double.compareTo(Double anotherDouble)
		//the value 0 if anotherDouble is numerically equal to this Double; 
		//a value less than 0 if this Double is numerically less than anotherDouble; 
		//and a value greater than 0 if this Double is numerically greater than anotherDouble.
		//Therefore, if this is equal to zero then the execution quantity is equal to the order quantity

		if (executionQuantity.compareTo(b_orderQty)==0) {
			b_execType = new ExecType(ExecType.FILL); 
			b_ordStatus = new OrdStatus(OrdStatus.FILLED); 
		}

		ExecutionReport buyExecRpt = new ExecutionReport(
				b_orderId
				, b_execID
				, b_execType
				, b_ordStatus
				, b_side 
				, b_leavesQty
				, b_cumQty
				, b_avgPx)
				;

		//TODO - clean up the above
		//Repeat the same code with s_ instead of b_ 
		OrderID s_orderId = new OrderID(match.getSellOrderId());
		ClOrdID s_ClOrdId = null;
		ExecID s_execID = new ExecID(UUID.randomUUID().toString());
		CumQty s_cumQty = new CumQty(match.getMatchQuantity());
		AvgPx s_avgPx = new AvgPx(match.getMatchPrice());
		Side s_side = new Side(Side.SELL);

		ExecType s_execType = null; 
		OrdStatus s_ordStatus = null; 
		Double s_orderQty = null;
		LeavesQty s_leavesQty =  null;

		try {
			s_orderQty = sell.getOrderQty().getValue();
			s_leavesQty = new LeavesQty(sell.getOrderQty().getValue() - s_cumQty.getValue());	
		} catch (FieldNotFound e) {
			log.error(e.getMessage() , e);
		}

		//int java.lang.Double.compareTo(Double anotherDouble)
		//the value 0 if anotherDouble is numerically equal to this Double; 
		//a value less than 0 if this Double is numerically less than anotherDouble; 
		//and a value greater than 0 if this Double is numerically greater than anotherDouble.
		//Therefore, if this is equal to zero then the execution quantity is equal to the order quantity

		if (executionQuantity.compareTo(s_orderQty)==0) {
			s_execType = new ExecType(ExecType.FILL); 
			s_ordStatus = new OrdStatus(OrdStatus.FILLED); 
		}

		ExecutionReport sellExecRpt = new ExecutionReport(
				s_orderId
				, s_execID
				, s_execType
				, s_ordStatus
				, s_side 
				, s_leavesQty
				, s_cumQty
				, s_avgPx)
				;



		try {
			Session.sendToTarget(sellExecRpt, sellSession);
			Session.sendToTarget(buyExecRpt, buySession);
		} catch (SessionNotFound e) {
			log.error(e.getMessage(), e);
		};		
	}
}
