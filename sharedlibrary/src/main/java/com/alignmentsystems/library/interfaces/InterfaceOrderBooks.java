package com.alignmentsystems.library.interfaces;
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

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.enumerations.OrderDistributionModel;
import com.alignmentsystems.library.exceptions.OrderBookNotFound;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOrderBooks {
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound;	
	public Set<Thread> getOrderBookThreads();
	public boolean initialise(
			LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> outboundSequenced
			, PersistenceToFileClient debugger
			, InterfaceMatchEvent toAddMatch
			, InterfaceAddedOrderToOrderBook toAddOrder
			, OrderDistributionModel orderDistributionModel
			);
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);
}
