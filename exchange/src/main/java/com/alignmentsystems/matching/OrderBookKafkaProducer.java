package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	17th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBookKafkaProducer
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.ClOrdID;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.fix44.field.TimeInForce;
import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.OperationEventType;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;

public class OrderBookKafkaProducer implements InterfaceMatchEvent, InterfaceAddedOrderToOrderBook, Runnable {
	private KafkaProducer<String, byte[]> kafkaProducerB = null;
	private LogEncapsulation log = null;

	public OrderBookKafkaProducer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean initialise(LogEncapsulation log) throws Exception{
		
		this.log = log;

		if (this.kafkaProducerB == null) {
			Properties props;
			try {
				props = LibraryFunctions.getProperties(FIXToBinaryProcessor.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		return true;
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


	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		sendExecutionReportAcknowledgementForReceivedOrder(nos);
	}

	private void sendExecutionReportAcknowledgementForReceivedOrder(InterfaceOrder nos) {
		final String methodName = "sendExecutionReportAcknowledgementForReceivedOrder";

		ExecutionReport er = getExecutionReportAcknowledgementForOrder(nos);

		final Boolean connectionToFIXEngineWorking = Boolean.FALSE;

		if(connectionToFIXEngineWorking) {
			try {
				Session.sendToTarget(er, nos.getSender(), nos.getTarget());
				//Session.sendToTarget(er, sessionID);
			} catch (SessionNotFound e) {
				log.error(e.getMessage(), e);
			}
		}

	}

	private static ExecutionReport getExecutionReportAcknowledgementForOrder(InterfaceOrder nos) {
		final OrderID orderId = new OrderID(nos.getOrderId().toString());
		final ExecID execID = new ExecID(UUID.randomUUID().toString());
		final ExecType execType = new ExecType(ExecType.NEW);
		final OrdStatus ordStatus = new OrdStatus(OrdStatus.NEW);
		final Side side = new Side(nos.getOrderBookSide().sideCharValue);
		final TimeInForce tif = new TimeInForce(nos.getTimeInForce());
		final LeavesQty leavesQty = new LeavesQty(0d);
		final CumQty cumQty = new CumQty(0d);
		final AvgPx avgPx = new AvgPx(0d);

		ExecutionReport er = new ExecutionReport(orderId, execID, execType, ordStatus, side, leavesQty, cumQty, avgPx);
		er.set(tif);
		//Convert er to Binary and send to Kafka
		
		
		return er;
	}

	
	
	
	

	@Override
	public void matchHappened(InterfaceMatch match) {
		//sendExecutionReportsForMatch(match);
		////Convert match to Binary and send to Kafka
	}


	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);
		while (run.get()) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}

	}
}
