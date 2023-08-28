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

public class InstrAttribType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 871;
	public static final int FLAT = 1;
	public static final int ZERO_COUPON = 2;
	public static final int INTEREST_BEARING = 3;
	public static final int NO_PERIODIC_PAYMENTS = 4;
	public static final int VARIABLE_RATE = 5;
	public static final int LESS_FEE_FOR_PUT = 6;
	public static final int STEPPED_COUPON = 7;
	public static final int COUPON_PERIOD_FIELD_ = 8;
	public static final int WHEN_AND_IF_ISSUED = 9;
	public static final int ORIGINAL_ISSUE_DISCOUNT = 10;
	public static final int CALLABLE_PUTTABLE = 11;
	public static final int ESCROWED_TO_MATURITY = 12;
	public static final int ESCROWED_TO_REDEMPTION_DATE_CALLABLE_SUPPLY_REDEMPTION_DATE_IN_THE_INSTRATTRIBVALUE_FIELD = 13;
	public static final int PRE_REFUNDED = 14;
	public static final int IN_DEFAULT = 15;
	public static final int UNRATED = 16;
	public static final int TAXABLE = 17;
	public static final int INDEXED = 18;
	public static final int SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = 19;
	public static final int ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE_FIELD = 20;
	public static final int CALLABLE_BELOW_MATURITY_VALUE = 21;
	public static final int CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED = 22;
	public static final int PRICE_TICK_RULES_FOR_SECURITY_ = 23;
	public static final int TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY_ = 24;
	public static final int INSTRUMENT_DENOMINATOR = 25;
	public static final int INSTRUMENT_NUMERATOR = 26;
	public static final int INSTRUMENT_PRICE_PRECISION = 27;
	public static final int INSTRUMENT_STRIKE_PRICE = 28;
	public static final int TRADEABLE_INDICATOR = 29;
	public static final int TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE_FIELD_ = 99;
	
	public InstrAttribType() {
		super(871);
	}

	public InstrAttribType(int data) {
		super(871, data);
	}
}