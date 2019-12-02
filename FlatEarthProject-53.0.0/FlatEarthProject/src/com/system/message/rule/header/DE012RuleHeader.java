package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE012RuleHeader {
 
	// DE012 Header - Local Transaction Time Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE012_RULE_HEADER_REPORT_TITLE									= "DE012 Rule Header";
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_ID					= 12012;	 
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FIELD				= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_VALUE				= "23";
	
	//-------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_ID				= 12100;	 
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FIELD				= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_MAXIMUM_LENGTH	= 2;  	 
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_VALUE				= "59";
	
	//-------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_ID				= 12200;	 
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FIELD				= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_SUBFIELD			= 2;
	
	public static final boolean LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_MAXIMUM_LENGTH	= 2;  	    	 
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_VALUE				= "59";
	
}
