package com.alignmentsystems.library.constants;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	FailureConditionConstants
 *	Description		:
 *****************************************************************************/
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class FailureConditionConstants {
	private final static int FIX_BASE_MEMBER = 666;
	public final static int ERROR_MEMBER_FIX_PROPERTIES_FILE = FIX_BASE_MEMBER + 1;
	public final static int ERROR_MEMBER_FIX_PROPERTIES = FIX_BASE_MEMBER + 2; 
	public final static int ERROR_MEMBER_FIX_APPLICATION = FIX_BASE_MEMBER + 3;

	private final static int FIX_BASE_EXCHANGE = 2666;
	public final static int ERROR_EXCHANGE_FIX_PROPERTIES_FILE = FIX_BASE_EXCHANGE + 1;
	public final static int ERROR_EXCHANGE_FIX_PROPERTIES = FIX_BASE_EXCHANGE + 2; 
	public final static int ERROR_EXCHANGE_FIX_APPLICATION = FIX_BASE_EXCHANGE + 3;
	
	private final static int KAFKA_PROPERTIES_BASE_MEMBER = 3666;
	public final static int KAFKA_ERROR_PROPERTIES_FILE = KAFKA_PROPERTIES_BASE_MEMBER + 1;
	
	private final static int INSTANCE_WRAPPER_BASE_MEMBER = 4666;
	public final static int INSTANCE_WRAPPER_INITIALISATION_ERROR = INSTANCE_WRAPPER_BASE_MEMBER + 1;
}
