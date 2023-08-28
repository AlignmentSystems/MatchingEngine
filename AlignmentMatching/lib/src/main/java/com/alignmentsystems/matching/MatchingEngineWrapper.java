package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	LibraryFunctions
 * 
 *****************************************************************************/

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;

import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.Initiator;
import quickfix.RuntimeError;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.ThreadedSocketInitiator;

public class MatchingEngineWrapper {
	private final String className = this.getClass().getCanonicalName();

	private List<ApplicationFIXEngine> engines = new ArrayList<ApplicationFIXEngine>();

	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 

	private String[] args = null;

	LogEncapsulation log = new LogEncapsulation(this.getClass());

	public void fireItUp() {
		log.info("Started....");

		Thread sequencer = new Thread(new Sequence(log, sequenced));
		Thread matcher = new Thread(new MatchingEngine(args , log, sequenced)); 

		matcher.start();
		sequencer.start();

		ApplicationFIXEngine engineMemberA = new ApplicationFIXEngine(sequenced, log, null);
		engines.add(engineMemberA);

		ApplicationFIXEngine engineMemberB = new ApplicationFIXEngine(sequenced, log, null);
		engines.add(engineMemberB);

		ApplicationFIXEngine engineExchange = new ApplicationFIXEngine(sequenced, log, null);
		engines.add(engineExchange);

		String[] initiators = {Constants.MEMBERASETTINGS, Constants.MEMBERBSETTINGS}; 
		Initiator memberA = getMemberEnvironment(initiators[0], engineMemberA);
		Initiator memberB = getMemberEnvironment(initiators[1], engineMemberB);

		String[] acceptors = {Constants.EXCHANGESETTINGS};
		Acceptor exchange = getExchangeEnvironment(acceptors[0], engineExchange);







	}

	public MatchingEngineWrapper(String[] args) {
		this.args=args;


	}



	private Initiator getMemberEnvironment(String configFile, ApplicationFIXEngine engine) {
		Initiator member = null;

		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(configFile);	


		try {
			SessionSettings settings = new SessionSettings(inputStream);
			FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileLogFactory logFactory = new FileLogFactory(settings);
			MessageFactory messageFactory = new MessageFactory();

			member = new ThreadedSocketInitiator(engine, storeFactory, settings, logFactory, messageFactory);

		} catch (ConfigError e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			//log.shutdown();
			//System.err.println("Log file flushed to " + log.getFullPathAndFileNameToUse());
			System.exit(0);
		}

		try {
			member.start();
		} catch (RuntimeError e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			//log.shutdown();
			//System.err.println("Log file flushed to " + log.getFullPathAndFileNameToUse());
			System.exit(0);
		} catch (ConfigError e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			//log.shutdown();
			//System.err.println("Log file flushed to " + log.getFullPathAndFileNameToUse());
			System.exit(0);
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			//log.shutdown();
			//System.err.println("Log file flushed to " + log.getFullPathAndFileNameToUse());
			System.exit(0);
		}


		return member;
	}

	private Acceptor getExchangeEnvironment(String configFile, ApplicationFIXEngine engine) {
		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(configFile);	
		SocketAcceptor acceptor = null;
		try {
			SessionSettings settings = new SessionSettings(inputStream);
			//FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileStoreFactory messageStoreFactory = new FileStoreFactory(settings);
			MessageFactory messageFactory = new MessageFactory();
			FileLogFactory logFactory = new FileLogFactory(settings);

			acceptor = new SocketAcceptor(engine, messageStoreFactory, settings, logFactory,messageFactory);

			acceptor.start();

		} catch (ConfigError e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(0);
		} catch (RuntimeError e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(0);
		}

		try {
			inputStream.close();
		} catch (IOException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(0);
		}

		return acceptor;
	}
}