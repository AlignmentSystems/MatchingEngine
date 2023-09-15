
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class ListStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "N";
	

	public ListStatus() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public ListStatus(com.alignmentsystems.fix44.field.ListID listID, com.alignmentsystems.fix44.field.ListStatusType listStatusType, com.alignmentsystems.fix44.field.NoRpts noRpts, com.alignmentsystems.fix44.field.ListOrderStatus listOrderStatus, com.alignmentsystems.fix44.field.RptSeq rptSeq, com.alignmentsystems.fix44.field.TotNoOrders totNoOrders) {
		this();
		setField(listID);
		setField(listStatusType);
		setField(noRpts);
		setField(listOrderStatus);
		setField(rptSeq);
		setField(totNoOrders);
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

	public void set(com.alignmentsystems.fix44.field.ListStatusType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListStatusType get(com.alignmentsystems.fix44.field.ListStatusType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListStatusType getListStatusType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListStatusType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListStatusType field) {
		return isSetField(field);
	}

	public boolean isSetListStatusType() {
		return isSetField(429);
	}

	public void set(com.alignmentsystems.fix44.field.NoRpts value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoRpts get(com.alignmentsystems.fix44.field.NoRpts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoRpts getNoRpts() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoRpts());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoRpts field) {
		return isSetField(field);
	}

	public boolean isSetNoRpts() {
		return isSetField(82);
	}

	public void set(com.alignmentsystems.fix44.field.ListOrderStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListOrderStatus get(com.alignmentsystems.fix44.field.ListOrderStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListOrderStatus getListOrderStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListOrderStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListOrderStatus field) {
		return isSetField(field);
	}

	public boolean isSetListOrderStatus() {
		return isSetField(431);
	}

	public void set(com.alignmentsystems.fix44.field.RptSeq value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RptSeq get(com.alignmentsystems.fix44.field.RptSeq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RptSeq getRptSeq() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RptSeq());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RptSeq field) {
		return isSetField(field);
	}

	public boolean isSetRptSeq() {
		return isSetField(83);
	}

	public void set(com.alignmentsystems.fix44.field.ListStatusText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListStatusText get(com.alignmentsystems.fix44.field.ListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListStatusText getListStatusText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListStatusText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetListStatusText() {
		return isSetField(444);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedListStatusTextLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedListStatusTextLen get(com.alignmentsystems.fix44.field.EncodedListStatusTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedListStatusTextLen getEncodedListStatusTextLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedListStatusTextLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedListStatusTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusTextLen() {
		return isSetField(445);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedListStatusText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedListStatusText get(com.alignmentsystems.fix44.field.EncodedListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedListStatusText getEncodedListStatusText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedListStatusText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusText() {
		return isSetField(446);
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

	public void set(com.alignmentsystems.fix44.field.TotNoOrders value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotNoOrders get(com.alignmentsystems.fix44.field.TotNoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotNoOrders getTotNoOrders() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotNoOrders());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotNoOrders field) {
		return isSetField(field);
	}

	public boolean isSetTotNoOrders() {
		return isSetField(68);
	}

	public void set(com.alignmentsystems.fix44.field.LastFragment value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastFragment get(com.alignmentsystems.fix44.field.LastFragment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastFragment getLastFragment() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastFragment());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastFragment field) {
		return isSetField(field);
	}

	public boolean isSetLastFragment() {
		return isSetField(893);
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
		private static final int[] ORDER = {11, 526, 14, 39, 636, 151, 84, 6, 103, 58, 354, 355, 0};

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

	public void set(com.alignmentsystems.fix44.field.CumQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CumQty get(com.alignmentsystems.fix44.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CumQty getCumQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CumQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
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

	public void set(com.alignmentsystems.fix44.field.LeavesQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LeavesQty get(com.alignmentsystems.fix44.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LeavesQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(com.alignmentsystems.fix44.field.CxlQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CxlQty get(com.alignmentsystems.fix44.field.CxlQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CxlQty getCxlQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CxlQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CxlQty field) {
		return isSetField(field);
	}

	public boolean isSetCxlQty() {
		return isSetField(84);
	}

	public void set(com.alignmentsystems.fix44.field.AvgPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AvgPx get(com.alignmentsystems.fix44.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AvgPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(com.alignmentsystems.fix44.field.OrdRejReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrdRejReason get(com.alignmentsystems.fix44.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrdRejReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
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

}
