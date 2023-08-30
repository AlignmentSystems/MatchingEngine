package com.alignmentsystems.matching.interfaces;
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

/**
 * @author John Greenan john.greenan@alignment-systems.com
 * An interface for a Logger
 */
public interface InterfacePersistenceClient {
	/**
	 * Initialise the logger
	 * @throws FileNotFoundException The file to which the logger has been directed cannot be found.
	 * @throws IllegalThreadStateException There isa thread state issue - this has not been seen in testing
	 */
	public void init() throws FileNotFoundException, IllegalThreadStateException;
	/**
	 * Shutdown the logger
	 */
	public void shutdown();

	/**
	 * 
	 * @return The fullname and path of the file to which the logger writes
	 */
	public String getFullPathAndFileNameToUse();

	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean info(String toLog);
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean infoSession(String toLog, String methodName);
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean debugSession(String toLog, String methodName) ;
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName The FIX session method that has called the logger
	 * @return Was this logged?
	 */
	public Boolean errorSession(String toLog, String methodName);

	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean error(String toLog);
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param e Exception to log
	 * @return Was this logged?
	 */
	public Boolean error(String toLog, Exception e);
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @param methodName  The FIX session method that has called the logger
	 * @param e Exception to log
	 * @return Was this logged?
	 */
	public Boolean errorSession(String toLog, String methodName, Exception e);
	/**
	 * 
	 * @param toLog The data to add to the log file
	 * @return Was this logged?
	 */
	public Boolean debug(String toLog);
}