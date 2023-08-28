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

public class StipulationType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 233;
	public static final String ALTERNATIVE_MINIMUM_TAX = "AMT";
	public static final String ABSOLUTE_PREPAYMENT_SPEED = "ABS";
	public static final String AUTO_REINVESTMENT_AT_RATE_OR_BETTER = "AUTOREINV";
	public static final String CONSTANT_PREPAYMENT_PENALTY = "CPP";
	public static final String BANK_QUALIFIED = "BANKQUAL";
	public static final String CONSTANT_PREPAYMENT_RATE = "CPR";
	public static final String BARGAIN_CONDITIONS = "BGNCON";
	public static final String CONSTANT_PREPAYMENT_YIELD = "CPY";
	public static final String COUPON_RANGE = "COUPON";
	public static final String FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE = "HEP";
	public static final String ISO_CURRENCY_CODE = "CURRENCY";
	public static final String PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE = "MHP";
	public static final String CUSTOM_START_END_DATE = "CUSTOMDATE";
	public static final String MONTHLY_PREPAYMENT_RATE = "MPR";
	public static final String GEOGRAPHICS_AND_RANGE = "GEOG";
	public static final String PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE = "PPC";
	public static final String VALUATION_DISCOUNT = "HAIRCUT";
	public static final String PERCENT_OF_BMA_PREPAYMENT_CURVE = "PSA";
	public static final String INSURED = "INSURED";
	public static final String SINGLE_MONTHLY_MORTALITY = "SMM";
	public static final String YEAR_OR_YEAR_MONTH_OF_ISSUE = "ISSUE";
	public static final String ISSUERS_TICKER = "ISSUER";
	public static final String ISSUE_SIZE_RANGE = "ISSUESIZE";
	public static final String LOOKBACK_DAYS = "LOOKBACK";
	public static final String EXPLICIT_LOT_IDENTIFIER = "LOT";
	public static final String LOT_VARIANCE = "LOTVAR";
	public static final String MATURITY_YEAR_AND_MONTH = "MAT";
	public static final String MATURITY_RANGE = "MATURITY";
	public static final String MAXIMUM_SUBSTITUTIONS = "MAXSUBS";
	public static final String MINIMUM_DENOMINATION = "MINDNOM";
	public static final String MINIMUM_INCREMENT = "MININCR";
	public static final String MINIMUM_QUANTITY = "MINQTY";
	public static final String PAYMENT_FREQUENCY_CALENDAR = "PAYFREQ";
	public static final String NUMBER_OF_PIECES = "PIECES";
	public static final String POOLS_MAXIMUM = "PMAX";
	public static final String POOLS_PER_LOT = "PPL";
	public static final String POOLS_PER_MILLION = "PPM";
	public static final String POOLS_PER_TRADE = "PPT";
	public static final String PRICE_RANGE = "PRICE";
	public static final String PRICING_FREQUENCY = "PRICEFREQ";
	public static final String PRODUCTION_YEAR = "PROD";
	public static final String CALL_PROTECTION = "PROTECT";
	public static final String PURPOSE = "PURPOSE";
	public static final String BENCHMARK_PRICE_SOURCE = "PXSOURCE";
	public static final String RATING_SOURCE_AND_RANGE = "RATING";
	public static final String TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE = "REDEMPTION";
	public static final String RESTRICTED = "RESTRICTED";
	public static final String MARKET_SECTOR = "SECTOR";
	public static final String SECURITY_TYPE_INCLUDED_OR_EXCLUDED = "SECTYPE";
	public static final String STRUCTURE = "STRUCT";
	public static final String SUBSTITUTIONS_FREQUENCY = "SUBSFREQ";
	public static final String SUBSTITUTIONS_LEFT = "SUBSLEFT";
	public static final String FREEFORM_TEXT = "TEXT";
	public static final String TRADE_VARIANCE = "TRDVAR";
	public static final String WEIGHTED_AVERAGE_COUPON_VALUE_IN_PERCENT = "WAC";
	public static final String WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT = "WAL";
	public static final String WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS = "WALA";
	public static final String WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS = "WAM";
	public static final String WHOLE_POOL = "WHOLE";
	public static final String YIELD_RANGE = "YIELD";
	public static final String AVERAGE_FICO_SCORE = "AVFICO";
	public static final String AVERAGE_LOAN_SIZE = "AVSIZE";
	public static final String MAXIMUM_LOAN_BALANCE = "MAXBAL";
	public static final String POOL_IDENTIFIER = "POOL";
	public static final String TYPE_OF_ROLL_TRADE = "ROLLTYPE";
	public static final String REFERENCE_TO_ROLLING_OR_CLOSING_TRADE = "REFTRADE";
	public static final String PRINCIPAL_OF_ROLLING_OR_CLOSING_TRADE = "REFPRIN";
	public static final String INTEREST_OF_ROLLING_OR_CLOSING_TRADE = "REFINT";
	public static final String AVAILABLE_OFFER_QUANTITY_TO_BE_SHOWN_TO_THE_STREET = "AVAILQTY";
	public static final String BROKERS_SALES_CREDIT = "BROKERCREDIT";
	public static final String OFFER_PRICE_TO_BE_SHOWN_TO_INTERNAL_BROKERS = "INTERNALPX";
	public static final String OFFER_QUANTITY_TO_BE_SHOWN_TO_INTERNAL_BROKERS = "INTERNALQTY";
	public static final String THE_MINIMUM_RESIDUAL_OFFER_QUANTITY = "LEAVEQTY";
	public static final String MAXIMUM_ORDER_SIZE = "MAXORDQTY";
	public static final String ORDER_QUANTITY_INCREMENT = "ORDRINCR";
	public static final String PRIMARY_OR_SECONDARY_MARKET_INDICATOR = "PRIMARY";
	public static final String BROKER_SALES_CREDIT_OVERRIDE = "SALESCREDITOVR";
	public static final String TRADERS_CREDIT = "TRADERCREDIT";
	public static final String DISCOUNT_RATE = "DISCOUNT";
	public static final String YIELD_TO_MATURITY = "YTM";
	
	public StipulationType() {
		super(233);
	}

	public StipulationType(String data) {
		super(233, data);
	}
}