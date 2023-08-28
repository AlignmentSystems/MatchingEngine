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

public class QuoteCancelType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 298;
	public static final int CANCEL_FOR_ONE_OR_MORE_SECURITIES = 1;
	public static final int CANCEL_FOR_SECURITY_TYPE = 2;
	public static final int CANCEL_FOR_UNDERLYING_SECURITY = 3;
	public static final int CANCEL_ALL_QUOTES = 4;
	public static final int CANCEL_QUOTE_SPECIFIED_IN_QUOTEID = 5;
	public static final int CANCEL_BY_QUOTETYPE = 6;
	public static final int CANCEL_FOR_SECURITY_ISSUER = 7;
	public static final int CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY = 8;
	
	public QuoteCancelType() {
		super(298);
	}

	public QuoteCancelType(int data) {
		super(298, data);
	}
}