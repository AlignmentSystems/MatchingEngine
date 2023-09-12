
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(com.alignmentsystems.fix44.field.BeginSeqNo beginSeqNo, com.alignmentsystems.fix44.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(com.alignmentsystems.fix44.field.BeginSeqNo value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BeginSeqNo get(com.alignmentsystems.fix44.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BeginSeqNo());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(com.alignmentsystems.fix44.field.EndSeqNo value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EndSeqNo get(com.alignmentsystems.fix44.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EndSeqNo());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
