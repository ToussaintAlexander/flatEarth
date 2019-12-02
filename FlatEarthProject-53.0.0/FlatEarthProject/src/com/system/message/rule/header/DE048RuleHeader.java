package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE048RuleHeader {
 
	// DE048 Header - Additional Data Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE048_RULE_HEADER_REPORT_TITLE					= "DE048 Rule Header";
	
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_ID				= 48000;	 
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_FIELD			= 48;	 
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean ADDITIONAL_DATA_048_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_FORMAT			= VARIABLE_FORMAT;	
	
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_MINIMUM_LENGTH	= 999;
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_MAXIMUM_LENGTH	= 999;
	
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	ADDITIONAL_DATA_048_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	ADDITIONAL_DATA_048_RULE_HEADER_VALUE			= null;
	
}
