package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE032RuleHeader {
 
	// DE032 Header - Acquiring Institution Identification Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE032_RULE_HEADER_REPORT_TITLE											= "DE032 Rule Header";
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_ID				= 32000;	 
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FIELD			= 32;	 
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_SUBFIELD		= 0;
	
	public static final boolean ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FORMAT			= VARIABLE_FORMAT;	
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_MINIMUM_LENGTH	= 11;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_MAXIMUM_LENGTH	= 11;
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_VALUE			= null;
	
}
