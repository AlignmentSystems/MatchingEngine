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
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class DataMapper {
	private static HashMap<String , Long> memberFIXSenderCompIdToExchangeIdMap = new HashMap<String, Long>();
	private static HashMap<String , Long> memberFIXTargetCompIdToExchangeIdMap = new HashMap<String, Long>();
	private static HashMap<String , Long> memberInstrumentIdToExchangeInstrumentIdMap = new HashMap<String, Long>();
	private static HashMap<String , Long> memberSideCodeToExchangeSideCodeMap = new HashMap<String, Long>();

	private static HashMap<Long , String> exchangeIdToMemberFIXSenderCompIdMap = new HashMap<Long , String>();
	private static HashMap<Long , String> exchangeIdToMemberFIXTargetCompIdMap = new HashMap<Long , String>();
	private static HashMap<Long , String> exchangeInstrumentIdToMemberInstrumentIdMap = new HashMap<Long , String>();
	private static HashMap<Long , String> exchangeSideCodeToMemberSideCodeMap = new HashMap<Long , String>();
private  static AtomicBoolean initialised = new AtomicBoolean(false);

public DataMapper(){
	initialise();
}

private static void initialise() {
	loadFIXSenderCompIdToExchangeId();
	loadFIXTargetCompIdToExchangeId();
	loadInstrumentIdToExchangeInstrumentId();
	loadMemberSideCodeToExchangeSideCode();
	initialised.set(true);
	
}	
	
	
	
	private static void addMemberSideCodeToExchangeSideCode(Long exchangeId , String memberId) {
		memberSideCodeToExchangeSideCodeMap.put(memberId, exchangeId);
		exchangeSideCodeToMemberSideCodeMap.put(exchangeId, memberId);
	}



	private static void addFIXSenderCompIdToExchangeId(Long exchangeId, String memberId) {
		memberFIXSenderCompIdToExchangeIdMap.put(memberId, exchangeId);
		exchangeIdToMemberFIXSenderCompIdMap.put(exchangeId, memberId);
	}

	private static void addFIXTargetCompIdToExchangeId(Long exchangeId, String memberId) {
		memberFIXTargetCompIdToExchangeIdMap.put(memberId, exchangeId);
		exchangeIdToMemberFIXTargetCompIdMap.put(exchangeId, memberId);
	}

	private static void addInstrumentIdToExchangeInstrumentId(Long exchangeId, String memberId) {
		memberInstrumentIdToExchangeInstrumentIdMap.put(memberId, exchangeId);
		exchangeInstrumentIdToMemberInstrumentIdMap.put(exchangeId, memberId);
	}


	private static void loadFIXSenderCompIdToExchangeId() {
		final String memberA = "MEMBER_A";
		final String memberB = "MEMBER_B";

		Long added = Long.MIN_VALUE;
		addFIXSenderCompIdToExchangeId(added, memberA);

		added++;

		addFIXSenderCompIdToExchangeId(added, memberB);
		added++;

		//call addFIXSenderCompIdToExchangeId(added, memberB); 
		//here as required...

	}
	
	private static void loadFIXTargetCompIdToExchangeId() {
		final String exchange = "EXCHANGE";
		Long added = 0L;
		addFIXTargetCompIdToExchangeId(added, exchange);
		added++;
		//call addFIXTargetCompIdToExchangeId(added, exchange); 
		//here as required...
	}
	
	private static void loadInstrumentIdToExchangeInstrumentId() {
		final String badgerW = "BADGER.W";
		Long added = Long.MAX_VALUE;
		addInstrumentIdToExchangeInstrumentId(added, badgerW);
		added--;			
	}
	
	private static void loadMemberSideCodeToExchangeSideCode() {
		Long added = 0L;
		
		addMemberSideCodeToExchangeSideCode(added, Integer.toString(1));//Buy
		added++;
		
		addMemberSideCodeToExchangeSideCode(added, Integer.toString(2));//Sell
		added++;
		
		//call addMemberSideCodeToExchangeSideCode(added, Integer.toString(1));
		//here as required...	

		//		1	=	Buy
		//		2	=	Sell
		//		3	=	Buy minus
		//		4	=	Sell plus
		//		5	=	Sell short
		//		6	=	Sell short exempt
		//		7	=	Undisclosed
		//		8	=	Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
		//		9	=	Cross short
		//		A	=	Cross short exempt
		//		B	=	As Defined (for use with multileg instruments)
		//		C	=	Opposite (for use with multileg instruments)
		//		D	=	Subscribe (e.g. CIV)
		//		E	=	Redeem (e.g. CIV)
		//		F	=	Lend (FINANCING - identifies direction of collateral)
		//		G	=	Borrow (FINANCING - identifies direction of collateral)
		//		H	=	Sell undisclosed

	}

	public static Long getExchangeIdMappedFromSenderCompID( String sender) {
		if (!initialised.get()) {
			initialise();
		}
		return memberFIXSenderCompIdToExchangeIdMap.get(sender);
	};

	public static Long getExchangeIdMappedFromTargetCompID( String target) {
		if (!initialised.get()) {
			initialise();
		}
		return memberFIXTargetCompIdToExchangeIdMap.get(target);
	};

	public static Long getExchangeIdMappedFromInstrumentId( String symbol) {		
		if (!initialised.get()) {
			initialise();
		}
		return memberInstrumentIdToExchangeInstrumentIdMap.get(symbol);
	};

	public static String getMemberFIXSenderCompIdMappedFromExchangeId(Long exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeIdToMemberFIXSenderCompIdMap.get(exchangeId);
	}

	public static String getMemberSideCodeMappedFromExchangeSideCode(Long exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeSideCodeToMemberSideCodeMap.get(exchangeId);
	}
	
	public static Long getExchangeSideCodeMappedFromMemberSideCode(String  sideCode) {
		if (!initialised.get()) {
			initialise();
		}
		return memberSideCodeToExchangeSideCodeMap.get(sideCode);
	}
	
	public static String getMemberFIXTargetCompIdMappedFromExchangeId(Long exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeIdToMemberFIXTargetCompIdMap.get(exchangeId);
	}

	public static String getMemberInstrumentIdMappedFromExchangeInstrumentId(Long exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeInstrumentIdToMemberInstrumentIdMap.get(exchangeId);
	}
}