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
import java.util.List;
import java.util.UUID;

import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.OrdType;
import com.alignmentsystems.fix44.field.OrderQty;
import com.alignmentsystems.fix44.field.Price;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.fix44.field.Symbol;
import com.alignmentsystems.fix44.field.TransactTime;
import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.OrderBookSide;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;

public class LibraryOrders {

	
	/**
	 * 
	 * @param side Side
	 * @return OrderBookSide
	 */
	public static OrderBookSide getOrderBookSideFromFIXSide(Side side) {
		if (side.getObject()==Side.BUY) {
			return OrderBookSide.BUY;	
		}else if (side.getObject()==Side.SELL) {
			return OrderBookSide.BUY;	
		}else {
			return OrderBookSide.ERROR;
		}
	}
	
	
	/**
	 * 
	 * @return NewOrderSingle
	 */
	public static NewOrderSingle getOrder(OrderBookSide orderBookSide) {
		ClOrdID clOrdID = new ClOrdID(UUID.randomUUID().toString());
		Side side;
		Symbol symbol = new Symbol("BADGER.W");
		OrderQty ordQty = new OrderQty(100d); 
		Price price = new Price(42d);
		
		if (orderBookSide==OrderBookSide.BUY) {
			side = new Side(Side.BUY); 
		}else {
			side = new Side(Side.SELL);
		}
		
		TransactTime transactTime = new TransactTime(LocalDateTime.now());  
		OrdType ordType = new OrdType(OrdType.LIMIT);

		

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

	/**
	 * 
	 * @param orderBook
	 * @param log
	 */
	public static void snapShotOrderBook(InterfaceOrderBook orderBook, LogEncapsulation log) {
		snapShotOrderBookBySide(orderBook, OrderBookSide.BUY , log); 
		snapShotOrderBookBySide(orderBook, OrderBookSide.SELL , log);
	}



	/**
	 * 
	 * @param orderBook
	 * @param targetSide
	 * @param log
	 */
	public static void snapShotOrderBookBySide(InterfaceOrderBook orderBook, OrderBookSide targetSide, LogEncapsulation log) {
		String stringCount = null;

		List<InterfaceOrder> buys = orderBook.getOrdersBySide(OrderBookSide.BUY);

		stringCount = Integer.toString(orderBook.getOrderCountBySide(targetSide));
		if (orderBook.getOrderCountBySide(targetSide) == 0) {

			log.debug( stringCount + Constants.TAB + "No orders for " + targetSide.sideValue);
		}else {
			for (InterfaceOrder io : buys) {
				log.debug(targetSide.sideValue + LibraryFunctions.wrapNameSquareBracketsAndSpaces(stringCount) + io.toString());	
			}
		}
	}
}