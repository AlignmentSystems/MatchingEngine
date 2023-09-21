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
	ERROR("Error", Integer.toString(0).charAt(0)),
	BUY("Buy", Integer.toString(1).charAt(0)),
	SELL("Sell", Integer.toString(2).charAt(0))
	;

	public String sideReadableValue;
	public String sideStringValue;
	public char sideCharValue;
	
	
	/**
	 * 
	 * @param sideReadableValue
	 * @param sideCharValue
	 */
	OrderBookSide(String sideReadableValue, char sideCharValue){
		this.sideReadableValue = sideReadableValue;
		this.sideCharValue = sideCharValue;
		
	}

	/**
	 * 
	 * @return
	 */
	public String getSideFIXStringValue() {
		return String.valueOf(sideCharValue);
	} 
	
	
	/**
	 * 
	 * @param sideCode
	 * @return
	 */
	public static char  getCharForString(String sideCode) {
		char retVal = OrderBookSide.ERROR.sideCharValue; 
		for  (OrderBookSide obs : OrderBookSide.values()) {

			if (sideCode.equals(obs.sideCharValue)) {
				retVal = obs.sideCharValue;
				break;
			}
		}
		return retVal;
	}

	
	/**
	 * 
	 * @param sideCode
	 * @return
	 */
	public static OrderBookSide getEnumForString(String sideCode) {
		OrderBookSide retVal = OrderBookSide.ERROR; 
		for  (OrderBookSide obs : OrderBookSide.values()) {

			if (sideCode.equals(obs.getSideFIXStringValue())) {
				retVal = obs;
				break;
			}
		}
		return retVal;
	}
	
	/**
	 * 
	 * @param sideID
	 * @return
	 */
	public static OrderBookSide getEnumForID(char sideID) {
		OrderBookSide retVal = OrderBookSide.ERROR; 
		for  (OrderBookSide obs : OrderBookSide.values()) {

			if (sideID==obs.sideCharValue) {
				retVal = obs;
				break;
			}
		}
		return retVal;
	}
}