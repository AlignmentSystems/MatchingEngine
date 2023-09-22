package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	22nd September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentOrderBookWrapper
 *	Description		:
 *****************************************************************************/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.interfaces.InterfaceOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookWrapper;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentOrderBookWrapper implements InterfaceOrderBookWrapper{
	public final static String CLASSNAME = AlignmentOrderBookWrapper.class.getSimpleName();

	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null;
	//private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	// private List<InterfaceOrderBookOrderAdded> listenersAddedOrderToOrderBook =
	// new ArrayList<InterfaceOrderBookOrderAdded>();

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
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger) throws Exception {
		final String METHOD = "initialise";
		
		this.log = log;
		this.debugger = debugger;

		debugger.info(CLASSNAME + "." + METHOD);
		
		
		final String symbol = "BADGER.W";

		AlignmentOrderBook orderBook = new AlignmentOrderBook();
		
		AlignmentOrderBookKafkaProducer obkp = new AlignmentOrderBookKafkaProducer();
		
		obkp.initialise(this.log , this.debugger );
		
		if(orderBook.initialise(symbol, this.log, this.debugger, obkp, obkp)) {

		}else{
			return false;
		};
		
		
		
		//obkp.addAddedOrderToOrderBookListener(multicast);
		//obkp.addMatchEventListener(multicast);
		

		Thread obThread = new Thread(orderBook);

		obThread.start();

		AlignmentOrderBookKafkaConsumer obkc = null;

		try {
			obkc = new AlignmentOrderBookKafkaConsumer();
			Thread obkThread = new Thread(null, obkc, AlignmentOrderBookKafkaConsumer.CLASSNAME);
			obkc.initialise(this.log, debugger);			
			obkThread.start();
		} catch (Exception e) {
			//log.error(e.getMessage() ,  e);
			throw e;
		}

		//orderBook.addAddedOrderToOrderBookListener(multicast);
		//orderBook.addMatchEventListener(multicast);
		
		List<String> orderBookTopicsToConsume = List.of(
				KafkaMessageTopology.MESSAGE_RECEIVED_KILL_SWITCH
				, symbol);
		
		try {
			obkc.runAlways(orderBookTopicsToConsume, orderBook);
		} catch (Exception e) {
			//log.error(e.getMessage() ,  e);
			throw e;
		}

		return true;
	}
}