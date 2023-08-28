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

public class PosType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 703;
	public static final String ALLOCATION_TRADE_QTY = "ALC";
	public static final String OPTION_ASSIGNMENT = "AS";
	public static final String AS_OF_TRADE_QTY = "ASF";
	public static final String DELIVERY_QTY = "DLV";
	public static final String ELECTRONIC_TRADE_QTY = "ETR";
	public static final String OPTION_EXERCISE_QTY = "EX";
	public static final String END_OF_DAY_QTY = "FIN";
	public static final String INTRA_SPREAD_QTY = "IAS";
	public static final String INTER_SPREAD_QTY = "IES";
	public static final String ADJUSTMENT_QTY = "PA";
	public static final String PIT_TRADE_QTY = "PIT";
	public static final String START_OF_DAY_QTY = "SOD";
	public static final String INTEGRAL_SPLIT = "SPL";
	public static final String TRANSACTION_FROM_ASSIGNMENT = "TA";
	public static final String TOTAL_TRANSACTION_QTY = "TOT";
	public static final String TRANSACTION_QUANTITY = "TQ";
	public static final String TRANSFER_TRADE_QTY = "TRF";
	public static final String TRANSACTION_FROM_EXERCISE = "TX";
	public static final String CROSS_MARGIN_QTY = "XM";
	public static final String RECEIVE_QUANTITY = "RCV";
	public static final String CORPORATE_ACTION_ADJUSTMENT = "CAA";
	public static final String DELIVERY_NOTICE_QTY = "DN";
	public static final String EXCHANGE_FOR_PHYSICAL_QTY = "EP";
	public static final String PRIVATELY_NEGOTIATED_TRADE_QTY = "PNTN";
	public static final String NET_DELTA_QTY = "DLT";
	public static final String CREDIT_EVENT_ADJUSTMENT = "CEA";
	public static final String SUCCESSION_EVENT_ADJUSTMENT = "SEA";
	
	public PosType() {
		super(703);
	}

	public PosType(String data) {
		super(703, data);
	}
}