package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatchTrade
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;

import com.alignmentsystems.fix44.field.Side;

public interface InterfaceMatchTrade {
public OffsetDateTime getTimestamp();
public Double getMatchQuantity();
public Double getMatchPrice();
public InterfaceOrder getBuyOrder();
public InterfaceOrder getSellOrder();
public Side getAggressorSide();
public String getBuyClOrdId();
public String getSellClOrdId();
}
