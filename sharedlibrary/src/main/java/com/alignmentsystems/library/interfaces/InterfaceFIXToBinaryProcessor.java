package com.alignmentsystems.library.interfaces;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.library.LogEncapsulation;

public interface InterfaceFIXToBinaryProcessor {
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue , LogEncapsulation log );
}
