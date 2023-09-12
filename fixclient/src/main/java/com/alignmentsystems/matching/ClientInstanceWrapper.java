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

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.Actors;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;
import com.alignmentsystems.matching.FIXEngineMember;

import quickfix.ConfigError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.Initiator;
import quickfix.RuntimeError;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketInitiator;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class ClientInstanceWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private final int milliSleep = 200;
	private List<FIXEngineMember> engines = new ArrayList<FIXEngineMember>();

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
		case MEMBERA:
			return initialiseMember();			
		case MEMBERB:
			return initialiseMember();	
		default:
			return false;	
		}




		//If we get to here then the Acceptor and the initiators are started, the code is now executing....		

	}

	public Boolean initialiseMember() {
		PersistenceToFileClient debugger = new PersistenceToFileClient();
		try {
			debugger.initialise(InstanceType.MATCHINGENGINE);
			debugger.info("Working...");
		} catch (IllegalThreadStateException | FileNotFoundException e) {
			log.error(e.getMessage() , e );
		}

		FIXEngineMember engineMember = new FIXEngineMember(log, this.instanceType);
		engines.add(engineMember);

		String[] initiators = {Actors.A.getProperties()};
		log.debug("get" + initiators[0]);

		Initiator memberToCreate = null;


		try {
			memberToCreate = getMemberEnvironment(initiators[0], engineMember);
		} catch (NullPointerException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);			
		}

		LibraryFunctions.threadStatusCheck(Thread.currentThread(), log);

		return true;			
	}

	/**
	 * 
	 * @param configFile
	 * @param engine
	 * @return Initiator
	 * @throws NullPointerException
	 */
	private static Initiator getMemberEnvironment(String configFile, FIXEngineMember engine) throws NullPointerException  {
		Initiator member = null;

		InputStream inputStream = ClientInstanceWrapper.class.getClassLoader().getResourceAsStream(configFile);	

		if (inputStream==null) {
			throw new NullPointerException("No valid config file at " + configFile);
		}

		try {
			SessionSettings settings = new SessionSettings(inputStream);
			FileStoreFactory storeFactory = new FileStoreFactory(settings);
			FileLogFactory logFactory = new FileLogFactory(settings);
			MessageFactory messageFactory = new MessageFactory();

			member = new ThreadedSocketInitiator(engine, storeFactory, settings, logFactory, messageFactory);

		} catch (ConfigError e) {			
			System.err.println(e.getMessage());			
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES);
		}

		try {
			member.start();
		} catch (RuntimeError e) {			
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_APPLICATION);
		} catch (ConfigError e) {			
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES);
		}
		try {
			inputStream.close();
		} catch (IOException e) {

			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);
		}


		return member;
	}



}