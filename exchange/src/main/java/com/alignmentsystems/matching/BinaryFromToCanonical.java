package com.alignmentsystems.matching;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.field.AvgPx;
import com.alignmentsystems.fix44.field.CumQty;
import com.alignmentsystems.fix44.field.ExecID;
import com.alignmentsystems.fix44.field.ExecType;
import com.alignmentsystems.fix44.field.LastPx;
import com.alignmentsystems.fix44.field.LastQty;
import com.alignmentsystems.fix44.field.LeavesQty;
import com.alignmentsystems.fix44.field.OrdStatus;
import com.alignmentsystems.fix44.field.OrderID;
import com.alignmentsystems.fix44.field.SenderCompID;
import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.fix44.field.TargetCompID;
import com.alignmentsystems.fix44.field.TimeInForce;
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
import com.alignmentsystems.library.DataMapper;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

public class BinaryFromToCanonical {
	final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;

	public BinaryFromToCanonical() {
	} 



	protected byte[] getBufferFromExecutionReport(InterfaceExecutionReport er) {
		byte[] returnValue = null;
		ByteBuffer buf = null;
		final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;

		final Short msgType = DataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT;

		try {
			final int bufferLength =
					Short.BYTES //messageType
					+
					Long.BYTES * 2//ExecID
					+
					Long.BYTES * 2//ClOrdID
					+
					Long.BYTES * 2//OrderID
					+
					Short.BYTES //ExecType
					+
					Short.BYTES//Side
					+
					Long.BYTES //LeavesQty
					+
					Long.BYTES //CumQty
					+
					Long.BYTES //AvgPx
					+
					Long.BYTES //ExecPrice
					+
					Long.BYTES //ExecQty
					+
					Long.BYTES //this.ts  getEpochSecond
					+
					Integer.BYTES // this.ts getNano()

					;
			buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());

			buf.putShort(msgType);
			buf.putLong(er.getExecID().getLeastSignificantBits());
			buf.putLong(er.getExecID().getMostSignificantBits());
			buf.putLong(er.getClOrdID().getLeastSignificantBits());
			buf.putLong(er.getClOrdID().getMostSignificantBits());
			buf.putLong(er.getOrderID().getLeastSignificantBits());
			buf.putLong(er.getOrderID().getMostSignificantBits());
			buf.putShort(er.getExecType());
			buf.putShort(er.getOrdStatus());
			buf.putShort(er.getSideCode());
			buf.putLong(er.getLeavesQuantity());
			buf.putLong(er.getCumQuantity());
			buf.putLong(er.getAveragePrice());
			buf.putLong(er.getExecutionPrice());
			buf.putLong(er.getExecutionQuantity());
			buf.putLong(er.getTimestamp().toInstant().getEpochSecond());
			buf.putInt(er.getTimestamp().toInstant().getNano());		


			buf.flip();
		} catch (Exception e) {
			//this.log.error(e.getMessage() , e);
			throw e;
		}

