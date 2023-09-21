package com.alignmentsystems.library.interfaces;

public interface InterfaceOrderBookEvents {
	public void addMatchEventListener(InterfaceMatchEvent toAdd);
	public void addOrderAddedToOrderBookListener(InterfaceOrderBookOrderAdded toAdd);
	public void addOrderRemovedFromOrderBookListener(InterfaceOrderBookOrderRemoved toAdd);
}
