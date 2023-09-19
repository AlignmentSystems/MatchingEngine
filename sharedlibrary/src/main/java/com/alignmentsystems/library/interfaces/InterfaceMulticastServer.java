package com.alignmentsystems.library.interfaces;
import java.io.IOException;

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.PersistenceToFileClient;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceMulticastServer {
	public boolean initialise(LogEncapsulation log, PersistenceToFileClient debugger, String host, int port) throws Exception;
	public boolean initialise(LogEncapsulation log, PersistenceToFileClient debugger) throws Exception;
	public void multicastThis(byte[] multicastBytes) throws IOException;
	public Long getSequenceNumberForNextMessage();
}