package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	EventStatusCategory
 * 
 *****************************************************************************/

import com.alignmentsystems.matching.enumerations.EventStatusCategory;
import com.alignmentsystems.matching.enumerations.OperationEventType;

public interface InterfaceOperationEventInner {
	public void setEventMethodName(String methodName);
	public String getEventMethodName();
	public OperationEventType getOperationEventType();
	public void setOperationEventType(OperationEventType operationEventType);
	public EventStatusCategory getEventStatusCategory();
	public void setEventStatusCategory(EventStatusCategory eventStatusCategory);
}
