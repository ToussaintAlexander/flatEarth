package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE004RuleHeader {

	// DE004 Rule Header - Transaction Amount Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE004_HEADER_REPORT_TITLE							= "DE004 Rule Header";
	
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_ID				= 4000;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_FIELD			= 4;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean	TRANSACTION_AMOUNT_004_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_MINIMUM_LENGTH	= 12;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_MAXIMUM_LENGTH	= 12;
	
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_AMOUNT_004_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
