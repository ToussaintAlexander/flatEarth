package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE001RuleHeader {

	// DE001 Rule Header - Primary Bitmap Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE001_RULE_HEADER_REPORT_TITLE					= "DE001 Rule Header";
	
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_ID				= 1000;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_FIELD			= 1;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean	PRIMARY_BITMAP_001_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_MINIMUM_LENGTH	= 64;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_MAXIMUM_LENGTH	= 64;
	
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_DATATYPE			= BINARY_DATATYPE;
	
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PRIMARY_BITMAP_001_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
