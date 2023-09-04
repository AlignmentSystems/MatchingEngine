package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Match
 *	Description		:
 *****************************************************************************/

import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.annotations.Experimental;
import com.alignmentsystems.matching.enumerations.Encodings;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.sbe.SimpleBinaryEncodingMessage;

public class Match implements InterfaceMatchTrade {
	private Double matchQuantity = 0d;
	private Double matchPrice = 0d;
	private InterfaceOrder buyOrder = null;
	private InterfaceOrder sellOrder = null;
	private Side aggressorSide = null;
	private OffsetDateTime timestamp = null;
	private String buyClOrdId = null;
	private String sellClOrdId = null;
	private String buyOrderId = null;
	private String sellOrderId = null;	
	private UUID matchId = null;


	public Match() {		
	}
	/**
	 * 
	 * @param matchQuantity
	 * @param matchPrice
	 * @param buyOrder
	 * @param sellOrder
	 * @param aggressorSide
	 * @param timestamp
	 * @param buyClOrdId
	 * @param sellClOrdId
	 * @param buyOrderId
	 * @param sellOrderId
	 */
	public Match(
			Double matchQuantity
			, Double matchPrice
			, InterfaceOrder buyOrder
			, InterfaceOrder sellOrder
			, Side aggressorSide
			, OffsetDateTime timestamp
			, String buyClOrdId 
			, String sellClOrdId
			, String buyOrderId
			, String sellOrderId
			, UUID matchId
			) {
		super();
		this.matchQuantity = matchQuantity;
		this.matchPrice = matchPrice;
		this.buyOrder = buyOrder;
		this.sellOrder = sellOrder;
		this.aggressorSide = aggressorSide;
		this.timestamp = timestamp;
		this.buyClOrdId = buyClOrdId;
		this.sellClOrdId = sellClOrdId;
		this.buyOrderId = buyOrderId;
		this.sellOrderId = sellOrderId;
		this.matchId = matchId;
	}

	public Match(
			Double matchQuantity
			, Double matchPrice
			, InterfaceOrder buyOrder
			, InterfaceOrder sellOrder
			, Side aggressorSide
			, OffsetDateTime timestamp
			, String buyClOrdId 
			, String sellClOrdId
			, String buyOrderId
			, String sellOrderId
			) {
		super();
		this.matchQuantity = matchQuantity;
		this.matchPrice = matchPrice;
		this.buyOrder = buyOrder;
		this.sellOrder = sellOrder;
		this.aggressorSide = aggressorSide;
		this.timestamp = timestamp;
		this.buyClOrdId = buyClOrdId;
		this.sellClOrdId = sellClOrdId;
		this.buyOrderId = buyOrderId;
		this.sellOrderId = sellOrderId;
		this.matchId = UUID.randomUUID();		
	}



	
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("Match [matchQuantity=")
				.append(Double.toString(this.matchQuantity))
				.append(", matchPrice=")
				.append(Double.toString(this.matchPrice))
				.append(", matchId=")
				.append(this.matchId)
				.append(", buyOrder=")
				.append(this.buyOrder)
				.append(", sellOrder=")
				.append(this.sellOrder)
				.append(", aggressorSide=")
				.append(this.aggressorSide)
				.append(", buyClOrdId=")
				.append(this.buyClOrdId) 
				.append(", sellClOrdId=")
				.append(this.sellClOrdId) 
				.append(", buyOrderId=")
				.append(this.buyOrderId) 
				.append(", sellOrderId=")
				.append(this.sellOrderId) 
				.append( "]")
				.toString()
				;
	}

	@Override
	public Double getMatchQuantity() {
		return this.matchQuantity;
	}

	@Override
	public Double getMatchPrice() {
		return this.matchPrice;
	}

	@Override
	public InterfaceOrder getBuyOrder() {
		return this.buyOrder;
	}

	@Override
	public InterfaceOrder getSellOrder() {
		return this.sellOrder;
	}

	@Override
	public Side getAggressorSide() {
		return this.aggressorSide;
	}

	@Override
	public OffsetDateTime getTimestamp() {
		return this.timestamp;
	}

	@Override
	public String getBuyClOrdId() {
		return this.buyClOrdId;
	}

	@Override
	public String getSellClOrdId() {
		return this.sellClOrdId;
	}

	@Override
	public String getBuyOrderId() {
		return this.buyOrderId;
	}

	@Override
	public String getSellOrderId() {
		return this.sellOrderId;
	}

	@Override
	@Experimental
	public  byte[] getSBERepresentation() {
		SimpleBinaryEncodingMessage sbe = new SimpleBinaryEncodingMessage();
		sbe.setMessage(this);
		Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
		return sbe.getByteArray(encoding);
	}
	@Override
	public UUID getMatchId() {
		return this.matchId;
	}
	@Override
	public  void setMatchId(UUID matchID) {
		this.matchId = matchID;
	}
}