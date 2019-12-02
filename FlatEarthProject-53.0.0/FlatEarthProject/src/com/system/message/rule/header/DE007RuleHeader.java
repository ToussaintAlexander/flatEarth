package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE007RuleHeader {

	// DE007 Rule Header - Transmission Date Time Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE007_RULE_HEADER_REPORT_TITLE							= "DE007 Rule Header";
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ID				= 7000;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FIELD			= 7;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_MONTH_007_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_ID				= 7100;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_FIELD				= 7;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean	TRANSMISSION_DATE_DAY_007_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_DAY_007_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ID				= 7200;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FIELD			= 7;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_SUBFIELD			= 2;
	
	public static final boolean	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_HOUR_007_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ID				= 7300;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FIELD			= 7;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_SUBFIELD		= 3;
	
	public static final boolean	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ID				= 7400;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FIELD			= 7;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_SUBFIELD		= 4;
	
	public static final boolean	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_SECOND_007_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
