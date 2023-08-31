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
import com.alignmentsystems.fix44.field.ClOrdID;
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


	//	Compares this date-time to another date-time.
	//	The comparison is based on the instant then on the local date-time. It is "consistent with equals", as defined by Comparable.
	//
	//	For example, the following is the comparator order:
	//
	//	2008-12-03T10:30+01:00
	//	2008-12-03T11:00+01:00
	//	2008-12-03T12:00+02:00
	//	2008-12-03T11:30+01:00
	//	2008-12-03T12:00+01:00
	//	2008-12-03T12:30+01:00
	//	Values #2 and #3 represent the same instant on the time-line. When two values represent the same 
	//	instant, the local date-time is compared to distinguish them. This step is needed to make the ordering consistent with equals().
	//	Specified by: compareTo(...) in Comparable
	//	Parameters:
	//	other the other date-time to compare to, not null
	//	Returns:
	//	the comparator value, negative if less, positive if greater
	@Override
	public int compareTo(InterfaceOrder o) {
		final int lessThan = -1;
		final int moreThan = 1;


		if (this.limitPrice.getValue() == o.getLimitPrice().getValue()) {
			//limit price is identical, so have to look at the timestamp
			if(this.ts.compareTo(o.getTimestamp()) > 0) {
				return moreThan;
			} else {
				return lessThan;
			}
		}else if(this.limitPrice.getValue() > o.getLimitPrice().getValue()) {
			return moreThan;
		}else {
			//this.limitPrice.getValue() < o.getLimitPrice().getValue()
			return lessThan;
		}
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