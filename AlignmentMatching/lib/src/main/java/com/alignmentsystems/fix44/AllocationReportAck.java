
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AllocationReportAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AT";
	

	public AllocationReportAck() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public AllocationReportAck(com.alignmentsystems.fix44.field.AllocReportID allocReportID, com.alignmentsystems.fix44.field.AllocID allocID, com.alignmentsystems.fix44.field.TransactTime transactTime, com.alignmentsystems.fix44.field.AllocStatus allocStatus) {
		this();
		setField(allocReportID);
		setField(allocID);
		setField(transactTime);
		setField(allocStatus);
	}
	
	public void set(com.alignmentsystems.fix44.field.AllocReportID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocReportID get(com.alignmentsystems.fix44.field.AllocReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocReportID getAllocReportID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocReportID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocReportID field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportID() {
		return isSetField(755);
	}

	public void set(com.alignmentsystems.fix44.field.AllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocID get(com.alignmentsystems.fix44.field.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocID getAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
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

	public void set(com.alignmentsystems.fix44.field.SecondaryAllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryAllocID get(com.alignmentsystems.fix44.field.SecondaryAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryAllocID getSecondaryAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryAllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryAllocID() {
		return isSetField(793);
	}

	public void set(com.alignmentsystems.fix44.field.TradeDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradeDate get(com.alignmentsystems.fix44.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradeDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(com.alignmentsystems.fix44.field.AllocStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocStatus get(com.alignmentsystems.fix44.field.AllocStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocStatus getAllocStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocStatus field) {
		return isSetField(field);
	}

	public boolean isSetAllocStatus() {
		return isSetField(87);
	}

	public void set(com.alignmentsystems.fix44.field.AllocRejCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocRejCode get(com.alignmentsystems.fix44.field.AllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocRejCode getAllocRejCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocRejCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetAllocRejCode() {
		return isSetField(88);
	}

	public void set(com.alignmentsystems.fix44.field.AllocReportType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocReportType get(com.alignmentsystems.fix44.field.AllocReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocReportType getAllocReportType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocReportType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocReportType field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportType() {
		return isSetField(794);
	}

	public void set(com.alignmentsystems.fix44.field.AllocIntermedReqType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocIntermedReqType get(com.alignmentsystems.fix44.field.AllocIntermedReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocIntermedReqType getAllocIntermedReqType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocIntermedReqType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocIntermedReqType field) {
		return isSetField(field);
	}

	public boolean isSetAllocIntermedReqType() {
		return isSetField(808);
	}

	public void set(com.alignmentsystems.fix44.field.MatchStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MatchStatus get(com.alignmentsystems.fix44.field.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MatchStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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

	public void set(com.alignmentsystems.fix44.field.NoAllocs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoAllocs get(com.alignmentsystems.fix44.field.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoAllocs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {79, 661, 366, 467, 776, 161, 360, 361, 0};

		public NoAllocs() {
			super(78, 79, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.AllocAccount value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAccount get(com.alignmentsystems.fix44.field.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAccount());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(com.alignmentsystems.fix44.field.AllocAcctIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAcctIDSource get(com.alignmentsystems.fix44.field.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAcctIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
	}

	public void set(com.alignmentsystems.fix44.field.AllocPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocPrice get(com.alignmentsystems.fix44.field.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
	}

	public void set(com.alignmentsystems.fix44.field.IndividualAllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IndividualAllocID get(com.alignmentsystems.fix44.field.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IndividualAllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
	}

	public void set(com.alignmentsystems.fix44.field.IndividualAllocRejCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IndividualAllocRejCode get(com.alignmentsystems.fix44.field.IndividualAllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IndividualAllocRejCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IndividualAllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocRejCode() {
		return isSetField(776);
	}

	public void set(com.alignmentsystems.fix44.field.AllocText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocText get(com.alignmentsystems.fix44.field.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocText getAllocText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedAllocTextLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedAllocTextLen get(com.alignmentsystems.fix44.field.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedAllocTextLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedAllocText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedAllocText get(com.alignmentsystems.fix44.field.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedAllocText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	}

}
