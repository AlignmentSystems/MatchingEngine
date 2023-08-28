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

import com.alignmentsystems.matching.Match;

public interface MatchEvent {
	public void matchHappened(Match match);
}
