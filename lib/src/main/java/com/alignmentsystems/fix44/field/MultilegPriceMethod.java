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

public class MultilegPriceMethod extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1378;
	public static final int NET_PRICE = 0;
	public static final int REVERSED_NET_PRICE = 1;
	public static final int YIELD_DIFFERENCE = 2;
	public static final int INDIVIDUAL = 3;
	public static final int CONTRACT_WEIGHTED_AVERAGE_PRICE = 4;
	public static final int MULTIPLIED_PRICE = 5;
	
	public MultilegPriceMethod() {
		super(1378);
	}

	public MultilegPriceMethod(int data) {
		super(1378, data);
	}
}