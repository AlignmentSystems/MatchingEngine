package com.alignmentsystems.matching;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	BinaryToCanonicalRepresentationProcessor
 *	Description		:
 *****************************************************************************/
import com.alignmentsystems.library.AlignmentOrder;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.OrderBookSide;

public class BinaryToCanonicalRepresentationProcessor {
	final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
	
	public BinaryToCanonicalRepresentationProcessor() {
	} 


	public static AlignmentOrder getAlignmentOrder(byte[] message) {
		AlignmentOrder ao = new AlignmentOrder();
		//			ByteBuffer buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());
		//			buf.putLong(inSeq.getClOrdID().getLeastSignificantBits());
		//			buf.putLong(inSeq.getClOrdID().getMostSignificantBits());
		//			buf.putLong(inSeq.getOrderId().getLeastSignificantBits());
		//			buf.putLong(inSeq.getOrderId().getMostSignificantBits());
		//			buf.putLong(exchangeIdMappedFromSenderCompID);
		//			buf.putLong(exchangeIdMappedFromTargetCompID);
		//			buf.putLong(inSeq.getOrderQty());
		//			buf.putLong(inSeq.getLimitPrice());
		//			buf.putLong(exchangeInstrumentIdMappedFromSymbol);
		//			buf.putLong(Double.doubleToLongBits(inSeq.getTimestamp().toInstant().toEpochMilli()));
		//			buf.putLong(exchangeSideCodeMappedFromSideCode);
		//			buf.flip();



		ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());

		final Long clOrdIdLeast = bb.getLong();
		final Long clOrdIdMost = bb.getLong();
		final Long orderIdLeast = bb.getLong();
		final Long orderIdMost = bb.getLong();
		final Long senderId  = bb.getLong();
		final Long targetId = bb.getLong();
		final Long orderQty = bb.getLong();
		final Long limitPrice = bb.getLong();
		final Long instrumentId = bb.getLong();
		final Long timeStamp = bb.getLong();
		final Long sideCode = bb.getLong();

		final UUID clOrdId = new UUID(clOrdIdMost, clOrdIdLeast);
		final UUID orderId = new UUID(orderIdMost, orderIdLeast);

		String senderCompId = DataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderId);
		String targetCompId = DataMapper.getMemberFIXTargetCompIdMappedFromExchangeId(targetId);
		String instrument = DataMapper.getMemberInstrumentIdMappedFromExchangeInstrumentId(instrumentId);
		String sideCodeFIX = DataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
		//this.ts = OffsetDateTime.now(zo);
		//	buf.putLong(Double.doubleToLongBits(inSeq.getTimestamp().toInstant().toEpochMilli()));
		Instant instant = Instant.ofEpochMilli(timeStamp);

		OffsetDateTime ts =  OffsetDateTime.ofInstant(instant, Constants.HERE);

		OrderBookSide obs = OrderBookSide.valueOf(sideCodeFIX);

		ao.reCreateOrder(instrument , obs , orderQty , limitPrice , ts , senderCompId , targetCompId , orderId , clOrdId);

		return ao;			
	}
}