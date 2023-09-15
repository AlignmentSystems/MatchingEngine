
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlementInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "T";
	

	public SettlementInstructions() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public SettlementInstructions(com.alignmentsystems.fix44.field.SettlInstMsgID settlInstMsgID, com.alignmentsystems.fix44.field.SettlInstMode settlInstMode, com.alignmentsystems.fix44.field.TransactTime transactTime) {
		this();
		setField(settlInstMsgID);
		setField(settlInstMode);
		setField(transactTime);
	}
	
	public void set(com.alignmentsystems.fix44.field.SettlInstMsgID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstMsgID get(com.alignmentsystems.fix44.field.SettlInstMsgID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstMsgID getSettlInstMsgID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstMsgID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstMsgID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMsgID() {
		return isSetField(777);
	}

	public void set(com.alignmentsystems.fix44.field.SettlInstReqID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstReqID get(com.alignmentsystems.fix44.field.SettlInstReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstReqID getSettlInstReqID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstReqID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstReqID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqID() {
		return isSetField(791);
	}

	public void set(com.alignmentsystems.fix44.field.SettlInstMode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstMode get(com.alignmentsystems.fix44.field.SettlInstMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstMode getSettlInstMode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstMode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstMode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMode() {
		return isSetField(160);
	}

	public void set(com.alignmentsystems.fix44.field.SettlInstReqRejCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstReqRejCode get(com.alignmentsystems.fix44.field.SettlInstReqRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstReqRejCode getSettlInstReqRejCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstReqRejCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstReqRejCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqRejCode() {
		return isSetField(792);
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

	public void set(com.alignmentsystems.fix44.field.NoSettlInst value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoSettlInst get(com.alignmentsystems.fix44.field.NoSettlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoSettlInst getNoSettlInst() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoSettlInst());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoSettlInst field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlInst() {
		return isSetField(778);
	}

	public static class NoSettlInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {162, 163, 214, 453, 54, 460, 167, 461, 168, 126, 779, 172, 169, 170, 171, 85, 492, 476, 488, 489, 503, 490, 491, 504, 505, 0};

		public NoSettlInst() {
			super(778, 162, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.SettlInstID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstID get(com.alignmentsystems.fix44.field.SettlInstID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstID getSettlInstID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstID() {
		return isSetField(162);
	}

	public void set(com.alignmentsystems.fix44.field.SettlInstTransType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstTransType get(com.alignmentsystems.fix44.field.SettlInstTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstTransType getSettlInstTransType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstTransType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstTransType field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstTransType() {
		return isSetField(163);
	}

	public void set(com.alignmentsystems.fix44.field.SettlInstRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SettlInstRefID get(com.alignmentsystems.fix44.field.SettlInstRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SettlInstRefID getSettlInstRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SettlInstRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SettlInstRefID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstRefID() {
		return isSetField(214);
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

	public void set(com.alignmentsystems.fix44.field.EffectiveTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EffectiveTime get(com.alignmentsystems.fix44.field.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EffectiveTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
	}

	public void set(com.alignmentsystems.fix44.field.ExpireTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ExpireTime get(com.alignmentsystems.fix44.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ExpireTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(com.alignmentsystems.fix44.field.LastUpdateTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastUpdateTime get(com.alignmentsystems.fix44.field.LastUpdateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastUpdateTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastUpdateTime field) {
		return isSetField(field);
	}

	public boolean isSetLastUpdateTime() {
		return isSetField(779);
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

	public void set(com.alignmentsystems.fix44.field.PaymentMethod value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PaymentMethod get(com.alignmentsystems.fix44.field.PaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PaymentMethod());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetPaymentMethod() {
		return isSetField(492);
	}

	public void set(com.alignmentsystems.fix44.field.PaymentRef value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PaymentRef get(com.alignmentsystems.fix44.field.PaymentRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PaymentRef getPaymentRef() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PaymentRef());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PaymentRef field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRef() {
		return isSetField(476);
	}

	public void set(com.alignmentsystems.fix44.field.CardHolderName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CardHolderName get(com.alignmentsystems.fix44.field.CardHolderName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CardHolderName getCardHolderName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CardHolderName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CardHolderName field) {
		return isSetField(field);
	}

	public boolean isSetCardHolderName() {
		return isSetField(488);
	}

	public void set(com.alignmentsystems.fix44.field.CardNumber value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CardNumber get(com.alignmentsystems.fix44.field.CardNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CardNumber getCardNumber() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CardNumber());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CardNumber field) {
		return isSetField(field);
	}

	public boolean isSetCardNumber() {
		return isSetField(489);
	}

	public void set(com.alignmentsystems.fix44.field.CardStartDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CardStartDate get(com.alignmentsystems.fix44.field.CardStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CardStartDate getCardStartDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CardStartDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CardStartDate field) {
		return isSetField(field);
	}

	public boolean isSetCardStartDate() {
		return isSetField(503);
	}

	public void set(com.alignmentsystems.fix44.field.CardExpDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CardExpDate get(com.alignmentsystems.fix44.field.CardExpDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CardExpDate getCardExpDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CardExpDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CardExpDate field) {
		return isSetField(field);
	}

	public boolean isSetCardExpDate() {
		return isSetField(490);
	}

	public void set(com.alignmentsystems.fix44.field.CardIssNum value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CardIssNum get(com.alignmentsystems.fix44.field.CardIssNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CardIssNum getCardIssNum() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CardIssNum());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CardIssNum field) {
		return isSetField(field);
	}

	public boolean isSetCardIssNum() {
		return isSetField(491);
	}

	public void set(com.alignmentsystems.fix44.field.PaymentDate value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PaymentDate get(com.alignmentsystems.fix44.field.PaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PaymentDate getPaymentDate() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PaymentDate());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetPaymentDate() {
		return isSetField(504);
	}

	public void set(com.alignmentsystems.fix44.field.PaymentRemitterID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PaymentRemitterID get(com.alignmentsystems.fix44.field.PaymentRemitterID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PaymentRemitterID getPaymentRemitterID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PaymentRemitterID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PaymentRemitterID field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRemitterID() {
		return isSetField(505);
	}

	}

}
