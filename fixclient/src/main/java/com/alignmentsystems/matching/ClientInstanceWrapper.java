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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.alignmentsystems.fix44.MessageFactory;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;

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

	private AlignmentLogEncapsulation log = new AlignmentLogEncapsulation(this.getClass());

	@Override
	public boolean initialise(InstanceType instanceType) {

		this.instanceType = instanceType;
Boolean returnValue = Boolean.FALSE;
		StringBuilder sb = new StringBuilder();

		sb
		.append(CLASSNAME)
		.append(" Started instance=")
		.append(this.instanceType.type)
		.append(" Started version=")
		.append(AlignmentFunctions.getVersion(this.getClass()));

		log.info(sb.toString());




		//What do we do here?
		//If this instance is 
		//a Actors.MATCHINGENGINE;
		//b Actors.ORDERBOOK;
		//c Actors.ALLINONE;
		//Then there is a clear segregation of duties.

		switch(instanceType){
		case MEMBERA:
		case MEMBERB:
			returnValue = initialiseMember(instanceType);			
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



		//If we get to here then the Acceptor and the initiators are started, the code is now executing....		

	}

	public Boolean initialiseMember(InstanceType instanceType) {
		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();
		try {			
			debugger.initialise(ClientInstanceWrapper.class.getClassLoader() , instanceType.getLoggerProperties());
			log.debug("Using " + instanceType.getLoggerProperties());
			debugger.info("Using " + instanceType.getLoggerProperties());
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage() , e );
			return false;
		}

		FIXEngineMember engineMember = new FIXEngineMember(log, this.instanceType);
		engines.add(engineMember);

		String[] initiators = {instanceType.getProperties()};
		log.debug("Using " + initiators[0]);

		Initiator memberToCreate = null;

		try {
			memberToCreate = getMemberEnvironment(initiators[0], engineMember);
		} catch (NullPointerException e) {
			log.error(e.getMessage(),e);
			System.err.println(e.getMessage());
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES_FILE);			
		}

		AlignmentFunctions.threadStatusCheck(Thread.currentThread(), log);

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