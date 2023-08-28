package com.alignmentsystems.matching.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LibraryOrders
 *	Description		:
 *****************************************************************************/

import java.time.LocalDateTime;
import java.util.UUID;

import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.OrdType;
import com.alignmentsystems.fix44.field.OrderQty;
import com.alignmentsystems.fix44.field.Price;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.fix44.field.Symbol;
import com.alignmentsystems.fix44.field.TransactTime;

public class LibraryOrders {
	public static NewOrderSingle getOrder() {
		ClOrdID clOrdID = new ClOrdID(UUID.randomUUID().toString()); 
		Side side = new Side(Side.BUY); 
		TransactTime transactTime = new TransactTime(LocalDateTime.now());  
		OrdType ordType = new OrdType(OrdType.LIMIT);

		Symbol symbol = new Symbol("BADGER.W");
		OrderQty ordQty = new OrderQty(100d); 
		Price price = new Price(42d);

		NewOrderSingle nos = new NewOrderSingle(
				clOrdID, 
				side, 
				transactTime, 
				ordType);

		nos.set(symbol);
		nos.set(ordQty);
		nos.set(price);

		return nos;

	}


}
