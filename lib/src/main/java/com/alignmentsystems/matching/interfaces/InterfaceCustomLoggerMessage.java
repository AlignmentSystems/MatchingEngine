package com.alignmentsystems.matching.interfaces;
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

import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.MessageDirection;
import com.alignmentsystems.matching.enumerations.OperationEventType;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceCustomLoggerMessage {
	public void infoFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, Actors actor);
	public void infoFIXSession(String msg, SessionID sessionId, String methodName, String className, Actors actor);
	public void errorFIXSession(String msg, SessionID sessionId, String methodName, String className, Actors actor);
	public void errorFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, Actors actor);
	public void infoMatchingEvent(OperationEventType operationEventType, InterfaceMatch match);
	public void infoOrderBookStatus(List<String> buyList, List<String> sellList);
}
