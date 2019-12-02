package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE038RuleHeader {
 
	// DE038 Header - Authorization Identification Response Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE038_RULE_HEADER_REPORT_TITLE											= "DE038 Rule Header";
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_ID				= 38000;	 
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FIELD				= 38;	 
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_MINIMUM_LENGTH	= 6;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_MAXIMUM_LENGTH	= 6;
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_DATATYPE			= ALPHANUMERIC_DATATYPE;
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_VALUE				= null;
	
}
