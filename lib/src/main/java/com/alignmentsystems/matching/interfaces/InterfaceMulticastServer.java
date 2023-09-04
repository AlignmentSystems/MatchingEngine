package com.alignmentsystems.matching.interfaces;
import java.io.IOException;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMulticastServer
 *	Description		:
 *****************************************************************************/
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;

public interface InterfaceMulticastServer {
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue, PersistenceToFileClient debugger, String host, int port);
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue, PersistenceToFileClient debugger);
	public void multicastThis(byte[] multicastBytes) throws IOException;
	public ConcurrentLinkedQueue<InterfaceMatchTrade> getMarketDataQueue();
	public Long getCurrentSequenceNumber();
}