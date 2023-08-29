package com.alignmentsystems.matching.interfaces;

import java.util.Set;

import com.alignmentsystems.matching.exceptions.OrderBookNotFound;

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

public interface InterfaceOrderBooks {
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound;	
	public Set<Thread> getOrderBookThreads();
}
