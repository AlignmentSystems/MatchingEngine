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

public class SecurityListTypeSource extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1471;
	public static final int ICB_PUBLISHED_BY_DOW_JONES_AND_FTSE_WWW_ICBENCHMARK_COM = 1;
	public static final int NAICS_WWW_CENSUS_GOV_NAICS_OR_WWW_NAICS_COM_ = 2;
	public static final int GICS_PUBLISHED_BY_STANDARDS_POOR = 3;
	
	public SecurityListTypeSource() {
		super(1471);
	}

	public SecurityListTypeSource(int data) {
		super(1471, data);
	}
}