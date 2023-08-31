package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	31st August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatchingEngine
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;

public interface InterfaceMatchingEngine {
	public boolean initialise(String[] args, LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> inboundSequenced, PersistenceToFileClient debugger);
}
