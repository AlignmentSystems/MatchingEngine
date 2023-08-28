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

public class LotType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1093;
	public static final char ODD_LOT = '1';
	public static final char ROUND_LOT = '2';
	public static final char BLOCK_LOT = '3';
	public static final char ROUND_LOT_BASED_UPON_UNITOFMEASURE = '4';
	
	public LotType() {
		super(1093);
	}

	public LotType(char data) {
		super(1093, data);
	}
}