package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBook
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.annotations.NotYetImplemented;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.OrderBookSide;
import com.alignmentsystems.matching.enumerations.OrderBookState;
import com.alignmentsystems.matching.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.matching.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.library.LibraryFunctions;
import com.alignmentsystems.matching.library.LibraryOrders;

import quickfix.FieldNotFound;

public class OrderBook implements Runnable, InterfaceOrderBook , InterfaceMatchEvent, InterfaceAddedOrderToOrderBook {
	private final static String CLASSNAME = OrderBook.class.getCanonicalName();
	private Thread orderBookThread = null;

	private PriorityQueue<InterfaceOrder>  buy = new PriorityQueue<InterfaceOrder> (100, Collections.reverseOrder());
	private PriorityQueue<InterfaceOrder>  sell = new PriorityQueue<InterfaceOrder> (100);
	private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	private List<InterfaceAddedOrderToOrderBook> listenersAddedOrderToOrderBook = new ArrayList<InterfaceAddedOrderToOrderBook>();
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = null;
	private AtomicBoolean running = new AtomicBoolean(false);
	private String symbol = null;
	private int buyOrderCount = 0;
	private int sellOrderCount = 0;
	private LogEncapsulation log = null;
	private final int nanoSleep = 200;



	public OrderBook(String symbol, LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced ) {
		this.symbol = symbol;
		this.log = log;
		this.inboundSequenced = inboundSequenced;
	}

	/**
	 * 
	 * @param orderBookSide
	 * @return List of orders sorted from top of book down in price & time priority order.
	 */
	private List<InterfaceOrder> getTheseSortedOrders(OrderBookSide orderBookSide){
		List<InterfaceOrder> list = null; 

		if (orderBookSide==OrderBookSide.BUY) {
			list = new ArrayList<>( buy );	
		}else {
			list = new ArrayList<>( sell );
		}

		list.sort(null);
		return list;
	} 

	@Override
	public String getThisOrderBookSymbol() {
		return this.symbol;
	}


	private boolean addOrder(InterfaceOrder nos) {
		OrderBookSide orderBookSide = nos.getOrderBookSide(); 

		Boolean returnValue = Boolean.FALSE;

		if(orderBookSide==OrderBookSide.BUY) {
			returnValue = buy.add(nos);
			if (returnValue) {
				buyOrderCount++;
			}
		}else if(orderBookSide==OrderBookSide.SELL) {
			returnValue = sell.add(nos);
			if (returnValue) {
				sellOrderCount++;
			}
		}else {
			returnValue = Boolean.FALSE;
		}

		//TODO - this is not the right way to do this, the event should be queued rather than sent here.

		if(returnValue) {
			addedOrderToOrderBook(nos);
		}

		return returnValue;

	}

	@NotYetImplemented
	private boolean cancelOrder(InterfaceOrder nos) {
		// TODO Auto-generated method stub
		return false;
	}

