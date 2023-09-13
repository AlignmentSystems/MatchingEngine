package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LibraryOrders
 *	Description		:
 *****************************************************************************/

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
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class LibraryOrders {


	/**
	 * 
	 * @param side Side
	 * @return OrderBookSide
	 */
	public static OrderBookSide getOrderBookSideFromFIXSide(Side side) {
		if (side.getObject()==Side.BUY) {
			return OrderBookSide.BUY;	
		}else if (side.getObject()==Side.SELL) {
			return OrderBookSide.SELL;	
		}else {
			return OrderBookSide.ERROR;
		}
	}

	public static ExecutionReport getExecutionReportAcknowledgementForOrder(InterfaceOrder nos) throws FieldNotFound {
		OrderID orderId = new OrderID(nos.getOrderId().toString());
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