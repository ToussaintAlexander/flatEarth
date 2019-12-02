package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE018RuleHeader {
 
	// DE000 Header - Merchant Type Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE018_RULE_HEADER_REPORT_TITLE					= "DE018 Rule Header";
	
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_ID				= 18000;	 
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_FIELD				= 18;	 
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean MERCHANT_TYPE_018_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_MINIMUM_LENGTH	= 4;
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_MAXIMUM_LENGTH	= 4;
	
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	MERCHANT_TYPE_018_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	MERCHANT_TYPE_018_RULE_HEADER_VALUE				= "1234";
	
}
