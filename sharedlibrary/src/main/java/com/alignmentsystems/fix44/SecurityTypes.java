
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class SecurityTypes extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "w";
	

	public SecurityTypes() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public SecurityTypes(com.alignmentsystems.fix44.field.SecurityReqID securityReqID, com.alignmentsystems.fix44.field.SecurityResponseID securityResponseID, com.alignmentsystems.fix44.field.SecurityResponseType securityResponseType) {
		this();
		setField(securityReqID);
		setField(securityResponseID);
		setField(securityResponseType);
	}
	
	public void set(com.alignmentsystems.fix44.field.SecurityReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityReqID get(com.alignmentsystems.fix44.field.SecurityReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReqID() {
		return isSetField(320);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityResponseID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityResponseID get(com.alignmentsystems.fix44.field.SecurityResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityResponseID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityResponseID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseID() {
		return isSetField(322);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityResponseType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityResponseType get(com.alignmentsystems.fix44.field.SecurityResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityResponseType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityResponseType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseType() {
		return isSetField(323);
	}

	public void set(com.alignmentsystems.fix44.field.TotNoSecurityTypes value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotNoSecurityTypes get(com.alignmentsystems.fix44.field.TotNoSecurityTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotNoSecurityTypes getTotNoSecurityTypes() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotNoSecurityTypes());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotNoSecurityTypes field) {
		return isSetField(field);
	}

	public boolean isSetTotNoSecurityTypes() {
		return isSetField(557);
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

	public void set(com.alignmentsystems.fix44.field.NoSecurityTypes value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSecurityTypes get(com.alignmentsystems.fix44.field.NoSecurityTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSecurityTypes getNoSecurityTypes() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSecurityTypes());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSecurityTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityTypes() {
		return isSetField(558);
	}

	public static class NoSecurityTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {167, 762, 460, 461, 0};

		public NoSecurityTypes() {
			super(558, 167, ORDER);
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

	public void set(com.alignmentsystems.fix44.field.SubscriptionRequestType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SubscriptionRequestType get(com.alignmentsystems.fix44.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SubscriptionRequestType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

}
