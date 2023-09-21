package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	17th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentOrderBookKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.OperationEventType;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceKafkaProducer;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookEvents;

public class AlignmentOrderBookKafkaProducer implements InterfaceKafkaProducer, InterfaceMatchEvent, InterfaceAddedOrderToOrderBook, InterfaceOrderBookEvents, Runnable {
	public final static String CLASSNAME = AlignmentOrderBookKafkaProducer.class.getSimpleName();
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null; 
	private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	private List<InterfaceAddedOrderToOrderBook> listenersAddedOrderToOrderBook = new ArrayList<InterfaceAddedOrderToOrderBook>();


	@Override
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd) {
		this.listenersAddedOrderToOrderBook.add(toAdd);		
	}

	@Override
	public void addMatchEventListener(InterfaceMatchEvent toAdd) {
		this.listenersMatchEvent.add(toAdd);
	}


	protected void send(String topicName, String key, byte[] binaryMessage) {

		// create the ProducerRecord object which will represent the message to the
		// Kafka broker.
		ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<>(topicName, key, binaryMessage);

		// Use the helper to create an informative log entry in JSON format
		// JsonObject obj = LibraryKafka.getMessageLogEntryJSON(CLASSNAME, topicName,
		// key, message);
		// log.info(obj.asJsonObject().toString());
		// Send the message to the Kafka broker using the internal
		// KafkaProducer
		this.kafkaProducerB.send(producerRecord);
	}

	private synchronized void waiter() throws IllegalArgumentException , InterruptedException , IllegalMonitorStateException  {
		wait(2000);
	}

	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);
		while (run.get()) {
			while (run.get()) {
				try {
					waiter();
				} catch (IllegalArgumentException | InterruptedException | IllegalMonitorStateException e) {
					log.error(e.getMessage() , e );
				}
			}
		}

	}


	@Override
	public void matchHappened(InterfaceMatch match) {
		@SuppressWarnings("unused")
		final String methodName = "matchHappened";

		log.infoMatchingEvent(OperationEventType.MATCHEVENT, match);

		AlignmentKafkaSender senderBuy = match.getBuyReport().getMemberExecRptAsSBEInSender();
		AlignmentKafkaSender senderSell = match.getSellReport().getMemberExecRptAsSBEInSender();
		AlignmentKafkaSender marketDataOut = match.getMarketDataBytesAsSBEInSender();
		
		this.send(senderBuy.getTopic() , senderBuy.getKey(), senderBuy.getBinaryMessage());
		this.send(senderSell.getTopic() , senderSell.getKey(), senderSell.getBinaryMessage());
		this.send(marketDataOut.getTopic(), marketDataOut.getKey(), marketDataOut.getBinaryMessage());
		
		
	}

	@Override
	public void addedOrderToOrderBook(InterfaceExecutionReport er) {
		@SuppressWarnings("unused")
		final String methodName = "addedOrderToOrderBook";

		log.infoMatchingEvent(OperationEventType.NEWORDEREVENT, er);		
		AlignmentKafkaSender senderAck= er.getMemberExecRptAsSBEInSender();

		this.send(senderAck.getTopic(), senderAck.getKey(), senderAck.getBinaryMessage());		
	}

	@Override
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger) throws FileNotFoundException, NullPointerException {
		final String METHOD = "initialise";

		this.log = log;
		this.debugger = debugger;
		
		AlignmentUEH ueh = new AlignmentUEH(this.debugger);	
		
		Thread.setDefaultUncaughtExceptionHandler(ueh);
		
		debugger.info(CLASSNAME + "." + METHOD);


		if (this.kafkaProducerB == null) {
			Properties props;
			try {
				props = AlignmentFunctions.getProperties(AlignmentOrderBookKafkaProducer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		return true;
	}
}