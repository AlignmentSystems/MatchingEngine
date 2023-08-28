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

public class MassActionType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1373;
	public static final int SUSPEND_ORDERS = 1;
	public static final int RELEASE_ORDERS_FROM_SUSPENSION = 2;
	public static final int CANCEL_ORDERS = 3;
	
	public MassActionType() {
		super(1373);
	}

	public MassActionType(int data) {
		super(1373, data);
	}
}