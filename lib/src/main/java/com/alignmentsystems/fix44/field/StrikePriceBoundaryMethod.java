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

public class StrikePriceBoundaryMethod extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1479;
	public static final int LESS_THAN_UNDERLYING_PRICE_IS_IN_THE_MONEY = 1;
	public static final int LESS_THAN_OR_EQUAL_TO_THE_UNDERLYING_PRICE_IS_IN_THE_MONEY = 2;
	public static final int EQUAL_TO_THE_UNDERLYING_PRICE_IS_IN_THE_MONEY = 3;
	public static final int GREATER_THAN_OR_EQUAL_TO_UNDERLYING_PRICE_IS_IN_THE_MONEY = 4;
	public static final int GREATER_THAN_UNDERLYING_IS_IN_THE_MONEY = 5;
	
	public StrikePriceBoundaryMethod() {
		super(1479);
	}

	public StrikePriceBoundaryMethod(int data) {
		super(1479, data);
	}
}