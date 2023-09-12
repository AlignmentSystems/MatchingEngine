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

public class ExpirationCycle extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 827;
	public static final int EXPIRE_ON_TRADING_SESSION_CLOSE = 0;
	public static final int EXPIRE_ON_TRADING_SESSION_OPEN = 1;
	public static final int TRADING_ELIGIBILITY_EXPIRATION_SPECIFIED_IN_THE_DATE_AND_TIME_FIELDS_EVENTDATE = 2;
	
	public ExpirationCycle() {
		super(827);
	}

	public ExpirationCycle(int data) {
		super(827, data);
	}
}