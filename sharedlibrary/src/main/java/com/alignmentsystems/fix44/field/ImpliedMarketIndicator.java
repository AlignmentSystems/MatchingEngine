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

public class ImpliedMarketIndicator extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1144;
	public static final int NOT_IMPLIED = 0;
	public static final int IMPLIED_IN_THE_EXISTENCE_OF_A_MULTI_LEG_INSTRUMENT_IS_IMPLIED_BY_THE_LEGS_OF_THAT_INSTRUMENT = 1;
	public static final int IMPLIED_OUT_THE_EXISTENCE_OF_THE_UNDERLYING_LEGS_ARE_IMPLIED_BY_THE_MULTI_LEG_INSTRUMENT = 2;
	public static final int BOTH_IMPLIED_IN_AND_IMPLIED_OUT = 3;
	
	public ImpliedMarketIndicator() {
		super(1144);
	}

	public ImpliedMarketIndicator(int data) {
		super(1144, data);
	}
}