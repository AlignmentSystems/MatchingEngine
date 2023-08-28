package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	LibraryFunctions
 * 
 *****************************************************************************/

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.enumerations.OperationEventType;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.MatchEvent;
import com.alignmentsystems.fix44.NewOrderSingle;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;


public class MatchingEngine implements Runnable , MatchEvent {
	private String className = this.getClass().getCanonicalName();

	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	
	private OrderBook orderBook = new OrderBook();
	
	private final AtomicBoolean running = new AtomicBoolean(false);
	
	public MatchingEngine(String[] args, LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced) {
		this.log = log;
		this.inboundSequenced = inboundSequenced;
		orderBook.addMatchEventListener(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		log.info("Started....");
		running.set(true);
		
		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.poll();
			if (inSeq!=null) {
				if (inSeq.getOrderSide().getValue()==Side.BUY) {
					orderBook.addOrder(inSeq);
					
				}else if(inSeq.getOrderSide().getValue()==Side.SELL) {
					orderBook.addOrder(inSeq);
				}else {
					//This is an error and should not happen...
				}
				 //ma.runMatch(buy, sell);
				
			}else {
				//Do nothing...
			}
		}			
	}

	@Override
	public void matchHappened(Match match) {
		final String methodName ="matchHappened";
		
		log.infoMatchingEvent(OperationEventType.MatchEvent, match);
		
		
		NewOrderSingle buy = match.getBuyOrder().getNewOrderSingle();
		NewOrderSingle sell = match.getSellOrder().getNewOrderSingle();
		SessionID buySession  = match.getBuyOrder().getSessionId();
		SessionID sellSession  = match.getSellOrder().getSessionId();
		Double executionQuantity = match.getMatchQuantity();
		
		
		OrderID orderId = null;
		
		ExecID execID = new ExecID(UUID.randomUUID().toString());

		ExecType execTypeBuy; 
		OrdStatus ordStatusBuy; 
		Double orderQtyBuy = null; 
		
		try {
			orderQtyBuy = buy.getOrderQty().getValue();
		} catch (FieldNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if (executionQuantity.compareTo(orderQtyBuy)==0) {
			//int java.lang.Double.compareTo(Double anotherDouble)
			//the value 0 if anotherDouble is numerically equal to this Double; 
			//a value less than 0 if this Double is numerically less than anotherDouble; 
			//and a value greater than 0 if this Double is numerically greater than anotherDouble.
			//Therefore, if this is equal to zero then the execution quantity is equal to the order quantity
			execTypeBuy = new ExecType(ExecType.FILL); 
			ordStatusBuy = new OrdStatus(OrdStatus.FILLED); 
			
		}
		
		try {
		Side side = new Side(buy.getSide().getValue()); 
		CumQty cumQty = new CumQty(match.getMatchQuantity());

		LeavesQty leavesQty = new LeavesQty(buy.getOrderQty().getValue() - cumQty.getValue()); 
		AvgPx avgPx = new AvgPx(match.getMatchPrice());
		//String uuidBuy = UUID.randomUUID().toString()
		//public ExecutionReport(com.alignmentsystems.fix44.field.OrderID orderID, com.alignmentsystems.fix44.field.ExecID execID, com.alignmentsystems.fix44.field.ExecType execType, com.alignmentsystems.fix44.field.OrdStatus ordStatus, com.alignmentsystems.fix44.field.Side side, com.alignmentsystems.fix44.field.LeavesQty leavesQty, com.alignmentsystems.fix44.field.CumQty cumQty, com.alignmentsystems.fix44.field.AvgPx avgPx) {
	
		
		//orderId = buy.getField(orderId.getField());		
		//execType = null; 
		
	} catch (FieldNotFound e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		ExecutionReport buyExecRpt = new ExecutionReport();
		ExecutionReport sellExecRpt = new ExecutionReport();
		
		
		try {
			Session.sendToTarget(sellExecRpt, sellSession);
			Session.sendToTarget(buyExecRpt, buySession);
		} catch (SessionNotFound e) {
			log.error(e.getMessage(), e);
		};
		
	}

}
