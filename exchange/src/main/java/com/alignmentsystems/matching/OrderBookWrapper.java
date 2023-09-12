package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBooks
 *	Description		:
 *****************************************************************************/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.library.enumerations.OrderDistributionModel;
import com.alignmentsystems.library.exceptions.OrderBookNotFound;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookWrapper;
import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class OrderBookWrapper implements InterfaceOrderBookWrapper , InterfaceMatchEvent, InterfaceAddedOrderToOrderBook {
	private final static String CLASSNAME = OrderBookWrapper.class.getSimpleName();

	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced = null;
	private final Set<Thread> orderBookThreads = new HashSet<Thread>();
	private PersistenceToFileClient debugger = null;
	private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	private List<InterfaceAddedOrderToOrderBook> listenersAddedOrderToOrderBook = new ArrayList<InterfaceAddedOrderToOrderBook>();
	private OrderDistributionModel orderDistributionModel = null;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderBooks [orderBooks=");
		for (String key : orderBooks.keySet()) {
			builder.append(key.toString());
		}
		builder.append("]");
		return builder.toString();
	}


	@Override
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound {

		final String errString = new StringBuilder().append("Cannot find order book for symbol=").append(symbol).toString();
		InterfaceOrderBook returnValue = orderBooks.get(symbol); 
		if (returnValue!=null) {
			debugger.info(
					new StringBuilder()
					.append(CLASSNAME)
					.append(" Existing OrderBook returned=")
					.append(symbol)
					.toString());
			return returnValue;
		}else {
			InterfaceOrderBook orderBook = new OrderBook();

			Runnable runnableOrderBook = (Runnable) orderBook;

			Thread newThread = new Thread(runnableOrderBook);
			orderBook.initialise(symbol, log, debugger, this, this);
			
			orderBooks.put(symbol, orderBook);

			returnValue = orderBooks.get(symbol); 

			orderBookThreads.add(newThread); 			

			newThread.start();	
			debugger.info(
					new StringBuilder()
					.append(CLASSNAME)
					.append(" New OrderBook Thread created=")
					.append(newThread.getName())
					.toString());
			
			LibraryFunctions.threadStatusCheck(newThread, log);
		}
		if (returnValue!=null) {
			return returnValue;	
		}else {
			throw new OrderBookNotFound(errString);
		}
	}

	@Override
	public Set<Thread> getOrderBookThreads() {
		return this.orderBookThreads;
	}

	@Override
	public boolean initialise(
			LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced
			, PersistenceToFileClient debugger
			, InterfaceMatchEvent toAddMatch
			, InterfaceAddedOrderToOrderBook toAddOrder
			, OrderDistributionModel orderDistributionModel
			) {
		this.log = log;
		this.outboundSequenced = outboundSequenced;
		this.debugger = debugger;
		this.addMatchEventListener(toAddMatch);
		this.addAddedOrderToOrderBookListener(toAddOrder);
		this.orderDistributionModel = orderDistributionModel;
		return true;
	}

	@Override
	public void matchHappened(InterfaceMatch match) {
		for (InterfaceMatchEvent hl : listenersMatchEvent)
			hl.matchHappened(match);			
	}


	@Override
	public void addMatchEventListener(InterfaceMatchEvent toAdd) {
		this.listenersMatchEvent.add(toAdd);
	}


	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		for (InterfaceAddedOrderToOrderBook hl : listenersAddedOrderToOrderBook)
			hl.addedOrderToOrderBook(nos);	
	}

	@Override
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd) {
		this.listenersAddedOrderToOrderBook.add(toAdd);		
	}
}