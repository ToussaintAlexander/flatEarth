package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE017RuleHeader {
 
	// DE017 Header - Capture Date Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE017_RULE_HEADER_REPORT_TITLE						= "DE017 Rule Header";
	
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_ID				= 17000;	 
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_FIELD			= 17;	 
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean CAPTURE_DATE_MONTH_017_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CAPTURE_DATE_MONTH_017_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CAPTURE_DATE_MONTH_017_RULE_HEADER_VALUE			= "09";
	
	//-----------------------------------------------------------------------------------------
	
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_ID					= 17100;	 
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_FIELD				= 17;	 
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean CAPTURE_DATE_DAY_017_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CAPTURE_DATE_DAY_017_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CAPTURE_DATE_DAY_017_RULE_HEADER_VALUE				= "30";
	
}
