package com.alignmentsystems.matching.interfaces;

import com.alignmentsystems.fix44.ExecutionReport;

import quickfix.SessionID;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	29th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceExecutionReport
 *	Description		:
 *****************************************************************************/

public interface InterfaceExecutionReport {
	public void setExecutionReport(String execID, ExecutionReport er, SessionID sessionId);
	public ExecutionReport getExecutionReport();
	public SessionID getSessionID();
	public String getExecID();
	
}
