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

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

public class Match implements InterfaceMatchTrade {
	private Double matchQuantity = 0d;
	private Double matchPrice = 0d;
	private InterfaceOrder buyOrder = null;
	private InterfaceOrder sellOrder = null;
	private Side aggressorSide = null;
	private OffsetDateTime timestamp = null;
	private String buyClOrdId = null;
	private String sellClOrdId = null;
	
	
	public Match(
			Double matchQuantity
			, Double matchPrice
			, InterfaceOrder buyOrder
			, InterfaceOrder sellOrder
			, Side aggressorSide
			, OffsetDateTime timestamp
			, String buyClOrdId 
			, String sellClOrdId
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



	}



	@Override
	public String toString() {
		return new StringBuilder().append("Match [matchQuantity=")
				.append(Double.toString(this.matchQuantity))
				.append(", matchPrice=")
				.append(Double.toString(this.matchPrice))
				.append(", buyOrder=")
				.append(this.buyOrder)
				.append(", sellOrder=")
				.append(this.sellOrder)
				.append(", aggressorSide=")
				.append(this.aggressorSide)
				.append( "]")
				.toString()
				;
	}



	public Match() {
		// TODO Auto-generated constructor stub
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
}