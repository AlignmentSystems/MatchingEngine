package com.alignmentsystems.matching.exceptions;

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
