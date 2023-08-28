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

public class OrderDelayUnit extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1429;
	public static final int SECONDS = 0;
	public static final int TENTHS_OF_A_SECOND = 1;
	public static final int HUNDREDTHS_OF_A_SECOND = 2;
	public static final int MILLISECONDS = 3;
	public static final int MICROSECONDS = 4;
	public static final int NANOSECONDS = 5;
	public static final int MINUTES = 10;
	public static final int HOURS = 11;
	public static final int DAYS = 12;
	public static final int WEEKS = 13;
	public static final int MONTHS = 14;
	public static final int YEARS = 15;
	
	public OrderDelayUnit() {
		super(1429);
	}

	public OrderDelayUnit(int data) {
		super(1429, data);
	}
}