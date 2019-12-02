package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE064RuleHeader {
 
	// DE064 Header - Message Authentication Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE064_RULE_HEADER_REPORT_TITLE								= "DE064 Rule Header";
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_ID				= 640000;	 
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FIELD			= 64;	 
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_MINIMUM_LENGTH	= 16;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_MAXIMUM_LENGTH	= 16;
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_VALUE			= null;
	
}