package com.alignmentsystems.matching.constants;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	24th August 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	Constants
 *	Description		:
 *****************************************************************************/

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;

import com.alignmentsystems.matching.enumerations.Actors;

/**
 * Constants - keep all re-used constants in one place...
 * @author John Greenan john.greenan@alignment-systems.com
 */
public class Constants {
		public final static String EQUALS = "=".intern();
		public final static String BLOCKER = Constants.EQUALS.repeat(100).intern();
		public final static Long REAPER_SLEEP =  200L;
		
		public final static String SQUAREBRACKETOPEN = "[".intern();
		public final static String SQUAREBRACKETCLOSE = "]".intern();
		
		public final static String BRACKETOPEN = "(".intern();
		
		public final static String BRACKETCLOSE = ")".intern();

		
		public final static String LEADER = "=====>".intern();
		public final static String TRAILER = "<=====".intern();
		
		public final static String DOTPROPERTIES = ".properties".intern();
		
		public final static String MEMBERASETTINGS = Actors.A.targetActor + DOTPROPERTIES ;
		public final static String MEMBERBSETTINGS = Actors.B.targetActor + DOTPROPERTIES ;
		public final static String EXCHANGESETTINGS = Actors.EXCHANGE.targetActor + DOTPROPERTIES;
		
		public final static int NANOSLEEP = 100;

		public final static String LINESEPARATORSTRING = "line.separator".intern();
		public final static String LINESEPARATOR = System.getProperty(LINESEPARATORSTRING);
		public final static byte[] LINESEPARATORBYTES = LINESEPARATOR.getBytes();
		public final static ZoneOffset HERE = ZoneOffset.UTC;
		public final static Charset CHARSET = StandardCharsets.UTF_8;
			
		public final static char TAB = (char)9;
		
		public static final char cEXCLAMATION = 0x21;
		public static final String EXCLAMATION = String.valueOf(cEXCLAMATION).intern();
		public static final char cSEMICOLON = 0x3B;
		public static final char cCOLON = 0x3A;
		public static final char cUNDERSCORE = 0x5F;
		public static final char cDASH = 0x2D;
		public static final String COLON = String.valueOf(cCOLON).intern();
		public static final String SEMICOLON = String.valueOf(cSEMICOLON).intern();
		public static final String UNDERSCORE = String.valueOf(cUNDERSCORE).intern();
		public static final String DASH = String.valueOf(cDASH).intern();
		public static final String LETTER_T = "T".intern();
		public static final String SPACE = " ".intern();
		public static final String LETTER_Z = "Z".intern();
		public static final String FULLSTOP = ".".intern();
	}