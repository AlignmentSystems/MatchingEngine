package com.alignmentsystems.matching;
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

import com.alignmentsystems.fix44.NewOrderSingle;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.MessageDirection;
import com.alignmentsystems.library.enumerations.OrderBookSide;

import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.UnsupportedMessageType;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class FIXEngineMember extends MessageCracker implements quickfix.Application{
	private final static String CLASSNAME = FIXEngineMember.class.getSimpleName();
	private AlignmentLogEncapsulation log = null;
	private InstanceType instanceType = null;

	public FIXEngineMember(AlignmentLogEncapsulation log, InstanceType instanceType) {
		this.log = log;
		this.instanceType = instanceType;
	}


	/**
	 * See <a href="https://quickfixj.org/usermanual/2.3.0/usage/application.html">QuickFIX Manual</a>
	 * This method is called when quickfix creates a new session. A session comes into and remains 
	 * in existence for the life of the application. Sessions exist whether or not a counter party 
	 * is connected to it. As soon as a session is created, you can begin sending messages to it. 
	 * If no one is logged on, the messages will be sent at the time a connection is established with 
	 * the counterparty.
	 */
	@Override
	public void onCreate(SessionID sessionId) {
		// TODO Auto-generated method stub
		final String METHODNAME = "onCreate".intern();
		
		StringBuilder sb = new StringBuilder()
				.append(sessionId.toString())
				;

		log.infoFIXSession(sb.toString(), sessionId, METHODNAME, CLASSNAME, instanceType);		
	}


	/**
	 * This callback notifies you when a valid logon has been established with a counter party. 
	 * This is called when a connection has been established and the FIX logon process has completed 
	 * with both parties exchanging valid logon messages.
	 */
	@Override
	public void onLogon(SessionID sessionId) {
		final String METHODNAME = "onLogon".intern();

		StringBuilder sb = new StringBuilder()
				.append(sessionId.toString())
				;

		log.infoFIXSession(sb.toString(), sessionId, METHODNAME, CLASSNAME, instanceType);	

		NewOrderSingle nosB = null;
		NewOrderSingle nosS = null;
		final String symbol = "BADGER.W";
		

		if(instanceType==InstanceType.MEMBERA || instanceType==InstanceType.MEMBERB) {
			for(int i = 0; i < 2; i++) {

				try {
					nosB = LibraryMemberOrders.getOrder(OrderBookSide.BUY, 42d + (double) i, symbol);					
					Session.sendToTarget(nosB, sessionId);
					log.info(nosB.toString());
					nosS = LibraryMemberOrders.getOrder(OrderBookSide.SELL, 42d - (double) i , symbol );
					log.info(nosS.toString());
					Session.sendToTarget(nosS, sessionId);

				} catch (SessionNotFound e) {
					log.error(e.getMessage(), e);		
				}				
			}
		}
	}


	/**
	 * This callback notifies you when an FIX session is no longer online. This could happen during a normal 
	 * logout exchange or because of a forced termination or a loss of network connection.
	 */
	@Override
	public void onLogout(SessionID sessionId) {
		final String METHODNAME = "onLogout".intern();

		StringBuilder sb = new StringBuilder()
				.append(sessionId.toString())
				;

		log.infoFIXSession(sb.toString(), sessionId, METHODNAME, CLASSNAME, instanceType);	
	}


	/**
	 * This callback provides you with a peek at the administrative messages that are being sent from your FIX engine
	 * to the counter party. This is normally not useful for an application however it is provided for any logging you
	 * may wish to do. Notice that the FIX::Message is not const. This allows you to add fields to an administrative
	 * message before it is sent out.
	 */
	@Override
	public void toAdmin(Message message, SessionID sessionId) {
		final String METHODNAME = "toAdmin".intern();

		Boolean errorEvent = Boolean.FALSE;
		StringBuilder sb = new StringBuilder();

		String thisMessageType = null;

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			sb = new StringBuilder()
					.append(METHODNAME)
					.append(Constants.TAB)
					.append(sessionId.toString())
					.append(Constants.EQUALS) 
					.append(e.getMessage())
					;
			log.error(sb.toString(), e);
			errorEvent = Boolean.TRUE;
		}

		if(!errorEvent) {
			sb = new StringBuilder()
					.append(sessionId.toString())
					.append(" MessageType=[") 
					.append(thisMessageType)
					.append("] ")
					.append(MessageDirection.SENT.value)
					.append(" (") 
					.append(message.getClass().getSimpleName())
					.append(")") 				
					;
			log.infoFIXSession(sb.toString(), sessionId, METHODNAME, CLASSNAME, instanceType);	
		}

	}


	/**
	 * This callback notifies you when an administrative message is sent from a counterparty to your FIX engine.
	 * This can be useful for doing extra validation on logon messages such as for checking passwords. 
	 * Throwing a RejectLogon exception will disconnect the counterparty.
	 */
	@Override
	public void fromAdmin(Message message, SessionID sessionId)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		final String METHODNAME = "fromAdmin".intern();

		String thisMessageType = null;	

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			log.error(e.getMessage(),e);
			throw e;
		}

		log.infoFIXSession(message.toRawString(), sessionId, METHODNAME, CLASSNAME, instanceType);		



	}


	/**
	 * This is a callback for application messages that you are being sent to a counterparty. 
	 * If you throw a DoNotSend exception in this function, the application will not send the message. 
	 * This is mostly useful if the application has been asked to resend a message such as an order 
	 * that is no longer relevant for the current market. Messages that are being resent are marked 
	 * with the PossDupFlag in the header set to true; If a DoNotSend exception is thrown and the flag is 
	 * set to true, a sequence reset will be sent in place of the message. If it is set to false, the message
	 * will simply not be sent. Notice that the FIX::Message is not const. This allows you to add fields 
	 * before an application message before it is sent out.
	 */
	@Override
	public void toApp(Message message, SessionID sessionId) throws DoNotSend {
		final String METHODNAME = "toApp".intern();

	}


	/**
	 * This is one of the core entry points for your FIX application. Every application level request will 
	 * come through here. If, for example, your application is a sell-side OMS, this is where you will get your
	 * new order requests. If you were a buy side, you would get your execution reports here. If a FieldNotFound
	 * exception is thrown, the counterparty will receive a reject indicating a conditionally required 
	 * field is missing. The Message class will throw this exception when trying to retrieve a missing field,
	 * so you will rarely need the throw this explicitly. You can also throw an UnsupportedMessageType exception.
	 * This will result in the counterparty getting a reject informing them your application cannot process those
	 * types of messages. An IncorrectTagValue can also be thrown if a field contains a value that is out of range
	 * or you do not support.
	 */
	@Override
	public void fromApp(Message message, SessionID sessionId)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		// TODO Auto-generated method stub
		final String METHODNAME = "fromApp".intern();
		String thisMessageType = null;
		StringBuilder sb = new StringBuilder();

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			log.error(e.getMessage(),e);
			throw e;
		}


		log.infoFIXSession(message.toRawString(), sessionId, MessageDirection.RECEIVED, METHODNAME, FIXEngineMember.CLASSNAME, this.instanceType);

		try {
			crack(message, sessionId);
		} catch (UnsupportedMessageType e) {
			log.error(e.getMessage(),e);
		} catch (FieldNotFound e) {
			log.error(e.getMessage(),e);
		} catch (IncorrectTagValue e) {
			log.error(e.getMessage(),e);
		}



	}

	/**
	 * 
	 * @see <a href="https://www.quickfixj.org/usermanual/2.3.0/usage/receiving_messages.html">QuickFIX</a> 
	 * @param message fix44.ExecutionReport that is to be processed... 
	 * @param sessionID The FIX session on which the message was received
	 * @throws FieldNotFound Should not happen...
	 * @throws UnsupportedMessageType Should not happen...
	 * @throws IncorrectTagValue Should not happen...
	 */
	public void onMessage(com.alignmentsystems.fix44.NewOrderSingle message, SessionID sessionID) 			  
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		final String METHODNAME = "onMessage".intern();

		log.infoFIXSession(message.toString(), sessionID, MessageDirection.RECEIVED, METHODNAME, message.getClass().getSimpleName(), instanceType);			
	}

	/**
	 * 
	 * @see <a href="https://www.quickfixj.org/usermanual/2.3.0/usage/receiving_messages.html">QuickFIX</a> 
	 * @param message fix44.ExecutionReport that is to be processed... 
	 * @param sessionID The FIX session on which the message was received
	 * @throws FieldNotFound Should not happen...
	 * @throws UnsupportedMessageType Should not happen...
	 * @throws IncorrectTagValue Should not happen...
	 */
	public void onMessage(com.alignmentsystems.fix44.ExecutionReport message, SessionID sessionID) 			  
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		final String METHODNAME = "onMessage".intern();


		StringBuilder sb = new StringBuilder()				
				.append(" Execution Report=(")
				.append(" ExecID=(")
				.append(message.getExecID())
				.append(") SessionID=(")
				.append(sessionID.toString())
				.append(")") 
				;
		log.infoFIXSession(sb.toString(), sessionID, MessageDirection.RECEIVED, METHODNAME, message.getClass().getSimpleName(), instanceType);

	}
}