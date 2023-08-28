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
import java.util.Map;

import com.alignmentsystems.matching.exceptions.OrderBookNotFound;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBooks;

public class OrderBooks implements InterfaceOrderBooks{
	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();

	public OrderBooks() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public InterfaceOrderBook getOrderBookForSymbol(String symbol) throws OrderBookNotFound {

		final String errString = "Cannot find order book for symbol=" + symbol;
		InterfaceOrderBook returnValue = orderBooks.get(symbol); 
		if (returnValue!=null) {
			return returnValue;
		}else {
			orderBooks.put(symbol, new OrderBook(symbol));
			returnValue = orderBooks.get(symbol); 
			
		}
		if (returnValue!=null) {
			return returnValue;	
		}else {
			throw new OrderBookNotFound(errString);
		}
	}
}