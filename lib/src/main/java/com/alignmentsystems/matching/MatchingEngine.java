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

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.matching.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceMatchingEngine;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.udp.MulticastServer;

public class MatchingEngine implements Runnable , InterfaceMatchEvent, InterfaceMatchingEngine , InterfaceAddedOrderToOrderBook{
	private final static String CLASSNAME = MatchingEngine.class.getSimpleName();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = null;
	private OrderBooks orderBooks = null; 
	private static final int milliSleep = 200;
	private AtomicBoolean running = new AtomicBoolean(false);
	private PersistenceToFileClient debugger = null;
	private MulticastServer mdOut = null;
	private ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue = null;

	@Override
	public void run() {

		running.set(true);
		debugger.info(CLASSNAME + " Started....");

		String symbol = null;
		InterfaceOrderBook orderBook = null;

		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.poll();

			if (inSeq!= null) { //Which OrderBook???
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

				System.err.println(
						new StringBuilder().append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage())
						.toString()
						);			
			}
		}
	}



	@Override
	public boolean initialise(String[] args, LogEncapsulation log,
			ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced, PersistenceToFileClient debugger,  MulticastServer mdOut) {
		this.log = log;
		this.inboundSequenced = inboundSequenced;
		this.debugger = debugger;
		orderBooks = new OrderBooks();
		orderBooks.initialise(this.log, this.inboundSequenced, this.debugger, this, this);
		this.mdOut = mdOut;//TODO - think about if this reference is required...
		this.marketDataToPublishQueue = mdOut.getMarketDataQueue();
		return true;
	}

	@Override
	public void matchHappened(InterfaceMatchTrade match) {
		sendExecutionReportsForMatch(match, log);
		publishMarketDataToPublishQueue(match);			
	}


	@Override
	public void publishMarketDataToPublishQueue(InterfaceMatchTrade match) {
		final String methodName ="publishMarketDataToPublishQueue";
		if (match.getIsEligibleForMarketData()) {
			marketDataToPublishQueue.add(match);	
		}
	}

	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		final String methodName ="addedOrderToOrderBook";
		this.sendExecutionReportAcknowledgementForReceivedOrder(nos, log);

	}
}