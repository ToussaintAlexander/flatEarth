package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE016RuleHeader {
 
	// DE016 Header - Conversion Date Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE016_RULE_HEADER_REPORT_TITLE							= "DE016 Rule Header";
	
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_ID				= 16000;	 
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_FIELD				= 16;	 
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean CONVERSION_DATE_MONTH_016_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CONVERSION_DATE_MONTH_016_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CONVERSION_DATE_MONTH_016_RULE_HEADER_VALUE				= "10";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_ID					= 16100;	 
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_FIELD				= 16;	 
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean CONVERSION_DATE_DAY_016_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CONVERSION_DATE_DAY_016_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CONVERSION_DATE_DAY_016_RULE_HEADER_VALUE				= "31";
	
}
