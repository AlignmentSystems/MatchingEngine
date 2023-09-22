package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	20th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentUEH
 *	Description		:	
 *****************************************************************************/


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentUEH implements Thread.UncaughtExceptionHandler{
	public final static String CLASSNAME = AlignmentUEH.class.getSimpleName().toString();

	private AlignmentPersistenceToFileClient debugger;
	private Boolean hasDebugger = Boolean.FALSE;

	public AlignmentUEH() {
		this.hasDebugger = false;
	}

	public AlignmentUEH(AlignmentPersistenceToFileClient debugger) {
		this.debugger = debugger;
		this.hasDebugger = true;
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		if (hasDebugger) {		
			debugger.error(t.getName(), e);
		}else {
			System.err.println(t.getName() + " " + CLASSNAME);
		}
	}
}