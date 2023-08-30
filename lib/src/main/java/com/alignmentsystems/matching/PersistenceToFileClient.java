package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	30th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	PersistenceToFileClient
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.annotations.Experimental;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.PersistenceRecordType;
import com.alignmentsystems.matching.interfaces.InterfacePersistenceClient;
import com.alignmentsystems.matching.interfaces.InterfacePersistenceServer;
import com.alignmentsystems.matching.library.LibraryFunctions;

import java.io.FileNotFoundException;


/**
 * The main part of the logger that wraps up the logqueue and the ToFlatFile class...
 * @author John Greenan john.greenan@alignment-systems.com

 */
public class PersistenceToFileClient implements InterfacePersistenceClient{
	private ConcurrentLinkedQueue<String> logQueue = null;
	private Boolean runOnce=Boolean.TRUE;
	private String logFileDirectory = null;
	private String filenameSuffix = null;
	private final static int NANOSLEEP = 100;
	private boolean hasExecutedInit = false;
	private Thread logger = null;
	private String fullPathAndFileNameToUse  = null;
	private String tag = null;
	private AtomicBoolean isShuttingDown = new AtomicBoolean(false);

	public PersistenceToFileClient(String logFileDirectory, String filenameSuffix, String tag) {
		this.logFileDirectory = logFileDirectory;
		this.filenameSuffix = filenameSuffix;
		this.logQueue = new ConcurrentLinkedQueue<String>();
		this.tag = tag;
	}

	/**
	 * Flush the queued up messages to disk and then exit gracefully
	 */
	public void shutdown() {
		final String message = this.getClass().getSimpleName() +  " shutdown process starting...";
		debug(message);
		System.err.println(message);
		this.isShuttingDown.set(true); 
		flush();
		this.logger.interrupt();
	}


	/**
	 * 
	 * @throws FileNotFoundException Configuration for the file location may be incorrect, check it here, throw exception if not available
	 */
	public void init() throws FileNotFoundException, IllegalThreadStateException {
		if(!hasExecutedInit) {
			fullPathAndFileNameToUse = LibraryFunctions.getFileNameToUseForPersistence(logFileDirectory,filenameSuffix );
			PersistenceToFileServer persistenceToFileServer=new PersistenceToFileServer();
			persistenceToFileServer.initialise(logQueue, fullPathAndFileNameToUse, tag, NANOSLEEP);
			logger = new Thread(persistenceToFileServer);

			try {
				logger.start();
			} catch (IllegalThreadStateException e) {
				throw e;
			}
			hasExecutedInit=true;
		}
	}



	/**
	 * 
	 * @return Boolean Did the flush work ok?
	 * 
	 * Why is this here?
	 * If you have a normal error pattern whereby you can issue System.exit(0);
	 * then you can exit before the logqueue has been flushed to the log file
	 * on disk.  This flush method is an uncomplicated way to ensure that the
	 * data hits the disk and is not lost as the process is torn down.
	 * A more elegant implementation would loop on the isEmpty method constrained 
	 * by a number of tries.  But this is PoC code not finished polished product so 
	 * this implementation is sufficient.... 
	 */
	private Boolean flush() {
		final long shortSleep = 100;
		final long longSleep = 500;
		final String message = (new StringBuilder().append(this.getClass().getSimpleName()).append( " flushing queue...")).toString();
		final String flushedMessage = (new StringBuilder().append(this.getClass().getSimpleName()).append( " flushed queue...")).toString();					

		Boolean returnValue = Boolean.FALSE;

		infoPrivate(message);
		System.err.println(message);

		try {
			Thread.sleep(shortSleep);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println(e.getMessage());
			String messageOne = new StringBuilder()
					.append(this.getClass().getSimpleName().toString())
					.append(Constants.SPACE)
					.append(e.getMessage())
					.toString()
					;

			InterfacePersistenceServer iTFF = (InterfacePersistenceServer) this.logger;
			System.err.println(messageOne);
			iTFF.writeLineAtClose(messageOne);
		}


		if (!logQueue.isEmpty()) {
			try {
				Thread.sleep(longSleep);
			} catch (InterruptedException e1) {
				Thread.currentThread().interrupt();
				System.err.println(e1.getMessage());
				String messageTwo = new StringBuilder()
						.append(this.getClass().getSimpleName().toString())
						.append(Constants.SPACE)
						.append(e1.getMessage())
						.toString()
						;
				System.err.println(messageTwo);
			}		
		}

		if (logQueue.isEmpty()) {	
			System.err.println(flushedMessage);
			infoPrivate(flushedMessage);
			returnValue = Boolean.TRUE;
		}
		return returnValue; 
	}


