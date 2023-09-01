package com.alignmentsystems.matching.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.LogEncapsulation;
import com.alignmentsystems.matching.PersistenceToFileClient;
import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.Actors;
import com.alignmentsystems.matching.enumerations.ConfigurationProperties;
import com.alignmentsystems.matching.interfaces.InterfaceMatchTrade;
import com.alignmentsystems.matching.interfaces.InterfaceMulticastServer;
import com.alignmentsystems.matching.library.LibraryFunctions;

public class MulticastServer implements Runnable, InterfaceMulticastServer{
	private final static String CLASSNAME = MulticastServer.class.getSimpleName().toString();
	private DatagramSocket socket;
	private InetAddress group;
	private byte[] buf;
	private LogEncapsulation log = null;
	private ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue = null;
	private PersistenceToFileClient debugger = null; 
	private String host = null;
	private int port = 0;
	private AtomicBoolean running = new AtomicBoolean(false);
	private final static int MILLISLEEP = 200;

	private DatagramSocket getSocket() throws SocketException{
		if (socket==null) {
			try {
				socket = new DatagramSocket();
			} catch (SocketException e) {
				throw e;
			}
		}
		if(socket.isClosed()) {
			socket = new DatagramSocket();			
		}

		return socket;
	}

	public void multicastThis(String multicastMessage) throws IOException {
		socket = getSocket();

		group = InetAddress.getByName(this.host);
		buf = multicastMessage.getBytes(Constants.CHARSET);

		DatagramPacket packet = new DatagramPacket(buf, buf.length, group, this.port);
		socket.send(packet);
		socket.close();
	}

	private boolean innerInitialise() {
		boolean returnValue = Boolean.TRUE;

		try {
			socket = getSocket();
		} catch (SocketException e) {
			log.error(e.getMessage() , e);
			returnValue = Boolean.FALSE;
		}
		Set<SocketOption<?>> supportedOptions = socket.supportedOptions();


		try {
			group = InetAddress.getByName(this.host);
		} catch (UnknownHostException e) {
			log.error(e.getMessage() , e);
			returnValue = Boolean.FALSE;
		}

		return returnValue;
	}


	@Override
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue,
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

		while (running.get()){

			InterfaceMatchTrade inMarketDataToPublish = marketDataToPublishQueue.poll();

			if (inMarketDataToPublish!=null) {
				try {
					this.multicastThis(inMarketDataToPublish.toString());
				} catch (IOException e) {
					log.error(e.getMessage() , e);
				}
			}
			try {
				Thread.currentThread();
				Thread.sleep(MILLISLEEP);

			}catch(InterruptedException e){

				running.set(false);

				Thread.currentThread().interrupt();

				System.err.println(e.getMessage());

				System.err.println(new StringBuilder()
						.append(CLASSNAME)
						.append(Constants.SPACE)
						.append(e.getMessage())
						.toString());			
			}
		}
	}

	@Override
	public boolean initialise(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceMatchTrade> marketDataToPublishQueue,
			PersistenceToFileClient debugger) {
		this.log = log;
		this.marketDataToPublishQueue = marketDataToPublishQueue;
		this.debugger = debugger;
		this.host = LibraryFunctions.getProperty(Actors.MULTICASTSERVER, ConfigurationProperties.MULTICASTHOST);
		this.port = LibraryFunctions.getPropertyAsInt(Actors.MULTICASTSERVER, ConfigurationProperties.MULTICASTPORT);

		return innerInitialise(); 
	}

	@Override
	public ConcurrentLinkedQueue<InterfaceMatchTrade> getMarketDataQueue() {
		return this.marketDataToPublishQueue;
	}
}