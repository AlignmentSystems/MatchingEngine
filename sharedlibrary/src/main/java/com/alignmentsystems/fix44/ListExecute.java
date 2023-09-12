
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class ListExecute extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "L";
	

	public ListExecute() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public ListExecute(com.alignmentsystems.fix44.field.ListID listID, com.alignmentsystems.fix44.field.TransactTime transactTime) {
		this();
		setField(listID);
		setField(transactTime);
	}
	
	public void set(com.alignmentsystems.fix44.field.ListID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListID get(com.alignmentsystems.fix44.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListID getListID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(com.alignmentsystems.fix44.field.ClientBidID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClientBidID get(com.alignmentsystems.fix44.field.ClientBidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClientBidID getClientBidID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClientBidID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClientBidID field) {
		return isSetField(field);
	}

	public boolean isSetClientBidID() {
		return isSetField(391);
	}

	public void set(com.alignmentsystems.fix44.field.BidID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidID get(com.alignmentsystems.fix44.field.BidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidID getBidID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidID field) {
		return isSetField(field);
	}

	public boolean isSetBidID() {
		return isSetField(390);
	}

	public void set(com.alignmentsystems.fix44.field.TransactTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TransactTime get(com.alignmentsystems.fix44.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TransactTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
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
