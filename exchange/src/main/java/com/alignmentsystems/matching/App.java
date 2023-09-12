package com.alignmentsystems.matching;

import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.LibraryFunctions;
 
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
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class App {
	
	public static void main(String[] args) {		
		InstanceType instanceType = LibraryFunctions.getInstanceActor(args);
		
		InstanceWrapper wrapper = new InstanceWrapper();
		wrapper.initialise(instanceType);
	} 
}