
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RegistrationInstructionsResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "p";
	

	public RegistrationInstructionsResponse() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructionsResponse(com.alignmentsystems.fix44.field.RegistID registID, com.alignmentsystems.fix44.field.RegistTransType registTransType, com.alignmentsystems.fix44.field.RegistRefID registRefID, com.alignmentsystems.fix44.field.RegistStatus registStatus) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
		setField(registStatus);
	}
	
	public void set(com.alignmentsystems.fix44.field.RegistID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistID get(com.alignmentsystems.fix44.field.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistID getRegistID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(com.alignmentsystems.fix44.field.RegistTransType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistTransType get(com.alignmentsystems.fix44.field.RegistTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistTransType getRegistTransType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistTransType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistTransType field) {
		return isSetField(field);
	}

	public boolean isSetRegistTransType() {
		return isSetField(514);
	}

	public void set(com.alignmentsystems.fix44.field.RegistRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistRefID get(com.alignmentsystems.fix44.field.RegistRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistRefID getRegistRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistRefID field) {
		return isSetField(field);
	}

	public boolean isSetRegistRefID() {
		return isSetField(508);
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

	public void set(com.alignmentsystems.fix44.field.RegistStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistStatus get(com.alignmentsystems.fix44.field.RegistStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistStatus getRegistStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistStatus field) {
		return isSetField(field);
	}

	public boolean isSetRegistStatus() {
		return isSetField(506);
	}

	public void set(com.alignmentsystems.fix44.field.RegistRejReasonCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistRejReasonCode get(com.alignmentsystems.fix44.field.RegistRejReasonCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistRejReasonCode getRegistRejReasonCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistRejReasonCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistRejReasonCode field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonCode() {
		return isSetField(507);
	}

	public void set(com.alignmentsystems.fix44.field.RegistRejReasonText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistRejReasonText get(com.alignmentsystems.fix44.field.RegistRejReasonText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistRejReasonText getRegistRejReasonText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistRejReasonText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistRejReasonText field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonText() {
		return isSetField(496);
	}

}
