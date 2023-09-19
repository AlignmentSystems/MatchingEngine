package com.alignmentsystems.library.sbe;
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

import com.alignmentsystems.library.annotations.NotYetImplemented;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceSimpleBinaryEncodingMessage;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class SimpleBinaryEncodingMessage implements InterfaceSimpleBinaryEncodingMessage {
	private Long marketDataPrice = null;
	private Long marketDataQuantity = null;
	private OffsetDateTime timestamp = null;
	private UUID marketDataId = null;
	private Encodings encoding = null;
	private Long sequenceNumber = null;



	public SimpleBinaryEncodingMessage(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@Override
	public byte[] getByteArray(Encodings encoding) {
		byte[] returnValue = null;

		this.encoding = encoding;

		final int bufferLength =
				Long.BYTES //sequenceNumber
				+
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
		buf.putLong(this.sequenceNumber);
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

		this.sequenceNumber = buf.getLong();
		
		Long leastSignificantBits = buf.getLong();
		Long mostSignificantBits = buf.getLong();

		this.marketDataId = new UUID(mostSignificantBits, leastSignificantBits);		
		this.marketDataPrice = buf.getLong();
		this.marketDataQuantity = buf.getLong();
		Instant instant = Instant.ofEpochMilli(buf.getLong());
		this.timestamp = OffsetDateTime.ofInstant(instant, Constants.HERE);

	}

	@Override
	public void setMessage(InterfaceMatch match) {
		this.marketDataPrice = match.getMatchPrice();
		this.marketDataQuantity = match.getMatchQuantity();
		this.timestamp = match.getTimestamp();
		this.marketDataId = match.getMatchId();		
	}

	@Override
	@NotYetImplemented
	public InterfaceMatch getMessage() {
		//InterfaceMatch match = new AlignmentMatch(marketDataPrice, marketDataPrice, null, timestamp, marketDataId, marketDataId, marketDataId, marketDataId, marketDataPrice, marketDataPrice, marketDataPrice, marketDataPrice, marketDataPrice, marketDataPrice, null, null, null, null, null);
		InterfaceMatch match =null;
		return match;
	}

	@Override
	public Long getSequenceNumber() {		
		return this.sequenceNumber;
	}

	@Override
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@Override
	public Encodings getEncoding() {
		return this.encoding;
	}
}