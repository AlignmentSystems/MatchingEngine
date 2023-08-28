
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;


public class TradingSessionStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "h";
	

	public TradingSessionStatus() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatus(com.alignmentsystems.fix44.field.TradingSessionID tradingSessionID, com.alignmentsystems.fix44.field.TradSesStatus tradSesStatus) {
		this();
		setField(tradingSessionID);
		setField(tradSesStatus);
	}
	
	public void set(com.alignmentsystems.fix44.field.TradSesReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesReqID get(com.alignmentsystems.fix44.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
	}

	public void set(com.alignmentsystems.fix44.field.TradingSessionID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradingSessionID get(com.alignmentsystems.fix44.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradingSessionID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(com.alignmentsystems.fix44.field.TradingSessionSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradingSessionSubID get(com.alignmentsystems.fix44.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradingSessionSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesMethod value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesMethod get(com.alignmentsystems.fix44.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesMethod());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesMode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesMode get(com.alignmentsystems.fix44.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesMode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(com.alignmentsystems.fix44.field.UnsolicitedIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnsolicitedIndicator get(com.alignmentsystems.fix44.field.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnsolicitedIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesStatus get(com.alignmentsystems.fix44.field.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(340);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesStatusRejReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesStatusRejReason get(com.alignmentsystems.fix44.field.TradSesStatusRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesStatusRejReason getTradSesStatusRejReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesStatusRejReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesStatusRejReason field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatusRejReason() {
		return isSetField(567);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesStartTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesStartTime get(com.alignmentsystems.fix44.field.TradSesStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesStartTime getTradSesStartTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesStartTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesStartTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStartTime() {
		return isSetField(341);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesOpenTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesOpenTime get(com.alignmentsystems.fix44.field.TradSesOpenTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesOpenTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesOpenTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesOpenTime() {
		return isSetField(342);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesPreCloseTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesPreCloseTime get(com.alignmentsystems.fix44.field.TradSesPreCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesPreCloseTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesPreCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesPreCloseTime() {
		return isSetField(343);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesCloseTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesCloseTime get(com.alignmentsystems.fix44.field.TradSesCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesCloseTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesCloseTime() {
		return isSetField(344);
	}

	public void set(com.alignmentsystems.fix44.field.TradSesEndTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TradSesEndTime get(com.alignmentsystems.fix44.field.TradSesEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TradSesEndTime getTradSesEndTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TradSesEndTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TradSesEndTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesEndTime() {
		return isSetField(345);
	}

	public void set(com.alignmentsystems.fix44.field.TotalVolumeTraded value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotalVolumeTraded get(com.alignmentsystems.fix44.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotalVolumeTraded());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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
