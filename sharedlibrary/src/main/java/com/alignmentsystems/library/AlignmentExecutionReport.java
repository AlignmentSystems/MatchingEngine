package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	18th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentExecutionReport
 *	Description		:
 *****************************************************************************/

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
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.ExecutionReportDestination;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceOrder;





/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentExecutionReport implements InterfaceExecutionReport {
	public final static Short EXCHANGEMESSAGETYPE = AlignmentDataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT;

	private String commentFieldValue = null;
	private UUID execID = null;
	private String buySenderId = null; 
	private String buyTargetId = null;
	private String sellSenderId = null;
	private String sellTargetId = null;
	private OffsetDateTime timestamp = null;
	private Long executionQuantity = null;
	private Long executionPrice = null;
	private Long leavesQuantity = null;
	private Long cumQuantity = null;
	private Long averagePrice = null;
	private UUID clOrdID = null;
	private UUID orderID = null;
	private UUID marketDataID = null;
	private Short ordStatus = null;
	private Short execType = null;
	private Short sideCode = null;


	@Override
	public void setExecutionReport(
			UUID execID 
			, UUID clOrdID
			, UUID orderID
			, UUID marketDataID
			, String buySenderId
			, String buyTargetId
			, String sellSenderId
			, String sellTargetId
			, OffsetDateTime timestamp
			, Long executionQuantity
			, Long executionPrice
			, Long leavesQuantity
			, Long cumQuantity
			, Long averagePrice
			, Short ordStatus
			, Short execType
			, Short sideCode
			) {
		this.execID = execID;
		this.clOrdID = clOrdID;
		this.orderID = orderID;
		this.marketDataID = marketDataID;
		this.buySenderId = buySenderId; 
		this.buyTargetId = buyTargetId;
		this.sellSenderId = sellSenderId;
		this.sellTargetId = sellTargetId;
		this.timestamp = timestamp;
		this.executionQuantity = executionQuantity;
		this.executionPrice = executionPrice;
		this.leavesQuantity = leavesQuantity;
		this.cumQuantity = cumQuantity;
		this.averagePrice = averagePrice;
		this.ordStatus = ordStatus;
		this.execType = execType;
		this.sideCode = sideCode;
	}

	@Override
	public UUID getExecID() {
		return this.execID;
	}

	@Override
	public UUID getMarketDataID() {
		return this.marketDataID;
	}


	@Override
	public String getBuySenderId() {
		return this.buySenderId;
	}

	@Override
	public String getBuyTargetId() {
		return this.buyTargetId;
	}

	@Override
	public String getSellSenderId() {
		return this.sellSenderId;
	}

	@Override
	public String getSellTargetId() {
		return this.sellTargetId;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.timestamp;
	}

	@Override
	public Long getExecutionQuantity() {
		return this.executionQuantity;
	}

	@Override
	public Long getExecutionPrice() {
		return this.executionPrice;
	}

	@Override
	public Long getLeavesQuantity() {
		return this.leavesQuantity;
	}

	@Override
	public Long getCumQuantity() {
		return this.cumQuantity;
	}

	@Override
	public Long getAveragePrice() {
		return this.averagePrice;
	}

	@Override
	public UUID getClOrdID() {
		return this.clOrdID;
	}

	@Override
	public UUID getOrderID() {
		return this.orderID;
	}

	@Override
	public Short getOrdStatus() {
		return this.ordStatus;
	}

	@Override
	public Short getExecType() {
		return this.execType;
	}

	@Override
	public Short getSideCode() {
		return this.sideCode;
	}






/**
 * 
 * @param destination
 * @return
 */
	private byte[] getBytesAsSBE(ExecutionReportDestination destination) {
		byte[] returnValue = null;
		ByteBuffer buf = null;
		final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;


		if(destination==ExecutionReportDestination.MEMBER) {
			final Short msgType = AlignmentDataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT;
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

				buf.putShort(AlignmentExecutionReport.EXCHANGEMESSAGETYPE);
				buf.putLong(this.execID.getLeastSignificantBits());
				buf.putLong(this.execID.getMostSignificantBits());
				buf.putLong(this.clOrdID.getLeastSignificantBits());
				buf.putLong(this.clOrdID.getMostSignificantBits());
				buf.putLong(this.orderID.getLeastSignificantBits());
				buf.putLong(this.orderID.getMostSignificantBits());
				buf.putShort(this.execType);
				buf.putShort(this.ordStatus);
				buf.putShort(this.sideCode);
				buf.putLong(this.leavesQuantity);
				buf.putLong(this.cumQuantity);
				buf.putLong(this.averagePrice);
				buf.putLong(this.executionPrice);
				buf.putLong(this.executionQuantity);
				buf.putLong(this.timestamp.toInstant().getEpochSecond());
				buf.putInt(this.timestamp.toInstant().getNano());		

				buf.flip();
			} catch (Exception e) {
				//this.log.error(e.getMessage() , e);
				throw e;
			}



		}else if(destination==ExecutionReportDestination.MARKETDATA){
			try {
				final int bufferLength =
						Short.BYTES //messageType
						+
						Long.BYTES * 2//marketDataID

						//+
						//Long.BYTES * 2//ExecID
						//+
						//Long.BYTES * 2//ClOrdID
						//+
						//Long.BYTES * 2//OrderID
						+
						Short.BYTES //ExecType
						+
						Short.BYTES//Side
						//+
						//Long.BYTES //LeavesQty
						//+
						//Long.BYTES //CumQty
						//+
						//Long.BYTES //AvgPx
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

				buf.putShort(AlignmentExecutionReport.EXCHANGEMESSAGETYPE);
				buf.putLong(this.marketDataID.getLeastSignificantBits());
				buf.putLong(this.marketDataID.getMostSignificantBits());

				//buf.putLong(this.execID.getLeastSignificantBits());
				//buf.putLong(this.execID.getMostSignificantBits());
				//buf.putLong(this.clOrdID.getLeastSignificantBits());
				//buf.putLong(this.clOrdID.getMostSignificantBits());
				//buf.putLong(this.orderID.getLeastSignificantBits());
				//buf.putLong(this.orderID.getMostSignificantBits());
				buf.putShort(this.execType);
				//buf.putShort(this.ordStatus);
				buf.putShort(this.sideCode);
				//buf.putLong(this.leavesQuantity);
				//buf.putLong(this.cumQuantity);
				//buf.putLong(this.averagePrice);
				buf.putLong(this.executionPrice);
				buf.putLong(this.executionQuantity);
				buf.putLong(this.timestamp.toInstant().getEpochSecond());
				buf.putInt(this.timestamp.toInstant().getNano());		

				buf.flip();
			} catch (Exception e) {
				//this.log.error(e.getMessage() , e);
				throw e;
			}
		}

		returnValue=buf.array();

		return returnValue;

	}

	@Override
	public AlignmentKafkaSender getMarketDataBytesAsSBEInSender() {
		//What do we do here? Simply put, this is a way for the market data to be generated. 
		//that means that there is NO sender or Target on the message
		AlignmentKafkaSender sender = new AlignmentKafkaSender();
		sender.initialise(this.getBytesAsSBE(ExecutionReportDestination.MARKETDATA), KafkaMessageTopology.MESSAGE_FILL, this.execID.toString());
		return sender;
	}


	@Override
	public AlignmentKafkaSender getMemberExecRptAsSBEInSender() {

		AlignmentKafkaSender sender = new AlignmentKafkaSender();
		sender.initialise(this.getBytesAsSBE(ExecutionReportDestination.MEMBER), KafkaMessageTopology.MESSAGE_FILL, this.execID.toString());
		return sender;
	}

	@Override
	public AlignmentKafkaSender getMemberExecRptForTopicAsSBEInSender(String topic) {
		AlignmentKafkaSender sender = new AlignmentKafkaSender();
		sender.initialise(this.getBytesAsSBE(ExecutionReportDestination.MEMBER), topic, this.execID.toString());
		return sender;
	}

	@Override
	public ExecutionReport getFIXExecutionReport(ByteBuffer bb, short msgType) {
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
			final char execTypeFIX = AlignmentDataMapper.getMemberExecTypeMappedFromExchangeExecType(execType);
			final char orderStatusFIX = AlignmentDataMapper.getMemberOrdStatusMappedToExchangeOrdStatus(ordStatus);
			final char sideFIX = AlignmentDataMapper.getMemberSideCodeMappedFromExchangeSideCode(sideCode);
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

	@Override
	public ExecutionReport getFIXExecutionReportAckFromOrderBuffer(ByteBuffer bb, short msgType) {
		AlignmentOrder ao = new AlignmentOrder();
		ao.getAlignmentOrderFromBuffer(bb.array(), msgType);

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

	@Override
	public InterfaceExecutionReport getExecutionReportForCancelledOrder(InterfaceOrder cancelledOrder, String commentFieldValue) {
		
		final UUID execID = UUID.randomUUID();
		final UUID marketDataID = UUID.randomUUID();
		final Short side = AlignmentDataMapper.getExchangeSideCodeMappedFromMemberSideCode(cancelledOrder.getOrderBookSide().sideCharValue);
		String senderBuy = null;
		String targetBuy = null;
		String senderSell = null;
		String targetSell = null;

		//Set the comment field...
		this.commentFieldValue = commentFieldValue;
		
		
		if (side == AlignmentDataMapper.EXCHANGESIDEBUY) {			
			senderBuy = cancelledOrder.getSender();
			targetBuy = cancelledOrder.getTarget();
		}else {
			senderSell = cancelledOrder.getSender();
			targetSell = cancelledOrder.getTarget();
		}
		
		
		this.setExecutionReport(execID
				, cancelledOrder.getClOrdID()
				, cancelledOrder.getOrderId()
				, marketDataID
				, senderBuy
				, targetBuy
				, senderSell
				, targetSell
				, cancelledOrder.getTimestamp()
				, 0L 
				, 0L
				, cancelledOrder.getLeavesQty()
				, cancelledOrder.getCumQty() 
				, cancelledOrder.getAvgPx()
				, AlignmentDataMapper.EXCHANGEORDSTATUSCANCELLED
				, AlignmentDataMapper.EXCHANGEEXECTYPECANCELLED
				, side
				);		
		return this;
	}

	@Override
	public String getCommentFieldValue() {
		return this.commentFieldValue;
	}

	@Override
	public void setCommentFieldValue(String comment) {
		this.commentFieldValue = comment;
	}
}