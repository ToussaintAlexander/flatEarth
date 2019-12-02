package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE035RuleDetail {

	public static final int NUMBER_OF_DE035_FIELDS	        						= 11;
	
	public static final int TRACK_2_DATA_035_INDEX									= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		START_SENTINEL_035_RULE_DETAIL_ID				= 35000;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_FIELD			= 35;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_SUBFIELD			= 0;
	
	public static final boolean		START_SENTINEL_035_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_TYPE				= CONSTANT_RULE_TYPE;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_GROUP			= CHARACTER_RULE_GROUP;

	public static final BinLevel	START_SENTINEL_035_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	START_SENTINEL_035_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	START_SENTINEL_035_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		START_SENTINEL_035_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_POINTER			= CHARACTER_RULE_ROUTINE;
	public static final int 		START_SENTINEL_035_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		START_SENTINEL_035_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	START_SENTINEL_035_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		START_SENTINEL_035_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	START_SENTINEL_035_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		BIN_035_RULE_DETAIL_ID					= 35000;
	public static final int 		BIN_035_RULE_DETAIL_FIELD				= 35;
	public static final int 		BIN_035_RULE_DETAIL_SUBFIELD			= 1;
	
	public static final boolean		BIN_035_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		BIN_035_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		BIN_035_RULE_DETAIL_GROUP				= RANGE_RULE_GROUP;	
	
	public static final BinLevel	BIN_035_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	BIN_035_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	BIN_035_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		BIN_035_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		BIN_035_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		BIN_035_RULE_DETAIL_VALUE				= 450250;
	
	public static final String 		BIN_035_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	BIN_035_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		BIN_035_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	BIN_035_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		PAN_035_RULE_DETAIL_ID					= 35000;
	public static final int 		PAN_035_RULE_DETAIL_FIELD				= 35;
	public static final int 		PAN_035_RULE_DETAIL_SUBFIELD			= 2;
	
	public static final boolean		PAN_035_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PAN_035_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		PAN_035_RULE_DETAIL_GROUP				= EXACT_RULE_GROUP;	
	
	public static final BinLevel	PAN_035_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PAN_035_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PAN_035_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PAN_035_RULE_DETAIL_SEQUENCE			= 2;
	public static final int 		PAN_035_RULE_DETAIL_POINTER				= RANGE_RULE_ROUTINE;
	public static final int 		PAN_035_RULE_DETAIL_VALUE				= 123456789;
	
	public static final String 		PAN_035_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	PAN_035_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		PAN_035_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	PAN_035_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_ID			= 35000;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_FIELD		= 35;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_SUBFIELD	= 3;
	
	public static final boolean		CHECK_DIGIT_035_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_GROUP		= ARITHMETIC_RULE_GROUP;	
	
	public static final BinLevel	CHECK_DIGIT_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CHECK_DIGIT_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CHECK_DIGIT_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_SEQUENCE	= 1;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CHECK_DIGIT_035_RULE_DETAIL_VALUE		= 5;
	
	public static final String 		CHECK_DIGIT_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CHECK_DIGIT_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CHECK_DIGIT_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CHECK_DIGIT_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_ID			= 35000;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_FIELD		= 35;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_SUBFIELD		= 4;
	
	public static final boolean		FIELD_SEPARATOR_01_035_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_TYPE			= CONSTANT_RULE_TYPE;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_GROUP		= CHARACTER_RULE_GROUP;

	public static final BinLevel	FIELD_SEPARATOR_01_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	FIELD_SEPARATOR_01_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	FIELD_SEPARATOR_01_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_POINTER		= CHARACTER_RULE_ROUTINE;
	public static final int 		FIELD_SEPARATOR_01_035_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		FIELD_SEPARATOR_01_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	FIELD_SEPARATOR_01_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		FIELD_SEPARATOR_01_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	FIELD_SEPARATOR_01_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_ID				= 35000;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_FIELD			= 35;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_SUBFIELD		= 5;
	
	public static final boolean		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_GROUP			= DATE_TIME_RULE_GROUP;

	public static final BinLevel	EXPIRATION_DATE_YEAR_035_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	EXPIRATION_DATE_YEAR_035_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	EXPIRATION_DATE_YEAR_035_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	EXPIRATION_DATE_YEAR_035_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		EXPIRATION_DATE_YEAR_035_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	EXPIRATION_DATE_YEAR_035_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_ID			= 35000;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_FIELD			= 35;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_SUBFIELD		= 6;
	
	public static final boolean		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_GROUP			= DATE_TIME_RULE_GROUP;

	public static final BinLevel	EXPIRATION_DATE_MONTH_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	EXPIRATION_DATE_MONTH_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	EXPIRATION_DATE_MONTH_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	EXPIRATION_DATE_MONTH_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		EXPIRATION_DATE_MONTH_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	EXPIRATION_DATE_MONTH_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_ID						= 35000;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_FIELD					= 35;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_SUBFIELD				= 7;
	
	public static final boolean		SERVICE_CODE_035_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_TYPE					= DATABASE_RULE_TYPE;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_GROUP					= CODE_RULE_GROUP;

	public static final BinLevel	SERVICE_CODE_035_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SERVICE_CODE_035_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SERVICE_CODE_035_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		SERVICE_CODE_035_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		SERVICE_CODE_035_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp 	SERVICE_CODE_035_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String 		SERVICE_CODE_035_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp 	SERVICE_CODE_035_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
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
	
	//  CVV3 The main difference is a challenge-response step added to dynamically generate a 
	//  different CVV value for each transaction. this scheme instead computes the integrity 
	//  check using cryptographic keys stored on the chip, as a function of card data as well 
	//  as a challenge issued by the payment terminal.
	
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_ID			= 35000;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_FIELD		= 35;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_SUBFIELD	= 8;
	
	public static final boolean		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_ID			= 35000;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_FIELD		= 35;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_SUBFIELD		= 9;
	
	public static final boolean		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_GROUP		= ARITHMETIC_RULE_GROUP;

	public static final BinLevel	PIN_VERIFICATION_VALUE_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PIN_VERIFICATION_VALUE_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PIN_VERIFICATION_VALUE_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	PIN_VERIFICATION_VALUE_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		PIN_VERIFICATION_VALUE_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	PIN_VERIFICATION_VALUE_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_ID			= 35000;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_FIELD		= 35;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_SUBFIELD	= 10;
	
	public static final boolean		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_GROUP		= ARITHMETIC_RULE_GROUP;

	public static final BinLevel	CARD_VERIFICATION_VALUE_035_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CARD_VERIFICATION_VALUE_035_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CARD_VERIFICATION_VALUE_035_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CARD_VERIFICATION_VALUE_035_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CARD_VERIFICATION_VALUE_035_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CARD_VERIFICATION_VALUE_035_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
		
		//--------------------------------------------------------------------------------------
		
	public static final int 		END_SENTINEL_035_RULE_DETAIL_ID						= 35000;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_FIELD					= 35;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_SUBFIELD				= 11;
	
	public static final boolean		END_SENTINEL_035_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_TYPE					= CONSTANT_RULE_TYPE;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_GROUP					= CHARACTER_RULE_GROUP;

	public static final BinLevel	END_SENTINEL_035_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	END_SENTINEL_035_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	END_SENTINEL_035_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		END_SENTINEL_035_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_POINTER				= CHARACTER_RULE_ROUTINE;
	public static final int 		END_SENTINEL_035_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		END_SENTINEL_035_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp 	END_SENTINEL_035_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String 		END_SENTINEL_035_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp 	END_SENTINEL_035_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_ID		= 35000;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_FIELD	= 35;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_SUBFIELD	= 12;
	
	public static final boolean		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_GROUP	= ARITHMETIC_RULE_GROUP;

	public static final BinLevel	LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_POINTER	= ARITHMETIC_RULE_ROUTINE;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_VALUE	= 30;
	
	public static final String 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
			
}
