package com.alignmentsystems.library.interfaces;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	InterfaceMatch
 *	Description		:
 *****************************************************************************/
import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.fix44.field.Side;
import com.alignmentsystems.library.annotations.Experimental;
import com.alignmentsystems.library.exceptions.RepresentationSBENotAvailable;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceMatch {
	public OffsetDateTime getTimestamp();
	public Long getMatchQuantity();
	public Long getMatchPrice();
	public InterfaceOrder getBuyOrder();
	public InterfaceOrder getSellOrder();
	public Side getAggressorSide();
	public UUID getBuyClOrdId();
	public UUID getSellClOrdId();
	public UUID getBuyOrderId();
	public UUID getSellOrderId();
	public UUID getMatchId();
	public void setMatchId(UUID matchID);
	public Boolean getIsEligibleForMarketData();
	@Experimental
	public byte[] getSBERepresentation(Long sequenceNumber);
	public byte[] getSOFHRepresentation() throws RepresentationSBENotAvailable;
}