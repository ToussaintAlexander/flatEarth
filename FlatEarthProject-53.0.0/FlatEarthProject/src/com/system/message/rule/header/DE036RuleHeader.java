package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE036RuleHeader {
 
	// DE036 Header - Track 3 Data Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE036_RULE_HEADER_REPORT_TITLE										= "DE036 Rule Header";
	
	public static final int 	START_SENTINEL_036_RULE_HEADER_ID									= 36000;	 
	public static final int 	START_SENTINEL_036_RULE_HEADER_FIELD								= 36;	 
	public static final int 	START_SENTINEL_036_RULE_HEADER_SUBFIELD								= 0;
	
	public static final boolean START_SENTINEL_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	START_SENTINEL_036_RULE_HEADER_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	START_SENTINEL_036_RULE_HEADER_MINIMUM_LENGTH						= 1;
	public static final int 	START_SENTINEL_036_RULE_HEADER_MAXIMUM_LENGTH						= 1;
	
	public static final int 	START_SENTINEL_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	START_SENTINEL_036_RULE_HEADER_DATATYPE								= SPECIAL_DATATYPE;
	
	public static final int 	START_SENTINEL_036_RULE_HEADER_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	START_SENTINEL_036_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	START_SENTINEL_036_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	START_SENTINEL_036_RULE_HEADER_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	START_SENTINEL_036_RULE_HEADER_VALUE								= "0B";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FORMAT_CODE_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	FORMAT_CODE_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	FORMAT_CODE_036_RULE_HEADER_SUBFIELD								= 1;
	
	public static final boolean FORMAT_CODE_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	FORMAT_CODE_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	FORMAT_CODE_036_RULE_HEADER_MINIMUM_LENGTH							= 1;
	public static final int 	FORMAT_CODE_036_RULE_HEADER_MAXIMUM_LENGTH							= 1;
	
	public static final int 	FORMAT_CODE_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	FORMAT_CODE_036_RULE_HEADER_DATATYPE								= ALPHANUMERIC_DATATYPE;
	
	public static final int 	FORMAT_CODE_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORMAT_CODE_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORMAT_CODE_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	FORMAT_CODE_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	FORMAT_CODE_036_RULE_HEADER_VALUE									= "F";
	
	//--------------------------------------------------------------------------------------

	public static final int 	BIN_036_RULE_HEADER_ID												= 36000;
	public static final int 	BIN_036_RULE_HEADER_FIELD											= 36;	
	public static final int 	BIN_036_RULE_HEADER_SUBFIELD										= 2;
	
	public static final boolean BIN_036_RULE_HEADER_FIRE											= RULE_NOT_FIRED_B;
	
	public static final int 	BIN_036_RULE_HEADER_FORMAT											= FIXED_FORMAT;
	
	public static final int 	BIN_036_RULE_HEADER_MINIMUM_LENGTH									= 6;
	public static final int 	BIN_036_RULE_HEADER_MAXIMUM_LENGTH									= 6;
	
	public static final int 	BIN_036_RULE_HEADER_ENCODING										= EBCDIC_ENCODING;
	public static final int 	BIN_036_RULE_HEADER_DATATYPE										= NUMERIC_DATATYPE;
	
	public static final int 	BIN_036_RULE_HEADER_SOURCE											= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_036_RULE_HEADER_DIRECTION										= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_036_RULE_HEADER_EXISTENCE										= MANDATORY_PRESENCE;
	public static final int 	BIN_036_RULE_HEADER_CHANGE											= ELEMENT_FIXED;
	
	public static final String 	BIN_036_RULE_HEADER_VALUE											= "450250";
	
	//--------------------------------------------------------------- 
	
	public static final int 	PAN_036_RULE_HEADER_ID												= 36000;
	public static final int 	PAN_036_RULE_HEADER_FIELD											= 36;	
	public static final int 	PAN_036_RULE_HEADER_SUBFIELD										= 3;
	
	public static final boolean PAN_036_RULE_HEADER_FIRE											= RULE_NOT_FIRED_B;
	
	public static final int 	PAN_036_RULE_HEADER_FORMAT											= FIXED_FORMAT;
	
	public static final int 	PAN_036_RULE_HEADER_MINIMUM_LENGTH									= 9;
	public static final int 	PAN_036_RULE_HEADER_MAXIMUM_LENGTH									= 9;
	
	public static final int 	PAN_036_RULE_HEADER_ENCODING										= EBCDIC_ENCODING;
	public static final int 	PAN_036_RULE_HEADER_DATATYPE										= NUMERIC_DATATYPE;
	
	public static final int 	PAN_036_RULE_HEADER_SOURCE											= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_036_RULE_HEADER_DIRECTION										= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_036_RULE_HEADER_EXISTENCE										= MANDATORY_PRESENCE;
	public static final int 	PAN_036_RULE_HEADER_CHANGE											= ELEMENT_FIXED;
	
	public static final String 	PAN_036_RULE_HEADER_VALUE											= "123456789";
	
	//---------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_ID										= 36000;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_FIELD									= 36;	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_SUBFIELD								= 4;
	
	public static final boolean CHECK_DIGIT_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_MINIMUM_LENGTH							= 1;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_MAXIMUM_LENGTH							= 1;
	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	CHECK_DIGIT_036_RULE_HEADER_VALUE									= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_SUBFIELD							= 5;
	
	public static final boolean FIELD_SEPARATOR_01_036_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_MAXIMUM_LENGTH					= 1;
		
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_DATATYPE							= SPECIAL_DATATYPE;
	
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	FIELD_SEPARATOR_01_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	FIELD_SEPARATOR_01_036_RULE_HEADER_VALUE							= "0D";
	
	//--------------------------------------------------------------------------------------
	// Use and Security Data
	//--------------------------------------------------------------------------------------
	
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_SUBFIELD								= 6;
	
	public static final boolean COUNTRY_CODE_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_MINIMUM_LENGTH							= 3;
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_MAXIMUM_LENGTH							= 3;
	
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_DATATYPE								= ALPHABETIC_DATATYPE;
	
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	COUNTRY_CODE_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	COUNTRY_CODE_036_RULE_HEADER_VALUE									= "United States";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_ID									= 36000;	 
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_SUBFIELD								= 7;
	
	public static final boolean CURRENCY_CODE_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_LENGTH								= 3;   
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_MINIMUM_LENGTH						= 3;
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_MAXIMUM_LENGTH						= 3;
	
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_CODE_036_RULE_HEADER_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_CODE_036_RULE_HEADER_VALUE									= "840";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_FIELD								= 36;	 
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_SUBFIELD							= 8;
	
	public static final boolean CURRENCY_EXPONENT_036_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_MAXIMUM_LENGTH					= 1;
	
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_EXPONENT_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_EXPONENT_036_RULE_HEADER_VALUE								= "2";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FIELD					= 36;	 
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_SUBFIELD				= 9;
		
	public static final boolean AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_MINIMUM_LENGTH			= 4;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_MAXIMUM_LENGTH			= 4;
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_VALUE					= "^";
	
	//--------------------------------------------------------------------------------------
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FIELD					= 36;	 
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_SUBFIELD				= 10;
		
	public static final boolean AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_MINIMUM_LENGTH			= 4;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_MAXIMUM_LENGTH			= 4;
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_VALUE					= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_SUBFIELD								= 11;
		
	public static final boolean CYCLE_BEGIN_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
		
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_MINIMUM_LENGTH							= 4;
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_MAXIMUM_LENGTH							= 4;
		
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_DATATYPE								= SPECIAL_DATATYPE;
		
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CYCLE_BEGIN_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
		
	public static final String 	CYCLE_BEGIN_036_RULE_HEADER_VALUE									= "1231";
		
	//--------------------------------------------------------------------------------------
		
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_SUBFIELD								= 12;
		
	public static final boolean CYCLE_LENGTH_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
		
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_MINIMUM_LENGTH							= 2;
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_MAXIMUM_LENGTH							= 2;
		
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
		
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	CYCLE_LENGTH_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
		
	public static final String 	CYCLE_LENGTH_036_RULE_HEADER_VALUE									= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	RETRY_COUNT_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	RETRY_COUNT_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	RETRY_COUNT_036_RULE_HEADER_SUBFIELD								= 13;
		
	public static final boolean RETRY_COUNT_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	RETRY_COUNT_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
		
	public static final int 	RETRY_COUNT_036_RULE_HEADER_MINIMUM_LENGTH							= 1;
	public static final int 	RETRY_COUNT_036_RULE_HEADER_MAXIMUM_LENGTH							= 1;
		
	public static final int 	RETRY_COUNT_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	RETRY_COUNT_036_RULE_HEADER_DATATYPE								= NUMERIC_DATATYPE;
		
	public static final int 	RETRY_COUNT_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	RETRY_COUNT_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RETRY_COUNT_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	RETRY_COUNT_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
		
	public static final String 	RETRY_COUNT_036_RULE_HEADER_VALUE									= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_SUBFIELD						= 14;
		
	public static final boolean PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_MINIMUM_LENGTH				= 6;
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_MAXIMUM_LENGTH				= 6;
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
		
	public static final String 	PIN_CONTROL_PARAMETERS_036_RULE_HEADER_VALUE						= "123ABC";

	//--------------------------------------------------------------------------------------
		
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_SUBFIELD						= 15;
		
	public static final boolean INTERCHANGE_CONTROLS_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
		
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_MAXIMUM_LENGTH					= 1;
		
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
		
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	INTERCHANGE_CONTROLS_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
		
	public static final String 	INTERCHANGE_CONTROLS_036_RULE_HEADER_VALUE							= "A";

	//--------------------------------------------------------------------------------------
		
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD					= 16;
				
	public static final boolean PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH				= 2;
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
			
	public static final String 	PAN_SERVICE_RESTRICTION_036_RULE_HEADER_VALUE						= "12";

	//--------------------------------------------------------------------------------------
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD					= 17;
			
	public static final boolean SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH			= 2;
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
				
	public static final String 	SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_VALUE						= "34";

	//--------------------------------------------------------------------------------------
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD					= 18;
		
	public static final boolean SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH			= 2;
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
				
	public static final String 	SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_VALUE						= "56";				
				
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_SUBFIELD						= 19;
	
	public static final boolean EXPIRATION_DATE_YEAR_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_MINIMUM_LENGTH					= 2;
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_MAXIMUM_LENGTH					= 2;
	
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_036_RULE_HEADER_VALUE							= "12";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_SUBFIELD						= 20;
	
	public static final boolean EXPIRATION_DATE_MONTH_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_036_RULE_HEADER_VALUE							= "31";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_SUBFIELD						= 21;
	
	public static final boolean CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_MAXIMUM_LENGTH					= 1;
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	CARD_SEQUENCE_NUMBER_036_RULE_HEADER_VALUE							= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_ID								= 36000;	 
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_FIELD							= 36;	 
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_SUBFIELD						= 22;
	
	public static final boolean CARD_SECURITY_NUMBER_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_MINIMUM_LENGTH					= 9;
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_MAXIMUM_LENGTH					= 9;
	
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	CARD_SECURITY_NUMBER_036_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	CARD_SECURITY_NUMBER_036_RULE_HEADER_VALUE							= "123366789";
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SUBFIELD					= 23;
	
	public static final boolean FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MINIMUM_LENGTH			= 19;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MAXIMUM_LENGTH			= 19;
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_VALUE						= "490105000760025";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ID					= 36000;	 
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIELD					= 36;	 
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SUBFIELD				= 24;
	
	public static final boolean SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MINIMUM_LENGTH		= 4;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MAXIMUM_LENGTH		= 4;
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_VALUE					= "490105000760026";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	RELAY_MARKER_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	RELAY_MARKER_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	RELAY_MARKER_036_RULE_HEADER_SUBFIELD								= 25;
	
	public static final boolean RELAY_MARKER_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
	
	public static final int 	RELAY_MARKER_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
	
	public static final int 	RELAY_MARKER_036_RULE_HEADER_MINIMUM_LENGTH							= 1;
	public static final int 	RELAY_MARKER_036_RULE_HEADER_MAXIMUM_LENGTH							= 1;
	
	public static final int 	RELAY_MARKER_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	RELAY_MARKER_036_RULE_HEADER_DATATYPE								= ALPHANUMERIC_DATATYPE;
	
	public static final int 	RELAY_MARKER_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	RELAY_MARKER_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RELAY_MARKER_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	RELAY_MARKER_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	RELAY_MARKER_036_RULE_HEADER_VALUE									= "A";

	//--------------------------------------------------------------------------------------
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FIELD					= 36;	 
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_SUBFIELD					= 26;
	
	public static final boolean CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_MINIMUM_LENGTH			= 6;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_MAXIMUM_LENGTH			= 6;
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_VALUE					= "123366";

	//--------------------------------------------------------------------------------------
	// DISCRETIONARY DATA - 3 FIELDS; PVKI [PIC X(01)], PVV [PIC X(04)], CVV/CVC [PIC X(03)]
	//--------------------------------------------------------------------------------------
	//  PVKI    - PIN Value Key Indicator
	//  PVV     - PIN Verification Value
	//  CVV/CVC - Card Verification Value; Card Validation Code
	
	//	The data encoded on the magnetic stripe is static, formatted according to ISO7813 
	//  in three tracks, with the third one typically unused. One of the fields in this 
	//  track layout is the Card Validation Code (CVC) or CVC1. which serves as a 
	//  cryptographic integrity check on the track contents.
	
	//  CVC2 serves a similar purpose but  is used in conjunction with card-not-present or 
	//  “CNP” transactions such as e-commerce when the user types card information into a web 
	//  browser.  The CVC2 is only printed on the card itself– three-digits on the back under 
	//  the magnetic stripe for Visa.
	
	// CVV3 The main difference is a challenge-response step added to dynamically generate a 
	// different CVV value for each transaction. this scheme instead computes the integrity 
	// check using cryptographic keys stored on the chip, as a function of card data as well 
	// as a challenge issued by the payment terminal.
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_SUBFIELD					= 27;
	
	public static final boolean PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_MINIMUM_LENGTH				= 1;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_MAXIMUM_LENGTH				= 1;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_VALUE						= "A";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_SUBFIELD						= 28;
	
	public static final boolean PIN_VERIFICATION_VALUE_036_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_MINIMUM_LENGTH				= 4;
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_MAXIMUM_LENGTH				= 4;
	
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	PIN_VERIFICATION_VALUE_036_RULE_HEADER_VALUE						= "1234";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_ID							= 36000;	 
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_FIELD						= 36;	 
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_SUBFIELD					= 29;
		
	public static final boolean CARD_VERIFICATION_VALUE_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
		
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_LENGTH						= 3;  
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_MINIMUM_LENGTH				= 3;
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_MAXIMUM_LENGTH				= 3;
		
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
		
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CARD_VERIFICATION_VALUE_036_RULE_HEADER_VALUE						= "123";
		
	//--------------------------------------------------------------------------------------
		
	public static final int 	END_SENTINEL_036_RULE_HEADER_ID										= 36000;	 
	public static final int 	END_SENTINEL_036_RULE_HEADER_FIELD									= 36;	 
	public static final int 	END_SENTINEL_036_RULE_HEADER_SUBFIELD								= 30;
			
	public static final boolean END_SENTINEL_036_RULE_HEADER_FIRE									= RULE_NOT_FIRED_B;
		
	public static final int 	END_SENTINEL_036_RULE_HEADER_FORMAT									= FIXED_FORMAT;	
			
	public static final int 	END_SENTINEL_036_RULE_HEADER_MINIMUM_LENGTH							= 1;
	public static final int 	END_SENTINEL_036_RULE_HEADER_MAXIMUM_LENGTH							= 1;
			
	public static final int 	END_SENTINEL_036_RULE_HEADER_ENCODING								= EBCDIC_ENCODING;
	public static final int 	END_SENTINEL_036_RULE_HEADER_DATATYPE								= SPECIAL_DATATYPE;
			
	public static final int 	END_SENTINEL_036_RULE_HEADER_SOURCE									= ASSOCIATION_FROM_SOURCE;
	public static final int 	END_SENTINEL_036_RULE_HEADER_DIRECTION								= ASSOCIATION_FROM_DIRECTION;
	public static final int 	END_SENTINEL_036_RULE_HEADER_EXISTENCE								= MANDATORY_PRESENCE;
	public static final int 	END_SENTINEL_036_RULE_HEADER_CHANGE									= ELEMENT_FIXED;
	
	public static final String 	END_SENTINEL_036_RULE_HEADER_VALUE									= "0F";
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_ID						= 36000;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FIELD					= 36;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_SUBFIELD					= 31;
			
	public static final boolean LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_MAXIMUM_LENGTH			= 1;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
		
	public static final String 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_VALUE					= "Z";
	
}
