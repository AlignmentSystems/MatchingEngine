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

public class ApplReqType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1347;
	public static final int RETRANSMISSION_OF_APPLICATION_MESSAGES_FOR_THE_SPECIFIED_APPLICATIONS = 0;
	public static final int SUBSCRIPTION_TO_THE_SPECIFIED_APPLICATIONS = 1;
	public static final int REQUEST_FOR_THE_LAST_APPLLASTSEQNUM_PUBLISHED_FOR_THE_SPECIFIED_APPLICATIONS = 2;
	public static final int REQUEST_VALID_SET_OF_APPLICATIONS = 3;
	public static final int UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS = 4;
	public static final int CANCEL_RETRANSMISSION = 5;
	public static final int CANCEL_RETRANSMISSION_AND_UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS = 6;
	
	public ApplReqType() {
		super(1347);
	}

	public ApplReqType(int data) {
		super(1347, data);
	}
}