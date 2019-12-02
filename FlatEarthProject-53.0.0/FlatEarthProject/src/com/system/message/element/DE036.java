package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE036 {

	public static final int NUMBER_OF_DE036_FIELDS	        				= 32;
	
	public static final int TRACK_3_DATA_036_INDEX							= 1;
		
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	START_SENTINEL_036_ID						= 36000;	 
	public static final int 	START_SENTINEL_036_FIELD					= 36;	 
	public static final int 	START_SENTINEL_036_SUBFIELD					= 0;
	
	public static final int 	START_SENTINEL_036_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	START_SENTINEL_036_LENGTH					= 1;   	 
	
	public static final int 	START_SENTINEL_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	START_SENTINEL_036_DATATYPE					= SPECIAL_DATATYPE;
	
	public static final int 	START_SENTINEL_036_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	START_SENTINEL_036_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	START_SENTINEL_036_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	START_SENTINEL_036_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	START_SENTINEL_036_VALUE					= "0B";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FORMAT_CODE_036_ID							= 36000;	 
	public static final int 	FORMAT_CODE_036_FIELD						= 36;	 
	public static final int 	FORMAT_CODE_036_SUBFIELD					= 1;
	
	public static final int 	FORMAT_CODE_036_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	FORMAT_CODE_036_LENGTH						= 1;   	 
	
	public static final int 	FORMAT_CODE_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	FORMAT_CODE_036_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	FORMAT_CODE_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORMAT_CODE_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORMAT_CODE_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	FORMAT_CODE_036_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	FORMAT_CODE_036_VALUE						= "F";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	BIN_036_ID									= 36000;
	public static final int 	BIN_036_FIELD								= 36;	
	public static final int 	BIN_036_SUBFIELD							= 2;
	
	public static final int 	BIN_036_FORMAT								= FIXED_FORMAT;
	
	public static final int 	BIN_036_LENGTH								= 6;
	
	public static final int 	BIN_036_ENCODING							= EBCDIC_ENCODING;
	public static final int 	BIN_036_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	BIN_036_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_036_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_036_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	BIN_036_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	BIN_036_VALUE								= "450250";
	
	//--------------------------------------------------------------- 
	
	public static final int 	PAN_036_ID									= 36000;
	public static final int 	PAN_036_FIELD								= 36;	
	public static final int 	PAN_036_SUBFIELD							= 3;
	
	public static final int 	PAN_036_FORMAT								= FIXED_FORMAT;
	
	public static final int 	PAN_036_LENGTH								= 9;
	
	public static final int 	PAN_036_ENCODING							= EBCDIC_ENCODING;
	public static final int 	PAN_036_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	PAN_036_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_036_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_036_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	PAN_036_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	PAN_036_VALUE								= "123456789";
	
	//---------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_036_ID							= 36000;
	public static final int 	CHECK_DIGIT_036_FIELD						= 36;	
	public static final int 	CHECK_DIGIT_036_SUBFIELD					= 4;
	
	public static final int 	CHECK_DIGIT_036_FORMAT						= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_036_LENGTH						= 1;
	
	public static final int 	CHECK_DIGIT_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_036_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_036_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CHECK_DIGIT_036_VALUE						= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIELD_SEPARATOR_01_036_ID					= 36000;	 
	public static final int 	FIELD_SEPARATOR_01_036_FIELD				= 36;	 
	public static final int 	FIELD_SEPARATOR_01_036_SUBFIELD				= 5;
	
	public static final int 	FIELD_SEPARATOR_01_036_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	FIELD_SEPARATOR_01_036_LENGTH				= 1;   	 
		
	public static final int 	FIELD_SEPARATOR_01_036_ENCODING				= EBCDIC_ENCODING;
	public static final int 	FIELD_SEPARATOR_01_036_DATATYPE				= SPECIAL_DATATYPE;
	
	public static final int 	FIELD_SEPARATOR_01_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_SEPARATOR_01_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_SEPARATOR_01_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	FIELD_SEPARATOR_01_036_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	FIELD_SEPARATOR_01_036_VALUE				= "0D";
	
	//--------------------------------------------------------------------------------------
	// Use and Security Data
	//--------------------------------------------------------------------------------------
	
	public static final int 	COUNTRY_CODE_036_ID							= 36000;	 
	public static final int 	COUNTRY_CODE_036_FIELD						= 36;	 
	public static final int 	COUNTRY_CODE_036_SUBFIELD					= 6;
	
	public static final int 	COUNTRY_CODE_036_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	COUNTRY_CODE_036_LENGTH						= 3;   	 
	
	public static final int 	COUNTRY_CODE_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	COUNTRY_CODE_036_DATATYPE					= ALPHABETIC_DATATYPE;
	
	public static final int 	COUNTRY_CODE_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTRY_CODE_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTRY_CODE_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	COUNTRY_CODE_036_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	COUNTRY_CODE_036_VALUE						= "United States";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_CODE_036_ID						= 36000;	 
	public static final int 	CURRENCY_CODE_036_FIELD						= 36;	 
	public static final int 	CURRENCY_CODE_036_SUBFIELD					= 7;
	
	public static final int 	CURRENCY_CODE_036_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_CODE_036_LENGTH					= 3;   	 
	
	public static final int 	CURRENCY_CODE_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CURRENCY_CODE_036_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_CODE_036_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_CODE_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_CODE_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_CODE_036_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_CODE_036_VALUE						= "840";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_EXPONENT_036_ID					= 36000;	 
	public static final int 	CURRENCY_EXPONENT_036_FIELD					= 36;	 
	public static final int 	CURRENCY_EXPONENT_036_SUBFIELD				= 8;
	
	public static final int 	CURRENCY_EXPONENT_036_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_EXPONENT_036_LENGTH				= 1;   	 
	
	public static final int 	CURRENCY_EXPONENT_036_ENCODING				= EBCDIC_ENCODING;
	public static final int 	CURRENCY_EXPONENT_036_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_EXPONENT_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_EXPONENT_036_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_EXPONENT_036_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_EXPONENT_036_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_EXPONENT_036_VALUE					= "2";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_ID			= 36000;	 
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_FIELD		= 36;	 
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_SUBFIELD	= 9;
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_FORMAT		= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_LENGTH		= 4;   	 
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_ENCODING	= EBCDIC_ENCODING;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_DATATYPE	= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_AUTHORIZED_PER_CYCLE_036_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_AUTHORIZED_PER_CYCLE_036_VALUE		= "^";
	
	//--------------------------------------------------------------------------------------
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_ID			= 36000;	 
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_FIELD		= 36;	 
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_SUBFIELD	= 10;
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_FORMAT		= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_LENGTH		= 4;   	 
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_ENCODING	= EBCDIC_ENCODING;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_DATATYPE	= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_REMAINING_THIS_CYCLE_036_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_REMAINING_THIS_CYCLE_036_VALUE		= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	CYCLE_BEGIN_036_ID							= 36000;	 
	public static final int 	CYCLE_BEGIN_036_FIELD						= 36;	 
	public static final int 	CYCLE_BEGIN_036_SUBFIELD					= 11;
		
	public static final int 	CYCLE_BEGIN_036_FORMAT						= FIXED_FORMAT;	
		
	public static final int 	CYCLE_BEGIN_036_LENGTH						= 4;   	 // YDDD; Y IS LEAST SIGNIFICANT DIGIT OF YEAR & D = 001 - 366
		
	public static final int 	CYCLE_BEGIN_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CYCLE_BEGIN_036_DATATYPE					= SPECIAL_DATATYPE;
		
	public static final int 	CYCLE_BEGIN_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CYCLE_BEGIN_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CYCLE_BEGIN_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CYCLE_BEGIN_036_CHANGE						= ELEMENT_FIXED;
		
	public static final String 	CYCLE_BEGIN_036_VALUE						= "1231";
		
	//--------------------------------------------------------------------------------------
		
	public static final int 	CYCLE_LENGTH_036_ID							= 36000;	 
	public static final int 	CYCLE_LENGTH_036_FIELD						= 36;	 
	public static final int 	CYCLE_LENGTH_036_SUBFIELD					= 12;
		
	public static final int 	CYCLE_LENGTH_036_FORMAT						= FIXED_FORMAT;	
		
	public static final int 	CYCLE_LENGTH_036_LENGTH						= 2;   	 
		
	public static final int 	CYCLE_LENGTH_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CYCLE_LENGTH_036_DATATYPE					= NUMERIC_DATATYPE;
		
	public static final int 	CYCLE_LENGTH_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CYCLE_LENGTH_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CYCLE_LENGTH_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CYCLE_LENGTH_036_CHANGE						= ELEMENT_FIXED;
		
	public static final String 	CYCLE_LENGTH_036_VALUE						= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	RETRY_COUNT_036_ID							= 36000;	 
	public static final int 	RETRY_COUNT_036_FIELD						= 36;	 
	public static final int 	RETRY_COUNT_036_SUBFIELD					= 13;
		
	public static final int 	RETRY_COUNT_036_FORMAT						= FIXED_FORMAT;	
		
	public static final int 	RETRY_COUNT_036_LENGTH						= 1;   	 
		
	public static final int 	RETRY_COUNT_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	RETRY_COUNT_036_DATATYPE					= NUMERIC_DATATYPE;
		
	public static final int 	RETRY_COUNT_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	RETRY_COUNT_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RETRY_COUNT_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	RETRY_COUNT_036_CHANGE						= ELEMENT_FIXED;
		
	public static final String 	RETRY_COUNT_036_VALUE						= "^";

	//--------------------------------------------------------------------------------------
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_ID				= 36000;	 
	public static final int 	PIN_CONTROL_PARAMETERS_036_FIELD			= 36;	 
	public static final int 	PIN_CONTROL_PARAMETERS_036_SUBFIELD			= 14;
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_FORMAT			= FIXED_FORMAT;	
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_LENGTH			= 6;   	 
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PIN_CONTROL_PARAMETERS_036_DATATYPE			= ALPHANUMERIC_DATATYPE;
		
	public static final int 	PIN_CONTROL_PARAMETERS_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_CONTROL_PARAMETERS_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_CONTROL_PARAMETERS_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_CONTROL_PARAMETERS_036_CHANGE			= ELEMENT_FIXED;
		
	public static final String 	PIN_CONTROL_PARAMETERS_036_VALUE			= "123ABC";

	//--------------------------------------------------------------------------------------
		
	public static final int 	INTERCHANGE_CONTROLS_036_ID					= 36000;	 
	public static final int 	INTERCHANGE_CONTROLS_036_FIELD				= 36;	 
	public static final int 	INTERCHANGE_CONTROLS_036_SUBFIELD			= 15;
		
	public static final int 	INTERCHANGE_CONTROLS_036_FORMAT				= FIXED_FORMAT;	
		
	public static final int 	INTERCHANGE_CONTROLS_036_LENGTH				= 1;   	 
		
	public static final int 	INTERCHANGE_CONTROLS_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	INTERCHANGE_CONTROLS_036_DATATYPE			= ALPHANUMERIC_DATATYPE;
		
	public static final int 	INTERCHANGE_CONTROLS_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	INTERCHANGE_CONTROLS_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	INTERCHANGE_CONTROLS_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	INTERCHANGE_CONTROLS_036_CHANGE				= ELEMENT_FIXED;
		
	public static final String 	INTERCHANGE_CONTROLS_036_VALUE				= "A";

	//--------------------------------------------------------------------------------------
		
	public static final int 	PAN_SERVICE_RESTRICTION_036_ID				= 36000;	 
	public static final int 	PAN_SERVICE_RESTRICTION_036_FIELD			= 36;	 
	public static final int 	PAN_SERVICE_RESTRICTION_036_SUBFIELD		= 16;
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_FORMAT			= FIXED_FORMAT;	
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_LENGTH			= 2;   	 
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PAN_SERVICE_RESTRICTION_036_DATATYPE		= ALPHANUMERIC_DATATYPE;
				
	public static final int 	PAN_SERVICE_RESTRICTION_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_SERVICE_RESTRICTION_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_SERVICE_RESTRICTION_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PAN_SERVICE_RESTRICTION_036_CHANGE			= ELEMENT_FIXED;
			
	public static final String 	PAN_SERVICE_RESTRICTION_036_VALUE			= "12";

	//--------------------------------------------------------------------------------------
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_ID			= 36000;	 
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_FIELD			= 36;	 
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_SUBFIELD		= 17;
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_FORMAT		= FIXED_FORMAT;	
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_LENGTH		= 2;   	 
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_DATATYPE		= ALPHANUMERIC_DATATYPE;
				
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SAN_1_SERVICE_RESTRICTION_036_CHANGE		= ELEMENT_FIXED;
				
	public static final String 	SAN_1_SERVICE_RESTRICTION_036_VALUE			= "34";

	//--------------------------------------------------------------------------------------
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_ID			= 36000;	 
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_FIELD			= 36;	 
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_SUBFIELD		= 18;
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_FORMAT		= FIXED_FORMAT;	
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_LENGTH		= 2;   	 
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_DATATYPE		= NUMERIC_DATATYPE;
				
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SAN_2_SERVICE_RESTRICTION_036_CHANGE		= ELEMENT_FIXED;
				
	public static final String 	SAN_2_SERVICE_RESTRICTION_036_VALUE			= "56";				
				
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_YEAR_036_ID					= 36000;	 
	public static final int 	EXPIRATION_DATE_YEAR_036_FIELD				= 36;	 
	public static final int 	EXPIRATION_DATE_YEAR_036_SUBFIELD			= 19;
	
	public static final int 	EXPIRATION_DATE_YEAR_036_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_036_LENGTH				= 2;   	 
	
	public static final int 	EXPIRATION_DATE_YEAR_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_036_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_036_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_036_VALUE				= "12";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_036_ID				= 36000;	 
	public static final int 	EXPIRATION_DATE_MONTH_036_FIELD				= 36;	 
	public static final int 	EXPIRATION_DATE_MONTH_036_SUBFIELD			= 20;
	
	public static final int 	EXPIRATION_DATE_MONTH_036_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_036_LENGTH			= 2;   	 
	
	public static final int 	EXPIRATION_DATE_MONTH_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_036_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_036_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_036_VALUE				= "31";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_ID					= 36000;	 
	public static final int 	CARD_SEQUENCE_NUMBER_036_FIELD				= 36;	 
	public static final int 	CARD_SEQUENCE_NUMBER_036_SUBFIELD			= 21;
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_LENGTH				= 1;   	 
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CARD_SEQUENCE_NUMBER_036_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CARD_SEQUENCE_NUMBER_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_SEQUENCE_NUMBER_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_SEQUENCE_NUMBER_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CARD_SEQUENCE_NUMBER_036_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CARD_SEQUENCE_NUMBER_036_VALUE				= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_SECURITY_NUMBER_036_ID					= 36000;	 
	public static final int 	CARD_SECURITY_NUMBER_036_FIELD				= 36;	 
	public static final int 	CARD_SECURITY_NUMBER_036_SUBFIELD			= 22;
	
	public static final int 	CARD_SECURITY_NUMBER_036_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CARD_SECURITY_NUMBER_036_LENGTH				= 9;   	 
	
	public static final int 	CARD_SECURITY_NUMBER_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CARD_SECURITY_NUMBER_036_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CARD_SECURITY_NUMBER_036_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_SECURITY_NUMBER_036_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_SECURITY_NUMBER_036_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CARD_SECURITY_NUMBER_036_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CARD_SECURITY_NUMBER_036_VALUE				= "123366789";
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_ID			= 36000;	 
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_FIELD			= 36;	 
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_SUBFIELD		= 23;
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_LENGTH		= 19;   	 
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	FIRST_SUBSIDIARY_ACCT_NBR_036_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	FIRST_SUBSIDIARY_ACCT_NBR_036_VALUE			= "490105000760365";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_ID		= 36000;	 
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_FIELD		= 36;	 
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_SUBFIELD	= 24;
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_LENGTH	= 4;   	 
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_VALUE		= "490105000760366";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	RELAY_MARKER_036_ID							= 36000;	 
	public static final int 	RELAY_MARKER_036_FIELD						= 36;	 
	public static final int 	RELAY_MARKER_036_SUBFIELD					= 25;
	
	public static final int 	RELAY_MARKER_036_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	RELAY_MARKER_036_LENGTH						= 1;   	 
	
	public static final int 	RELAY_MARKER_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	RELAY_MARKER_036_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	RELAY_MARKER_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	RELAY_MARKER_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RELAY_MARKER_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	RELAY_MARKER_036_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	RELAY_MARKER_036_VALUE						= "A";

	//--------------------------------------------------------------------------------------
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_ID			= 36000;	 
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_FIELD		= 36;	 
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_SUBFIELD		= 26;
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_LENGTH		= 6;   	 
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CRYPTOGRAPHIC_CHECK_DIGITS_036_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CRYPTOGRAPHIC_CHECK_DIGITS_036_VALUE		= "123366";

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
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_ID				= 36000;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_FIELD			= 36;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_SUBFIELD		= 27;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_LENGTH			= 1;   	 
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_036_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VALUE_KEY_INDICATOR_036_VALUE			= "A";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	PIN_VERIFICATION_VALUE_036_ID				= 36000;	 
	public static final int 	PIN_VERIFICATION_VALUE_036_FIELD			= 36;	 
	public static final int 	PIN_VERIFICATION_VALUE_036_SUBFIELD			= 28;
	
	public static final int 	PIN_VERIFICATION_VALUE_036_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VERIFICATION_VALUE_036_LENGTH			= 4;   	 
	
	public static final int 	PIN_VERIFICATION_VALUE_036_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PIN_VERIFICATION_VALUE_036_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	PIN_VERIFICATION_VALUE_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VERIFICATION_VALUE_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VERIFICATION_VALUE_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VERIFICATION_VALUE_036_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VERIFICATION_VALUE_036_VALUE			= "1234";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_VERIFICATION_VALUE_036_ID				= 36000;	 
	public static final int 	CARD_VERIFICATION_VALUE_036_FIELD			= 36;	 
	public static final int 	CARD_VERIFICATION_VALUE_036_SUBFIELD		= 29;
		
	public static final int 	CARD_VERIFICATION_VALUE_036_FORMAT			= FIXED_FORMAT;	
		
	public static final int 	CARD_VERIFICATION_VALUE_036_LENGTH			= 3;   	 
		
	public static final int 	CARD_VERIFICATION_VALUE_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARD_VERIFICATION_VALUE_036_DATATYPE		= NUMERIC_DATATYPE;
		
	public static final int 	CARD_VERIFICATION_VALUE_036_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_VERIFICATION_VALUE_036_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_VERIFICATION_VALUE_036_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARD_VERIFICATION_VALUE_036_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_VERIFICATION_VALUE_036_VALUE			= "123";
		
	//--------------------------------------------------------------------------------------
		
	public static final int 	END_SENTINEL_036_ID							= 36000;	 
	public static final int 	END_SENTINEL_036_FIELD						= 36;	 
	public static final int 	END_SENTINEL_036_SUBFIELD					= 30;
			
	public static final int 	END_SENTINEL_036_FORMAT						= FIXED_FORMAT;	
			
	public static final int 	END_SENTINEL_036_LENGTH						= 1;   	 
			
	public static final int 	END_SENTINEL_036_ENCODING					= EBCDIC_ENCODING;
	public static final int 	END_SENTINEL_036_DATATYPE					= SPECIAL_DATATYPE;
			
	public static final int 	END_SENTINEL_036_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	END_SENTINEL_036_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	END_SENTINEL_036_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	END_SENTINEL_036_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	END_SENTINEL_036_VALUE						= "0F";
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_ID			= 36000;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_FIELD		= 36;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_SUBFIELD		= 31;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_FORMAT		= FIXED_FORMAT;	
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_LENGTH		= 1;   	 
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_ENCODING		= EBCDIC_ENCODING;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_DATATYPE		= ALPHANUMERIC_DATATYPE;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_036_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	LONG_REDUNDANCY_CHECK_CHAR_036_VALUE		= "Z";
			
}
