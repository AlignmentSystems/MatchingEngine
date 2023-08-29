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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.exceptions.OrderBookNotFound;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBooks;
import com.alignmentsystems.matching.library.LibraryFunctions;

public class OrderBooks implements InterfaceOrderBooks{
	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced = null;
	
	private final Set<Thread> orderBookThreads = new HashSet<Thread>();
	
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

	public OrderBooks(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced ) {
		this.log = log;
		this.outboundSequenced = outboundSequenced;
	}

	@Override
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound {

		final String errString = "Cannot find order book for symbol=" + symbol;
		InterfaceOrderBook returnValue = orderBooks.get(symbol); 
		if (returnValue!=null) {
			return returnValue;
		}else {
			InterfaceOrderBook orderBook = new OrderBook(symbol, this.log, this.outboundSequenced);
			
			Runnable runnableOrderBook = (Runnable) orderBook;
			
			Thread newThread = new Thread(runnableOrderBook);
			
			newThread.setName(symbol);
			
			orderBook.setThread(newThread);
			
			orderBooks.put(symbol, orderBook);
			
			returnValue = orderBooks.get(symbol); 
			
			orderBookThreads.add(newThread); 			
						
			newThread.start();	
			
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
}