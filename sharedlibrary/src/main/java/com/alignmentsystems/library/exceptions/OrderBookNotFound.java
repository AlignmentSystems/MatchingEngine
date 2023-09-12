package com.alignmentsystems.library.exceptions;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	5th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBookNotFound
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class OrderBookNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public OrderBookNotFound (String message) {
        super (message);
    }

    public OrderBookNotFound (Throwable cause) {
        super (cause);
    }

    public OrderBookNotFound (String message, Throwable cause) {
        super (message, cause);
    }

}
