package com.alignmentsystems.matching.udp;

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
import com.alignmentsystems.library.interfaces.InterfaceMatch;
import com.alignmentsystems.library.interfaces.InterfaceMulticastServer;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MulticastServer implements Runnable, InterfaceMulticastServer {
	private final static String CLASSNAME = MulticastServer.class.getSimpleName().toString();
	private DatagramSocket socket;
	private InetAddress group;
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue = null;
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
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue,
			PersistenceToFileClient debugger, String host, int port) {
		this.log = log;
		this.marketDataToPublishQueue = marketDataToPublishQueue;
		this.debugger = debugger;
		this.host = host;
		this.port = port;

		return innerInitialise();
	}

	@Override
	public void run() {
		running.set(true);

		debugger.info(CLASSNAME);

		while (running.get()) {

			InterfaceMatch inMarketDataToPublish = marketDataToPublishQueue.poll();

			if (inMarketDataToPublish != null) {
				try {

					inMarketDataToPublish.getSBERepresentation(this.getCurrentSequenceNumber());
					// debugger.info(inMarketDataToPublish.toString());
					ByteBuffer bb = ByteBuffer.wrap(inMarketDataToPublish.getSOFHRepresentation());
					String payload = Constants.CHARSET.decode(bb).toString();
					debugger.info(inMarketDataToPublish.toString() + "SBE payload==> " + payload);

					this.multicastThis(bb.array());

				} catch (IOException e) {
					log.error(e.getMessage(), e);
				}
			}
			try {
				Thread.currentThread();
				Thread.sleep(MILLISLEEP);

			} catch (InterruptedException e) {

				running.set(false);

				Thread.currentThread().interrupt();

				System.err.println(e.getMessage());

				System.err.println(new StringBuilder().append(CLASSNAME).append(Constants.SPACE).append(e.getMessage())
						.toString());
			}
		}
	}

	@Override
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatch> marketDataToPublishQueue,
			PersistenceToFileClient debugger) throws Exception{
		this.log = log;
		this.marketDataToPublishQueue = marketDataToPublishQueue;
		this.debugger = debugger;
		try {
			this.host = LibraryFunctions.getProperty(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER, ConfigurationProperties.MULTICASTHOST);
			this.port = LibraryFunctions.getPropertyAsInt(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER, ConfigurationProperties.MULTICASTPORT);
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage() , e);
			throw e;
		}


		return innerInitialise();
	}

	@Override
	public ConcurrentLinkedQueue<InterfaceMatch> getMarketDataQueue() {
		return this.marketDataToPublishQueue;
	}

	@Override
	public Long getCurrentSequenceNumber() {
		return ++sequenceNumber;
	}
}