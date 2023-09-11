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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.constants.FailureConditionConstants;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.InstanceType;
import com.alignmentsystems.matching.enumerations.OrderDistributionModel;
import com.alignmentsystems.matching.interfaces.InterfaceInstanceWrapper;
import com.alignmentsystems.matching.interfaces.InterfaceMatch;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.library.LibraryFunctions;
import com.alignmentsystems.matching.udp.MulticastServer;

import quickfix.Acceptor;
import quickfix.Initiator;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class InstanceWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private final int milliSleep = 200;
	private List<ApplicationFIXEngine> engines = new ArrayList<ApplicationFIXEngine>();

	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	private ConcurrentLinkedQueue<InterfaceOrder> sequencedPersistence = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	private ConcurrentLinkedQueue<String> deduplicatedPersistence = new ConcurrentLinkedQueue<String>(); 

	private ConcurrentLinkedQueue<InterfaceMatch> marketDataQueue = new ConcurrentLinkedQueue<InterfaceMatch>(); 
	private OrderDistributionModel orderDistributionModel = null;

	private InstanceType instanceType ;
	
	private LogEncapsulation log = new LogEncapsulation(this.getClass());

	@Override
	public boolean initialise(InstanceType instanceType) {
		
		this.instanceType = instanceType;
		
		StringBuilder sb = new StringBuilder();
		
		sb
		.append(CLASSNAME)
		.append(" Started instance=")
		.append(this.instanceType.type)
		.append(" Started version=")
		.append(LibraryFunctions.getVersion(this.getClass()));
		
		log.info(sb.toString());
		
		
		
		
		//What do we do here?
		//If this instance is 
		//a Actors.MATCHINGENGINE;
		//b Actors.ORDERBOOK;
		//c Actors.ALLINONE;
		//Then there is a clear segregation of duties.
		
		switch(instanceType){
		case ALLINONE:
			return initialiseAllInOne();			
		case MATCHINGENGINE:
			return false;
		case ORDERBOOK:
			return false;
		default:
			return false;	
		}
		
		
		

		//If we get to here then the Acceptor and the initiators are started, the code is now executing....		

	}
	
	public Boolean initialiseAllInOne() {
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(Actors.MATCHINGENGINE);
			debugger.info("Working...");
		} catch (IllegalThreadStateException | FileNotFoundException e) {
			log.error(e.getMessage() , e );
		}
		
		Thread sequencerThread = new Thread(new Sequence(log, sequenced, sequencedPersistence));
		
		OrderToStringPreProcessor preProcessor = new OrderToStringPreProcessor();
		preProcessor.initialise(sequenced, deduplicatedPersistence);
		
		PersistenceToFileServer persistence = new PersistenceToFileServer(); 
		try {
			persistence.initialise(deduplicatedPersistence, Actors.PERSISTENCE, milliSleep);
		} catch ( IOException e) {
			log.error(e.getMessage() , e );
		}
		
		MulticastServer mdOut = new MulticastServer(); 
		mdOut.initialise(log, marketDataQueue, debugger);
		
		Thread mdOutThread = new Thread(mdOut);
		
		MatchingEngine matchingEngine = new MatchingEngine();
		matchingEngine.initialise(log, sequenced, debugger, mdOut, OrderDistributionModel.CONCURRENTLINKEDQUEUE);
		
		Thread matchingEngineThread = new Thread(matchingEngine);
		Thread preProcessorThread = new Thread(preProcessor);
		Thread persistenceThread = new Thread(persistence);

		//Set some descriptive thread names to help with debugging...
		Thread.currentThread().setName(this.CLASSNAME);		
		
		mdOutThread.setName(MulticastServer.class.getSimpleName());
		sequencerThread.setName(Sequence.class.getSimpleName());
		matchingEngineThread.setName(MatchingEngine.class.getSimpleName());
		preProcessorThread.setName(OrderToStringPreProcessor.class.getSimpleName());
		persistenceThread.setName(PersistenceToFileServer.class.getSimpleName());

		mdOutThread.start();
		matchingEngineThread.start();
		persistenceThread.start();
		preProcessorThread.start();
		sequencerThread.start();

		
		
		ApplicationFIXEngine engineExchange = new ApplicationFIXEngine(sequenced, log, Actors.EXCHANGE);
		engines.add(engineExchange);

		ApplicationFIXEngine engineMemberA = new ApplicationFIXEngine(sequenced, log, Actors.A);
		engines.add(engineMemberA);

		ApplicationFIXEngine engineMemberB = new ApplicationFIXEngine(sequenced, log, Actors.B);
		engines.add(engineMemberB);

		String[] initiators = {Actors.A.getProperties(), Actors.B.getProperties()};
		log.debug("get" + initiators[0]);
		log.debug("get" + initiators[1]);
		String[] acceptors = {Actors.EXCHANGE.getProperties()};
		log.debug("get" + acceptors[0]);

		Initiator memberA = null;
		Initiator memberB = null;
		Acceptor exchange = null;

		try {
			exchange = LibraryFunctions.getExchangeEnvironment(acceptors[0], engineExchange);
		} catch (NullPointerException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_EXCHANGE_FIX_PROPERTIES_FILE);			
		}

		try {
			memberA = LibraryFunctions.getMemberEnvironment(initiators[0], engineMemberA);
		} catch (NullPointerException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);			
		}

		try {
			memberB = LibraryFunctions.getMemberEnvironment(initiators[1], engineMemberB);
		} catch (NullPointerException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);			
		}

		LibraryFunctions.threadStatusCheck(Thread.currentThread(), log);
		LibraryFunctions.threadStatusCheck(mdOutThread, log);
		LibraryFunctions.threadStatusCheck(matchingEngineThread, log);
		LibraryFunctions.threadStatusCheck(sequencerThread, log);
		LibraryFunctions.threadStatusCheck(preProcessorThread, log);
		LibraryFunctions.threadStatusCheck(persistenceThread, log);

		return true;			
	}
}