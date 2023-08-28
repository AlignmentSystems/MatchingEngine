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

public class PegRoundDirection extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 838;
	public static final int MORE_AGGRESSIVE_ON_A_BUY_ORDER_ROUND_THE_PRICE_UP_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK = 1;
	public static final int MORE_PASSIVE_ON_A_BUY_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_UP_TO_THE_NEAREST_TICK = 2;
	
	public PegRoundDirection() {
		super(838);
	}

	public PegRoundDirection(int data) {
		super(838, data);
	}
}