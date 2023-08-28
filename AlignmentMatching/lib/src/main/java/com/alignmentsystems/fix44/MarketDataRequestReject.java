
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(com.alignmentsystems.fix44.field.MDReqID mDReqID) {
		this();
		setField(mDReqID);
	}
	
	public void set(com.alignmentsystems.fix44.field.MDReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MDReqID get(com.alignmentsystems.fix44.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MDReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(com.alignmentsystems.fix44.field.MDReqRejReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MDReqRejReason get(com.alignmentsystems.fix44.field.MDReqRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MDReqRejReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MDReqRejReason field) {
		return isSetField(field);
	}

	public boolean isSetMDReqRejReason() {
		return isSetField(281);
	}

	public void set(com.alignmentsystems.fix44.field.NoAltMDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoAltMDSource get(com.alignmentsystems.fix44.field.NoAltMDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoAltMDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoAltMDSource field) {
		return isSetField(field);
	}

	public boolean isSetNoAltMDSource() {
		return isSetField(816);
	}

	public static class NoAltMDSource extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {817, 0};

		public NoAltMDSource() {
			super(816, 817, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.AltMDSourceID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AltMDSourceID get(com.alignmentsystems.fix44.field.AltMDSourceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AltMDSourceID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AltMDSourceID field) {
		return isSetField(field);
	}

	public boolean isSetAltMDSourceID() {
		return isSetField(817);
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

}
