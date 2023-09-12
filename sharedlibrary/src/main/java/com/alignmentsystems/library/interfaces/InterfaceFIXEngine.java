package com.alignmentsystems.library.interfaces;

import quickfix.Acceptor;
import quickfix.Initiator;

public interface InterfaceFIXEngine {
	public Initiator getMemberEnvironment(String configFile) throws NullPointerException;
	public Acceptor getExchangeEnvironment(String configFile) throws NullPointerException; 
}