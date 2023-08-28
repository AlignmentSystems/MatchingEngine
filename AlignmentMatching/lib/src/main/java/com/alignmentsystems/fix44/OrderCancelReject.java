
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(com.alignmentsystems.fix44.field.OrderID orderID, com.alignmentsystems.fix44.field.ClOrdID clOrdID, com.alignmentsystems.fix44.field.OrigClOrdID origClOrdID, com.alignmentsystems.fix44.field.OrdStatus ordStatus, com.alignmentsystems.fix44.field.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(origClOrdID);
		setField(ordStatus);
		setField(cxlRejResponseTo);
	}
	
	public void set(com.alignmentsystems.fix44.field.OrderID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrderID get(com.alignmentsystems.fix44.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrderID getOrderID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrderID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(com.alignmentsystems.fix44.field.SecondaryOrderID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryOrderID get(com.alignmentsystems.fix44.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryOrderID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
	}

	public void set(com.alignmentsystems.fix44.field.SecondaryClOrdID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryClOrdID get(com.alignmentsystems.fix44.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryClOrdID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(com.alignmentsystems.fix44.field.ClOrdID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClOrdID get(com.alignmentsystems.fix44.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClOrdID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(com.alignmentsystems.fix44.field.ClOrdLinkID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClOrdLinkID get(com.alignmentsystems.fix44.field.ClOrdLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClOrdLinkID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClOrdLinkID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdLinkID() {
		return isSetField(583);
	}

	public void set(com.alignmentsystems.fix44.field.OrigClOrdID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrigClOrdID get(com.alignmentsystems.fix44.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrigClOrdID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(com.alignmentsystems.fix44.field.OrdStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrdStatus get(com.alignmentsystems.fix44.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrdStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(com.alignmentsystems.fix44.field.WorkingIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.WorkingIndicator get(com.alignmentsystems.fix44.field.WorkingIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.WorkingIndicator getWorkingIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.WorkingIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.WorkingIndicator field) {
		return isSetField(field);
	}

	public boolean isSetWorkingIndicator() {
		return isSetField(636);
	}

	public void set(com.alignmentsystems.fix44.field.OrigOrdModTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrigOrdModTime get(com.alignmentsystems.fix44.field.OrigOrdModTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrigOrdModTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrigOrdModTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigOrdModTime() {
		return isSetField(586);
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

	public void set(com.alignmentsystems.fix44.field.Account value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Account get(com.alignmentsystems.fix44.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Account getAccount() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Account());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(com.alignmentsystems.fix44.field.AcctIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AcctIDSource get(com.alignmentsystems.fix44.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AcctIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(com.alignmentsystems.fix44.field.AccountType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AccountType get(com.alignmentsystems.fix44.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AccountType getAccountType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AccountType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
	}

	public void set(com.alignmentsystems.fix44.field.TradeOriginationDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradeOriginationDate get(com.alignmentsystems.fix44.field.TradeOriginationDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradeOriginationDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradeOriginationDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeOriginationDate() {
		return isSetField(229);
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

	public void set(com.alignmentsystems.fix44.field.CxlRejResponseTo value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CxlRejResponseTo get(com.alignmentsystems.fix44.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CxlRejResponseTo());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(com.alignmentsystems.fix44.field.CxlRejReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CxlRejReason get(com.alignmentsystems.fix44.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CxlRejReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
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
