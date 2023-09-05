package com.alignmentsystems.matching.exceptions;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	5th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	RepresentationSBENotAvailable
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
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
