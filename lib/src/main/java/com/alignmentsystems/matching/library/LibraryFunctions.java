package com.alignmentsystems.matching.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LibraryFunctions
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.slf4j.Logger;

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.App;
import com.alignmentsystems.matching.ApplicationFIXEngine;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.constants.FailureConditionConstants;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.ConfigurationProperties;
import com.alignmentsystems.matching.enumerations.OrderBookSide;
import com.alignmentsystems.matching.enumerations.OrderBookState;
import com.alignmentsystems.matching.enumerations.TimestampUsage;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.Initiator;
import quickfix.RuntimeError;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.ThreadedSocketInitiator;


/***
 * Some functions shared over the different classes
 * @author John Greenan john.greenan@alignment-systems.com
 */
public class LibraryFunctions {

	
	
	/**
	 * 
	 * @param bookStateInt
	 * @param stateToAccumulate
	 * @return
	 */
	public static OrderBookState updateOrderBookState(OrderBookState oldState, OrderBookState stateToAccumulate) {
		
		OrderBookState internalOrderBookState;
		int bookStateInt = oldState.getStateInt(); 
		int stateToAccum = stateToAccumulate.getStateInt();
		
		switch (stateToAccum) {
		case -1:
			bookStateInt = stateToAccum;
			break;
		case 0:
			bookStateInt = stateToAccum;
			break;
		case 6:
			bookStateInt = stateToAccum;
			break;
		default:
			bookStateInt = bookStateInt + stateToAccum;
		}

		switch (bookStateInt) {
		case 0:
			internalOrderBookState =  OrderBookState.EMPTY;			
			break;
		case 2:
			internalOrderBookState = OrderBookState.BUYSIDE;
			break;
		case 4:	
			internalOrderBookState = OrderBookState.SELLSIDE;
			break;
		case 6:	
			internalOrderBookState = OrderBookState.TWOSIDED;
			break;
		default:
			internalOrderBookState = OrderBookState.ERROR;	
		}
		
		return internalOrderBookState;
	}

	
	
	
	
	/**
	 * 
	 * @param configFile
	 * @param engine
	 * @return
	 * @throws NullPointerException
	 */
	public static Acceptor getExchangeEnvironment(String configFile, ApplicationFIXEngine engine) throws NullPointerException {


		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(configFile);	

		if (inputStream==null) {
			throw new NullPointerException("No valid config file at " + configFile);
		}

		SocketAcceptor acceptor = null;

		try {
			SessionSettings settings = new SessionSettings(inputStream);
			//FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileStoreFactory messageStoreFactory = new FileStoreFactory(settings);
			MessageFactory messageFactory = new MessageFactory();
			FileLogFactory logFactory = new FileLogFactory(settings);

			acceptor = new SocketAcceptor(engine, messageStoreFactory, settings, logFactory,messageFactory);

			acceptor.start();

		} catch (ConfigError e) {			
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES);
		} catch (RuntimeError e) {		
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_APPLICATION);
		}

		try {
			inputStream.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES_FILE);
		}
		return acceptor;
	}


	/**
	 * 
	 * @param configFile
	 * @param engine
	 * @return Initiator
	 * @throws NullPointerException
	 */
	public static Initiator getMemberEnvironment(String configFile, ApplicationFIXEngine engine) throws NullPointerException  {
		Initiator member = null;

		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(configFile);	

		if (inputStream==null) {
			throw new NullPointerException("No valid config file at " + configFile);
		}

		try {
			SessionSettings settings = new SessionSettings(inputStream);
			FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileLogFactory logFactory = new FileLogFactory(settings);
			MessageFactory messageFactory = new MessageFactory();

			member = new ThreadedSocketInitiator(engine, storeFactory, settings, logFactory, messageFactory);

		} catch (ConfigError e) {			
			System.err.println(e.getMessage());			
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES);
		}

		try {
			member.start();
		} catch (RuntimeError e) {			
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_APPLICATION);
		} catch (ConfigError e) {			
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES);
		}
		try {
			inputStream.close();
		} catch (IOException e) {

			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);
		}


		return member;
	}




