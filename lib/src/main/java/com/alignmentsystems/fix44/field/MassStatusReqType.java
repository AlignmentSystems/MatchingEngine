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

public class MassStatusReqType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 585;
	public static final int STATUS_FOR_ORDERS_FOR_A_SECURITY = 1;
	public static final int STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY = 2;
	public static final int STATUS_FOR_ORDERS_FOR_A_PRODUCT = 3;
	public static final int STATUS_FOR_ORDERS_FOR_A_CFICODE = 4;
	public static final int STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE = 5;
	public static final int STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION = 6;
	public static final int STATUS_FOR_ALL_ORDERS = 7;
	public static final int STATUS_FOR_ORDERS_FOR_A_PARTYID = 8;
	public static final int STATUS_FOR_SECURITY_ISSUER = 9;
	public static final int STATUS_FOR_ISSUER_OF_UNDERLYING_SECURITY = 10;
	
	public MassStatusReqType() {
		super(585);
	}

	public MassStatusReqType(int data) {
		super(585, data);
	}
}