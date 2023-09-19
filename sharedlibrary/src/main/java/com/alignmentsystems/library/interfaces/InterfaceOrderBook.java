package com.alignmentsystems.library.interfaces;
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

import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.enumerations.OrderBookSide;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOrderBook {
	public Boolean initialise(
			String symbol
			, AlignmentLogEncapsulation log
			, AlignmentPersistenceToFileClient debugger
			, InterfaceMatchEvent toAdd
			, InterfaceAddedOrderToOrderBook toAddOrder
			);
	public String getThisOrderBookSymbol();
	public List<InterfaceOrder> getOrdersBySide(OrderBookSide orderBookSide );
	public List<String> getOrderBookVisualisation();
	public OffsetDateTime getOrderBookCreationTime();
	public OffsetDateTime getOrderBookLastUpdateTime();
	public int getOrderCountBySide(OrderBookSide orderBookSide );
	public void upsertTopOfBook(InterfaceOrder nos);
	public void updateLevelsOfDepth();	
}