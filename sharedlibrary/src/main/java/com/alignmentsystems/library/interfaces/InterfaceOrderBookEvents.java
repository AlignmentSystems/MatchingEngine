package com.alignmentsystems.library.interfaces;

public interface InterfaceOrderBookEvents {
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addAddedOrderToOrderBookListener(InterfaceAddedOrderToOrderBook toAdd);

}
