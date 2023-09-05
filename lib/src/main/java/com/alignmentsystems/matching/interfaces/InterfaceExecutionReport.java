package com.alignmentsystems.matching.interfaces;
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

import com.alignmentsystems.fix44.ExecutionReport;

import quickfix.SessionID;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceExecutionReport {
	public void setExecutionReport(String execID, ExecutionReport er, SessionID sessionId);
	public ExecutionReport getExecutionReport();
	public SessionID getSessionID();
	public String getExecID();
	
}
