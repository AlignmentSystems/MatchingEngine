
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class TradingSessionStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "g";
	

	public TradingSessionStatusRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatusRequest(com.alignmentsystems.fix44.field.TradSesReqID tradSesReqID, com.alignmentsystems.fix44.field.SubscriptionRequestType subscriptionRequestType) {
		this();
		setField(tradSesReqID);
		setField(subscriptionRequestType);
	}
	
	public void set(com.alignmentsystems.fix44.field.TradSesReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesReqID get(com.alignmentsystems.fix44.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
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

	public void set(com.alignmentsystems.fix44.field.TradSesMethod value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesMethod get(com.alignmentsystems.fix44.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesMethod());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesMode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesMode get(com.alignmentsystems.fix44.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesMode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
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
