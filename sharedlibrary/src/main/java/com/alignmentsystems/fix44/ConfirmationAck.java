
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class ConfirmationAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AU";
	

	public ConfirmationAck() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public ConfirmationAck(com.alignmentsystems.fix44.field.ConfirmID confirmID, com.alignmentsystems.fix44.field.TradeDate tradeDate, com.alignmentsystems.fix44.field.TransactTime transactTime, com.alignmentsystems.fix44.field.AffirmStatus affirmStatus) {
		this();
		setField(confirmID);
		setField(tradeDate);
		setField(transactTime);
		setField(affirmStatus);
	}
	
	public void set(com.alignmentsystems.fix44.field.ConfirmID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ConfirmID get(com.alignmentsystems.fix44.field.ConfirmID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ConfirmID getConfirmID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ConfirmID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ConfirmID field) {
		return isSetField(field);
	}

	public boolean isSetConfirmID() {
		return isSetField(664);
	}

	public void set(com.alignmentsystems.fix44.field.TradeDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradeDate get(com.alignmentsystems.fix44.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradeDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(com.alignmentsystems.fix44.field.AffirmStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AffirmStatus get(com.alignmentsystems.fix44.field.AffirmStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AffirmStatus getAffirmStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AffirmStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AffirmStatus field) {
		return isSetField(field);
	}

	public boolean isSetAffirmStatus() {
		return isSetField(940);
	}

	public void set(com.alignmentsystems.fix44.field.ConfirmRejReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ConfirmRejReason get(com.alignmentsystems.fix44.field.ConfirmRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ConfirmRejReason getConfirmRejReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ConfirmRejReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ConfirmRejReason field) {
		return isSetField(field);
	}

	public boolean isSetConfirmRejReason() {
		return isSetField(774);
	}

	public void set(com.alignmentsystems.fix44.field.MatchStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MatchStatus get(com.alignmentsystems.fix44.field.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MatchStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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
