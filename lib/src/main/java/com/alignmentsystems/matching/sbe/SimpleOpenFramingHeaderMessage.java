package com.alignmentsystems.matching.sbe;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	SimpleOpenFramingHeaderWrapper
 *	Description		:
 *****************************************************************************/

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.alignmentsystems.matching.enumerations.Encodings;
import com.alignmentsystems.matching.enumerations.VersionSOFH;
import com.alignmentsystems.matching.interfaces.InterfaceSimpleOpenFramingHeaderMessage;

public class SimpleOpenFramingHeaderMessage implements InterfaceSimpleOpenFramingHeaderMessage {
	private SimpleBinaryEncodingMessage sbe = null;
	
	public SimpleOpenFramingHeaderMessage(SimpleBinaryEncodingMessage sbe) {
		this.sbe = sbe;
	}

	@Override
	public byte[] getSOFHWrappedSBEMessage() {
	return this.addSOFHeader(sbe.getEncoding(), VersionSOFH.ONE, this.sbe);
	}

	private byte[] addSOFHeader(
			Encodings encoding 
			, VersionSOFH versionSOFH 
			, SimpleBinaryEncodingMessage messageSBE 
			) {

		final String methodName = "addSOFHeader";

		final int messageEncodingLength = 2;
		final int messagePayloadLength = 4;
		int messageActualLength = 0;
		short EncodingNumber = 0;
		String EncodingHexString = null;
		ByteBuffer bbh = null;


		final ByteOrder nbo = ByteOrder.BIG_ENDIAN;

		//While the Simple Open Framing Header specification is normative, the following is an interpretation of that 
		//standard as an SBE encoding. Note that the framing standard specifies that the framing header will always 
		//be encoded in big-endian byte order, also known as network byte order. 
		try {

			final byte[] messageEncodedAsSBE = messageSBE.getByteArray(messageSBE.getEncoding());
			//The Message_Length shall be defined to be the length in octets (i.e. bytes) of a message inclusive of the length of the Simple Open Framing Header.
			messageActualLength = 
					messageEncodedAsSBE.length
					+ messageEncodingLength 
					+ messagePayloadLength;

			bbh = ByteBuffer.allocate(messageActualLength);

			bbh.order(nbo);

			switch(versionSOFH) {
			case ONE:

				EncodingNumber = encoding.getEncodingValue();
				EncodingHexString = encoding.getEncodingAsString();

				bbh.putInt(messageActualLength);
				bbh.putShort(EncodingNumber); //FIXSBELittleEndian(0xEB50),
				bbh.put(messageEncodedAsSBE);
				bbh.flip();

				break;
			case TWO:
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw e;		
		}	
		return bbh.array();
	}
}