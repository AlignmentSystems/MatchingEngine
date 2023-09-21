package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceOperationEventInner
 *	Description		:
 *****************************************************************************/

import com.alignmentsystems.library.enumerations.OperationEventType;
import com.alignmentsystems.library.enumerations.RecordType;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceOperationEventInner {
	public void setEventMethodName(String methodName);
	public String getEventMethodName();
	public OperationEventType getOperationEventType();
	public void setOperationEventType(OperationEventType operationEventType);
	public RecordType getRecordType();
	public void setEventStatusCategory(RecordType recordType);
}
