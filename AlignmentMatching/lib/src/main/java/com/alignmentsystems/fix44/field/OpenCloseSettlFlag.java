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

public class OpenCloseSettlFlag extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 286;
	public static final char DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY = '0';
	public static final char SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY = '1';
	public static final char DELIVERY_SETTLEMENT_ENTRY = '2';
	public static final char EXPECTED_ENTRY = '3';
	public static final char ENTRY_FROM_PREVIOUS_BUSINESS_DAY = '4';
	public static final char THEORETICAL_PRICE_VALUE = '5';
	
	public OpenCloseSettlFlag() {
		super(286);
	}

	public OpenCloseSettlFlag(String data) {
		super(286, data);
	}
}