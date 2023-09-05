package com.alignmentsystems.matching.exceptions;

public class RepresentationSBENotAvailable extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public RepresentationSBENotAvailable (String message) {
        super (message);
    }

    public RepresentationSBENotAvailable (Throwable cause) {
        super (cause);
    }

    public RepresentationSBENotAvailable (String message, Throwable cause) {
        super (message, cause);
    }

}
