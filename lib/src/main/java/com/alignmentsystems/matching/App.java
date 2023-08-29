package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	App
 *	Description		:
 *****************************************************************************/

public class App {
	
	public static void main(String[] args) {		
		MatchingEngineWrapper wrapper = new MatchingEngineWrapper(args);
		wrapper.Initialise();
	} 
}