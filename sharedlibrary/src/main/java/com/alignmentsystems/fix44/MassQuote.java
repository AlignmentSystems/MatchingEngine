
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MassQuote extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "i";
	

	public MassQuote() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public MassQuote(com.alignmentsystems.fix44.field.QuoteID quoteID) {
		this();
		setField(quoteID);
	}
	
	public void set(com.alignmentsystems.fix44.field.QuoteReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteReqID get(com.alignmentsystems.fix44.field.QuoteReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteReqID() {
		return isSetField(131);
	}

	public void set(com.alignmentsystems.fix44.field.QuoteID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteID get(com.alignmentsystems.fix44.field.QuoteID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteID getQuoteID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteID() {
		return isSetField(117);
	}

	public void set(com.alignmentsystems.fix44.field.QuoteType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteType get(com.alignmentsystems.fix44.field.QuoteType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteType getQuoteType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteType field) {
		return isSetField(field);
	}

	public boolean isSetQuoteType() {
		return isSetField(537);
	}

	public void set(com.alignmentsystems.fix44.field.QuoteResponseLevel value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteResponseLevel get(com.alignmentsystems.fix44.field.QuoteResponseLevel value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteResponseLevel getQuoteResponseLevel() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteResponseLevel());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteResponseLevel field) {
		return isSetField(field);
	}

	public boolean isSetQuoteResponseLevel() {
		return isSetField(301);
	}

	public void set(com.alignmentsystems.fix44.component.Parties component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.Parties get(com.alignmentsystems.fix44.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.Parties getParties() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.Parties());
	}

	public void set(com.alignmentsystems.fix44.field.NoPartyIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoPartyIDs get(com.alignmentsystems.fix44.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoPartyIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.PartyID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyID get(com.alignmentsystems.fix44.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyID getPartyID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(com.alignmentsystems.fix44.field.PartyIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyIDSource get(com.alignmentsystems.fix44.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(com.alignmentsystems.fix44.field.PartyRole value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyRole get(com.alignmentsystems.fix44.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyRole());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(com.alignmentsystems.fix44.field.NoPartySubIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoPartySubIDs get(com.alignmentsystems.fix44.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoPartySubIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.PartySubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartySubID get(com.alignmentsystems.fix44.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartySubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(com.alignmentsystems.fix44.field.PartySubIDType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartySubIDType get(com.alignmentsystems.fix44.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartySubIDType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	public void set(com.alignmentsystems.fix44.field.Account value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Account get(com.alignmentsystems.fix44.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Account getAccount() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Account());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(com.alignmentsystems.fix44.field.AcctIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AcctIDSource get(com.alignmentsystems.fix44.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AcctIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(com.alignmentsystems.fix44.field.AccountType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AccountType get(com.alignmentsystems.fix44.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AccountType getAccountType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AccountType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
	}

	public void set(com.alignmentsystems.fix44.field.DefBidSize value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DefBidSize get(com.alignmentsystems.fix44.field.DefBidSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DefBidSize getDefBidSize() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DefBidSize());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DefBidSize field) {
		return isSetField(field);
	}

	public boolean isSetDefBidSize() {
		return isSetField(293);
	}

	public void set(com.alignmentsystems.fix44.field.DefOfferSize value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DefOfferSize get(com.alignmentsystems.fix44.field.DefOfferSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DefOfferSize getDefOfferSize() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DefOfferSize());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DefOfferSize field) {
		return isSetField(field);
	}

	public boolean isSetDefOfferSize() {
		return isSetField(294);
	}

	public void set(com.alignmentsystems.fix44.field.NoQuoteSets value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoQuoteSets get(com.alignmentsystems.fix44.field.NoQuoteSets value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoQuoteSets getNoQuoteSets() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoQuoteSets());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoQuoteSets field) {
		return isSetField(field);
	}

	public boolean isSetNoQuoteSets() {
		return isSetField(296);
	}

	public static class NoQuoteSets extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {302, 311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 315, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 367, 304, 893, 295, 0};

		public NoQuoteSets() {
			super(296, 302, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.QuoteSetID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteSetID get(com.alignmentsystems.fix44.field.QuoteSetID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteSetID getQuoteSetID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteSetID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteSetID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteSetID() {
		return isSetField(302);
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

	public void set(com.alignmentsystems.fix44.field.QuoteSetValidUntilTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteSetValidUntilTime get(com.alignmentsystems.fix44.field.QuoteSetValidUntilTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteSetValidUntilTime getQuoteSetValidUntilTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteSetValidUntilTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteSetValidUntilTime field) {
		return isSetField(field);
	}

	public boolean isSetQuoteSetValidUntilTime() {
		return isSetField(367);
	}

	public void set(com.alignmentsystems.fix44.field.TotNoQuoteEntries value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotNoQuoteEntries get(com.alignmentsystems.fix44.field.TotNoQuoteEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotNoQuoteEntries getTotNoQuoteEntries() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotNoQuoteEntries());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotNoQuoteEntries field) {
		return isSetField(field);
	}

	public boolean isSetTotNoQuoteEntries() {
		return isSetField(304);
	}

	public void set(com.alignmentsystems.fix44.field.LastFragment value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastFragment get(com.alignmentsystems.fix44.field.LastFragment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastFragment getLastFragment() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastFragment());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastFragment field) {
		return isSetField(field);
	}

	public boolean isSetLastFragment() {
		return isSetField(893);
	}

	public void set(com.alignmentsystems.fix44.field.NoQuoteEntries value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoQuoteEntries get(com.alignmentsystems.fix44.field.NoQuoteEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoQuoteEntries getNoQuoteEntries() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoQuoteEntries());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoQuoteEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoQuoteEntries() {
		return isSetField(295);
	}

	public static class NoQuoteEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {299, 55, 65, 48, 22, 454, 460, 461, 167, 762, 200, 541, 201, 224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 864, 873, 874, 555, 132, 133, 134, 135, 62, 188, 190, 189, 191, 631, 632, 633, 634, 60, 336, 625, 64, 40, 193, 192, 642, 643, 15, 0};

		public NoQuoteEntries() {
			super(295, 299, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.QuoteEntryID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QuoteEntryID get(com.alignmentsystems.fix44.field.QuoteEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QuoteEntryID getQuoteEntryID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QuoteEntryID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QuoteEntryID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteEntryID() {
		return isSetField(299);
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

	public void set(com.alignmentsystems.fix44.field.NoLegs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoLegs get(com.alignmentsystems.fix44.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoLegs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.component.InstrumentLeg component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.InstrumentLeg get(com.alignmentsystems.fix44.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.InstrumentLeg());
	}

	public void set(com.alignmentsystems.fix44.field.LegSymbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSymbol get(com.alignmentsystems.fix44.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSymbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(com.alignmentsystems.fix44.field.LegSymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSymbolSfx get(com.alignmentsystems.fix44.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityID get(com.alignmentsystems.fix44.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityIDSource get(com.alignmentsystems.fix44.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(com.alignmentsystems.fix44.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoLegSecurityAltID get(com.alignmentsystems.fix44.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoLegSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.LegSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltID get(com.alignmentsystems.fix44.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltIDSource get(com.alignmentsystems.fix44.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(com.alignmentsystems.fix44.field.LegProduct value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegProduct get(com.alignmentsystems.fix44.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegProduct());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(com.alignmentsystems.fix44.field.LegCFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCFICode get(com.alignmentsystems.fix44.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityType get(com.alignmentsystems.fix44.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecuritySubType get(com.alignmentsystems.fix44.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(com.alignmentsystems.fix44.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegMaturityMonthYear get(com.alignmentsystems.fix44.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegMaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(com.alignmentsystems.fix44.field.LegMaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegMaturityDate get(com.alignmentsystems.fix44.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegMaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(com.alignmentsystems.fix44.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCouponPaymentDate get(com.alignmentsystems.fix44.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(com.alignmentsystems.fix44.field.LegIssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegIssueDate get(com.alignmentsystems.fix44.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegIssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType get(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseTerm get(com.alignmentsystems.fix44.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseRate get(com.alignmentsystems.fix44.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(com.alignmentsystems.fix44.field.LegFactor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegFactor get(com.alignmentsystems.fix44.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegFactor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(com.alignmentsystems.fix44.field.LegCreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCreditRating get(com.alignmentsystems.fix44.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(com.alignmentsystems.fix44.field.LegInstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegInstrRegistry get(com.alignmentsystems.fix44.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegInstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(com.alignmentsystems.fix44.field.LegCountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCountryOfIssue get(com.alignmentsystems.fix44.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(com.alignmentsystems.fix44.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegLocaleOfIssue get(com.alignmentsystems.fix44.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegLocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(com.alignmentsystems.fix44.field.LegRedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRedemptionDate get(com.alignmentsystems.fix44.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(com.alignmentsystems.fix44.field.LegStrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStrikePrice get(com.alignmentsystems.fix44.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(com.alignmentsystems.fix44.field.LegStrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStrikeCurrency get(com.alignmentsystems.fix44.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(com.alignmentsystems.fix44.field.LegOptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegOptAttribute get(com.alignmentsystems.fix44.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegOptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(com.alignmentsystems.fix44.field.LegContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegContractMultiplier get(com.alignmentsystems.fix44.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(com.alignmentsystems.fix44.field.LegCouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCouponRate get(com.alignmentsystems.fix44.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityExchange get(com.alignmentsystems.fix44.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(com.alignmentsystems.fix44.field.LegIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegIssuer get(com.alignmentsystems.fix44.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuerLen get(com.alignmentsystems.fix44.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuer get(com.alignmentsystems.fix44.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityDesc get(com.alignmentsystems.fix44.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDesc get(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(com.alignmentsystems.fix44.field.LegRatioQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRatioQty get(com.alignmentsystems.fix44.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRatioQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(com.alignmentsystems.fix44.field.LegSide value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSide get(com.alignmentsystems.fix44.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSide getLegSide() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSide());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(com.alignmentsystems.fix44.field.LegCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCurrency get(com.alignmentsystems.fix44.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(com.alignmentsystems.fix44.field.LegPool value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegPool get(com.alignmentsystems.fix44.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegPool getLegPool() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegPool());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(com.alignmentsystems.fix44.field.LegDatedDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegDatedDate get(com.alignmentsystems.fix44.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegDatedDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(com.alignmentsystems.fix44.field.LegContractSettlMonth value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegContractSettlMonth get(com.alignmentsystems.fix44.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegContractSettlMonth());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(com.alignmentsystems.fix44.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegInterestAccrualDate get(com.alignmentsystems.fix44.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegInterestAccrualDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	}

	public void set(com.alignmentsystems.fix44.field.BidPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidPx get(com.alignmentsystems.fix44.field.BidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidPx getBidPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidPx field) {
		return isSetField(field);
	}

	public boolean isSetBidPx() {
		return isSetField(132);
	}

	public void set(com.alignmentsystems.fix44.field.OfferPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferPx get(com.alignmentsystems.fix44.field.OfferPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferPx getOfferPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferPx field) {
		return isSetField(field);
	}

	public boolean isSetOfferPx() {
		return isSetField(133);
	}

	public void set(com.alignmentsystems.fix44.field.BidSize value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidSize get(com.alignmentsystems.fix44.field.BidSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidSize getBidSize() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidSize());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidSize field) {
		return isSetField(field);
	}

	public boolean isSetBidSize() {
		return isSetField(134);
	}

	public void set(com.alignmentsystems.fix44.field.OfferSize value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferSize get(com.alignmentsystems.fix44.field.OfferSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferSize getOfferSize() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferSize());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferSize field) {
		return isSetField(field);
	}

	public boolean isSetOfferSize() {
		return isSetField(135);
	}

	public void set(com.alignmentsystems.fix44.field.ValidUntilTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ValidUntilTime get(com.alignmentsystems.fix44.field.ValidUntilTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ValidUntilTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ValidUntilTime field) {
		return isSetField(field);
	}

	public boolean isSetValidUntilTime() {
		return isSetField(62);
	}

	public void set(com.alignmentsystems.fix44.field.BidSpotRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidSpotRate get(com.alignmentsystems.fix44.field.BidSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidSpotRate getBidSpotRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidSpotRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetBidSpotRate() {
		return isSetField(188);
	}

	public void set(com.alignmentsystems.fix44.field.OfferSpotRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferSpotRate get(com.alignmentsystems.fix44.field.OfferSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferSpotRate getOfferSpotRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferSpotRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetOfferSpotRate() {
		return isSetField(190);
	}

	public void set(com.alignmentsystems.fix44.field.BidForwardPoints value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidForwardPoints get(com.alignmentsystems.fix44.field.BidForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidForwardPoints getBidForwardPoints() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidForwardPoints());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetBidForwardPoints() {
		return isSetField(189);
	}

	public void set(com.alignmentsystems.fix44.field.OfferForwardPoints value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferForwardPoints get(com.alignmentsystems.fix44.field.OfferForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferForwardPoints getOfferForwardPoints() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferForwardPoints());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetOfferForwardPoints() {
		return isSetField(191);
	}

	public void set(com.alignmentsystems.fix44.field.MidPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MidPx get(com.alignmentsystems.fix44.field.MidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MidPx getMidPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MidPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MidPx field) {
		return isSetField(field);
	}

	public boolean isSetMidPx() {
		return isSetField(631);
	}

	public void set(com.alignmentsystems.fix44.field.BidYield value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidYield get(com.alignmentsystems.fix44.field.BidYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidYield getBidYield() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidYield());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidYield field) {
		return isSetField(field);
	}

	public boolean isSetBidYield() {
		return isSetField(632);
	}

	public void set(com.alignmentsystems.fix44.field.MidYield value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MidYield get(com.alignmentsystems.fix44.field.MidYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MidYield getMidYield() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MidYield());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MidYield field) {
		return isSetField(field);
	}

	public boolean isSetMidYield() {
		return isSetField(633);
	}

	public void set(com.alignmentsystems.fix44.field.OfferYield value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferYield get(com.alignmentsystems.fix44.field.OfferYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferYield getOfferYield() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferYield());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferYield field) {
		return isSetField(field);
	}

	public boolean isSetOfferYield() {
		return isSetField(634);
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

	public void set(com.alignmentsystems.fix44.field.OrdType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrdType get(com.alignmentsystems.fix44.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrdType getOrdType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrdType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(com.alignmentsystems.fix44.field.SettlDate2 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlDate2 get(com.alignmentsystems.fix44.field.SettlDate2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlDate2 getSettlDate2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlDate2());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlDate2 field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate2() {
		return isSetField(193);
	}

	public void set(com.alignmentsystems.fix44.field.OrderQty2 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrderQty2 get(com.alignmentsystems.fix44.field.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrderQty2());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

	public void set(com.alignmentsystems.fix44.field.BidForwardPoints2 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidForwardPoints2 get(com.alignmentsystems.fix44.field.BidForwardPoints2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidForwardPoints2 getBidForwardPoints2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidForwardPoints2());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidForwardPoints2 field) {
		return isSetField(field);
	}

	public boolean isSetBidForwardPoints2() {
		return isSetField(642);
	}

	public void set(com.alignmentsystems.fix44.field.OfferForwardPoints2 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OfferForwardPoints2 get(com.alignmentsystems.fix44.field.OfferForwardPoints2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OfferForwardPoints2 getOfferForwardPoints2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OfferForwardPoints2());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OfferForwardPoints2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferForwardPoints2() {
		return isSetField(643);
	}

	public void set(com.alignmentsystems.fix44.field.Currency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Currency get(com.alignmentsystems.fix44.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Currency getCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Currency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	}

	}

}