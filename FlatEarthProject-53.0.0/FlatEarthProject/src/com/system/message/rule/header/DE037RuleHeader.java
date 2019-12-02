package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE037RuleHeader {
 
	// DE037 Header - Retrieval Reference Number Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE037_RULE_HEADER_REPORT_TITLE								= "DE037 Rule Header";
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_ID					= 37000;	 
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FIELD				= 37;	 
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_SUBFIELD				= 0;
	
	public static final boolean TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_MINIMUM_LENGTH		= 1;
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_MAXIMUM_LENGTH		= 1;
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_DATATYPE				= ALPHANUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_DATE_YEAR_037_RULE_HEADER_VALUE				= null;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_ID							= 37000;	 
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_FIELD						= 37;	 
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_SUBFIELD					= 1;
	
	public static final boolean JULIAN_DAY_MONTH_037_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_MINIMUM_LENGTH				= 3;
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_MAXIMUM_LENGTH				= 3;
	
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	JULIAN_DAY_MONTH_037_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	JULIAN_DAY_MONTH_037_RULE_HEADER_VALUE						= null;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_ID					= 37000;	 
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FIELD				= 37;	 
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_SUBFIELD				= 2;
	
	public static final boolean TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_DATATYPE				= ALPHANUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_TIME_HOUR_037_RULE_HEADER_VALUE				= null;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_ID				= 37000;	 
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FIELD			= 37;	 
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_MINIMUM_LENGTH	= 6;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_MAXIMUM_LENGTH	= 6;
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_DATATYPE			= ALPHANUMERIC_DATATYPE;
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_VALUE			= null;
	
}
