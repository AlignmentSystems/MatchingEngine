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

public class SymbolSfx extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 65;
	public static final String EUCP_WITH_LUMP_SUM_INTEREST_RATHER_THAN_DISCOUNT_PRICE = "CD";
	public static final String WHEN_ISSUED_FOR_A_SECURITY_TO_BE_REISSUED_UNDER_AN_OLD_CUSIP_OR_ISIN = "WI";
	
	public SymbolSfx() {
		super(65);
	}

	public SymbolSfx(String data) {
		super(65, data);
	}
}