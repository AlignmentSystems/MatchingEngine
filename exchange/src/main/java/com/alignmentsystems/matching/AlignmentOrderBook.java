package com.alignmentsystems.matching;

import java.nio.ByteBuffer;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentOrderBook
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import com.alignmentsystems.library.AlignmentDataMapper;
import com.alignmentsystems.library.AlignmentExecutionReport;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentKillMessage;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentMatch;
import com.alignmentsystems.library.AlignmentOrder;
import com.alignmentsystems.library.AlignmentOrderComparatorBuy;
import com.alignmentsystems.library.AlignmentOrderComparatorSell;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.annotations.NotYetImplemented;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceKafkaMessageHandler;
import com.alignmentsystems.library.interfaces.InterfaceKillString;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookEvents;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookOrderAdded;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookOrderRemoved;

import quickfix.FieldNotFound;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *         <a href=
 *         "https://kafka.apache.org/35/javadoc/org/apache/kafka/clients/consumer/package-summary.html">Consumer</a>
 *
 */
public class AlignmentOrderBook
implements InterfaceKafkaMessageHandler, InterfaceOrderBook, InterfaceMatchEvent, InterfaceOrderBookOrderAdded, InterfaceOrderBookOrderRemoved, InterfaceOrderBookEvents, Runnable {
	private final static String CLASSNAME = AlignmentOrderBook.class.getSimpleName();
	private final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;


	private final static int buyPriorityQueueSize = 100;
	private final static int sellPriorityQueueSize = 100;
	private AlignmentOrderComparatorBuy aboc = new AlignmentOrderComparatorBuy();
	private AlignmentOrderComparatorSell asoc = new AlignmentOrderComparatorSell();
	private PriorityQueue<InterfaceOrder> buy = new PriorityQueue<InterfaceOrder>(buyPriorityQueueSize, aboc);
	private PriorityQueue<InterfaceOrder> sell = new PriorityQueue<InterfaceOrder>(sellPriorityQueueSize, asoc);

	private Map<String, List<InterfaceOrder>> buyMap = new HashMap<String, List<InterfaceOrder>>();
	private Map<String, List<InterfaceOrder>> sellMap = new HashMap<String, List<InterfaceOrder>>();

	private AlignmentPersistenceToFileClient debugger = null;

	private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	private List<InterfaceOrderBookOrderAdded> listenersOrderBookOrderAdded = new ArrayList<InterfaceOrderBookOrderAdded>();
	private List<InterfaceOrderBookOrderRemoved> listenersOrderBookOrderRemoved = new ArrayList<InterfaceOrderBookOrderRemoved>();


	private AtomicBoolean running = new AtomicBoolean(false);
	private AtomicBoolean initialised = new AtomicBoolean(false);
	private String symbol = null;
	private AlignmentLogEncapsulation log = null;
	private final int MILLISLEEP = 200;

	private OffsetDateTime orderBookCreationTime = null;
	private OffsetDateTime orderBookLastUpdateTime = null;


	@Override
	public Boolean initialise(String symbol, AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger,
			InterfaceMatchEvent toAddMatch, InterfaceOrderBookOrderAdded toAddOrder) {
		final String METHOD = "initialise";
		final String ID = this.CLASSNAME + Constants.FULLSTOP + METHOD ;

		Boolean returnValue = Boolean.FALSE;

		this.orderBookCreationTime = OffsetDateTime.now(Constants.HERE);
		this.symbol = symbol;
		this.log = log;
		this.debugger = debugger;
		this.addMatchEventListener(toAddMatch);
		this.addOrderAddedToOrderBookListener(toAddOrder);

		debugger.info(ID);

		returnValue = Boolean.TRUE;

		this.initialised.set(returnValue);
		return this.initialised.get();
	}

	@Override
	public String getThisOrderBookSymbol() {
		return this.symbol;
	}

	@NotYetImplemented
	private boolean cancelOrder(InterfaceOrder nos) {
		return false;
	}

	@NotYetImplemented
	private boolean cancelOrder(String orderId) {
		return false;
	}

	private void snapShotOrderBook() {
		List<String> buy = snapShotOrderBookBySide(OrderBookSide.BUY);
		List<String> sell = snapShotOrderBookBySide(OrderBookSide.SELL);
		this.log.infoOrderBookStatus(buy, sell);
	}

	/**
	 * 
	 * @param orderBook
	 * @param targetSide
	 */
	public List<String> snapShotOrderBookBySide(OrderBookSide targetSide) {
		int bookCount = 0;

		List<String> snapShotOrderBook = new ArrayList<String>();

		List<InterfaceOrder> orders = getOrdersBySide(targetSide);

		bookCount = getOrderCountBySide(targetSide);
		if (bookCount == 0) {

			snapShotOrderBook.add(
					targetSide.sideReadableValue + AlignmentFunctions.wrapNameSquareBracketsAndSpaces(Integer.toString(bookCount))
					+ Constants.TAB + "No orders...");
		} else {
			for (InterfaceOrder io : orders) {
				snapShotOrderBook.add(targetSide.sideReadableValue
						+ AlignmentFunctions.wrapNameSquareBracketsAndSpaces(Integer.toString(bookCount))
						+ io.toString());
			}
		}
		return snapShotOrderBook;
	}

	private void runMatch() {

		InterfaceOrder topOfBuyBook = buy.peek();
		InterfaceOrder topOfSellBook = sell.peek();

		if (topOfBuyBook == null) {
			// null for buy-side, so just exit this function
			return;
		}
		if (topOfSellBook == null) {
			// null for sell-side, so just exit this function
			return;
		}

		final Long topOfBuyBookPrice = topOfBuyBook.getLimitPrice();
		final Long topOfSellBookPrice = topOfSellBook.getLimitPrice();
		Long tradedQuantity = null;
		Long tradedPrice = null;
		// If buy top of book price is greater than or equal to the sell top of book
		// then we have got a buyer
		// who has crossed the spread. So we have a trade, yay!
		if (topOfBuyBookPrice >= topOfSellBookPrice) {

			// The minimum of sell order quantity and buy order quantity can trade.
			// Note - this is not correct, since you have to walk down the levels of depth
			// and execute each price until the order that crossed the spread is full or no
			// longer able to trade as the next]
			// price level would not match

			// Here is a question, who is the aggressor?
			// Why do we need to know this? So you can work out who gets to trade at their
			// preferred price...
			final OffsetDateTime topOfBuyBookTimestamp = topOfBuyBook.getTimestamp();
			final OffsetDateTime topOfSellBookTimestamp = topOfSellBook.getTimestamp();
			OrderBookSide aggressor = null;

			if (topOfBuyBookTimestamp.compareTo(topOfSellBookTimestamp) < 0) {
				// Returns: the comparator value, negative if less, positive if greater
				// Therefore topOfBuyBookTimestamp is less than topOfSellBookTimestamp
				// So topOfBuyBookTimestamp came first and is therefore NOT the aggressor
				aggressor = OrderBookSide.SELL; 
			} else {
				aggressor = OrderBookSide.BUY;
			}

			Long topOfBuyBookQty = topOfBuyBook.getOrderQty();
			Long topOfSellBookQty = topOfBuyBook.getOrderQty();

			tradedQuantity = Math.min(topOfBuyBookQty, topOfSellBookQty);

			switch (aggressor) {
			case SELL:
				tradedPrice = Math. max(topOfBuyBookPrice, topOfSellBookPrice);
				break;
			case BUY:
				tradedPrice = Math.min(topOfBuyBookPrice, topOfSellBookPrice);
				break;
			default:
				break;
			}
			OffsetDateTime executionTimestamp = OffsetDateTime.now(Constants.HERE);

			final UUID buyClOrdID = topOfBuyBook.getClOrdID();
			final UUID sellClOrdID = topOfSellBook.getClOrdID();
			final UUID buyOrderID = topOfBuyBook.getOrderId();
			final UUID sellOrderID = topOfSellBook.getOrderId();
			final boolean isEligibleForMarketData = true;

			AlignmentMatch match = new AlignmentMatch(
					tradedQuantity
					, tradedPrice
					, aggressor
					, executionTimestamp
					, buyClOrdID
					, sellClOrdID
					, buyOrderID
					, sellOrderID
					, topOfBuyBook.getCumQty() // Long buyCumQty
					, topOfSellBook.getCumQty() // Long sellCumQty
					, topOfBuyBook.getOrderQty() //Long buyOrderQty
					, topOfSellBook.getOrderQty() //Long sellOrderQty
					, topOfBuyBook.getAvgPx()//Long buyAvgPx
					, topOfSellBook.getAvgPx()//Long sellAvgPx
					, topOfBuyBook.getLeavesQty()
					, topOfSellBook.getLeavesQty() 
					, topOfBuyBook.getSender() //String buySenderId
					, topOfBuyBook.getTarget() //String buyTargetId
					, topOfSellBook.getSender() // String sellSenderId
					, topOfSellBook.getTarget() //String sellTargetId
					, AlignmentDataMapper.EXCHANGEORDSTATUSFILLED //buyOrderStatus
					, AlignmentDataMapper.EXCHANGEEXECTYPETRADE //buyExecType
					, AlignmentDataMapper.EXCHANGEORDSTATUSFILLED //sellOrderStatus
					, AlignmentDataMapper.EXCHANGEEXECTYPETRADE //sellExecType
					, isEligibleForMarketData
					);

			//tradedQuantity, tradedPrice, aggressor, executionTimestamp, buyClOrdID, sellClOrdID, buyOrderID, sellOrderID, isEligibleForMarketData
			executeTrade(buy, buyMap,topOfBuyBook);
			executeTrade(sell, sellMap,topOfSellBook);
			this.orderBookLastUpdateTime = OffsetDateTime.now(Constants.HERE);

			this.matchHappened(match);

		} else {
			// topOfBuyBookPrice < topOfSellBookPrice
			// therefore no trade possible...
		}
	}


	/**
	 * 
	 * @param pq
	 * @param map
	 * @param traded The traded order to remove from the priority queue and the Order Map
	 */
	private void executeTrade(PriorityQueue<InterfaceOrder> pq, Map<String, List<InterfaceOrder>> map, InterfaceOrder traded) {
		InterfaceKillString iks = (InterfaceKillString) traded;
		String killThis = iks.getOrderBookKillString();

		List<InterfaceOrder> targetList = map.get(killThis);
		targetList.remove(traded);

		pq.remove(traded);
	}



	@NotYetImplemented
	@Override
	public void upsertTopOfBook(InterfaceOrder nos) {
	}

	@NotYetImplemented
	@Override
	public void updateLevelsOfDepth() {
	}

	@Override
	public void addMatchEventListener(InterfaceMatchEvent toAdd) {
		this.listenersMatchEvent.add(toAdd);
	}

	@Override
	public void orderOrderBookAdded(InterfaceExecutionReport toAdd) {
		for (InterfaceOrderBookOrderAdded hl : listenersOrderBookOrderAdded)
			hl.orderOrderBookAdded(toAdd);
	}



	@Override
	public List<InterfaceOrder> getOrdersBySide(OrderBookSide orderBookSide) {
		List<InterfaceOrder> list = null;

		if (orderBookSide == OrderBookSide.BUY) {

			list = new ArrayList<>(buy);
			list.sort(aboc);

		} else {

			list = new ArrayList<>(sell);
			list.sort(asoc);
		}

		return list;
	}

	@Override
	public int getOrderCountBySide(OrderBookSide orderBookSide) {
		if (orderBookSide == OrderBookSide.BUY) {
			return buy.size();
		} else {
			return sell.size();
		}
	}


	@Override
	@NotYetImplemented
	public List<String> getOrderBookVisualisation() {
		return null;
	}

	@Override
	public OffsetDateTime getOrderBookCreationTime() {
		return this.orderBookCreationTime;
	}

	@Override
	public OffsetDateTime getOrderBookLastUpdateTime() {
		return this.orderBookLastUpdateTime;
	}

	@Override
	public void matchHappened(InterfaceMatch match) {
		for (InterfaceMatchEvent hl : listenersMatchEvent)
			hl.matchHappened(match);
	}


	/**
	 * 
	 * @param pq
	 * @param map
	 * @param toAdd The order to add to the priority queue and the Order Map
	 */
	private void addOrder (PriorityQueue<InterfaceOrder> pq, Map<String, List<InterfaceOrder>> map, InterfaceOrder toAdd) {

		InterfaceKillString iks = (InterfaceKillString) toAdd;
		String killString = iks.getOrderBookKillString();			

		if(map.containsKey(killString)) {
			map.get(killString).add(toAdd);
		}else {
			List<InterfaceOrder> targetList = List.of(toAdd);
			map.put(killString, targetList);
		}
		pq.add(toAdd);
	}	



	@Override
	public void processMessage(String topicName, ConsumerRecord<String, byte[]> message) throws Exception {

		//What has been received???
		//First two bytes are the key...
		ByteBuffer bb = ByteBuffer.wrap(message.value()).order(encoding.getByteOrder());
		final short msgType = bb.getShort();	//		buf.putShort(messageType

		if(msgType == AlignmentDataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMNEWORDERSINGLE) {
			InterfaceOrder io = new AlignmentOrder();
			io.getAlignmentOrderFromBuffer(message.value());

			if (io.getOrderBookSide()==OrderBookSide.SELL) {
				addOrder (sell, sellMap, io); 									
			}else {
				addOrder (buy, buyMap, io);
			}
			this.orderBookLastUpdateTime = OffsetDateTime.now(Constants.HERE);

			//get ExecutionReport from the Order...
			InterfaceExecutionReport er = getExecutionReportAcknowledgementForOrder(io);
			this.orderOrderBookAdded(er);	//raise the event out to the listeners...

			//this.orderBookLastUpdateTime = OffsetDateTime.now(Constants.HERE);
			//		 this.snapShotOrderBook(); 
			this.runMatch();
			//		 * 


		}else if(msgType == AlignmentDataMapper.EXCHANGEMESSAGETYPEKILLSWITCH) {
			AlignmentKillMessage akm = new AlignmentKillMessage();

			akm = (AlignmentKillMessage) akm.getKillMessageFromBuffer(message.value());

			String killString = akm.getOrderBookKillString();
			//We have a kill switch for a particular member connection as defined

			this.killSwitchEngage(killString);
		}



	}

	private  static InterfaceExecutionReport getExecutionReportAcknowledgementForOrder(InterfaceOrder nos) throws FieldNotFound {
		//		UUID execID 
		//		, UUID clOrdID
		//		, UUID orderID
		//		, String buySenderId
		//		, String buyTargetId
		//		, String sellSenderId
		//		, String sellTargetId
		//		, OffsetDateTime timestamp
		//		, Long executionQuantity
		//		, Long executionPrice
		//		, Long leavesQuantity
		//		, Long cumQuantity
		//		, Long averagePrice
		//		, Short ordStatus
		//		, Short execType
		//		, Short sideCode

		InterfaceExecutionReport er2 = new AlignmentExecutionReport();
		er2.setExecutionReport(
				null
				, nos.getClOrdID()
				, nos.getOrderId()
				, null
				, nos.getSender()
				, nos.getTarget()
				, null
				, null
				, nos.getTimestamp()
				, 0L
				, 0L
				, 0L
				, 0L
				, 0L
				, AlignmentDataMapper.EXCHANGEORDSTATUSNEW
				, AlignmentDataMapper.EXCHANGEEXECTYPENEW
				, AlignmentDataMapper.getExchangeSideCodeMappedFromMemberSideCode(nos.getOrderBookSide().sideCharValue)
				);
		return er2;
	}

	@Override
	public void run() {
		running.set(true); 

		try { 
			sleeper();
		}catch(InterruptedException e){

			running.set(false);

			Thread.currentThread().interrupt();

			System.err.println(e.getMessage());

			System.err.println(new StringBuilder() .append(CLASSNAME).append(Constants.SPACE) .append(e.getMessage()) .toString()); 
		} 
	}

	private synchronized void sleeper() throws IllegalArgumentException , InterruptedException , IllegalMonitorStateException  {
		Thread.currentThread();
		Thread.sleep(MILLISLEEP);
	}

	@Override
	@NotYetImplemented
	public void killSwitchEngage(Long sender, Long target) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @param pq
	 * @param map
	 * @param killString
	 */
	@NotYetImplemented
	private void killbySide(PriorityQueue<InterfaceOrder> pq , Map<String, List<InterfaceOrder>> map, String killString) {

		List<InterfaceOrder> killBuyList = map.get(killString);

		for (Iterator<InterfaceOrder> iter = killBuyList.iterator(); iter.hasNext(); ) {
			InterfaceOrder element = iter.next();
			pq.remove(element);
			//add events////
			orderBookOrderRemoved(element.getCancelledExecutionReport());			
		}
		map.remove(killString);
	}


	@Override
	public void killSwitchEngage(String killString) {
		killbySide(this.buy, this.buyMap , killString);
		killbySide(this.sell, this.sellMap , killString);
	}

	@Override
	public void addOrderAddedToOrderBookListener(InterfaceOrderBookOrderAdded toAdd) {
		this.addOrderAddedToOrderBookListener(toAdd);

	}

	@Override
	public void addOrderRemovedFromOrderBookListener(InterfaceOrderBookOrderRemoved toRemove) {
		this.addOrderRemovedFromOrderBookListener(toRemove);

	}

	@Override
	public void orderBookOrderRemoved(InterfaceExecutionReport er) {
		// TODO Auto-generated method stub

	}
}