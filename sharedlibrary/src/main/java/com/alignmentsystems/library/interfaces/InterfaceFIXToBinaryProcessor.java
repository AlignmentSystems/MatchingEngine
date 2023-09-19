package com.alignmentsystems.library.interfaces;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.library.AlignmentLogEncapsulation;

public interface InterfaceFIXToBinaryProcessor {
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue , AlignmentLogEncapsulation log ) throws Exception;
}
