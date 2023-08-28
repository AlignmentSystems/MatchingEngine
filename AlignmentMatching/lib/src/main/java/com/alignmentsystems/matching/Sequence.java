package com.alignmentsystems.matching;
/******************************************************************************
 * 
 *	Author			:	John Greenan sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Description		:	LibraryFunctions
 * 
 *****************************************************************************/

import java.util.concurrent.ConcurrentLinkedQueue;

import com.alignmentsystems.matching.interfaces.InterfaceOrder;

public class Sequence implements Runnable{
	private ConcurrentLinkedQueue<InterfaceOrder> sequenced = new ConcurrentLinkedQueue<InterfaceOrder>(); 
	private LogEncapsulation log = null;
	
	public Sequence(LogEncapsulation log, ConcurrentLinkedQueue<InterfaceOrder> sequenced) {
		this.log = log;
		this.sequenced = sequenced;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//poll A ==>add to sequenced
		//Poll B ==>add to sequenced.
		//But, how do you ensure that strict time order is observed
		
	}

}
