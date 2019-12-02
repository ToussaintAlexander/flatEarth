package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE036RuleDetail {

	public static final int NUMBER_OF_DE036_FIELDS	        								= 30;
	
	public static final int TRACK_3_DATA_036_INDEX											= 1;
		
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		START_SENTINEL_036_RULE_DETAIL_ID						= 36000;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_FIELD					= 36;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_SUBFIELD					= 0;
	
	public static final boolean		START_SENTINEL_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_TYPE						= CONSTANT_RULE_TYPE;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_GROUP					= CHARACTER_RULE_GROUP;

	public static final BinLevel	START_SENTINEL_036_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	START_SENTINEL_036_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	START_SENTINEL_036_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		START_SENTINEL_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_POINTER					= CHARACTER_RULE_ROUTINE;
	public static final int 		START_SENTINEL_036_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		START_SENTINEL_036_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp 	START_SENTINEL_036_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String 		START_SENTINEL_036_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp 	START_SENTINEL_036_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_ID							= 36000;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_SUBFIELD					= 1;
	
	public static final boolean		FORMAT_CODE_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;

	public static final BinLevel	FORMAT_CODE_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	FORMAT_CODE_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	FORMAT_CODE_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_POINTER						= EXACT_RULE_ROUTINE;
	public static final int 		FORMAT_CODE_036_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		FORMAT_CODE_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	FORMAT_CODE_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		FORMAT_CODE_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	FORMAT_CODE_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		BIN_036_RULE_DETAIL_ID					= 36000;
	public static final int 		BIN_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		BIN_036_RULE_DETAIL_SUBFIELD			= 2;
	
	public static final boolean		BIN_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		BIN_036_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		BIN_036_RULE_DETAIL_GROUP				= RANGE_RULE_GROUP;	
	
	public static final BinLevel	BIN_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	BIN_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	BIN_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		BIN_036_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		BIN_036_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		BIN_036_RULE_DETAIL_VALUE				= 450250;
	
	public static final String 		BIN_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	BIN_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		BIN_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	BIN_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		PAN_036_RULE_DETAIL_ID					= 36000;
	public static final int 		PAN_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		PAN_036_RULE_DETAIL_SUBFIELD			= 3;
	
	public static final boolean		PAN_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PAN_036_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		PAN_036_RULE_DETAIL_GROUP				= EXACT_RULE_GROUP;	
	
	public static final BinLevel	PAN_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PAN_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PAN_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PAN_036_RULE_DETAIL_SEQUENCE			= 2;
	public static final int 		PAN_036_RULE_DETAIL_POINTER				= RANGE_RULE_ROUTINE;
	public static final int 		PAN_036_RULE_DETAIL_VALUE				= 123456789;
	
	public static final String 		PAN_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	PAN_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		PAN_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	PAN_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_ID			= 36000;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_SUBFIELD	= 4;
	
	public static final boolean		CHECK_DIGIT_036_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_GROUP		= ARITHMETIC_RULE_GROUP;	
	
	public static final BinLevel	CHECK_DIGIT_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CHECK_DIGIT_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CHECK_DIGIT_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_SEQUENCE	= 1;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CHECK_DIGIT_036_RULE_DETAIL_VALUE		= 5;
	
	public static final String 		CHECK_DIGIT_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CHECK_DIGIT_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CHECK_DIGIT_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CHECK_DIGIT_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_ID					= 36000;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_SUBFIELD				= 5;
	
	public static final boolean		FIELD_SEPARATOR_01_036_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_TYPE					= CONSTANT_RULE_TYPE;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_GROUP				= CHARACTER_RULE_GROUP;

	public static final BinLevel	FIELD_SEPARATOR_01_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	FIELD_SEPARATOR_01_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	FIELD_SEPARATOR_01_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_POINTER				= CHARACTER_RULE_ROUTINE;
	public static final int 		FIELD_SEPARATOR_01_036_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		FIELD_SEPARATOR_01_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	FIELD_SEPARATOR_01_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		FIELD_SEPARATOR_01_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	FIELD_SEPARATOR_01_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	// Use and Security Data
	//--------------------------------------------------------------------------------------
	
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_ID							= 36000;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_SUBFIELD					= 6;
	
	public static final boolean		COUNTRY_CODE_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;

	public static final BinLevel	COUNTRY_CODE_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	COUNTRY_CODE_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	COUNTRY_CODE_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_POINTER					= EXACT_RULE_ROUTINE;
	public static final int 		COUNTRY_CODE_036_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		COUNTRY_CODE_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	COUNTRY_CODE_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		COUNTRY_CODE_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	COUNTRY_CODE_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_ID						= 36000;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_SUBFIELD					= 7;
	
	public static final boolean		CURRENCY_CODE_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;

	public static final BinLevel	CURRENCY_CODE_036_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CURRENCY_CODE_036_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CURRENCY_CODE_036_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_POINTER					= EXACT_RULE_ROUTINE;
	public static final int 		CURRENCY_CODE_036_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		CURRENCY_CODE_036_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp 	CURRENCY_CODE_036_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String 		CURRENCY_CODE_036_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp 	CURRENCY_CODE_036_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_ID					= 36000;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_FIELD					= 36;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_SUBFIELD				= 8;
	
	public static final boolean		CURRENCY_EXPONENT_036_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_TYPE					= NUMERIC_RULE_TYPE;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_GROUP					= ARITHMETIC_RULE_GROUP;

	public static final BinLevel	CURRENCY_EXPONENT_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CURRENCY_EXPONENT_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CURRENCY_EXPONENT_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_POINTER				= CURRENCY_RULE_ROUTINE;
	public static final int 		CURRENCY_EXPONENT_036_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		CURRENCY_EXPONENT_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	CURRENCY_EXPONENT_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		CURRENCY_EXPONENT_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	CURRENCY_EXPONENT_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_ID			= 36000;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_SUBFIELD	= 9;
	
	public static final boolean		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_GROUP		= CURRENCY_RULE_GROUP;

	public static final BinLevel	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_POINTER		= CURRENCY_RULE_ROUTINE;
	public static final int 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
		
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_ID			= 36000;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_SUBFIELD	= 10;
	
	public static final boolean		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_GROUP		= CURRENCY_RULE_GROUP;

	public static final BinLevel	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_POINTER		= CURRENCY_RULE_ROUTINE;
	public static final int 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
		
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_ID							= 36000;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_SUBFIELD					= 11;
	
	public static final boolean		CYCLE_BEGIN_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_TYPE						= NUMERIC_RULE_TYPE;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_GROUP						= DATE_TIME_RULE_GROUP;

	public static final BinLevel	CYCLE_BEGIN_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CYCLE_BEGIN_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CYCLE_BEGIN_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_POINTER						= DATE_TIME_RULE_ROUTINE;
	public static final int 		CYCLE_BEGIN_036_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		CYCLE_BEGIN_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	CYCLE_BEGIN_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		CYCLE_BEGIN_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	CYCLE_BEGIN_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
		
	//--------------------------------------------------------------------------------------
		
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_ID							= 36000;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_SUBFIELD					= 12;
	
	public static final boolean		CYCLE_LENGTH_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;

	public static final BinLevel	CYCLE_LENGTH_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CYCLE_LENGTH_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CYCLE_LENGTH_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_POINTER					= DATE_TIME_RULE_ROUTINE;
	public static final int 		CYCLE_LENGTH_036_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		CYCLE_LENGTH_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	CYCLE_LENGTH_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		CYCLE_LENGTH_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	CYCLE_LENGTH_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
		
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_ID							= 36000;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_SUBFIELD					= 13;
	
	public static final boolean		RETRY_COUNT_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_TYPE						= NUMERIC_RULE_TYPE;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_GROUP						= SEQUENCE_RULE_GROUP;

	public static final BinLevel	RETRY_COUNT_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	RETRY_COUNT_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	RETRY_COUNT_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_POINTER						= SEQUENCE_RULE_ROUTINE;
	public static final int 		RETRY_COUNT_036_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		RETRY_COUNT_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	RETRY_COUNT_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		RETRY_COUNT_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	RETRY_COUNT_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
		
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_ID				= 36000;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_SUBFIELD			= 14;
	
	public static final boolean		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_POINTER			= 0;
	public static final int 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
		
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_ID					= 36000;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_SUBFIELD			= 15;
	
	public static final boolean		INTERCHANGE_CONTROLS_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_GROUP				= CODE_RULE_GROUP;

	public static final BinLevel	INTERCHANGE_CONTROLS_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	INTERCHANGE_CONTROLS_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	INTERCHANGE_CONTROLS_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_POINTER			= 0;
	public static final int 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	INTERCHANGE_CONTROLS_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		INTERCHANGE_CONTROLS_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	INTERCHANGE_CONTROLS_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
		
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_ID				= 36000;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD		= 16;
	
	public static final boolean		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER			= 0;
	public static final int 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
				
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_ID			= 36000;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD		= 17;
	
	public static final boolean		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER		= 0;
	public static final int 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
				
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_ID			= 36000;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD		= 18;
	
	public static final boolean		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER		= 0;
	public static final int 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
				
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA - 2 FIELDS; EXPIRATION DATE [ YY MM ] + SERVICE CODE [ PIC X(03) ]
	//--------------------------------------------------------------------------------------
	
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_ID					= 36000;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_SUBFIELD			= 19;
	
	public static final boolean		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_GROUP				= DATE_TIME_RULE_GROUP;

	public static final BinLevel	EXPIRATION_DATE_YEAR_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	EXPIRATION_DATE_YEAR_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	EXPIRATION_DATE_YEAR_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_POINTER			= DATE_TIME_RULE_ROUTINE;
	public static final int 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	EXPIRATION_DATE_YEAR_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		EXPIRATION_DATE_YEAR_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	EXPIRATION_DATE_YEAR_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_ID				= 36000;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_SUBFIELD			= 20;
	
	public static final boolean		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_GROUP				= DATE_TIME_RULE_GROUP;

	public static final BinLevel	EXPIRATION_DATE_MONTH_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	EXPIRATION_DATE_MONTH_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	EXPIRATION_DATE_MONTH_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_POINTER			= DATE_TIME_RULE_ROUTINE;
	public static final int 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	EXPIRATION_DATE_MONTH_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		EXPIRATION_DATE_MONTH_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	EXPIRATION_DATE_MONTH_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_ID					= 36000;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_SUBFIELD			= 21;
	
	public static final boolean		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_GROUP				= SEQUENCE_RULE_GROUP;

	public static final BinLevel	CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_POINTER			= SEQUENCE_RULE_ROUTINE;
	public static final int 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_ID					= 36000;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_FIELD				= 36;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_SUBFIELD			= 22;
	
	public static final boolean		CARD_SECURITY_NUMBER_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CARD_SECURITY_NUMBER_036_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CARD_SECURITY_NUMBER_036_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CARD_SECURITY_NUMBER_036_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_POINTER			= 0;
	public static final int 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	CARD_SECURITY_NUMBER_036_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		CARD_SECURITY_NUMBER_036_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	CARD_SECURITY_NUMBER_036_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	// ADDITIONAL DATA
	//--------------------------------------------------------------------------------------
	
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_ID			= 36000;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SUBFIELD		= 23;
	
	public static final boolean		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_POINTER		= 0;
	public static final int 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_ID		= 36000;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SUBFIELD	= 24;
	
	public static final boolean		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_POINTER	= 0;
	public static final int 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_ID							= 36000;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_SUBFIELD					= 25;
	
	public static final boolean		RELAY_MARKER_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_TYPE						= UNASSIGNED_RULE_TYPE;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_GROUP						= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	RELAY_MARKER_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	RELAY_MARKER_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	RELAY_MARKER_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_POINTER					= 0;
	public static final int 		RELAY_MARKER_036_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		RELAY_MARKER_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	RELAY_MARKER_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		RELAY_MARKER_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	RELAY_MARKER_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;

	//--------------------------------------------------------------------------------------
	
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_ID			= 36000;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_SUBFIELD		= 26;
	
	public static final boolean		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
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
	
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_ID				= 36000;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_SUBFIELD		= 27;
	
	public static final boolean		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_POINTER			= ARITHMETIC_RULE_ROUTINE;
	public static final int 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_ID				= 36000;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_SUBFIELD			= 28;
	
	public static final boolean		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PIN_VERIFICATION_VALUE_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PIN_VERIFICATION_VALUE_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PIN_VERIFICATION_VALUE_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_POINTER			= ARITHMETIC_RULE_ROUTINE;
	public static final int 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	PIN_VERIFICATION_VALUE_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		PIN_VERIFICATION_VALUE_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	PIN_VERIFICATION_VALUE_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------
	
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_ID				= 36000;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_FIELD			= 36;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_SUBFIELD		= 29;
	
	public static final boolean		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CARD_VERIFICATION_VALUE_036_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CARD_VERIFICATION_VALUE_036_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CARD_VERIFICATION_VALUE_036_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_POINTER			= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	CARD_VERIFICATION_VALUE_036_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		CARD_VERIFICATION_VALUE_036_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	CARD_VERIFICATION_VALUE_036_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
		
		//--------------------------------------------------------------------------------------
		
	public static final int 		END_SENTINEL_036_RULE_DETAIL_ID							= 36000;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_FIELD						= 36;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_SUBFIELD					= 30;
	
	public static final boolean		END_SENTINEL_036_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_TYPE						= UNASSIGNED_RULE_TYPE;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_GROUP						= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	END_SENTINEL_036_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	END_SENTINEL_036_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	END_SENTINEL_036_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		END_SENTINEL_036_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_POINTER					= CHARACTER_RULE_ROUTINE;
	public static final int 		END_SENTINEL_036_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		END_SENTINEL_036_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp 	END_SENTINEL_036_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String 		END_SENTINEL_036_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp 	END_SENTINEL_036_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
			
	//--------------------------------------------------------------------------------------
	// LONGITUDINAL_REDUNDANCY_CHECK_CHARACTER
	//--------------------------------------------------------------------------------------
			
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_ID			= 36000;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_FIELD		= 36;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_SUBFIELD		= 31;
	
	public static final boolean		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
			
}
