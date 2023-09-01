package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MatchingEngine
 *	Description		:
 *****************************************************************************/

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.OperationEventType;
import com.alignmentsystems.matching.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceMatchingEngine;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;

/**
 * 
 */
public class MatchingEngine implements Runnable , InterfaceMatchEvent, InterfaceMatchingEngine {
	private final static String CLASSNAME = MatchingEngine.class.getSimpleName();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = null;
	private OrderBooks orderBooks = null; 
	private static final int milliSleep = 200;
	private AtomicBoolean running = new AtomicBoolean(false);
	private PersistenceToFileClient debugger = null;


	@Override
	public void run() {

		running.set(true);
		debugger.info(CLASSNAME + " Started....");

		String symbol = null;
		InterfaceOrderBook orderBook = null;

		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.poll();

			if (inSeq!= null) {
				//Which OrderBook???
				symbol = inSeq.getSymbol();

				orderBook = orderBooks.getOrderBookForSymbol(symbol);
				orderBook.getInboundSequenced().add(inSeq);

				debugger.info(CLASSNAME + " Added order for symbol=" + symbol);

				symbol = null;
				orderBook = null;

				//LibraryOrders.snapShotOrderBook(orderBook, this.log);
			}

			try {
				Thread.currentThread();
				Thread.sleep(milliSleep);
			}catch(InterruptedException e){
				running.set(false);
				Thread.currentThread().interrupt();
				System.err.println(e.getMessage());

				;
				System.err.println(new StringBuilder().append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage()
								).toString());			
			}

		}
	}



	@Override
	public boolean initialise(String[] args, LogEncapsulation log,
			ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced, PersistenceToFileClient debugger) {
		this.log = log;
		this.inboundSequenced = inboundSequenced;
		this.debugger = debugger;
		orderBooks = new OrderBooks();
		orderBooks.initialise(this.log, this.inboundSequenced, this.debugger);
		return true;
	}

	@Override
	public void matchHappened(InterfaceMatchTrade match) {
		final String methodName ="matchHappened";

		log.infoMatchingEvent(OperationEventType.MATCHEVENT, match);


		NewOrderSingle buy = match.getBuyOrder().getNewOrderSingle();
		NewOrderSingle sell = match.getSellOrder().getNewOrderSingle();
		SessionID buySession  = match.getBuyOrder().getSessionId();
		SessionID sellSession  = match.getSellOrder().getSessionId();
		Double executionQuantity = match.getMatchQuantity();


		OrderID orderId = null;

		ExecID execID = new ExecID(UUID.randomUUID().toString());

		ExecType b_execType; 
		OrdStatus b_ordStatus; 
		Double b_orderQty = null; 

		try {
			b_orderQty = buy.getOrderQty().getValue();
		} catch (FieldNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		if (executionQuantity.compareTo(b_orderQty)==0) {
			//int java.lang.Double.compareTo(Double anotherDouble)
			//the value 0 if anotherDouble is numerically equal to this Double; 
			//a value less than 0 if this Double is numerically less than anotherDouble; 
			//and a value greater than 0 if this Double is numerically greater than anotherDouble.
			//Therefore, if this is equal to zero then the execution quantity is equal to the order quantity
			b_execType = new ExecType(ExecType.FILL); 
			b_ordStatus = new OrdStatus(OrdStatus.FILLED); 

		}


		CumQty b_cumQty = new CumQty(match.getMatchQuantity());
		AvgPx b_avgPx = new AvgPx(match.getMatchPrice());
		Side b_side = new Side(Side.BUY);

		try {

			LeavesQty leavesQty = new LeavesQty(buy.getOrderQty().getValue() - b_cumQty.getValue());	
			//String uuidBuy = UUID.randomUUID().toString()
			//public ExecutionReport(com.alignmentsystems.fix44.field.OrderID orderID, com.alignmentsystems.fix44.field.ExecID execID, com.alignmentsystems.fix44.field.ExecType execType, com.alignmentsystems.fix44.field.OrdStatus ordStatus, com.alignmentsystems.fix44.field.Side side, com.alignmentsystems.fix44.field.LeavesQty leavesQty, com.alignmentsystems.fix44.field.CumQty cumQty, com.alignmentsystems.fix44.field.AvgPx avgPx) {


			//orderId = buy.getField(orderId.getField());		
			//execType = null; 

		} catch (FieldNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//(com.alignmentsystems.fix44.field.OrderID orderID, com.alignmentsystems.fix44.field.ExecID execID, com.alignmentsystems.fix44.field.ExecType execType, com.alignmentsystems.fix44.field.OrdStatus ordStatus, com.alignmentsystems.fix44.field.Side side, com.alignmentsystems.fix44.field.LeavesQty leavesQty, com.alignmentsystems.fix44.field.CumQty cumQty, com.alignmentsystems.fix44.field.AvgPx avgPx) {



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