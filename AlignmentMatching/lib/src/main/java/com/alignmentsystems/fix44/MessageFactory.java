/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package com.alignmentsystems.fix44;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case com.alignmentsystems.fix44.Heartbeat.MSGTYPE:
				return new com.alignmentsystems.fix44.Heartbeat();
	
			case com.alignmentsystems.fix44.Logon.MSGTYPE:
				return new com.alignmentsystems.fix44.Logon();
	
			case com.alignmentsystems.fix44.TestRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.TestRequest();
	
			case com.alignmentsystems.fix44.ResendRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.ResendRequest();
	
			case com.alignmentsystems.fix44.Reject.MSGTYPE:
				return new com.alignmentsystems.fix44.Reject();
	
			case com.alignmentsystems.fix44.SequenceReset.MSGTYPE:
				return new com.alignmentsystems.fix44.SequenceReset();
	
			case com.alignmentsystems.fix44.Logout.MSGTYPE:
				return new com.alignmentsystems.fix44.Logout();
	
			case com.alignmentsystems.fix44.BusinessMessageReject.MSGTYPE:
				return new com.alignmentsystems.fix44.BusinessMessageReject();
	
			case com.alignmentsystems.fix44.UserRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.UserRequest();
	
			case com.alignmentsystems.fix44.UserResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.UserResponse();
	
			case com.alignmentsystems.fix44.Advertisement.MSGTYPE:
				return new com.alignmentsystems.fix44.Advertisement();
	
			case com.alignmentsystems.fix44.IndicationOfInterest.MSGTYPE:
				return new com.alignmentsystems.fix44.IndicationOfInterest();
	
			case com.alignmentsystems.fix44.News.MSGTYPE:
				return new com.alignmentsystems.fix44.News();
	
			case com.alignmentsystems.fix44.Email.MSGTYPE:
				return new com.alignmentsystems.fix44.Email();
	
			case com.alignmentsystems.fix44.QuoteRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteRequest();
	
			case com.alignmentsystems.fix44.QuoteResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteResponse();
	
			case com.alignmentsystems.fix44.QuoteRequestReject.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteRequestReject();
	
			case com.alignmentsystems.fix44.RFQRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.RFQRequest();
	
			case com.alignmentsystems.fix44.Quote.MSGTYPE:
				return new com.alignmentsystems.fix44.Quote();
	
			case com.alignmentsystems.fix44.QuoteCancel.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteCancel();
	
			case com.alignmentsystems.fix44.QuoteStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteStatusRequest();
	
			case com.alignmentsystems.fix44.QuoteStatusReport.MSGTYPE:
				return new com.alignmentsystems.fix44.QuoteStatusReport();
	
			case com.alignmentsystems.fix44.MassQuote.MSGTYPE:
				return new com.alignmentsystems.fix44.MassQuote();
	
			case com.alignmentsystems.fix44.MassQuoteAcknowledgement.MSGTYPE:
				return new com.alignmentsystems.fix44.MassQuoteAcknowledgement();
	
			case com.alignmentsystems.fix44.MarketDataRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.MarketDataRequest();
	
			case com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh();
	
			case com.alignmentsystems.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh();
	
			case com.alignmentsystems.fix44.MarketDataRequestReject.MSGTYPE:
				return new com.alignmentsystems.fix44.MarketDataRequestReject();
	
			case com.alignmentsystems.fix44.SecurityDefinitionRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityDefinitionRequest();
	
			case com.alignmentsystems.fix44.SecurityDefinition.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityDefinition();
	
			case com.alignmentsystems.fix44.SecurityTypeRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityTypeRequest();
	
			case com.alignmentsystems.fix44.SecurityTypes.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityTypes();
	
			case com.alignmentsystems.fix44.SecurityListRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityListRequest();
	
			case com.alignmentsystems.fix44.SecurityList.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityList();
	
			case com.alignmentsystems.fix44.DerivativeSecurityListRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.DerivativeSecurityListRequest();
	
			case com.alignmentsystems.fix44.DerivativeSecurityList.MSGTYPE:
				return new com.alignmentsystems.fix44.DerivativeSecurityList();
	
			case com.alignmentsystems.fix44.SecurityStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityStatusRequest();
	
			case com.alignmentsystems.fix44.SecurityStatus.MSGTYPE:
				return new com.alignmentsystems.fix44.SecurityStatus();
	
			case com.alignmentsystems.fix44.TradingSessionStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.TradingSessionStatusRequest();
	
			case com.alignmentsystems.fix44.TradingSessionStatus.MSGTYPE:
				return new com.alignmentsystems.fix44.TradingSessionStatus();
	
			case com.alignmentsystems.fix44.NewOrderSingle.MSGTYPE:
				return new com.alignmentsystems.fix44.NewOrderSingle();
	
			case com.alignmentsystems.fix44.ExecutionReport.MSGTYPE:
				return new com.alignmentsystems.fix44.ExecutionReport();
	
			case com.alignmentsystems.fix44.DontKnowTrade.MSGTYPE:
				return new com.alignmentsystems.fix44.DontKnowTrade();
	
			case com.alignmentsystems.fix44.OrderCancelReplaceRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderCancelReplaceRequest();
	
			case com.alignmentsystems.fix44.OrderCancelRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderCancelRequest();
	
			case com.alignmentsystems.fix44.OrderCancelReject.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderCancelReject();
	
			case com.alignmentsystems.fix44.OrderStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderStatusRequest();
	
			case com.alignmentsystems.fix44.OrderMassCancelRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderMassCancelRequest();
	
			case com.alignmentsystems.fix44.OrderMassCancelReport.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderMassCancelReport();
	
			case com.alignmentsystems.fix44.OrderMassStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.OrderMassStatusRequest();
	
			case com.alignmentsystems.fix44.NewOrderCross.MSGTYPE:
				return new com.alignmentsystems.fix44.NewOrderCross();
	
			case com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest();
	
			case com.alignmentsystems.fix44.CrossOrderCancelRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.CrossOrderCancelRequest();
	
			case com.alignmentsystems.fix44.NewOrderMultileg.MSGTYPE:
				return new com.alignmentsystems.fix44.NewOrderMultileg();
	
			case com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest();
	
			case com.alignmentsystems.fix44.BidRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.BidRequest();
	
			case com.alignmentsystems.fix44.BidResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.BidResponse();
	
			case com.alignmentsystems.fix44.NewOrderList.MSGTYPE:
				return new com.alignmentsystems.fix44.NewOrderList();
	
			case com.alignmentsystems.fix44.ListStrikePrice.MSGTYPE:
				return new com.alignmentsystems.fix44.ListStrikePrice();
	
			case com.alignmentsystems.fix44.ListStatus.MSGTYPE:
				return new com.alignmentsystems.fix44.ListStatus();
	
			case com.alignmentsystems.fix44.ListExecute.MSGTYPE:
				return new com.alignmentsystems.fix44.ListExecute();
	
			case com.alignmentsystems.fix44.ListCancelRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.ListCancelRequest();
	
			case com.alignmentsystems.fix44.ListStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.ListStatusRequest();
	
			case com.alignmentsystems.fix44.AllocationInstruction.MSGTYPE:
				return new com.alignmentsystems.fix44.AllocationInstruction();
	
			case com.alignmentsystems.fix44.AllocationInstructionAck.MSGTYPE:
				return new com.alignmentsystems.fix44.AllocationInstructionAck();
	
			case com.alignmentsystems.fix44.AllocationReport.MSGTYPE:
				return new com.alignmentsystems.fix44.AllocationReport();
	
			case com.alignmentsystems.fix44.AllocationReportAck.MSGTYPE:
				return new com.alignmentsystems.fix44.AllocationReportAck();
	
			case com.alignmentsystems.fix44.Confirmation.MSGTYPE:
				return new com.alignmentsystems.fix44.Confirmation();
	
			case com.alignmentsystems.fix44.ConfirmationAck.MSGTYPE:
				return new com.alignmentsystems.fix44.ConfirmationAck();
	
			case com.alignmentsystems.fix44.ConfirmationRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.ConfirmationRequest();
	
			case com.alignmentsystems.fix44.SettlementInstructions.MSGTYPE:
				return new com.alignmentsystems.fix44.SettlementInstructions();
	
			case com.alignmentsystems.fix44.SettlementInstructionRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.SettlementInstructionRequest();
	
			case com.alignmentsystems.fix44.TradeCaptureReportRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.TradeCaptureReportRequest();
	
			case com.alignmentsystems.fix44.TradeCaptureReportRequestAck.MSGTYPE:
				return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck();
	
			case com.alignmentsystems.fix44.TradeCaptureReport.MSGTYPE:
				return new com.alignmentsystems.fix44.TradeCaptureReport();
	
			case com.alignmentsystems.fix44.TradeCaptureReportAck.MSGTYPE:
				return new com.alignmentsystems.fix44.TradeCaptureReportAck();
	
			case com.alignmentsystems.fix44.RegistrationInstructions.MSGTYPE:
				return new com.alignmentsystems.fix44.RegistrationInstructions();
	
			case com.alignmentsystems.fix44.RegistrationInstructionsResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.RegistrationInstructionsResponse();
	
			case com.alignmentsystems.fix44.PositionMaintenanceRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.PositionMaintenanceRequest();
	
			case com.alignmentsystems.fix44.PositionMaintenanceReport.MSGTYPE:
				return new com.alignmentsystems.fix44.PositionMaintenanceReport();
	
			case com.alignmentsystems.fix44.RequestForPositions.MSGTYPE:
				return new com.alignmentsystems.fix44.RequestForPositions();
	
			case com.alignmentsystems.fix44.RequestForPositionsAck.MSGTYPE:
				return new com.alignmentsystems.fix44.RequestForPositionsAck();
	
			case com.alignmentsystems.fix44.PositionReport.MSGTYPE:
				return new com.alignmentsystems.fix44.PositionReport();
	
			case com.alignmentsystems.fix44.AssignmentReport.MSGTYPE:
				return new com.alignmentsystems.fix44.AssignmentReport();
	
			case com.alignmentsystems.fix44.CollateralRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralRequest();
	
			case com.alignmentsystems.fix44.CollateralAssignment.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralAssignment();
	
			case com.alignmentsystems.fix44.CollateralResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralResponse();
	
			case com.alignmentsystems.fix44.CollateralReport.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralReport();
	
			case com.alignmentsystems.fix44.CollateralInquiry.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralInquiry();
	
			case com.alignmentsystems.fix44.NetworkStatusRequest.MSGTYPE:
				return new com.alignmentsystems.fix44.NetworkStatusRequest();
	
			case com.alignmentsystems.fix44.NetworkStatusResponse.MSGTYPE:
				return new com.alignmentsystems.fix44.NetworkStatusResponse();
	
			case com.alignmentsystems.fix44.CollateralInquiryAck.MSGTYPE:
				return new com.alignmentsystems.fix44.CollateralInquiryAck();
	
		}

		return new com.alignmentsystems.fix44.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case com.alignmentsystems.fix44.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoMsgTypes.FIELD:
					return new com.alignmentsystems.fix44.Logon.NoMsgTypes();
	
				}
				break;
	
			case com.alignmentsystems.fix44.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.Advertisement.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.IndicationOfInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoIOIQualifiers.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoIOIQualifiers();
	
				case com.alignmentsystems.fix44.field.NoRoutingIDs.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoRoutingIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.IndicationOfInterest.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRoutingIDs.FIELD:
					return new com.alignmentsystems.fix44.News.NoRoutingIDs();
	
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.News.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.News.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.News.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.News.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.News.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.News.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.News.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.LinesOfText.FIELD:
					return new com.alignmentsystems.fix44.News.LinesOfText();
	
				}
				break;
	
			case com.alignmentsystems.fix44.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRoutingIDs.FIELD:
					return new com.alignmentsystems.fix44.Email.NoRoutingIDs();
	
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.Email.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Email.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.Email.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.Email.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Email.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.Email.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Email.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.LinesOfText.FIELD:
					return new com.alignmentsystems.fix44.Email.LinesOfText();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoQuoteQualifiers.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoQuoteQualifiers.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoQuoteQualifiers();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteResponse.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoQuoteQualifiers.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoQuoteQualifiers();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteRequestReject.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.RFQRequest.NoRelatedSym.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoQuoteQualifiers.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoQuoteQualifiers();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.Quote.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoQuoteEntries.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoQuoteEntries.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoQuoteQualifiers.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoQuoteQualifiers();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.QuoteStatusReport.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoQuoteSets.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets();
	
				case com.alignmentsystems.fix44.field.NoQuoteEntries.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoQuoteSets.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets();
	
				case com.alignmentsystems.fix44.field.NoQuoteEntries.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoMDEntryTypes.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoMDEntryTypes();
	
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoMDEntries.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MarketDataSnapshotFullRefresh.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoMDEntries.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAltMDSource.FIELD:
					return new com.alignmentsystems.fix44.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinitionRequest.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityDefinition.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSecurityTypes.FIELD:
					return new com.alignmentsystems.fix44.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityListRequest.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoInstrAttrib();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.SecurityList.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRelatedSym.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoRelatedSym.NoInstrAttrib();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DerivativeSecurityList.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatusRequest.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.SecurityStatus.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.NewOrderSingle.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoContraBrokers.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoContraBrokers();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoContAmts.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoContAmts();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.ExecutionReport.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.DontKnowTrade.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.DontKnowTrade.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderCancelRequest.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderStatusRequest.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAffectedOrders.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelReport.NoAffectedOrders();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassCancelReport.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderMassStatusRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassStatusRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.OrderMassStatusRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSides.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.NewOrderCross.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSides.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelReplaceRequest.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSides.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoSides();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CrossOrderCancelRequest.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested3PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested3PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegAllocs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.NewOrderMultileg.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested3PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested3PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegAllocs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.MultilegOrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoBidDescriptors.FIELD:
					return new com.alignmentsystems.fix44.BidRequest.NoBidDescriptors();
	
				case com.alignmentsystems.fix44.field.NoBidComponents.FIELD:
					return new com.alignmentsystems.fix44.BidRequest.NoBidComponents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoBidComponents.FIELD:
					return new com.alignmentsystems.fix44.BidResponse.NoBidComponents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.NewOrderList.NoOrders.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoStrikes.FIELD:
					return new com.alignmentsystems.fix44.ListStrikePrice.NoStrikes();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.ListStrikePrice.NoStrikes.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.ListStrikePrice.NoStrikes.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.ListStrikePrice.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.ListStrikePrice.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case com.alignmentsystems.fix44.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.ListStatus.NoOrders();
	
				}
				break;
	
			case com.alignmentsystems.fix44.AllocationInstruction.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoOrders();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoInstrAttrib();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstruction.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.AllocationInstructionAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstructionAck.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstructionAck.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.AllocationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoOrders();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoClearingInstructions.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoInstrAttrib();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.AllocationReport.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.AllocationReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReportAck.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReportAck.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.Confirmation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoOrders();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoCapacities.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoCapacities();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoInstrAttrib();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.Confirmation.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.ConfirmationRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoOrders.FIELD:
					return new com.alignmentsystems.fix44.ConfirmationRequest.NoOrders();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoSettlInst.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.SettlementInstructionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructionRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoDates.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoDates();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoInstrAttrib.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequest.NoInstrAttrib();
	
				}
				break;
	
			case com.alignmentsystems.fix44.TradeCaptureReportRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportRequestAck.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSides.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides();
	
				case com.alignmentsystems.fix44.field.NoClearingInstructions.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case com.alignmentsystems.fix44.field.NoContAmts.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoContAmts();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSides.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPosAmt.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoPosAmt();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReport.NoTrdRegTimestamps();
	
				}
				break;
	
			case com.alignmentsystems.fix44.TradeCaptureReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoLegStipulations.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoAllocs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoAllocs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartyIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNested2PartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				}
				break;
	
			case com.alignmentsystems.fix44.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoRegistDtls.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoRegistDtls();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoDistribInsts.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoDistribInsts();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructionsResponse.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.PositionMaintenanceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPositions.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoPositions();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.PositionMaintenanceReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPositions.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPositions();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPosAmt.FIELD:
					return new com.alignmentsystems.fix44.PositionMaintenanceReport.NoPosAmt();
	
				}
				break;
	
			case com.alignmentsystems.fix44.RequestForPositions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoTradingSessions.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoTradingSessions();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositions.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.RequestForPositionsAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.RequestForPositionsAck.NoEvents();
	
				}
				break;
	
			case com.alignmentsystems.fix44.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPositions.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPositions();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPosAmt.FIELD:
					return new com.alignmentsystems.fix44.PositionReport.NoPosAmt();
	
				}
				break;
	
			case com.alignmentsystems.fix44.AssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoPositions.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPositions();
	
				case com.alignmentsystems.fix44.field.NoNestedPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoNestedPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoPosAmt.FIELD:
					return new com.alignmentsystems.fix44.AssignmentReport.NoPosAmt();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CollateralRequest.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralAssignment.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CollateralResponse.NoStipulations();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoMiscFees.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoMiscFees();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralInquiry.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoCollInquiryQualifier.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoCollInquiryQualifier();
	
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoEvents();
	
				case com.alignmentsystems.fix44.field.NoTrdRegTimestamps.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoTrdRegTimestamps();
	
				case com.alignmentsystems.fix44.field.NoStipulations.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoStipulations();
	
				case com.alignmentsystems.fix44.field.NoDlvyInst.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoDlvyInst();
	
				case com.alignmentsystems.fix44.field.NoSettlPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoSettlPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NetworkStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoCompIDs.FIELD:
					return new com.alignmentsystems.fix44.NetworkStatusRequest.NoCompIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.NetworkStatusResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoCompIDs.FIELD:
					return new com.alignmentsystems.fix44.NetworkStatusResponse.NoCompIDs();
	
				}
				break;
	
			case com.alignmentsystems.fix44.CollateralInquiryAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case com.alignmentsystems.fix44.field.NoCollInquiryQualifier.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case com.alignmentsystems.fix44.field.NoExecs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoExecs();
	
				case com.alignmentsystems.fix44.field.NoTrades.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoTrades();
	
				case com.alignmentsystems.fix44.field.NoLegs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoLegs();
	
				case com.alignmentsystems.fix44.field.NoLegSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoLegs.NoLegSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoUnderlyings.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoUnderlyings();
	
				case com.alignmentsystems.fix44.field.NoUnderlyingSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoPartyIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoPartyIDs();
	
				case com.alignmentsystems.fix44.field.NoPartySubIDs.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case com.alignmentsystems.fix44.field.NoSecurityAltID.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoSecurityAltID();
	
				case com.alignmentsystems.fix44.field.NoEvents.FIELD:
					return new com.alignmentsystems.fix44.CollateralInquiryAck.NoEvents();
	
				}
				break;
	
		}

		return null;
	}
}
