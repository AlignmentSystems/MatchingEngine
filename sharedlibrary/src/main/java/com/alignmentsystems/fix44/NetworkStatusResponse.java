
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NetworkStatusResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BD";
	

	public NetworkStatusResponse() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public NetworkStatusResponse(com.alignmentsystems.fix44.field.NetworkStatusResponseType networkStatusResponseType) {
		this();
		setField(networkStatusResponseType);
	}
	
	public void set(com.alignmentsystems.fix44.field.NetworkStatusResponseType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetworkStatusResponseType get(com.alignmentsystems.fix44.field.NetworkStatusResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetworkStatusResponseType getNetworkStatusResponseType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetworkStatusResponseType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetworkStatusResponseType field) {
		return isSetField(field);
	}

	public boolean isSetNetworkStatusResponseType() {
		return isSetField(937);
	}

	public void set(com.alignmentsystems.fix44.field.NetworkRequestID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetworkRequestID get(com.alignmentsystems.fix44.field.NetworkRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetworkRequestID getNetworkRequestID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetworkRequestID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetworkRequestID field) {
		return isSetField(field);
	}

	public boolean isSetNetworkRequestID() {
		return isSetField(933);
	}

	public void set(com.alignmentsystems.fix44.field.NetworkResponseID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetworkResponseID get(com.alignmentsystems.fix44.field.NetworkResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetworkResponseID getNetworkResponseID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetworkResponseID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetworkResponseID field) {
		return isSetField(field);
	}

	public boolean isSetNetworkResponseID() {
		return isSetField(932);
	}

	public void set(com.alignmentsystems.fix44.field.LastNetworkResponseID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastNetworkResponseID get(com.alignmentsystems.fix44.field.LastNetworkResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastNetworkResponseID getLastNetworkResponseID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastNetworkResponseID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastNetworkResponseID field) {
		return isSetField(field);
	}

	public boolean isSetLastNetworkResponseID() {
		return isSetField(934);
	}

	public void set(com.alignmentsystems.fix44.field.NoCompIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoCompIDs get(com.alignmentsystems.fix44.field.NoCompIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoCompIDs getNoCompIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoCompIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoCompIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoCompIDs() {
		return isSetField(936);
	}

	public static class NoCompIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {930, 931, 283, 284, 928, 929, 0};

		public NoCompIDs() {
			super(936, 930, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.RefCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefCompID get(com.alignmentsystems.fix44.field.RefCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefCompID getRefCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefCompID field) {
		return isSetField(field);
	}

	public boolean isSetRefCompID() {
		return isSetField(930);
	}

	public void set(com.alignmentsystems.fix44.field.RefSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefSubID get(com.alignmentsystems.fix44.field.RefSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefSubID getRefSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefSubID field) {
		return isSetField(field);
	}

	public boolean isSetRefSubID() {
		return isSetField(931);
	}

	public void set(com.alignmentsystems.fix44.field.LocationID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LocationID get(com.alignmentsystems.fix44.field.LocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LocationID getLocationID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LocationID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LocationID field) {
		return isSetField(field);
	}

	public boolean isSetLocationID() {
		return isSetField(283);
	}

	public void set(com.alignmentsystems.fix44.field.DeskID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeskID get(com.alignmentsystems.fix44.field.DeskID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeskID getDeskID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeskID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeskID field) {
		return isSetField(field);
	}

	public boolean isSetDeskID() {
		return isSetField(284);
	}

	public void set(com.alignmentsystems.fix44.field.StatusValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StatusValue get(com.alignmentsystems.fix44.field.StatusValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StatusValue getStatusValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StatusValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StatusValue field) {
		return isSetField(field);
	}

	public boolean isSetStatusValue() {
		return isSetField(928);
	}

	public void set(com.alignmentsystems.fix44.field.StatusText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StatusText get(com.alignmentsystems.fix44.field.StatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StatusText getStatusText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StatusText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StatusText field) {
		return isSetField(field);
	}

	public boolean isSetStatusText() {
		return isSetField(929);
	}

	}

}
