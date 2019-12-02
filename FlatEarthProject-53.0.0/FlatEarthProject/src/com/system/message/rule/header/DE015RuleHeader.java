package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE015RuleHeader {
 
	// DE015 Header - Settlement Date Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE015_RULE_HEADER_REPORT_TITLE							= "DE015 Rule Header";
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_ID				= 15015;	 
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FIELD				= 15;	 
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_DATE_MONTH_015_RULE_HEADER_VALUE				= "11";
	
	//------------------------------------------------------------------------------------------
	
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_ID					= 15015;	 
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_FIELD				= 15;	 
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean SETTLEMENT_DATE_DAY_015_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_DATE_DAY_015_RULE_HEADER_VALUE				= "30";
	
}
