package com.alignmentsystems.library;
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
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.library.annotations.Experimental;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;
import quickfix.SessionID;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentOrder implements InterfaceOrder{
	private String symbol = null;
	private OrderBookSide orderBookSide = null;
	private Long orderQty = null;
	private Long limitPrice = null;
	private SessionID sessionId = null;
	private NewOrderSingle nos = null;
	private OffsetDateTime ts;
	private String sender = null;
	private String target = null;
	private char timeInForce;
	private final static ZoneOffset zo = Constants.HERE;
	private List<ExecutionReport> executions =  new ArrayList<ExecutionReport>();
	private UUID orderId = null;
	private UUID clOrdId = null;
	private short alignmentType = 0;
	private Long cumQty = null;
	private Long avgPx = null;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder()
				.append("AlignmentOrder [limitPrice=")
				.append(Long.toString(this.limitPrice))
				.append(", ts=")
				.append(this.ts)
				.append(", target=")
				.append(this.target)
				.append(", sender=")
				.append(this.sender)
				.append(", OrderID=")
				.append(this.orderId)

				.append(", ClOrdID=")
				.append(this.clOrdId)

				.append(", symbol=")
				.append(this.symbol)
				.append(", side=")
				.append(this.orderBookSide.sideReadableValue)
				.append(", orderQty=")
				.append(Long.toString(this.orderQty))
				.append(", sessionId=")
				.append(this.sessionId)
				.append("]")
				;
		return builder.toString();
	}



	@Override
	public NewOrderSingle getNewOrderSingle() {
		return this.nos;
	}

	@Override
	public void setNewOrderSingle(
			NewOrderSingle nos
			, SessionID sessionId
			, UUID orderId
			, OrderBookSide orderBookSide
			) throws FieldNotFound {
		this.ts = OffsetDateTime.now(zo);
		this.nos = nos;
		this.sessionId = sessionId;
		this.orderId = orderId;
		this.orderBookSide = orderBookSide;

		try {
			String receivedTarget = sessionId.getSenderCompID(); 	
			String receivedSender = sessionId.getTargetCompID();		
			this.sender = receivedSender;
			this.target = receivedTarget;
			this.clOrdId = UUID.fromString(nos.getClOrdID().getValue().toString());
			this.orderQty = (long) nos.getOrderQty().getValue();
			this.limitPrice = (long) nos.getPrice().getValue();			
			this.symbol = nos.getSymbol().getValue();
			this.timeInForce = nos.getTimeInForce().getValue();
		} catch (FieldNotFound e) {
			throw e;
		}
	}

	@Override
	public OrderBookSide getOrderBookSide() {		
		return this.orderBookSide;
	}

	@Override
	public Long getOrderQty() {
		return this.orderQty;
	}

	@Override
	public Long getLimitPrice() {
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
	public UUID getClOrdID()  {
		return this.clOrdId;
	}


	@Override
	public void execute(ExecutionReport execution) {		
		
		try {
			//int countOfExecutions = this.executions.size();
			Long existingAvgPx = this.avgPx;
			Long existingQuantityExecuted = this.cumQty;
			Long thisExecutionQuantity = (long) execution.getLastQty().getValue();
			Long thisExecutionPrice = (long) execution.getLastPx().getValue();
			this.avgPx = ((existingAvgPx * existingQuantityExecuted) + (thisExecutionQuantity * thisExecutionPrice)) / (existingQuantityExecuted + thisExecutionQuantity);
			this.cumQty = this.cumQty + thisExecutionQuantity;
			this.executions.add(execution);	
		} catch (FieldNotFound e) {
			e.printStackTrace();
		}
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
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;

	}

	@Override
	public UUID getOrderId() {
		return this.orderId;
	}

	@Override
	@Experimental
	public String getOrderUniquenessTuple() {
		return this.orderId.toString();
	}

	@Override
	public String getSender() {
		return this.sender;
	}


	@Override
	public String getTarget() {
		return this.target;
	}

	@Override
	public void reCreateOrder(String symbol , Character timeInForce , OrderBookSide orderBookSide, Long orderQty, Long limitPrice,
			OffsetDateTime ts,  String sender, String target, UUID orderId, UUID clOrdId) {
		this.symbol = symbol;
		this.timeInForce = timeInForce; 
		this.orderBookSide = orderBookSide;
		this.orderQty = orderQty;
		this.limitPrice = limitPrice;
		this.ts = ts;
		this.sender = sender;
		this.target = target;
		this.orderId = orderId;
		this.clOrdId = clOrdId;

	}

	@Override
	public short getAlignmentType() {
		return this.alignmentType;
	}

	@Override
	public void setAlignmentType(short alignmentType) {
		this.alignmentType = alignmentType;
	}

	@Override
	public char getTimeInForce() {
		return this.timeInForce;
	}

	@Override
	public void setTimeInForce(char timeInForce) {
		this.timeInForce = timeInForce; 		
	}

	@Override
	public long getCumQty() {
		return this.cumQty;
	}

	@Override
	public long getAvgPx() {
		return this.avgPx;
	}	
}