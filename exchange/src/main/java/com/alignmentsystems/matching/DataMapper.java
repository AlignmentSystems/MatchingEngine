package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	13th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	DataMapper
 *	Description		:
 *****************************************************************************/
import java.util.HashMap;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class DataMapper {
	private HashMap<String, Long> memberFIXSenderCompIdToExchangeIdMap = new HashMap<String, Long>();
	private HashMap<String, Long> memberInstrumentIdToExchangeInstrumentIdMap = new HashMap<String, Long>();

	protected HashMap<String, Long> getMemberFIXSenderCompIdToExchangeIdMap() {
		return memberFIXSenderCompIdToExchangeIdMap;
	}

	protected HashMap<String, Long> getMemberInstrumentIdToExchangeInstrumentIdMap() {
		return memberInstrumentIdToExchangeInstrumentIdMap;
	}
	
	public DataMapper() {
		Long added = Long.MIN_VALUE;
		memberFIXSenderCompIdToExchangeIdMap.put("MEMBER_A", added);
		added++;
		memberFIXSenderCompIdToExchangeIdMap.put("MEMBER_B", added);
		added++;
		memberFIXSenderCompIdToExchangeIdMap.put("EXCHANGE", added);
			
		
		memberInstrumentIdToExchangeInstrumentIdMap.put("Badger.W", Long.MAX_VALUE);
		
	}

}