	@NotYetImplemented
	private boolean cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}



	private void runMatch() {

		InterfaceOrder topOfBuyBookPeek = buy.peek();
		InterfaceOrder topOfSellBookPeek = sell.peek();

		OrderBookState  orderBookState = OrderBookState.EMPTY;

		if(topOfBuyBookPeek!=null) {
			orderBookState = LibraryFunctions.updateOrderBookState(orderBookState, OrderBookState.BUYSIDE);
		}

		if(topOfSellBookPeek!=null) {
			orderBookState = LibraryFunctions.updateOrderBookState(orderBookState, OrderBookState.SELLSIDE);
		}

		Double topOfBuyBookPrice = 0d;
		Double topOfSellBookPrice = 0d;

		if(orderBookState.contains(OrderBookState.TWOSIDED)){
			topOfBuyBookPrice = topOfBuyBookPeek.getLimitPrice().getValue();
			topOfSellBookPrice = topOfSellBookPeek.getLimitPrice().getValue();
			Double tradedQuantity = 0d;
			Double tradedPrice = 0d;
			//If buy top of book price is greater than or equal to the sell top of book then we have got a buyer
			//who has crossed the spread.  So we have a trade, yay!
			if (topOfBuyBookPrice>=topOfSellBookPrice) {


				//The minimum of sell order quantity and buy order quantity can trade.
				//Note - this is not correct, since you have to walk down the levels of depth
				//and execute each price until the order that crossed the spread is full or no longer able to trade as the next]
				//price level would not match
				InterfaceOrder topOfBuyBook = buy.poll();
				InterfaceOrder topOfSellBook = sell.poll();

				//Here is a question, who is the aggressor?
				//Why do we need to know this? So you can work out who gets to trade at their preferred price...
				OffsetDateTime topOfBuyBookTimestamp = topOfBuyBook.getTimestamp();
				OffsetDateTime topOfSellBookTimestamp = topOfSellBook.getTimestamp();
				Side aggressor = null;


				if (topOfBuyBookTimestamp.compareTo(topOfSellBookTimestamp)<0) {
					//Returns: the comparator value, negative if less, positive if greater
					//Therefore topOfBuyBookTimestamp is less than topOfSellBookTimestamp
					//So topOfBuyBookTimestamp came first and is therefore NOT the aggressor
					aggressor = new Side(Side.SELL);
				}else {
					aggressor = new Side(Side.BUY);
				}

				Double topOfBuyBookQty = topOfBuyBook.getOrderQty().getValue();
				Double topOfSellBookQty = topOfBuyBook.getOrderQty().getValue();

				tradedQuantity = Math.min(topOfBuyBookQty, topOfSellBookQty);



				switch(aggressor.getValue()) {
				case Side.SELL:
					tradedPrice  = Math.max(topOfBuyBookPrice, topOfSellBookPrice);
					break;
				case Side.BUY:
					tradedPrice  = Math.min(topOfBuyBookPrice, topOfSellBookPrice);
					break;
				}
				OffsetDateTime executionTimestamp = OffsetDateTime.now(Constants.HERE);

				String buyClOrdID = null;
				String sellClOrdID = null;
				try {
					buyClOrdID = topOfBuyBook.getClOrdID().getValue().toString();
					sellClOrdID = topOfSellBook.getClOrdID().getValue().toString();
				} catch (FieldNotFound e) {
					log.error(e.getMessage() , e);
				}

				String buyOrderID = topOfBuyBook.getOrderId();
				String sellOrderID = topOfSellBook.getOrderId();



				Match match = new Match(
						tradedQuantity
						, tradedPrice
						, topOfBuyBook
						, topOfSellBook
						, aggressor
						, executionTimestamp
						, buyClOrdID
						, sellClOrdID
						, buyOrderID
						, sellOrderID
						);

				this.matchHappened(match);




			}else if (orderBookState.contains(OrderBookState.BUYSIDE)) {
				//One sided market (buy orders only), so you cannot match here
				log.info(orderBookState.getStateString());
			}else if (orderBookState.contains(OrderBookState.SELLSIDE)) {
				//One sided market (sell orders only), so you cannot match here
				log.info(orderBookState.getStateString());
			}
		}else {
			//topOfBuyBookPrice < topOfSellBookPrice
			//therefore no trade possible...
		}
	}

	@NotYetImplemented
	@Override
	public void upsertTopOfBook(InterfaceOrder nos) {
		// TODO Auto-generated method stub

	}

	@NotYetImplemented
	@Override
	public void updateLevelsOfDepth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void matchHappened(Match match) {		
		for (InterfaceMatchEvent hl : listenersMatchEvent)
			hl.matchHappened(match);	
	}

	@Override
	public void addMatchEventListener(InterfaceMatchEvent toAdd) {
		this.listenersMatchEvent.add(toAdd);
	}

	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		for (InterfaceAddedOrderToOrderBook hl : listenersAddedOrderToOrderBook)
			hl.addedOrderToOrderBook(nos);	
	}

	@Override
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd) {
		listenersAddedOrderToOrderBook.add(toAdd);
	}

	@Override
	public List<InterfaceOrder> getOrdersBySide(OrderBookSide orderBookSide) {
		return getTheseSortedOrders(orderBookSide);
	}

	@Override
	public int getOrderCountBySide(OrderBookSide orderBookSide) {
		if (orderBookSide == OrderBookSide.BUY) {
			return this.buyOrderCount;	
		}else {
			return this.sellOrderCount;
		}
	}

	@Override
	public void run() {

		running.set(true);


		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.peek();
			if (inSeq!=null) {
				if(inSeq.getSymbol()==this.symbol) {
					inSeq = inboundSequenced.poll();

					if (inSeq.getOrderBookSide()==OrderBookSide.BUY) {
						this.buy.add(inSeq);
						this.buyOrderCount++;
					}else if (inSeq.getOrderBookSide()==OrderBookSide.SELL) {
						this.sell.add(inSeq);
						this.sellOrderCount++;
					}else {
						//TODO Error - how do we handle this?
					}
					LibraryOrders.snapShotOrderBook(this, log);
					runMatch();

				}//Else - this is not an instrument for this OrderBook, so leave the peek'd Object alone...
			}else {
				try {
					Thread.currentThread();
					Thread.sleep(0L , nanoSleep);

				}catch(InterruptedException e){

					running.set(false);

					Thread.currentThread().interrupt();

					System.err.println(e.getMessage());

					System.err.println(new StringBuilder()
							.append(CLASSNAME)
							.append(Constants.SPACE)
							.append(e.getMessage())
							.toString());			
				}			
			}
		}
	}

	@Override
	public Thread setThread(Thread orderBookThread) {
		this.orderBookThread  = orderBookThread;
		return this.orderBookThread;

	}

	@Override
	public Thread getThread() {
		return this.orderBookThread;
	}

	@Override
	@NotYetImplemented
	public List<String> getOrderBookVisualisation() {
		// TODO Auto-generated method stub
		return null;
	}
}	