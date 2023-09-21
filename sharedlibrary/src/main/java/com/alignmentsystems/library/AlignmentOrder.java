package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentOrder
 *	Description		:
 *****************************************************************************/

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.library.annotations.Experimental;
import com.alignmentsystems.library.annotations.NotYetImplemented;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceKillString;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

import quickfix.FieldNotFound;
import quickfix.SessionID;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentOrder implements InterfaceOrder , InterfaceKillString{
	final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;

	private String symbol = null;
	private OrderBookSide orderBookSide = null;
	private Long orderQty = null;
	private Long limitPrice = null;
	private SessionID sessionId = null;
	private NewOrderSingle nos = null;
	private OffsetDateTime ts;
	private String sender = null;
	private String target = null;
	private char timeInForce;
	private final static ZoneOffset zo = Constants.HERE;
	private List<ExecutionReport> executions =  new ArrayList<ExecutionReport>();
	private UUID orderId = null;
	private UUID clOrdId = null;
	private short alignmentType = 0;
	private Long cumQty = null;
	private Long avgPx = null;
	private Long leavesQty = null;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder()
				.append("AlignmentOrder [limitPrice=")
				.append(Long.toString(this.limitPrice))
				.append(", ts=")
				.append(this.ts)
				.append(", target=")
				.append(this.target)
				.append(", sender=")
				.append(this.sender)
				.append(", OrderID=")
				.append(this.orderId)

				.append(", ClOrdID=")
				.append(this.clOrdId)

				.append(", symbol=")
				.append(this.symbol)
				.append(", side=")
				.append(this.orderBookSide.sideReadableValue)
				.append(", orderQty=")
				.append(Long.toString(this.orderQty))
				.append(", sessionId=")
				.append(this.sessionId)
				.append("]")
				;
		return builder.toString();
	}



	@Override
	public NewOrderSingle getNewOrderSingle() {
		return this.nos;
	}

	@Override
	public void setNewOrderSingle(
			NewOrderSingle nos
			, SessionID sessionId
			, UUID orderId
			, OrderBookSide orderBookSide
			) throws FieldNotFound {
		this.ts = OffsetDateTime.now(zo);
		this.nos = nos;
		this.sessionId = sessionId;
		this.orderId = orderId;
		this.orderBookSide = orderBookSide;

		try {
			String receivedTarget = sessionId.getSenderCompID(); 	
			String receivedSender = sessionId.getTargetCompID();		
			this.sender = receivedSender;
			this.target = receivedTarget;
			this.clOrdId = UUID.fromString(nos.getClOrdID().getValue().toString());
			this.orderQty = (long) nos.getOrderQty().getValue();
			this.limitPrice = (long) nos.getPrice().getValue();			
			this.symbol = nos.getSymbol().getValue();
			this.timeInForce = nos.getTimeInForce().getValue();			
		} catch (FieldNotFound e) {
			throw e;
		}
	}

	@Override
	public OrderBookSide getOrderBookSide() {		
		return this.orderBookSide;
	}

	@Override
	public Long getOrderQty() {
		return this.orderQty;
	}

	@Override
	public Long getLimitPrice() {
		return this.limitPrice;
	}

	@Override
	public SessionID getSessionId() {
		return this.sessionId;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.ts;
	}




	@Override
	public UUID getClOrdID()  {
		return this.clOrdId;
	}


	@Override
	public void execute(ExecutionReport execution) {		

		try {
			//int countOfExecutions = this.executions.size();
			Long existingAvgPx = this.avgPx;
			Long existingQuantityExecuted = this.cumQty;
			Long thisExecutionQuantity = (long) execution.getLastQty().getValue();
			Long thisExecutionPrice = (long) execution.getLastPx().getValue();
			this.avgPx = ((existingAvgPx * existingQuantityExecuted) + (thisExecutionQuantity * thisExecutionPrice)) / (existingQuantityExecuted + thisExecutionQuantity);
			this.cumQty = this.cumQty + thisExecutionQuantity;
			this.executions.add(execution);	
		} catch (FieldNotFound e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<ExecutionReport> getExecutionReports() {
		return this.executions;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;

	}

	@Override
	public UUID getOrderId() {
		return this.orderId;
	}

	@Override
	@Experimental
	public String getOrderUniquenessTuple() {
		return this.orderId.toString();
	}

	@Override
	public String getSender() {
		return this.sender;
	}


	@Override
	public String getTarget() {
		return this.target;
	}

	@Override
	public void reCreateOrder(String symbol , Character timeInForce , OrderBookSide orderBookSide, Long orderQty, Long limitPrice,
			OffsetDateTime ts,  String sender, String target, UUID orderId, UUID clOrdId) {
		this.symbol = symbol;
		this.timeInForce = timeInForce; 
		this.orderBookSide = orderBookSide;
		this.orderQty = orderQty;
		this.limitPrice = limitPrice;
		this.ts = ts;
		this.sender = sender;
		this.target = target;
		this.orderId = orderId;
		this.clOrdId = clOrdId;

	}

	@Override
	public short getAlignmentType() {
		return this.alignmentType;
	}

	@Override
	public void setAlignmentType(short alignmentType) {
		this.alignmentType = alignmentType;
	}

	@Override
	public char getTimeInForce() {
		return this.timeInForce;
	}

	@Override
	public void setTimeInForce(char timeInForce) {
		this.timeInForce = timeInForce; 		
	}

	@Override
	public long getCumQty() {
		return this.cumQty;
	}

	@Override
	public long getAvgPx() {
		return this.avgPx;
	}

	@Override
	public Long getLeavesQty() {
		return this.leavesQty;
	}

	
	@Override
	public AlignmentKafkaSender getBytesForMarketDataAsSBEInSender() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlignmentKafkaSender getBytesForMemberAsSBEInSender() {
		
		ByteBuffer buf = null;
		final String receivedSymbol = this.symbol;
		final String orderId = this.orderId.toString();

		try {

			final short messageType = this.alignmentType;
			final String receivedSender = this.sender;
			final String receivedTarget = this.target;
			final char receivedSide = this.orderBookSide.sideCharValue;
			final char receivedTimeInForce = this.timeInForce;
			//get mappings...
			final Long exchangeIdMappedFromSenderCompID = AlignmentDataMapper.getExchangeIdMappedFromSenderCompID(receivedSender);
			final Long exchangeIdMappedFromTargetCompID = AlignmentDataMapper.getExchangeIdMappedFromTargetCompID(receivedTarget);
			final Long exchangeInstrumentIdMappedFromSymbol = AlignmentDataMapper.getExchangeIdMappedFromInstrumentId(receivedSymbol);
			final Short exchangeSideCodeMappedFromSideCode = AlignmentDataMapper.getExchangeSideCodeMappedFromMemberSideCode(receivedSide);
			final Short exchangeTimeInForceMappedFromTimeInForce = AlignmentDataMapper.getMemberTimeInForceMappedToExchangeTimeInForce(receivedTimeInForce);

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
			buf.putLong(this.clOrdId.getLeastSignificantBits());
			buf.putLong(this.clOrdId.getMostSignificantBits());
			buf.putLong(this.orderId.getLeastSignificantBits());
			buf.putLong(this.orderId.getMostSignificantBits());
			buf.putLong(exchangeIdMappedFromSenderCompID);
			buf.putLong(exchangeIdMappedFromTargetCompID);
			buf.putLong(this.orderQty);
			buf.putLong(this.limitPrice);
			buf.putLong(exchangeInstrumentIdMappedFromSymbol);
			buf.putLong(this.ts.toInstant().getEpochSecond());
			buf.putInt(this.ts.toInstant().getNano());		
			buf.putLong(exchangeSideCodeMappedFromSideCode);
			buf.putShort(exchangeTimeInForceMappedFromTimeInForce);

			buf.flip();
		} catch (Exception e) {
			//this.log.error(e.getMessage() , e);
			throw e;
		}

		AlignmentKafkaSender sender = new AlignmentKafkaSender();

		sender.initialise(buf.array(), receivedSymbol, orderId);

		return sender;

	}


	@Override
	public InterfaceOrder getAlignmentOrderFromBuffer(byte[] message, short msgType) {
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

			final String senderCompId = AlignmentDataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderId);
			final String targetCompId = AlignmentDataMapper.getMemberFIXTargetCompIdMappedFromExchangeId(targetId);
			final String instrument = AlignmentDataMapper.getMemberInstrumentIdMappedFromExchangeInstrumentId(instrumentId);
			final char sideCodeFIX = AlignmentDataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
			final Instant instant = Instant.ofEpochSecond(timeStampEpochSeconds).plusNanos(timeStampNanoseconds);
			final OffsetDateTime ts =  OffsetDateTime.ofInstant(instant, Constants.HERE);
			final OrderBookSide obs = OrderBookSide.getEnumForID(sideCodeFIX);
			final char tif = AlignmentDataMapper.getExchangeTimeInForceMappedToMemberTimeInForce(msgTimeInForce);


			this.reCreateOrder(instrument , tif, obs , orderQty , limitPrice , ts , senderCompId , targetCompId , orderId , clOrdId);
			return this;
		} catch(BufferUnderflowException | DateTimeException e) {
			throw e;
		}

	}

	@Override
	public InterfaceOrder getAlignmentOrderFromBuffer(byte[] message) {
		ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());
		final short msgType = bb.getShort();	//		buf.putShort(messageType
		return  getAlignmentOrderFromBuffer(bb.array(), msgType);
	}



	@Override
	public String getOrderBookKillString() {
		return this.sender + Constants.FULLSTOP + this.target;
	}



	@Override
	@NotYetImplemented
	public InterfaceExecutionReport getCancelledExecutionReport() {
		AlignmentExecutionReport aer = new AlignmentExecutionReport();
		
		return null;
	}



	
}