		return returnValue;
	}


	protected Sender getBufferFromAlignmentOrder(InterfaceOrder inSeq) {

		ByteBuffer buf = null;
		String receivedSymbol = null;
		String orderId = null;

		try {
			receivedSymbol = inSeq.getSymbol();
			orderId = inSeq.getOrderId().toString();

			final short messageType = inSeq.getAlignmentType();
			final String receivedSender = inSeq.getSender();
			final String receivedTarget = inSeq.getTarget();
			final char receivedSide = inSeq.getOrderBookSide().sideCharValue;
			final char receivedTimeInForce = inSeq.getTimeInForce();
			//get mappings...
			final Long exchangeIdMappedFromSenderCompID = DataMapper.getExchangeIdMappedFromSenderCompID(receivedSender);
			final Long exchangeIdMappedFromTargetCompID = DataMapper.getExchangeIdMappedFromTargetCompID(receivedTarget);
			final Long exchangeInstrumentIdMappedFromSymbol = DataMapper.getExchangeIdMappedFromInstrumentId(receivedSymbol);
			final Short exchangeSideCodeMappedFromSideCode = DataMapper.getExchangeSideCodeMappedFromMemberSideCode(receivedSide);
			final Short exchangeTimeInForceMappedFromTimeInForce = DataMapper.getMemberTimeInForceMappedToExchangeTimeInForce(receivedTimeInForce);

			final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;


			final int bufferLength =
					Short.BYTES //messageType
					+
					Long.BYTES * 2 //ClOrdId 
					+
					Long.BYTES * 2 //OrderId
					+
					Long.BYTES //exchangeIdMappedFromSenderCompID.BYTES
					+
					Long.BYTES //exchangeIdMappedFromTargetCompID.BYTES
					+
					Long.BYTES //this.orderQty
					+
					Long.BYTES //this.limitPrice
					+
					Long.BYTES //exchangeInstrumentIdMappedFromSymbol.BYTES
					+
					Long.BYTES //this.ts  getEpochSecond
					+
					Integer.BYTES // this.ts getNano()
					+
					Short.BYTES //this.SideCode
					+
					Short.BYTES //inSeq.getTimeInForce()
					;

			buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());
			buf.putShort(messageType);
			buf.putLong(inSeq.getClOrdID().getLeastSignificantBits());
			buf.putLong(inSeq.getClOrdID().getMostSignificantBits());
			buf.putLong(inSeq.getOrderId().getLeastSignificantBits());
			buf.putLong(inSeq.getOrderId().getMostSignificantBits());
			buf.putLong(exchangeIdMappedFromSenderCompID);
			buf.putLong(exchangeIdMappedFromTargetCompID);
			buf.putLong(inSeq.getOrderQty());
			buf.putLong(inSeq.getLimitPrice());
			buf.putLong(exchangeInstrumentIdMappedFromSymbol);
			buf.putLong(inSeq.getTimestamp().toInstant().getEpochSecond());
			buf.putInt(inSeq.getTimestamp().toInstant().getNano());		
			buf.putLong(exchangeSideCodeMappedFromSideCode);
			buf.putShort(exchangeTimeInForceMappedFromTimeInForce);

			buf.flip();
		} catch (Exception e) {
			//this.log.error(e.getMessage() , e);
			throw e;
		}


		Sender sender = new Sender(buf.array(), receivedSymbol, orderId);

		return sender;
	}






	public final static AlignmentOrder getAlignmentOrderFromBuffer(byte[] message, short msgType) {
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

		try {		

			ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());
			//final short msgType = bb.getShort();	//		buf.putShort(messageType);
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
			final Short sideCode = bb.getShort();//			buf.putLong(exchangeSideCodeMappedFromSideCode);
			final short msgTimeInForce = bb.getShort();//	buf.putShort(exchangeTimeInForceMappedFromTimeInForce);
			final UUID clOrdId = new UUID(clOrdIdMost, clOrdIdLeast);
			final UUID orderId = new UUID(orderIdMost, orderIdLeast);

			final String senderCompId = DataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderId);
			final String targetCompId = DataMapper.getMemberFIXTargetCompIdMappedFromExchangeId(targetId);
			final String instrument = DataMapper.getMemberInstrumentIdMappedFromExchangeInstrumentId(instrumentId);
			final char sideCodeFIX = DataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
			final Instant instant = Instant.ofEpochSecond(timeStampEpochSeconds).plusNanos(timeStampNanoseconds);
			final OffsetDateTime ts =  OffsetDateTime.ofInstant(instant, Constants.HERE);
			final OrderBookSide obs = OrderBookSide.getEnumForID(sideCodeFIX);
			final char tif = DataMapper.getExchangeTimeInForceMappedToMemberTimeInForce(msgTimeInForce);

			AlignmentOrder ao = new AlignmentOrder();			
			ao.reCreateOrder(instrument , tif, obs , orderQty , limitPrice , ts , senderCompId , targetCompId , orderId , clOrdId);
			return ao;	
		} catch(BufferUnderflowException | DateTimeException e) {
			throw e;
		}
	}



	public final static AlignmentOrder getAlignmentOrderFromBuffer(byte[] message) {
		ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());
		final short msgType = bb.getShort();	//		buf.putShort(messageType
		return  getAlignmentOrderFromBuffer(bb.array(), msgType);
	}



	public static ExecutionReport getExecutionReportFromBuffer(ByteBuffer bb , short msgType) {

		ExecutionReport er = null;
		try {			
			final Long execIdLeast = bb.getLong(); //buf.putLong(er.getExecID().getLeastSignificantBits());
			final Long execIdMost = bb.getLong(); //buf.putLong(er.getExecID().getMostSignificantBits());
			final Long clOrdIdLeast = bb.getLong(); //buf.putLong(er.getClOrdID().getLeastSignificantBits());
			final Long clOrdIdMost = bb.getLong(); //buf.putLong(er.getClOrdID().getMostSignificantBits());
			final Long orderIdLeast = bb.getLong(); //buf.putLong(er.getOrderID().getLeastSignificantBits());
			final Long orderIdMost = bb.getLong(); //buf.putLong(er.getOrderID().getMostSignificantBits());
			final Short execType = bb.getShort(); //.putShort(er.getExecType());
			final Short ordStatus = bb.getShort(); //buf.putShort(er.getOrdStatus());
			final Short sideCode  = bb.getShort(); //buf.putShort(er.getSideCode());
			final Long leavesQty = bb.getLong(); //buf.putLong(er.getLeavesQuantity());
			final Long cumQty = bb.getLong(); //buf.putLong(er.getCumQuantity());
			final Long avgPx = bb.getLong(); //buf.putLong(er.getAveragePrice());
			final Long execPrice = bb.getLong(); //buf.putLong(er.getExecutionPrice());
			final Long execQty = bb.getLong(); //buf.putLong(er.getExecutionQuantity());
			final Long timeStampEpochSeconds = bb.getLong();//			buf.putLong(er.getTimestamp().toInstant().getEpochSecond());
			final int timeStampNanoseconds = bb.getInt();//			buf.putInt(er.getTimestamp().toInstant().getNano());

			final Instant instant = Instant.ofEpochSecond(timeStampEpochSeconds).plusNanos(timeStampNanoseconds);
			final OffsetDateTime ts =  OffsetDateTime.ofInstant(instant, Constants.HERE);

			final UUID execId = new UUID(execIdMost, execIdLeast);

			final UUID clOrdId = new UUID(clOrdIdMost, clOrdIdLeast);
			final UUID orderId = new UUID(orderIdMost, orderIdLeast);
			final char execTypeFIX = DataMapper.getMemberExecTypeMappedFromExchangeExecType(execType);
			final char orderStatusFIX = DataMapper.getMemberOrdStatusMappedToExchangeOrdStatus(ordStatus);
			final char sideFIX = DataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
			er = new ExecutionReport(
					new OrderID(orderId.toString())
					, new ExecID(execId.toString())
					, new ExecType(execTypeFIX)
					, new OrdStatus(orderStatusFIX)
					, new Side(sideFIX)
					, new LeavesQty(leavesQty)
					, new CumQty(cumQty)
					, new AvgPx(avgPx)
					);
			er.setField(new OrderID(clOrdId.toString()));
			er.setField(new LastPx(execPrice));
			er.setField(new LastQty(execQty));

		} catch(BufferUnderflowException | DateTimeException e) {
			throw e;
		}
		return er;

	}

	protected static ExecutionReport getExecutionReportAckFromBuffer(ByteBuffer bb, short msgType) {

		AlignmentOrder ao = getAlignmentOrderFromBuffer(bb.array(), msgType);
		final Double leaves = 0d;
		final Double cum = 0d;
		final Double avg = 0d;
		final OrderID orderId = new OrderID(ao.getOrderId().toString());
		final ExecID execID = new ExecID(UUID.randomUUID().toString());
		final ExecType execType = new ExecType(ExecType.NEW);
		final OrdStatus ordStatus = new OrdStatus(OrdStatus.NEW);
		final Side side = new Side(ao.getOrderBookSide().sideCharValue);
		final TimeInForce tif = new TimeInForce(ao.getTimeInForce());
		final LeavesQty leavesQty = new LeavesQty(leaves);
		final CumQty cumQty = new CumQty(cum);
		final AvgPx avgPx = new AvgPx(avg);
		final String sender = ao.getSender();
		final String target = ao.getTarget();
		final SenderCompID senderCompID = new SenderCompID(sender); 
		final TargetCompID targetCompID = new TargetCompID(target);

		ExecutionReport er = new ExecutionReport(orderId, execID, execType, ordStatus, side, leavesQty, cumQty, avgPx);
		er.set(tif);
		er.getHeader().setField(senderCompID);
		er.getHeader().setField(targetCompID);

		return er;
	}



}