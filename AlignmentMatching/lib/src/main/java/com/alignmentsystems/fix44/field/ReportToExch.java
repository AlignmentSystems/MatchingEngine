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

import quickfix.BooleanField;

public class ReportToExch extends BooleanField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 113;
	public static final boolean INDICATES_THE_PARTY_SENDING_MESSAGE_WILL_REPORT_TRADE = false;
	public static final boolean INDICATES_THE_PARTY_RECEIVING_MESSAGE_MUST_REPORT_TRADE = true;
	
	public ReportToExch() {
		super(113);
	}

	public ReportToExch(boolean data) {
		super(113, data);
	}
}