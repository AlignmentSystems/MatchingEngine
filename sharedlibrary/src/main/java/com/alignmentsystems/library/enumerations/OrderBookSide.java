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
public enum OrderBookSide {
	ERROR("Error", Integer.toString(0)),
	BUY("Buy", Integer.toString(1)),
	SELL("Sell", Integer.toString(2))
	;

	public final String sideValue;
	public final String sideStringValue;
	
	OrderBookSide(String sideValue, String sideStringValue){
		this.sideValue = sideValue;
		this.sideStringValue = sideStringValue;
	}
	
	public OrderBookSide getEnumForID(String sideID) {
		OrderBookSide retVal = OrderBookSide.ERROR; 
		for  (OrderBookSide obs : OrderBookSide.values()) {
			if (sideID == obs.sideStringValue) {
				retVal = obs;
				break;
			}
		}
		return retVal;
	}

}
