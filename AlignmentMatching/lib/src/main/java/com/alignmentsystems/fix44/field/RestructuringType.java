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

import quickfix.StringField;

public class RestructuringType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1449;
	public static final String FULL_RESTRUCTURING = "FR";
	public static final String MODIFIED_RESTRUCTURING = "MR";
	public static final String MODIFIED_MOD_RESTRUCTURING = "MM";
	public static final String NO_RESTRUCTURING_SPECIFIED = "XR";
	
	public RestructuringType() {
		super(1449);
	}

	public RestructuringType(String data) {
		super(1449, data);
	}
}