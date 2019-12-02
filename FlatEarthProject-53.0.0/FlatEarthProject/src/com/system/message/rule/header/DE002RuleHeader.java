package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE002RuleHeader {

	// DE002 Rule Header - Primary Account Number (PAN) Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE002_RULE_HEADER_REPORT_TITLE				= "DE002 Rule Header";
	
	public static final int 	BIN_002_RULE_HEADER_ID						= 2000;
	public static final int 	BIN_002_RULE_HEADER_FIELD					= 2;	
	public static final int 	BIN_002_RULE_HEADER_SUBFIELD				= 0;
	
	public static final boolean	BIN_002_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	public static final int 	BIN_002_RULE_HEADER_FORMAT					= FIXED_FORMAT;
	
	public static final int 	BIN_002_RULE_HEADER_MINIMUM_LENGTH			= 6;
	public static final int 	BIN_002_RULE_HEADER_MAXIMUM_LENGTH			= 6;
	
	public static final int 	BIN_002_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	BIN_002_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	BIN_002_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_002_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_002_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	BIN_002_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	//--------------------------------------------------------------- 
	
	public static final int 	PAN_002_RULE_HEADER_ID						= 2100;
	public static final int 	PAN_002_RULE_HEADER_FIELD					= 2;	
	public static final int 	PAN_002_RULE_HEADER_SUBFIELD				= 1;
	
	public static final boolean	PAN_002_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	public static final int 	PAN_002_RULE_HEADER_FORMAT					= FIXED_FORMAT;
	
	public static final int 	PAN_002_RULE_HEADER_MINIMUM_LENGTH			= 9;
	public static final int 	PAN_002_RULE_HEADER_MAXIMUM_LENGTH			= 9;
	
	public static final int 	PAN_002_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	PAN_002_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	PAN_002_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_002_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_002_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	PAN_002_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	//---------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_ID				= 2200;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_FIELD			= 2;	
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_SUBFIELD		= 2;
	
	public static final boolean	CHECK_DIGIT_002_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_MAXIMUM_LENGTH	= 1;
	
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_002_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
