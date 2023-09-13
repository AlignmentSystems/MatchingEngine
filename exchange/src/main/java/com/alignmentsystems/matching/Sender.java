package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Sender
 *	Description		:
 *****************************************************************************/
import java.nio.ByteBuffer;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class Sender {
	public Sender(ByteBuffer bb, String symbol, String orderId) {
		super();
		this.bb = bb;
		this.symbol = symbol;
		this.orderId = orderId;
	}
	ByteBuffer bb = null;
	String symbol = null;
	String orderId = null;

	public ByteBuffer getBb() {
		return bb;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getOrderId() {
		return orderId;
	}
}
