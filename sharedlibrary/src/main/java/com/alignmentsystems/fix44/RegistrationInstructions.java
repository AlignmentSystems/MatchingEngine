
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;
import quickfix.Group;

public class RegistrationInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "o";
	

	public RegistrationInstructions() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructions(com.alignmentsystems.fix44.field.RegistID registID, com.alignmentsystems.fix44.field.RegistTransType registTransType, com.alignmentsystems.fix44.field.RegistRefID registRefID) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
	}
	
	public void set(com.alignmentsystems.fix44.field.RegistID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistID get(com.alignmentsystems.fix44.field.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistID getRegistID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(com.alignmentsystems.fix44.field.RegistTransType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistTransType get(com.alignmentsystems.fix44.field.RegistTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistTransType getRegistTransType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistTransType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistTransType field) {
		return isSetField(field);
	}

	public boolean isSetRegistTransType() {
		return isSetField(514);
	}

	public void set(com.alignmentsystems.fix44.field.RegistRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistRefID get(com.alignmentsystems.fix44.field.RegistRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistRefID getRegistRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistRefID field) {
		return isSetField(field);
	}

	public boolean isSetRegistRefID() {
		return isSetField(508);
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

	public void set(com.alignmentsystems.fix44.field.RegistAcctType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistAcctType get(com.alignmentsystems.fix44.field.RegistAcctType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistAcctType getRegistAcctType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistAcctType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistAcctType field) {
		return isSetField(field);
	}

	public boolean isSetRegistAcctType() {
		return isSetField(493);
	}

	public void set(com.alignmentsystems.fix44.field.TaxAdvantageType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TaxAdvantageType get(com.alignmentsystems.fix44.field.TaxAdvantageType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TaxAdvantageType getTaxAdvantageType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TaxAdvantageType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TaxAdvantageType field) {
		return isSetField(field);
	}

	public boolean isSetTaxAdvantageType() {
		return isSetField(495);
	}

	public void set(com.alignmentsystems.fix44.field.OwnershipType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OwnershipType get(com.alignmentsystems.fix44.field.OwnershipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OwnershipType getOwnershipType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OwnershipType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OwnershipType field) {
		return isSetField(field);
	}

	public boolean isSetOwnershipType() {
		return isSetField(517);
	}

	public void set(com.alignmentsystems.fix44.field.NoRegistDtls value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoRegistDtls get(com.alignmentsystems.fix44.field.NoRegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoRegistDtls getNoRegistDtls() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoRegistDtls());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoRegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetNoRegistDtls() {
		return isSetField(473);
	}

	public static class NoRegistDtls extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {509, 511, 474, 482, 539, 522, 486, 475, 0};

		public NoRegistDtls() {
			super(473, 509, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.RegistDtls value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistDtls get(com.alignmentsystems.fix44.field.RegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistDtls getRegistDtls() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistDtls());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetRegistDtls() {
		return isSetField(509);
	}

	public void set(com.alignmentsystems.fix44.field.RegistEmail value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.RegistEmail get(com.alignmentsystems.fix44.field.RegistEmail value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.RegistEmail getRegistEmail() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.RegistEmail());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.RegistEmail field) {
		return isSetField(field);
	}

	public boolean isSetRegistEmail() {
		return isSetField(511);
	}

	public void set(com.alignmentsystems.fix44.field.MailingDtls value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MailingDtls get(com.alignmentsystems.fix44.field.MailingDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MailingDtls getMailingDtls() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MailingDtls());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MailingDtls field) {
		return isSetField(field);
	}

	public boolean isSetMailingDtls() {
		return isSetField(474);
	}

	public void set(com.alignmentsystems.fix44.field.MailingInst value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MailingInst get(com.alignmentsystems.fix44.field.MailingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MailingInst getMailingInst() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MailingInst());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MailingInst field) {
		return isSetField(field);
	}

	public boolean isSetMailingInst() {
		return isSetField(482);
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

	public void set(com.alignmentsystems.fix44.field.OwnerType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OwnerType get(com.alignmentsystems.fix44.field.OwnerType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OwnerType getOwnerType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OwnerType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OwnerType field) {
		return isSetField(field);
	}

	public boolean isSetOwnerType() {
		return isSetField(522);
	}

	public void set(com.alignmentsystems.fix44.field.DateOfBirth value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DateOfBirth get(com.alignmentsystems.fix44.field.DateOfBirth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DateOfBirth getDateOfBirth() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DateOfBirth());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DateOfBirth field) {
		return isSetField(field);
	}

	public boolean isSetDateOfBirth() {
		return isSetField(486);
	}

	public void set(com.alignmentsystems.fix44.field.InvestorCountryOfResidence value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.InvestorCountryOfResidence get(com.alignmentsystems.fix44.field.InvestorCountryOfResidence value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.InvestorCountryOfResidence getInvestorCountryOfResidence() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.InvestorCountryOfResidence());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.InvestorCountryOfResidence field) {
		return isSetField(field);
	}

	public boolean isSetInvestorCountryOfResidence() {
		return isSetField(475);
	}

	}

	public void set(com.alignmentsystems.fix44.field.NoDistribInsts value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoDistribInsts get(com.alignmentsystems.fix44.field.NoDistribInsts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoDistribInsts getNoDistribInsts() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoDistribInsts());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoDistribInsts field) {
		return isSetField(field);
	}

	public boolean isSetNoDistribInsts() {
		return isSetField(510);
	}

	public static class NoDistribInsts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {477, 512, 478, 498, 499, 500, 501, 502, 0};

		public NoDistribInsts() {
			super(510, 477, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.DistribPaymentMethod value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DistribPaymentMethod get(com.alignmentsystems.fix44.field.DistribPaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DistribPaymentMethod getDistribPaymentMethod() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DistribPaymentMethod());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DistribPaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetDistribPaymentMethod() {
		return isSetField(477);
	}

	public void set(com.alignmentsystems.fix44.field.DistribPercentage value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DistribPercentage get(com.alignmentsystems.fix44.field.DistribPercentage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DistribPercentage getDistribPercentage() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DistribPercentage());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DistribPercentage field) {
		return isSetField(field);
	}

	public boolean isSetDistribPercentage() {
		return isSetField(512);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribCurr value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribCurr get(com.alignmentsystems.fix44.field.CashDistribCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribCurr getCashDistribCurr() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribCurr());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribCurr field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribCurr() {
		return isSetField(478);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribAgentName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentName get(com.alignmentsystems.fix44.field.CashDistribAgentName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentName getCashDistribAgentName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribAgentName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribAgentName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentName() {
		return isSetField(498);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribAgentCode value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentCode get(com.alignmentsystems.fix44.field.CashDistribAgentCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentCode getCashDistribAgentCode() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribAgentCode());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribAgentCode field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentCode() {
		return isSetField(499);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber get(com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribAgentAcctNumber field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctNumber() {
		return isSetField(500);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribPayRef value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribPayRef get(com.alignmentsystems.fix44.field.CashDistribPayRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribPayRef getCashDistribPayRef() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribPayRef());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribPayRef field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribPayRef() {
		return isSetField(501);
	}

	public void set(com.alignmentsystems.fix44.field.CashDistribAgentAcctName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentAcctName get(com.alignmentsystems.fix44.field.CashDistribAgentAcctName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CashDistribAgentAcctName getCashDistribAgentAcctName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CashDistribAgentAcctName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CashDistribAgentAcctName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctName() {
		return isSetField(502);
	}

	}

}
