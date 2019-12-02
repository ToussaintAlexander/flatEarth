package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE021RuleHeader {
 
	// DE021 Header - Forwarding Institution Country Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE021_RULE_HEADER_REPORT_TITLE										= "DE021 Rule Header";
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_ID				= 21000;	 
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FIELD			= 21;	 
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_MINIMUM_LENGTH	= 3;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_MAXIMUM_LENGTH	= 3;
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_VALUE			= "840";
	
}
