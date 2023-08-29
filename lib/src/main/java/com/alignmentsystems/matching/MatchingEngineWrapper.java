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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.constants.FailureConditionConstants;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.interfaces.InterfaceInitialise;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.library.LibraryFunctions;

import quickfix.Acceptor;
import quickfix.Initiator;

public class MatchingEngineWrapper implements InterfaceInitialise{
	private final String className = this.getClass().getSimpleName();

	private List<ApplicationFIXEngine> engines = new ArrayList<ApplicationFIXEngine>();

	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 

	private String[] args = null;

	LogEncapsulation log = new LogEncapsulation(this.getClass());

	public MatchingEngineWrapper(String[] args) {
		this.args=args;
	}

	@Override
	public boolean Initialise() {
		log.info("Started....");

		Thread sequencer = new Thread(new Sequence(log, sequenced));
		MatchingEngine matchingEngine = new MatchingEngine(args , log, sequenced);

		InterfaceInitialise intMatchingEngine = (InterfaceInitialise) matchingEngine;

		matchingEngine.Initialise();

		Thread matcher = new Thread(matchingEngine); 


		//Set some descriptive thread names to help with debugging...
		Thread.currentThread().setName(this.className);		
		sequencer.setName(Sequence.class.getSimpleName());
		matcher.setName(MatchingEngine.class.getSimpleName());


		matcher.start();
		sequencer.start();

		ApplicationFIXEngine engineExchange = new ApplicationFIXEngine(sequenced, log, Actors.EXCHANGE);
		engines.add(engineExchange);

		ApplicationFIXEngine engineMemberA = new ApplicationFIXEngine(sequenced, log, Actors.A);
		engines.add(engineMemberA);

		ApplicationFIXEngine engineMemberB = new ApplicationFIXEngine(sequenced, log, Actors.B);
		engines.add(engineMemberB);

		String[] initiators = {Constants.MEMBERASETTINGS, Constants.MEMBERBSETTINGS};
		log.debug("get" + initiators[0]);
		log.debug("get" + initiators[1]);
		String[] acceptors = {Constants.EXCHANGESETTINGS};
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
		LibraryFunctions.threadStatusCheck(matcher, log);
		LibraryFunctions.threadStatusCheck(sequencer, log);

		return true;		

		//If we get to here then the Acceptor and the initiators are started, the code is now executing....		

	}
}