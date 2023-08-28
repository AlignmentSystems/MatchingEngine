
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class BusinessMessageReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "j";
	

	public BusinessMessageReject() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public BusinessMessageReject(com.alignmentsystems.fix44.field.RefMsgType refMsgType, com.alignmentsystems.fix44.field.BusinessRejectReason businessRejectReason) {
		this();
		setField(refMsgType);
		setField(businessRejectReason);
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

	public void set(com.alignmentsystems.fix44.field.BusinessRejectRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BusinessRejectRefID get(com.alignmentsystems.fix44.field.BusinessRejectRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BusinessRejectRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BusinessRejectRefID field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectRefID() {
		return isSetField(379);
	}

	public void set(com.alignmentsystems.fix44.field.BusinessRejectReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BusinessRejectReason get(com.alignmentsystems.fix44.field.BusinessRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BusinessRejectReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BusinessRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectReason() {
		return isSetField(380);
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
