package com.alignmentsystems.library;
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

import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.OrderBookState;
import com.alignmentsystems.library.enumerations.TimestampUsage;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
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


	public static int getPropertyAsInt(ClassLoader cl , String instanceTypeName, ConfigurationProperties configurationProperties) throws FileNotFoundException, NullPointerException{
		String innerValue;

		try {
			innerValue = getProperty(cl, instanceTypeName, configurationProperties);
		} catch (FileNotFoundException | NullPointerException e) {
			throw e;
		}
		int returnValue;


		try {
			returnValue = Integer.parseInt(innerValue);
		} catch (NumberFormatException e) {
			throw e;
		}
		return returnValue;

	}


	/**
	 * 
	 * @param actor
	 * @return
	 */
	public static Properties getProperties(ClassLoader cl , String instanceTypeName) throws FileNotFoundException , NullPointerException{

		InputStream inputStream = null;
		try {			 
			inputStream = cl.getResourceAsStream(instanceTypeName);

		}catch(NullPointerException  e) {
			throw e;
		}catch(Exception e) {
			throw new FileNotFoundException("Configuration not found for " + instanceTypeName);
		}

		if (inputStream==null) {
			throw new FileNotFoundException("Configuration not found for " + instanceTypeName);
		}


		Properties prop = new Properties();

		if (inputStream!=null) {

			try {
				prop.load(inputStream);
			} catch (IOException e) {
				System.err.println(e.getMessage());	
				System.exit(FailureConditionConstants.KAFKA_ERROR_PROPERTIES_FILE);
			}catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
				System.exit(FailureConditionConstants.KAFKA_ERROR_PROPERTIES_FILE);
			}catch (NullPointerException e) {
				System.err.println(e.getMessage());
				System.exit(FailureConditionConstants.KAFKA_ERROR_PROPERTIES_FILE);
			}

			try {
				inputStream.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());	
				System.exit(FailureConditionConstants.KAFKA_ERROR_PROPERTIES_FILE);
			}
		}
		return prop;
	}

	/**
	 * 
	 * @param actor The actor for whom properties are requested
	 * @param configurationProperties The specific property requested
	 * @return The value of the specific property requested
	 */
	public static String getProperty(ClassLoader cl , String instanceTypeName, ConfigurationProperties configurationProperties) throws FileNotFoundException , NullPointerException {
		String targetProperty = null;

		Properties prop;
		try {
			prop = getProperties(cl, instanceTypeName);
		} catch (FileNotFoundException | NullPointerException e) {
			throw e;
		}

		targetProperty = prop.getProperty(configurationProperties.targetProperty);
		
		if (targetProperty!=null) {

			targetProperty = targetProperty.trim();
		}else {
			throw new FileNotFoundException(configurationProperties.targetProperty + " is null");
		}

		return targetProperty;

	}





	/**
	 * 
	 * @param wrapName
	 * @return
	 */
	public static String wrapNameBrackets(String wrapName) {
		return new StringBuilder()
				.append(Constants.SQUAREBRACKETOPEN)
				.append(wrapName)
				.append(Constants.SQUAREBRACKETCLOSE)
				.toString()
				;
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

	/**
	 * 
	 * @param wrapName
	 * @return
	 */
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
	 * @return String The value of the property requested
	 *  This is stored in the configuration file
	 * @throws NullPointerException 
	 * @throws FileNotFoundException 
	 */
	public static String  getLogFileLocation(ClassLoader cl , String instanceTypeName) throws FileNotFoundException, NullPointerException {
		String targetProperty = null;

		try {
			targetProperty = getProperty(cl, instanceTypeName, ConfigurationProperties.LOGFILEDIRECTORY);
		} catch (FileNotFoundException | NullPointerException e) {
			throw e;
		}

		return targetProperty;
	}

	/**
	 * 
	 * @return String The value of the property requested
	 */
	public static String  getFileNameSuffix(ClassLoader cl , String instanceTypeName)  throws FileNotFoundException, NullPointerException{
		String targetProperty = null;

		try {
			targetProperty = getProperty(cl, instanceTypeName, ConfigurationProperties.LOGFILENAMESUFFIX);
		} catch (FileNotFoundException | NullPointerException e) {
			throw e;
		}

		return targetProperty;
	}



	/**
	 * 
	 * @param rawMessageLogFileDirectory - this should be something like /dir/dir/logs
	 * @param tag - this is something meaningful to the reader - say the caller class name or similar. Null will be replaced with an empty string. No dashes allowed
	 * @param filenameSuffix - this should be something like "name.log" No dashes allowed
	 * @return something like /dir/dir/logs/2023_08_31__08.00.06.743+0000-debug-Alignment.log
	 * @throws FileNotFoundException
	 */
	public static String getFileNameToUseForPersistence(String rawMessageLogFileDirectory, String tag, String filenameSuffix) throws FileNotFoundException{
		String fileNameDateTimePartToUse = null;
		final OffsetDateTime runTime = OffsetDateTime.now(Constants.HERE);

		//log.info(runTime.toString());
		String dateTimeOffsetString = null;
		String cleanedTag;
		String cleanedFilenameSuffix;

		if(tag==null) {
			cleanedTag = Constants.EMPTYSTRING;
		}else {
			cleanedTag = tag.replace(Constants.DASH , Constants.EMPTYSTRING);	
		}


		if(filenameSuffix==null) {
			throw new FileNotFoundException("filename_suffix cannot be null");
		}

		cleanedFilenameSuffix = filenameSuffix.replace(Constants.DASH , Constants.EMPTYSTRING);


		//https://stackoverflow.com/questions/473282/how-can-i-pad-an-integer-with-zeros-on-the-left

		if (Constants.HERE.getId()=="Z") {
			dateTimeOffsetString ="+0000";			
		}else {
			String offset = runTime.getOffset().toString();
			dateTimeOffsetString = offset.substring(offset.lastIndexOf("+")+1);
			dateTimeOffsetString = dateTimeOffsetString.replace(":", "");	
			dateTimeOffsetString = new DecimalFormat("0000").format(Integer.decode(dateTimeOffsetString));
			dateTimeOffsetString = "+" + dateTimeOffsetString;
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

		StringBuilder sb = new StringBuilder()
				.append(fileNameDateTimePartToUse)
				.append(dateTimeOffsetString)
				;

		if (cleanedTag.length()!=0) {
			sb.append(Constants.DASH);
			sb.append(cleanedTag);
		}

		sb.append(Constants.DASH);
		sb.append(cleanedFilenameSuffix);		

		return Paths.get(rawMessageLogFileDirectory, sb.toString()).toString();				
	}

	/**
	 * 
	 * @param runTime the OffsetDateTime that is to be used to return the clean string
	 * @param usage Enumeration - is this to go in a log file or a log filename?
	 * @return String The formatted string
	 */
	public static String getUTCTimestamp(OffsetDateTime runTime, TimestampUsage usage) {

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
			.append(String.format("%02d", runTime.getHour() ))
			.append(Constants.FULLSTOP)
			.append(String.format("%02d", runTime.getMinute()))
			.append(Constants.FULLSTOP)
			.append(String.format("%02d", runTime.getSecond() ))
			.append(Constants.FULLSTOP)
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
	public static void threadStatusCheck(Thread thread, Logger log) {

		String statusMessage  = new StringBuilder()
				.append(thread.getName())
				.append(Constants.SPACE)
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

	public final static String getVersionWithTitle(Class<?> classVersionToTest) {
		final String version = "Version=";
		final String codeValue = getVersion(classVersionToTest);
		StringBuilder sb = new StringBuilder().append(version).append(codeValue);
		return sb.toString();

	}


	/**
	 * 
	 * @param classVersionToTest Class to check
	 * @return String The version extracted from the jar file.
	 */
	public final static String getVersion(Class<?> classVersionToTest) {
		String retVal = "n/a";
		final String className = classVersionToTest.getSimpleName() + ".class";
		final String classPath = classVersionToTest.getResource(className).toString();
		if (!classPath.startsWith("jar")) {
			// Class not from JAR
			return null;
		}
		final String manifestPath = classPath.substring(0, classPath.lastIndexOf("!") + 1) + 
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



	/**
	 * 	-DActor=javaloader 			 
	 * @param args
	 * @return
	 */
	public final static InstanceType getInstanceActor(String... args){
		InstanceType returnValue = InstanceType.UNKNOWN;

		for (String item : args) {

			if(item.compareToIgnoreCase("/help")==0) {
				showHelp();
				System.exit(0);
			}
			if(item.compareToIgnoreCase("/h")==0) {
				showHelp();
				System.exit(0);
			}
			if(item.compareToIgnoreCase("/?")==0) {
				showHelp();
				System.exit(0);
			}

			if (item.startsWith(Constants.COMMANDDELIMITER)){
				item = item.replace(Constants.COMMANDDELIMITER, "");		
				if (item.equalsIgnoreCase(InstanceType.FIXMESSAGINGINFRA.toString())){
					returnValue = InstanceType.FIXMESSAGINGINFRA;
				} else if (item.equalsIgnoreCase(InstanceType.ORDERBOOK.toString())){
					returnValue = InstanceType.ORDERBOOK;
				} else if (item.equalsIgnoreCase(InstanceType.MEMBERA.toString())){
					returnValue = InstanceType.MEMBERA;
				} else if (item.equalsIgnoreCase(InstanceType.MEMBERB.toString())){
					returnValue = InstanceType.MEMBERB;
				}else{
					//We have an unknown parameter...
					returnValue = InstanceType.UNKNOWN;
				}
			}
		}
		return returnValue;
	}




	private static void showHelp() {
		System.out.println("Help will go here..");
		System.out.println(getVersionWithTitle(LibraryFunctions.class));
		for (InstanceType it : InstanceType.values()) {
			System.out.println(it.type + " is creatable=" + it.creatable);
			if (it.creatable) {
				System.out.println("Call with command line = " + Constants.COMMANDDELIMITER + it.type);
			}
			if (it.isDefault) {
				System.out.println("Empty command line will be identical to " + Constants.COMMANDDELIMITER + it.type);
			}
		}


	}
}