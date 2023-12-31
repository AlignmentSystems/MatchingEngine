package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	30th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentPersistenceToFileClient
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.library.annotations.Experimental;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.RecordType;
import com.alignmentsystems.library.exceptions.LogMessageIsNull;
import com.alignmentsystems.library.interfaces.InterfacePersistenceClient;
import com.alignmentsystems.library.interfaces.InterfacePersistenceServer;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentPersistenceToFileClient implements InterfacePersistenceClient{
	private ConcurrentLinkedQueue<String> logQueue = new ConcurrentLinkedQueue<String>();
	private final static int MILLISLEEP = 200;
	private AtomicBoolean hasExecutedInit = new AtomicBoolean(false);
	private Thread logger = null;
	private String fullPathAndFileNameToUse  = null;
	private String tag = null;
	private AtomicBoolean isShuttingDown = new AtomicBoolean(false);



	@Override
	public boolean initialise(ClassLoader cl , String instanceTypeName) throws FileNotFoundException, IllegalThreadStateException, IOException {
		if(hasExecutedInit.get()) {
		}else {
	
			AlignmentPersistenceToFileServer persistenceToFileServer = new AlignmentPersistenceToFileServer();
			try {
				persistenceToFileServer.initialise(cl, this.logQueue, instanceTypeName, AlignmentPersistenceToFileClient.MILLISLEEP);
			} catch (FileNotFoundException e) {				
				throw e;
			} catch (IOException e) {
				throw e;
			}
			this.fullPathAndFileNameToUse = persistenceToFileServer.getFileNameAndPathUsed();

			this.logger = new Thread(persistenceToFileServer);

			try {
				this.logger.start();
			} catch (IllegalThreadStateException e) {
				throw e;
			}
			if (tag!=null) {
				this.logger.setName(tag);
			}

			hasExecutedInit.set(Boolean.TRUE);
		}
		return hasExecutedInit.get(); 
	}


	@Override
	public boolean initialise(ClassLoader cl , String instanceTypeName, String tag) throws FileNotFoundException, IllegalThreadStateException , IOException {

		if(hasExecutedInit.get()) {
		}else {

			this.tag = tag;

			AlignmentPersistenceToFileServer persistenceToFileServer = new AlignmentPersistenceToFileServer();
			try {
				persistenceToFileServer.initialise(cl, this.logQueue, instanceTypeName, this.tag, AlignmentPersistenceToFileClient.MILLISLEEP);
			} catch (IOException e) {
				throw e;
			}
			this.fullPathAndFileNameToUse = persistenceToFileServer.getFileNameAndPathUsed();

			logger = new Thread(persistenceToFileServer);

			try {
				this.logger.start();
			} catch (IllegalThreadStateException e) {
				throw e;
			}
			this.logger.setName(tag);

			hasExecutedInit.set(Boolean.TRUE);
		}
		return hasExecutedInit.get(); 
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
		final long shortSleep = 100L;
		final long longSleep = 500L;
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
	public String getFullPathAndFileNameInUse() {
		if(hasExecutedInit.get()) {
			return this.fullPathAndFileNameToUse;
		}else {
			return null;
		}
	}


	/**
	 * 
	 * @param toLog The text to log that has been formatted, sequencenumber added and message type added
	 * @return Boolean
	 */
	private Boolean logExecute(String toLog) {
			return logQueue.add(toLog);
	}


	/**
	 * 
	 * @param toLog What to log during shutdown process...
	 * @return Did this get logged?
	 */
	private Boolean infoPrivate(String toLog) {
		return logExecute(new StringBuilder().append(RecordType.INFO.recordType).append(toLog).toString());
	}


	@Override
	public Boolean info(String toLog) throws LogMessageIsNull {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			cleanLogMessage(toLog);
			return logExecute(new StringBuilder().append(RecordType.INFO.recordType).append(toLog).toString());
		}

	}


	/**
	 * 
	 * @param toLog The data to log
	 * @param methodName The session method that has called this function
	 * @param logMessageType An enumeration of the message type - Error, Log, Debug
	 * @return Boolean Did the write happen?
	 */
	private Boolean messageSession(String toLog, String methodName, RecordType recordType) {
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
	public Boolean infoSession(String toLog, String methodName) throws LogMessageIsNull{
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			cleanLogMessage(toLog);
			return messageSession(toLog, methodName, RecordType.INFO);
		}
	}


	@Override
	public Boolean debugSession(String toLog, String methodName)throws LogMessageIsNull {
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			cleanLogMessage(toLog);
			return messageSession(toLog, methodName, RecordType.DEBUG);
		}
	}


	@Override
	public Boolean errorSession(String toLog, String methodName) throws LogMessageIsNull {
		if (this.isShuttingDown.get()) {
			return false;
		}else {	
			cleanLogMessage(toLog);
			return messageSession(toLog, methodName, RecordType.ERROR);
		}
	}

	@Override
	public Boolean error(String toLog) throws LogMessageIsNull {
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			cleanLogMessage(toLog);
			return logExecute(new StringBuilder().append( RecordType.ERROR.recordType).append(toLog).toString());
		}
	}



	@Experimental
	@Override
	public Boolean error(String toLog, Throwable t) throws LogMessageIsNull{

		Boolean returnValue = Boolean.FALSE;


		if (this.isShuttingDown.get()) {
			return false;
		}else {
			cleanLogMessage(toLog);
			logExecute(new StringBuilder().append(RecordType.ERROR.recordType).append(Constants.BLOCKER).toString());

			final String blocker = new StringBuilder().append(RecordType.ERROR.recordType).append(toLog).toString();
			returnValue = logExecute(blocker );

			if (!returnValue) {
				return returnValue;
			}else {


				StackTraceElement[] stackTrace = t.getStackTrace();
				for (StackTraceElement element : stackTrace) {
					returnValue = logExecute(new StringBuilder().append(RecordType.ERROR.recordType).append(element.toString()).toString());
				}
				returnValue = logExecute(blocker );
			}
			return returnValue;
		}
	}



	@Override
	@Experimental
	public Boolean errorSession(String toLog, String methodName, Throwable t) throws LogMessageIsNull {

		Boolean returnValue = Boolean.FALSE;


		if (this.isShuttingDown.get()) {
			return false;
		}else {
			cleanLogMessage(toLog);
			logExecute(RecordType.ERROR.recordType + AlignmentFunctions.wrapNameBrackets(methodName) +  Constants.BLOCKER);

			returnValue = logExecute(RecordType.ERROR.recordType + AlignmentFunctions.wrapNameBrackets(methodName) + toLog);

			if (!returnValue) {
				return returnValue;
			}else {

				StackTraceElement[] stackTrace = t.getStackTrace();
				for (StackTraceElement element : stackTrace) {
					returnValue = logExecute(RecordType.ERROR.recordType + element.toString());
					if (!returnValue) {return returnValue;}
				}
				logExecute(RecordType.ERROR.recordType + Constants.BLOCKER);

				return returnValue;
			}
		}
	}

	@Override
	public Boolean debug(String toLog) throws LogMessageIsNull{
		if (this.isShuttingDown.get()) {
			return false;
		}else {
			cleanLogMessage(toLog);
			return logExecute(RecordType.DEBUG.recordType + toLog);
		}
	}

	/**
	 * 
	 * @param toLog The message that is to be written to the log file
	 * @throws LogMessageIsNull if the toLog is null
	 */
	private void cleanLogMessage(String toLog) throws LogMessageIsNull{
		if (toLog==null) {
			throw new LogMessageIsNull();
		}
	}

}