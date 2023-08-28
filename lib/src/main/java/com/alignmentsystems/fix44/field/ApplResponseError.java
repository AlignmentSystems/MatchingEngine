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

public class ApplResponseError extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1354;
	public static final int APPLICATION_DOES_NOT_EXIST = 0;
	public static final int MESSAGES_REQUESTED_ARE_NOT_AVAILABLE = 1;
	public static final int USER_NOT_AUTHORIZED_FOR_APPLICATION = 2;
	
	public ApplResponseError() {
		super(1354);
	}

	public ApplResponseError(int data) {
		super(1354, data);
	}
}