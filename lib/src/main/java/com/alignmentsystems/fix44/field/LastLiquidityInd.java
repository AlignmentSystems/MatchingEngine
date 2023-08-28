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

public class LastLiquidityInd extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 851;
	public static final int ADDED_LIQUIDITY = 1;
	public static final int REMOVED_LIQUIDITY = 2;
	public static final int LIQUIDITY_ROUTED_OUT = 3;
	public static final int AUCTION = 4;
	
	public LastLiquidityInd() {
		super(851);
	}

	public LastLiquidityInd(int data) {
		super(851, data);
	}
}