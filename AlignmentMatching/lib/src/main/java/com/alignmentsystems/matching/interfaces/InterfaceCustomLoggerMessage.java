package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	EventStatusCategory
 * 
 *****************************************************************************/

import com.alignmentsystems.matching.Match;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.MessageDirection;
import com.alignmentsystems.matching.enumerations.OperationEventType;

import quickfix.SessionID;

public interface InterfaceCustomLoggerMessage {
	public void infoFIXSession(String msg, SessionID sessionId, MessageDirection direction, String methodName, String className, Actors actor);
	public void infoMatchingEvent(OperationEventType operationEventType, Match match);
}
