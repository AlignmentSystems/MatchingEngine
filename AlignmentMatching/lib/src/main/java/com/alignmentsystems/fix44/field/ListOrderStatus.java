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

public class ListOrderStatus extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 431;
	public static final int IN_BIDDING_PROCESS = 1;
	public static final int RECEIVED_FOR_EXECUTION = 2;
	public static final int EXECUTING = 3;
	public static final int CANCELLING = 4;
	public static final int ALERT = 5;
	public static final int ALL_DONE = 6;
	public static final int REJECT = 7;
	
	public ListOrderStatus() {
		super(431);
	}

	public ListOrderStatus(int data) {
		super(431, data);
	}
}