package com.alignmentsystems.matching.datatypes;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	NameAndAssociatedShortID
 *	Description		:
 *****************************************************************************/


/**
 * 
 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
 *
 */
public class NameAndAssociatedShortID {
	private final short ID;
	private final String Name;

	/**
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @param ID
	 * @param Name
	 */
	public NameAndAssociatedShortID(short ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}
	/**
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @return
	 */
	public String getMessageName() {
		return this.Name;
	}

	/**
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @return
	 */
	public short getID() {
		return this.ID;
	}

}