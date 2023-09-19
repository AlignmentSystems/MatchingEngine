package com.alignmentsystems.library.interfaces;
import java.io.IOException;

import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentPersistenceToFileClient;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceMulticastServer {
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger, String host, int port) throws Exception;
	public boolean initialise(AlignmentLogEncapsulation log, AlignmentPersistenceToFileClient debugger) throws Exception;
	public void multicastThis(byte[] multicastBytes) throws IOException;
	public Long getSequenceNumberForNextMessage();
}