package com.alignmentsystems.library.exceptions;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	5th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LogMessageIsNull
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class LogMessageIsNull extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public LogMessageIsNull () {
        super ();
    }
	
	public LogMessageIsNull (String message) {
        super (message);
    }

    public LogMessageIsNull (Throwable cause) {
        super (cause);
    }

    public LogMessageIsNull (String message, Throwable cause) {
        super (message, cause);
    }

}