//	/**
//	 * 
//	 * @param nos
//	 * @return
//	 */
//	public static OrderBookSide getOrderBookSide(InterfaceOrder nos) {
//		if(Character.compare(nos.getOrderSide().getValue(), Side.BUY)==0)   {
//			return OrderBookSide.BUY; 
//		}else {
//			return OrderBookSide.SELL;
//		}			
//	}






	/**
	 * 
	 * @param message Message
	 */
	//	protected static void  addLogonField(Message message) {
	//
	//		String passwordFromPropertiesFile = getProperty(ThreeSixtyTProperties.PASSWORD);
	//		String usernameFromPropertiesFile = getProperty(ThreeSixtyTProperties.USERNAME);
	//
	//		Password password = new quickfix.field.Password(passwordFromPropertiesFile);
	//		Username username = new quickfix.field.Username(usernameFromPropertiesFile);
	//
	//		message.getHeader().setField(password);
	//		message.getHeader().setField(username);
	//	}



	
	/**
	 * 
	 * @param actor The actor for whom properties are requested
	 * @param configurationProperties The specific property requested
	 * @return The value of the specific property requested
	 */
	protected static String getProperty(Actors actor, ConfigurationProperties configurationProperties) {
		String targetProperty = null;

		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(actor.targetActor);

		Properties prop = new Properties();

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			System.err.println(e.getMessage());	
			System.exit(0);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

		try {
			targetProperty = prop.getProperty(configurationProperties.targetProperty).trim();			
			inputStream.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

		return targetProperty;

	}












	/**
	 * 
	 * @param methodName The methodname to wrap
	 * @return Prettified method name wrapped in space, open square bracket and close square bracket, space.
	 */
	public static String wrapNameSquareBrackets(String wrapName) {
		return new StringBuilder()
				.append(Constants.SQUAREBRACKETOPEN)
				.append(wrapName)
				.append(Constants.SQUAREBRACKETCLOSE)
				.toString()
				;

	}


	public static String wrapNameSquareBracketsAndSpaces(String wrapName) {
		return new StringBuilder()
				.append(Constants.SPACE)
				.append(wrapNameSquareBrackets(wrapName))
				.append(Constants.SPACE)
				.toString()
				;		
	}




	/**
	 * 
	 * @param rawMessageLogFileDirectory String
	 * @param filename_suffix String
	 * @return String FileNameToUseForPersistence
	 * @throws FileNotFoundException if the log file directory does not exist...
	 */
	protected static String getFileNameToUseForPersistence(String rawMessageLogFileDirectory, String filename_suffix) throws FileNotFoundException{
		String fileNameDateTimePartToUse = null;
		final OffsetDateTime runTime = OffsetDateTime.now(Constants.HERE);

		//log.info(runTime.toString());
		String suffix = null;

		//https://stackoverflow.com/questions/473282/how-can-i-pad-an-integer-with-zeros-on-the-left

		if (Constants.HERE.getId()=="Z") {
			suffix ="+0000";			
		}else {
			String offset = runTime.getOffset().toString();
			suffix = offset.substring(offset.lastIndexOf("+")+1);
			suffix = suffix.replace(":", "");	
			suffix = new DecimalFormat("0000").format(Integer.decode(suffix));
			suffix = "+" + suffix;
		}

		fileNameDateTimePartToUse = getUTCTimestamp(runTime , TimestampUsage.FILENAME); 
		//Does rawMessageLogFileDirectory exist?
		Path path = Paths.get(rawMessageLogFileDirectory);
		if (Files.exists(path)) {
			//Folder exists...
		}else {
			//Folder does not exist
			throw new FileNotFoundException(path.toString() + " does not exist: create it and try again");
		}
		return Paths.get(rawMessageLogFileDirectory, (fileNameDateTimePartToUse + suffix + filename_suffix)).toString();				
	}

	/**
	 * 
	 * @param runTime the OffsetDateTime that is to be used to return the clean string
	 * @param usage Enumeration - is this to go in a log file or a log filename?
	 * @return String The formatted string
	 */
	protected static String getUTCTimestamp(OffsetDateTime runTime, TimestampUsage usage) {

		StringBuilder sb = new StringBuilder();

		switch(usage) {
		case FILENAME:

			sb.append(String.valueOf(runTime.getYear()))
			.append(Constants.UNDERSCORE)
			.append(String.format("%02d", runTime.getMonthValue()))
			.append(Constants.UNDERSCORE)
			.append(String.format("%02d", runTime.getDayOfMonth()))
			.append(Constants.UNDERSCORE)
			.append(Constants.UNDERSCORE)
			.append(Constants.UNDERSCORE)
			.append(String.format("%02d", runTime.getHour() ))
			.append(Constants.SEMICOLON)
			.append(String.format("%02d", runTime.getMinute()))
			.append(Constants.SEMICOLON)
			.append(String.format("%02d", runTime.getSecond() ))
			.append(Constants.SEMICOLON)
			.append(String.format("%09d", runTime.getNano()).substring(0,3)) ;
			return sb.toString();
		case INFILE:

			sb.append(String.valueOf(runTime.getYear()))
			.append(Constants.DASH)
			.append(String.format("%02d", runTime.getMonthValue()))
			.append(Constants.DASH)
			.append(String.format("%02d", runTime.getDayOfMonth()))
			.append(Constants.LETTER_T)
			.append(String.format("%02d", runTime.getHour() ))
			.append(Constants.COLON)
			.append(String.format("%02d", runTime.getMinute()))
			.append(Constants.COLON)
			.append(String.format("%02d", runTime.getSecond() ))
			.append(Constants.FULLSTOP)
			.append(String.format("%09d", runTime.getNano()).substring(0,3))
			.append(Constants.LETTER_Z);
			return sb.toString();
		default:
			return null;			
		}
	}


	/**
	 * 
	 * @param thread The Thread to check
	 * @param log The log file to which to write
	 */
	protected static void threadStatusCheck(Thread thread, Logger log) {

		String statusMessage  = new StringBuilder()
				.append(thread.getClass().getSimpleName().toString())
				.append(" is alive?=")
				.append(Boolean.toString(thread.isAlive()).toUpperCase())
				.toString()
				;

		if (thread.isAlive()){
			log.info(statusMessage);
		}else {
			log.error(statusMessage);
		}

	}







	/**
	 * Writes up the System.getProperties() data into a human readable format in the log file
	 * smart enough to avoid using the li
	 * @param log The log file to which to write
	 */
	protected static void showSystemProperties(Logger log) {
		final String libraryPath = "java.library.path";
		final String classPath = "java.class.path";

		String stringToLog=null;

		Properties sysProps = System.getProperties();
		Set<Object> keySet = sysProps.keySet();
		log.info(Constants.BLOCKER);
		log.info(Constants.LEADER +  "System Properties" + Constants.TRAILER);

		for (Object obj:keySet) {
			if (obj.toString().equalsIgnoreCase(Constants.LINESEPARATORSTRING)) {
				byte[] asciiOfLineSeparator = System.getProperty(obj.toString()).getBytes();
				String asciiString = Arrays.toString(asciiOfLineSeparator);
				stringToLog = obj.toString() + "=[ASCII character code(s)]=" + asciiString;
				log.info(stringToLog);
			}else if(obj.toString().equalsIgnoreCase(classPath))  {

				String[] array = (System.getProperty(obj.toString())).split(Constants.SEMICOLON);
				int i;
				for (i = 0; i < array.length; i++) {
					log.info(obj.toString() +  "[" + Integer.toString(i+1) + "]" + Constants.EQUALS + array[i].toString());
				}




			}else if(obj.toString().equalsIgnoreCase(libraryPath))  {

				String[] array = (System.getProperty(obj.toString())).split(Constants.SEMICOLON);
				int i;
				for (i = 0; i < array.length; i++) {
					log.info(obj.toString() +  "[" + Integer.toString(i+1) + "]" + Constants.EQUALS + array[i].toString());
				}

			}else {
				stringToLog=obj.toString() + "=" + System.getProperty(obj.toString());
				log.info(stringToLog);
			}
		}
		log.info(Constants.BLOCKER);

	}

	/**
	 * 
	 * @param classVersionToTest Class to check
	 * @return String The version extracted from the jar file.
	 */
	protected final static String getVersion(Class<?> classVersionToTest) {
		String retVal = "n/a";
		String className = classVersionToTest.getSimpleName() + ".class";
		String classPath = classVersionToTest.getResource(className).toString();
		if (!classPath.startsWith("jar")) {
			// Class not from JAR
			return null;
		}
		String manifestPath = classPath.substring(0, classPath.lastIndexOf("!") + 1) + 
				"/META-INF/MANIFEST.MF";
		Manifest manifest;


		try {
			manifest = new Manifest(new URL(manifestPath).openStream());
			Attributes attr = manifest.getMainAttributes();
			retVal = attr.getValue("Version");
		} catch (IOException e) {
			//log.error(e.toString(),e);
		}
		return retVal;
	}
}