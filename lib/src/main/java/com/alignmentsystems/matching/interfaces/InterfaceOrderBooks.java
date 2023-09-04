package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOrderBooks
 *	Description		:
 *****************************************************************************/

import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;
import com.alignmentsystems.matching.exceptions.OrderBookNotFound;

public interface InterfaceOrderBooks {
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound;	
	public Set<Thread> getOrderBookThreads();
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced, PersistenceToFileClient debugger, InterfaceMatchEvent toAdd);
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);
}
