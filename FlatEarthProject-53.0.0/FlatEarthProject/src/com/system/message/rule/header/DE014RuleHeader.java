package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE014RuleHeader {
 
	// DE014 Header - Expiration Date Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE014_RULE_HEADER_REPORT_TITLE							= "DE014 Rule Header";
	
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_ID					= 14014;	 
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_FIELD				= 14;	 
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean EXPIRATION_DATE_YEAR_014_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_014_RULE_HEADER_VALUE				= "17";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_ID				= 14014;	 
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_FIELD				= 14;	 
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean EXPIRATION_DATE_MONTH_014_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_MAXIMUM_LENGTH	= 2;   	 
	
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_014_RULE_HEADER_VALUE				= "12";
	
}
