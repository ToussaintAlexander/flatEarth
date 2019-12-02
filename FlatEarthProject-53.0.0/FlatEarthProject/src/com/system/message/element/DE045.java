package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE045 {

	public static final int NUMBER_OF_DE045_FIELDS	        = 16;
	
	public static final int TRACK_1_DATA_045_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	START_SENTINEL_045_ID						= 45000;	 
	public static final int 	START_SENTINEL_045_FIELD					= 45;	 
	public static final int 	START_SENTINEL_045_SUBFIELD					= 0;
	
	public static final int 	START_SENTINEL_045_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	START_SENTINEL_045_LENGTH					= 1;   	 
	
	public static final int 	START_SENTINEL_045_ENCODING					= EBCDIC_ENCODING;
	public static final int 	START_SENTINEL_045_DATATYPE					= SPECIAL_DATATYPE;
	
	public static final int 	START_SENTINEL_045_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	START_SENTINEL_045_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	START_SENTINEL_045_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	START_SENTINEL_045_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	START_SENTINEL_045_VALUE					= "%";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FORMAT_CODE_045_ID							= 45000;	 
	public static final int 	FORMAT_CODE_045_FIELD						= 45;	 
	public static final int 	FORMAT_CODE_045_SUBFIELD					= 1;
	
	public static final int 	FORMAT_CODE_045_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	FORMAT_CODE_045_LENGTH						= 1;   	 
	
	public static final int 	FORMAT_CODE_045_ENCODING					= EBCDIC_ENCODING;
	public static final int 	FORMAT_CODE_045_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	FORMAT_CODE_045_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORMAT_CODE_045_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORMAT_CODE_045_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	FORMAT_CODE_045_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	FORMAT_CODE_045_VALUE						= "F";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	BIN_045_ID									= 45000;
	public static final int 	BIN_045_FIELD								= 45;	
	public static final int 	BIN_045_SUBFIELD							= 2;
	
	public static final int 	BIN_045_FORMAT								= FIXED_FORMAT;
	
	public static final int 	BIN_045_LENGTH								= 6;
	
	public static final int 	BIN_045_ENCODING							= EBCDIC_ENCODING;
	public static final int 	BIN_045_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	BIN_045_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_045_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_045_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	BIN_045_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	BIN_045_VALUE								= "450250";
	
	//-------------------------------------------------------------------------------------- 
	
	public static final int 	PAN_045_ID									= 45000;
	public static final int 	PAN_045_FIELD								= 45;	
	public static final int 	PAN_045_SUBFIELD							= 3;
	
	public static final int 	PAN_045_FORMAT								= FIXED_FORMAT;
	
	public static final int 	PAN_045_LENGTH								= 9;
	
	public static final int 	PAN_045_ENCODING							= EBCDIC_ENCODING;
	public static final int 	PAN_045_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	PAN_045_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_045_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_045_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	PAN_045_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	PAN_045_VALUE								= "123456789";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_045_ID							= 45000;
	public static final int 	CHECK_DIGIT_045_FIELD						= 45;	
	public static final int 	CHECK_DIGIT_045_SUBFIELD					= 4;
	
	public static final int 	CHECK_DIGIT_045_FORMAT						= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_045_LENGTH						= 1;
	
	public static final int 	CHECK_DIGIT_045_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_045_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_045_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_045_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_045_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_045_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CHECK_DIGIT_045_VALUE						= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIELD_SEPARATOR_01_045_ID					= 45000;	 
	public static final int 	FIELD_SEPARATOR_01_045_FIELD				= 45;	 
	public static final int 	FIELD_SEPARATOR_01_045_SUBFIELD				= 5;
	
	public static final int 	FIELD_SEPARATOR_01_045_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	FIELD_SEPARATOR_01_045_LENGTH				= 1;   	 
		
	public static final int 	FIELD_SEPARATOR_01_045_ENCODING				= EBCDIC_ENCODING;
	public static final int 	FIELD_SEPARATOR_01_045_DATATYPE				= SPECIAL_DATATYPE;
	
	public static final int 	FIELD_SEPARATOR_01_045_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_SEPARATOR_01_045_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_SEPARATOR_01_045_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	FIELD_SEPARATOR_01_045_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	FIELD_SEPARATOR_01_045_VALUE				= "^";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FULL_NAME_045_ID							= 45000;	 
	public static final int 	FULL_NAME_045_FIELD							= 45;	 
	public static final int 	FULL_NAME_045_SUBFIELD						= 6;
	
	public static final int 	FULL_NAME_045_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	FULL_NAME_045_LENGTH						= 26;   	 
	
	public static final int 	FULL_NAME_045_ENCODING						= EBCDIC_ENCODING;
	public static final int 	FULL_NAME_045_DATATYPE						= ALPHANUMERIC_DATATYPE;
	
	public static final int 	FULL_NAME_045_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	FULL_NAME_045_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FULL_NAME_045_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	FULL_NAME_045_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	FULL_NAME_045_VALUE							= "Toussaint I. Alexander";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIELD_SEPARATOR_02_045_ID					= 45000;	 
	public static final int 	FIELD_SEPARATOR_02_045_FIELD				= 45;	 
	public static final int 	FIELD_SEPARATOR_02_045_SUBFIELD				= 7;
	
	public static final int 	FIELD_SEPARATOR_02_045_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	FIELD_SEPARATOR_02_045_LENGTH				= 1;   	 
	
	public static final int 	FIELD_SEPARATOR_02_045_ENCODING				= EBCDIC_ENCODING;
	public static final int 	FIELD_SEPARATOR_02_045_DATATYPE				= SPECIAL_DATATYPE;
	
	public static final int 	FIELD_SEPARATOR_02_045_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_SEPARATOR_02_045_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_SEPARATOR_02_045_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	FIELD_SEPARATOR_02_045_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	FIELD_SEPARATOR_02_045_VALUE				= "^";
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_YEAR_045_ID					= 45000;	 
	public static final int 	EXPIRATION_DATE_YEAR_045_FIELD				= 45;	 
	public static final int 	EXPIRATION_DATE_YEAR_045_SUBFIELD			= 8;
	
	public static final int 	EXPIRATION_DATE_YEAR_045_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_045_LENGTH				= 2;   	 
	
	public static final int 	EXPIRATION_DATE_YEAR_045_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_045_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_045_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_045_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_045_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_045_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_045_VALUE				= "12";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_045_ID				= 45000;	 
	public static final int 	EXPIRATION_DATE_MONTH_045_FIELD				= 45;	 
	public static final int 	EXPIRATION_DATE_MONTH_045_SUBFIELD			= 9;
	
	public static final int 	EXPIRATION_DATE_MONTH_045_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_045_LENGTH			= 2;   	 
	
	public static final int 	EXPIRATION_DATE_MONTH_045_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_045_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_045_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_045_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_045_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_045_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_045_VALUE				= "31";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	SERVICE_CODE_045_ID							= 45000;	 
	public static final int 	SERVICE_CODE_045_FIELD						= 45;	 
	public static final int 	SERVICE_CODE_045_SUBFIELD					= 10;
	
	public static final int 	SERVICE_CODE_045_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	SERVICE_CODE_045_LENGTH						= 3;   	 
	
	public static final int 	SERVICE_CODE_045_ENCODING					= EBCDIC_ENCODING;
	public static final int 	SERVICE_CODE_045_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	SERVICE_CODE_045_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	SERVICE_CODE_045_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SERVICE_CODE_045_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	SERVICE_CODE_045_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	SERVICE_CODE_045_VALUE						= "123";
	
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
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_ID				= 45000;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_FIELD			= 45;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_SUBFIELD		= 11;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_LENGTH			= 1;   	 
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_045_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VALUE_KEY_INDICATOR_045_VALUE			= "A";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	PIN_VERIFICATION_VALUE_045_ID				= 45000;	 
	public static final int 	PIN_VERIFICATION_VALUE_045_FIELD			= 45;	 
	public static final int 	PIN_VERIFICATION_VALUE_045_SUBFIELD			= 12;
	
	public static final int 	PIN_VERIFICATION_VALUE_045_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VERIFICATION_VALUE_045_LENGTH			= 4;   	 
	
	public static final int 	PIN_VERIFICATION_VALUE_045_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PIN_VERIFICATION_VALUE_045_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	PIN_VERIFICATION_VALUE_045_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VERIFICATION_VALUE_045_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VERIFICATION_VALUE_045_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VERIFICATION_VALUE_045_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VERIFICATION_VALUE_045_VALUE			= "1234";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_VERIFICATION_VALUE_045_ID				= 45000;	 
	public static final int 	CARD_VERIFICATION_VALUE_045_FIELD			= 45;	 
	public static final int 	CARD_VERIFICATION_VALUE_045_SUBFIELD		= 13;
		
	public static final int 	CARD_VERIFICATION_VALUE_045_FORMAT			= FIXED_FORMAT;	
		
	public static final int 	CARD_VERIFICATION_VALUE_045_LENGTH			= 3;   	 
		
	public static final int 	CARD_VERIFICATION_VALUE_045_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARD_VERIFICATION_VALUE_045_DATATYPE		= NUMERIC_DATATYPE;
		
	public static final int 	CARD_VERIFICATION_VALUE_045_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_VERIFICATION_VALUE_045_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_VERIFICATION_VALUE_045_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARD_VERIFICATION_VALUE_045_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_VERIFICATION_VALUE_045_VALUE			= "123";
		
		//--------------------------------------------------------------------------------------
		
	public static final int 	END_SENTINEL_045_ID							= 45000;	 
	public static final int 	END_SENTINEL_045_FIELD						= 45;	 
	public static final int 	END_SENTINEL_045_SUBFIELD					= 14;
			
	public static final int 	END_SENTINEL_045_FORMAT						= FIXED_FORMAT;	
			
	public static final int 	END_SENTINEL_045_LENGTH						= 1;   	 
			
	public static final int 	END_SENTINEL_045_ENCODING					= EBCDIC_ENCODING;
	public static final int 	END_SENTINEL_045_DATATYPE					= SPECIAL_DATATYPE;
			
	public static final int 	END_SENTINEL_045_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	END_SENTINEL_045_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	END_SENTINEL_045_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	END_SENTINEL_045_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	END_SENTINEL_045_VALUE						= "?";
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_ID			= 45000;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_FIELD		= 45;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_SUBFIELD		= 15;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_FORMAT		= FIXED_FORMAT;	
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_LENGTH		= 1;   	 
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_ENCODING		= EBCDIC_ENCODING;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_DATATYPE		= ALPHANUMERIC_DATATYPE;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_045_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	LONG_REDUNDANCY_CHECK_CHAR_045_VALUE		= "Z";
			
}
