package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOperationEvent
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOperationEvent {
	void OperationEventHappened(InterfaceOperationEventInner inner);
}
