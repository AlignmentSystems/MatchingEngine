package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Sequence
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class Sequence implements Runnable{
	private final static String CLASSNAME = Sequence.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> sequencedIn;
	private ConcurrentLinkedQueue<InterfaceOrder> sequencedOut;
	private LogEncapsulation log = null;
	private final static int MILLISLEEP = 200;
	private AtomicBoolean running = new AtomicBoolean(false);

	public Sequence(
			LogEncapsulation log
			, ConcurrentLinkedQueue<InterfaceOrder> sequencedIn
			, ConcurrentLinkedQueue<InterfaceOrder> sequencedOut) {
		this.log = log;
		this.sequencedIn = sequencedIn;
		this.sequencedOut = sequencedOut;
	}
	
	
	

	@Override
	public void run() {
		running.set(true);
		
		while (running.get()){

			InterfaceOrder inSeq = sequencedIn.peek();
			
			if (inSeq!=null) {
				sequencedOut.add(inSeq);

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
	}
}