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

import quickfix.CharField;

public class MDUpdateAction extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 279;
	public static final char NEW = '0';
	public static final char CHANGE = '1';
	public static final char DELETE = '2';
	public static final char DELETE_THRU = '3';
	public static final char DELETE_FROM = '4';
	public static final char OVERLAY = '5';
	
	public MDUpdateAction() {
		super(279);
	}

	public MDUpdateAction(char data) {
		super(279, data);
	}
}