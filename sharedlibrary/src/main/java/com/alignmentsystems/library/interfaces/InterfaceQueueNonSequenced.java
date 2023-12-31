package com.alignmentsystems.library.interfaces;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.library.AlignmentLogEncapsulation;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	12th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceQueueNonSequenced
 *	Description		:
 *****************************************************************************/

public interface InterfaceQueueNonSequenced {
	public boolean initialise(AlignmentLogEncapsulation log);
	public boolean addReceivedOrder(InterfaceOrder io);
	public ConcurrentLinkedQueue<InterfaceOrder> getOutputQueue();
}