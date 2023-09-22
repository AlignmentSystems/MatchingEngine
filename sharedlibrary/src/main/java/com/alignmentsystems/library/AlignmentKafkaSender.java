package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	19th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentKafkaSender
 *	Description		:
 *****************************************************************************/

import com.alignmentsystems.library.interfaces.InterfaceKafkaSender;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentKafkaSender implements InterfaceKafkaSender{
	private byte[] binaryMessage = null;
	private String topic = null;
	private String key = null;

	@Override
	public byte[] getBinaryMessage() {
		return this.binaryMessage;
	}
	
	
	@Override
	public void initialise(byte[] binaryMessage, String topic, String key) {
		this.binaryMessage = binaryMessage;
		this.topic= topic;
		this.key= key;
	}

	@Override
	public String getTopic() {
		return this.topic;
	}

	@Override
	public String getKey() {
		return this.key;
	}
}