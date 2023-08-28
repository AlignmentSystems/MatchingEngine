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

public class RespondentType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1172;
	public static final int ALL_MARKET_PARTICIPANTS = 1;
	public static final int SPECIFIED_MARKET_PARTICIPANTS = 2;
	public static final int ALL_MARKET_MAKERS = 3;
	public static final int PRIMARY_MARKET_MAKER = 4;
	
	public RespondentType() {
		super(1172);
	}

	public RespondentType(int data) {
		super(1172, data);
	}
}