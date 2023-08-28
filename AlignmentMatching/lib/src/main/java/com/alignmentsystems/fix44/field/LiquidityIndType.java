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

public class LiquidityIndType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 409;
	public static final int _5_DAY_MOVING_AVERAGE = 1;
	public static final int _20_DAY_MOVING_AVERAGE = 2;
	public static final int NORMAL_MARKET_SIZE = 3;
	public static final int OTHER = 4;
	
	public LiquidityIndType() {
		super(409);
	}

	public LiquidityIndType(int data) {
		super(409, data);
	}
}