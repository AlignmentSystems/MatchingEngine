package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			: John Greenan
 *	Date            : 24th August 2023
 *	Copyright       : Alignment Systems Ltd 2023
 * 
 *	Artefact		: ApplicationFIXEngine
 * 
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.MessageDirection;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

public class ApplicationFIXEngine extends MessageCracker implements quickfix.Application{
	private ConcurrentLinkedQueue<InterfaceOrder> orderQueue = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	private LogEncapsulation log = null;
	private final String className = this.getClass().getCanonicalName();
	private Actors actor = null;

	public ApplicationFIXEngine(ConcurrentLinkedQueue<InterfaceOrder> orderQueue, LogEncapsulation log, Actors actor) {
		this.log = log;
		this.orderQueue = orderQueue;
		this.actor = actor;
	}

	@Override
	public void onCreate(SessionID sessionId) {
		// TODO Auto-generated method stub
		final String METHODNAME = "onCreate";


		StringBuilder sb = new StringBuilder()
				.append(sessionId.toString())
				;

		//log.infoSession(sb.toString(), METHODNAME);		
	}

	@Override
	public void onLogon(SessionID sessionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLogout(SessionID sessionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toAdmin(Message message, SessionID sessionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fromAdmin(Message message, SessionID sessionId)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toApp(Message message, SessionID sessionId) throws DoNotSend {
		// TODO Auto-generated method stub
		
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
		final String METHODNAME = "fromApp";
		String thisMessageType = null;
		StringBuilder sb = new StringBuilder();

		try {
			thisMessageType = message.getHeader().getField(new quickfix.field.MsgType()).getValue();
		} catch (FieldNotFound e) {
			log.error(e.getMessage(),e);
			throw e;
		}
		
	
		log.infoFIXSession(message.toRawString(), sessionId, MessageDirection.Received, METHODNAME, this.className, this.actor);

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
	 * @param message quickfix360T.fix44.ExecutionReport that is to be processed... 
	 * @param sessionID The FIX session on which the message was received
	 * @throws FieldNotFound Should not happen...
	 * @throws UnsupportedMessageType Should not happen...
	 * @throws IncorrectTagValue Should not happen...
	 */
	public void onMessage(com.alignmentsystems.fix44.NewOrderSingle message, SessionID sessionID) 			  
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		final String METHODNAME = "onMessage";

		StringBuilder sb = new StringBuilder()				
				.append(" Received=")
				.append(message.getClass().getSimpleName() )
				.append(" on [") 
				.append(sessionID.toString())
				.append("] enqueueing to rawMessageQueue...")
				;
		//log.infoSession(sb.toString(), METHODNAME);

		AlignmentOrder ao = new AlignmentOrder();
		ao.setNewOrderSingle(message, sessionID);
		orderQueue.add(ao);
	}
}