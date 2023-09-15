package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	30th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfacePersistenceClient
 *	Description		:
 *****************************************************************************/
import java.io.FileNotFoundException;
import java.io.IOException;

import com.alignmentsystems.library.exceptions.LogMessageIsNull;

/**
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfacePersistenceClient {
	
	public boolean initialise(ClassLoader cl , String instanceTypeName , String tag) throws FileNotFoundException, IllegalThreadStateException , IOException;	
	public boolean initialise(ClassLoader cl , String instanceTypeName) throws FileNotFoundException, IllegalThreadStateException , IOException;
	
	/**
	 * Shutdown the logger
	 */
	public void shutdown();

	/**
	 * 
	 * @return The fullname and path of the file to which the logger writes
	 */
	public String getFullPathAndFileNameInUse();

	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean info(String toLog) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean infoSession(String toLog, String methodName) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean debugSession(String toLog, String methodName) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean errorSession(String toLog, String methodName) throws LogMessageIsNull;

	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean error(String toLog) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param e Exception to log
	 * @return Was this logged?
	 */
	public Boolean error(String toLog, Exception e) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName  The FIX session method that has called the logger
	 * @param e Exception to log
	 * @return Was this logged?
	 */
	public Boolean errorSession(String toLog, String methodName, Exception e) throws LogMessageIsNull;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean debug(String toLog) throws LogMessageIsNull;
}