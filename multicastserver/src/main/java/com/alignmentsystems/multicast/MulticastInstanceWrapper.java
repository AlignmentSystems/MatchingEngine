package com.alignmentsystems.multicast;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	19th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MulticastInstanceWrapper
 *	Description		:
 *****************************************************************************/

import java.io.IOException;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.constants.KafkaMessageTopology;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;
import com.alignmentsystems.matching.AlignmentInstanceWrapper;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MulticastInstanceWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private InstanceType instanceType ;

	private AlignmentLogEncapsulation log = new AlignmentLogEncapsulation(this.getClass());

	@Override
	public boolean initialise(InstanceType instanceType) {
		final String METHOD = "initialise";
		final String ID = CLASSNAME + Constants.FULLSTOP + METHOD;	
		this.instanceType = instanceType;
		
		

		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();


		try {
			debugger.initialise(MulticastInstanceWrapper.class.getClassLoader(), InstanceType.ORDERBOOK.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		
		
		
		Boolean returnValue = Boolean.FALSE;
		StringBuilder sb = new StringBuilder();

		sb
		.append(ID)
		.append(" Started instance=")
		.append(this.instanceType.type)
		.append(" Started version=")
		.append(AlignmentFunctions.getVersion(this.getClass()))
		.append(" listening to=")
		.append(KafkaMessageTopology.MESSAGETOBERECEIVEDBYMULTICASTSERVERFROMMATCHINGENGINE)				
		;

		log.info(sb.toString());
		
		MulticastServerKafkaListener mmkl = null;
		
		try {
			mmkl = new MulticastServerKafkaListener();
		} catch (Exception e) {
			log.error(e.getMessage() , e);
			return false;
		}
		
		
		MulticastServer multicast = new MulticastServer();

		
		Thread multiCastServerThread = new Thread(null , multicast, MulticastServer.CLASSNAME);

		try {
			mmkl.runAlways(KafkaMessageTopology.MESSAGETOBERECEIVEDBYMULTICASTSERVERFROMMATCHINGENGINE , multicast);
		} catch (Exception e) {
			log.error(e.getMessage() , e);
			return false;
		}
		
		multiCastServerThread.start();

		while (returnValue) {
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}
		return returnValue;
	}
}