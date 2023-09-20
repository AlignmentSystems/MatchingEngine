package com.alignmentsystems.library.interfaces;

import com.alignmentsystems.library.AlignmentKafkaSender;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	20th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOrderSender
 *	Description		:
 *****************************************************************************/

public interface InterfaceOrderSender {
	public void send(AlignmentKafkaSender sender); 
}
