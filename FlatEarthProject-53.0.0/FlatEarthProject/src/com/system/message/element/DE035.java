package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE035 {

	public static final int NUMBER_OF_DE035_FIELDS	        = 11;
	
	public static final int TRACK_2_DATA_035_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	START_SENTINEL_035_ID						= 35000;	 
	public static final int 	START_SENTINEL_035_FIELD					= 35;	 
	public static final int 	START_SENTINEL_035_SUBFIELD					= 0;
	
	public static final int 	START_SENTINEL_035_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	START_SENTINEL_035_LENGTH					= 1;   	 
	
	public static final int 	START_SENTINEL_035_ENCODING					= EBCDIC_ENCODING;
	public static final int 	START_SENTINEL_035_DATATYPE					= SPECIAL_DATATYPE;
	
	public static final int 	START_SENTINEL_035_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	START_SENTINEL_035_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	START_SENTINEL_035_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	START_SENTINEL_035_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	START_SENTINEL_035_VALUE					= "0B";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	BIN_035_ID									= 35000;
	public static final int 	BIN_035_FIELD								= 35;	
	public static final int 	BIN_035_SUBFIELD							= 1;
	
	public static final int 	BIN_035_FORMAT								= FIXED_FORMAT;
	
	public static final int 	BIN_035_LENGTH								= 6;
	
	public static final int 	BIN_035_ENCODING							= EBCDIC_ENCODING;
	public static final int 	BIN_035_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	BIN_035_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	BIN_035_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BIN_035_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	BIN_035_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	BIN_035_VALUE								= "450250";
	
	//-------------------------------------------------------------------------------------- 
	
	public static final int 	PAN_035_ID									= 35000;
	public static final int 	PAN_035_FIELD								= 35;	
	public static final int 	PAN_035_SUBFIELD							= 2;
	
	public static final int 	PAN_035_FORMAT								= FIXED_FORMAT;
	
	public static final int 	PAN_035_LENGTH								= 9;
	
	public static final int 	PAN_035_ENCODING							= EBCDIC_ENCODING;
	public static final int 	PAN_035_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	PAN_035_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	PAN_035_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PAN_035_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	PAN_035_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	PAN_035_VALUE								= "123456789";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CHECK_DIGIT_035_ID							= 35000;
	public static final int 	CHECK_DIGIT_035_FIELD						= 35;	
	public static final int 	CHECK_DIGIT_035_SUBFIELD					= 3;
	
	public static final int 	CHECK_DIGIT_035_FORMAT						= FIXED_FORMAT;
	
	public static final int 	CHECK_DIGIT_035_LENGTH						= 1;
	
	public static final int 	CHECK_DIGIT_035_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CHECK_DIGIT_035_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CHECK_DIGIT_035_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CHECK_DIGIT_035_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CHECK_DIGIT_035_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CHECK_DIGIT_035_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CHECK_DIGIT_035_VALUE						= "5";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	FIELD_SEPARATOR_01_035_ID					= 35000;	 
	public static final int 	FIELD_SEPARATOR_01_035_FIELD				= 35;	 
	public static final int 	FIELD_SEPARATOR_01_035_SUBFIELD				= 4;
	
	public static final int 	FIELD_SEPARATOR_01_035_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	FIELD_SEPARATOR_01_035_LENGTH				= 1;   	 
		
	public static final int 	FIELD_SEPARATOR_01_035_ENCODING				= EBCDIC_ENCODING;
	public static final int 	FIELD_SEPARATOR_01_035_DATATYPE				= SPECIAL_DATATYPE;
	
	public static final int 	FIELD_SEPARATOR_01_035_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_SEPARATOR_01_035_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_SEPARATOR_01_035_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	FIELD_SEPARATOR_01_035_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	FIELD_SEPARATOR_01_035_VALUE				= "0D";
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_YEAR_035_ID					= 35000;	 
	public static final int 	EXPIRATION_DATE_YEAR_035_FIELD				= 35;	 
	public static final int 	EXPIRATION_DATE_YEAR_035_SUBFIELD			= 5;
	
	public static final int 	EXPIRATION_DATE_YEAR_035_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_035_LENGTH				= 2;   	 
	
	public static final int 	EXPIRATION_DATE_YEAR_035_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_035_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_035_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_035_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_035_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_035_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_035_VALUE				= "12";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_035_ID				= 35000;	 
	public static final int 	EXPIRATION_DATE_MONTH_035_FIELD				= 35;	 
	public static final int 	EXPIRATION_DATE_MONTH_035_SUBFIELD			= 6;
	
	public static final int 	EXPIRATION_DATE_MONTH_035_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_035_LENGTH			= 2;   	 
	
	public static final int 	EXPIRATION_DATE_MONTH_035_ENCODING			= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_035_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_035_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_035_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_035_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_035_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_035_VALUE				= "31";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	SERVICE_CODE_035_ID							= 35000;	 
	public static final int 	SERVICE_CODE_035_FIELD						= 35;	 
	public static final int 	SERVICE_CODE_035_SUBFIELD					= 7;
	
	public static final int 	SERVICE_CODE_035_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	SERVICE_CODE_035_LENGTH						= 3;   	 
	
	public static final int 	SERVICE_CODE_035_ENCODING					= EBCDIC_ENCODING;
	public static final int 	SERVICE_CODE_035_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	SERVICE_CODE_035_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	SERVICE_CODE_035_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SERVICE_CODE_035_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	SERVICE_CODE_035_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	SERVICE_CODE_035_VALUE						= "123";
	
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
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_ID				= 35000;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_FIELD			= 35;	 
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_SUBFIELD		= 8;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_LENGTH			= 1;   	 
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VALUE_KEY_INDICATOR_035_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VALUE_KEY_INDICATOR_035_VALUE			= "A";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	PIN_VERIFICATION_VALUE_035_ID				= 35000;	 
	public static final int 	PIN_VERIFICATION_VALUE_035_FIELD			= 35;	 
	public static final int 	PIN_VERIFICATION_VALUE_035_SUBFIELD			= 9;
	
	public static final int 	PIN_VERIFICATION_VALUE_035_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	PIN_VERIFICATION_VALUE_035_LENGTH			= 4;   	 
	
	public static final int 	PIN_VERIFICATION_VALUE_035_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PIN_VERIFICATION_VALUE_035_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	PIN_VERIFICATION_VALUE_035_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_VERIFICATION_VALUE_035_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_VERIFICATION_VALUE_035_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	PIN_VERIFICATION_VALUE_035_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	PIN_VERIFICATION_VALUE_035_VALUE			= "1234";
	
	//--------------------------------------------------------------------------------------
	
	public static final int 	CARD_VERIFICATION_VALUE_035_ID				= 35000;	 
	public static final int 	CARD_VERIFICATION_VALUE_035_FIELD			= 35;	 
	public static final int 	CARD_VERIFICATION_VALUE_035_SUBFIELD		= 10;
		
	public static final int 	CARD_VERIFICATION_VALUE_035_FORMAT			= FIXED_FORMAT;	
		
	public static final int 	CARD_VERIFICATION_VALUE_035_LENGTH			= 3;   	 
		
	public static final int 	CARD_VERIFICATION_VALUE_035_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARD_VERIFICATION_VALUE_035_DATATYPE		= NUMERIC_DATATYPE;
		
	public static final int 	CARD_VERIFICATION_VALUE_035_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_VERIFICATION_VALUE_035_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_VERIFICATION_VALUE_035_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARD_VERIFICATION_VALUE_035_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_VERIFICATION_VALUE_035_VALUE			= "123";
		
		//--------------------------------------------------------------------------------------
		
	public static final int 	END_SENTINEL_035_ID							= 35000;	 
	public static final int 	END_SENTINEL_035_FIELD						= 35;	 
	public static final int 	END_SENTINEL_035_SUBFIELD					= 11;
			
	public static final int 	END_SENTINEL_035_FORMAT						= FIXED_FORMAT;	
			
	public static final int 	END_SENTINEL_035_LENGTH						= 1;   	 
			
	public static final int 	END_SENTINEL_035_ENCODING					= EBCDIC_ENCODING;
	public static final int 	END_SENTINEL_035_DATATYPE					= SPECIAL_DATATYPE;
			
	public static final int 	END_SENTINEL_035_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	END_SENTINEL_035_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	END_SENTINEL_035_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	END_SENTINEL_035_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	END_SENTINEL_035_VALUE						= "0F";
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_ID			= 35000;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_FIELD		= 35;	 
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_SUBFIELD		= 12;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_FORMAT		= FIXED_FORMAT;	
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_LENGTH		= 1;   	 
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_ENCODING		= EBCDIC_ENCODING;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_DATATYPE		= ALPHANUMERIC_DATATYPE;
			
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LONG_REDUNDANCY_CHECK_CHAR_035_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	LONG_REDUNDANCY_CHECK_CHAR_035_VALUE		= "Z";
			
}
