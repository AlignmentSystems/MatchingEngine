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

import quickfix.FieldNotFound;
  
import com.alignmentsystems.fix44.field.*;

import quickfix.Group;

public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(com.alignmentsystems.fix44.field.BeginString value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BeginString get(com.alignmentsystems.fix44.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BeginString getBeginString() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BeginString());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(com.alignmentsystems.fix44.field.BodyLength value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.BodyLength get(com.alignmentsystems.fix44.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.BodyLength());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(com.alignmentsystems.fix44.field.MsgType value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MsgType get(com.alignmentsystems.fix44.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MsgType getMsgType() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MsgType());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(com.alignmentsystems.fix44.field.SenderCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SenderCompID get(com.alignmentsystems.fix44.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SenderCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(com.alignmentsystems.fix44.field.TargetCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TargetCompID get(com.alignmentsystems.fix44.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TargetCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(com.alignmentsystems.fix44.field.OnBehalfOfCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfCompID get(com.alignmentsystems.fix44.field.OnBehalfOfCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfCompID getOnBehalfOfCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OnBehalfOfCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OnBehalfOfCompID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfCompID() {
		return isSetField(115);
	}

	public void set(com.alignmentsystems.fix44.field.DeliverToCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeliverToCompID get(com.alignmentsystems.fix44.field.DeliverToCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeliverToCompID getDeliverToCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeliverToCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeliverToCompID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToCompID() {
		return isSetField(128);
	}

	public void set(com.alignmentsystems.fix44.field.SecureDataLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecureDataLen get(com.alignmentsystems.fix44.field.SecureDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecureDataLen getSecureDataLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecureDataLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecureDataLen field) {
		return isSetField(field);
	}

	public boolean isSetSecureDataLen() {
		return isSetField(90);
	}

	public void set(com.alignmentsystems.fix44.field.SecureData value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SecureData get(com.alignmentsystems.fix44.field.SecureData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SecureData getSecureData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SecureData());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SecureData field) {
		return isSetField(field);
	}

	public boolean isSetSecureData() {
		return isSetField(91);
	}

	public void set(com.alignmentsystems.fix44.field.MsgSeqNum value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MsgSeqNum get(com.alignmentsystems.fix44.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MsgSeqNum());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(com.alignmentsystems.fix44.field.SenderSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SenderSubID get(com.alignmentsystems.fix44.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SenderSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(com.alignmentsystems.fix44.field.SenderLocationID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SenderLocationID get(com.alignmentsystems.fix44.field.SenderLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SenderLocationID getSenderLocationID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SenderLocationID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SenderLocationID field) {
		return isSetField(field);
	}

	public boolean isSetSenderLocationID() {
		return isSetField(142);
	}

	public void set(com.alignmentsystems.fix44.field.TargetSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TargetSubID get(com.alignmentsystems.fix44.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TargetSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(com.alignmentsystems.fix44.field.TargetLocationID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.TargetLocationID get(com.alignmentsystems.fix44.field.TargetLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.TargetLocationID getTargetLocationID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.TargetLocationID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.TargetLocationID field) {
		return isSetField(field);
	}

	public boolean isSetTargetLocationID() {
		return isSetField(143);
	}

	public void set(com.alignmentsystems.fix44.field.OnBehalfOfSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfSubID get(com.alignmentsystems.fix44.field.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OnBehalfOfSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(com.alignmentsystems.fix44.field.OnBehalfOfLocationID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfLocationID get(com.alignmentsystems.fix44.field.OnBehalfOfLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OnBehalfOfLocationID getOnBehalfOfLocationID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OnBehalfOfLocationID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OnBehalfOfLocationID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfLocationID() {
		return isSetField(144);
	}

	public void set(com.alignmentsystems.fix44.field.DeliverToSubID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeliverToSubID get(com.alignmentsystems.fix44.field.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeliverToSubID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(com.alignmentsystems.fix44.field.DeliverToLocationID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.DeliverToLocationID get(com.alignmentsystems.fix44.field.DeliverToLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.DeliverToLocationID getDeliverToLocationID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.DeliverToLocationID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.DeliverToLocationID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToLocationID() {
		return isSetField(145);
	}

	public void set(com.alignmentsystems.fix44.field.PossDupFlag value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PossDupFlag get(com.alignmentsystems.fix44.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PossDupFlag());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(com.alignmentsystems.fix44.field.PossResend value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.PossResend get(com.alignmentsystems.fix44.field.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.PossResend getPossResend() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.PossResend());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(com.alignmentsystems.fix44.field.SendingTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SendingTime get(com.alignmentsystems.fix44.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SendingTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(com.alignmentsystems.fix44.field.OrigSendingTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.OrigSendingTime get(com.alignmentsystems.fix44.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.OrigSendingTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	public void set(com.alignmentsystems.fix44.field.XmlDataLen value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.XmlDataLen get(com.alignmentsystems.fix44.field.XmlDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.XmlDataLen getXmlDataLen() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.XmlDataLen());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.XmlDataLen field) {
		return isSetField(field);
	}

	public boolean isSetXmlDataLen() {
		return isSetField(212);
	}

	public void set(com.alignmentsystems.fix44.field.XmlData value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.XmlData get(com.alignmentsystems.fix44.field.XmlData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.XmlData getXmlData() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.XmlData());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.XmlData field) {
		return isSetField(field);
	}

	public boolean isSetXmlData() {
		return isSetField(213);
	}

	public void set(com.alignmentsystems.fix44.field.MessageEncoding value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.MessageEncoding get(com.alignmentsystems.fix44.field.MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.MessageEncoding getMessageEncoding() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.MessageEncoding());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(347);
	}

	public void set(com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed get(com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed getLastMsgSeqNumProcessed() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.LastMsgSeqNumProcessed field) {
		return isSetField(field);
	}

	public boolean isSetLastMsgSeqNumProcessed() {
		return isSetField(369);
	}

	public void set(com.alignmentsystems.fix44.field.NoHops value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.NoHops get(com.alignmentsystems.fix44.field.NoHops value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.NoHops getNoHops() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.NoHops());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.NoHops field) {
		return isSetField(field);
	}

	public boolean isSetNoHops() {
		return isSetField(627);
	}

	public static class NoHops extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {628, 629, 630, 0};

		public NoHops() {
			super(627, 628, ORDER);
		}
		
	public void set(com.alignmentsystems.fix44.field.HopCompID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.HopCompID get(com.alignmentsystems.fix44.field.HopCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.HopCompID getHopCompID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.HopCompID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.HopCompID field) {
		return isSetField(field);
	}

	public boolean isSetHopCompID() {
		return isSetField(628);
	}

	public void set(com.alignmentsystems.fix44.field.HopSendingTime value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.HopSendingTime get(com.alignmentsystems.fix44.field.HopSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.HopSendingTime getHopSendingTime() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.HopSendingTime());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.HopSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetHopSendingTime() {
		return isSetField(629);
	}

	public void set(com.alignmentsystems.fix44.field.HopRefID value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.HopRefID get(com.alignmentsystems.fix44.field.HopRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.HopRefID getHopRefID() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.HopRefID());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.HopRefID field) {
		return isSetField(field);
	}

	public boolean isSetHopRefID() {
		return isSetField(630);
	}

	}

	}
	
	
	public void set(com.alignmentsystems.fix44.field.SignatureLength value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.SignatureLength get(com.alignmentsystems.fix44.field.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.SignatureLength());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(com.alignmentsystems.fix44.field.Signature value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.Signature get(com.alignmentsystems.fix44.field.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.Signature getSignature() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.Signature());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(com.alignmentsystems.fix44.field.CheckSum value) {
		setField(value);
	}

	public com.alignmentsystems.fix44.field.CheckSum get(com.alignmentsystems.fix44.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public com.alignmentsystems.fix44.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new com.alignmentsystems.fix44.field.CheckSum());
	}

	public boolean isSet(com.alignmentsystems.fix44.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
