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

public class QuoteRequestRejectReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 658;
	public static final int UNKNOWN_SYMBOL = 1;
	public static final int EXCHANGE_CLOSED = 2;
	public static final int QUOTE_REQUEST_EXCEEDS_LIMIT = 3;
	public static final int TOO_LATE_TO_ENTER = 4;
	public static final int INVALID_PRICE = 5;
	public static final int NOT_AUTHORIZED_TO_REQUEST_QUOTE = 6;
	public static final int NO_MATCH_FOR_INQUIRY = 7;
	public static final int NO_MARKET_FOR_INSTRUMENT = 8;
	public static final int NO_INVENTORY = 9;
	public static final int PASS = 10;
	public static final int INSUFFICIENT_CREDIT = 11;
	public static final int OTHER = 99;
	
	public QuoteRequestRejectReason() {
		super(658);
	}

	public QuoteRequestRejectReason(int data) {
		super(658, data);
	}
}