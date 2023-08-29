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

public class Sequence implements Runnable{
	private final static String CLASSNAME = Sequence.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	private LogEncapsulation log = null;
	private final int nanoSleep = 200;
	private AtomicBoolean running = new AtomicBoolean(false);

	public Sequence(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> sequenced) {
		this.log = log;
		this.sequenced = sequenced;
	}

	@Override
	public void run() {

		while (running.get()){

			InterfaceOrder inSeq = sequenced.peek();
			if (inSeq!=null) {

				try {
					Thread.currentThread();
					Thread.sleep(0L , nanoSleep);

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
			// TODO Auto-generated method stub
			//poll A ==>add to sequenced
			//Poll B ==>add to sequenced.
			//But, how do you ensure that strict time order is observed

		}
	}
}
