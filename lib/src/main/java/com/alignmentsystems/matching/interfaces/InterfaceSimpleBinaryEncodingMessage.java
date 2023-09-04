package com.alignmentsystems.matching.interfaces;

import com.alignmentsystems.matching.enumerations.Encodings;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceSimpleBinaryEncodingMessage
 *	Description		:
 *****************************************************************************/

public interface InterfaceSimpleBinaryEncodingMessage {
	public byte[] getByteArray(Encodings encoding);
	public void setByteArray(byte[] match, Encodings encoding);
	public void setMessage(InterfaceMatchTrade match);
	public InterfaceMatchTrade getMessage();
	public Long getSequenceNumber();
	public void setSequenceNumber(Long sequenceNumber);
}
