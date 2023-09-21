package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	19th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceKafkaSender
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public abstract interface InterfaceKafkaSender {
	/**
	 * 
	 * @param binaryMessage
	 * @param topic
	 * @param key
	 */
	public abstract void initialise(byte[] binaryMessage, String topic, String key) ;
	/**
	 * 
	 * @return
	 */
	public abstract byte[] getBinaryMessage();
	/**
	 * 
	 * @return
	 */
	public abstract String getTopic() ;
	/**
	 * 
	 * @return
	 */
	public abstract String getKey() ;
}
