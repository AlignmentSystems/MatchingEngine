package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	LibraryOrders
 *	Description		:
 *****************************************************************************/

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.library.enumerations.OrderBookSide;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class LibraryOrders {


	/**
	 * 
	 * @param side Side
	 * @return OrderBookSide
	 */
	public static OrderBookSide getOrderBookSideFromFIXSide(Side side) {
		if (side.getObject()==Side.BUY) {
			return OrderBookSide.BUY;	
		}else if (side.getObject()==Side.SELL) {
			return OrderBookSide.SELL;	
		}else {
			return OrderBookSide.ERROR;
		}
	}

	


	
}