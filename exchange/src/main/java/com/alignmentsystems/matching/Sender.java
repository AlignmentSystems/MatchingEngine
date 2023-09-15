package com.alignmentsystems.matching;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class Sender {
	
	public Sender(byte[] binaryMessage, String symbol, String orderId) {
		super();
		this.binaryMessage = binaryMessage;
		this.symbol = symbol;
		this.orderId = orderId;
	}

	byte[] binaryMessage = null;
	String symbol = null;
	String orderId = null;

	public byte[] getBinaryMessage() {
		return this.binaryMessage;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getOrderId() {
		return orderId;
	}
}