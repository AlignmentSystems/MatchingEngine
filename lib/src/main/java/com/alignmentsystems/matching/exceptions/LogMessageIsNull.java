package com.alignmentsystems.matching.exceptions;

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
