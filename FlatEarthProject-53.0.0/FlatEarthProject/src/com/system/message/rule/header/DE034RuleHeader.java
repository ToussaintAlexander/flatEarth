package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE034RuleHeader {
 
	// DE034 Header - Extended Primary Account Number Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE034_RULE_HEADER_REPORT_TITLE									= "DE034 Rule Header";
	
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_ID				= 34000;	 
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FIELD			= 34;	 
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FORMAT			= VARIABLE_FORMAT;	
	
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_MINIMUM_LENGTH	= 34;
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_MAXIMUM_LENGTH	= 34;
	
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_DATATYPE		= NUMERIC_SPECIAL_DATATYPE;
	
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_VALUE			= null;
	
}
