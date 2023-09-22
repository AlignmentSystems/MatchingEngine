package com.alignmentsystems.library.interfaces;

import java.time.OffsetDateTime;

import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.enumerations.MessageDirection;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	19th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceKillMessage
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */

public abstract interface InterfaceKillMessage {
	public void initialise(String senderCompId, String targetCompId, MessageDirection direction , OffsetDateTime sentTimestamp, OffsetDateTime receivedTimestamp );
	public void initialise(Long senderCompId, Long targetCompId, MessageDirection direction , OffsetDateTime sentTimestamp, OffsetDateTime receivedTimestamp, OffsetDateTime executedTimestamp );
	public void initialise(InterfaceKillDetail killDetail); 
	public abstract Long getSender();
	public abstract Long getTarget();
	public abstract String getSenderCompId();
	public abstract String getTargetCompId();
	public abstract String getOrderBookKillString();
	public abstract Short getMessageType();
	public abstract AlignmentKafkaSender getKillMessageBytesAsSBEInSender();
	public InterfaceKillMessage getKillMessageFromBuffer(byte[] message, short msgType);
	public InterfaceKillMessage getKillMessageFromBuffer(byte[] message);
}
