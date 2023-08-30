package com.alignmentsystems.matching.interfaces;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface InterfaceOrderToStringProcessor {
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue, ConcurrentLinkedQueue<String> outQueue);
}
