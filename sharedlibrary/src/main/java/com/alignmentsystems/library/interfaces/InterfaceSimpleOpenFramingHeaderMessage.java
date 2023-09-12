package com.alignmentsystems.library.interfaces;
import com.alignmentsystems.library.exceptions.RepresentationSBENotAvailable;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public interface InterfaceSimpleOpenFramingHeaderMessage {
	public byte[] getSOFHWrappedSBEMessage() throws RepresentationSBENotAvailable;
}
