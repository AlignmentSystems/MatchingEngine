package com.alignmentsystems.shaman;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	28th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	App
 *	Description		:
 *****************************************************************************/


import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.AlignmentFunctions;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class App {
	private final static String LOGBACKLOGNAME = "log.name";

	public static void main(String[] args) {		
		InstanceType instanceType = AlignmentFunctions.getInstanceType(args);
		System.setProperty(LOGBACKLOGNAME, instanceType.type);
		
		ShamanWrapper wrapper = new ShamanWrapper();
		wrapper.initialise(instanceType);
	} 
}