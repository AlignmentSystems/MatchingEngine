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

import quickfix.CharField;

public class TriggerType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1100;
	public static final char PARTIAL_EXECUTION = '1';
	public static final char SPECIFIED_TRADING_SESSION = '2';
	public static final char NEXT_AUCTION = '3';
	public static final char PRICE_MOVEMENT = '4';
	
	public TriggerType() {
		super(1100);
	}

	public TriggerType(char data) {
		super(1100, data);
	}
}