package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE025RuleHeader {
 
	// DE025 Header - Point of Service Condition Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE025_RULE_HEADER_REPORT_TITLE									= "DE025 Rule Header";
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_ID				= 25000;	 
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FIELD			= 25;	 
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_VALUE			= "00";
	
}
