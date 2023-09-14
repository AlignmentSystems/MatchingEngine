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

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.enumerations.InstanceType;


/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class App {
	private final static String LOGBACKLOGNAME = "log.name";

	public static void main(String[] args) {		
		InstanceType instanceType = LibraryFunctions.getInstanceType(args);
		System.setProperty(LOGBACKLOGNAME, instanceType.type);

		ClientInstanceWrapper wrapper = new ClientInstanceWrapper();
		wrapper.initialise(instanceType);
	} 
}