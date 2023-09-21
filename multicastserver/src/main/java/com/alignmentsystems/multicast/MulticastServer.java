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
import java.nio.ByteOrder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import com.alignmentsystems.library.AlignmentDataMapper;
import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.Encodings;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.enumerations.VersionSOFH;
import com.alignmentsystems.library.interfaces.InterfaceKafkaMessageHandler;
import com.alignmentsystems.library.interfaces.InterfaceMulticastServer;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class MulticastServer implements InterfaceMulticastServer ,  Runnable , InterfaceKafkaMessageHandler{
	public final static String CLASSNAME = MulticastServer.class.getSimpleName().toString();
	private final static Encodings encoding = Encodings.FIXSBELITTLEENDIAN;
	private final int MILLISLEEP = 2000;

	private DatagramSocket socket;
	private InetAddress group;
	private AlignmentLogEncapsulation log = null;
	private AlignmentPersistenceToFileClient debugger = null;
	private String host = null;
	private int port = 0;
	private AtomicBoolean running = new AtomicBoolean(false);
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

		AlignmentUEH ueh = new AlignmentUEH();
		
		Thread.setDefaultUncaughtExceptionHandler(ueh);

		
		
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
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger, String host, int port) {
		this.log = log;

		this.debugger = debugger;
		this.host = host;
		this.port = port;

		return innerInitialise();
	}

	@Override
	public boolean initialise(
			AlignmentLogEncapsulation log
			, AlignmentPersistenceToFileClient debugger) throws Exception{
		this.log = log;
		this.debugger = debugger;
		
		
		
		try {
			this.host = AlignmentFunctions.getProperty(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER.getProperties(), ConfigurationProperties.MULTICASTHOST);
			this.port = AlignmentFunctions.getPropertyAsInt(MulticastServer.class.getClassLoader() , InstanceType.MULTICASTSERVER.getProperties(), ConfigurationProperties.MULTICASTPORT);
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage() , e);
			throw e;
		}
		return innerInitialise();
	}

	@Override
	public Long getSequenceNumberForNextMessage() {
		return ++sequenceNumber;
	}

	@Override
	public void run() {
		running.set(true);
		while (running.get()) {
			try {
				waiter();
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}

	}

	private synchronized void waiter() throws IllegalArgumentException , InterruptedException , IllegalMonitorStateException  {
		this.wait(MILLISLEEP);
	}	
	
	
	
	@Override
	public void processMessage(String topicName, ConsumerRecord<String, byte[]> message) throws Exception {
		//So,we listen to the Kafka queue to see what's going on.
		//Fundamentally there are a few complex problems to resolve.
		//The Messages that go out via UDP/Multicast on Feed-A, Feed-B and Feed-C
		byte[] toMulticast = null;
		if (message.value().length>2) {
			ByteBuffer bb = ByteBuffer.wrap(message.value()).order(MulticastServer.encoding.getByteOrder()); 
			 
			//if the message is longer than two bytes then we can take the first two bytes as being the MessageType
			if (bb.getShort()==AlignmentDataMapper.EXCHANGEMESSAGETYPEMATCH) {
				//We have a trade match...
				ByteBuffer bb2 = ByteBuffer.allocate(Long.BYTES + message.value().length).order(MulticastServer.encoding.getByteOrder());
				bb2.putLong(this.getSequenceNumberForNextMessage());
				bb2.put(message.value());
				
				bb2.flip();
				//==>We now have the message plus a sequence number add at the beginning
				toMulticast = addSOFHeader(encoding, VersionSOFH.ONE, bb2.array());
			}
		}else {
			//failure!
		}
		if (toMulticast!=null) {
			this.multicastThis(toMulticast);
		}
	}
	
	@SuppressWarnings("unused")
	private byte[] addSOFHeader(
			Encodings encoding 
			, VersionSOFH versionSOFH 
			, byte[] payloadWithoutHeader 
			) {

		final String methodName = "addSOFHeader";

		final int messageEncodingLength = 2;
		final int messagePayloadLength = 4;
		int messageActualLength = 0;
		short EncodingNumber = 0;
		String EncodingHexString = null;
		ByteBuffer bbh = null;


		final ByteOrder nbo = ByteOrder.BIG_ENDIAN;

		//While the Simple Open Framing Header specification is normative, the following is an interpretation of that 
		//standard as an SBE encoding. Note that the framing standard specifies that the framing header will always 
		//be encoded in big-endian byte order, also known as network byte order. 
		try {

			final byte[] messageEncodedAsSBE = payloadWithoutHeader;
			//The Message_Length shall be defined to be the length in octets (i.e. bytes) of a message inclusive of the length of the Simple Open Framing Header.
			messageActualLength = 
					messageEncodedAsSBE.length
					+ messageEncodingLength 
					+ messagePayloadLength;

			bbh = ByteBuffer.allocate(messageActualLength);

			bbh.order(nbo);

			switch(versionSOFH) {
			case ONE:

				EncodingNumber = encoding.getEncodingValue();
				EncodingHexString = encoding.getEncodingAsString();

				bbh.putInt(messageActualLength);
				bbh.putShort(EncodingNumber); //FIXSBELittleEndian(0xEB50),
				bbh.put(messageEncodedAsSBE);
				bbh.flip();

				break;
			case TWO:
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw e;		
		}	
		return bbh.array();
	}
	
	
	
	
	
}