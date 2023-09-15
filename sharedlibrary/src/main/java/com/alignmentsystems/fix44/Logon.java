
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public Logon(com.alignmentsystems.fix44.field.EncryptMethod encryptMethod, com.alignmentsystems.fix44.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(com.alignmentsystems.fix44.field.EncryptMethod value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncryptMethod get(com.alignmentsystems.fix44.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncryptMethod());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(com.alignmentsystems.fix44.field.HeartBtInt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.HeartBtInt get(com.alignmentsystems.fix44.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.HeartBtInt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(com.alignmentsystems.fix44.field.RawDataLength value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RawDataLength get(com.alignmentsystems.fix44.field.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RawDataLength());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(com.alignmentsystems.fix44.field.RawData value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RawData get(com.alignmentsystems.fix44.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RawData getRawData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RawData());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

	public void set(com.alignmentsystems.fix44.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ResetSeqNumFlag get(com.alignmentsystems.fix44.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ResetSeqNumFlag());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

	public void set(com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum get(com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum getNextExpectedMsgSeqNum() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NextExpectedMsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetNextExpectedMsgSeqNum() {
		return isSetField(789);
	}

	public void set(com.alignmentsystems.fix44.field.MaxMessageSize value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MaxMessageSize get(com.alignmentsystems.fix44.field.MaxMessageSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MaxMessageSize getMaxMessageSize() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MaxMessageSize());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MaxMessageSize field) {
		return isSetField(field);
	}

	public boolean isSetMaxMessageSize() {
		return isSetField(383);
	}

	public void set(com.alignmentsystems.fix44.field.NoMsgTypes value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoMsgTypes get(com.alignmentsystems.fix44.field.NoMsgTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoMsgTypes());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoMsgTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMsgTypes() {
		return isSetField(384);
	}

	public static class NoMsgTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {372, 385, 0};

		public NoMsgTypes() {
			super(384, 372, ORDER);
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

	public void set(com.alignmentsystems.fix44.field.MsgDirection value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MsgDirection get(com.alignmentsystems.fix44.field.MsgDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MsgDirection getMsgDirection() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MsgDirection());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MsgDirection field) {
		return isSetField(field);
	}

	public boolean isSetMsgDirection() {
		return isSetField(385);
	}

	}

	public void set(com.alignmentsystems.fix44.field.TestMessageIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TestMessageIndicator get(com.alignmentsystems.fix44.field.TestMessageIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TestMessageIndicator getTestMessageIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TestMessageIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TestMessageIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTestMessageIndicator() {
		return isSetField(464);
	}

	public void set(com.alignmentsystems.fix44.field.Username value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Username get(com.alignmentsystems.fix44.field.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Username getUsername() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Username());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(com.alignmentsystems.fix44.field.Password value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Password get(com.alignmentsystems.fix44.field.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Password getPassword() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Password());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

}
