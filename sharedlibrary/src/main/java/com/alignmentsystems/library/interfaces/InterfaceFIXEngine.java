package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	20th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceFIXEngine
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;

import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.enumerations.InstanceType;

public interface InterfaceFIXEngine {
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger, InstanceType instanceType) throws FileNotFoundException , NullPointerException;
}
