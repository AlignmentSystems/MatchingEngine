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

public class SettlType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 63;
	public static final String REGULAR_FX_SPOT_SETTLEMENT = "0";
	public static final String CASH = "1";
	public static final String NEXT_DAY = "2";
	public static final String T_2 = "3";
	public static final String T_3 = "4";
	public static final String T_4 = "5";
	public static final String FUTURE = "6";
	public static final String WHEN_AND_IF_ISSUED = "7";
	public static final String SELLERS_OPTION = "8";
	public static final String T_5 = "9";
	public static final String BROKEN_DATE_FOR_FX_EXPRESSING_NON_STANDARD_TENOR_SETTLDATE_MUST_BE_SPECIFIED = "B";
	public static final String FX_SPOT_NEXT_SETTLEMENT = "C";
	
	public SettlType() {
		super(63);
	}

	public SettlType(String data) {
		super(63, data);
	}
}