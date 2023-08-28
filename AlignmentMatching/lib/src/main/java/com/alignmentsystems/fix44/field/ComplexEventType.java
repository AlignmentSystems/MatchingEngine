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

public class ComplexEventType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1484;
	public static final int CAPPED = 1;
	public static final int TRIGGER = 2;
	public static final int KNOCK_IN_UP = 3;
	public static final int KOCK_IN_DOWN = 4;
	public static final int KNOCK_OUT_UP = 5;
	public static final int KNOCK_OUT_DOWN = 6;
	public static final int UNDERLYING = 7;
	public static final int RESET_BARRIER = 8;
	public static final int ROLLING_BARRIER = 9;
	
	public ComplexEventType() {
		super(1484);
	}

	public ComplexEventType(int data) {
		super(1484, data);
	}
}