package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE052RuleHeader {
 
	// DE052 Header - Personal Identification Number Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE052_RULE_HEADER_REPORT_TITLE									= "DE052 Rule Header";
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_ID				= 52000;	 
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FIELD			= 52;	 
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_MINIMUM_LENGTH	= 64;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_MAXIMUM_LENGTH	= 64;
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_DATATYPE			= BINARY_DATATYPE;
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_VALUE			= null;
	
}
