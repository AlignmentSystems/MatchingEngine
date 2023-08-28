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

import quickfix.CharField;

public class Rule80A extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 47;
	public static final char AGENCY_SINGLE_ORDER = 'A';
	public static final char SHORT_EXEMPT_TRANSACTION_REFER_TO_A_TYPE = 'B';
	public static final char PROGRAM_ORDER_NON_INDEX_ARB_FOR_MEMBER_FIRM = 'C';
	public static final char PROGRAM_ORDER_INDEX_ARB_FOR_MEMBER_FIRM = 'D';
	public static final char SHORT_EXEMPT_TRANSACTION_FOR_PRINCIPAL = 'E';
	public static final char SHORT_EXEMPT_TRANSACTION_REFER_TO_W_TYPE = 'F';
	public static final char SHORT_EXEMPT_TRANSACTION_REFER_TO_I_TYPE = 'H';
	public static final char INDIVIDUAL_INVESTOR = 'I';
	public static final char PROGRAM_ORDER_INDEX_ARB_FOR_INDIVIDUAL_CUSTOMER = 'J';
	public static final char PROGRAM_ORDER_NON_INDEX_ARB_FOR_INDIVIDUAL_CUSTOMER = 'K';
	public static final char SHORT_EXEMPT_AFFILIATED = 'L';
	public static final char PROGRAM_ORDER_INDEX_ARB_FOR_OTHER_MEMBER = 'M';
	public static final char PROGRAM_ORDER_NON_INDEX_ARB_FOR_OTHER_MEMBER = 'N';
	public static final char PROPRIETARY_AFFILIATED = 'O';
	public static final char PRINCIPAL = 'P';
	public static final char TRANSACTIONS_NON_MEMBER = 'R';
	public static final char SPECIALIST_TRADES = 'S';
	public static final char TRANSACTIONS_UNAFFILIATED_MEMBER = 'T';
	public static final char PROGRAM_ORDER_INDEX_ARB_FOR_OTHER_AGENCY = 'U';
	public static final char ALL_OTHER_ORDERS_AS_AGENT_FOR_OTHER_MEMBER = 'W';
	public static final char SHORT_EXEMPT_NOT_AFFILIATED = 'X';
	public static final char PROGRAM_ORDER_NON_INDEX_ARB_FOR_OTHER_AGENCY = 'Y';
	public static final char SHORT_EXEMPT_NONMEMBER = 'Z';
	
	public Rule80A() {
		super(47);
	}

	public Rule80A(char data) {
		super(47, data);
	}
}