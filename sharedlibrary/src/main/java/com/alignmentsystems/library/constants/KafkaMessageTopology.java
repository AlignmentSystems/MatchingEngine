package com.alignmentsystems.library.constants;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	21st September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	KafkaMessageTopology
 *	Description		:
 *****************************************************************************/

import java.util.List;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 * Note - Kafka Topic Names are all represented in UPPER CASE using the UK locale.
 */
public class KafkaMessageTopology {
		public final static  String MESSAGE_FILL = "fill".toUpperCase(Constants.LOCALE);
		public final static  String MESSAGE_ACK = "ack".toUpperCase(Constants.LOCALE);
		public final static  String MESSAGE_REJ = "rej".toUpperCase(Constants.LOCALE);

		public final static  List<String> MESSAGESTOBERECEIVEDBYEXCHANGEFIXENGINEFROMMATCHINGENGINE =  List.of(MESSAGE_FILL , MESSAGE_ACK , MESSAGE_REJ);
		public final static String MESSAGETOBERECEIVEDBYMULTICASTSERVERFROMMATCHINGENGINE = "mdOUT".toUpperCase(Constants.LOCALE);

}
