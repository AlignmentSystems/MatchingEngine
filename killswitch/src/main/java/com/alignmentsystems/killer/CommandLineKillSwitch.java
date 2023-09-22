package com.alignmentsystems.killer;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Scanner;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentKafkaLibrary;
import com.alignmentsystems.library.AlignmentKafkaSender;
import com.alignmentsystems.library.AlignmentKillDetail;
import com.alignmentsystems.library.AlignmentKillMessage;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.FailureConditionConstants;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;

import quickfix.ConfigError;
import quickfix.SessionID;
import quickfix.SessionSettings;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class CommandLineKillSwitch implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
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


		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();


		try {
			debugger.initialise(CommandLineKillSwitch.class.getClassLoader(), InstanceType.KILLSWITCH.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		System.out.println("Kafka Properties file: find");		
		
		Properties props;
		try {
			props = AlignmentFunctions.getProperties(CommandLineKillSwitch.class.getClassLoader() , InstanceType.KAFKA.getProperties());
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage(), e);
			return false;
		}
	
		if (props!=null) {
			System.out.println("Kafka Properties file: found");
		}else {
			System.out.println("Kafka Properties file: not found");
		}
			
		
		System.out.println("Kafka: is running?");
		System.out.println("If there are repeated messages shown below that include the text");
		System.out.println("java.lang.Exception: TimeoutException: Timed out waiting for a node assignment. Call: fetchMetadata");
		System.out.println("then Kafka is not running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.exit(666);
		}
		
		try {
		
		AlignmentKafkaLibrary.isKafkaRunning(props);
		
		} catch (Exception e) {
			System.exit(666);
		}
		


		String[] initiators = {"ExchangeFIXAcceptor.properties"};
		log.debug("Using " + initiators[0]);


		SessionSettings settings = null;

		try (InputStream inputStream = CommandLineKillSwitch.class.getClassLoader().getResourceAsStream(initiators[0])){
			settings = new SessionSettings(inputStream);

			inputStream.close();
		} catch (ConfigError | NullPointerException | IOException e) {			
			System.err.println(e.getMessage());			
			System.exit(FailureConditionConstants.ERROR_MEMBER_FIX_PROPERTIES);
		}

		HashMap<Integer, AlignmentKillDetail> killable = new HashMap<Integer, AlignmentKillDetail>(); 

		final String defaultSection = "default".toUpperCase();

		Iterator<SessionID> iter = settings.sectionIterator();

		int i = 0;
		while(iter.hasNext()) {
			SessionID element = iter.next();
			killable.put(i++ , new AlignmentKillDetail(element.getTargetCompID(),element.getSenderCompID()));
		}

		KillerKafkaProducer kkp = new KillerKafkaProducer();
		try {
			kkp.initialise(log, debugger);
		} catch (FileNotFoundException | NullPointerException e) {

			log.error(e.getMessage() , e);
			debugger.error(e.getMessage(), e);
		}
		
		

		System.out.println("With great power comes great responsibility...");
		System.out.println("Pick a session to kill...");
		for (Entry<Integer, AlignmentKillDetail> entry : killable.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue().getKillString();
			System.out.println("[" + Integer.toString(key)  + "]==>" +  value);
		}


		Scanner scan = new Scanner( System.in );

		while ( true ) {

			String message = scan.nextLine();
			System.out.printf( "string \"%s\" received...\n", message );
			Integer killKey = Integer.valueOf(message);
			AlignmentKillDetail toKill = killable.get(killKey);
			System.out.println("Going to kill==>" + toKill.getKillString());

			System.out.flush();
			System.err.flush();

			AlignmentKillMessage akm = new AlignmentKillMessage(); 
			akm.initialise(toKill);
			
			AlignmentKafkaSender sender = akm.getKillMessageBytesAsSBEInSender();
			kkp.send(sender);
						
			if ( message.equals( "end" ) ) {
				break;
			}

		}
		//CommandLineKillSwitch.class.getPackage()

		//What do we do here?
		//If this instance is 
		//a Actors.MATCHINGENGINE;
		//b Actors.ORDERBOOK;
		//c Actors.ALLINONE;
		//Then there is a clear segregation of duties.


		return returnValue;
	}
}