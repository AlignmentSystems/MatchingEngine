package com.alignmentsystems.matching.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.enumerations.Actors;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOrderBooks
 *	Description		:
 *****************************************************************************/
public interface InterfacePersistenceServer {
	public void writeLineAtClose(String toWrite) ;
	public String getFileNameAndPathUsed();
	public boolean initialise(ConcurrentLinkedQueue<String> queue, Actors actor, String tag, int NanoSleep) throws FileNotFoundException, IOException  ;
	public boolean initialise(ConcurrentLinkedQueue<String> queue, Actors actor, int NanoSleep) throws FileNotFoundException, IOException  ;

}