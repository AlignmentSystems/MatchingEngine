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

public class MassActionRejectReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1376;
	public static final int MASS_ACTION_NOT_SUPPORTED = 0;
	public static final int INVALID_OR_UNKNOWN_SECURITY = 1;
	public static final int INVALID_OR_UNKNOWN_UNDERLYING_SECURITY = 2;
	public static final int INVALID_OR_UNKNOWN_PRODUCT = 3;
	public static final int INVALID_OR_UNKNOWN_CFICODE = 4;
	public static final int INVALID_OR_UNKNOWN_SECURITYTYPE = 5;
	public static final int INVALID_OR_UNKNOWN_TRADING_SESSION = 6;
	public static final int INVALID_OR_UNKNOWN_MARKET = 7;
	public static final int INVALID_OR_UNKNOWN_MARKET_SEGMENT = 8;
	public static final int INVALID_OR_UNKNOWN_SECURITY_GROUP = 9;
	public static final int INVALID_OR_UNKNOWN_SECURITY_ISSUER = 10;
	public static final int INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY = 11;
	public static final int OTHER = 99;
	
	public MassActionRejectReason() {
		super(1376);
	}

	public MassActionRejectReason(int data) {
		super(1376, data);
	}
}