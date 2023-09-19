package com.alignmentsystems.multicast;

import java.io.FileNotFoundException;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	4th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MulticastServer
 *	Description		:
 *****************************************************************************/

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.library.LibraryFunctions;
import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceAddedOrderToOrderBook;
import com.alignmentsystems.library.interfaces.InterfaceExecutionReport;
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMatchEvent;
import com.alignmentsystems.library.interfaces.InterfaceMulticastServer;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MulticastServer implements InterfaceMulticastServer ,  InterfaceMatchEvent, InterfaceAddedOrderToOrderBook, Runnable{
	public final static String CLASSNAME = MulticastServer.class.getSimpleName().toString();
	private DatagramSocket socket;
	private InetAddress group;
	private LogEncapsulation log = null;
	private PersistenceToFileClient debugger = null;
	private String host = null;
	private int port = 0;
	private AtomicBoolean running = new AtomicBoolean(false);
	private final static int MILLISLEEP = 200;
	private Long sequenceNumber = Long.MIN_VALUE;

	private DatagramSocket getSocket() throws SocketException {
		if (socket == null) {
			try {
				socket = new DatagramSocket();
			} catch (SocketException e) {
				throw e;
			}
		}
		if (socket.isClosed()) {
			socket = new DatagramSocket();
		}

		return socket;
	}

	@Override
	public void multicastThis(byte[] multicastBytes) throws IOException {
		socket = getSocket();

		group = InetAddress.getByName(this.host);

		DatagramPacket packet = new DatagramPacket(multicastBytes, multicastBytes.length, group, this.port);
		socket.send(packet);
		// socket.close()
	}

	private boolean innerInitialise() {
		boolean returnValue = Boolean.TRUE;

		try {
			socket = getSocket();
		} catch (SocketException e) {
			log.error(e.getMessage(), e);
			returnValue = Boolean.FALSE;
		}
		Set<SocketOption<?>> supportedOptions = socket.supportedOptions();

		try {
			group = InetAddress.getByName(this.host);
		} catch (UnknownHostException e) {
			log.error(e.getMessage(), e);
			returnValue = Boolean.FALSE;
		}

		return returnValue;
	}

	@Override
	public boolean initialise(LogEncapsulation log, PersistenceToFileClient debugger, String host, int port) {
		this.log = log;
		
		this.debugger = debugger;
		this.host = host;
		this.port = port;

		return innerInitialise();
	}

	@Override
	public boolean initialise(
			LogEncapsulation log
			, PersistenceToFileClient debugger) throws Exception{
		this.log = log;
		this.debugger = debugger;
		try {
			this.host = LibraryFunctions.getProperty(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER.getProperties(), ConfigurationProperties.MULTICASTHOST);
			this.port = LibraryFunctions.getPropertyAsInt(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER.getProperties(), ConfigurationProperties.MULTICASTPORT);
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage() , e);
			throw e;
		}
		return innerInitialise();
	}

	@Override
	public Long getCurrentSequenceNumber() {
		return ++sequenceNumber;
	}

	@Override
	public void addedOrderToOrderBook(InterfaceExecutionReport arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void matchHappened(InterfaceMatch arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		AtomicBoolean run = new AtomicBoolean(true);
		while (run.get()) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}
		
	}
}