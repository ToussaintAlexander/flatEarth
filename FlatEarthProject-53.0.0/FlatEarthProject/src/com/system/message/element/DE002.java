package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE002 {

	public static final int 	NUMBER_OF_DE002_FIELDS				= 3;
	
	public static final int 	BIN_INDEX							= 0;
	public static final int 	PAN_INDEX							= 1;
	public static final int 	CHECK_DIGIT_INDEX					= 2;
	
	public static final int 	ACCOUNT_NUMBER_LENGTH				= 16;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	PRIMARY_ACCOUNT_NUMBER_002_ID		= 2000;		 
	public static final int		PRIMARY_ACCOUNT_NUMBER_002_FIELD	= 2;		 
	
	public static final int 	BIN_002_ID							= 2000;
	public static final int 	BIN_002_FIELD						= 2;	
	public static final int 	BIN_002_SUBFIELD					= 0;
	
	public static final int 	BIN_002_FORMAT						= FIXED_FORMAT;
	
	public static final int 	BIN_002_LENGTH						= 6;
	
	public static final int 	BIN_002_ENCODING					= EBCDIC_ENCODING;
	public static final int 	BIN_002_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	BIN_002_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_002_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_002_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	BIN_002_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	BIN_002_VALUE						= "450250";
	
	//--------------------------------------------------------------- 
	
	public static final int 	PAN_002_ID							= 2100;
	public static final int 	PAN_002_FIELD						= 2;	
	public static final int 	PAN_002_SUBFIELD					= 1;
	
	public static final int 	PAN_002_FORMAT						= FIXED_FORMAT;
	
	public static final int 	PAN_002_LENGTH						= 9;
	
	public static final int 	PAN_002_ENCODING					= EBCDIC_ENCODING;
	public static final int 	PAN_002_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	PAN_002_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_002_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_002_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	PAN_002_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	PAN_002_VALUE						= "123456789";
	
	//---------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_002_ID					= 2200;
	public static final int 	CHECK_DIGIT_002_FIELD				= 2;	
	public static final int 	CHECK_DIGIT_002_SUBFIELD			= 2;
	
	public static final int 	CHECK_DIGIT_002_FORMAT				= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_002_LENGTH				= 1;
	
	public static final int 	CHECK_DIGIT_002_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_002_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_002_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_002_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_002_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_002_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CHECK_DIGIT_002_VALUE				= "5";
	
}
