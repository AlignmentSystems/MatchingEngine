package com.alignmentsystems.matching;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.DateTimeException;
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


		try {
			//			ByteBuffer buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());
			//			buf.putShort(messageType);
			//			buf.putLong(inSeq.getClOrdID().getLeastSignificantBits());
			//			buf.putLong(inSeq.getClOrdID().getMostSignificantBits());
			//			buf.putLong(inSeq.getOrderId().getLeastSignificantBits());
			//			buf.putLong(inSeq.getOrderId().getMostSignificantBits());
			//			buf.putLong(exchangeIdMappedFromSenderCompID);
			//			buf.putLong(exchangeIdMappedFromTargetCompID);
			//			buf.putLong(inSeq.getOrderQty());
			//			buf.putLong(inSeq.getLimitPrice());
			//			buf.putLong(exchangeInstrumentIdMappedFromSymbol);
			//			buf.putLong(inSeq.getTimestamp().toInstant().getEpochSecond());
			//			buf.putInt(inSeq.getTimestamp().toInstant().getNano());		
			//			buf.putLong(exchangeSideCodeMappedFromSideCode);
			//			buf.putShort(exchangeTimeInForceMappedFromTimeInForce);
		
			//			buf.flip();


			ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());
			final short msgType = bb.getShort();	//		buf.putShort(messageType);
			final Long clOrdIdLeast = bb.getLong();//			buf.putLong(inSeq.getClOrdID().getLeastSignificantBits());
			final Long clOrdIdMost = bb.getLong();//			buf.putLong(inSeq.getClOrdID().getMostSignificantBits());
			final Long orderIdLeast = bb.getLong();//			buf.putLong(inSeq.getOrderId().getLeastSignificantBits());
			final Long orderIdMost = bb.getLong();//			buf.putLong(inSeq.getOrderId().getMostSignificantBits());
			final Long senderId  = bb.getLong();//			buf.putLong(exchangeIdMappedFromSenderCompID);
			final Long targetId = bb.getLong();//			buf.putLong(exchangeIdMappedFromTargetCompID);
			final Long orderQty = bb.getLong();//			buf.putLong(inSeq.getOrderQty());
			final Long limitPrice = bb.getLong();//			buf.putLong(inSeq.getLimitPrice());
			final Long instrumentId = bb.getLong();//			buf.putLong(exchangeInstrumentIdMappedFromSymbol);
			final Long timeStampEpochSeconds = bb.getLong();//			buf.putLong(inSeq.getTimestamp().toInstant().getEpochSecond());
			final int timeStampNanoseconds = bb.getInt();//			buf.putInt(inSeq.getTimestamp().toInstant().getNano());
			final Long sideCode = bb.getLong();//			buf.putLong(exchangeSideCodeMappedFromSideCode);
			final short msgTimeInForce = bb.getShort();//	buf.putShort(exchangeTimeInForceMappedFromTimeInForce);
			final UUID clOrdId = new UUID(clOrdIdMost, clOrdIdLeast);
			final UUID orderId = new UUID(orderIdMost, orderIdLeast);

			final String senderCompId = DataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderId);
			final String targetCompId = DataMapper.getMemberFIXTargetCompIdMappedFromExchangeId(targetId);
			final String instrument = DataMapper.getMemberInstrumentIdMappedFromExchangeInstrumentId(instrumentId);
			final String sideCodeFIX = DataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
			final Instant instant = Instant.ofEpochSecond(timeStampEpochSeconds).plusNanos(timeStampNanoseconds);
			final OffsetDateTime ts =  OffsetDateTime.ofInstant(instant, Constants.HERE);
			final OrderBookSide obs = OrderBookSide.getEnumForString(sideCodeFIX);
			final char tif = DataMapper.getExchangeTimeInForceMappedToMemberTimeInForce(msgTimeInForce);
			
			AlignmentOrder ao = new AlignmentOrder();			
			ao.reCreateOrder(instrument , tif, obs , orderQty , limitPrice , ts , senderCompId , targetCompId , orderId , clOrdId);
			return ao;	
		} catch(BufferUnderflowException | DateTimeException e) {
			throw e;
		}
	}
}