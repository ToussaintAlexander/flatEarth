package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE042RuleHeader {
 
	// DE042 Header - Card Acceptor Identification Code Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE042_RULE_HEADER_REPORT_TITLE										= "DE042 Rule Header";
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_ID				= 42000;	 
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FIELD				= 42;	 
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_MINIMUM_LENGTH	= 15;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_MAXIMUM_LENGTH	= 15;
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_DATATYPE			= ALPHANUMERIC_SPECIAL_DATATYPE;
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_VALUE				= null;
	
}
