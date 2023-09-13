package com.alignmentsystems.library.interfaces;
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.library.enumerations.InstanceType;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfacePersistenceServer {
	public void writeLineAtClose(String toWrite) ;
	public String getFileNameAndPathUsed();
	public boolean initialise(ClassLoader cl, ConcurrentLinkedQueue<String> queue , InstanceType instanceType , String tag , int NanoSleep) throws FileNotFoundException, IOException  ;
	public boolean initialise(ClassLoader cl , ConcurrentLinkedQueue<String> queue , InstanceType instanceType , int NanoSleep) throws FileNotFoundException, IOException  ;

}