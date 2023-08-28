
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(com.alignmentsystems.fix44.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(com.alignmentsystems.fix44.field.GapFillFlag value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.GapFillFlag get(com.alignmentsystems.fix44.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.GapFillFlag());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(com.alignmentsystems.fix44.field.NewSeqNo value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NewSeqNo get(com.alignmentsystems.fix44.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NewSeqNo());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
