package com.alignmentsystems.shaman;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	28th September  2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	MulticastInstanceWrapper
 *	Description		:
 *****************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.file.StandardOpenOption;

import com.alignmentsystems.library.AlignmentFunctions;
import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.enumerations.ConfigurationProperties;
import com.alignmentsystems.library.enumerations.InstanceType;
import com.alignmentsystems.library.interfaces.InterfaceInstanceWrapper;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 * @see <a href="https://stackoverflow.com/questions/25396664/shared-memory-between-two-jvms">SO</a>
 *@see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/ByteBuffer.html">ByteBuffer</a>
 */
public class ShamanWrapper implements InterfaceInstanceWrapper{
	private final String CLASSNAME = this.getClass().getSimpleName();
	private InstanceType instanceType ;
	private final int MILLISLEEP = 2000;
	private AlignmentLogEncapsulation log = new AlignmentLogEncapsulation(this.getClass());

	@Override
	public boolean initialise(InstanceType instanceType) {
		final String METHOD = "initialise";
		final String ID = CLASSNAME + Constants.FULLSTOP + METHOD;	
		this.instanceType = instanceType;



		AlignmentPersistenceToFileClient debugger = new AlignmentPersistenceToFileClient();


		try {
			debugger.initialise(ShamanWrapper.class.getClassLoader(), InstanceType.SHAMAN.getProperties());
			debugger.info("Working...");
		} catch (IllegalThreadStateException | IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		String fileNameSharedMemory = null;
		try {
			fileNameSharedMemory = AlignmentFunctions.getProperty(this.getClass().getClassLoader(), this.instanceType.getProperties(), ConfigurationProperties.SHAREDMEMORYFILE);
		} catch (FileNotFoundException | NullPointerException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		File f = new File( fileNameSharedMemory );

		FileChannel channel = null;
		try {
			channel = FileChannel.open( f.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE );
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}

		MappedByteBuffer b = null;

		final Long sizeOfOrderInBytes = 128L;
		final Long sizeOfOrderBufferBytesInNumberOfOrders = 16L;
		Long fileSizeInBytes = 0L;

		try {
			fileSizeInBytes = Math.multiplyExact(sizeOfOrderInBytes, sizeOfOrderBufferBytesInNumberOfOrders);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}


		try {
			b = channel.map( MapMode.READ_WRITE, 0, fileSizeInBytes );
		} catch (NonReadableChannelException e) {
			//- If the mode is READ_ONLY or an implementation specific map mode requiring read access but this channel was not opened for reading
			log.error(e.getMessage(), e);
			return false;
		} catch (	NonWritableChannelException e) {
			//- If the mode is READ_WRITE. PRIVATE or an implementation specific map mode requiring write access but this channel was not opened for both reading and writing
			log.error(e.getMessage(), e);
			return false;
		} catch (IllegalArgumentException e) {
			//- If the preconditions on the parameters do not hold
			log.error(e.getMessage(), e);
			return false;
		} catch (UnsupportedOperationException e) {
			//- If an unsupported map mode is specified
			log.error(e.getMessage(), e);
			return false;
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			return false;
		}





		Boolean returnValue = Boolean.TRUE;
		StringBuilder sb = new StringBuilder();

		sb
		.append(ID)
		.append(" Started instance=")
		.append(this.instanceType.type)
		.append(" Started version=")
		.append(AlignmentFunctions.getVersion(this.getClass()))
		.append(" SharedMemory File=")
		.append(fileNameSharedMemory)
		//.append(" listening to=")
		//.append(KafkaMessageTopology.MESSAGETOBERECEIVEDBYMULTICASTSERVERFROMMATCHINGENGINE)				
		;

		log.info(sb.toString());


		while (returnValue) {
			try {
				waiter();
			} catch (InterruptedException e) {
				log.error(e.getMessage() , e );
			}
		}
		return returnValue;
	}

	private synchronized void waiter() throws IllegalArgumentException , InterruptedException , IllegalMonitorStateException  {
		this.wait(MILLISLEEP);
	}	
}