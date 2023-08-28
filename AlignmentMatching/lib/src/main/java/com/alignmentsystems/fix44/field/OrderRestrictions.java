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

public class OrderRestrictions extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 529;
	public static final char PROGRAM_TRADE = '1';
	public static final char INDEX_ARBITRAGE = '2';
	public static final char NON_INDEX_ARBITRAGE = '3';
	public static final char COMPETING_MARKET_MAKER = '4';
	public static final char ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY = '5';
	public static final char ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY = '6';
	public static final char FOREIGN_ENTITY = '7';
	public static final char EXTERNAL_MARKET_PARTICIPANT = '8';
	public static final char EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE = '9';
	public static final char RISKLESS_ARBITRAGE = 'A';
	public static final char ISSUER_HOLDING = 'B';
	public static final char ISSUE_PRICE_STABILIZATION = 'C';
	public static final char NON_ALGORITHMIC = 'D';
	public static final char ALGORITHMIC = 'E';
	public static final char CROSS = 'F';
	
	public OrderRestrictions() {
		super(529);
	}

	public OrderRestrictions(String data) {
		super(529, data);
	}
}