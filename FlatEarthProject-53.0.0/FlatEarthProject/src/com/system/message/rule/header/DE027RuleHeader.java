package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE027RuleHeader {
 
	// DE027 Header - Authorizing Identification Response Length Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE027_RULE_HEADER_REPORT_TITLE												= "DE027 Rule Header";
	
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_ID				= 27000;	 
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FIELD			= 27;	 
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_MAXIMUM_LENGTH	= 1;
	
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_VALUE			= "2";
	
}
