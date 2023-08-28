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

public class RefOrdIDReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1431;
	public static final int GTC_FROM_PREVIOUS_DAY = 0;
	public static final int PARTIAL_FILL_REMAINING = 1;
	public static final int ORDER_CHANGED = 2;
	
	public RefOrdIDReason() {
		super(1431);
	}

	public RefOrdIDReason(int data) {
		super(1431, data);
	}
}