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

import quickfix.CharField;

public class ExecAckStatus extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1036;
	public static final char RECEIVED_NOT_YET_PROCESSED = '0';
	public static final char ACCEPTED = '1';
	public static final char DONT_KNOW_REJECTED = '2';
	
	public ExecAckStatus() {
		super(1036);
	}

	public ExecAckStatus(char data) {
		super(1036, data);
	}
}