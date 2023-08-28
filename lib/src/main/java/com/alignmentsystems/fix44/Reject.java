
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public Reject(com.alignmentsystems.fix44.field.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(com.alignmentsystems.fix44.field.RefSeqNum value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefSeqNum get(com.alignmentsystems.fix44.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefSeqNum());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(com.alignmentsystems.fix44.field.RefTagID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefTagID get(com.alignmentsystems.fix44.field.RefTagID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefTagID getRefTagID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefTagID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefTagID field) {
		return isSetField(field);
	}

	public boolean isSetRefTagID() {
		return isSetField(371);
	}

	public void set(com.alignmentsystems.fix44.field.RefMsgType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefMsgType get(com.alignmentsystems.fix44.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefMsgType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(com.alignmentsystems.fix44.field.SessionRejectReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SessionRejectReason get(com.alignmentsystems.fix44.field.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SessionRejectReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
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
