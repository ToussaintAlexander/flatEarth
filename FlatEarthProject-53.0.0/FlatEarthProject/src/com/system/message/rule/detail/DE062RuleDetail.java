package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE062RuleDetail {

	public static final int NUMBER_OF_DE062_FIELDS	                    				= 7;
	
	public static final int FIELD_BITMAP_062_INDEX										= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_ID						= 62000;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_FIELD					= 62;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_SUBFIELD				= 0;
	
	public static final boolean		FIELD_BITMAP_062_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	FIELD_BITMAP_062_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	FIELD_BITMAP_062_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	FIELD_BITMAP_062_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_SEQUENCE				= 10;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_POINTER				= BITMAP_RULE_ROUTINE;
	public static final int 		FIELD_BITMAP_062_RULE_DETAIL_VALUE					= 30;
	
	public static final String 		FIELD_BITMAP_062_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	FIELD_BITMAP_062_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		FIELD_BITMAP_062_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	FIELD_BITMAP_062_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_ID				= 62000;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_FIELD			= 62;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	AUTH_CHAR_INDICATOR_062_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	AUTH_CHAR_INDICATOR_062_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	AUTH_CHAR_INDICATOR_062_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_POINTER			= CHARACTER_RULE_ROUTINE;
	public static final int 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	AUTH_CHAR_INDICATOR_062_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		AUTH_CHAR_INDICATOR_062_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	AUTH_CHAR_INDICATOR_062_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------------
	

	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_ID					= 62000;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_FIELD				= 62;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_SUBFIELD			= 2;
	
	public static final boolean		TRANS_IDENTIFIER_062_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	TRANS_IDENTIFIER_062_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRANS_IDENTIFIER_062_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRANS_IDENTIFIER_062_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		TRANS_IDENTIFIER_062_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		TRANS_IDENTIFIER_062_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TRANS_IDENTIFIER_062_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TRANS_IDENTIFIER_062_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TRANS_IDENTIFIER_062_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	//-----------------------------------------------------------------------------------
	
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_ID		= 62000;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_FIELD	= 62;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_SUBFIELD	= 3;
	
	public static final boolean		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_GROUP	= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_POINTER	= 0;
	public static final int 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_VALUE	= 0;
	
	public static final String 		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String		MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_ID						= 62000;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_FIELD					= 62;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_SUBFIELD				= 4;
	
	public static final boolean		MERCHANT_VV_062_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_GROUP					= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	MERCHANT_VV_062_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	MERCHANT_VV_062_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	MERCHANT_VV_062_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_SEQUENCE				= 0;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_POINTER					= 0;
	public static final int 		MERCHANT_VV_062_RULE_DETAIL_VALUE					= 0;
	
	public static final String 		MERCHANT_VV_062_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	MERCHANT_VV_062_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		MERCHANT_VV_062_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	MERCHANT_VV_062_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 		CARD_LEVEL_RESULTS_062_ID							= 62000;	 


	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_ID				= 62000;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_FIELD			= 62;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_SUBFIELD			= 5;
	
	public static final boolean		CARD_LEVEL_RESULTS_062_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CARD_LEVEL_RESULTS_062_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_LEVEL_RESULTS_062_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_LEVEL_RESULTS_062_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		CARD_LEVEL_RESULTS_062_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	CARD_LEVEL_RESULTS_062_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		CARD_LEVEL_RESULTS_062_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	CARD_LEVEL_RESULTS_062_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_ID				= 62000;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_FIELD			= 62;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_SUBFIELD			= 6;
	
	public static final boolean		PROGRAM_IDENTIFIER_062_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PROGRAM_IDENTIFIER_062_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	PROGRAM_IDENTIFIER_062_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	PROGRAM_IDENTIFIER_062_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PROGRAM_IDENTIFIER_062_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	PROGRAM_IDENTIFIER_062_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		PROGRAM_IDENTIFIER_062_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	PROGRAM_IDENTIFIER_062_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
}
