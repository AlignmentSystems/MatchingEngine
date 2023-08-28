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

import quickfix.StringField;

public class PosAmtType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 707;
	public static final String CASH_AMOUNT = "CASH";
	public static final String CASH_RESIDUAL_AMOUNT = "CRES";
	public static final String FINAL_MARK_TO_MARKET_AMOUNT = "FMTM";
	public static final String INCREMENTAL_MARK_TO_MARKET_AMOUNT = "IMTM";
	public static final String PREMIUM_AMOUNT = "PREM";
	public static final String START_OF_DAY_MARK_TO_MARKET_AMOUNT = "SMTM";
	public static final String TRADE_VARIATION_AMOUNT = "TVAR";
	public static final String VALUE_ADJUSTED_AMOUNT = "VADJ";
	public static final String SETTLEMENT_VALUE = "SETL";
	public static final String INITIAL_TRADE_COUPON_AMOUNT = "ICPN";
	public static final String ACCRUED_COUPON_AMOUNT = "ACPN";
	public static final String COUPON_AMOUNT = "CPN";
	public static final String INCREMENTAL_ACCRUED_COUPON = "IACPN";
	public static final String COLLATERALIZED_MARK_TO_MARKET = "CMTM";
	public static final String INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET = "ICMTM";
	public static final String COMPENSATION_AMOUNT = "DLV";
	public static final String TOTAL_BANKED_AMOUNT = "BANK";
	public static final String TOTAL_COLLATERALIZED_AMOUNT = "COLAT";
	
	public PosAmtType() {
		super(707);
	}

	public PosAmtType(String data) {
		super(707, data);
	}
}