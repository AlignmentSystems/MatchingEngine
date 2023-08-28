package com.alignmentsystems.matching.interfaces;

public interface InterfaceOrderBook {
public boolean addOrder(InterfaceOrder nos);
public boolean cancelOrder(InterfaceOrder nos);
public boolean cancelOrder(String orderId);
public void addMatchEventListener(MatchEvent toAdd);
public void upsertTopOfBook(InterfaceOrder nos);
public void updateLevelsOfDepth();
public boolean addedOrder(InterfaceOrder nos);
}
