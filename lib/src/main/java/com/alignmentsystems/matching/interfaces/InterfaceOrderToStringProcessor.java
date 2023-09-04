package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	1st September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOrderToStringProcessor
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;

public interface InterfaceOrderToStringProcessor {
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue, ConcurrentLinkedQueue<String> outQueue);
}
