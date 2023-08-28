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

public class ApplResponseType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1348;
	public static final int REQUEST_SUCCESSFULLY_PROCESSED = 0;
	public static final int APPLICATION_DOES_NOT_EXIST = 1;
	public static final int MESSAGES_NOT_AVAILABLE = 2;
	
	public ApplResponseType() {
		super(1348);
	}

	public ApplResponseType(int data) {
		super(1348, data);
	}
}