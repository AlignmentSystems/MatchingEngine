
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlementInstructionRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AV";
	

	public SettlementInstructionRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public SettlementInstructionRequest(com.alignmentsystems.fix44.field.SettlInstReqID settlInstReqID, com.alignmentsystems.fix44.field.TransactTime transactTime) {
		this();
		setField(settlInstReqID);
		setField(transactTime);
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

}
