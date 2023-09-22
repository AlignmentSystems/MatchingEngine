package com.alignmentsystems.matching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentKafkaLibrary;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;

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
public class AlignmentInstanceWrapper implements InterfaceInstanceWrapper {
	private final String CLASSNAME = this.getClass().getSimpleName();
	private List<AlignmentFIXEngineExchange> engines = new ArrayList<AlignmentFIXEngineExchange>();
	//private ConcurrentLinkedQueue<InterfaceMatch> marketDataQueue = new ConcurrentLinkedQueue<InterfaceMatch>();
	private InstanceType instanceType;
	private final AlignmentLogEncapsulation log = new AlignmentLogEncapsulation(AlignmentInstanceWrapper.class);


	@Override
	public boolean initialise(InstanceType instanceType) {

		this.instanceType = instanceType;

		StringBuilder sb = new StringBuilder();

		sb.append(CLASSNAME).append(" Started instance=").append(this.instanceType.type).append(" Started version=")
		.append(AlignmentFunctions.getVersion(this.getClass()));

		Boolean returnValue = Boolean.FALSE;
		log.info(sb.toString());

		log.showSystemProperties();

		// What do we do here?
		// If this instance is
		// a FIXMESSAGINGINFRA;
		// b ORDERBOOK;
		// Then there is a clear segregation of duties.
		//FIXMESSAGINGINFRA handles the FIX Connections, the non-sequenced queue, the sequenced queue, the AlignmentDataMapper and the AlignmentFIXToBinaryProcessor
		//




		switch (instanceType) {

		case FIXMESSAGINGINFRA:
			returnValue = initialiseFIXMessagingInfrastructure(instanceType);
			break;
		case ORDERBOOK:
			returnValue = initialiseOrderBook(instanceType) ;
			break;
		default:
			returnValue = false;
			break;
		}
		while (returnValue) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}
		return returnValue;


	}

	private Boolean initialiseOrderBook(InstanceType instanceType)  {
		final String METHOD = "initialiseOrderBook";



		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();


		try {
			debugger.initialise(AlignmentInstanceWrapper.class.getClassLoader(), InstanceType.ORDERBOOK.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		AlignmentUEH ueh = new AlignmentUEH(debugger);

		Thread.setDefaultUncaughtExceptionHandler(ueh);



		AlignmentOrderBookWrapper obw = new AlignmentOrderBookWrapper();

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
		final String METHOD = "initialiseFIXMessagingInfrastructure";
		final String ID = CLASSNAME + Constants.FULLSTOP + METHOD;

		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();
		try {
			debugger.initialise(this.getClass().getClassLoader() , InstanceType.FIXMESSAGINGINFRA.getProperties());
			debugger.info(ID);
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		AlignmentUEH ueh = new AlignmentUEH(debugger);	
		Thread.setDefaultUncaughtExceptionHandler(ueh);

		//check - is Kafka running?
		Properties props;
		try {
			props = AlignmentFunctions.getProperties(AlignmentInstanceWrapper.class.getClassLoader() , InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage(), e);
			return false;
		}
		
		
		AlignmentKafkaLibrary akl = new AlignmentKafkaLibrary();
		akl.isKafkaRunning(props);
		
		
		
		
		

		AlignmentQueueNonSequenced queueNonSequenced = new AlignmentQueueNonSequenced();
		Thread threadQueueNonSequenced = new Thread(null, queueNonSequenced, AlignmentQueueNonSequenced.CLASSNAME);
		queueNonSequenced.initialise(log);

		AlignmentQueueSequenced queueSequenced = new AlignmentQueueSequenced();
		Thread threadQueueSequenced = new Thread(null, queueSequenced, AlignmentQueueSequenced.CLASSNAME);
		queueSequenced.initialise(queueNonSequenced.getOutputQueue());

		AlignmentFIXToBinaryProcessor fixToBinaryProcessor = new AlignmentFIXToBinaryProcessor();
		try {
			fixToBinaryProcessor.initialise(queueSequenced.getOutputQueue() , log);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}

		Thread threadFixToBinaryProcessor = new Thread(null, fixToBinaryProcessor, AlignmentFIXToBinaryProcessor.CLASSNAME);


		AlignmentFIXEngineKafkaConsumer fixEngineKafkaConsumer = null;

		try {
			fixEngineKafkaConsumer =  new AlignmentFIXEngineKafkaConsumer();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
		try {
			fixEngineKafkaConsumer.initialise(log, debugger);
		} catch (NullPointerException | FileNotFoundException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		AlignmentFIXEngineKafkaProducer fixEngineKafkaProducer = null;

		try {
			fixEngineKafkaProducer =  new AlignmentFIXEngineKafkaProducer();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}

		try {
			fixEngineKafkaProducer.initialise(this.log, debugger);
		} catch (NullPointerException | FileNotFoundException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		Thread ThreadFixEngineKafkaProducer = new Thread(null, fixEngineKafkaProducer, AlignmentFIXEngineKafkaProducer.CLASSNAME); 


		try {
			debugger.debug(ID + ":Start threads...");
			Thread.currentThread().setName(instanceType.type );

			threadFixToBinaryProcessor.start();
			threadQueueSequenced.start();
			threadQueueNonSequenced.start();

			ThreadFixEngineKafkaProducer.start();
		}catch (IllegalThreadStateException e) {
			log.error(e.getMessage(), e);
			return false;

		}


		AlignmentFIXEngineExchange engineExchange = new AlignmentFIXEngineExchange();
		try {
			debugger.debug(ID + ":Initialise FIX engine");
			engineExchange.initialise(log , debugger , instanceType );
			engines.add(engineExchange);
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		final String[] acceptors = { InstanceType.EXCHANGEFIXACCEPTOR.getProperties() };

		
		debugger.debug(ID + ":Get" + acceptors[0]);


		Acceptor exchange = null;

		try {
			debugger.debug(ID  + ":Request start FIX engine");
			exchange = getExchangeEnvironment(acceptors[0], engineExchange);
			exchange.start();
			debugger.debug(ID  + ":Requested start FIX engine");
		} catch (NullPointerException | RuntimeError | ConfigError e) {
			log.error(e.getMessage(), e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES_FILE);
		}


		debugger.debug(ID  + ":Request list threads");
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();


		Iterator<Thread> namesIterator = threadSet.iterator();
		while(namesIterator.hasNext()) {
			AlignmentFunctions.threadStatusCheck(namesIterator.next(), debugger);
		}

		

		try {
			debugger.debug(ID  + ":Start KafkaConsumer");
			fixEngineKafkaConsumer.runAlways(KafkaMessageTopology.MESSAGESTOBERECEIVEDBYEXCHANGEFIXENGINEFROMMATCHINGENGINE, engineExchange);
			debugger.debug(ID  + ":Started KafkaConsumer");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
		AtomicBoolean run = new AtomicBoolean(true);
		
		while (run.get()) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}
		
		
		
		
		return true;
	}

	/**
	 * 
	 * @param configFile
	 * @param engine
	 * @return
	 * @throws NullPointerException
	 */
	private static Acceptor getExchangeEnvironment(String configFile, AlignmentFIXEngineExchange engine)
			throws NullPointerException {

		InputStream inputStream = AlignmentApp.class.getClassLoader().getResourceAsStream(configFile);

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