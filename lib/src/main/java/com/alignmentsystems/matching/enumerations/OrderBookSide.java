package com.alignmentsystems.matching.enumerations;
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
	ERROR("Error"),
	SELL("Sell"),
	BUY("Buy");

	public final String sideValue;
	
	OrderBookSide(String sideValue){
		this.sideValue = sideValue;
	}
}
