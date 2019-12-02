package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE060RuleHeader {
 
	// DE060 Header - Terminal Type Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE060_RULE_HEADER_REPORT_TITLE												= "DE060 Rule Header";
	

	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_ID											= 60000;	 
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_FIELD											= 60;	 
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_SUBFIELD										= 0;
	
	public static final boolean TERMINAL_TYPE_060_RULE_HEADER_FIRE											= RULE_NOT_FIRED_B;
	
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_FORMAT										= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_MINIMUM_LENGTH								= 1;   	 
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_MAXIMUM_LENGTH								= 1;   	 
	
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_ENCODING										= EBCDIC_ENCODING;
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_DATATYPE										= NUMERIC_DATATYPE;
	
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_SOURCE										= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_DIRECTION										= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_EXISTENCE										= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_TYPE_060_RULE_HEADER_CHANGE										= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_TYPE_060_RULE_HEADER_VALUE											= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_ID								= 60000;	 
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FIELD								= 60;	 
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_SUBFIELD							= 1;
	
	public static final boolean TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_MINIMUM_LENGTH					= 1;   	 
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_MAXIMUM_LENGTH					= 1;  
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_VALUE								= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_ID										= 60000;	 
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_FIELD									= 60;	 
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_SUBFIELD								= 2;
	
	public static final boolean CHIP_CONDITION_CODE_060_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_MINIMUM_LENGTH							= 1;   	 
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_MAXIMUM_LENGTH							= 1;    	 
	
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
	
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CHIP_CONDITION_CODE_060_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	CHIP_CONDITION_CODE_060_RULE_HEADER_VALUE									= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_ID				= 60000;	 
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FIELD				= 60;	 
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH	= 1;   	 
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH							= 1;   	 
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_VALUE				= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_ID								= 60000;	 
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FIELD							= 60;	 
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_SUBFIELD							= 4;
	
	public static final boolean MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH					= 2;   	 
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH					= 2;  	 
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_VALUE							= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_ID										= 60000;	 
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_FIELD									= 60;	 
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_SUBFIELD								= 5;
	
	public static final boolean CARDHOLDER_ID_METHOD_060_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_MINIMUM_LENGTH							= 1;   	 
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_MAXIMUM_LENGTH							= 1;  	 
	
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_ID_METHOD_060_RULE_HEADER_VALUE									= null;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_ID									= 60000;	 
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FIELD								= 60;	 
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_SUBFIELD								= 6;
	
	public static final boolean PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH						= 1;   	 
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH						= 1;    	 
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_VALUE								= null;
	
}
