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

import java.io.FileNotFoundException;
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
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.PersistenceRecordType;
import com.alignmentsystems.matching.enumerations.TimestampUsage;
import com.alignmentsystems.matching.interfaces.InterfacePersistenceServer;
import com.alignmentsystems.matching.library.LibraryFunctions;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
class PersistenceToFileServer implements Runnable , InterfacePersistenceServer{
	private ConcurrentLinkedQueue<String> logQueue = null;
	private final static String CLASSNAME = PersistenceToFileServer.class.getSimpleName().toString();
	private String fullPathAndFileNameToUse = null;
	private int milliSleep = 0;
	private Path pathForLogFile = null;
	private String tag = null;
	private Long logFileSequenceNumber = 0L;
	private AtomicBoolean running = new AtomicBoolean(false);
	//http://www.asciitable.com/

	@Override
	public boolean initialise(ConcurrentLinkedQueue<String> queue, Actors actor, String tag,
			int milliSleep) throws FileNotFoundException, IOException {

		this.logQueue = queue;
		this.tag = tag;

		final String logFileDirectory = LibraryFunctions.getLogFileLocation(actor);
		final String filenameSuffix = LibraryFunctions.getFileNameSuffix(actor);

		this.fullPathAndFileNameToUse = LibraryFunctions.getFileNameToUseForPersistence(logFileDirectory , tag , filenameSuffix);
		this.milliSleep = milliSleep;
		StandardOpenOption option = getOpenOption();
		String toWrite = getFormattedMessage(fullPathAndFileNameToUse);
		writeLine( toWrite , option);
		
		
		return true;
	}

	@Override
	public boolean initialise(ConcurrentLinkedQueue<String> queue, Actors actor, int milliSleep)
			throws FileNotFoundException, IOException {
		
		this.logQueue = queue;
		
		final String logFileDirectory = LibraryFunctions.getLogFileLocation(actor);
		final String filenameSuffix = LibraryFunctions.getFileNameSuffix(actor);

		this.fullPathAndFileNameToUse = LibraryFunctions.getFileNameToUseForPersistence(logFileDirectory , null , filenameSuffix);
		this.milliSleep = milliSleep;
		
		StandardOpenOption option = getOpenOption();
		String toWrite = getFormattedMessage(fullPathAndFileNameToUse);
		writeLine( toWrite , option);
		
		return true;
	}


	private void runOnce() {
		String cleanedTag = null;
		if (this.tag==null) {
			cleanedTag = "no tag";
		} else {
			cleanedTag = this.tag.toUpperCase();
		}
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(PersistenceRecordType.INFO.recordType)
			.append(CLASSNAME)
			.append(" for ")
			.append(cleanedTag)
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

		if(!running.get()) {
			//runOnce();
			running.set(true);
		}
		StandardOpenOption option = null;

		//Get the big string out of the queue and then write to disk...
		String body = null;


		while (running.get()){
			body = logQueue.poll();

			if(body!=null) {

				//
				// Here we need to take the body and then make it look nicer.  Need to have a think, but something with the timestamp and then the payload would make sense.
				//
			
				String toWrite = getFormattedMessage(body);
				option = getOpenOption();

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
				Thread.sleep(milliSleep);
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


	private StandardOpenOption getOpenOption() {

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
		return option;
	}




	/***
	 * 
	 * @param messageSequenceNumber The message sequence number to show in the log file...
	 * @param messageBody What to put in the log file
	 * @return A nicely formatted string
	 */
	private String getFormattedMessage(String messageBody) {

		try {
			logFileSequenceNumber = Math.addExact(logFileSequenceNumber, 1L);
		} catch (ArithmeticException e) {
			StringBuilder sb5 = new StringBuilder()
					.append(CLASSNAME)
					.append(Constants.SPACE)
					.append(e.getMessage())
					;
			System.err.println(sb5.toString());
			logFileSequenceNumber = 1L;
		}
		
		StringBuilder sb = new StringBuilder()
				.append(LibraryFunctions.getUTCTimestamp( OffsetDateTime.now(Constants.HERE), TimestampUsage.INFILE))
				.append(Constants.TAB)
				.append("[")
				.append(logFileSequenceNumber.toString())
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

	@Override
	public String getFileNameAndPathUsed() {
		return this.fullPathAndFileNameToUse;
	}
}