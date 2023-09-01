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
import java.util.ArrayList;
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
			return OrderBookSide.SELL;	
		}else {
			return OrderBookSide.ERROR;
		}
	}
	
	
	/**
	 * 
	 * @return NewOrderSingle
	 */
	public static NewOrderSingle getOrder(OrderBookSide orderBookSide, Double priceForOrder) {
		final ClOrdID clOrdID = new ClOrdID(UUID.randomUUID().toString());
		Side side;
		final Symbol symbol = new Symbol("BADGER.W");
		final OrderQty ordQty = new OrderQty(100d); 
		final Price price = new Price(priceForOrder);
		final TransactTime transactTime = new TransactTime(LocalDateTime.now());  
		final OrdType ordType = new OrdType(OrdType.LIMIT);
		
		
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
		

		return nos;

	}

	/**
	 * 
	 * @param orderBook
	 * @param log
	 */
	public static void snapShotOrderBook(InterfaceOrderBook orderBook, LogEncapsulation log) {
				
		List<String> buy =  snapShotOrderBookBySide(orderBook, OrderBookSide.BUY); 
		List<String> sell = snapShotOrderBookBySide(orderBook, OrderBookSide.SELL);
		
		log.infoOrderBookStatus(buy , sell);
	}



	/**
	 * 
	 * @param orderBook
	 * @param targetSide
	
	 */
	public static List<String> snapShotOrderBookBySide(InterfaceOrderBook orderBook, OrderBookSide targetSide) {
		int bookCount = 0;

		List<String> snapShotOrderBook = new ArrayList<String>();
		
		List<InterfaceOrder> orders = orderBook.getOrdersBySide(targetSide);

		bookCount = orderBook.getOrderCountBySide(targetSide);
		if (bookCount == 0) {

			snapShotOrderBook.add(targetSide.sideValue + LibraryFunctions.wrapNameSquareBracketsAndSpaces(Integer.toString(bookCount)) + Constants.TAB + "No orders..." );
		}else {
			for (InterfaceOrder io : orders) {
				snapShotOrderBook.add(targetSide.sideValue + LibraryFunctions.wrapNameSquareBracketsAndSpaces(Integer.toString(bookCount)) + io.toString());	
			}
		}
		return snapShotOrderBook;
		
		
	}
}