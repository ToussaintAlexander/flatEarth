package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE057RuleHeader {
 
	// DE057 Header - Unassigned Data Element Field Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE057_RULE_HEADER_REPORT_TITLE							= "DE057 Rule Header";
	
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_ID				= 57000;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FIELD			= 57;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FORMAT			= UNASSIGNED_FORMAT;
	
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_MINIMUM_LENGTH	= 0;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_MAXIMUM_LENGTH	= 0;
	
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
