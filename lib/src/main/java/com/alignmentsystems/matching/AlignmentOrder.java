package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentOrder
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.fix44.field.OrderQty;
import com.alignmentsystems.fix44.field.Price;
import com.alignmentsystems.matching.annotations.Experimental;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.MessageDirection;
import com.alignmentsystems.matching.enumerations.OrderBookSide;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;
import quickfix.SessionID;


/**
 * 
 */
public class AlignmentOrder implements InterfaceOrder{
	private String symbol = null;
	private OrderBookSide orderBookSide = null;
	private OrderQty orderQty = null;
	private Price limitPrice = null;
	private SessionID sessionId = null;
	private NewOrderSingle nos = null;
	private OffsetDateTime ts;
	private String sender = null;
	private String target = null;
	private final static ZoneOffset zo = Constants.HERE;
	private List<ExecutionReport> executions =  new ArrayList<ExecutionReport>();
	private String orderId = null;
	private String clOrdId = null;
	private MessageDirection messageDirection = MessageDirection.INDETERMINATE; 



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AlignmentOrder [target=");
		builder.append(this.target);
		builder.append(", sender=");
		builder.append(this.sender);

		builder.append(", OrderID=");
		builder.append(this.orderId);

		builder.append(", ClOrdID=");
		builder.append(this.clOrdId);

		builder.append(", symbol=");
		builder.append(this.symbol);
		builder.append(", side=");
		builder.append(this.orderBookSide.sideValue);
		builder.append(", orderQty=");
		builder.append(this.orderQty);
		builder.append(", limitPrice=");
		builder.append(this.limitPrice);
		builder.append(", sessionId=");
		builder.append(this.sessionId);
		builder.append(", ts=");
		builder.append(this.ts);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public NewOrderSingle getNewOrderSingle() {
		return this.nos;
	}

	@Override
	public void setNewOrderSingle(NewOrderSingle nos, SessionID sessionId, MessageDirection messageDirection, String orderId, OrderBookSide orderBookSide) throws FieldNotFound {
		this.ts = OffsetDateTime.now(zo);
		this.nos = nos;
		this.sessionId = sessionId;
		this.orderId = orderId;
		this.orderBookSide = orderBookSide;
		this.messageDirection = messageDirection;

		try {
			String receivedTarget = sessionId.getSenderCompID(); 	
			String receivedSender = sessionId.getTargetCompID();		
			if (messageDirection==MessageDirection.RECEIVED) {
				this.sender = receivedSender;
				this.target = receivedTarget;
			}else {
				this.sender = receivedSender;
				this.target = receivedTarget;
			}
			this.clOrdId = nos.getClOrdID().getValue().toString();
			this.orderQty = nos.getOrderQty();
			this.limitPrice = nos.getPrice();			
			this.symbol = nos.getSymbol().getValue();
		} catch (FieldNotFound e) {
			throw e;
		}
	}

	@Override
	public OrderBookSide getOrderBookSide() {		
		return this.orderBookSide;
	}

	@Override
	public OrderQty getOrderQty() {
		return this.orderQty;
	}

	@Override
	public Price getLimitPrice() {
		return this.limitPrice;
	}

	@Override
	public SessionID getSessionId() {
		return this.sessionId;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.ts;
	}




	@Override
	public String getClOrdID()  {
		return this.clOrdId;
	}


	@Override
	public void execute(ExecutionReport execution) {		
		this.executions.add(execution);
	}


	@Override
	public List<ExecutionReport> getExecutionReports() {
		return this.executions;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public void setOrderId(String orderId) {
		this.orderId = orderId;

	}

	@Override
	public String getOrderId() {
		return this.orderId;
	}

	@Override
	@Experimental
	public String getOrderUniquenessTuple() {
		return this.orderId;
	}

	@Override
	public String getSender() {
		return this.sender;
	}


	@Override
	public String getTarget() {
		return this.target;
	}	
}