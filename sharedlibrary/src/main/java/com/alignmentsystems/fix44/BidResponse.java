
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class BidResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "l";
	

	public BidResponse() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public void set(com.alignmentsystems.fix44.field.BidID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidID get(com.alignmentsystems.fix44.field.BidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidID getBidID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidID field) {
		return isSetField(field);
	}

	public boolean isSetBidID() {
		return isSetField(390);
	}

	public void set(com.alignmentsystems.fix44.field.ClientBidID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClientBidID get(com.alignmentsystems.fix44.field.ClientBidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClientBidID getClientBidID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClientBidID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClientBidID field) {
		return isSetField(field);
	}

	public boolean isSetClientBidID() {
		return isSetField(391);
	}

	public void set(com.alignmentsystems.fix44.field.NoBidComponents value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoBidComponents get(com.alignmentsystems.fix44.field.NoBidComponents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoBidComponents getNoBidComponents() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoBidComponents());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoBidComponents field) {
		return isSetField(field);
	}

	public boolean isSetNoBidComponents() {
		return isSetField(420);
	}

	public static class NoBidComponents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {12, 13, 479, 497, 66, 421, 54, 44, 423, 406, 430, 63, 64, 336, 625, 58, 354, 355, 0};

		public NoBidComponents() {
			super(420, 12, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.component.CommissionData component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.CommissionData get(com.alignmentsystems.fix44.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.CommissionData());
	}

	public void set(com.alignmentsystems.fix44.field.Commission value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Commission get(com.alignmentsystems.fix44.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Commission getCommission() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Commission());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(com.alignmentsystems.fix44.field.CommType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CommType get(com.alignmentsystems.fix44.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CommType getCommType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CommType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(com.alignmentsystems.fix44.field.CommCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CommCurrency get(com.alignmentsystems.fix44.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CommCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(com.alignmentsystems.fix44.field.FundRenewWaiv value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.FundRenewWaiv get(com.alignmentsystems.fix44.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.FundRenewWaiv());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

	public void set(com.alignmentsystems.fix44.field.ListID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListID get(com.alignmentsystems.fix44.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListID getListID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(com.alignmentsystems.fix44.field.Country value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Country get(com.alignmentsystems.fix44.field.Country value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Country getCountry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Country());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Country field) {
		return isSetField(field);
	}

	public boolean isSetCountry() {
		return isSetField(421);
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

	public void set(com.alignmentsystems.fix44.field.Price value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Price get(com.alignmentsystems.fix44.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Price getPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Price());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(com.alignmentsystems.fix44.field.PriceType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PriceType get(com.alignmentsystems.fix44.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PriceType getPriceType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PriceType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(com.alignmentsystems.fix44.field.FairValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.FairValue get(com.alignmentsystems.fix44.field.FairValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.FairValue getFairValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.FairValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.FairValue field) {
		return isSetField(field);
	}

	public boolean isSetFairValue() {
		return isSetField(406);
	}

	public void set(com.alignmentsystems.fix44.field.NetGrossInd value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetGrossInd get(com.alignmentsystems.fix44.field.NetGrossInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetGrossInd());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetGrossInd field) {
		return isSetField(field);
	}

	public boolean isSetNetGrossInd() {
		return isSetField(430);
	}

	public void set(com.alignmentsystems.fix44.field.SettlType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlType get(com.alignmentsystems.fix44.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlType getSettlType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(com.alignmentsystems.fix44.field.SettlDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlDate get(com.alignmentsystems.fix44.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
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

}
