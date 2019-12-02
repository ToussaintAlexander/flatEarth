package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE055RuleDetail {

	public static final int NUMBER_OF_DE055_FIELDS	                						= 25;
	
	public static final int ISSUER_SCRIPTS_055_INDEX										= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_ID					= 55000;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_FIELD				= 55;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_SUBFIELD			= 0;
	
	public static final boolean		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ISSUER_SCRIPTS_055_7100_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ISSUER_SCRIPTS_055_7100_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ISSUER_SCRIPTS_055_7100_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_POINTER				= 0;
	public static final int 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	ISSUER_SCRIPTS_055_7100_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		ISSUER_SCRIPTS_055_7100_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	ISSUER_SCRIPTS_055_7100_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_ID					= 55000;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_FIELD				= 55;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_SUBFIELD			= 1;
	
	public static final boolean		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ISSUER_SCRIPTS_055_7200_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ISSUER_SCRIPTS_055_7200_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ISSUER_SCRIPTS_055_7200_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_POINTER				= 0;
	public static final int 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	ISSUER_SCRIPTS_055_7200_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		ISSUER_SCRIPTS_055_7200_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	ISSUER_SCRIPTS_055_7200_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_ID		= 55000;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_FIELD		= 55;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_SUBFIELD	= 2;
	
	public static final boolean		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_POINTER	= 0;
	public static final int 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String		APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_ID					= 55000;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_FIELD				= 55;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_SUBFIELD			= 3;
	
	public static final boolean		DEDICATED_FNAME_055_8400_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	DEDICATED_FNAME_055_8400_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	DEDICATED_FNAME_055_8400_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	DEDICATED_FNAME_055_8400_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_POINTER			= 0;
	public static final int 		DEDICATED_FNAME_055_8400_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		DEDICATED_FNAME_055_8400_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	DEDICATED_FNAME_055_8400_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		DEDICATED_FNAME_055_8400_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	DEDICATED_FNAME_055_8400_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_ID						= 55000;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_FIELD					= 55;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_SUBFIELD				= 4;
	
	public static final boolean		ISSUER_ARPC_055_9100_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ISSUER_ARPC_055_9100_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ISSUER_ARPC_055_9100_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ISSUER_ARPC_055_9100_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_SEQUENCE				= 0;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_POINTER				= ARITHMETIC_RULE_ROUTINE;
	public static final int 		ISSUER_ARPC_055_9100_RULE_DETAIL_VALUE					= 0;
	
	public static final String 		ISSUER_ARPC_055_9100_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	ISSUER_ARPC_055_9100_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		ISSUER_ARPC_055_9100_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	ISSUER_ARPC_055_9100_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_ID						= 55000;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_FIELD					= 55;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_SUBFIELD					= 5;
	
	public static final boolean		TVR_FLAGS_055_9500_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_TYPE						= UNASSIGNED_RULE_TYPE;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	TVR_FLAGS_055_9500_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TVR_FLAGS_055_9500_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TVR_FLAGS_055_9500_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_POINTER					= 0;
	public static final int 		TVR_FLAGS_055_9500_RULE_DETAIL_VALUE					= 0;
	
	public static final String 		TVR_FLAGS_055_9500_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	TVR_FLAGS_055_9500_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		TVR_FLAGS_055_9500_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	TVR_FLAGS_055_9500_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_ID							= 55000;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_FIELD						= 55;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_SUBFIELD					= 6;
	
	public static final boolean		TRAN_DATE_055_9A_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_TYPE						= NUMERIC_RULE_TYPE;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_GROUP						= DATE_TIME_RULE_GROUP;

	public static final BinLevel	TRAN_DATE_055_9A_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_DATE_055_9A_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_DATE_055_9A_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_POINTER					= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRAN_DATE_055_9A_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		TRAN_DATE_055_9A_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp	TRAN_DATE_055_9A_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String		TRAN_DATE_055_9A_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp	TRAN_DATE_055_9A_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_ID							= 55000;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_FIELD						= 55;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_SUBFIELD					= 7;
	
	public static final boolean		TRAN_TYPE_055_9C_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;


	public static final BinLevel	TRAN_TYPE_055_9C_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_TYPE_055_9C_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_TYPE_055_9C_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_POINTER					= EXACT_RULE_ROUTINE;
	public static final int 		TRAN_TYPE_055_9C_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		TRAN_TYPE_055_9C_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp	TRAN_TYPE_055_9C_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String		TRAN_TYPE_055_9C_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp	TRAN_TYPE_055_9C_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_ID						= 55000;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_FIELD					= 55;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_SUBFIELD				= 8;
	
	public static final boolean		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	NEW_PIN_BLOCK_055_HC_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	NEW_PIN_BLOCK_055_HC_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	NEW_PIN_BLOCK_055_HC_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_SEQUENCE				= 0;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_POINTER				= ARITHMETIC_RULE_ROUTINE;
	public static final int 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_VALUE					= 0;
	
	public static final String 		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	NEW_PIN_BLOCK_055_HC_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		NEW_PIN_BLOCK_055_HC_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	NEW_PIN_BLOCK_055_HC_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_ID					= 55000;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_FIELD				= 55;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_SUBFIELD			= 9;
	
	public static final boolean		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_GROUP				= CODE_RULE_GROUP;

	public static final BinLevel	TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_ID						= 55000;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_FIELD					= 55;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_SUBFIELD				= 10;
	
	public static final boolean		TRAN_AMOUNT_055_9F02_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_TYPE					= NUMERIC_RULE_TYPE;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_GROUP					= CURRENCY_RULE_GROUP;

	public static final BinLevel	TRAN_AMOUNT_055_9F02_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_AMOUNT_055_9F02_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_AMOUNT_055_9F02_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_POINTER				= CURRENCY_RULE_ROUTINE;
	public static final int 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		TRAN_AMOUNT_055_9F02_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	TRAN_AMOUNT_055_9F02_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		TRAN_AMOUNT_055_9F02_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	TRAN_AMOUNT_055_9F02_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_ID				= 55000;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_FIELD			= 55;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_SUBFIELD		= 11;
	
	public static final boolean		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_GROUP			= CURRENCY_RULE_GROUP;

	public static final BinLevel	OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_POINTER		= CURRENCY_RULE_ROUTINE;
	public static final int 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_ID				= 55000;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_FIELD				= 55;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_SUBFIELD			= 12;
	
	public static final boolean		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	APPL_VERSION_NBR_055_9F09_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	APPL_VERSION_NBR_055_9F09_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	APPL_VERSION_NBR_055_9F09_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_POINTER			= 0;
	public static final int 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	APPL_VERSION_NBR_055_9F09_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		APPL_VERSION_NBR_055_9F09_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	APPL_VERSION_NBR_055_9F09_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_ID				= 55000;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_FIELD			= 55;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_SUBFIELD		= 13;
	
	public static final boolean		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_POINTER		= 0;
	public static final int 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_ID				= 55000;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_FIELD			= 55;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_SUBFIELD			= 14;
	
	public static final boolean		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_GROUP			= CODE_RULE_GROUP;

	public static final BinLevel	TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_ID					= 55000;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_FIELD				= 55;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_SUBFIELD			= 15;
	
	public static final boolean		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_GROUP				= CODE_RULE_GROUP;


	public static final BinLevel	TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_ID				= 55000;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_FIELD				= 55;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_SUBFIELD			= 16;
	
	public static final boolean		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_POINTER			= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_ID			= 55000;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_FIELD		= 55;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_SUBFIELD	= 17;
	
	public static final boolean		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_POINTER		= 0;
	public static final int 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_ID					= 55000;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_FIELD				= 55;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_SUBFIELD				= 18;
	
	public static final boolean		TERMINAL_TYPE_055_9F35_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_TYPE					= DATABASE_RULE_TYPE;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_GROUP				= CODE_RULE_GROUP;

	public static final BinLevel	TERMINAL_TYPE_055_9F35_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERMINAL_TYPE_055_9F35_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERMINAL_TYPE_055_9F35_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		TERMINAL_TYPE_055_9F35_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TERMINAL_TYPE_055_9F35_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TERMINAL_TYPE_055_9F35_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TERMINAL_TYPE_055_9F35_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_ID						= 55000;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_FIELD						= 55;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_SUBFIELD					= 19;
	
	public static final boolean		ATC_DATA_055_9F36_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_TYPE						= UNASSIGNED_RULE_TYPE;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_GROUP						= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ATC_DATA_055_9F36_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ATC_DATA_055_9F36_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ATC_DATA_055_9F36_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_SEQUENCE					= 0;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_POINTER					= SEQUENCE_RULE_ROUTINE;
	public static final int 		ATC_DATA_055_9F36_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		ATC_DATA_055_9F36_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	ATC_DATA_055_9F36_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		ATC_DATA_055_9F36_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	ATC_DATA_055_9F36_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_ID				= 55000;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_FIELD			= 55;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_SUBFIELD			= 20;
	
	public static final boolean		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_GROUP			= ARITHMETIC_RULE_GROUP;

	public static final BinLevel	UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_POINTER			= ARITHMETIC_RULE_ROUTINE;
	public static final int 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_ID					= 55000;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_FIELD					= 55;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_SUBFIELD				= 21;
	
	public static final boolean		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_TYPE					= NUMERIC_RULE_TYPE;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_GROUP					= SEQUENCE_RULE_GROUP;

	public static final BinLevel	TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_POINTER				= SEQUENCE_RULE_ROUTINE;
	public static final int 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_ID				= 55000;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_FIELD			= 55;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_SUBFIELD		= 22;
	
	public static final boolean		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_TYPE			= DATABASE_RULE_TYPE;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_GROUP			= CODE_RULE_GROUP;

	public static final BinLevel	TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_ID				= 55000;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_FIELD			= 55;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_SUBFIELD		= 23;
	
	public static final boolean		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_POINTER			= 0;
	public static final int 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;

	//-------------------------------------------------------------------------------------------
	
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_ID						= 55000;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_FIELD					= 55;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_SUBFIELD				= 24;
	
	public static final boolean		FORM_FACTOR_055_9F6E_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	FORM_FACTOR_055_9F6E_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	FORM_FACTOR_055_9F6E_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	FORM_FACTOR_055_9F6E_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_SEQUENCE				= 0;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		FORM_FACTOR_055_9F6E_RULE_DETAIL_VALUE					= 0;
	
	public static final String 		FORM_FACTOR_055_9F6E_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	FORM_FACTOR_055_9F6E_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		FORM_FACTOR_055_9F6E_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	FORM_FACTOR_055_9F6E_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
}
