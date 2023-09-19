package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentLogEncapsulation
 *	Description		:
 *****************************************************************************/

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.MessageDirection;
import com.alignmentsystems.library.enumerations.OperationEventType;
import com.alignmentsystems.library.interfaces.InterfaceCustomLoggerMessage;
import com.alignmentsystems.library.interfaces.InterfaceMatch;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentLogEncapsulation implements Logger , InterfaceCustomLoggerMessage {
	private Logger innerLog = null;
	final static String LIBRARYPATH = "java.library.path";
	final static String CLASSPATH = "java.class.path";
	final static String PATHSEPERATOR = "path.separator";


	/**
	 * 
	 * @param clazz
	 */
	public AlignmentLogEncapsulation(Class<?> clazz) {
		super();
		innerLog = LoggerFactory.getLogger(clazz);

	}
	public AlignmentLogEncapsulation(String name) {
		super();
		innerLog = LoggerFactory.getLogger(name);		
	}




	/**
	 * Writes up the System.getProperties() data into a human readable format in the log file
	 * uses the System.Properties for path.separator to correctly delimit CLASSPATH and LIBRARYPATH
	 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
	 */
	@Override
	public void showSystemProperties() {

		String stringToLog=null;

		final Properties sysProps = System.getProperties();
		final Set<Object> keySet = sysProps.keySet();
		innerLog.info(Constants.BLOCKER);
		innerLog.info(Constants.LEADER +  "System Properties" + Constants.TRAILER);

		final String PATHSEPARATORVALUE = System.getProperty(PATHSEPERATOR);	


		for (Object obj:keySet) {
			if (obj.toString().equalsIgnoreCase(Constants.LINESEPARATORSTRING)) {

				final byte[] asciiOfLineSeparator = System.getProperty(obj.toString()).getBytes();
				final String asciiString = Arrays.toString(asciiOfLineSeparator);
				stringToLog = obj.toString() + "=[ASCII character code(s)]=" + asciiString;
				innerLog.info(stringToLog);
			}else if(obj.toString().equalsIgnoreCase(CLASSPATH))  {

				String[] array = (System.getProperty(obj.toString())).split(PATHSEPARATORVALUE);

				for (int i = 0; i < array.length; i++) {
					innerLog.info(new StringBuilder().append(obj.toString()).append("[").append(Integer.toString(i+1)).append("]")
							.append(Constants.EQUALS).append(array[i].toString()).toString());
				}
			}else if(obj.toString().equalsIgnoreCase(LIBRARYPATH))  {

				String[] array = (System.getProperty(obj.toString())).split(PATHSEPARATORVALUE);				
				for (int i = 0; i < array.length; i++) {
					innerLog.info(new StringBuilder().append(obj.toString()).append("[").append(Integer.toString(i+1)).append("]")
							.append(Constants.EQUALS).append(array[i].toString()).toString());
				}
			}else {
				stringToLog=new StringBuilder().append(obj.toString()).append("=").append(System.getProperty(obj.toString())).toString();
				innerLog.info(stringToLog);
			}
		}
		innerLog.info(Constants.BLOCKER);
	}


	@Override
	public void infoOrderBookStatus(List<String> buyList, List<String> sellList) {
		ListIterator<String> sideIterator = null;

		this.info(Constants.BLOCKER);

		sideIterator = buyList.listIterator();

		while (sideIterator.hasNext()) {
			this.info(sideIterator.next().toString());			
		}

		sideIterator = sellList.listIterator();

		while (sideIterator.hasNext()) {
			this.info(sideIterator.next().toString());
		}
		this.info(Constants.BLOCKER);
	}


	@Override
	public void infoSpecificProperties(String listName , List<String> propertiesList) {
		ListIterator<String> propertiesListIterator = null;

		this.info(Constants.BLOCKER);
		innerLog.info(Constants.LEADER +  "System Properties" + Constants.TRAILER);

		this.info(
				new StringBuilder()
				.append(Constants.LEADER)
				.append(listName)
				.append("has element count=")
				.append(Integer.toString(propertiesList.size()))
				.append(Constants.TRAILER).toString()
				); 

		propertiesListIterator = propertiesList.listIterator();

		while (propertiesListIterator.hasNext()) {
			this.info(propertiesListIterator.next().toString());			
		}
		this.info(Constants.BLOCKER);
	}





	private String getInformation(String msg, SessionID sessionId, String methodName, String className, InstanceType instanceType) {
		StringBuilder sb = new StringBuilder();
		sb
		.append(AlignmentFunctions.wrapNameSquareBracketsAndSpaces(instanceType.type))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(className))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(methodName))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(sessionId.toString()))
		.append(Constants.TAB)
		.append(msg);
		return sb.toString();	
	}


	@Override
	public void infoFIXSession(String msg, SessionID sessionId, String methodName, String className, InstanceType instanceType) {
		String toWrite = getInformation(msg, sessionId, methodName, className, instanceType);
		innerLog.info(toWrite);
	}

	@Override
	public void errorFIXSession(String msg, SessionID sessionId, String methodName, String className, InstanceType instanceType) {
		String toWrite = getInformation(msg, sessionId, methodName, className, instanceType);
		innerLog.error(toWrite);
	}

	private String getInformation(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, InstanceType instanceType) {
		StringBuilder sb = new StringBuilder();
		sb
		.append(AlignmentFunctions.wrapNameSquareBracketsAndSpaces(instanceType.type))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(className))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(methodName))
		.append(Constants.TAB)
		.append(AlignmentFunctions.wrapNameSquareBrackets(direction.value))
		.append(Constants.TAB)		
		.append(AlignmentFunctions.wrapNameSquareBrackets(sessionId.toString()))
		.append(Constants.TAB)
		.append(msg)
		;

		return sb.toString();

	}



	@Override
	public void infoFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, InstanceType instanceType) {
		String toWrite = getInformation(msg, sessionId, direction, methodName, className, instanceType);

		innerLog.info(toWrite);
	}


	@Override
	public void errorFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName,
			String className, InstanceType instanceType) {
		String toWrite = getInformation(msg, sessionId, direction, methodName, className, instanceType);

		innerLog.error(toWrite);

	}





	@Override
	public void infoMatchingEvent(OperationEventType operationEventType, InterfaceMatch match) {
		StringBuilder sb = new StringBuilder()
				.append(AlignmentFunctions.wrapNameSquareBrackets(operationEventType.value))
				.append(Constants.TAB)
				.append(match.toString())
				;
		innerLog.info(sb.toString());
	}



	@Override
	public String getName() {
		return innerLog.getName();

	}

	@Override
	public boolean isTraceEnabled() {
		return innerLog.isTraceEnabled();
	}

	@Override
	public void trace(String msg) {
		innerLog.trace(msg);		
	}

	@Override
	public void trace(String format, Object arg) {
		innerLog.trace(format, arg);	
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		innerLog.trace(format, arg1, arg2);	
	}

	@Override
	public void trace(String format, Object... arguments) {
		innerLog.trace(format, arguments);
	}

	@Override
	public void trace(String msg, Throwable t) {
		innerLog.trace(msg, t);
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		return innerLog.isTraceEnabled();
	}

	@Override
	public void trace(Marker marker, String msg) {
		innerLog.trace(marker, msg);	
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		innerLog.trace(marker, format, arg);
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		innerLog.trace(marker, format, arg1, arg2);
	}

	@Override
	public void trace(Marker marker, String format, Object... argArray) {
		innerLog.trace(marker, format, argArray);
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		innerLog.trace(marker, msg, t);

	}

	@Override
	public boolean isDebugEnabled() {
		return innerLog.isDebugEnabled();
	}

	@Override
	public void debug(String msg) {
		innerLog.debug(msg);
	}

	@Override
	public void debug(String format, Object arg) {
		innerLog.debug(format, arg);
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		innerLog.debug(format, arg1, arg2);		
	}

	@Override
	public void debug(String format, Object... arguments) {
		innerLog.debug(format, arguments);
	}

	@Override
	public void debug(String msg, Throwable t) {
		innerLog.debug(msg, t);
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		return innerLog.isDebugEnabled(marker);
	}

	@Override
	public void debug(Marker marker, String msg) {
		innerLog.debug(marker, msg);
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		innerLog.debug(marker, format, arg);
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		innerLog.debug(marker, format, arg1, arg2);
	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		innerLog.debug(marker, format, arguments);
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		innerLog.debug(marker, msg, t);
	}

	@Override
	public boolean isInfoEnabled() {
		return innerLog.isInfoEnabled();
	}

	@Override
	public void info(String msg) {
		innerLog.info(msg);
	}

	@Override
	public void info(String format, Object arg) {
		innerLog.info(format, arg);
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		innerLog.info(format, arg1, arg2);
	}

	@Override
	public void info(String format, Object... arguments) {
		innerLog.info(format, arguments);
	}

	@Override
	public void info(String msg, Throwable t) {
		innerLog.info(msg, t);

	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		return innerLog.isInfoEnabled(marker);
	}

	@Override
	public void info(Marker marker, String msg) {
		innerLog.info(marker, msg);
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		innerLog.info(marker, format, arg);
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		innerLog.info(marker, format, arg1, arg2);
	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		innerLog.info(marker, format, arguments);
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		innerLog.info(marker, msg, t);
	}

	@Override
	public boolean isWarnEnabled() {
		return innerLog.isWarnEnabled();
	}

	@Override
	public void warn(String msg) {
		innerLog.warn(msg);
	}

	@Override
	public void warn(String format, Object arg) {
		innerLog.warn(format, arg);
	}

	@Override
	public void warn(String format, Object... arguments) {
		innerLog.warn(format, arguments);
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		innerLog.warn(format, arg1, arg2);
	}

	@Override
	public void warn(String msg, Throwable t) {
		innerLog.warn(msg, t);
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		return innerLog.isWarnEnabled(marker);
	}

	@Override
	public void warn(Marker marker, String msg) {
		innerLog.warn(marker, msg);
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		innerLog.warn(marker, format, arg);	
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		innerLog.warn(marker, format, arg1, arg2);		
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		innerLog.warn(marker, format, arguments);
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		innerLog.warn(marker, msg, t);
	}

	@Override
	public boolean isErrorEnabled() {
		return innerLog.isErrorEnabled();
	}

	@Override
	public void error(String msg) {
		innerLog.error(msg);
	}

	@Override
	public void error(String format, Object arg) {
		innerLog.error(format, arg);
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		innerLog.error(format, arg1, arg2);
	}

	@Override
	public void error(String format, Object... arguments) {
		innerLog.error(format, arguments);
	}

	@Override
	public void error(String msg, Throwable t) {
		innerLog.error(msg, t);
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		return innerLog.isErrorEnabled(marker);
	}

	@Override
	public void error(Marker marker, String msg) {
		innerLog.error(marker, msg);	
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		innerLog.error(marker, format, arg);
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		innerLog.error(marker, format, arg1, arg2);
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		innerLog.error(marker, format, arguments);
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		innerLog.error(marker, msg, t);	
	}


}