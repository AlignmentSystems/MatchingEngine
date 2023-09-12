
package com.alignmentsystems.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class BidRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "k";
	

	public BidRequest() {
		super();
		getHeader().setField(new com.alignmentsystems.fix44.field.MsgType(MSGTYPE));
	}
	
	public BidRequest(com.alignmentsystems.fix44.field.ClientBidID clientBidID, com.alignmentsystems.fix44.field.BidRequestTransType bidRequestTransType, com.alignmentsystems.fix44.field.TotNoRelatedSym totNoRelatedSym, com.alignmentsystems.fix44.field.BidType bidType, com.alignmentsystems.fix44.field.BidTradeType bidTradeType, com.alignmentsystems.fix44.field.BasisPxType basisPxType) {
		this();
		setField(clientBidID);
		setField(bidRequestTransType);
		setField(totNoRelatedSym);
		setField(bidType);
		setField(bidTradeType);
		setField(basisPxType);
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

	public void set(com.alignmentsystems.fix44.field.BidRequestTransType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidRequestTransType get(com.alignmentsystems.fix44.field.BidRequestTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidRequestTransType getBidRequestTransType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidRequestTransType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidRequestTransType field) {
		return isSetField(field);
	}

	public boolean isSetBidRequestTransType() {
		return isSetField(374);
	}

	public void set(com.alignmentsystems.fix44.field.ListName value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ListName get(com.alignmentsystems.fix44.field.ListName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ListName getListName() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ListName());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ListName field) {
		return isSetField(field);
	}

	public boolean isSetListName() {
		return isSetField(392);
	}

	public void set(com.alignmentsystems.fix44.field.TotNoRelatedSym value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TotNoRelatedSym get(com.alignmentsystems.fix44.field.TotNoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TotNoRelatedSym());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TotNoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetTotNoRelatedSym() {
		return isSetField(393);
	}

	public void set(com.alignmentsystems.fix44.field.BidType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidType get(com.alignmentsystems.fix44.field.BidType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidType getBidType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidType field) {
		return isSetField(field);
	}

	public boolean isSetBidType() {
		return isSetField(394);
	}

	public void set(com.alignmentsystems.fix44.field.NumTickets value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NumTickets get(com.alignmentsystems.fix44.field.NumTickets value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NumTickets getNumTickets() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NumTickets());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NumTickets field) {
		return isSetField(field);
	}

	public boolean isSetNumTickets() {
		return isSetField(395);
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

	public void set(com.alignmentsystems.fix44.field.SideValue1 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SideValue1 get(com.alignmentsystems.fix44.field.SideValue1 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SideValue1 getSideValue1() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SideValue1());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SideValue1 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue1() {
		return isSetField(396);
	}

	public void set(com.alignmentsystems.fix44.field.SideValue2 value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SideValue2 get(com.alignmentsystems.fix44.field.SideValue2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SideValue2 getSideValue2() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SideValue2());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SideValue2 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue2() {
		return isSetField(397);
	}

	public void set(com.alignmentsystems.fix44.field.NoBidDescriptors value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoBidDescriptors get(com.alignmentsystems.fix44.field.NoBidDescriptors value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoBidDescriptors getNoBidDescriptors() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoBidDescriptors());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoBidDescriptors field) {
		return isSetField(field);
	}

	public boolean isSetNoBidDescriptors() {
		return isSetField(398);
	}

	public static class NoBidDescriptors extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {399, 400, 401, 404, 441, 402, 403, 405, 406, 407, 408, 0};

		public NoBidDescriptors() {
			super(398, 399, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.BidDescriptorType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidDescriptorType get(com.alignmentsystems.fix44.field.BidDescriptorType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidDescriptorType getBidDescriptorType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidDescriptorType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidDescriptorType field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptorType() {
		return isSetField(399);
	}

	public void set(com.alignmentsystems.fix44.field.BidDescriptor value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidDescriptor get(com.alignmentsystems.fix44.field.BidDescriptor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidDescriptor getBidDescriptor() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidDescriptor());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidDescriptor field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptor() {
		return isSetField(400);
	}

	public void set(com.alignmentsystems.fix44.field.SideValueInd value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SideValueInd get(com.alignmentsystems.fix44.field.SideValueInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SideValueInd getSideValueInd() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SideValueInd());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SideValueInd field) {
		return isSetField(field);
	}

	public boolean isSetSideValueInd() {
		return isSetField(401);
	}

	public void set(com.alignmentsystems.fix44.field.LiquidityValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LiquidityValue get(com.alignmentsystems.fix44.field.LiquidityValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LiquidityValue getLiquidityValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LiquidityValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LiquidityValue field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityValue() {
		return isSetField(404);
	}

	public void set(com.alignmentsystems.fix44.field.LiquidityNumSecurities value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LiquidityNumSecurities get(com.alignmentsystems.fix44.field.LiquidityNumSecurities value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LiquidityNumSecurities getLiquidityNumSecurities() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LiquidityNumSecurities());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LiquidityNumSecurities field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityNumSecurities() {
		return isSetField(441);
	}

	public void set(com.alignmentsystems.fix44.field.LiquidityPctLow value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LiquidityPctLow get(com.alignmentsystems.fix44.field.LiquidityPctLow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LiquidityPctLow getLiquidityPctLow() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LiquidityPctLow());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LiquidityPctLow field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctLow() {
		return isSetField(402);
	}

	public void set(com.alignmentsystems.fix44.field.LiquidityPctHigh value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LiquidityPctHigh get(com.alignmentsystems.fix44.field.LiquidityPctHigh value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LiquidityPctHigh getLiquidityPctHigh() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LiquidityPctHigh());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LiquidityPctHigh field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctHigh() {
		return isSetField(403);
	}

	public void set(com.alignmentsystems.fix44.field.EFPTrackingError value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.EFPTrackingError get(com.alignmentsystems.fix44.field.EFPTrackingError value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.EFPTrackingError getEFPTrackingError() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.EFPTrackingError());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.EFPTrackingError field) {
		return isSetField(field);
	}

	public boolean isSetEFPTrackingError() {
		return isSetField(405);
	}

	public void set(com.alignmentsystems.fix44.field.FairValue value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.FairValue get(com.alignmentsystems.fix44.field.FairValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.FairValue getFairValue() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.FairValue());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.FairValue field) {
		return isSetField(field);
	}

	public boolean isSetFairValue() {
		return isSetField(406);
	}

	public void set(com.alignmentsystems.fix44.field.OutsideIndexPct value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OutsideIndexPct get(com.alignmentsystems.fix44.field.OutsideIndexPct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OutsideIndexPct getOutsideIndexPct() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OutsideIndexPct());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OutsideIndexPct field) {
		return isSetField(field);
	}

	public boolean isSetOutsideIndexPct() {
		return isSetField(407);
	}

	public void set(com.alignmentsystems.fix44.field.ValueOfFutures value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ValueOfFutures get(com.alignmentsystems.fix44.field.ValueOfFutures value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ValueOfFutures getValueOfFutures() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ValueOfFutures());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ValueOfFutures field) {
		return isSetField(field);
	}

	public boolean isSetValueOfFutures() {
		return isSetField(408);
	}

	}

	public void set(com.alignmentsystems.fix44.field.NoBidComponents value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoBidComponents get(com.alignmentsystems.fix44.field.NoBidComponents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoBidComponents getNoBidComponents() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoBidComponents());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoBidComponents field) {
		return isSetField(field);
	}

	public boolean isSetNoBidComponents() {
		return isSetField(420);
	}

	public static class NoBidComponents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {66, 54, 336, 625, 430, 63, 64, 1, 660, 0};

		public NoBidComponents() {
			super(420, 66, ORDER);
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

	public void set(com.alignmentsystems.fix44.field.NetGrossInd value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NetGrossInd get(com.alignmentsystems.fix44.field.NetGrossInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NetGrossInd());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NetGrossInd field) {
		return isSetField(field);
	}

	public boolean isSetNetGrossInd() {
		return isSetField(430);
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

	}

	public void set(com.alignmentsystems.fix44.field.LiquidityIndType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LiquidityIndType get(com.alignmentsystems.fix44.field.LiquidityIndType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LiquidityIndType getLiquidityIndType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LiquidityIndType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LiquidityIndType field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityIndType() {
		return isSetField(409);
	}

	public void set(com.alignmentsystems.fix44.field.WtAverageLiquidity value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.WtAverageLiquidity get(com.alignmentsystems.fix44.field.WtAverageLiquidity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.WtAverageLiquidity getWtAverageLiquidity() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.WtAverageLiquidity());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.WtAverageLiquidity field) {
		return isSetField(field);
	}

	public boolean isSetWtAverageLiquidity() {
		return isSetField(410);
	}

	public void set(com.alignmentsystems.fix44.field.ExchangeForPhysical value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ExchangeForPhysical get(com.alignmentsystems.fix44.field.ExchangeForPhysical value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ExchangeForPhysical getExchangeForPhysical() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ExchangeForPhysical());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ExchangeForPhysical field) {
		return isSetField(field);
	}

	public boolean isSetExchangeForPhysical() {
		return isSetField(411);
	}

	public void set(com.alignmentsystems.fix44.field.OutMainCntryUIndex value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OutMainCntryUIndex get(com.alignmentsystems.fix44.field.OutMainCntryUIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OutMainCntryUIndex getOutMainCntryUIndex() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OutMainCntryUIndex());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OutMainCntryUIndex field) {
		return isSetField(field);
	}

	public boolean isSetOutMainCntryUIndex() {
		return isSetField(412);
	}

	public void set(com.alignmentsystems.fix44.field.CrossPercent value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CrossPercent get(com.alignmentsystems.fix44.field.CrossPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CrossPercent getCrossPercent() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CrossPercent());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CrossPercent field) {
		return isSetField(field);
	}

	public boolean isSetCrossPercent() {
		return isSetField(413);
	}

	public void set(com.alignmentsystems.fix44.field.ProgRptReqs value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ProgRptReqs get(com.alignmentsystems.fix44.field.ProgRptReqs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ProgRptReqs getProgRptReqs() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ProgRptReqs());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ProgRptReqs field) {
		return isSetField(field);
	}

	public boolean isSetProgRptReqs() {
		return isSetField(414);
	}

	public void set(com.alignmentsystems.fix44.field.ProgPeriodInterval value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ProgPeriodInterval get(com.alignmentsystems.fix44.field.ProgPeriodInterval value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ProgPeriodInterval getProgPeriodInterval() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ProgPeriodInterval());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ProgPeriodInterval field) {
		return isSetField(field);
	}

	public boolean isSetProgPeriodInterval() {
		return isSetField(415);
	}

	public void set(com.alignmentsystems.fix44.field.IncTaxInd value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.IncTaxInd get(com.alignmentsystems.fix44.field.IncTaxInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.IncTaxInd getIncTaxInd() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.IncTaxInd());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.IncTaxInd field) {
		return isSetField(field);
	}

	public boolean isSetIncTaxInd() {
		return isSetField(416);
	}

	public void set(com.alignmentsystems.fix44.field.ForexReq value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.ForexReq get(com.alignmentsystems.fix44.field.ForexReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.ForexReq getForexReq() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.ForexReq());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.ForexReq field) {
		return isSetField(field);
	}

	public boolean isSetForexReq() {
		return isSetField(121);
	}

	public void set(com.alignmentsystems.fix44.field.NumBidders value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NumBidders get(com.alignmentsystems.fix44.field.NumBidders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NumBidders getNumBidders() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NumBidders());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NumBidders field) {
		return isSetField(field);
	}

	public boolean isSetNumBidders() {
		return isSetField(417);
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

	public void set(com.alignmentsystems.fix44.field.BidTradeType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BidTradeType get(com.alignmentsystems.fix44.field.BidTradeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BidTradeType getBidTradeType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BidTradeType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BidTradeType field) {
		return isSetField(field);
	}

	public boolean isSetBidTradeType() {
		return isSetField(418);
	}

	public void set(com.alignmentsystems.fix44.field.BasisPxType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BasisPxType get(com.alignmentsystems.fix44.field.BasisPxType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BasisPxType getBasisPxType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BasisPxType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BasisPxType field) {
		return isSetField(field);
	}

	public boolean isSetBasisPxType() {
		return isSetField(419);
	}

	public void set(com.alignmentsystems.fix44.field.StrikeTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.StrikeTime get(com.alignmentsystems.fix44.field.StrikeTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.StrikeTime getStrikeTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.StrikeTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.StrikeTime field) {
		return isSetField(field);
	}

	public boolean isSetStrikeTime() {
		return isSetField(443);
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
