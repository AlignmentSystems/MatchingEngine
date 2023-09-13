package com.alignmentsystems.library;
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
import com.alignmentsystems.library.annotations.Experimental;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.exceptions.RepresentationSBENotAvailable;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.sbe.SimpleBinaryEncodingMessage;
import com.alignmentsystems.library.sbe.SimpleOpenFramingHeaderMessage;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class Match implements InterfaceMatch {
	private Long matchQuantity = 0L;
	private Long matchPrice = 0L;
	private InterfaceOrder buyOrder = null;
	private InterfaceOrder sellOrder = null;
	private Side aggressorSide = null;
	private OffsetDateTime timestamp = null;
	private UUID buyClOrdId = null;
	private UUID sellClOrdId = null;
	private UUID buyOrderId = null;
	private UUID sellOrderId = null;	
	private UUID matchId = null;
	private Boolean isEligibleForMarketData = Boolean.FALSE;
	private byte[] innerSBERepresentation = null;
	private byte[] innerSOFHRepresentation = null;
	private SimpleBinaryEncodingMessage sbe = null;
	
	
	public Match() {		
	}


	public Match(
			Long matchQuantity
			, Long matchPrice
			, InterfaceOrder buyOrder
			, InterfaceOrder sellOrder
			, Side aggressorSide
			, OffsetDateTime timestamp
			, UUID buyClOrdId 
			, UUID sellClOrdId
			, UUID buyOrderId
			, UUID sellOrderId
			, Boolean getIsEligibleForMarketData
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
		this.isEligibleForMarketData = getIsEligibleForMarketData;
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
				.append(", isEligibleForMarketData=")
				.append(this.isEligibleForMarketData) 
				.append( "]")
				.toString()
				;
	}

	@Override
	public Long getMatchQuantity() {
		return this.matchQuantity;
	}

	@Override
	public Long getMatchPrice() {
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
	public UUID getBuyClOrdId() {
		return this.buyClOrdId;
	}

	@Override
	public UUID getSellClOrdId() {
		return this.sellClOrdId;
	}

	@Override
	public UUID getBuyOrderId() {
		return this.buyOrderId;
	}

	@Override
	public UUID getSellOrderId() {
		return this.sellOrderId;
	}

	@Override
	public UUID getMatchId() {
		return this.matchId;
	}
	@Override
	public  void setMatchId(UUID matchID) {
		this.matchId = matchID;
	}
	@Override
	public Boolean getIsEligibleForMarketData() {
		return this.isEligibleForMarketData;
	}

	@Override
	@Experimental
	public byte[] getSBERepresentation(Long sequenceNumber) {

		if (innerSBERepresentation==null) {
			sbe = new SimpleBinaryEncodingMessage(sequenceNumber);
			sbe.setMessage(this);
			Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
			this.innerSBERepresentation = sbe.getByteArray(encoding);
			return this.innerSBERepresentation;
		}else {
			return this.innerSBERepresentation;
		}
	}

	@Override
	public byte[] getSOFHRepresentation() throws RepresentationSBENotAvailable{
		if (innerSOFHRepresentation==null) {
			throw new RepresentationSBENotAvailable("SBE Representation not available. Call getSBERepresentation(Long sequenceNumber) first");
		}
		
		SimpleOpenFramingHeaderMessage sofh = new SimpleOpenFramingHeaderMessage(this.sbe);
		return sofh.getSOFHWrappedSBEMessage();
	}
}