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

public class SecurityTradingEvent extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1174;
	public static final int ORDER_IMBALANCE_AUCTION_IS_EXTENDED = 1;
	public static final int TRADING_RESUMES = 2;
	public static final int PRICE_VOLATILITY_INTERRUPTION = 3;
	public static final int CHANGE_OF_TRADING_SESSION = 4;
	public static final int CHANGE_OF_TRADING_SUBSESSION = 5;
	public static final int CHANGE_OF_SECURITY_TRADING_STATUS = 6;
	public static final int CHANGE_OF_BOOK_TYPE = 7;
	public static final int CHANGE_OF_MARKET_DEPTH = 8;
	
	public SecurityTradingEvent() {
		super(1174);
	}

	public SecurityTradingEvent(int data) {
		super(1174, data);
	}
}