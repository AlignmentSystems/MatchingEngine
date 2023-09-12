package com.alignmentsystems.library.interfaces;
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

import com.alignmentsystems.library.enumerations.Encodings;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceSimpleBinaryEncodingMessage {
	public byte[] getByteArray(Encodings encoding);
	public void setByteArray(byte[] match, Encodings encoding);
	public void setMessage(InterfaceMatch match);
	public InterfaceMatch getMessage();
	public Long getSequenceNumber();
	public void setSequenceNumber(Long sequenceNumber);
	public Encodings getEncoding();
}
