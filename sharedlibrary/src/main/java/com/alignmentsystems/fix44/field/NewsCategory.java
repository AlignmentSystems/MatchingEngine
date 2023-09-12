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

public class NewsCategory extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1473;
	public static final int COMPANY_NEWS = 0;
	public static final int MARKETPLACE_NEWS = 1;
	public static final int FINANCIAL_MARKET_NEWS = 2;
	public static final int TECHNICAL_NEWS = 3;
	public static final int OTHER_NEWS = 99;
	
	public NewsCategory() {
		super(1473);
	}

	public NewsCategory(int data) {
		super(1473, data);
	}
}