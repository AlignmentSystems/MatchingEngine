
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class UserRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BE";
	

	public UserRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public UserRequest(com.alignmentsystems.fix44.field.UserRequestID userRequestID, com.alignmentsystems.fix44.field.UserRequestType userRequestType, com.alignmentsystems.fix44.field.Username username) {
		this();
		setField(userRequestID);
		setField(userRequestType);
		setField(username);
	}
	
	public void set(com.alignmentsystems.fix44.field.UserRequestID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UserRequestID get(com.alignmentsystems.fix44.field.UserRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UserRequestID getUserRequestID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UserRequestID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UserRequestID field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestID() {
		return isSetField(923);
	}

	public void set(com.alignmentsystems.fix44.field.UserRequestType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UserRequestType get(com.alignmentsystems.fix44.field.UserRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UserRequestType getUserRequestType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UserRequestType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UserRequestType field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestType() {
		return isSetField(924);
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

	public void set(com.alignmentsystems.fix44.field.NewPassword value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NewPassword get(com.alignmentsystems.fix44.field.NewPassword value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NewPassword getNewPassword() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NewPassword());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NewPassword field) {
		return isSetField(field);
	}

	public boolean isSetNewPassword() {
		return isSetField(925);
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

}
