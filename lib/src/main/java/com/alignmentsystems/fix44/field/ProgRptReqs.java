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

public class ProgRptReqs extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 414;
	public static final int BUY_SIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUE_REQUEST_THE_SELL_SIDE_FIRM_CAN_HOWEVER_SEND_A_DONE_STATUS_LIST_STATUS_RESPONSE_IN_AN_UNSOLICITED_FASHION = 1;
	public static final int SELL_SIDE_PERIODICALLY_SENDS_STATUS_USING_LIST_STATUS_PERIOD_OPTIONALLY_SPECIFIED_IN_PROGRESSPERIOD_ = 2;
	public static final int REAL_TIME_EXECUTION_REPORTS = 3;
	
	public ProgRptReqs() {
		super(414);
	}

	public ProgRptReqs(int data) {
		super(414, data);
	}
}