package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE040RuleHeader {
 
	// DE040 Header - Service Restriction Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE040_RULE_HEADER_REPORT_TITLE							= "DE040 Rule Header";
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_ID				= 40000;	 
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FIELD			= 40;	 
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_MINIMUM_LENGTH	= 3;
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_MAXIMUM_LENGTH	= 3;
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	SERVICE_RESTRICTION_CODE_040_RULE_HEADER_VALUE			= null;
	
}
