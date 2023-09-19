package com.alignmentsystems.matching;

import java.util.HashMap;
import java.util.Map;

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.interfaces.InterfaceOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookWrapper;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class OrderBookWrapper implements InterfaceOrderBookWrapper{
	@SuppressWarnings("unused")
	private final static String CLASSNAME = OrderBookWrapper.class.getSimpleName();

	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();
	private LogEncapsulation log = null;
	private PersistenceToFileClient debugger = null;
	//private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	// private List<InterfaceAddedOrderToOrderBook> listenersAddedOrderToOrderBook =
	// new ArrayList<InterfaceAddedOrderToOrderBook>();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderBooks [orderBooks=");
		for (String key : orderBooks.keySet()) {
			builder.append(key.toString());
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean initialise(LogEncapsulation log, PersistenceToFileClient debugger) throws Exception {
		this.log = log;
		this.debugger = debugger;

		final String symbol = "BADGER.W";

		OrderBook orderBook = new OrderBook();
		
		OrderBookKafkaProducer obkp = new OrderBookKafkaProducer();
		
		obkp.initialise(log);
		
		if(orderBook.initialise(symbol, this.log, this.debugger, obkp, obkp)) {

		}else{
			return false;
		};
		
		
		
		//obkp.addAddedOrderToOrderBookListener(multicast);
		//obkp.addMatchEventListener(multicast);
		

		Thread obThread = new Thread(orderBook);

		obThread.start();

		OrderBookKafkaConsumer obkc = null;

		try {
			obkc = new OrderBookKafkaConsumer();
			Thread obkThread = new Thread(null, obkc, OrderBookKafkaConsumer.CLASSNAME);
			obkc.initialise(this.log);			
			obkThread.start();
		} catch (Exception e) {
			//log.error(e.getMessage() ,  e);
			throw e;
		}

		//orderBook.addAddedOrderToOrderBookListener(multicast);
		//orderBook.addMatchEventListener(multicast);
		
		
		

		try {
			obkc.runAlways(symbol, orderBook);
		} catch (Exception e) {
			//log.error(e.getMessage() ,  e);
			throw e;
		}

		return true;
	}
}