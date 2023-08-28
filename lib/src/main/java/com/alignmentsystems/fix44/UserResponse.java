
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class UserResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BF";
	

	public UserResponse() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public UserResponse(com.alignmentsystems.fix44.field.UserRequestID userRequestID, com.alignmentsystems.fix44.field.Username username) {
		this();
		setField(userRequestID);
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

	public void set(com.alignmentsystems.fix44.field.UserStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UserStatus get(com.alignmentsystems.fix44.field.UserStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UserStatus getUserStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UserStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UserStatus field) {
		return isSetField(field);
	}

	public boolean isSetUserStatus() {
		return isSetField(926);
	}

	public void set(com.alignmentsystems.fix44.field.UserStatusText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UserStatusText get(com.alignmentsystems.fix44.field.UserStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UserStatusText getUserStatusText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UserStatusText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UserStatusText field) {
		return isSetField(field);
	}

	public boolean isSetUserStatusText() {
		return isSetField(927);
	}

}
