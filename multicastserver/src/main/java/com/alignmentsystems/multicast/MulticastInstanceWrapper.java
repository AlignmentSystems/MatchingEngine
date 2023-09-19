package com.alignmentsystems.multicast;
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

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MulticastInstanceWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private final int milliSleep = 200;
	private InstanceType instanceType ;

	private LogEncapsulation log = new LogEncapsulation(this.getClass());

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
		.append(LibraryFunctions.getVersion(this.getClass()));

		log.info(sb.toString());

		MulticastServer multicast = new MulticastServer();


		Thread multiCastServerThread = new Thread(null , multicast, MulticastServer.CLASSNAME);

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