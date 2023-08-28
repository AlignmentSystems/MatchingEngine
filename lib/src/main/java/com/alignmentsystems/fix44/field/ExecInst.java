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

public class ExecInst extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 18;
	public static final char STAY_ON_OFFER_SIDE = '0';
	public static final char NOT_HELD = '1';
	public static final char WORK = '2';
	public static final char GO_ALONG = '3';
	public static final char OVER_THE_DAY = '4';
	public static final char HELD = '5';
	public static final char PARTICIPATE_DONT_INITIATE = '6';
	public static final char STRICT_SCALE = '7';
	public static final char TRY_TO_SCALE = '8';
	public static final char STAY_ON_BID_SIDE = '9';
	public static final char NO_CROSS = 'A';
	public static final char OK_TO_CROSS = 'B';
	public static final char CALL_FIRST = 'C';
	public static final char PERCENT_OF_VOLUME = 'D';
	public static final char DO_NOT_INCREASE_DNI = 'E';
	public static final char DO_NOT_REDUCE_DNR = 'F';
	public static final char ALL_OR_NONE_AON = 'G';
	public static final char REINSTATE_ON_SYSTEM_FAILURE = 'H';
	public static final char INSTITUTIONS_ONLY = 'I';
	public static final char REINSTATE_ON_TRADING_HALT = 'J';
	public static final char CANCEL_ON_TRADING_HALT = 'K';
	public static final char LAST_PEG = 'L';
	public static final char MID_PRICE_PEG = 'M';
	public static final char NON_NEGOTIABLE = 'N';
	public static final char OPENING_PEG = 'O';
	public static final char MARKET_PEG = 'P';
	public static final char CANCEL_ON_SYSTEM_FAILURE = 'Q';
	public static final char PRIMARY_PEG = 'R';
	public static final char SUSPEND = 'S';
	public static final char FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = 'T';
	public static final char CUSTOMER_DISPLAY_INSTRUCTION = 'U';
	public static final char NETTING = 'V';
	public static final char PEG_TO_VWAP = 'W';
	public static final char TRADE_ALONG = 'X';
	public static final char TRY_TO_STOP = 'Y';
	public static final char CANCEL_IF_NOT_BEST = 'Z';
	public static final char TRAILING_STOP_PEG = 'a';
	public static final char STRICT_LIMIT = 'b';
	public static final char IGNORE_PRICE_VALIDITY_CHECKS = 'c';
	public static final char PEG_TO_LIMIT_PRICE = 'd';
	public static final char WORK_TO_TARGET_STRATEGY = 'e';
	public static final char INTERMARKET_SWEEP = 'f';
	public static final char EXTERNAL_ROUTING_ALLOWED = 'g';
	public static final char EXTERNAL_ROUTING_NOT_ALLOWED = 'h';
	public static final char IMBALANCE_ONLY = 'i';
	public static final char SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE = 'j';
	public static final char BEST_EXECUTION = 'k';
	public static final char SUSPEND_ON_SYSTEM_FAILURE = 'l';
	public static final char SUSPEND_ON_TRADING_HALT = 'm';
	public static final char REINSTATE_ON_CONNECTION_LOSS = 'n';
	public static final char CANCEL_ON_CONNECTION_LOSS = 'o';
	public static final char SUSPEND_ON_CONNECTION_LOSS = 'p';
	public static final char RELEASE_FROM_SUSPENSION = 'q';
	public static final char EXECUTE_AS_DELTA_NEUTRAL_USING_VOLATILITY_PROVIDED = 'r';
	public static final char EXECUTE_AS_DURATION_NEUTRAL = 's';
	public static final char EXECUTE_AS_FX_NEUTRAL = 't';
	
	public ExecInst() {
		super(18);
	}

	public ExecInst(String data) {
		super(18, data);
	}
}