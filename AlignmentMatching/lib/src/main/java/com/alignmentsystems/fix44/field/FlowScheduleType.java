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

public class FlowScheduleType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1439;
	public static final int NERC_EASTERN_OFF_PEAK = 0;
	public static final int NERC_WESTERN_OFF_PEAK = 1;
	public static final int NERC_CALENDAR_ALL_DAYS_IN_MONTH = 2;
	public static final int NERC_EASTERN_PEAK = 3;
	public static final int NERC_WESTERN_PEAK = 4;
	
	public FlowScheduleType() {
		super(1439);
	}

	public FlowScheduleType(int data) {
		super(1439, data);
	}
}