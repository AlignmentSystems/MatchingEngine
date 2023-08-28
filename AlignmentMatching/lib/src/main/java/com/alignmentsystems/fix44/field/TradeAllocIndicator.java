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

public class TradeAllocIndicator extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 826;
	public static final int ALLOCATION_NOT_REQUIRED = 0;
	public static final int ALLOCATION_REQUIRED = 1;
	public static final int USE_ALLOCATION_PROVIDED_WITH_THE_TRADE = 2;
	public static final int ALLOCATION_GIVE_UP_EXECUTOR = 3;
	public static final int ALLOCATION_FROM_EXECUTOR = 4;
	public static final int ALLOCATION_TO_CLAIM_ACCOUNT = 5;
	
	public TradeAllocIndicator() {
		super(826);
	}

	public TradeAllocIndicator(int data) {
		super(826, data);
	}
}