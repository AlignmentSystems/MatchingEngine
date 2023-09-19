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
	private InstanceType instanceType ;
	private final static String MARKETDATATOPIC = "MDOUT";

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
			mmkl.runAlways(MARKETDATATOPIC, multicast);
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