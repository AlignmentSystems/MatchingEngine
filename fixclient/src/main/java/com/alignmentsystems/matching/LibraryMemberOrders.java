package com.alignmentsystems.matching;
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
import com.alignmentsystems.fix44.field.TimeInForce;
import com.alignmentsystems.fix44.field.TransactTime;
import com.alignmentsystems.library.enumerations.OrderBookSide;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class LibraryMemberOrders {

	/**
	 * 
	 * @return NewOrderSingle
	 */
	public static NewOrderSingle getOrder(OrderBookSide orderBookSide, Double priceForOrder, String symbolString) {
		final ClOrdID clOrdID = new ClOrdID(UUID.randomUUID().toString());
		Side side;
		final Symbol symbol = new Symbol(symbolString);
		final OrderQty ordQty = new OrderQty(100d); 
		final Price price = new Price(priceForOrder);
		final TransactTime transactTime = new TransactTime(LocalDateTime.now());  
		final OrdType ordType = new OrdType(OrdType.LIMIT);
		String tif = "0";
		final TimeInForce timeInForce = new TimeInForce(tif.charAt(0));


		if (orderBookSide==OrderBookSide.BUY) {
			side = new Side(Side.BUY); 
		}else {
			side = new Side(Side.SELL);
		}

		NewOrderSingle nos = new NewOrderSingle(
				clOrdID, 
				side, 
				transactTime, 
				ordType);

		nos.set(symbol);
		nos.set(ordQty);
		nos.set(price);
		nos.set(timeInForce);


		return nos;

	}



}