package com.alignmentsystems.library.interfaces;
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

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceMulticastServer {
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue, PersistenceToFileClient debugger, String host, int port) throws Exception;
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue, PersistenceToFileClient debugger) throws Exception;
	public void multicastThis(byte[] multicastBytes) throws IOException;
	public ConcurrentLinkedQueue<InterfaceMatch> getMarketDataQueue();
	public Long getCurrentSequenceNumber();
}