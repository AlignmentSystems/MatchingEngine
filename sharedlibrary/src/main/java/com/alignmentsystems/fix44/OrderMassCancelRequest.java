
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class OrderMassCancelRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "q";
	

	public OrderMassCancelRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public OrderMassCancelRequest(com.alignmentsystems.fix44.field.ClOrdID clOrdID, com.alignmentsystems.fix44.field.MassCancelRequestType massCancelRequestType, com.alignmentsystems.fix44.field.TransactTime transactTime) {
		this();
		setField(clOrdID);
		setField(massCancelRequestType);
		setField(transactTime);
	}
	
	public void set(com.alignmentsystems.fix44.field.ClOrdID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClOrdID get(com.alignmentsystems.fix44.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClOrdID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(com.alignmentsystems.fix44.field.SecondaryClOrdID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryClOrdID get(com.alignmentsystems.fix44.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryClOrdID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(com.alignmentsystems.fix44.field.MassCancelRequestType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MassCancelRequestType get(com.alignmentsystems.fix44.field.MassCancelRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MassCancelRequestType getMassCancelRequestType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MassCancelRequestType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MassCancelRequestType field) {
		return isSetField(field);
	}

	public boolean isSetMassCancelRequestType() {
		return isSetField(530);
	}

	public void set(com.alignmentsystems.fix44.field.TradingSessionID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradingSessionID get(com.alignmentsystems.fix44.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradingSessionID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(com.alignmentsystems.fix44.field.TradingSessionSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradingSessionSubID get(com.alignmentsystems.fix44.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradingSessionSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(com.alignmentsystems.fix44.component.Instrument component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.Instrument get(com.alignmentsystems.fix44.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.Instrument getInstrument() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.Instrument());
	}

	public void set(com.alignmentsystems.fix44.field.Symbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Symbol get(com.alignmentsystems.fix44.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Symbol getSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Symbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(com.alignmentsystems.fix44.field.SymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SymbolSfx get(com.alignmentsystems.fix44.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityID get(com.alignmentsystems.fix44.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityIDSource get(com.alignmentsystems.fix44.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(com.alignmentsystems.fix44.field.NoSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSecurityAltID get(com.alignmentsystems.fix44.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityAltID get(com.alignmentsystems.fix44.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityAltIDSource get(com.alignmentsystems.fix44.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(com.alignmentsystems.fix44.field.Product value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Product get(com.alignmentsystems.fix44.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Product getProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Product());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(com.alignmentsystems.fix44.field.CFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CFICode get(com.alignmentsystems.fix44.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CFICode getCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityType get(com.alignmentsystems.fix44.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(com.alignmentsystems.fix44.field.SecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecuritySubType get(com.alignmentsystems.fix44.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(com.alignmentsystems.fix44.field.MaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MaturityMonthYear get(com.alignmentsystems.fix44.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(com.alignmentsystems.fix44.field.MaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MaturityDate get(com.alignmentsystems.fix44.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(com.alignmentsystems.fix44.field.PutOrCall value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PutOrCall get(com.alignmentsystems.fix44.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PutOrCall());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(com.alignmentsystems.fix44.field.CouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CouponPaymentDate get(com.alignmentsystems.fix44.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(com.alignmentsystems.fix44.field.IssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IssueDate get(com.alignmentsystems.fix44.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(com.alignmentsystems.fix44.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepoCollateralSecurityType get(com.alignmentsystems.fix44.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(com.alignmentsystems.fix44.field.RepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepurchaseTerm get(com.alignmentsystems.fix44.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(com.alignmentsystems.fix44.field.RepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepurchaseRate get(com.alignmentsystems.fix44.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(com.alignmentsystems.fix44.field.Factor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Factor get(com.alignmentsystems.fix44.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Factor getFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Factor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(com.alignmentsystems.fix44.field.CreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CreditRating get(com.alignmentsystems.fix44.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(com.alignmentsystems.fix44.field.InstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InstrRegistry get(com.alignmentsystems.fix44.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(com.alignmentsystems.fix44.field.CountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CountryOfIssue get(com.alignmentsystems.fix44.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(com.alignmentsystems.fix44.field.LocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LocaleOfIssue get(com.alignmentsystems.fix44.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(com.alignmentsystems.fix44.field.RedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RedemptionDate get(com.alignmentsystems.fix44.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(com.alignmentsystems.fix44.field.StrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StrikePrice get(com.alignmentsystems.fix44.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(com.alignmentsystems.fix44.field.StrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StrikeCurrency get(com.alignmentsystems.fix44.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(com.alignmentsystems.fix44.field.OptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OptAttribute get(com.alignmentsystems.fix44.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(com.alignmentsystems.fix44.field.ContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ContractMultiplier get(com.alignmentsystems.fix44.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(com.alignmentsystems.fix44.field.CouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CouponRate get(com.alignmentsystems.fix44.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityExchange get(com.alignmentsystems.fix44.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(com.alignmentsystems.fix44.field.Issuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Issuer get(com.alignmentsystems.fix44.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Issuer getIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Issuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedIssuerLen get(com.alignmentsystems.fix44.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedIssuer get(com.alignmentsystems.fix44.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityDesc get(com.alignmentsystems.fix44.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDesc get(com.alignmentsystems.fix44.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(com.alignmentsystems.fix44.field.Pool value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Pool get(com.alignmentsystems.fix44.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Pool getPool() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Pool());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(com.alignmentsystems.fix44.field.ContractSettlMonth value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ContractSettlMonth get(com.alignmentsystems.fix44.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ContractSettlMonth());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(com.alignmentsystems.fix44.field.CPProgram value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CPProgram get(com.alignmentsystems.fix44.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CPProgram());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(com.alignmentsystems.fix44.field.CPRegType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CPRegType get(com.alignmentsystems.fix44.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CPRegType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(com.alignmentsystems.fix44.field.NoEvents value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoEvents get(com.alignmentsystems.fix44.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoEvents());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.EventType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventType get(com.alignmentsystems.fix44.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventType getEventType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(com.alignmentsystems.fix44.field.EventDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventDate get(com.alignmentsystems.fix44.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventDate getEventDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(com.alignmentsystems.fix44.field.EventPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventPx get(com.alignmentsystems.fix44.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventPx getEventPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(com.alignmentsystems.fix44.field.EventText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventText get(com.alignmentsystems.fix44.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventText getEventText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(com.alignmentsystems.fix44.field.DatedDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DatedDate get(com.alignmentsystems.fix44.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DatedDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(com.alignmentsystems.fix44.field.InterestAccrualDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InterestAccrualDate get(com.alignmentsystems.fix44.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InterestAccrualDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(com.alignmentsystems.fix44.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.UnderlyingInstrument get(com.alignmentsystems.fix44.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.UnderlyingInstrument());
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSymbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbol get(com.alignmentsystems.fix44.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSymbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbolSfx get(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityID get(com.alignmentsystems.fix44.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource get(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID get(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltID get(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource get(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingProduct value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingProduct get(com.alignmentsystems.fix44.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingProduct());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCFICode get(com.alignmentsystems.fix44.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityType get(com.alignmentsystems.fix44.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecuritySubType get(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear get(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityDate get(com.alignmentsystems.fix44.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingMaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingPutOrCall get(com.alignmentsystems.fix44.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingPutOrCall());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate get(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssueDate get(com.alignmentsystems.fix44.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingIssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType get(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm get(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate get(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingFactor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingFactor get(com.alignmentsystems.fix44.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingFactor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCreditRating get(com.alignmentsystems.fix44.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingInstrRegistry get(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue get(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue get(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRedemptionDate get(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikePrice get(com.alignmentsystems.fix44.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency get(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingOptAttribute get(com.alignmentsystems.fix44.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingOptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingContractMultiplier get(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponRate get(com.alignmentsystems.fix44.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityExchange get(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssuer get(com.alignmentsystems.fix44.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen get(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer get(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityDesc get(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc get(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPProgram get(com.alignmentsystems.fix44.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCPProgram());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPRegType get(com.alignmentsystems.fix44.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCPRegType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrency get(com.alignmentsystems.fix44.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingQty get(com.alignmentsystems.fix44.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingPx get(com.alignmentsystems.fix44.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingDirtyPrice get(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndPrice get(com.alignmentsystems.fix44.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingEndPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStartValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStartValue get(com.alignmentsystems.fix44.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStartValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrentValue get(com.alignmentsystems.fix44.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCurrentValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingEndValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndValue get(com.alignmentsystems.fix44.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingEndValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(com.alignmentsystems.fix44.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.UnderlyingStipulations get(com.alignmentsystems.fix44.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.UnderlyingStipulations());
	}

	public void set(com.alignmentsystems.fix44.field.NoUnderlyingStips value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingStips get(com.alignmentsystems.fix44.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoUnderlyingStips());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.UnderlyingStipType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipType get(com.alignmentsystems.fix44.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStipType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStipValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipValue get(com.alignmentsystems.fix44.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStipValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	public void set(com.alignmentsystems.fix44.field.Side value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Side get(com.alignmentsystems.fix44.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Side getSide() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Side());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(com.alignmentsystems.fix44.field.TransactTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TransactTime get(com.alignmentsystems.fix44.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TransactTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(com.alignmentsystems.fix44.field.Text value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Text get(com.alignmentsystems.fix44.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Text getText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Text());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedTextLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedTextLen get(com.alignmentsystems.fix44.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedTextLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedText get(com.alignmentsystems.fix44.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
