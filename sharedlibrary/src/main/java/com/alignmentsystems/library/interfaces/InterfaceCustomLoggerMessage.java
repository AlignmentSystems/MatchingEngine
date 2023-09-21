package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceCustomLoggerMessage
 *	Description		:
 *****************************************************************************/

import java.util.List;

import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.MessageDirection;
import com.alignmentsystems.library.enumerations.OperationEventType;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceCustomLoggerMessage {
	public void infoFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, InstanceType instanceType);
	public void infoFIXSession(String msg, SessionID sessionId, String methodName, String className, InstanceType instanceType);
	public void errorFIXSession(String msg, SessionID sessionId, String methodName, String className, InstanceType instanceType);
	public void errorFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, InstanceType instanceType);
	public void infoMatchingEvent(OperationEventType operationEventType, InterfaceMatch match);
	public void infoMatchingEvent(OperationEventType operationEventType, InterfaceExecutionReport er);
	public void infoOrderBookStatus(List<String> buyList, List<String> sellList);
	public void infoSpecificProperties(String listName, List<String> propertiesList); 
	public void showSystemProperties();
}
