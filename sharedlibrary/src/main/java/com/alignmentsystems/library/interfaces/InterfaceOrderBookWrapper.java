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

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.exceptions.OrderBookNotFound;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOrderBookWrapper {
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound;	
	public boolean initialise(
			LogEncapsulation log			
			, PersistenceToFileClient debugger
			, InterfaceMatchEvent toAddMatch
			, InterfaceAddedOrderToOrderBook toAddOrder
			);
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);
}
