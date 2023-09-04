package com.alignmentsystems.matching.sbe;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	SimpleBinaryEncodingMessage
 *	Description		:
 *****************************************************************************/

import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.matching.Match;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.Encodings;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceSimpleBinaryEncodingMessage;

public class SimpleBinaryEncodingMessage implements InterfaceSimpleBinaryEncodingMessage {
	private Double marketDataPrice = null;
	private Double marketDataQuantity = null;
	private OffsetDateTime timestamp = null;
	private UUID marketDataId = null;
	private Encodings encoding = null;
	private  final static int LENGTH_STRING_UUID = 36;


	public SimpleBinaryEncodingMessage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] getByteArray(Encodings encoding) {
		byte[] returnValue = null;

		this.encoding = encoding;

		final int bufferLength =
				Long.BYTES//least
				+
				Long.BYTES//most
				+
				Double.BYTES//price
				+
				Double.BYTES//quantity
				+
				Long.BYTES//timestamp
				;


		ByteBuffer buf = ByteBuffer.allocate(bufferLength).order(this.encoding.getByteOrder());

		buf.putLong(this.marketDataId.getLeastSignificantBits());
		buf.putLong(this.marketDataId.getMostSignificantBits());
		buf.putLong(Double.doubleToLongBits(this.marketDataPrice));
		buf.putLong(Double.doubleToLongBits(this.marketDataQuantity));
		buf.putLong(Double.doubleToLongBits(this.timestamp.toInstant().toEpochMilli()));

		returnValue = buf.array();
		
		return returnValue;
	}

	@Override
	public void setByteArray(byte[] match , Encodings encoding) {
		this.encoding = encoding;
		ByteBuffer buf = ByteBuffer.wrap(match).order(encoding.getByteOrder());
		
		byte[] parkUUIDAsByteArray = new byte[LENGTH_STRING_UUID];
		
		Long leastSignificantBits = buf.getLong();
		Long mostSignificantBits = buf.getLong();
		
		this.marketDataId = new UUID(mostSignificantBits, leastSignificantBits);		
		this.marketDataPrice = buf.getDouble();
		this.marketDataQuantity = buf.getDouble();
		Instant instant = Instant.ofEpochMilli(buf.getLong());
		this.timestamp = OffsetDateTime.ofInstant(instant, Constants.HERE);
						
	}

	@Override
	public void setMessage(InterfaceMatchTrade match) {
		this.marketDataPrice = match.getMatchPrice();
		this.marketDataQuantity = match.getMatchQuantity();
		this.timestamp = match.getTimestamp();
		this.marketDataId = match.getMatchId();		
	}

	@Override
	public InterfaceMatchTrade getMessage() {
		InterfaceMatchTrade match = new Match();
		return match;
	}
}