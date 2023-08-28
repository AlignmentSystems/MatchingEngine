package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			: John Greenan
 *	Date            : 24th August 2023
 *	Copyright       : Alignment Systems Ltd 2023
 * 
 *	Artefact		: AlignmentOrder
 * 
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
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;
import quickfix.SessionID;

public class AlignmentOrder implements InterfaceOrder{

	private Side side = null;
	private OrderQty orderQty = null;
	private Price limitPrice = null;
	private SessionID sessionId = null;
	private NewOrderSingle nos = null;
	private OffsetDateTime ts = null;
	private final ZoneOffset zo = Constants.HERE;

	private List<ExecutionReport> executions =  new ArrayList<ExecutionReport>();

	public AlignmentOrder() {
		this.ts = OffsetDateTime.now(zo);
	}


	@Override
	public NewOrderSingle getNewOrderSingle() {
		return this.nos;
	}

	@Override
	public void setNewOrderSingle(NewOrderSingle nos, SessionID sessionId) throws FieldNotFound {

		this.nos = nos;
		this.sessionId = sessionId;

		try {
			this.side = nos.getSide();
			this.orderQty = nos.getOrderQty();
			this.limitPrice = nos.getPrice();	 
		} catch (FieldNotFound e) {
			throw e;
		}

	}

	@Override
	public Side getOrderSide() {		
		return this.side;
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
	//	ompares this date-time to another date-time.
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
	public ClOrdID getClOrdID() throws FieldNotFound {
		try {
			return this.nos.getClOrdID();
		} catch (FieldNotFound e) {
			throw e;
		}
	}


	@Override
	public void execute(ExecutionReport execution) {
		// TODO Auto-generated method stub
		this.executions.add(execution);
	}


	@Override
	public List<ExecutionReport> getExecutionReports() {
		return this.executions;
	}
}