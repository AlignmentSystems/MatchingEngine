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

public class MDImplicitDelete extends BooleanField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 547;
	public static final boolean SERVER_MUST_SEND_AN_EXPLICIT_DELETE_FOR_BIDS_OR_OFFERS_FALLING_OUTSIDE_THE_REQUESTED_MARKETDEPTH_OF_THE_REQUEST = false;
	public static final boolean CLIENT_HAS_RESPONSIBILITY_FOR_IMPLICITLY_DELETING_BIDS_OR_OFFERS_FALLING_OUTSIDE_THE_MARKETDEPTH_OF_THE_REQUEST = true;
	
	public MDImplicitDelete() {
		super(547);
	}

	public MDImplicitDelete(boolean data) {
		super(547, data);
	}
}