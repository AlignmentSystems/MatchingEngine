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

public class AllocReportType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 794;
	public static final int PRELIMINARY_REQUEST_TO_INTERMEDIARY = 2;
	public static final int SELLSIDE_CALCULATED_USING_PRELIMINARY = 3;
	public static final int SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = 4;
	public static final int WAREHOUSE_RECAP = 5;
	public static final int REQUEST_TO_INTERMEDIARY = 8;
	public static final int ACCEPT = 9;
	public static final int REJECT = 10;
	public static final int ACCEPT_PENDING = 11;
	public static final int COMPLETE = 12;
	public static final int REVERSE_PENDING = 14;
	
	public AllocReportType() {
		super(794);
	}

	public AllocReportType(int data) {
		super(794, data);
	}
}