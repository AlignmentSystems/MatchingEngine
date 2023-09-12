package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	31st August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	QueueSequenced
 *	Description		:	
 *****************************************************************************/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.library.constants.Constants;
import com.alignmentsystems.library.interfaces.InterfaceOrder;
import com.alignmentsystems.library.interfaces.InterfaceOrderToStringProcessor;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class QueueSequenced implements Runnable, InterfaceOrderToStringProcessor{
	private final static String CLASSNAME = QueueSequenced.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> inQueue;
	private ConcurrentLinkedQueue<String> outQueue;
	private final int milliSleep = 200;
	private final int arrayListSize = 100;
	private final int initialCapacityHashSet =100;
	private final float loadFactorHashSet = (float) 0.75;


	private AtomicBoolean running = new AtomicBoolean(false);
	private HashSet<String> seen = new HashSet<String>(initialCapacityHashSet,loadFactorHashSet);
	private List<InterfaceOrder> deDupedOrders = new ArrayList<InterfaceOrder>(arrayListSize);

	public QueueSequenced() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue, ConcurrentLinkedQueue<String> outQueue) {
		this.inQueue = inQueue;
		this.outQueue = outQueue;		
		return true;
	}


	@Override
	public void run() {
		running.set(true);
		String trialString = null;
		String uniqueNessTuple = null;	
		while (running.get()){

			InterfaceOrder inSeq = inQueue.poll();

			if (inSeq!=null) {

				//Right, so we have got a message.  But - is this a duplicate? How do we know?
				//This is where there are arguably a number of ways to do this
				//TODO - this needs re-writing to handle FIX message replay and other edge cases.
				//The message would have to be more closely inspected, this is just a proof-of-concept/toy
				trialString = inSeq.toString();
				uniqueNessTuple = inSeq.getOrderUniquenessTuple();
				if (seen.add(uniqueNessTuple)){
					deDupedOrders.add(inSeq);
					outQueue.add(trialString);
				}

			}
			try {
				Thread.currentThread();
				Thread.sleep(milliSleep);

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