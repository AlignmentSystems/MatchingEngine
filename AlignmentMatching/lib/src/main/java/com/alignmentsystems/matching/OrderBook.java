package com.alignmentsystems.matching;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.OrderBookSide;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.interfaces.MatchEvent;

public class OrderBook implements InterfaceOrderBook , MatchEvent{

	private PriorityQueue<InterfaceOrder>  buy = new PriorityQueue<InterfaceOrder> (100, Collections.reverseOrder());
	private PriorityQueue<InterfaceOrder>  sell = new PriorityQueue<InterfaceOrder> (100);

	private List<MatchEvent> listenersMatchEvent = new ArrayList<MatchEvent>();

	
	public OrderBook() {
		// TODO Auto-generated constructor stub
	}

	public void addMatchEventListener(MatchEvent toAdd) {
		listenersMatchEvent.add(toAdd);
	}

	
	@Override
	public boolean addedOrder(InterfaceOrder nos) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public boolean addOrder(InterfaceOrder nos) {
	OrderBookSide orderBookSide = LibraryFunctions.getOrderBookSide(nos); 

	Boolean returnValue = Boolean.FALSE;
	
	if(orderBookSide==OrderBookSide.BUY) {
		returnValue = buy.add(nos);
	}else if(orderBookSide==OrderBookSide.SELL) {
		returnValue = sell.add(nos);
	}else {
		returnValue = Boolean.FALSE;
	}
	
	
	//TODO - this is not the right way to do this, the event should be queued rather than sent here.
	
	if(returnValue) {
		addedOrder(nos);
	}
	
	return returnValue;
	
	}

	@Override
	public boolean cancelOrder(InterfaceOrder nos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public void matchHappened(Match match) {
		for (MatchEvent hl : listenersMatchEvent)
			hl.matchHappened(match);	
	}
	
	private  void runMatch() {

		InterfaceOrder topOfBuyBookPeek = buy.peek();
		InterfaceOrder topOfSellBookPeek = sell.peek();

		Double topOfBuyBookPrice = topOfBuyBookPeek.getLimitPrice().getValue(); 
		Double topOfSellBookPrice = topOfSellBookPeek.getLimitPrice().getValue();
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

			
			
			Match match = new Match(tradedQuantity, tradedPrice, topOfBuyBook, topOfSellBook, aggressor, executionTimestamp);
			this.matchHappened(match);
		}else {
			//topOfBuyBookPrice < topOfSellBookPrice
			//therefore no trade possible...
		}

	}

	@Override
	public void upsertTopOfBook(InterfaceOrder nos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLevelsOfDepth() {
		// TODO Auto-generated method stub
		
	}

	
}