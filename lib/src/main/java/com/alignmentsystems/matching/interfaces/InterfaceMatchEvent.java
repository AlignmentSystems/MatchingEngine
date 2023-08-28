package com.alignmentsystems.matching.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatchEvent
 *	Description		:
 *****************************************************************************/

import com.alignmentsystems.matching.Match;

public interface InterfaceMatchEvent {
	public void matchHappened(Match match);

}
