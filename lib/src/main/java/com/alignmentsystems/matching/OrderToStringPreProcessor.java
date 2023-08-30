package com.alignmentsystems.matching;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.alignmentsystems.matching.constants.Constants;
import com.alignmentsystems.matching.enumerations.TimestampUsage;
import com.alignmentsystems.matching.interfaces.InterfaceOrder;
import com.alignmentsystems.matching.interfaces.InterfaceOrderToStringProcessor;
import com.alignmentsystems.matching.library.LibraryFunctions;

public class OrderToStringPreProcessor implements Runnable, InterfaceOrderToStringProcessor{
	private final static String CLASSNAME = OrderToStringPreProcessor.class.getSimpleName().toString();
	private ConcurrentLinkedQueue<InterfaceOrder> inQueue;
	private ConcurrentLinkedQueue<String> outQueue;
	private final int nanoSleep = 200;
	private AtomicBoolean running = new AtomicBoolean(false);
	private Long logFileSequenceNumber = 0L;
	private HashSet<String> seen = new HashSet<String>();
	private List<InterfaceOrder> deDupedOrders = new ArrayList<InterfaceOrder>();

	public OrderToStringPreProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean initialise(ConcurrentLinkedQueue<InterfaceOrder> inQueue, ConcurrentLinkedQueue<String> outQueue) {
		this.inQueue = inQueue;
		this.outQueue =outQueue;		
		return true;
	}







	@Override
	public void run() {
		running.set(true);

		while (running.get()){

			InterfaceOrder inSeq = inQueue.poll();

			if (inSeq!=null) {

				//Right, so we have got a message.  But - is this a duplicate? How do we know?
				//This is where there are arguably a number of ways to do this
				//TODO - this needs re-writing to handle FIX message replay and other edge cases.
				//The message would have to be more closely inspected, this is just a proof-of-concept/toy
				deDupedOrders.add(inSeq);
				Boolean wasDuplicate = deDupedOrders.removeIf(e -> !seen.add(e.getOrderId()));
				if(!wasDuplicate) {
					outQueue.add(inSeq.toString());
				}

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
		}

	}




}
