package com.alignmentsystems.library.interfaces;

import java.time.OffsetDateTime;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	22nd September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceKillDetail
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceKillDetail {
	public String getSenderCompId(); 
	public String getTargetCompId(); 
	public String getKillString();
	public OffsetDateTime getTimestamp();
}