	/**
	 * 
	 * @return String getFullPathAndFileNameToUse
	 */
	public String getFullPathAndFileNameToUse() {
		if(hasExecutedInit) {
			return this.fullPathAndFileNameToUse;
		}else {
			return null;
		}
	}




	/**
	 * 		
	 */
	private void runOnceExecute() {
		String runOnceMessage = new StringBuilder()		
				.append(this.getClass().getSimpleName().toString())
				.append(" executing for ")
				.append(this.tag.toUpperCase())
				.append(" Started as=[")
				.append(Thread.currentThread().getName().toString())
				.append("]")
				.toString();

		info(runOnceMessage);
	}



	/**
	 * 
	 * @param toLog The text to log that has been formatted, sequencenumber added and message type added
	 * @return Boolean
	 */
	private Boolean logExecute(String toLog) {
		try {
			if(runOnce) {
				runOnce=false;
				runOnceExecute();
			}

			logQueue.add(toLog);
			return true;
		}catch(Exception e) {
			return false;
		}

	}


	/**
	 * 
	 * @param toLog What to log during shutdown process...
	 * @return Did this get logged?
	 */
	private Boolean infoPrivate(String toLog) {
		return logExecute(PersistenceRecordType.INFO.recordType + toLog);
	}


	@Override
	public Boolean info(String toLog) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			return logExecute(PersistenceRecordType.INFO.recordType + toLog);
		}

	}


	/**
	 * 
	 * @param toLog The data to log
	 * @param methodName The session method that has called this function
	 * @param logMessageType An enumeration of the message type - Error, Log, Debug
	 * @return Boolean Did the write happen?
	 */
	private Boolean messageSession(String toLog, String methodName, PersistenceRecordType recordType) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			StringBuilder sb = new StringBuilder()
					.append(recordType.recordType.stripLeading())
					.append(Constants.TAB)
					.append("[")
					.append(methodName)
					.append("]")
					.append(Constants.TAB)
					.append(toLog)
					;

			return logExecute(sb.toString());
		}

	}

	@Override
	public Boolean infoSession(String toLog, String methodName) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			return messageSession(toLog, methodName, PersistenceRecordType.INFO);
		}
	}


	@Override
	public Boolean debugSession(String toLog, String methodName) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			return messageSession(toLog, methodName, PersistenceRecordType.DEBUG);
		}
	}


	@Override
	public Boolean errorSession(String toLog, String methodName) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			return messageSession(toLog, methodName, PersistenceRecordType.ERROR);
		}
	}

	@Override
	public Boolean error(String toLog) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			return logExecute(PersistenceRecordType.ERROR.recordType + toLog);
		}


	}



	@Experimental
	@Override
	public Boolean error(String toLog, Exception e) {

		Boolean returnValue = Boolean.FALSE;


		if (this.isShuttingDown.get()) {
			return false;
		}else {

			logExecute(PersistenceRecordType.ERROR.recordType + Constants.BLOCKER);

			returnValue = logExecute(PersistenceRecordType.ERROR.recordType + toLog);

			if (!returnValue) {
				return returnValue;
			}else {


				StackTraceElement[] stackTrace = e.getStackTrace();
				for (StackTraceElement element : stackTrace) {
					returnValue = logExecute(PersistenceRecordType.ERROR.recordType + element.toString());
					if (!returnValue) {return returnValue;}
				}
				logExecute(PersistenceRecordType.ERROR.recordType + Constants.BLOCKER);

				return returnValue;
			}
		}
	}



	@Override
	@Experimental
	public Boolean errorSession(String toLog, String methodName, Exception e) {

		Boolean returnValue = Boolean.FALSE;


		if (this.isShuttingDown.get()) {
			return false;
		}else {

			logExecute(PersistenceRecordType.ERROR.recordType + LibraryFunctions.wrapNameBrackets(methodName) +  Constants.BLOCKER);

			returnValue = logExecute(PersistenceRecordType.ERROR.recordType + LibraryFunctions.wrapNameBrackets(methodName) + toLog);

			if (!returnValue) {
				return returnValue;
			}else {

				StackTraceElement[] stackTrace = e.getStackTrace();
				for (StackTraceElement element : stackTrace) {
					returnValue = logExecute(PersistenceRecordType.ERROR.recordType + element.toString());
					if (!returnValue) {return returnValue;}
				}
				logExecute(PersistenceRecordType.ERROR.recordType + Constants.BLOCKER);

				return returnValue;
			}
		}
	}

	@Override
	public Boolean debug(String toLog) {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			return logExecute(PersistenceRecordType.DEBUG.recordType + toLog);
		}
	}
}