package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	29th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceInitialise
 *	Description		:
 *****************************************************************************/
import java.util.concurrent.ConcurrentLinkedQueue;

public interface InterfaceInitialisePersistenceServer {
	public boolean initialise(ConcurrentLinkedQueue<String> queue, String fullPathAndFileNameToUse, String tag, int NanoSleep);
}
