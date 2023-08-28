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

public class TrdType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 828;
	public static final int REGULAR_TRADE = 0;
	public static final int BLOCK_TRADE = 1;
	public static final int EFP = 2;
	public static final int TRANSFER = 3;
	public static final int LATE_TRADE = 4;
	public static final int T_TRADE = 5;
	public static final int WEIGHTED_AVERAGE_PRICE_TRADE = 6;
	public static final int BUNCHED_TRADE = 7;
	public static final int LATE_BUNCHED_TRADE = 8;
	public static final int PRIOR_REFERENCE_PRICE_TRADE = 9;
	public static final int AFTER_HOURS_TRADE = 10;
	public static final int EXCHANGE_FOR_RISK = 11;
	public static final int EXCHANGE_FOR_SWAP = 12;
	public static final int EXCHANGE_OF_FUTURES_FOR = 13;
	public static final int EXCHANGE_OF_OPTIONS_FOR_OPTIONS = 14;
	public static final int TRADING_AT_SETTLEMENT = 15;
	public static final int ALL_OR_NONE = 16;
	public static final int FUTURES_LARGE_ORDER_EXECUTION = 17;
	public static final int EXCHANGE_OF_FUTURES_FOR_FUTURES = 18;
	public static final int OPTION_INTERIM_TRADE = 19;
	public static final int OPTION_CABINET_TRADE = 20;
	public static final int PRIVATELY_NEGOTIATED_TRADES = 22;
	public static final int SUBSTITUTION_OF_FUTURES_FOR_FORWARDS = 23;
	public static final int ERROR_TRADE = 24;
	public static final int SPECIAL_CUM_DIVIDEND = 25;
	public static final int SPECIAL_EX_DIVIDEND = 26;
	public static final int SPECIAL_CUM_COUPON = 27;
	public static final int SPECIAL_EX_COUPON = 28;
	public static final int CASH_SETTLEMENT = 29;
	public static final int SPECIAL_PRICE = 30;
	public static final int GUARANTEED_DELIVERY = 31;
	public static final int SPECIAL_CUM_RIGHTS = 32;
	public static final int SPECIAL_EX_RIGHTS = 33;
	public static final int SPECIAL_CUM_CAPITAL_REPAYMENTS = 34;
	public static final int SPECIAL_EX_CAPITAL_REPAYMENTS = 35;
	public static final int SPECIAL_CUM_BONUS = 36;
	public static final int SPECIAL_EX_BONUS = 37;
	public static final int BLOCK_TRADE_1 = 38;
	public static final int WORKED_PRINCIPAL_TRADE = 39;
	public static final int BLOCK_TRADES_AFTER_MARKET = 40;
	public static final int NAME_CHANGE = 41;
	public static final int PORTFOLIO_TRANSFER = 42;
	public static final int PROROGATION_BUY_EURONEXT_PARIS_ONLY_IS_USED_TO_DEFER_SETTLEMENT_UNDER_FRENCH_SRD_TRADES_MUST_BE_REPORTED_AS_CROSSES_AT_ZERO_PRICE = 43;
	public static final int PROROGATION_SELL_SEE_PROROGATION_BUY = 44;
	public static final int OPTION_EXERCISE = 45;
	public static final int DELTA_NEUTRAL_TRANSACTION = 46;
	public static final int FINANCING_TRANSACTION = 47;
	public static final int NON_STANDARD_SETTLEMENT = 48;
	public static final int DERIVATIVE_RELATED_TRANSACTION = 49;
	public static final int PORTFOLIO_TRADE = 50;
	public static final int VOLUME_WEIGHTED_AVERAGE_TRADE = 51;
	public static final int EXCHANGE_GRANTED_TRADE = 52;
	public static final int REPURCHASE_AGREEMENT = 53;
	public static final int OTC = 54;
	public static final int EXCHANGE_BASIS_FACILITY = 55;
	
	public TrdType() {
		super(828);
	}

	public TrdType(int data) {
		super(828, data);
	}
}