package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE013RuleHeader {
 
	// DE013 Header - Local Transaction Date Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE013_RULE_HEADER_REPORT_TITLE								= "DE013 Rule Header";
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_ID				= 13013;	 
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FIELD			= 13;	 
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_VALUE			= "12";
	
	//--------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_ID				= 13100;	 
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FIELD			= 13;	 
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_VALUE			= "31";
	
}
