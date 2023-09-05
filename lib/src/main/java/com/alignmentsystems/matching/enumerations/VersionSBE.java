package com.alignmentsystems.matching.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	VersionSBE
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
 *
 */
public enum VersionSBE {
	ONE(1),
	TWO(2);
	public final Integer FieldNumber;
	VersionSBE(Integer FieldNumber) {
		this.FieldNumber= FieldNumber;
	}
}
