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

public class ApplReportType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1426;
	public static final int RESET_APPLSEQNUM_TO_NEW_VALUE_SPECIFIED_IN_APPLNEWSEQNUM = 0;
	public static final int REPORTS_THAT_THE_LAST_MESSAGE_HAS_BEEN_SENT_FOR_THE_APPLIDS_REFER_TO_REFAPPLLASTSEQNUM_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_LAST_MESSAGE_ = 1;
	public static final int HEARTBEAT_MESSAGE_INDICATING_THAT_APPLICATION_IDENTIFIED_BY_REFAPPLID_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_PREVIOUS_MESSAGE_ = 2;
	public static final int APPLICATION_MESSAGE_RE_SEND_COMPLETED_ = 3;
	
	public ApplReportType() {
		super(1426);
	}

	public ApplReportType(int data) {
		super(1426, data);
	}
}