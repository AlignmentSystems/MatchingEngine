package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MatchingEngine
 *	Description		:
 *****************************************************************************/

import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.json.JsonObject;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.OrderDistributionModel;
import com.alignmentsystems.matching.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.matching.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.matching.interfaces.InterfaceMatch;
import com.alignmentsystems.matching.interfaces.InterfaceMatchingEngine;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderBook;
import com.alignmentsystems.matching.library.LibraryFunctions;
import com.alignmentsystems.matching.library.LibraryKafka;
import com.alignmentsystems.matching.udp.MulticastServer;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MatchingEngine implements Runnable , InterfaceMatchEvent, InterfaceMatchingEngine , InterfaceAddedOrderToOrderBook{
	private final static String CLASSNAME = MatchingEngine.class.getSimpleName();
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced = null;
	private OrderBooks orderBooks = null; 
	private static final int milliSleep = 200;
	private AtomicBoolean running = new AtomicBoolean(false);
	private PersistenceToFileClient debugger = null;
	private MulticastServer mdOut = null;
	private ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue = null;
	private KafkaProducer<String, String> kafkaProducer = null;
	private OrderDistributionModel orderDistributionModel = null;



	@Override
	public void run() {

		running.set(true);
		debugger.info(CLASSNAME + " Started....");

		String symbol = null;
		InterfaceOrderBook orderBook = null;

		while (running.get()){
			InterfaceOrder inSeq = inboundSequenced.poll();

			if (inSeq!= null) { //Which OrderBook???
				symbol = inSeq.getSymbol();

				orderBook = orderBooks.getOrderBookForSymbol(symbol);
				orderBook.getInboundSequenced().add(inSeq);

				debugger.info(CLASSNAME + " Added order for symbol=" + symbol);

				symbol = null;
				orderBook = null;

				//LibraryOrders.snapShotOrderBook(orderBook, this.log);
			}

			try {
				Thread.currentThread();
				Thread.sleep(milliSleep);
			}catch(InterruptedException e){
				running.set(false);
				Thread.currentThread().interrupt();
				System.err.println(e.getMessage());

				System.err.println(
						new StringBuilder().append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage())
						.toString()
						);			
			}
		}
	}






	@Override
	public boolean initialise(			
			 LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced
			, PersistenceToFileClient debugger
			,  MulticastServer mdOut
			, OrderDistributionModel orderDistributionModel) {
		this.log = log;
		this.inboundSequenced = inboundSequenced;
		this.debugger = debugger;
		this.orderDistributionModel = orderDistributionModel;
		
		this.mdOut = mdOut;//TODO - think about if this reference is required...
		this.marketDataToPublishQueue = mdOut.getMarketDataQueue();

		if(this.orderDistributionModel==OrderDistributionModel.CONCURRENTLINKEDQUEUE){
			orderBooks = new OrderBooks();
			orderBooks.initialise(this.log, this.inboundSequenced, this.debugger, this, this, this.orderDistributionModel);			
		}
		
		if(this.orderDistributionModel==OrderDistributionModel.KAFKA){
			if (this.kafkaProducer == null) {
				Properties props = LibraryFunctions.getProperties(Actors.KAFKA);
				this.kafkaProducer = new KafkaProducer<>(props);
			}
		}
		
		
		
		
		return true;
	}

	protected void send(String topicName, String key, String message) throws Exception {
        String source = this.CLASSNAME;

        //create the ProducerRecord object which will represent the message to the Kafka broker.
        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>(topicName, key, message);
        
        //Use the helper to create an informative log entry in JSON format
        JsonObject obj = LibraryKafka.getMessageLogEntryJSON(source, topicName, key, message);
        log.info(obj.asJsonObject().toString());
        //Send the message to the Kafka broker using the internal
        //KafkaProducer
        this.kafkaProducer.send(producerRecord);
    }
	
	
	
	
	
	@Override
	public void matchHappened(InterfaceMatch match) {
		sendExecutionReportsForMatch(match, log);
		publishMarketDataToPublishQueue(match);			
	}


	@Override
	public void publishMarketDataToPublishQueue(InterfaceMatch match) {
		final String methodName ="publishMarketDataToPublishQueue";
		if (match.getIsEligibleForMarketData()) {
			marketDataToPublishQueue.add(match);	
		}
	}

	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		final String methodName ="addedOrderToOrderBook";
		this.sendExecutionReportAcknowledgementForReceivedOrder(nos, log);

	}
}