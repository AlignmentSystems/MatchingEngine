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

public class TradeCondition extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 277;
	public static final String CASH_MARKET = "A";
	public static final String AVERAGE_PRICE_TRADE = "B";
	public static final String CASH_TRADE = "C";
	public static final String NEXT_DAY_MARKET = "D";
	public static final String OPENING_REOPENING_TRADE_DETAIL = "E";
	public static final String INTRADAY_TRADE_DETAIL = "F";
	public static final String RULE_127_TRADE = "G";
	public static final String RULE_155_TRADE = "H";
	public static final String SOLD_LAST = "I";
	public static final String NEXT_DAY_TRADE = "J";
	public static final String OPENED = "K";
	public static final String SELLER = "L";
	public static final String SOLD = "M";
	public static final String STOPPED_STOCK = "N";
	public static final String IMBALANCE_MORE_BUYERS = "P";
	public static final String IMBALANCE_MORE_SELLERS = "Q";
	public static final String OPENING_PRICE = "R";
	public static final String BARGAIN_CONDITION = "S";
	public static final String CONVERTED_PRICE_INDICATOR = "T";
	public static final String EXCHANGE_LAST = "U";
	public static final String FINAL_PRICE_OF_SESSION = "V";
	public static final String EX_PIT = "W";
	public static final String CROSSED = "X";
	public static final String TRADES_RESULTING_FROM_MANUAL_SLOW_QUOTE = "Y";
	public static final String TRADES_RESULTING_FROM_INTERMARKET_SWEEP = "Z";
	public static final String VOLUME_ONLY = "a";
	public static final String DIRECT_PLUS = "b";
	public static final String ACQUISITION = "c";
	public static final String BUNCHED = "d";
	public static final String DISTRIBUTION = "e";
	public static final String BUNCHED_SALE = "f";
	public static final String SPLIT_TRADE = "g";
	public static final String CANCEL_STOPPED = "h";
	public static final String CANCEL_ETH = "i";
	public static final String CANCEL_STOPPED_ETH = "j";
	public static final String OUT_OF_SEQUENCE_ETH = "k";
	public static final String CANCEL_LAST_ETH = "l";
	public static final String SOLD_LAST_SALE_ETH = "m";
	public static final String CANCEL_LAST = "n";
	public static final String SOLD_LAST_SALE = "o";
	public static final String CANCEL_OPEN = "p";
	public static final String CANCEL_OPEN_ETH = "q";
	public static final String OPENED_SALE_ETH = "r";
	public static final String CANCEL_ONLY = "s";
	public static final String CANCEL_ONLY_ETH = "t";
	public static final String LATE_OPEN_ETH = "u";
	public static final String AUTO_EXECUTION_ETH = "v";
	public static final String REOPEN = "w";
	public static final String REOPEN_ETH = "x";
	public static final String ADJUSTED = "y";
	public static final String ADJUSTED_ETH = "z";
	public static final String SPREAD = "AA";
	public static final String SPREAD_ETH = "AB";
	public static final String STRADDLE = "AC";
	public static final String STRADDLE_ETH = "AD";
	public static final String STOPPED = "AE";
	public static final String STOPPED_ETH = "AF";
	public static final String REGULAR_ETH = "AG";
	public static final String COMBO = "AH";
	public static final String COMBO_ETH = "AI";
	public static final String OFFICIAL_CLOSING_PRICE = "AJ";
	public static final String PRIOR_REFERENCE_PRICE = "AK";
	public static final String CANCEL = "0";
	public static final String STOPPED_SOLD_LAST = "AL";
	public static final String STOPPED_OUT_OF_SEQUENCE = "AM";
	public static final String OFFICAL_CLOSING_PRICE = "AN";
	public static final String CROSSED_1 = "AO";
	public static final String FAST_MARKET = "AP";
	public static final String AUTOMATIC_EXECUTION = "AQ";
	public static final String FORM_T = "AR";
	public static final String BASKET_INDEX = "AS";
	public static final String BURST_BASKET = "AT";
	public static final String OUTSIDE_SPREAD = "AV";
	public static final String IMPLIED_TRADE = "1";
	public static final String MARKETPLACE_ENTERED_TRADE = "2";
	public static final String MULT_ASSET_CLASS_MULTILEG_TRADE = "3";
	public static final String MULTILEG_TO_MULTILEG_TRADE = "4";
	
	public TradeCondition() {
		super(277);
	}

	public TradeCondition(String data) {
		super(277, data);
	}
}