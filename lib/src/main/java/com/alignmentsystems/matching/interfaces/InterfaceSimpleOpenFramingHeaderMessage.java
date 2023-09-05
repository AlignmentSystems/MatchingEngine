package com.alignmentsystems.matching.interfaces;
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
import com.alignmentsystems.matching.exceptions.RepresentationSBENotAvailable;

public interface InterfaceSimpleOpenFramingHeaderMessage {
	public byte[] getSOFHWrappedSBEMessage() throws RepresentationSBENotAvailable;
}
