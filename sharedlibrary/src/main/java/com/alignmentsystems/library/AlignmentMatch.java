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

import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.OrderBookSide;
import com.alignmentsystems.library.interfaces.InterfaceMatch;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentMatch implements InterfaceMatch {
	final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
	private Long matchQuantity = 0L;
	private Long matchPrice = 0L;
	private OrderBookSide aggressorSide = null;
	private OffsetDateTime timestamp = null;
	private UUID buyClOrdId = null;
	private UUID sellClOrdId = null;
	private UUID buyOrderId = null;
	private UUID sellOrderId = null;
	private Long buyCumQty = null;
	private Long sellCumQty  = null;
	private Long buyOrderQty  = null;
	private Long sellOrderQty  = null;
	private Long buyAvgPx  = null;
	private Long sellAvgPx  = null;
	private Long buyLeavesQty = null;
	private Long sellLeavesQty  = null;

	private String buySenderId = null;
	private String buyTargetId = null;
	private String sellSenderId = null;
	private String sellTargetId = null;	
	private UUID buyExecId = null;
	private UUID sellExecId = null;

	private Short buyOrdStatus  = null;
	private Short buyExecType  = null;

	private Short sellOrdStatus  = null;
	private Short sellExecType  = null;



	private UUID matchId = null;
	private UUID marketDataId = null;
	private Boolean isEligibleForMarketData = Boolean.FALSE;


	public AlignmentMatch(
			Long matchQuantity
			, Long matchPrice
			, OrderBookSide aggressorSide
			, OffsetDateTime timestamp
			, UUID buyClOrdId 
			, UUID sellClOrdId
			, UUID buyOrderId
			, UUID sellOrderId
			, Long buyCumQty
			, Long sellCumQty
			, Long buyOrderQty
			, Long sellOrderQty
			, Long buyAvgPx
			, Long sellAvgPx
			, Long buyLeavesQty 
			, Long sellLeavesQty

			, String buySenderId 
			, String buyTargetId 
			, String sellSenderId
			, String sellTargetId

			, Short buyOrdStatus
			, Short buyExecType

			, Short sellOrdStatus
			, Short sellExecType

			, Boolean getIsEligibleForMarketData
			) {
		super();
		this.matchQuantity = matchQuantity;
		this.matchPrice = matchPrice;
		this.aggressorSide = aggressorSide;
		this.timestamp = timestamp;
		this.buyClOrdId = buyClOrdId;
		this.sellClOrdId = sellClOrdId;
		this.buyOrderId = buyOrderId;
		this.sellOrderId = sellOrderId;
		this.buyCumQty = buyCumQty;
		this.sellCumQty = sellCumQty;
		this.buyOrderQty = buyOrderQty;
		this.sellOrderQty = sellOrderQty;
		this.buyAvgPx = buyAvgPx;
		this.sellAvgPx = sellAvgPx;
		this.buyLeavesQty = buyLeavesQty ;
		this.sellLeavesQty = sellLeavesQty ;

		this.buySenderId = buySenderId;
		this.buyTargetId = buyTargetId; 
		this.sellSenderId = sellSenderId;
		this.sellTargetId = sellTargetId;

		this.buyOrdStatus = buyOrdStatus;
		this.buyExecType = buyExecType;

		this.sellOrdStatus = sellOrdStatus; 
		this.sellExecType = sellExecType; 


		this.isEligibleForMarketData = getIsEligibleForMarketData;

		this.buyExecId = UUID.randomUUID();
		this.sellExecId = UUID.randomUUID();

		this.marketDataId = UUID.randomUUID();
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
				.append(" buyCumQty=")
				.append(this.buyCumQty)
				.append(" sellCumQty=")
				.append(this.sellCumQty) 
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
	public OrderBookSide getAggressorSide() {
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
	public Long getBuyCumQty() {
		return buyCumQty;
	}

	@Override
	public Long getSellCumQty() {
		return sellCumQty;
	}



	@Override
	public Long getBuyOrderQty() {
		return this.buyOrderQty;
	}


	@Override
	public Long getSellOrderQty() {
		return this.sellOrderQty;
	}


	@Override
	public Long getBuyAvgPx() {
		return this.buyAvgPx;
	}


	@Override
	public Long getSellAvgPx() {
		return this.sellAvgPx;
	}

	@Override
	public void setBuyAvgPx(Long avgPx) {
		this.buyAvgPx = avgPx;

	}


	@Override
	public void getSellAvgPx(Long avgPx) {
		this.sellAvgPx = avgPx;

	}


	@Override
	public String getBuySenderId() {
		return this.buySenderId;
	}


	@Override
	public String getBuyTargetId() {
		return this.buyTargetId;
	}


	@Override
	public String getSellSenderId() {
		return this.sellSenderId;
	}


	@Override
	public String getSellTargetId() {
		return this.sellTargetId;
	}





	@Override
	public AlignmentExecutionReport getBuyReport() {
		AlignmentExecutionReport buy = new AlignmentExecutionReport();
		buy.setExecutionReport(
				this.buyExecId
				, this.buyClOrdId
				, this.buyOrderId
				, this.marketDataId
				, this.buySenderId
				, this.buyTargetId
				, this.sellSenderId
				, this.sellTargetId
				, this.timestamp
				, this.matchQuantity
				, this.matchPrice
				, this.buyLeavesQty
				, this.buyCumQty
				, this.buyAvgPx
				, this.buyOrdStatus
				, this.buyExecType
				, AlignmentDataMapper.EXCHANGESIDEBUY
				);
		return buy;
	}


	@Override
	public AlignmentExecutionReport getSellReport() {
		AlignmentExecutionReport sell = new AlignmentExecutionReport();
		sell.setExecutionReport(
				this.buyExecId
				, this.sellClOrdId
				, this.sellOrderId
				, this.marketDataId
				, this.sellSenderId
				, this.sellTargetId
				, this.sellSenderId
				, this.sellTargetId
				, this.timestamp
				, this.matchQuantity
				, this.matchPrice
				, this.sellLeavesQty
				, this.sellCumQty
				, this.sellAvgPx
				, this.sellOrdStatus
				, this.sellExecType
				, AlignmentDataMapper.EXCHANGESIDESELL
				);
		return sell;
	}

	@Override
	public Short getBuyOrdStatus() {
		return this.buyOrdStatus;
	}

	@Override
	public Short getBuyExecType() {
		return this.buyExecType;
	}

	@Override
	public Short getSellOrdStatus() {
		return this.sellOrdStatus;
	}

	@Override
	public Short getSellExecType() {
		return this.sellExecType;
	}





	@Override
	public AlignmentKafkaSender getMarketDataBytesAsSBEInSender() {
		final Short msgType = AlignmentDataMapper.EXCHANGEMESSAGETYPEMATCH;
		final String MARKETDATATOPIC = "MDOUT";

		ByteBuffer buf = null;

		final int bufferLength =
				Short.BYTES//messageType
				+
				Long.BYTES//marketDataId least
				+
				Long.BYTES//marketDataId most
				+
				Long.BYTES//price
				+
				Long.BYTES//quantity
				+
				Long.BYTES //this.timestamp.getEpochSecond
				+
				Integer.BYTES // this.timestamp.getNano()
				;
		try {

			buf = ByteBuffer.allocate(bufferLength).order(AlignmentMatch.encoding.getByteOrder());

			buf.putLong(this.marketDataId.getLeastSignificantBits());
			buf.putLong(this.marketDataId.getMostSignificantBits());
			buf.putLong(this.matchPrice);
			buf.putLong(this.matchQuantity);
			buf.putLong(this.timestamp.toInstant().getEpochSecond());
			buf.putInt(this.timestamp.toInstant().getNano());					
			buf.flip();
			
			
		} catch (Exception e) {
			//this.log.error(e.getMessage() , e);
			throw e;
		}

		AlignmentKafkaSender sender = new AlignmentKafkaSender();

		sender.initialise(buf.array(), MARKETDATATOPIC, this.marketDataId.toString());

		return sender;
	}


	@Override
	public UUID getMarketDataId() {
		return this.marketDataId;
	}
}