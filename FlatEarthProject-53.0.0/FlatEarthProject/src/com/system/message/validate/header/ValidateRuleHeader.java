package com.system.message.validate.header;

import static com.system.configuration.constants.Element.*;

public abstract interface ValidateRuleHeader {
 
  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	VALIDATE_RULE_HEADER_REPORT_TITLE	= "Validate Rule Header";
	
	public static final int 	VALIDATE_RULE_HEADER_ID				= 0;
	public static final int 	VALIDATE_RULE_HEADER_FIELD			= 0;
	public static final int 	VALIDATE_RULE_HEADER_SUBFIELD		= 0;
	
	public static final int		VALIDATE_RULE_HEADER_FIRE			= 0;
	public static final int 	VALIDATE_RULE_HEADER_FORMAT			= 0;
	
	public static final int 	VALIDATE_RULE_HEADER_MINIMUM_LENGTH	= 0;
	public static final int 	VALIDATE_RULE_HEADER_MAXIMUM_LENGTH	= 0;
	
	public static final int 	VALIDATE_RULE_HEADER_ENCODING		= 0;
	public static final int 	VALIDATE_RULE_HEADER_DATATYPE		= 0;
	
	public static final int 	VALIDATE_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	VALIDATE_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	VALIDATE_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	VALIDATE_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
}
