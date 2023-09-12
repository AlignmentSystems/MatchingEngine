/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package com.alignmentsystems.fix44.field;

import quickfix.IntField;

public class ContingencyType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1385;
	public static final int ONE_CANCELS_THE_OTHER = 1;
	public static final int ONE_TRIGGERS_THE_OTHER = 2;
	public static final int ONE_UPDATES_THE_OTHER_ABSOLUTE_QUANTITY_REDUCTION = 3;
	public static final int ONE_UPDATES_THE_OTHER_PROPORTIONAL_QUANTITY_REDUCTION = 4;
	
	public ContingencyType() {
		super(1385);
	}

	public ContingencyType(int data) {
		super(1385, data);
	}
}