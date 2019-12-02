package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE009RuleHeader {

	// DE009 Rule Header - Settlement Conversion Rate Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE009_RULE_HEADER_REPORT_TITLE								= "DE009 Rule Header";
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ID				= 9000;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FIELD			= 9;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_MINIMUM_LENGTH	= 8;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_MAXIMUM_LENGTH	= 8;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
