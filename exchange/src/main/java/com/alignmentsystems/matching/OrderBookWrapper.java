package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBooks
 *	Description		:
 *****************************************************************************/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.exceptions.OrderBookNotFound;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceOrderBookWrapper;

import quickfix.FieldNotFound;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class OrderBookWrapper implements InterfaceOrderBookWrapper , InterfaceMatchEvent, InterfaceAddedOrderToOrderBook {
	private final static String CLASSNAME = OrderBookWrapper.class.getSimpleName();

	private Map<String, InterfaceOrderBook> orderBooks = new HashMap<String, InterfaceOrderBook>();
	private LogEncapsulation log = null;
	private PersistenceToFileClient debugger = null;
	private List<InterfaceMatchEvent> listenersMatchEvent = new ArrayList<InterfaceMatchEvent>();
	//private List<InterfaceAddedOrderToOrderBook> listenersAddedOrderToOrderBook = new ArrayList<InterfaceAddedOrderToOrderBook>();


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
	public boolean initialise(
			LogEncapsulation log	
			, PersistenceToFileClient debugger
			) {
		this.log = log;
		this.debugger = debugger;
		
		final String symbol = "Badger.W";

		OrderBookKafka obk = null;
		try {
			obk = new OrderBookKafka();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		OrderBook orderBook = new OrderBook();
		orderBook.initialise(symbol, log, debugger, this, this);
		
		try {
			obk.runAlways(symbol, orderBook);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

	@Override
	public void matchHappened(InterfaceMatch match) {
		for (InterfaceMatchEvent hl : listenersMatchEvent)
			hl.matchHappened(match);			
	}

	@Override
	public void addedOrderToOrderBook(InterfaceOrder nos) {
		sendExecutionReportAcknowledgementForReceivedOrder(nos);
		//		for (InterfaceAddedOrderToOrderBook hl : listenersAddedOrderToOrderBook)
		//			hl.addedOrderToOrderBook(nos);	
	}

	private void sendExecutionReportAcknowledgementForReceivedOrder(InterfaceOrder nos ) {
		final String methodName ="sendExecutionReportAcknowledgementForReceivedOrder";
		ExecutionReport er;

		try {
			er = getExecutionReportAcknowledgementForOrder(nos);
		} catch (FieldNotFound e) {
			return;
		}

		SessionID sessionID  = nos.getSessionId();

		try {
			Session.sendToTarget(er, sessionID);
		} catch (SessionNotFound e) {
			log.error(e.getMessage(), e);
		};			
	}

	private static ExecutionReport getExecutionReportAcknowledgementForOrder(InterfaceOrder nos) throws FieldNotFound {
		OrderID orderId = new OrderID(nos.getOrderId());
		ExecID execID = new ExecID (UUID.randomUUID().toString());		
		ExecType execType = new ExecType(ExecType.NEW);		
		OrdStatus ordStatus = new OrdStatus(OrdStatus.NEW);
		Side side = null;
		LeavesQty leavesQty  = null;
		CumQty cumQty = new CumQty(0d);
		AvgPx avgPx = new AvgPx(0d);

		try {
			side = new Side(nos.getNewOrderSingle().getSide().getValue());
			leavesQty = new LeavesQty(nos.getNewOrderSingle().getOrderQty().getValue());		

		} catch (FieldNotFound e) {
			throw e;
		}

		ExecutionReport er = new ExecutionReport(
				orderId
				, execID
				, execType
				, ordStatus
				, side
				, leavesQty
				, cumQty
				, avgPx
				);

		return er;
	}
}