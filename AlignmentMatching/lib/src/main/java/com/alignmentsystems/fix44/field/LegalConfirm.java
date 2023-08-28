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

public class LegalConfirm extends BooleanField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 650;
	public static final boolean DOES_NOT_CONSITUTE_A_LEGAL_CONFIRM = false;
	public static final boolean LEGAL_CONFIRM = true;
	
	public LegalConfirm() {
		super(650);
	}

	public LegalConfirm(boolean data) {
		super(650, data);
	}
}