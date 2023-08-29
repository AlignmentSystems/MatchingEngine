package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceorderBook
 *	Description		:
 *****************************************************************************/

import java.util.List;

import com.alignmentsystems.matching.enumerations.OrderBookSide;

public interface InterfaceOrderBook {
	public boolean addOrder(InterfaceOrder nos);
	public void runMatch(); 
	public boolean cancelOrder(InterfaceOrder nos);
	public boolean cancelOrder(String orderId);
	
	public List<InterfaceOrder> getOrdersBySide(OrderBookSide orderBookSide );
	public int getOrderCountBySide(OrderBookSide orderBookSide );
	
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);
	public void upsertTopOfBook(InterfaceOrder nos);
	public void updateLevelsOfDepth();
	public String getThisOrderBookSymbol();
}
