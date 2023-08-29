package com.alignmentsystems.matching;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.matching.interfaces.InterfaceExecutionReport;

import quickfix.FieldNotFound;
import quickfix.SessionID;

public class AlignmentExecutionReport implements InterfaceExecutionReport {
private String execID = null;
private ExecutionReport er = null;
private SessionID sessionId = null;


	public AlignmentExecutionReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setExecutionReport(String execID, ExecutionReport er, SessionID sessionId) {
	this.execID = execID;
	this.er = er;
	this.sessionId = sessionId;
	}

	@Override
	public ExecutionReport getExecutionReport() {
		return this.er;
	}

	@Override
	public SessionID getSessionID() {
		return this.sessionId;
	}

	@Override
	public String getExecID() {
		return this.execID;
	}
}
