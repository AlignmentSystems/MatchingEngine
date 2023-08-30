package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	30th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	PersistenceToFileServer
 *	Description		:
 *****************************************************************************/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.OffsetDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.PersistenceRecordType;
import com.alignmentsystems.matching.enumerations.TimestampUsage;
import com.alignmentsystems.matching.interfaces.InterfaceInitialisePersistenceServer;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfacePersistenceServer;
import com.alignmentsystems.matching.library.LibraryFunctions;


/**
 * ToFlatFile - write from the logger queue to a flat text file that is human readable
 * @author John Greenan john.greenan@alignment-systems.com
 */
class PersistenceToFileServer implements Runnable , InterfacePersistenceServer, InterfaceInitialisePersistenceServer{
	private ConcurrentLinkedQueue<String> logQueue = null;
	private final static String CLASSNAME = PersistenceToFileServer.class.getSimpleName().toString();
	private String fullPathAndFileNameToUse = null;
	private Boolean runOnce=Boolean.TRUE;
	private int nanoSleep = 0;
	private Path pathForLogFile = null;
	private String tag = null;
	private Long logFileSequenceNumber = 0L;
	private final AtomicBoolean running = new AtomicBoolean(false);
	//http://www.asciitable.com/


	
	/**
	 * 
	 * @param sequencedPersistence The queue from which messages are polled
	 * @param fullPathAndFileNameToUse The file to use
	 * @param tag A tag to cover the name in the log file
	 * @param NanoSleep Sleep interval in nanoseconds
	 */
	@Override
	public boolean initialise(ConcurrentLinkedQueue<String> sequencedPersistence, String fullPathAndFileNameToUse, String tag,
			int NanoSleep) {
		this.logQueue = sequencedPersistence;
		this.fullPathAndFileNameToUse = fullPathAndFileNameToUse;
		this.tag = tag;
		this.nanoSleep = NanoSleep;
		return true;
	}


	
	
	/**
	 * Here it would be possible to be a bit cuter and implement a pattern of
	 * write to the file until the number of bytes is equal to or greater than a constant
	 * at which point create a "next" log file....
	 * first file is called whatever.log
	 * second file is called whatever-1.log
	 * and so on...
	 * Also, if being super uptight then check and see if the inc++ causes an overflow
	 * And throw something into the log file and start again at 1...
	 */
	@Override
	public void run() {
		StringBuilder sb = new StringBuilder();
		running.set(true);

		if (runOnce) {
			

			try {
				sb.append(PersistenceRecordType.INFO.recordType)
				.append(CLASSNAME)
				.append(" for ")
				.append(this.tag.toUpperCase())
				.append(" Started as=[")
				.append(Thread.currentThread().getName().toString())
				.append("]")
				;
				logQueue.add(sb.toString());
			} catch (NullPointerException e) {
				StringBuilder sb2 = new StringBuilder()
						.append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage())
						;
				System.err.println(sb2.toString());
			}
			runOnce=false;
		}

		//Get the big string out of the queue and then write to disk...
		String body = null;

		StandardOpenOption option = null;

		try {
			pathForLogFile = Paths.get(fullPathAndFileNameToUse);
		} catch (InvalidPathException  e) {
			StringBuilder sb3 = new StringBuilder()
					.append(CLASSNAME)
					.append(Constants.SPACE)
					.append(e.getMessage())
					;
			System.err.println(sb3.toString());

		}

		boolean alreadyExists = Boolean.TRUE;

		try {
			alreadyExists = Files.exists(pathForLogFile,new LinkOption[] {LinkOption.NOFOLLOW_LINKS});
		} catch (SecurityException e) {
			StringBuilder sb4 = new StringBuilder()
					.append(CLASSNAME)
					.append(Constants.SPACE)
					.append(e.getMessage())
					;
			System.err.println(sb4.toString());
		}


		

		if (alreadyExists) {
			option = StandardOpenOption.APPEND;
		}else {
			option = StandardOpenOption.CREATE;
		}


		while (running.get()){
			body = logQueue.poll();

			if(body!=null) {

				//
				// Here we need to take the body and then make it look nicer.  Need to have a think, but something with the timestamp and then the payload would make sense.
				//

				try {
					logFileSequenceNumber = Math.addExact(logFileSequenceNumber, 1L);
				} catch (ArithmeticException e) {
					StringBuilder sb5 = new StringBuilder()
							.append(CLASSNAME)
							.append(Constants.SPACE)
							.append(e.getMessage())
							;
					System.err.println(sb5.toString());
					logFileSequenceNumber=1L;
				}

				String toWrite = getFormattedMessage(logFileSequenceNumber, body);

				try {
					writeLine( toWrite , option);
					option = StandardOpenOption.APPEND;
				} catch (IOException e) {
					StringBuilder sb6 = new StringBuilder()
							.append(CLASSNAME)
							.append(Constants.SPACE)
							.append(toWrite)
							.append(Constants.SPACE)
							.append(e.getMessage())
							;
					System.err.println(sb6.toString());

				}

			}

			try {
				Thread.currentThread();
				Thread.sleep(0L,nanoSleep);
			}catch(InterruptedException e){
				running.set(false);
				Thread.currentThread().interrupt();
				System.err.println(e.getMessage());
				StringBuilder sb7 = new StringBuilder()
						.append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage())
						;
				System.err.println(sb7.toString());
				
				try {
					writeLine( "Interrupted, goodbye,,,", option);
				} catch (IOException e1) {
					StringBuilder sb8 = new StringBuilder()
							.append(this.getClass().getSimpleName().toString())
							.append(Constants.SPACE)
							.append(e1.getMessage())
							;
					System.err.println(sb8.toString());
				}				
			}			 	
		}
	}


	/***
	 * 
	 * @param messageSequenceNumber The message sequence number to show in the log file...
	 * @param messageBody What to put in the log file
	 * @return A nicely formatted string
	 */
	private String getFormattedMessage(Long messageSequenceNumber, String messageBody) {

		StringBuilder sb = new StringBuilder()
				.append(LibraryFunctions.getUTCTimestamp( OffsetDateTime.now(Constants.HERE), TimestampUsage.INFILE))
				.append(Constants.TAB)
				.append("[")
				.append(messageSequenceNumber.toString())
				.append("]")
				.append(Constants.TAB) 
				.append(messageBody);

		return sb.toString();
	}

	


	/***
	 * 
	 * @param toWrite String The string to write to the file
	 */
	@Override
	public void writeLineAtClose(String toWrite)  {

		byte[] toWriteB =  toWrite.getBytes(Constants.CHARSET);

		try {
			Files.write(this.pathForLogFile, toWriteB , StandardOpenOption.APPEND);			
			Files.write(this.pathForLogFile, Constants.LINESEPARATORBYTES, StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
	/***
	 * 
	 * @param toWrite String The string to write to the file
	 * @param option OpenOption The OpenOption to use for the write
	 * @throws IOException Exception caught and thrown
	 */
	private void writeLine(String toWrite, OpenOption option) throws IOException {

		byte[] toWriteB =  toWrite.getBytes(Constants.CHARSET);

		try {
			Files.write(this.pathForLogFile, toWriteB , option);			
			Files.write(this.pathForLogFile, Constants.LINESEPARATORBYTES, StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			throw e;
		}
	}
}