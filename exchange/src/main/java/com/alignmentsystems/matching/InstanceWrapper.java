package com.alignmentsystems.matching;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MatchingEngineWrapper
 *	Description		:
 *****************************************************************************/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceOrder;

import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.RuntimeError;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class InstanceWrapper implements InterfaceInstanceWrapper {
	private final String CLASSNAME = this.getClass().getSimpleName();
	private List<FIXEngineExchange> engines = new ArrayList<FIXEngineExchange>();
	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>();
	private ConcurrentLinkedQueue<String> deduplicatedPersistence = new ConcurrentLinkedQueue<String>();
	private ConcurrentLinkedQueue<InterfaceMatch> marketDataQueue = new ConcurrentLinkedQueue<InterfaceMatch>();
	private InstanceType instanceType;
	private LogEncapsulation log = new LogEncapsulation(this.getClass());

	@Override
	public boolean initialise(InstanceType instanceType) {

		this.instanceType = instanceType;

		StringBuilder sb = new StringBuilder();

		sb.append(CLASSNAME).append(" Started instance=").append(this.instanceType.type).append(" Started version=")
				.append(LibraryFunctions.getVersion(this.getClass()));

		log.info(sb.toString());

		// What do we do here?
		// If this instance is
		// a Actors.MATCHINGENGINE;
		// b Actors.ORDERBOOK;
		// Then there is a clear segregation of duties.

		switch (instanceType) {

		case FIXMESSAGINGINFRA:
			return initialiseFIXMessagingInfrastructure();
		case ORDERBOOK:
			return initialiseOrderBook();
		default:
			return false;
		}
	}

	private Boolean initialiseOrderBook() {
		
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(InstanceType.ORDERBOOK);
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}
		OrderBookWrapper obw = new OrderBookWrapper();

		obw.initialise(log, debugger);
		return true;

	}

	private Boolean initialiseFIXMessagingInfrastructure() {
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(InstanceType.FIXMESSAGINGINFRA);
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
		}

		QueueNonSequenced queueNonSequenced = new QueueNonSequenced();
		Thread queueNonSequencedThread = new Thread(null, queueNonSequenced, QueueNonSequenced.CLASSNAME);
		queueNonSequenced.initialise(log);

		QueueSequenced queueSequenced = new QueueSequenced();
		Thread queueSequencedThread = new Thread(null, queueSequenced, QueueSequenced.CLASSNAME);
		queueSequenced.initialise(sequenced, deduplicatedPersistence);

		Thread.currentThread().setName(this.CLASSNAME);

		queueSequencedThread.start();
		queueNonSequencedThread.start();

		FIXEngineExchange engineExchange = new FIXEngineExchange(log, queueNonSequenced,
				InstanceType.EXCHANGEFIXACCEPTOR);
		engines.add(engineExchange);

		String[] acceptors = { InstanceType.EXCHANGEFIXACCEPTOR.getProperties() };
		log.debug("get" + acceptors[0]);

		Acceptor exchange = null;

		try {
			exchange = getExchangeEnvironment(acceptors[0], engineExchange);
		} catch (NullPointerException e) {
			log.error(e.getMessage(), e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES_FILE);
		}

		LibraryFunctions.threadStatusCheck(Thread.currentThread(), log);
		// LibraryFunctions.threadStatusCheck(mdOutThread, log);
		// LibraryFunctions.threadStatusCheck(matchingEngineThread, log);
		LibraryFunctions.threadStatusCheck(queueNonSequencedThread, log);
		LibraryFunctions.threadStatusCheck(queueSequencedThread, log);
//		LibraryFunctions.threadStatusCheck(persistenceThread, log);

		return true;
	}

	/**
	 * 
	 * @param configFile
	 * @param engine
	 * @return
	 * @throws NullPointerException
	 */
	private static Acceptor getExchangeEnvironment(String configFile, FIXEngineExchange engine)
			throws NullPointerException {

		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(configFile);

		if (inputStream == null) {
			throw new NullPointerException("No valid config file at " + configFile);
		}

		SocketAcceptor acceptor = null;

		try {
			SessionSettings settings = new SessionSettings(inputStream);
			// FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileStoreFactory messageStoreFactory = new FileStoreFactory(settings);
			MessageFactory messageFactory = new MessageFactory();
			FileLogFactory logFactory = new FileLogFactory(settings);

			acceptor = new SocketAcceptor(engine, messageStoreFactory, settings, logFactory, messageFactory);

			acceptor.start();

		} catch (ConfigError e) {
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES);
		} catch (RuntimeError e) {
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_APPLICATION);
		}

		try {
			inputStream.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES_FILE);
		}
		return acceptor;
	}
}