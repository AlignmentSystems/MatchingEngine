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
 * @see <a href="https://kafka.apache.org/documentation.html#adminapi">Admin API</a>
 *
 */
public class AdministratorWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private final int milliSleep = 200;
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
		//a InstanceType.MATCHINGENGINE;
		//b InstanceType.ORDERBOOK;
		//c InstanceType.ADMIN;
		//Then there is a clear segregation of duties.

		
		
		switch(instanceType){
		case MEMBERA:
		case MEMBERB:
			returnValue = Boolean.FALSE;
			break;
		case ADMIN:
			returnValue = initialiseAdmin(instanceType);
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

	public Boolean initialiseAdmin(InstanceType instanceType) {
		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();
		try {			
			debugger.initialise(AdministratorWrapper.class.getClassLoader() , instanceType.getLoggerProperties());
			log.debug("Using " + instanceType.getLoggerProperties());
			debugger.info("Using " + instanceType.getLoggerProperties());
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage() , e );
			return false;
		}

		return true;			
	}

}