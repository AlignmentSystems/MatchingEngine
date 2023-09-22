package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	21st September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentKillMessage
 *	Description		:
 *****************************************************************************/

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;

import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.MessageDirection;
import com.alignmentsystems.library.interfaces.InterfaceKillDetail;
import com.alignmentsystems.library.interfaces.InterfaceKillMessage;
import com.alignmentsystems.library.interfaces.InterfaceKillString;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentKillMessage implements InterfaceKillMessage , InterfaceKillString{
	public final static String CLASSNAME = AlignmentKillMessage.class.getSimpleName().toString();
	public final static Short MSGTYPE = AlignmentDataMapper.EXCHANGEMESSAGETYPEKILLSWITCH;
	private final static int RECEIVEDLENGTH = 2 + 8 + 8 + 8 + 4 + 8 + 4;
	private final static int SENTLENGTH = RECEIVEDLENGTH + 8 + 4;

	private Long senderCompId = null;
	private String stringSenderCompId = null;
	private String stringTargetCompId = null;
	private Long targetCompId = null;
	private MessageDirection direction = null;
	private OffsetDateTime sentTimestamp = null;
	private OffsetDateTime receivedTimestamp = null;
	private OffsetDateTime executedTimestamp = null;

	private final Encodings encoding = Encodings.FIXSBELITTLEENDIAN;

	public AlignmentKillMessage() {
		super();
	}

	@Override
	public void initialise(String senderCompId , String targetCompId , MessageDirection direction ,
			OffsetDateTime sentTimestamp , OffsetDateTime receivedTimestamp) {
		this.senderCompId = AlignmentDataMapper.getExchangeIdMappedFromSenderCompID(senderCompId);
		this.targetCompId = AlignmentDataMapper.getExchangeIdMappedFromTargetCompID(targetCompId);
		this.direction = direction;
		this.sentTimestamp = sentTimestamp;
		this.receivedTimestamp = receivedTimestamp;
		this.stringSenderCompId = senderCompId;

	}

	@Override
	public void initialise(Long senderCompId, Long targetCompId, MessageDirection direction,
			OffsetDateTime sentTimestamp, OffsetDateTime receivedTimestamp, OffsetDateTime executedTimestamp) {
		this.senderCompId = senderCompId;
		this.targetCompId = targetCompId;
		this.direction = direction;
		this.sentTimestamp = sentTimestamp;
		this.receivedTimestamp = receivedTimestamp;
		this.executedTimestamp = executedTimestamp;//new - added for the matching engine to send back to the FIX engine...
		this.stringSenderCompId = AlignmentDataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderCompId);

	}

	@Override
	public Long getSender() {
		return this.senderCompId;
	}

	@Override
	public Long getTarget() {
		return this.targetCompId;
	}

	@Override
	public Short getMessageType() {
		return AlignmentKillMessage.MSGTYPE;
	}

	@Override
	public AlignmentKafkaSender getKillMessageBytesAsSBEInSender() {
		ByteBuffer buf = null;

		//		this.senderCompId = senderCompId;
		//		this.targetCompId = targetCompId;
		//		this.direction = direction;
		//		this.sentTimestamp = sentTimestamp;
		//		this.receivedTimestamp = receivedTimestamp;
		//		this.executedTimestamp = executedTimestamp;//new 

		int bufferLength =
				Short.BYTES //messageType
				+
				Long.BYTES//Sender
				+
				Long.BYTES//Target
				+
				Long.BYTES//sentTimestamp
				+
				Integer.BYTES//sentTimestamp
				+
				Long.BYTES//receivedTimestamp
				+
				Integer.BYTES//receivedTimestamp
				;



		if (this.direction==MessageDirection.RECEIVED) {
			//nothing to do here...
		}else if (this.direction==MessageDirection.SENT) {
			bufferLength = bufferLength 
					+
					Long.BYTES//executedTimestamp
					+
					Integer.BYTES//executedTimestamp
					;
		}

		try {
			buf = ByteBuffer.allocate(bufferLength).order(encoding.getByteOrder());

			buf.putShort(MSGTYPE);
			buf.putLong(this.senderCompId);
			buf.putLong(this.targetCompId);
			buf.putLong(this.sentTimestamp.toInstant().getEpochSecond());
			buf.putInt(this.sentTimestamp.toInstant().getNano());	
			buf.putLong(this.receivedTimestamp.toInstant().getEpochSecond());
			buf.putInt(this.receivedTimestamp.toInstant().getNano());	

			if (this.direction==MessageDirection.SENT) {
				buf.putLong(this.executedTimestamp.toInstant().getEpochSecond());
				buf.putInt(this.executedTimestamp.toInstant().getNano());	
			}
			buf.flip();
		} catch (Exception e) {
			//this.log.error(e.getMessage() , e);
			throw e;
		}
		AlignmentKafkaSender sender = new AlignmentKafkaSender();

		String topic = null;

		if (this.direction==MessageDirection.RECEIVED) {
			topic = KafkaMessageTopology.MESSAGE_RECEIVED_KILL_SWITCH;
		}
		else {
			topic = KafkaMessageTopology.MESSAGE_RESPONSE_KILL_SWITCH;
		}

		sender.initialise(buf.array(), topic, this.stringSenderCompId);

		return sender;	
	}



	@Override
	public InterfaceKillMessage getKillMessageFromBuffer(byte[] message, short msgType) {
		
		try {
		ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());

		this.senderCompId = bb.getLong();//		buf.putLong(this.senderCompId);
		this.targetCompId = bb.getLong();//		buf.putLong(this.targetCompId);
		this.stringSenderCompId = AlignmentDataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(senderCompId);
		this.stringTargetCompId = AlignmentDataMapper.getMemberFIXSenderCompIdMappedFromExchangeId(targetCompId);
		
		final Long sentTimeStampEpochSeconds = bb.getLong();
		final int sentTimeStampNanoseconds = bb.getInt();
		final Long receivedTimeStampEpochSeconds = bb.getLong();
		final int receivedTimeStampNanoseconds = bb.getInt();



		final Instant instantSent = Instant.ofEpochSecond(sentTimeStampEpochSeconds).plusNanos(sentTimeStampNanoseconds);
		this.sentTimestamp =  OffsetDateTime.ofInstant(instantSent , Constants.HERE);

		final Instant instantReceived = Instant.ofEpochSecond(receivedTimeStampEpochSeconds).plusNanos(receivedTimeStampNanoseconds);
		this.receivedTimestamp =  OffsetDateTime.ofInstant(instantReceived , Constants.HERE);


		if(message.length == AlignmentKillMessage.RECEIVEDLENGTH){
			//Nothing more to do here!

		}else if(message.length== AlignmentKillMessage.SENTLENGTH){
			final Long executedTimeStampEpochSeconds = bb.getLong();
			final int executedTimeStampNanoseconds = bb.getInt();
			final Instant instantExecuted = Instant.ofEpochSecond(executedTimeStampEpochSeconds).plusNanos(executedTimeStampNanoseconds);
			this.executedTimestamp =  OffsetDateTime.ofInstant(instantExecuted , Constants.HERE);
			}
		} catch(BufferUnderflowException | DateTimeException e) {
			throw e;
		}
		
		return this;
		
		}

		@Override
		public InterfaceKillMessage getKillMessageFromBuffer(byte[] message) {
			ByteBuffer bb = ByteBuffer.wrap(message).order(encoding.getByteOrder());
			final short msgType = bb.getShort();	//		buf.putShort(messageType
			return getKillMessageFromBuffer(bb.array(), msgType);
		}

		@Override
		public String getSenderCompId() {
			return this.stringSenderCompId;
		}

		@Override
		public String getTargetCompId() {
			return this.stringTargetCompId;
		}

		@Override
		public String getOrderBookKillString() {
			return this.stringSenderCompId + Constants.FULLSTOP + this.stringTargetCompId;
		}

		@Override
		public void initialise(InterfaceKillDetail killDetail) {
			this.senderCompId = AlignmentDataMapper.getExchangeIdMappedFromSenderCompID(killDetail.getSenderCompId());
			this.targetCompId = AlignmentDataMapper.getExchangeIdMappedFromTargetCompID(killDetail.getTargetCompId());
			this.direction = MessageDirection.RECEIVED;
			this.sentTimestamp = killDetail.getTimestamp();
			this.receivedTimestamp = OffsetDateTime.now(Constants.HERE);
			this.stringSenderCompId = killDetail.getSenderCompId();
			this.stringTargetCompId = killDetail.getTargetCompId();
		}
	}