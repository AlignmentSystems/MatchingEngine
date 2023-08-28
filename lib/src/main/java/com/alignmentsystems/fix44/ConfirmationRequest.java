
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ConfirmationRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BH";
	

	public ConfirmationRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public ConfirmationRequest(com.alignmentsystems.fix44.field.ConfirmReqID confirmReqID, com.alignmentsystems.fix44.field.ConfirmType confirmType, com.alignmentsystems.fix44.field.TransactTime transactTime) {
		this();
		setField(confirmReqID);
		setField(confirmType);
		setField(transactTime);
	}
	
	public void set(com.alignmentsystems.fix44.field.ConfirmReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ConfirmReqID get(com.alignmentsystems.fix44.field.ConfirmReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ConfirmReqID getConfirmReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ConfirmReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ConfirmReqID field) {
		return isSetField(field);
	}

	public boolean isSetConfirmReqID() {
		return isSetField(859);
	}

	public void set(com.alignmentsystems.fix44.field.ConfirmType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ConfirmType get(com.alignmentsystems.fix44.field.ConfirmType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ConfirmType getConfirmType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ConfirmType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ConfirmType field) {
		return isSetField(field);
	}

	public boolean isSetConfirmType() {
		return isSetField(773);
	}

	public void set(com.alignmentsystems.fix44.field.NoOrders value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoOrders get(com.alignmentsystems.fix44.field.NoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoOrders getNoOrders() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoOrders());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoOrders() {
		return isSetField(73);
	}

	public static class NoOrders extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {11, 37, 198, 526, 66, 756, 38, 799, 800, 0};

		public NoOrders() {
			super(73, 11, ORDER);
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

	public void set(com.alignmentsystems.fix44.component.NestedParties2 component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.NestedParties2 get(com.alignmentsystems.fix44.component.NestedParties2 component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.NestedParties2 getNestedParties2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.NestedParties2());
	}

	public void set(com.alignmentsystems.fix44.field.NoNested2PartyIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoNested2PartyIDs get(com.alignmentsystems.fix44.field.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoNested2PartyIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {757, 758, 759, 806, 0};

		public NoNested2PartyIDs() {
			super(756, 757, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.Nested2PartyID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Nested2PartyID get(com.alignmentsystems.fix44.field.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Nested2PartyID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(com.alignmentsystems.fix44.field.Nested2PartyIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Nested2PartyIDSource get(com.alignmentsystems.fix44.field.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Nested2PartyIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(com.alignmentsystems.fix44.field.Nested2PartyRole value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Nested2PartyRole get(com.alignmentsystems.fix44.field.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Nested2PartyRole());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(com.alignmentsystems.fix44.field.NoNested2PartySubIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoNested2PartySubIDs get(com.alignmentsystems.fix44.field.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoNested2PartySubIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {760, 807, 0};

		public NoNested2PartySubIDs() {
			super(806, 760, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.Nested2PartySubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Nested2PartySubID get(com.alignmentsystems.fix44.field.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Nested2PartySubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(com.alignmentsystems.fix44.field.Nested2PartySubIDType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Nested2PartySubIDType get(com.alignmentsystems.fix44.field.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Nested2PartySubIDType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

	}

	public void set(com.alignmentsystems.fix44.field.OrderQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrderQty get(com.alignmentsystems.fix44.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrderQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(com.alignmentsystems.fix44.field.OrderAvgPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrderAvgPx get(com.alignmentsystems.fix44.field.OrderAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrderAvgPx getOrderAvgPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrderAvgPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrderAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetOrderAvgPx() {
		return isSetField(799);
	}

	public void set(com.alignmentsystems.fix44.field.OrderBookingQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrderBookingQty get(com.alignmentsystems.fix44.field.OrderBookingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrderBookingQty getOrderBookingQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrderBookingQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrderBookingQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderBookingQty() {
		return isSetField(800);
	}

	}

	public void set(com.alignmentsystems.fix44.field.AllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocID get(com.alignmentsystems.fix44.field.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocID getAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
	}

	public void set(com.alignmentsystems.fix44.field.SecondaryAllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryAllocID get(com.alignmentsystems.fix44.field.SecondaryAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryAllocID getSecondaryAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryAllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryAllocID() {
		return isSetField(793);
	}

	public void set(com.alignmentsystems.fix44.field.IndividualAllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IndividualAllocID get(com.alignmentsystems.fix44.field.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IndividualAllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
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

	public void set(com.alignmentsystems.fix44.field.AllocAccount value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAccount get(com.alignmentsystems.fix44.field.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAccount());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(com.alignmentsystems.fix44.field.AllocAcctIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAcctIDSource get(com.alignmentsystems.fix44.field.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAcctIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
	}

	public void set(com.alignmentsystems.fix44.field.AllocAccountType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAccountType get(com.alignmentsystems.fix44.field.AllocAccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAccountType getAllocAccountType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAccountType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAccountType field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccountType() {
		return isSetField(798);
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
