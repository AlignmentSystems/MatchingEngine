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

public class TradingSessionSubID extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 625;
	public static final String PRE_TRADING = "1";
	public static final String OPENING_OR_OPENING_AUCTION = "2";
	public static final String TRADING = "3";
	public static final String CLOSING_OR_CLOSING_AUCTION = "4";
	public static final String POST_TRADING = "5";
	public static final String INTRADAY_AUCTION = "6";
	public static final String QUIESCENT = "7";
	
	public TradingSessionSubID() {
		super(625);
	}

	public TradingSessionSubID(String data) {
		super(625, data);
	}
}