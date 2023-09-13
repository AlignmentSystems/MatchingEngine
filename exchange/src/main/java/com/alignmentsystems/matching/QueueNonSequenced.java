package com.alignmentsystems.matching;

/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	QueueNonSequenced
 *	Description		:
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.library.LogEncapsulation;
import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceQueueNonSequenced;

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class QueueNonSequenced implements Runnable, InterfaceQueueNonSequenced {
	protected final static String CLASSNAME = QueueNonSequenced.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> nonSequencedIn;
	private LogEncapsulation log = null;
	private final static int MILLISLEEP = 200;
	private AtomicBoolean running = new AtomicBoolean(false);

	@Override
	public void run() {
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
	public void addReceivedOrder(InterfaceOrder io) {
		nonSequencedIn.add(io);

	}

	@Override
	public boolean initialise(LogEncapsulation log) {
		this.log = log;
		return true;
	}

	@Override
	public ConcurrentLinkedQueue<InterfaceOrder> getQueue() {
		return this.nonSequencedIn;
	}
}