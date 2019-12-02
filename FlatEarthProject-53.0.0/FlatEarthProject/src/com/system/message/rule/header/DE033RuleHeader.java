package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE033RuleHeader {
 
	// DE033 Header - Forwarding Institution Identification Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE033_RULE_HEADER_REPORT_TITLE												= "DE033 Rule Header";
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_ID				= 33000;	 
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FIELD			= 33;	 
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FORMAT			= VARIABLE_FORMAT;	
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_MINIMUM_LENGTH	= 11;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_MAXIMUM_LENGTH	= 11;
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_VALUE			= null;
	
}
