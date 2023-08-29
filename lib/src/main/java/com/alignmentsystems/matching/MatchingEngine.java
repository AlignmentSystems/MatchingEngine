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

import java.util.List;
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
import com.alignmentsystems.matching.interfaces.InterfaceInitialise;
import com.alignmentsystems.matching.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;


public class MatchingEngine implements Runnable , InterfaceMatchEvent, InterfaceInitialise {
	private final static String className = MatchingEngine.class.getCanonicalName();

	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 	
	private OrderBooks orderBooks = null; 
	private int nanoSleep = 200;

	private final AtomicBoolean running = new AtomicBoolean(false);

	public MatchingEngine(String[] args, LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced) {
		this.log = log;
		this.inboundSequenced = inboundSequenced;		
	}

	private void snapshotOrderBook(InterfaceOrderBook orderBook ) {

		String stringCount = null;

		List<InterfaceOrder> buys = orderBook.getBuyOrders();

		if (orderBook.getBuyOrderCount() == 0) {
			stringCount = Integer.toString(orderBook.getBuyOrderCount());
			log.debug( stringCount + Constants.TAB + "No orders");
		}else {
			for (InterfaceOrder io : buys) {

				log.debug( stringCount + Constants.TAB + io.toString());	
			}
		}

		List<InterfaceOrder> sells = orderBook.getSellOrders();

		if (orderBook.getSellOrderCount() == 0) {
			stringCount = Integer.toString(orderBook.getSellOrderCount());
			log.debug( stringCount + Constants.TAB + "No orders");
		}else {

			for (InterfaceOrder io : sells) {
				log.debug( stringCount + Constants.TAB +  io.toString());	
			}
		}

	}


	@Override
	public void run() {
		log.info("Started....");
		running.set(true);

		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.poll();

			if (inSeq!=null) {
				//Which OrderBook???
				String symbol = inSeq.getSymbol();

				InterfaceOrderBook orderBook = orderBooks.getOrderBookForSymbol(symbol);
				if(orderBook.addOrder(inSeq)) {
					orderBook.runMatch();
				}
								
				snapshotOrderBook(orderBook);

			}else {
				try {
					Thread.currentThread();
					Thread.sleep(0L,nanoSleep);
				}catch(InterruptedException e){
					running.set(false);
					Thread.currentThread().interrupt();
					System.err.println(e.getMessage());
					StringBuilder sb7 = new StringBuilder()
							.append(className)
							.append(Constants.SPACE)
							.append(e.getMessage())
							;
					System.err.println(sb7.toString());			
				}
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

	@Override
	public boolean Initialise() {
		orderBooks = new OrderBooks(this.log); 
		return true;
	}
}