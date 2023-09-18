package com.alignmentsystems.library;
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
	private static HashMap<Character , Short> memberSideCodeToExchangeSideCodeMap = new HashMap<Character , Short>();
	private static HashMap<String , Short> memberMessageTypeToExchangeMessageTypeMap = new HashMap<String, Short>();
	private static HashMap<Character , Short> memberTimeInForceToExchangeTimeInForceMap = new HashMap<Character, Short>();

	private static HashMap<Character , Short> memberExecTypeToExchangeExecTypeMap = new HashMap<Character, Short>();
	private static HashMap<Character , Short> memberOrdStatusToExchangeOrdStatusMap = new HashMap<Character, Short>();


	private static HashMap<Long , String> exchangeIdToMemberFIXSenderCompIdMap = new HashMap<Long , String>();
	private static HashMap<Long , String> exchangeIdToMemberFIXTargetCompIdMap = new HashMap<Long , String>();
	private static HashMap<Long , String> exchangeInstrumentIdToMemberInstrumentIdMap = new HashMap<Long , String>();
	private static HashMap<Short , Character> exchangeSideCodeToMemberSideCodeMap = new HashMap<Short , Character>();
	private static HashMap<Short , String > exchangeMessageTypeToMemberMessageTypeMap = new HashMap<Short , String>();
	private static HashMap<Short , Character  > exchangeTimeInForceToMemberTimeInForceMap = new HashMap<Short , Character>();

	private static HashMap<Short , Character  > exchangeExecTypeToExecTypeMap = new HashMap<Short , Character>();
	private static HashMap<Short , Character  > exchangeOrdStatusToMemberOrdStatusMap = new HashMap<Short , Character>();



	private static AtomicBoolean initialised = new AtomicBoolean(false);
	public final static Short EXCHANGEMESSAGETYPEMAPPEDFROMEXECUTIONREPORT = getExchangeMessageTypeMappedFromMemberMessageType("8");
	public final static Short EXCHANGEMESSAGETYPEMAPPEDFROMNEWORDERSINGLE = getExchangeMessageTypeMappedFromMemberMessageType("D");
	public final static Short EXCHANGEORDSTATUSNEW = memberOrdStatusToExchangeOrdStatusMap.get("0".charAt(0));
	public final static Short EXCHANGEEXECTYPENEW = memberExecTypeToExchangeExecTypeMap.get("0".charAt(0));

	public final static Short EXCHANGEORDSTATUSFILLED = memberOrdStatusToExchangeOrdStatusMap.get("2".charAt(0));
	public final static Short EXCHANGEEXECTYPETRADE = memberExecTypeToExchangeExecTypeMap.get("F".charAt(0));

	public final static Short EXCHANGESIDEBUY = memberSideCodeToExchangeSideCodeMap.get(Integer.toString(1).charAt(0));
	public final static Short EXCHANGESIDESELL = memberSideCodeToExchangeSideCodeMap.get(Integer.toString(2).charAt(0));






	public DataMapper(){
		initialise();


	}

	private static void initialise() {
		if(!initialised.get()) {
			loadFIXSenderCompIdToExchangeId();
			loadFIXTargetCompIdToExchangeId();
			loadInstrumentIdToExchangeInstrumentId();
			loadMemberSideCodeToExchangeSideCode();
			loadMemberMessageTypeToExchangeMessageType();
			loadmemberTimeInForceToExchangeTimeInForce();
			loadExecTypeToExchangeId();
			loadMemberOrdStatusToExchangeOrdStatus();
			initialised.set(true);
		}
	}	



	private static void addMemberSideCodeToExchangeSideCode(Short exchangeId , Character memberId) {
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

	private static void addmemberExecTypeToExchangeExecTypeMap(Short exchangeId , Character memberId) {
		memberExecTypeToExchangeExecTypeMap.put(memberId, exchangeId);
		exchangeExecTypeToExecTypeMap.put(exchangeId, memberId);
	}


	private static void loadMemberOrdStatusToExchangeOrdStatus() {
		Short id = 0;

		addMemberOrdStatusToExchangeOrdStatusMap(id++,"0".charAt(0));//New
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"1".charAt(0));//Partially filled
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"2".charAt(0));//Filled
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"3".charAt(0));//Done for day
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"4".charAt(0));//Canceled
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"5".charAt(0));//Replaced (No longer used)
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"6".charAt(0));//Pending Cancel (i.e. result of Order Cancel Request)
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"7".charAt(0));//Stopped
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"8".charAt(0));//Rejected
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"9".charAt(0));//Suspended
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"A".charAt(0));//Pending New
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"B".charAt(0));//Calculated
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"C".charAt(0));//Expired
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"D".charAt(0));//Accepted for Bidding
		addMemberOrdStatusToExchangeOrdStatusMap(id++,"E".charAt(0));//Pending Replace (i.e. result of Order Cancel/Replace Request)
	}

	private static void addMemberOrdStatusToExchangeOrdStatusMap(Short exchangeOrdStatus , Character memberOrdStatus ) {
		memberOrdStatusToExchangeOrdStatusMap.put(memberOrdStatus, exchangeOrdStatus);
		exchangeOrdStatusToMemberOrdStatusMap.put(exchangeOrdStatus, memberOrdStatus);
	}



	//	setField(ordStatus);
	private static void loadExecTypeToExchangeId() {
		Short id = 0;
		addmemberExecTypeToExchangeExecTypeMap(id++,"0".charAt(0));//New
		addmemberExecTypeToExchangeExecTypeMap(id++,"3".charAt(0));//Done for day
		addmemberExecTypeToExchangeExecTypeMap(id++,"4".charAt(0));//Canceled
		addmemberExecTypeToExchangeExecTypeMap(id++,"5".charAt(0));//Replaced
		addmemberExecTypeToExchangeExecTypeMap(id++,"6".charAt(0));//Pending Cancel
		addmemberExecTypeToExchangeExecTypeMap(id++,"7".charAt(0));//Stopped
		addmemberExecTypeToExchangeExecTypeMap(id++,"8".charAt(0));//Rejected
		addmemberExecTypeToExchangeExecTypeMap(id++,"9".charAt(0));//Suspended
		addmemberExecTypeToExchangeExecTypeMap(id++,"A".charAt(0));//Pending New
		addmemberExecTypeToExchangeExecTypeMap(id++,"B".charAt(0));//Calculated
		addmemberExecTypeToExchangeExecTypeMap(id++,"C".charAt(0));//Expired
		addmemberExecTypeToExchangeExecTypeMap(id++,"D".charAt(0));//Restated
		addmemberExecTypeToExchangeExecTypeMap(id++,"E".charAt(0));//Pending Replace (e.g. result of Order Cancel/Replace Request)
		addmemberExecTypeToExchangeExecTypeMap(id++,"F".charAt(0));//Trade (partial fill or fill)
		addmemberExecTypeToExchangeExecTypeMap(id++,"G".charAt(0));//Trade Correct
		addmemberExecTypeToExchangeExecTypeMap(id++,"H".charAt(0));//Trade Cancel
		addmemberExecTypeToExchangeExecTypeMap(id++,"I".charAt(0));//Order Status
		addmemberExecTypeToExchangeExecTypeMap(id++,"J".charAt(0));//Trade in a Clearing Hold
		addmemberExecTypeToExchangeExecTypeMap(id++,"J".charAt(0));//Trade has been released to Clearing
		addmemberExecTypeToExchangeExecTypeMap(id++,"L".charAt(0));//Triggered or Activated by System
		addmemberExecTypeToExchangeExecTypeMap(id++,"M".charAt(0));//Locked
		addmemberExecTypeToExchangeExecTypeMap(id++,"N".charAt(0));//Released
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


	private static void loadmemberTimeInForceToExchangeTimeInForce() {
		Short id = 0;
		addMemberTimeInForceToExchangeTimeInForce(id++,"0".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"1".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"2".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"3".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"4".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"5".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"6".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"7".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"8".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"9".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"A".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"B".charAt(0));
		addMemberTimeInForceToExchangeTimeInForce(id++,"C".charAt(0));
	}




	private static void addMemberTimeInForceToExchangeTimeInForce(Short exchangeTimeInForce , Character memberTimeInForce ) {
		memberTimeInForceToExchangeTimeInForceMap.put(memberTimeInForce, exchangeTimeInForce);
		exchangeTimeInForceToMemberTimeInForceMap.put(exchangeTimeInForce, memberTimeInForce);
	}







	private static void loadMemberMessageTypeToExchangeMessageType() {
		Short id = 0;

		addMemberMessageTypeToExchangeMessageType(	id++,	"0"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"1"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"2"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"3"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"4"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"5"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"6"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"7"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"8"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"9"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"A"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"B"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"C"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"D"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"E"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"F"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"G"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"H"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"J"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"K"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"L"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"M"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"N"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"P"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"Q"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"R"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"S"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"T"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"V"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"W"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"X"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"Y"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"Z"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"i"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"o"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"u"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AA"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AB"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AC"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AD"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AE"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AF"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AG"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AH"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AI"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AJ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AK"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AL"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AM"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AN"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AO"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AP"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AQ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AR"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AS"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AT"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AU"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AV"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AW"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AX"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AY"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"AZ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BA"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BB"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BC"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BD"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BE"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BF"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BG"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BH"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BO"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BP"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BK"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BL"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BM"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BN"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BJ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BI"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BQ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BR"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BS"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BT"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BU"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BV"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BW"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BX"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BY"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"BZ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CA"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CB"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CC"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CD"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CE"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CF"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CG"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CH"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CI"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CJ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CK"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CL"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CM"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CN"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CO"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CQ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CR"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CS"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CT"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CU"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CV"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CW"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CX"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CY"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"CZ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DA"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DB"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DC"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DD"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DE"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DF"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DG"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DH"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DI"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DJ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DK"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DL"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DM"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DN"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DO"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DP"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DQ"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DR"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DS"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DT"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DU"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DV"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DW"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DX"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"EA"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"EB"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DY"	);
		addMemberMessageTypeToExchangeMessageType(	id++,	"DZ"	);
	}


	private static void addMemberMessageTypeToExchangeMessageType(Short exchangeId, String memberId) {
		memberMessageTypeToExchangeMessageTypeMap.put(memberId, exchangeId);
		exchangeMessageTypeToMemberMessageTypeMap.put(exchangeId, memberId);
	}




	public static Short getExchangeMessageTypeMappedFromMemberMessageType( String memberMessageType) {
		if (!initialised.get()) {
			initialise();
		}
		return memberMessageTypeToExchangeMessageTypeMap.get(memberMessageType);
	};

	public static String getMemberMessageTypeMappedFromExchangeMessageType( Short exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeMessageTypeToMemberMessageTypeMap.get(exchangeId);
	};





	private static void loadInstrumentIdToExchangeInstrumentId() {
		final String badgerW = "BADGER.W";
		Long added = Long.MAX_VALUE;
		addInstrumentIdToExchangeInstrumentId(added, badgerW);
		added--;			
	}

	private static void loadMemberSideCodeToExchangeSideCode() {
		Short added = 0;

		addMemberSideCodeToExchangeSideCode(added, Integer.toString(1).charAt(0));//Buy
		added++;

		addMemberSideCodeToExchangeSideCode(added, Integer.toString(2).charAt(0));//Sell
		added++;

		//call addMemberSideCodeToExchangeSideCode(added, Integer.toString(1));
		//here as required...	

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

	public static Character getMemberSideCodeMappedFromExchangeSideCode(Short exchangeId) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeSideCodeToMemberSideCodeMap.get(exchangeId);
	}

	public static Short getExchangeSideCodeMappedFromMemberSideCode(Character  sideCode) {
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

	public static Short getMemberTimeInForceMappedToExchangeTimeInForce (char memberTimeInForce) {
		if (!initialised.get()) {
			initialise();
		}
		return memberTimeInForceToExchangeTimeInForceMap.get(memberTimeInForce);
	}


	public static char getExchangeTimeInForceMappedToMemberTimeInForce(Short exchangeTimeInForce) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeTimeInForceToMemberTimeInForceMap.get( exchangeTimeInForce);
	}


	public static Short getExchangeExecTypeMappedFromMemberExecType (char memberExecType) {
		if (!initialised.get()) {
			initialise();
		}
		return memberExecTypeToExchangeExecTypeMap.get(memberExecType);
	}


	public static char getMemberExecTypeMappedFromExchangeExecType(Short exchangeExecType) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeExecTypeToExecTypeMap.get(exchangeExecType);
	}


	

	public static Short getExchangeOrdStatusMappedToMemberOrdStatus (char memberOrdStatus) {
		if (!initialised.get()) {
			initialise();
		}
		
		return memberOrdStatusToExchangeOrdStatusMap.get(memberOrdStatus);
		
		
	}


	public static char getMemberOrdStatusMappedToExchangeOrdStatus(Short exchangeOrdStatus) {
		if (!initialised.get()) {
			initialise();
		}
		return exchangeOrdStatusToMemberOrdStatusMap.get(exchangeOrdStatus);
		
	}

	
	


}