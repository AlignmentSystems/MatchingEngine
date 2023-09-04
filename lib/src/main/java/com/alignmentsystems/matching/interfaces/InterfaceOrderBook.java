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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;
import com.alignmentsystems.matching.enumerations.OrderBookSide;

public interface InterfaceOrderBook {
	public Boolean initialise(String symbol, LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced, Thread orderBookThread, PersistenceToFileClient debugger);
	public Boolean initialise(
			String symbol
			, LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced
			, Thread orderBookThread
			, PersistenceToFileClient debugger
			, InterfaceMatchEvent toAdd
			, InterfaceAddedOrderToOrderBook toAddOrder
			);
	public String getThisOrderBookSymbol();
	public ConcurrentLinkedQueue<InterfaceOrder> getInboundSequenced();
	public List<InterfaceOrder> getOrdersBySide(OrderBookSide orderBookSide );
	public List<String> getOrderBookVisualisation();
	public OffsetDateTime getOrderBookCreationTime();
	public OffsetDateTime getOrderBookLastUpdateTime();
	public Thread getThread();
	public int getOrderCountBySide(OrderBookSide orderBookSide );
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);
	public void upsertTopOfBook(InterfaceOrder nos);
	public void updateLevelsOfDepth();
	
}
