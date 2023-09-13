package com.alignmentsystems.library;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	1st September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	AlignmentBuyOrderComparator
 *	Description		:
 *****************************************************************************/

import java.util.Comparator;

import com.alignmentsystems.library.interfaces.InterfaceOrder;
/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public class AlignmentOrderComparatorBuy implements Comparator<InterfaceOrder>{
	/**
	 * Compares this date-time to another date-time. The comparison is based on the
	 * instant then on the local date-time. It is "consistent with equals", as
	 * defined by Comparable.
	 * 
	 * For example, the following is the comparator order:
	 * 
	 * 2008-12-03T10:30+01:00 
	 * 2008-12-03T11:00+01:00 
	 * 2008-12-03T12:00+02:00
	 * 2008-12-03T11:30+01:00 
	 * 2008-12-03T12:00+01:00 
	 * 2008-12-03T12:30+01:00 
	 * Values #2 and #3 represent the same instant on the time-line. When two values
	 * represent the same instant, the local date-time is compared to distinguish
	 * them. This step is needed to make the ordering consistent with equals().
	 * Specified by: compareTo(...) in Comparable Parameters: other the other
	 * date-time to compare to, not null 
	 * Returns: the comparator value, negative if less, positive if greater
	 */
	@Override
	public int compare(InterfaceOrder o1, InterfaceOrder o2) {
		final int lessThan = -1;
		final int moreThan = 1;
		final double thisPrice = o1.getLimitPrice();
		final double thatPrice = o2.getLimitPrice();

		
		if (thisPrice > thatPrice) {
			return lessThan;
		}else if(thisPrice < thatPrice) {
			return moreThan;
		}else {
			//limit price is identical, so have to look at the timestamp
			//Top of book is the oldest timestamp
			if(o1.getTimestamp().compareTo(o2.getTimestamp()) < 0) {
				return lessThan;
			} else {
				return moreThan;
			}
		}
	}
}
