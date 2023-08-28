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

public class QuoteEntryStatus extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1167;
	public static final int ACCEPTED = 0;
	public static final int REJECTED = 5;
	public static final int REMOVED_FROM_MARKET = 6;
	public static final int EXPIRED = 7;
	public static final int LOCKED_MARKET_WARNING = 12;
	public static final int CROSS_MARKET_WARNING = 13;
	public static final int CANCELED_DUE_TO_LOCK_MARKET = 14;
	public static final int CANCELED_DUE_TO_CROSS_MARKET = 15;
	public static final int ACTIVE = 16;
	
	public QuoteEntryStatus() {
		super(1167);
	}

	public QuoteEntryStatus(int data) {
		super(1167, data);
	}
}