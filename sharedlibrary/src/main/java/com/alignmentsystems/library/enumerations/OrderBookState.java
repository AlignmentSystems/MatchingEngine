package com.alignmentsystems.library.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderBookSide
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum OrderBookState {
	ERROR("Error Order Book", -1 ),
	EMPTY("Empty Order Book", 0 ),
	BUYSIDE("One Sided Book Buy" , 2),
	SELLSIDE("One Sided Book Sell", 4 ),
	TWOSIDED("Two Sided Order Book", 6);

	private String bookStateString;
	private int bookStateInt;

	public int getStateInt() {
		return this.bookStateInt;
	}

	public String getStateString() {
		return this.bookStateString;
	}

	public boolean contains(OrderBookState obs) {
		if ((this.getStateInt() & obs.getStateInt())==obs.getStateInt()) {
			return true;	
		} else {
			return false;
		}
	}

	OrderBookState(String strState, int intState){
		this.bookStateString = strState;
		this.bookStateInt = intState;
	}
}