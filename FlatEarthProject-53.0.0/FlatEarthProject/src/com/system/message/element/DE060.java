package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE060 {

	public static final int NUMBER_OF_DE060_FIELDS	                    					= 7;
	
	public static final int TERMINAL_TYPE_060_INDEX											= 0;
	
	/***************************************************************		 
	 ***************************************************************
	 */
	
	public static final int 	TERMINAL_TYPE_060_ID										= 60000;	 
	public static final int 	TERMINAL_TYPE_060_FIELD										= 60;	 
	public static final int 	TERMINAL_TYPE_060_SUBFIELD									= 0;
	
	public static final int 	TERMINAL_TYPE_060_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_TYPE_060_LENGTH									= 1;   	 
	
	public static final int 	TERMINAL_TYPE_060_ENCODING									= EBCDIC_ENCODING;
	public static final int 	TERMINAL_TYPE_060_DATATYPE									= NUMERIC_DATATYPE;
	
	public static final int 	TERMINAL_TYPE_060_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_TYPE_060_DIRECTION									= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_TYPE_060_EXISTENCE									= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_TYPE_060_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_TYPE_060_VALUE										= "10";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_ID							= 60000;	 
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_FIELD							= 60;	 
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_SUBFIELD						= 1;
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_LENGTH						= 1;   	 
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_ENCODING						= EBCDIC_ENCODING;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_ENTRY_CAPABILITY_060_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_ENTRY_CAPABILITY_060_VALUE							= "2";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CHIP_CONDITION_CODE_060_ID									= 60000;	 
	public static final int 	CHIP_CONDITION_CODE_060_FIELD								= 60;	 
	public static final int 	CHIP_CONDITION_CODE_060_SUBFIELD							= 2;
	
	public static final int 	CHIP_CONDITION_CODE_060_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	CHIP_CONDITION_CODE_060_LENGTH								= 1;   	 
	
	public static final int 	CHIP_CONDITION_CODE_060_ENCODING							= EBCDIC_ENCODING;
	public static final int 	CHIP_CONDITION_CODE_060_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	CHIP_CONDITION_CODE_060_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHIP_CONDITION_CODE_060_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHIP_CONDITION_CODE_060_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	CHIP_CONDITION_CODE_060_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	CHIP_CONDITION_CODE_060_VALUE								= "3";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_ID			= 60000;	 
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_FIELD			= 60;	 
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_SUBFIELD		= 3;
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_LENGTH		= 1;   	 
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_VALUE			= "6";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_ID							= 60000;	 
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_FIELD						= 60;	 
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_SUBFIELD						= 4;
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_LENGTH						= 2;   	 
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_ENCODING						= EBCDIC_ENCODING;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	MOTO_ECI_PAYMENT_INDICATOR_060_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	MOTO_ECI_PAYMENT_INDICATOR_060_VALUE						= "82";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	CARDHOLDER_ID_METHOD_060_ID									= 60000;	 
	public static final int 	CARDHOLDER_ID_METHOD_060_FIELD								= 60;	 
	public static final int 	CARDHOLDER_ID_METHOD_060_SUBFIELD							= 5;
	
	public static final int 	CARDHOLDER_ID_METHOD_060_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_ID_METHOD_060_LENGTH								= 1;   	 
	
	public static final int 	CARDHOLDER_ID_METHOD_060_ENCODING							= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_ID_METHOD_060_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_ID_METHOD_060_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_ID_METHOD_060_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_ID_METHOD_060_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_ID_METHOD_060_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_ID_METHOD_060_VALUE								= "9";
	
	//---------------------------------------------------------------------------------------
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_ID								= 60000;	 
	public static final int 	PARTIAL_AUTH_INDICATOR_060_FIELD							= 60;	 
	public static final int 	PARTIAL_AUTH_INDICATOR_060_SUBFIELD							= 6;
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_LENGTH							= 1;   	 
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_ENCODING							= EBCDIC_ENCODING;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	PARTIAL_AUTH_INDICATOR_060_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	PARTIAL_AUTH_INDICATOR_060_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	PARTIAL_AUTH_INDICATOR_060_VALUE							= "Y";
	
}
