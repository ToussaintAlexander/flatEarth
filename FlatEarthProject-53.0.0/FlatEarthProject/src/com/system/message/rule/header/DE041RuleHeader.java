package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE041RuleHeader {
 
	// DE041 Header - Card Acceptor Terminal Identification Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE041_RULE_HEADER_REPORT_TITLE											= "DE041 Rule Header";
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_ID				= 41000;	 
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_FIELD				= 41;	 
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_MINIMUM_LENGTH	= 8;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_MAXIMUM_LENGTH	= 8;
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_DATATYPE			= ALPHANUMERIC_SPECIAL_DATATYPE;
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_HEADER_VALUE				= null;
	
}
