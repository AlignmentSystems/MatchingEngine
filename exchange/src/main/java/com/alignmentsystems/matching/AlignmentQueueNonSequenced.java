package com.alignmentsystems.matching;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentQueueNonSequenced
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.library.AlignmentLogEncapsulation;
import com.alignmentsystems.library.AlignmentUEH;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceQueueNonSequenced;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentQueueNonSequenced implements Runnable, InterfaceQueueNonSequenced {
	protected final static String CLASSNAME = AlignmentQueueNonSequenced.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> nonSequencedIn;
	@SuppressWarnings("unused")
	private AlignmentLogEncapsulation log = null;
	private final static int MILLISLEEP = 200;
	private AtomicBoolean running = new AtomicBoolean(false);
	private AtomicBoolean initialised = new AtomicBoolean(false);

	@Override
	public void run() {
		
		AlignmentUEH ueh = new AlignmentUEH();
		
		Thread.setDefaultUncaughtExceptionHandler(ueh);

		
		running.set(true);

		while (running.get()) {

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
	public boolean addReceivedOrder(InterfaceOrder io) {
		return nonSequencedIn.add(io);

	}

	@Override
	public boolean initialise(AlignmentLogEncapsulation log) {
		final String METHOD = "initialise";
		
		this.log = log;
		
		
		if (!initialised.get()) {
			
			this.nonSequencedIn = new ConcurrentLinkedQueue<InterfaceOrder> ();
			
			log.info(CLASSNAME + "." + METHOD);

			initialised.set(true);
		}
		return initialised.get();
	}

	

	@Override
	public ConcurrentLinkedQueue<InterfaceOrder> getOutputQueue() {
		return this.nonSequencedIn;
	}
}