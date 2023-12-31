package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentApp
 *	Description		:
 *****************************************************************************/
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.InstanceType;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentApp {
	private final static String LOGBACKLOGNAME = "log.name";
	public static void main(String[] args) {

		InstanceType instanceType = AlignmentFunctions.getInstanceType(args);
		System.setProperty(LOGBACKLOGNAME, instanceType.type);

		AlignmentInstanceWrapper wrapper = new AlignmentInstanceWrapper();
		if (wrapper.initialise(instanceType)) {
			System.exit(FailureConditionConstants.INSTANCE_WRAPPER_INITIALISATION_ERROR);
		};
	}
}