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

public class OrdRejReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 103;
	public static final int BROKER_EXCHANGE_OPTION = 0;
	public static final int UNKNOWN_SYMBOL = 1;
	public static final int EXCHANGE_CLOSED = 2;
	public static final int ORDER_EXCEEDS_LIMIT = 3;
	public static final int TOO_LATE_TO_ENTER = 4;
	public static final int UNKNOWN_ORDER = 5;
	public static final int DUPLICATE_ORDER = 6;
	public static final int DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER = 7;
	public static final int STALE_ORDER = 8;
	public static final int TRADE_ALONG_REQUIRED = 9;
	public static final int INVALID_INVESTOR_ID = 10;
	public static final int UNSUPPORTED_ORDER_CHARACTERISTIC = 11;
	public static final int SURVEILLENCE_OPTION = 12;
	public static final int INCORRECT_QUANTITY = 13;
	public static final int INCORRECT_ALLOCATED_QUANTITY = 14;
	public static final int UNKNOWN_ACCOUNT = 15;
	public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND = 16;
	public static final int INVALID_PRICE_INCREMENT = 18;
	public static final int OTHER = 99;
	
	public OrdRejReason() {
		super(103);
	}

	public OrdRejReason(int data) {
		super(103, data);
	}
}