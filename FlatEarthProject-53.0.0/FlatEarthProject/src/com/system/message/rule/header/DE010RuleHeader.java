package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE010RuleHeader {
 
	// DE010 Header - Cardholder Billing Conversion Rate Field Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE010_RULE_HEADER_REPORT_TITLE										= "DE010 Rule Header";
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_ID				= 10100;	 
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FIELD			= 10;	 
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_MINIMUM_LENGTH	= 8;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_MAXIMUM_LENGTH	= 8;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_VALUE			= "00000125";
	
}
