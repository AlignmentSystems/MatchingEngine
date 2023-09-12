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

public class TrdSubType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 829;
	public static final int CMTA = 0;
	public static final int INTERNAL_TRANSFER_OR_ADJUSTMENT = 1;
	public static final int EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT = 2;
	public static final int REJECT_FOR_SUBMITTING_SIDE = 3;
	public static final int ADVISORY_FOR_CONTRA_SIDE = 4;
	public static final int OFFSET_DUE_TO_AN_ALLOCATION = 5;
	public static final int ONSET_DUE_TO_AN_ALLOCATION = 6;
	public static final int DIFFERENTIAL_SPREAD = 7;
	public static final int IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = 8;
	public static final int TRANSACTION_FROM_EXERCISE = 9;
	public static final int TRANSACTION_FROM_ASSIGNMENT = 10;
	public static final int ACATS = 11;
	public static final int AI = 14;
	public static final int B = 15;
	public static final int K = 16;
	public static final int LC = 17;
	public static final int M = 18;
	public static final int N = 19;
	public static final int NM_TRANSACTION_WHERE_EXCHANGE_HAS_GRANTED_PERMISSION_FOR_NON_PUBLICATION_II_IDB_IS_REPORTING_AS_SELLER_III_SUBMITTING_A_TRANSACTION_REPORT_TO_THE_EXCHANGE_WHERE_THE_TRANSACTION_REPORT_IS_NOT_ALSO_A_TRADE_REPORT_ = 20;
	public static final int NR = 21;
	public static final int P = 22;
	public static final int PA = 23;
	public static final int PC = 24;
	public static final int PN = 25;
	public static final int R_OR = 26;
	public static final int RO = 27;
	public static final int RT = 28;
	public static final int SW = 29;
	public static final int T = 30;
	public static final int WN = 31;
	public static final int WT = 32;
	public static final int OFF_HOURS_TRADE = 33;
	public static final int ON_HOURS_TRADE = 34;
	public static final int OTC_QUOTE = 35;
	public static final int CONVERTED_SWAP = 36;
	public static final int CROSSED_TRADE = 37;
	public static final int INTERIM_PROTECTED_TRADE = 38;
	public static final int LARGE_IN_SCALE = 39;
	
	public TrdSubType() {
		super(829);
	}

	public TrdSubType(int data) {
		super(829, data);
	}
}