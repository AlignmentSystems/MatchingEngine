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

public class PosMaintAction extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 712;
	public static final int NEW_USED_TO_INCREMENT_THE_OVERALL_TRANSACTION_QUANTITY = 1;
	public static final int REPLACE_USED_TO_OVERRIDE_THE_OVERALL_TRANSACTION_QUANTITY_OR_SPECIFI_ADD_MESSAGES_BASED_ON_THE_REFERENCE_ID = 2;
	public static final int CANCEL_USED_TO_REMOVE_THE_OVERALL_TRANSACTION_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_REFERENCE_ID = 3;
	public static final int REVERSE_USED_TO_COMPLETELLY_BACK_OUT_THE_TRANSACTION_SUCH_THAT_THE_TRANSACTION_NEVER_EXISTED = 4;
	
	public PosMaintAction() {
		super(712);
	}

	public PosMaintAction(int data) {
		super(712, data);
	}
}