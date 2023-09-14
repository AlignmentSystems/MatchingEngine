package com.alignmentsystems.matching;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	private ConcurrentLinkedQueue<InterfaceOrder> deduplicatedSequenced = new ConcurrentLinkedQueue<InterfaceOrder>();
	private ConcurrentLinkedQueue<InterfaceMatch> marketDataQueue = new ConcurrentLinkedQueue<InterfaceMatch>();
	private InstanceType instanceType;
	private final LogEncapsulation log = new LogEncapsulation(InstanceWrapper.class);

//	protected class LogBackWrapper {
//		private final Logger logger = LoggerFactory.getLogger(LogBackWrapper.class);
//
//			private void start() {
//		        logger.debug("------ Starting Ant------");
//			}
//		}
//	
	
	@Override
	public boolean initialise(InstanceType instanceType) {

		this.instanceType = instanceType;

		
		
		//LogBackWrapper lbw = new LogBackWrapper();
		
		//lbw.start();
		
		StringBuilder sb = new StringBuilder();

		sb.append(CLASSNAME).append(" Started instance=").append(this.instanceType.type).append(" Started version=")
				.append(LibraryFunctions.getVersion(this.getClass()));

		
		Boolean returnValue = Boolean.FALSE;
		log.info(sb.toString());
		
		
		log.showSystemProperties();

		// What do we do here?
		// If this instance is
		// a FIXMESSAGINGINFRA;
		// b ORDERBOOK;
		// Then there is a clear segregation of duties.
		//FIXMESSAGINGINFRA handles the FIX Connections, the non-sequenced queue, the sequenced queue, the DataMapper and the FIXToBinaryProcessor
		//

		switch (instanceType) {

		case FIXMESSAGINGINFRA:
			returnValue = initialiseFIXMessagingInfrastructure(instanceType);
		case ORDERBOOK:
			returnValue = initialiseOrderBook(instanceType) ;
		default:
			returnValue = false;
		}
		 while (returnValue) {
	            try {
	                this.wait(2000);
	            } catch (InterruptedException e) {
	                log.error(e.getMessage() , e );
	            }
	        }
		 return returnValue;
		
		
	}

	private Boolean initialiseOrderBook(InstanceType instanceType)  {
		
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(InstanceWrapper.class.getClassLoader(), InstanceType.ORDERBOOK.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}
		OrderBookWrapper obw = new OrderBookWrapper();

		try {
			obw.initialise(this.log, debugger);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
		
		Thread.currentThread().setName(instanceType.toString());
		
		
		return true;

	}

	private Boolean initialiseFIXMessagingInfrastructure(InstanceType instanceType)  {
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(this.getClass().getClassLoader() , InstanceType.FIXMESSAGINGINFRA.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		QueueNonSequenced queueNonSequenced = new QueueNonSequenced();
		Thread queueNonSequencedThread = new Thread(null, queueNonSequenced, QueueNonSequenced.CLASSNAME);
		queueNonSequenced.initialise(log);

		QueueSequenced queueSequenced = new QueueSequenced();
		Thread queueSequencedThread = new Thread(null, queueSequenced, QueueSequenced.CLASSNAME);
		queueSequenced.initialise(sequenced, deduplicatedSequenced);

		FIXToBinaryProcessor fixToBinaryProcessor = new FIXToBinaryProcessor();
		try {
			fixToBinaryProcessor.initialise(deduplicatedSequenced , log);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
		Thread fixToBinaryProcessorThread = new Thread(null, fixToBinaryProcessor, FIXToBinaryProcessor.CLASSNAME);
		
		
		Thread.currentThread().setName(instanceType.type );

		fixToBinaryProcessorThread.start();
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
		LibraryFunctions.threadStatusCheck(queueNonSequencedThread, log);
		LibraryFunctions.threadStatusCheck(queueSequencedThread, log);
		LibraryFunctions.threadStatusCheck(fixToBinaryProcessorThread, log);

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