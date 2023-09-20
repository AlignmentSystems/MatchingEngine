package com.alignmentsystems.matching;

import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.util.Properties;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	ApplicationFIXEngine
 *	Description		:
 *****************************************************************************/

import java.util.UUID;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.alignmentsystems.fix44.ExecutionReport;
import com.alignmentsystems.library.AlignmentDataMapper;
import com.alignmentsystems.library.AlignmentExecutionReport;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentOrder;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.MessageDirection;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceFIXEngine;
import com.alignmentsystems.library.interfaces.InterfaceKafkaMessageHandler;
import com.alignmentsystems.library.interfaces.InterfaceOrderSender;

import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentFIXEngineExchange extends MessageCracker implements InterfaceOrderSender, InterfaceKafkaMessageHandler, InterfaceFIXEngine, quickfix.Application {
	protected final static String CLASSNAME = AlignmentFIXEngineExchange.class.getSimpleName();
	private final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
	private AlignmentLogEncapsulation log = null;
	private InstanceType instanceType = null;
	private AlignmentPersistenceToFileClient debugger = null;
	private KafkaProducer<String, byte[]> kafkaProducerB = null;

	@Override
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger, InstanceType instanceType) throws FileNotFoundException ,NullPointerException{
		final String METHOD = "initialise";
		
		this.log = log;
		this.debugger = debugger;
		this.instanceType = instanceType;

		
		debugger.debug(CLASSNAME + "." + METHOD);

		AlignmentUEH ueh = new AlignmentUEH(this.debugger);	
		Thread.setDefaultUncaughtExceptionHandler(ueh);


		
		
		
		
		if (this.kafkaProducerB == null) {
			Properties props;
			try {
				props = AlignmentFunctions.getProperties(AlignmentFIXEngineKafkaProducer.class.getClassLoader(), InstanceType.KAFKA.getProperties());
			} catch (FileNotFoundException | NullPointerException e) {
				this.log.error(e.getMessage() , e);
				throw e;
			}
			this.kafkaProducerB = new KafkaProducer<>(props);
		}
		
		
		
		return true;
	}

	/**
	 * See <a href=
	 * "https://quickfixj.org/usermanual/2.3.0/usage/application.html">QuickFIX
	 * Manual</a> This method is called when quickfix creates a new session. A
	 * session comes into and remains in existence for the life of the application.
	 * Sessions exist whether or not a counter party is connected to it. As soon as
	 * a session is created, you can begin sending messages to it. If no one is
	 * logged on, the messages will be sent at the time a connection is established
	 * with the counterparty.
	 */
	@Override
	public void onCreate(SessionID sessionId) {
		// TODO Auto-generated method stub
		final String METHOD = "onCreate".intern();

		StringBuilder sb = new StringBuilder().append(sessionId.toString());

		debugger.debug(CLASSNAME + "." + METHOD);
		log.infoFIXSession(sb.toString(), sessionId, METHOD, CLASSNAME, instanceType);
	}

	/**
	 * This callback notifies you when a valid logon has been established with a
	 * counter party. This is called when a connection has been established and the
	 * FIX logon process has completed with both parties exchanging valid logon
	 * messages.
	 */
	@Override
	public void onLogon(SessionID sessionId) {
		final String METHOD = "onLogon".intern();

		StringBuilder sb = new StringBuilder().append(sessionId.toString());
		debugger.debug(CLASSNAME + "." + METHOD);

		log.infoFIXSession(sb.toString(), sessionId, METHOD, CLASSNAME, instanceType);
	}

	/**
	 * This callback notifies you when an FIX session is no longer online. This
	 * could happen during a normal logout exchange or because of a forced
	 * termination or a loss of network connection.
	 */
	@Override
	public void onLogout(SessionID sessionId) {
		final String METHOD = "onLogout".intern();

		StringBuilder sb = new StringBuilder().append(sessionId.toString());
		debugger.debug(CLASSNAME + "." + METHOD);

		log.infoFIXSession(sb.toString(), sessionId, METHOD, CLASSNAME, instanceType);
	}

	/**
	 * This callback provides you with a peek at the administrative messages that
	 * are being sent from your FIX engine to the counter party. This is normally
	 * not useful for an application however it is provided for any logging you may
	 * wish to do. Notice that the FIX::Message is not const. This allows you to add
	 * fields to an administrative message before it is sent out.
	 */
	@Override
	public void toAdmin(Message message, SessionID sessionId) {
		final String METHOD = "toAdmin".intern();

		debugger.debug(CLASSNAME + "." + METHOD);

		Boolean errorEvent = Boolean.FALSE;
		StringBuilder sb = new StringBuilder();

		String thisMessageType = null;

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			sb = new StringBuilder().append(METHOD).append(Constants.TAB).append(sessionId.toString())
					.append(Constants.EQUALS).append(e.getMessage());
			log.error(sb.toString(), e);
			errorEvent = Boolean.TRUE;
		}

		if (!errorEvent) {
			sb = new StringBuilder().append(sessionId.toString()).append(" MessageType=[").append(thisMessageType)
					.append("] ").append(MessageDirection.SENT.value).append(" (")
					.append(message.getClass().getSimpleName()).append(")");
			log.infoFIXSession(sb.toString(), sessionId, METHOD, CLASSNAME, instanceType);
		}

	}

	/**
	 * This callback notifies you when an administrative message is sent from a
	 * counterparty to your FIX engine. This can be useful for doing extra
	 * validation on logon messages such as for checking passwords. Throwing a
	 * RejectLogon exception will disconnect the counterparty.
	 */
	@Override
	public void fromAdmin(Message message, SessionID sessionId)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		final String METHOD = "fromAdmin".intern();

		String thisMessageType = null;
		debugger.debug(CLASSNAME + "." + METHOD);

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			log.error(e.getMessage(), e);
			throw e;
		}

		log.infoFIXSession(message.toRawString(), sessionId, METHOD, CLASSNAME, instanceType);

	}

	/**
	 * This is a callback for application messages that you are being sent to a
	 * counterparty. If you throw a DoNotSend exception in this function, the
	 * application will not send the message. This is mostly useful if the
	 * application has been asked to resend a message such as an order that is no
	 * longer relevant for the current market. Messages that are being resent are
	 * marked with the PossDupFlag in the header set to true; If a DoNotSend
	 * exception is thrown and the flag is set to true, a sequence reset will be
	 * sent in place of the message. If it is set to false, the message will simply
	 * not be sent. Notice that the FIX::Message is not const. This allows you to
	 * add fields before an application message before it is sent out.
	 */
	@Override
	public void toApp(Message message, SessionID sessionId) throws DoNotSend {
		final String METHOD = "toApp".intern();
		debugger.debug(CLASSNAME + "." + METHOD);


	}

	/**
	 * This is one of the core entry points for your FIX application. Every
	 * application level request will come through here. If, for example, your
	 * application is a sell-side OMS, this is where you will get your new order
	 * requests. If you were a buy side, you would get your execution reports here.
	 * If a FieldNotFound exception is thrown, the counterparty will receive a
	 * reject indicating a conditionally required field is missing. The Message
	 * class will throw this exception when trying to retrieve a missing field, so
	 * you will rarely need the throw this explicitly. You can also throw an
	 * UnsupportedMessageType exception. This will result in the counterparty
	 * getting a reject informing them your application cannot process those types
	 * of messages. An IncorrectTagValue can also be thrown if a field contains a
	 * value that is out of range or you do not support.
	 */
	@Override
	public void fromApp(Message message, SessionID sessionId)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		// TODO Auto-generated method stub
		final String METHOD = "fromApp".intern();
		String thisMessageType = null;
		StringBuilder sb = new StringBuilder();

		debugger.debug(CLASSNAME + "." + METHOD);

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			log.error(e.getMessage(), e);
			throw e;
		}

		log.infoFIXSession(message.toRawString(), sessionId, MessageDirection.RECEIVED, METHOD, AlignmentFIXEngineExchange.CLASSNAME,
				instanceType);

		try {
			crack(message, sessionId);
		} catch (UnsupportedMessageType e) {
			log.error(e.getMessage(), e);
		} catch (FieldNotFound e) {
			log.error(e.getMessage(), e);
		} catch (IncorrectTagValue e) {
			log.error(e.getMessage(), e);
		}

	}

	/**
	 * 
	 * @see <a href=
	 *      "https://www.quickfixj.org/usermanual/2.3.0/usage/receiving_messages.html">QuickFIX</a>
	 * @param message   fix44.ExecutionReport that is to be processed...
	 * @param sessionID The FIX session on which the message was received
	 * @throws FieldNotFound          Should not happen...
	 * @throws UnsupportedMessageType Should not happen...
	 * @throws IncorrectTagValue      Should not happen...
	 */
	public void onMessage(com.alignmentsystems.fix44.ExecutionReport message, SessionID sessionID)
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		final String METHOD = "onMessage".intern();

		StringBuilder sb = new StringBuilder().append(" Execution Report=(").append(" ExecID=(")
				.append(message.getExecID()).append(") SessionID=(").append(sessionID.toString()).append(")");
		log.infoFIXSession(sb.toString(), sessionID, MessageDirection.RECEIVED, METHOD,
				message.getClass().getSimpleName(), this.instanceType);

	}

	
	
	/**
	 * 
	 * @see <a href=
	 *      "https://www.quickfixj.org/usermanual/2.3.0/usage/receiving_messages.html">QuickFIX</a>
	 * @param message   fix44.ExecutionReport that is to be processed...
	 * @param sessionID The FIX session on which the message was received
	 * @throws FieldNotFound          Should not happen...
	 * @throws UnsupportedMessageType Should not happen...
	 * @throws IncorrectTagValue      Should not happen...
	 */
	public void onMessage(com.alignmentsystems.fix44.NewOrderSingle message, SessionID sessionID)
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		final String METHOD = "onMessage".intern();

		debugger.debug(CLASSNAME + "." + METHOD + Constants.EQUALS + message.MSGTYPE);
		
		OrderBookSide orderBookSide = AlignmentFunctions.getOrderBookSideFromFIXSide(message.getSide());

		AlignmentOrder ao = new AlignmentOrder();

		ao.setNewOrderSingle(message, sessionID, UUID.randomUUID(), orderBookSide);

		StringBuilder sb = new StringBuilder().append(" OrderID=(").append(ao.getOrderId()).append(" ClOrdID=(")
				.append(ao.getClOrdID()).append(" Side=(").append(ao.getOrderBookSide().sideReadableValue )
				.append(") SenderCompId=").append(ao.getSender()).append(" TargetCompId=").append(ao.getTarget())
				.append(" sending to Kafka...");
		
		debugger.debug(sb.toString());

		try {
			debugger.debug("Sending order to Kafka...");
			AlignmentKafkaSender sender = ao.getBytesAsSBEInSender();
			this.send(sender);
			
			log.infoFIXSession(sb.toString(), sessionID, MessageDirection.RECEIVED, METHOD,
					message.getClass().getSimpleName(), instanceType);
		} catch (NullPointerException e) {
			log.errorFIXSession(sb.toString(), sessionID, MessageDirection.RECEIVED, METHOD,
					message.getClass().getSimpleName(), instanceType);
		}
	}

	

	@Override
	public void send(AlignmentKafkaSender sender) {
		final String METHOD = "send".intern();

		ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<>(sender.getTopic(), sender.getKey(), sender.getBinaryMessage());

		debugger.debug(CLASSNAME + "." + METHOD);

		this.kafkaProducerB.send(producerRecord);		
	}

	@Override
	public void processMessage(String topicName, ConsumerRecord<String, byte[]> consumerRecord) throws Exception {
		final String METHOD = "processMessage".intern();
		//Here we receive a Kafka Message...

		log.info(CLASSNAME  + "." + METHOD + " received " + topicName);

		ByteBuffer bb = ByteBuffer.wrap(consumerRecord.value()).order(encoding.getByteOrder());
		final short msgType = bb.getShort();	//		buf.putShort(messageType);
		//When we get to here we know the message type that was used
		//if its an Order then we need to send acknowledgement
		//if it's an er, we need to send it to the counterparty...
		ExecutionReport er = null;
		String sender = null;
		String target = null;
		AlignmentExecutionReport aer = new AlignmentExecutionReport();

		if (msgType==AlignmentDataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT) {

			er = aer.getFIXExecutionReport(bb, msgType);

		}else if (msgType==AlignmentDataMapper.EXCHANGEMESSAGETYPEMAPPEDFROMNEWORDERSINGLE) {
			//it's an order that has been thrown back to generate an ExecutionReport.
			//rehydrate into a POJO and then send
			er = aer.getFIXExecutionReportAckFromOrderBuffer(bb, msgType);	

		}				

		Boolean sent = Session.sendToTarget(er);
		if (sent) {
			debugger.info(CLASSNAME  + "." + METHOD + " sent on " + topicName);
		}else {
			debugger.error(CLASSNAME  + "." + METHOD + " not sent on " + topicName);
		}
	}
}