/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package com.alignmentsystems.fix44.field;

import quickfix.IntField;

public class PriceType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 423;
	public static final int PERCENTAGE = 1;
	public static final int PER_UNIT = 2;
	public static final int FIXED_AMOUNT = 3;
	public static final int DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR = 4;
	public static final int PREMIUM_PERCENTAGE_POINTS_OVER_PAR = 5;
	public static final int SPREAD = 6;
	public static final int TED_PRICE = 7;
	public static final int TED_YIELD = 8;
	public static final int YIELD = 9;
	public static final int FIXED_CABINET_TRADE_PRICE = 10;
	public static final int VARIABLE_CABINET_TRADE_PRICE = 11;
	public static final int PRODUCT_TICKS_IN_HALFS = 13;
	public static final int PRODUCT_TICKS_IN_FOURTHS = 14;
	public static final int PRODUCT_TICKS_IN_EIGHTS = 15;
	public static final int PRODUCT_TICKS_IN_SIXTEENTHS = 16;
	public static final int PRODUCT_TICKS_IN_THIRTY_SECONDS = 17;
	public static final int PRODUCT_TICKS_IN_SIXTY_FORTHS = 18;
	public static final int PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS = 19;
	
	public PriceType() {
		super(423);
	}

	public PriceType(int data) {
		super(423, data);
	}
}