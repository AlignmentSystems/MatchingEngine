package com.alignmentsystems.library.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Encodings
 *	Description		:
 *****************************************************************************/

import java.nio.ByteOrder;
import java.util.HashMap;

import com.alignmentsystems.library.datatypes.NameAndAssociatedShortID;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum Encodings {	
	FIXSBEBIGENDIAN((short)0x5BE0, ByteOrder.BIG_ENDIAN),
	FIXSBELITTLEENDIAN((short)0xEB50 , ByteOrder.LITTLE_ENDIAN),
	FIXGPB((short)0x4700 , ByteOrder.LITTLE_ENDIAN),
	FIXASN1PER((short)0xA500 , ByteOrder.LITTLE_ENDIAN),
	FIXASN1BER((short)0xA501 , ByteOrder.LITTLE_ENDIAN),
	FIXASN1OER((short)0xA502 , ByteOrder.LITTLE_ENDIAN),
	FIXTV((short)0xF000 , ByteOrder.LITTLE_ENDIAN),
	FIXML((short)0xF100 , ByteOrder.LITTLE_ENDIAN),
	FIXFAST((short)0xFA00 , ByteOrder.LITTLE_ENDIAN),
	FIXJSON((short)0xF500 , ByteOrder.LITTLE_ENDIAN),
	FIXBSON((short)0xFB00, ByteOrder.LITTLE_ENDIAN);

	private HashMap<Short, NameAndAssociatedShortID> nameAndID = new HashMap<>();
	private final short FieldNumber;
	private final ByteOrder byteOrder;


	/**
	 * @author john.greenan
	 * @param FieldNumber
	 */
	Encodings(short FieldNumber, ByteOrder byteOrder) {
		this.FieldNumber= FieldNumber;
		this.byteOrder = byteOrder;
		nameAndID.put(FieldNumber, new NameAndAssociatedShortID(FieldNumber, name()));
	}

	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @return
	 */
	public ByteOrder getByteOrder() {
		return this.byteOrder;
	}



	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @param messageID short 
	 * @return ByteOrder
	 */
	public ByteOrder getByteOrderForID(short messageID) {
		ByteOrder retVal = ByteOrder.LITTLE_ENDIAN;

		for  (Encodings enc : Encodings.values()) {
			if (messageID == enc.FieldNumber ) {
				retVal = enc.byteOrder;
				break;
			}
		}
		return retVal;

	}

	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @return
	 */
	public short getEncodingValue() {
		return this.FieldNumber;
	}

	
	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @return
	 */
	public String getEncodingAsString() {
		return Integer.toHexString(this.FieldNumber).substring(4);
	}

	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @param messageID
	 * @return
	 */
	public String getNameForID(short messageID) {
		return nameAndID.get(messageID).getMessageName();		
	}	

	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @param encoding
	 * @return
	 */
	public ByteOrder getByteOrderFromSBEEncoding(Encodings encoding) {
		ByteOrder retVal = ByteOrder.LITTLE_ENDIAN; 
		for  (Encodings enc : Encodings.values()) {
			if (encoding == enc) {
				retVal = enc.byteOrder;
				break;
			}
		}
		return retVal;
	}


	/**
	 * 
	 * @author <a href="mailto:john.greenan@alignment-systems.com">John Greenan</a>
	 * @param messageID
	 * @return
	 */
	public Encodings getEnumForID(short messageID) {
		Encodings retVal = Encodings.FIXTV; 
		for  (Encodings enc : Encodings.values()) {
			if (messageID == enc.FieldNumber ) {
				retVal = enc;
				break;
			}
		}
		return retVal;
	}
}