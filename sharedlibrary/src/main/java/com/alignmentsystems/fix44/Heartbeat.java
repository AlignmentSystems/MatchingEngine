
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public void set(com.alignmentsystems.fix44.field.TestReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TestReqID get(com.alignmentsystems.fix44.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TestReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
