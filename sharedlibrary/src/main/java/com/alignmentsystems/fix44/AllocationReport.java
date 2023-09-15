package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class AllocationReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AS";
	

	public AllocationReport() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public AllocationReport(com.alignmentsystems.fix44.field.AllocReportID allocReportID, com.alignmentsystems.fix44.field.AllocTransType allocTransType, com.alignmentsystems.fix44.field.AllocReportType allocReportType, com.alignmentsystems.fix44.field.AllocStatus allocStatus, com.alignmentsystems.fix44.field.AllocNoOrdersType allocNoOrdersType, com.alignmentsystems.fix44.field.Side side, com.alignmentsystems.fix44.field.Quantity quantity, com.alignmentsystems.fix44.field.AvgPx avgPx, com.alignmentsystems.fix44.field.TradeDate tradeDate) {
		this();
		setField(allocReportID);
		setField(allocTransType);
		setField(allocReportType);
		setField(allocStatus);
		setField(allocNoOrdersType);
		setField(side);
		setField(quantity);
		setField(avgPx);
		setField(tradeDate);
	}
	
	public void set(com.alignmentsystems.fix44.field.AllocReportID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocReportID get(com.alignmentsystems.fix44.field.AllocReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocReportID getAllocReportID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocReportID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocReportID field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportID() {
		return isSetField(755);
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

	public void set(com.alignmentsystems.fix44.field.AllocTransType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocTransType get(com.alignmentsystems.fix44.field.AllocTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocTransType getAllocTransType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocTransType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocTransType field) {
		return isSetField(field);
	}

	public boolean isSetAllocTransType() {
		return isSetField(71);
	}

	public void set(com.alignmentsystems.fix44.field.AllocReportRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocReportRefID get(com.alignmentsystems.fix44.field.AllocReportRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocReportRefID getAllocReportRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocReportRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocReportRefID field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportRefID() {
		return isSetField(795);
	}

	public void set(com.alignmentsystems.fix44.field.AllocCancReplaceReason value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocCancReplaceReason get(com.alignmentsystems.fix44.field.AllocCancReplaceReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocCancReplaceReason getAllocCancReplaceReason() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocCancReplaceReason());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocCancReplaceReason field) {
		return isSetField(field);
	}

	public boolean isSetAllocCancReplaceReason() {
		return isSetField(796);
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

	public void set(com.alignmentsystems.fix44.field.AllocReportType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocReportType get(com.alignmentsystems.fix44.field.AllocReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocReportType getAllocReportType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocReportType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocReportType field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportType() {
		return isSetField(794);
	}

	public void set(com.alignmentsystems.fix44.field.AllocStatus value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocStatus get(com.alignmentsystems.fix44.field.AllocStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocStatus getAllocStatus() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocStatus());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocStatus field) {
		return isSetField(field);
	}

	public boolean isSetAllocStatus() {
		return isSetField(87);
	}

	public void set(com.alignmentsystems.fix44.field.AllocRejCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocRejCode get(com.alignmentsystems.fix44.field.AllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocRejCode getAllocRejCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocRejCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetAllocRejCode() {
		return isSetField(88);
	}

	public void set(com.alignmentsystems.fix44.field.RefAllocID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RefAllocID get(com.alignmentsystems.fix44.field.RefAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RefAllocID getRefAllocID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RefAllocID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RefAllocID field) {
		return isSetField(field);
	}

	public boolean isSetRefAllocID() {
		return isSetField(72);
	}

	public void set(com.alignmentsystems.fix44.field.AllocIntermedReqType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocIntermedReqType get(com.alignmentsystems.fix44.field.AllocIntermedReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocIntermedReqType getAllocIntermedReqType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocIntermedReqType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocIntermedReqType field) {
		return isSetField(field);
	}

	public boolean isSetAllocIntermedReqType() {
		return isSetField(808);
	}

	public void set(com.alignmentsystems.fix44.field.AllocLinkID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocLinkID get(com.alignmentsystems.fix44.field.AllocLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocLinkID getAllocLinkID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocLinkID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocLinkID field) {
		return isSetField(field);
	}

	public boolean isSetAllocLinkID() {
		return isSetField(196);
	}

	public void set(com.alignmentsystems.fix44.field.AllocLinkType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocLinkType get(com.alignmentsystems.fix44.field.AllocLinkType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocLinkType getAllocLinkType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocLinkType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocLinkType field) {
		return isSetField(field);
	}

	public boolean isSetAllocLinkType() {
		return isSetField(197);
	}

	public void set(com.alignmentsystems.fix44.field.BookingRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BookingRefID get(com.alignmentsystems.fix44.field.BookingRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BookingRefID getBookingRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BookingRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BookingRefID field) {
		return isSetField(field);
	}

	public boolean isSetBookingRefID() {
		return isSetField(466);
	}

	public void set(com.alignmentsystems.fix44.field.AllocNoOrdersType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocNoOrdersType get(com.alignmentsystems.fix44.field.AllocNoOrdersType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocNoOrdersType getAllocNoOrdersType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocNoOrdersType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocNoOrdersType field) {
		return isSetField(field);
	}

	public boolean isSetAllocNoOrdersType() {
		return isSetField(857);
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

	public void set(com.alignmentsystems.fix44.field.NoExecs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoExecs get(com.alignmentsystems.fix44.field.NoExecs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoExecs getNoExecs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoExecs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoExecs field) {
		return isSetField(field);
	}

	public boolean isSetNoExecs() {
		return isSetField(124);
	}

	public static class NoExecs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {32, 17, 527, 31, 669, 29, 0};

		public NoExecs() {
			super(124, 32, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.LastQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastQty get(com.alignmentsystems.fix44.field.LastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastQty getLastQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastQty field) {
		return isSetField(field);
	}

	public boolean isSetLastQty() {
		return isSetField(32);
	}

	public void set(com.alignmentsystems.fix44.field.ExecID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ExecID get(com.alignmentsystems.fix44.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ExecID getExecID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ExecID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(com.alignmentsystems.fix44.field.SecondaryExecID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecondaryExecID get(com.alignmentsystems.fix44.field.SecondaryExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecondaryExecID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecondaryExecID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryExecID() {
		return isSetField(527);
	}

	public void set(com.alignmentsystems.fix44.field.LastPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastPx get(com.alignmentsystems.fix44.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastPx getLastPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(com.alignmentsystems.fix44.field.LastParPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastParPx get(com.alignmentsystems.fix44.field.LastParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastParPx getLastParPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastParPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastParPx field) {
		return isSetField(field);
	}

	public boolean isSetLastParPx() {
		return isSetField(669);
	}

	public void set(com.alignmentsystems.fix44.field.LastCapacity value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastCapacity get(com.alignmentsystems.fix44.field.LastCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastCapacity getLastCapacity() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastCapacity());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastCapacity field) {
		return isSetField(field);
	}

	public boolean isSetLastCapacity() {
		return isSetField(29);
	}

	}

	public void set(com.alignmentsystems.fix44.field.PreviouslyReported value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PreviouslyReported get(com.alignmentsystems.fix44.field.PreviouslyReported value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PreviouslyReported getPreviouslyReported() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PreviouslyReported());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PreviouslyReported field) {
		return isSetField(field);
	}

	public boolean isSetPreviouslyReported() {
		return isSetField(570);
	}

	public void set(com.alignmentsystems.fix44.field.ReversalIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ReversalIndicator get(com.alignmentsystems.fix44.field.ReversalIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ReversalIndicator getReversalIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ReversalIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ReversalIndicator field) {
		return isSetField(field);
	}

	public boolean isSetReversalIndicator() {
		return isSetField(700);
	}

	public void set(com.alignmentsystems.fix44.field.MatchType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MatchType get(com.alignmentsystems.fix44.field.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MatchType getMatchType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MatchType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
	}

	public void set(com.alignmentsystems.fix44.field.Side value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Side get(com.alignmentsystems.fix44.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Side getSide() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Side());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(com.alignmentsystems.fix44.component.Instrument component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.Instrument get(com.alignmentsystems.fix44.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.Instrument getInstrument() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.Instrument());
	}

	public void set(com.alignmentsystems.fix44.field.Symbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Symbol get(com.alignmentsystems.fix44.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Symbol getSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Symbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(com.alignmentsystems.fix44.field.SymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SymbolSfx get(com.alignmentsystems.fix44.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityID get(com.alignmentsystems.fix44.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityIDSource get(com.alignmentsystems.fix44.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(com.alignmentsystems.fix44.field.NoSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSecurityAltID get(com.alignmentsystems.fix44.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityAltID get(com.alignmentsystems.fix44.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityAltIDSource get(com.alignmentsystems.fix44.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(com.alignmentsystems.fix44.field.Product value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Product get(com.alignmentsystems.fix44.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Product getProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Product());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(com.alignmentsystems.fix44.field.CFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CFICode get(com.alignmentsystems.fix44.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CFICode getCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityType get(com.alignmentsystems.fix44.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(com.alignmentsystems.fix44.field.SecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecuritySubType get(com.alignmentsystems.fix44.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(com.alignmentsystems.fix44.field.MaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MaturityMonthYear get(com.alignmentsystems.fix44.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(com.alignmentsystems.fix44.field.MaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MaturityDate get(com.alignmentsystems.fix44.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(com.alignmentsystems.fix44.field.PutOrCall value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PutOrCall get(com.alignmentsystems.fix44.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PutOrCall());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(com.alignmentsystems.fix44.field.CouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CouponPaymentDate get(com.alignmentsystems.fix44.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(com.alignmentsystems.fix44.field.IssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IssueDate get(com.alignmentsystems.fix44.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(com.alignmentsystems.fix44.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepoCollateralSecurityType get(com.alignmentsystems.fix44.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(com.alignmentsystems.fix44.field.RepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepurchaseTerm get(com.alignmentsystems.fix44.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(com.alignmentsystems.fix44.field.RepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RepurchaseRate get(com.alignmentsystems.fix44.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(com.alignmentsystems.fix44.field.Factor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Factor get(com.alignmentsystems.fix44.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Factor getFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Factor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(com.alignmentsystems.fix44.field.CreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CreditRating get(com.alignmentsystems.fix44.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(com.alignmentsystems.fix44.field.InstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InstrRegistry get(com.alignmentsystems.fix44.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(com.alignmentsystems.fix44.field.CountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CountryOfIssue get(com.alignmentsystems.fix44.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(com.alignmentsystems.fix44.field.LocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LocaleOfIssue get(com.alignmentsystems.fix44.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(com.alignmentsystems.fix44.field.RedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RedemptionDate get(com.alignmentsystems.fix44.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(com.alignmentsystems.fix44.field.StrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StrikePrice get(com.alignmentsystems.fix44.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(com.alignmentsystems.fix44.field.StrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StrikeCurrency get(com.alignmentsystems.fix44.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(com.alignmentsystems.fix44.field.OptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OptAttribute get(com.alignmentsystems.fix44.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(com.alignmentsystems.fix44.field.ContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ContractMultiplier get(com.alignmentsystems.fix44.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(com.alignmentsystems.fix44.field.CouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CouponRate get(com.alignmentsystems.fix44.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityExchange get(com.alignmentsystems.fix44.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(com.alignmentsystems.fix44.field.Issuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Issuer get(com.alignmentsystems.fix44.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Issuer getIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Issuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedIssuerLen get(com.alignmentsystems.fix44.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedIssuer get(com.alignmentsystems.fix44.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(com.alignmentsystems.fix44.field.SecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecurityDesc get(com.alignmentsystems.fix44.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDesc get(com.alignmentsystems.fix44.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(com.alignmentsystems.fix44.field.Pool value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Pool get(com.alignmentsystems.fix44.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Pool getPool() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Pool());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(com.alignmentsystems.fix44.field.ContractSettlMonth value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ContractSettlMonth get(com.alignmentsystems.fix44.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ContractSettlMonth());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(com.alignmentsystems.fix44.field.CPProgram value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CPProgram get(com.alignmentsystems.fix44.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CPProgram());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(com.alignmentsystems.fix44.field.CPRegType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CPRegType get(com.alignmentsystems.fix44.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CPRegType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(com.alignmentsystems.fix44.field.NoEvents value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoEvents get(com.alignmentsystems.fix44.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoEvents());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.EventType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventType get(com.alignmentsystems.fix44.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventType getEventType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(com.alignmentsystems.fix44.field.EventDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventDate get(com.alignmentsystems.fix44.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventDate getEventDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(com.alignmentsystems.fix44.field.EventPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventPx get(com.alignmentsystems.fix44.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventPx getEventPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(com.alignmentsystems.fix44.field.EventText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EventText get(com.alignmentsystems.fix44.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EventText getEventText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EventText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(com.alignmentsystems.fix44.field.DatedDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DatedDate get(com.alignmentsystems.fix44.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DatedDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(com.alignmentsystems.fix44.field.InterestAccrualDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InterestAccrualDate get(com.alignmentsystems.fix44.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InterestAccrualDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(com.alignmentsystems.fix44.component.InstrumentExtension component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.InstrumentExtension get(com.alignmentsystems.fix44.component.InstrumentExtension component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.InstrumentExtension getInstrumentExtension() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.InstrumentExtension());
	}

	public void set(com.alignmentsystems.fix44.field.DeliveryForm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeliveryForm get(com.alignmentsystems.fix44.field.DeliveryForm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeliveryForm getDeliveryForm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeliveryForm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeliveryForm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryForm() {
		return isSetField(668);
	}

	public void set(com.alignmentsystems.fix44.field.PctAtRisk value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PctAtRisk get(com.alignmentsystems.fix44.field.PctAtRisk value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PctAtRisk getPctAtRisk() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PctAtRisk());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PctAtRisk field) {
		return isSetField(field);
	}

	public boolean isSetPctAtRisk() {
		return isSetField(869);
	}

	public void set(com.alignmentsystems.fix44.field.NoInstrAttrib value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoInstrAttrib get(com.alignmentsystems.fix44.field.NoInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoInstrAttrib());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrAttrib() {
		return isSetField(870);
	}

	public static class NoInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {871, 872, 0};

		public NoInstrAttrib() {
			super(870, 871, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.InstrAttribType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InstrAttribType get(com.alignmentsystems.fix44.field.InstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InstrAttribType getInstrAttribType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InstrAttribType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribType() {
		return isSetField(871);
	}

	public void set(com.alignmentsystems.fix44.field.InstrAttribValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InstrAttribValue get(com.alignmentsystems.fix44.field.InstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InstrAttribValue getInstrAttribValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InstrAttribValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribValue() {
		return isSetField(872);
	}

	}

	public void set(com.alignmentsystems.fix44.component.FinancingDetails component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.FinancingDetails get(com.alignmentsystems.fix44.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.FinancingDetails());
	}

	public void set(com.alignmentsystems.fix44.field.AgreementDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AgreementDesc get(com.alignmentsystems.fix44.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AgreementDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(com.alignmentsystems.fix44.field.AgreementID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AgreementID get(com.alignmentsystems.fix44.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AgreementID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(com.alignmentsystems.fix44.field.AgreementDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AgreementDate get(com.alignmentsystems.fix44.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AgreementDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(com.alignmentsystems.fix44.field.AgreementCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AgreementCurrency get(com.alignmentsystems.fix44.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AgreementCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(com.alignmentsystems.fix44.field.TerminationType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TerminationType get(com.alignmentsystems.fix44.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TerminationType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(com.alignmentsystems.fix44.field.StartDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StartDate get(com.alignmentsystems.fix44.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StartDate getStartDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StartDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(com.alignmentsystems.fix44.field.EndDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EndDate get(com.alignmentsystems.fix44.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EndDate getEndDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EndDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(com.alignmentsystems.fix44.field.DeliveryType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeliveryType get(com.alignmentsystems.fix44.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeliveryType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(com.alignmentsystems.fix44.field.MarginRatio value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MarginRatio get(com.alignmentsystems.fix44.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MarginRatio());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
	}

	public void set(com.alignmentsystems.fix44.field.NoUnderlyings value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoUnderlyings get(com.alignmentsystems.fix44.field.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoUnderlyings());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 315, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.UnderlyingInstrument get(com.alignmentsystems.fix44.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.UnderlyingInstrument());
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSymbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbol get(com.alignmentsystems.fix44.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSymbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbolSfx get(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityID get(com.alignmentsystems.fix44.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource get(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID get(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltID get(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource get(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingProduct value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingProduct get(com.alignmentsystems.fix44.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingProduct());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCFICode get(com.alignmentsystems.fix44.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityType get(com.alignmentsystems.fix44.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecuritySubType get(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear get(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityDate get(com.alignmentsystems.fix44.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingMaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingPutOrCall get(com.alignmentsystems.fix44.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingPutOrCall());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate get(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssueDate get(com.alignmentsystems.fix44.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingIssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType get(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm get(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate get(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingFactor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingFactor get(com.alignmentsystems.fix44.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingFactor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCreditRating get(com.alignmentsystems.fix44.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingInstrRegistry get(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue get(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue get(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingRedemptionDate get(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikePrice get(com.alignmentsystems.fix44.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency get(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingOptAttribute get(com.alignmentsystems.fix44.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingOptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingContractMultiplier get(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponRate get(com.alignmentsystems.fix44.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityExchange get(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssuer get(com.alignmentsystems.fix44.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen get(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer get(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityDesc get(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc get(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPProgram get(com.alignmentsystems.fix44.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCPProgram());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPRegType get(com.alignmentsystems.fix44.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCPRegType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrency get(com.alignmentsystems.fix44.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingQty get(com.alignmentsystems.fix44.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingPx get(com.alignmentsystems.fix44.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingDirtyPrice get(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndPrice get(com.alignmentsystems.fix44.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingEndPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStartValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStartValue get(com.alignmentsystems.fix44.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStartValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrentValue get(com.alignmentsystems.fix44.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingCurrentValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingEndValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndValue get(com.alignmentsystems.fix44.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingEndValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(com.alignmentsystems.fix44.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.UnderlyingStipulations get(com.alignmentsystems.fix44.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.UnderlyingStipulations());
	}

	public void set(com.alignmentsystems.fix44.field.NoUnderlyingStips value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingStips get(com.alignmentsystems.fix44.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoUnderlyingStips());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.UnderlyingStipType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipType get(com.alignmentsystems.fix44.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStipType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(com.alignmentsystems.fix44.field.UnderlyingStipValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipValue get(com.alignmentsystems.fix44.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.UnderlyingStipValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	}

	public void set(com.alignmentsystems.fix44.field.NoLegs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoLegs get(com.alignmentsystems.fix44.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoLegs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.component.InstrumentLeg component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.InstrumentLeg get(com.alignmentsystems.fix44.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.InstrumentLeg());
	}

	public void set(com.alignmentsystems.fix44.field.LegSymbol value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSymbol get(com.alignmentsystems.fix44.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSymbol());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(com.alignmentsystems.fix44.field.LegSymbolSfx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSymbolSfx get(com.alignmentsystems.fix44.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSymbolSfx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityID get(com.alignmentsystems.fix44.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityIDSource get(com.alignmentsystems.fix44.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(com.alignmentsystems.fix44.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoLegSecurityAltID get(com.alignmentsystems.fix44.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoLegSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.LegSecurityAltID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltID get(com.alignmentsystems.fix44.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityAltID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltIDSource get(com.alignmentsystems.fix44.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityAltIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(com.alignmentsystems.fix44.field.LegProduct value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegProduct get(com.alignmentsystems.fix44.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegProduct());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(com.alignmentsystems.fix44.field.LegCFICode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCFICode get(com.alignmentsystems.fix44.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCFICode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityType get(com.alignmentsystems.fix44.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecuritySubType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecuritySubType get(com.alignmentsystems.fix44.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecuritySubType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(com.alignmentsystems.fix44.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegMaturityMonthYear get(com.alignmentsystems.fix44.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegMaturityMonthYear());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(com.alignmentsystems.fix44.field.LegMaturityDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegMaturityDate get(com.alignmentsystems.fix44.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegMaturityDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(com.alignmentsystems.fix44.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCouponPaymentDate get(com.alignmentsystems.fix44.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCouponPaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(com.alignmentsystems.fix44.field.LegIssueDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegIssueDate get(com.alignmentsystems.fix44.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegIssueDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType get(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseTerm get(com.alignmentsystems.fix44.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepurchaseTerm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(com.alignmentsystems.fix44.field.LegRepurchaseRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseRate get(com.alignmentsystems.fix44.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRepurchaseRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(com.alignmentsystems.fix44.field.LegFactor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegFactor get(com.alignmentsystems.fix44.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegFactor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(com.alignmentsystems.fix44.field.LegCreditRating value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCreditRating get(com.alignmentsystems.fix44.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCreditRating());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(com.alignmentsystems.fix44.field.LegInstrRegistry value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegInstrRegistry get(com.alignmentsystems.fix44.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegInstrRegistry());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(com.alignmentsystems.fix44.field.LegCountryOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCountryOfIssue get(com.alignmentsystems.fix44.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCountryOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue get(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(com.alignmentsystems.fix44.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegLocaleOfIssue get(com.alignmentsystems.fix44.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegLocaleOfIssue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(com.alignmentsystems.fix44.field.LegRedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRedemptionDate get(com.alignmentsystems.fix44.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(com.alignmentsystems.fix44.field.LegStrikePrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStrikePrice get(com.alignmentsystems.fix44.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStrikePrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(com.alignmentsystems.fix44.field.LegStrikeCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegStrikeCurrency get(com.alignmentsystems.fix44.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegStrikeCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(com.alignmentsystems.fix44.field.LegOptAttribute value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegOptAttribute get(com.alignmentsystems.fix44.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegOptAttribute());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(com.alignmentsystems.fix44.field.LegContractMultiplier value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegContractMultiplier get(com.alignmentsystems.fix44.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegContractMultiplier());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(com.alignmentsystems.fix44.field.LegCouponRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCouponRate get(com.alignmentsystems.fix44.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCouponRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityExchange value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityExchange get(com.alignmentsystems.fix44.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityExchange());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(com.alignmentsystems.fix44.field.LegIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegIssuer get(com.alignmentsystems.fix44.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuerLen get(com.alignmentsystems.fix44.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegIssuerLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegIssuer value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuer get(com.alignmentsystems.fix44.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegIssuer());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(com.alignmentsystems.fix44.field.LegSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSecurityDesc get(com.alignmentsystems.fix44.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen get(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDesc get(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(com.alignmentsystems.fix44.field.LegRatioQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegRatioQty get(com.alignmentsystems.fix44.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegRatioQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(com.alignmentsystems.fix44.field.LegSide value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegSide get(com.alignmentsystems.fix44.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegSide getLegSide() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegSide());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(com.alignmentsystems.fix44.field.LegCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegCurrency get(com.alignmentsystems.fix44.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(com.alignmentsystems.fix44.field.LegPool value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegPool get(com.alignmentsystems.fix44.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegPool getLegPool() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegPool());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(com.alignmentsystems.fix44.field.LegDatedDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegDatedDate get(com.alignmentsystems.fix44.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegDatedDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(com.alignmentsystems.fix44.field.LegContractSettlMonth value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegContractSettlMonth get(com.alignmentsystems.fix44.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegContractSettlMonth());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(com.alignmentsystems.fix44.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegInterestAccrualDate get(com.alignmentsystems.fix44.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegInterestAccrualDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	}

	public void set(com.alignmentsystems.fix44.field.Quantity value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Quantity get(com.alignmentsystems.fix44.field.Quantity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Quantity getQuantity() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Quantity());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Quantity field) {
		return isSetField(field);
	}

	public boolean isSetQuantity() {
		return isSetField(53);
	}

	public void set(com.alignmentsystems.fix44.field.QtyType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.QtyType get(com.alignmentsystems.fix44.field.QtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.QtyType getQtyType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.QtyType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.QtyType field) {
		return isSetField(field);
	}

	public boolean isSetQtyType() {
		return isSetField(854);
	}

	public void set(com.alignmentsystems.fix44.field.LastMkt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastMkt get(com.alignmentsystems.fix44.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastMkt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
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

	public void set(com.alignmentsystems.fix44.field.PriceType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PriceType get(com.alignmentsystems.fix44.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PriceType getPriceType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PriceType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
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

	public void set(com.alignmentsystems.fix44.field.AvgParPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AvgParPx get(com.alignmentsystems.fix44.field.AvgParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AvgParPx getAvgParPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AvgParPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AvgParPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgParPx() {
		return isSetField(860);
	}

	public void set(com.alignmentsystems.fix44.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.SpreadOrBenchmarkCurveData get(com.alignmentsystems.fix44.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.SpreadOrBenchmarkCurveData());
	}

	public void set(com.alignmentsystems.fix44.field.Spread value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Spread get(com.alignmentsystems.fix44.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Spread getSpread() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Spread());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurveCurrency get(com.alignmentsystems.fix44.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkCurveName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurveName get(com.alignmentsystems.fix44.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkCurveName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurvePoint get(com.alignmentsystems.fix44.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkCurvePoint());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkPrice get(com.alignmentsystems.fix44.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkPriceType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkPriceType get(com.alignmentsystems.fix44.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkPriceType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkSecurityID get(com.alignmentsystems.fix44.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkSecurityID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource get(com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(com.alignmentsystems.fix44.field.Currency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Currency get(com.alignmentsystems.fix44.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Currency getCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Currency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(com.alignmentsystems.fix44.field.AvgPxPrecision value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AvgPxPrecision get(com.alignmentsystems.fix44.field.AvgPxPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AvgPxPrecision getAvgPxPrecision() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AvgPxPrecision());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AvgPxPrecision field) {
		return isSetField(field);
	}

	public boolean isSetAvgPxPrecision() {
		return isSetField(74);
	}

	public void set(com.alignmentsystems.fix44.component.Parties component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.Parties get(com.alignmentsystems.fix44.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.Parties getParties() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.Parties());
	}

	public void set(com.alignmentsystems.fix44.field.NoPartyIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoPartyIDs get(com.alignmentsystems.fix44.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoPartyIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.PartyID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyID get(com.alignmentsystems.fix44.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyID getPartyID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(com.alignmentsystems.fix44.field.PartyIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyIDSource get(com.alignmentsystems.fix44.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(com.alignmentsystems.fix44.field.PartyRole value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartyRole get(com.alignmentsystems.fix44.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartyRole());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(com.alignmentsystems.fix44.field.NoPartySubIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoPartySubIDs get(com.alignmentsystems.fix44.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoPartySubIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.PartySubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartySubID get(com.alignmentsystems.fix44.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartySubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(com.alignmentsystems.fix44.field.PartySubIDType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PartySubIDType get(com.alignmentsystems.fix44.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PartySubIDType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

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

	public void set(com.alignmentsystems.fix44.field.SettlType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlType get(com.alignmentsystems.fix44.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlType getSettlType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(com.alignmentsystems.fix44.field.SettlDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlDate get(com.alignmentsystems.fix44.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(com.alignmentsystems.fix44.field.BookingType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BookingType get(com.alignmentsystems.fix44.field.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BookingType getBookingType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BookingType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
	}

	public void set(com.alignmentsystems.fix44.field.GrossTradeAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.GrossTradeAmt get(com.alignmentsystems.fix44.field.GrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.GrossTradeAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.GrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetGrossTradeAmt() {
		return isSetField(381);
	}

	public void set(com.alignmentsystems.fix44.field.Concession value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Concession get(com.alignmentsystems.fix44.field.Concession value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Concession getConcession() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Concession());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Concession field) {
		return isSetField(field);
	}

	public boolean isSetConcession() {
		return isSetField(238);
	}

	public void set(com.alignmentsystems.fix44.field.TotalTakedown value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotalTakedown get(com.alignmentsystems.fix44.field.TotalTakedown value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotalTakedown());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotalTakedown field) {
		return isSetField(field);
	}

	public boolean isSetTotalTakedown() {
		return isSetField(237);
	}

	public void set(com.alignmentsystems.fix44.field.NetMoney value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetMoney get(com.alignmentsystems.fix44.field.NetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetMoney getNetMoney() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetMoney());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetMoney field) {
		return isSetField(field);
	}

	public boolean isSetNetMoney() {
		return isSetField(118);
	}

	public void set(com.alignmentsystems.fix44.field.PositionEffect value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PositionEffect get(com.alignmentsystems.fix44.field.PositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PositionEffect getPositionEffect() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PositionEffect());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetPositionEffect() {
		return isSetField(77);
	}

	public void set(com.alignmentsystems.fix44.field.AutoAcceptIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AutoAcceptIndicator get(com.alignmentsystems.fix44.field.AutoAcceptIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AutoAcceptIndicator getAutoAcceptIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AutoAcceptIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AutoAcceptIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAutoAcceptIndicator() {
		return isSetField(754);
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

	public void set(com.alignmentsystems.fix44.field.NumDaysInterest value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NumDaysInterest get(com.alignmentsystems.fix44.field.NumDaysInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NumDaysInterest());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NumDaysInterest field) {
		return isSetField(field);
	}

	public boolean isSetNumDaysInterest() {
		return isSetField(157);
	}

	public void set(com.alignmentsystems.fix44.field.AccruedInterestRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AccruedInterestRate get(com.alignmentsystems.fix44.field.AccruedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AccruedInterestRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AccruedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestRate() {
		return isSetField(158);
	}

	public void set(com.alignmentsystems.fix44.field.AccruedInterestAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AccruedInterestAmt get(com.alignmentsystems.fix44.field.AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AccruedInterestAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(159);
	}

	public void set(com.alignmentsystems.fix44.field.TotalAccruedInterestAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotalAccruedInterestAmt get(com.alignmentsystems.fix44.field.TotalAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotalAccruedInterestAmt getTotalAccruedInterestAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotalAccruedInterestAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotalAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetTotalAccruedInterestAmt() {
		return isSetField(540);
	}

	public void set(com.alignmentsystems.fix44.field.InterestAtMaturity value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InterestAtMaturity get(com.alignmentsystems.fix44.field.InterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InterestAtMaturity());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetInterestAtMaturity() {
		return isSetField(738);
	}

	public void set(com.alignmentsystems.fix44.field.EndAccruedInterestAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EndAccruedInterestAmt get(com.alignmentsystems.fix44.field.EndAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EndAccruedInterestAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EndAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetEndAccruedInterestAmt() {
		return isSetField(920);
	}

	public void set(com.alignmentsystems.fix44.field.StartCash value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StartCash get(com.alignmentsystems.fix44.field.StartCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StartCash getStartCash() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StartCash());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StartCash field) {
		return isSetField(field);
	}

	public boolean isSetStartCash() {
		return isSetField(921);
	}

	public void set(com.alignmentsystems.fix44.field.EndCash value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EndCash get(com.alignmentsystems.fix44.field.EndCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EndCash getEndCash() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EndCash());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EndCash field) {
		return isSetField(field);
	}

	public boolean isSetEndCash() {
		return isSetField(922);
	}

	public void set(com.alignmentsystems.fix44.field.LegalConfirm value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LegalConfirm get(com.alignmentsystems.fix44.field.LegalConfirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LegalConfirm getLegalConfirm() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LegalConfirm());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LegalConfirm field) {
		return isSetField(field);
	}

	public boolean isSetLegalConfirm() {
		return isSetField(650);
	}

	public void set(com.alignmentsystems.fix44.component.Stipulations component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.Stipulations get(com.alignmentsystems.fix44.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.Stipulations());
	}

	public void set(com.alignmentsystems.fix44.field.NoStipulations value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoStipulations get(com.alignmentsystems.fix44.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoStipulations());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.StipulationType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StipulationType get(com.alignmentsystems.fix44.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StipulationType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(com.alignmentsystems.fix44.field.StipulationValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StipulationValue get(com.alignmentsystems.fix44.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StipulationValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

	public void set(com.alignmentsystems.fix44.component.YieldData component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.YieldData get(com.alignmentsystems.fix44.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.YieldData getYieldData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.YieldData());
	}

	public void set(com.alignmentsystems.fix44.field.YieldType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.YieldType get(com.alignmentsystems.fix44.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.YieldType getYieldType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.YieldType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(com.alignmentsystems.fix44.field.Yield value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Yield get(com.alignmentsystems.fix44.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Yield getYield() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Yield());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(com.alignmentsystems.fix44.field.YieldCalcDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.YieldCalcDate get(com.alignmentsystems.fix44.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.YieldCalcDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(com.alignmentsystems.fix44.field.YieldRedemptionDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionDate get(com.alignmentsystems.fix44.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.YieldRedemptionDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(com.alignmentsystems.fix44.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionPrice get(com.alignmentsystems.fix44.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.YieldRedemptionPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(com.alignmentsystems.fix44.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionPriceType get(com.alignmentsystems.fix44.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.YieldRedemptionPriceType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(com.alignmentsystems.fix44.field.TotNoAllocs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotNoAllocs get(com.alignmentsystems.fix44.field.TotNoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotNoAllocs getTotNoAllocs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotNoAllocs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotNoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetTotNoAllocs() {
		return isSetField(892);
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

	public void set(com.alignmentsystems.fix44.field.NoAllocs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoAllocs get(com.alignmentsystems.fix44.field.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoAllocs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {79, 661, 573, 366, 80, 467, 81, 539, 208, 209, 161, 360, 361, 12, 13, 479, 497, 153, 154, 119, 737, 120, 736, 155, 156, 742, 741, 136, 576, 635, 780, 172, 169, 170, 171, 85, 0};

		public NoAllocs() {
			super(78, 79, ORDER);
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

	public void set(com.alignmentsystems.fix44.field.AllocPrice value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocPrice get(com.alignmentsystems.fix44.field.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocPrice());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
	}

	public void set(com.alignmentsystems.fix44.field.AllocQty value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocQty get(com.alignmentsystems.fix44.field.AllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocQty getAllocQty() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocQty());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocQty field) {
		return isSetField(field);
	}

	public boolean isSetAllocQty() {
		return isSetField(80);
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

	public void set(com.alignmentsystems.fix44.field.ProcessCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ProcessCode get(com.alignmentsystems.fix44.field.ProcessCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ProcessCode getProcessCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ProcessCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ProcessCode field) {
		return isSetField(field);
	}

	public boolean isSetProcessCode() {
		return isSetField(81);
	}

	public void set(com.alignmentsystems.fix44.component.NestedParties component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.NestedParties get(com.alignmentsystems.fix44.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.NestedParties());
	}

	public void set(com.alignmentsystems.fix44.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoNestedPartyIDs get(com.alignmentsystems.fix44.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoNestedPartyIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.NestedPartyID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NestedPartyID get(com.alignmentsystems.fix44.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NestedPartyID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(com.alignmentsystems.fix44.field.NestedPartyIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NestedPartyIDSource get(com.alignmentsystems.fix44.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NestedPartyIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(com.alignmentsystems.fix44.field.NestedPartyRole value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NestedPartyRole get(com.alignmentsystems.fix44.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NestedPartyRole());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(com.alignmentsystems.fix44.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoNestedPartySubIDs get(com.alignmentsystems.fix44.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoNestedPartySubIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.NestedPartySubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NestedPartySubID get(com.alignmentsystems.fix44.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NestedPartySubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(com.alignmentsystems.fix44.field.NestedPartySubIDType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NestedPartySubIDType get(com.alignmentsystems.fix44.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NestedPartySubIDType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(com.alignmentsystems.fix44.field.NotifyBrokerOfCredit value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NotifyBrokerOfCredit get(com.alignmentsystems.fix44.field.NotifyBrokerOfCredit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NotifyBrokerOfCredit());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NotifyBrokerOfCredit field) {
		return isSetField(field);
	}

	public boolean isSetNotifyBrokerOfCredit() {
		return isSetField(208);
	}

	public void set(com.alignmentsystems.fix44.field.AllocHandlInst value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocHandlInst get(com.alignmentsystems.fix44.field.AllocHandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocHandlInst());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocHandlInst field) {
		return isSetField(field);
	}

	public boolean isSetAllocHandlInst() {
		return isSetField(209);
	}

	public void set(com.alignmentsystems.fix44.field.AllocText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocText get(com.alignmentsystems.fix44.field.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocText getAllocText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedAllocTextLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedAllocTextLen get(com.alignmentsystems.fix44.field.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedAllocTextLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(com.alignmentsystems.fix44.field.EncodedAllocText value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EncodedAllocText get(com.alignmentsystems.fix44.field.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EncodedAllocText());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	public void set(com.alignmentsystems.fix44.component.CommissionData component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.CommissionData get(com.alignmentsystems.fix44.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.CommissionData());
	}

	public void set(com.alignmentsystems.fix44.field.Commission value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Commission get(com.alignmentsystems.fix44.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Commission getCommission() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Commission());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(com.alignmentsystems.fix44.field.CommType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CommType get(com.alignmentsystems.fix44.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CommType getCommType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CommType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(com.alignmentsystems.fix44.field.CommCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CommCurrency get(com.alignmentsystems.fix44.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CommCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(com.alignmentsystems.fix44.field.FundRenewWaiv value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.FundRenewWaiv get(com.alignmentsystems.fix44.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.FundRenewWaiv());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

	public void set(com.alignmentsystems.fix44.field.AllocAvgPx value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAvgPx get(com.alignmentsystems.fix44.field.AllocAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAvgPx getAllocAvgPx() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAvgPx());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAllocAvgPx() {
		return isSetField(153);
	}

	public void set(com.alignmentsystems.fix44.field.AllocNetMoney value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocNetMoney get(com.alignmentsystems.fix44.field.AllocNetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocNetMoney getAllocNetMoney() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocNetMoney());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocNetMoney field) {
		return isSetField(field);
	}

	public boolean isSetAllocNetMoney() {
		return isSetField(154);
	}

	public void set(com.alignmentsystems.fix44.field.SettlCurrAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlCurrAmt get(com.alignmentsystems.fix44.field.SettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlCurrAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrAmt() {
		return isSetField(119);
	}

	public void set(com.alignmentsystems.fix44.field.AllocSettlCurrAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocSettlCurrAmt get(com.alignmentsystems.fix44.field.AllocSettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocSettlCurrAmt getAllocSettlCurrAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocSettlCurrAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocSettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrAmt() {
		return isSetField(737);
	}

	public void set(com.alignmentsystems.fix44.field.SettlCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlCurrency get(com.alignmentsystems.fix44.field.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(com.alignmentsystems.fix44.field.AllocSettlCurrency value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocSettlCurrency get(com.alignmentsystems.fix44.field.AllocSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocSettlCurrency());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrency() {
		return isSetField(736);
	}

	public void set(com.alignmentsystems.fix44.field.SettlCurrFxRate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlCurrFxRate get(com.alignmentsystems.fix44.field.SettlCurrFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlCurrFxRate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlCurrFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRate() {
		return isSetField(155);
	}

	public void set(com.alignmentsystems.fix44.field.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlCurrFxRateCalc get(com.alignmentsystems.fix44.field.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlCurrFxRateCalc());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
	}

	public void set(com.alignmentsystems.fix44.field.AllocAccruedInterestAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocAccruedInterestAmt get(com.alignmentsystems.fix44.field.AllocAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocAccruedInterestAmt getAllocAccruedInterestAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocAccruedInterestAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccruedInterestAmt() {
		return isSetField(742);
	}

	public void set(com.alignmentsystems.fix44.field.AllocInterestAtMaturity value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocInterestAtMaturity get(com.alignmentsystems.fix44.field.AllocInterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocInterestAtMaturity getAllocInterestAtMaturity() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocInterestAtMaturity());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocInterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetAllocInterestAtMaturity() {
		return isSetField(741);
	}

	public void set(com.alignmentsystems.fix44.field.NoMiscFees value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoMiscFees get(com.alignmentsystems.fix44.field.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoMiscFees());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {137, 138, 139, 891, 0};

		public NoMiscFees() {
			super(136, 137, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.MiscFeeAmt value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MiscFeeAmt get(com.alignmentsystems.fix44.field.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MiscFeeAmt());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	public void set(com.alignmentsystems.fix44.field.MiscFeeCurr value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MiscFeeCurr get(com.alignmentsystems.fix44.field.MiscFeeCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MiscFeeCurr());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MiscFeeCurr field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeCurr() {
		return isSetField(138);
	}

	public void set(com.alignmentsystems.fix44.field.MiscFeeType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MiscFeeType get(com.alignmentsystems.fix44.field.MiscFeeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MiscFeeType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MiscFeeType field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeType() {
		return isSetField(139);
	}

	public void set(com.alignmentsystems.fix44.field.MiscFeeBasis value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MiscFeeBasis get(com.alignmentsystems.fix44.field.MiscFeeBasis value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MiscFeeBasis());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MiscFeeBasis field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeBasis() {
		return isSetField(891);
	}

	}

	public void set(com.alignmentsystems.fix44.field.NoClearingInstructions value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoClearingInstructions get(com.alignmentsystems.fix44.field.NoClearingInstructions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoClearingInstructions());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoClearingInstructions field) {
		return isSetField(field);
	}

	public boolean isSetNoClearingInstructions() {
		return isSetField(576);
	}

	public static class NoClearingInstructions extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {577, 0};

		public NoClearingInstructions() {
			super(576, 577, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.ClearingInstruction value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClearingInstruction get(com.alignmentsystems.fix44.field.ClearingInstruction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClearingInstruction());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClearingInstruction field) {
		return isSetField(field);
	}

	public boolean isSetClearingInstruction() {
		return isSetField(577);
	}

	}

	public void set(com.alignmentsystems.fix44.field.ClearingFeeIndicator value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ClearingFeeIndicator get(com.alignmentsystems.fix44.field.ClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ClearingFeeIndicator());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetClearingFeeIndicator() {
		return isSetField(635);
	}

	public void set(com.alignmentsystems.fix44.field.AllocSettlInstType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.AllocSettlInstType get(com.alignmentsystems.fix44.field.AllocSettlInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.AllocSettlInstType getAllocSettlInstType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.AllocSettlInstType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.AllocSettlInstType field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlInstType() {
		return isSetField(780);
	}

	public void set(com.alignmentsystems.fix44.component.SettlInstructionsData component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.SettlInstructionsData get(com.alignmentsystems.fix44.component.SettlInstructionsData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.SettlInstructionsData getSettlInstructionsData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.SettlInstructionsData());
	}

	public void set(com.alignmentsystems.fix44.field.SettlDeliveryType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlDeliveryType get(com.alignmentsystems.fix44.field.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlDeliveryType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
	}

	public void set(com.alignmentsystems.fix44.field.StandInstDbType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StandInstDbType get(com.alignmentsystems.fix44.field.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StandInstDbType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(com.alignmentsystems.fix44.field.StandInstDbName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StandInstDbName get(com.alignmentsystems.fix44.field.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StandInstDbName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(com.alignmentsystems.fix44.field.StandInstDbID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StandInstDbID get(com.alignmentsystems.fix44.field.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StandInstDbID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

	public void set(com.alignmentsystems.fix44.field.NoDlvyInst value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoDlvyInst get(com.alignmentsystems.fix44.field.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoDlvyInst());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {165, 787, 781, 0};

		public NoDlvyInst() {
			super(85, 165, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SettlInstSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstSource get(com.alignmentsystems.fix44.field.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(com.alignmentsystems.fix44.field.DlvyInstType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DlvyInstType get(com.alignmentsystems.fix44.field.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DlvyInstType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(com.alignmentsystems.fix44.component.SettlParties component) {
		setComponent(component);
	}

	public com.alignmentsystems.fix44.component.SettlParties get(com.alignmentsystems.fix44.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public com.alignmentsystems.fix44.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.component.SettlParties());
	}

	public void set(com.alignmentsystems.fix44.field.NoSettlPartyIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSettlPartyIDs get(com.alignmentsystems.fix44.field.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSettlPartyIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {782, 783, 784, 801, 0};

		public NoSettlPartyIDs() {
			super(781, 782, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SettlPartyID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlPartyID get(com.alignmentsystems.fix44.field.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlPartyID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(com.alignmentsystems.fix44.field.SettlPartyIDSource value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlPartyIDSource get(com.alignmentsystems.fix44.field.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlPartyIDSource());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(com.alignmentsystems.fix44.field.SettlPartyRole value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlPartyRole get(com.alignmentsystems.fix44.field.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlPartyRole());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(com.alignmentsystems.fix44.field.NoSettlPartySubIDs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSettlPartySubIDs get(com.alignmentsystems.fix44.field.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSettlPartySubIDs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {785, 786, 0};

		public NoSettlPartySubIDs() {
			super(801, 785, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SettlPartySubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlPartySubID get(com.alignmentsystems.fix44.field.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlPartySubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(com.alignmentsystems.fix44.field.SettlPartySubIDType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlPartySubIDType get(com.alignmentsystems.fix44.field.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlPartySubIDType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

	}

	}

}
