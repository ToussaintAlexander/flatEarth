package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE063RuleDetail {

	public static final int NUMBER_OF_DE063_FIELDS	    								= 6;
	
	public static final int BITMAP_063_INDEX											= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		BITMAP_063_RULE_DETAIL_ID							= 63000;
	public static final int 		BITMAP_063_RULE_DETAIL_FIELD						= 63;
	public static final int 		BITMAP_063_RULE_DETAIL_SUBFIELD						= 0;
	
	public static final boolean		BITMAP_063_RULE_DETAIL_FIRE							= RULE_NOT_FIRED_B;
	public static final int 		BITMAP_063_RULE_DETAIL_TYPE							= UNASSIGNED_RULE_TYPE;
	public static final int 		BITMAP_063_RULE_DETAIL_GROUP						= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	BITMAP_063_RULE_DETAIL_BL							= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	BITMAP_063_RULE_DETAIL_AL							= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	BITMAP_063_RULE_DETAIL_TL							= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		BITMAP_063_RULE_DETAIL_SEQUENCE						= 0;
	public static final int 		BITMAP_063_RULE_DETAIL_POINTER						= BITMAP_RULE_ROUTINE;
	public static final int 		BITMAP_063_RULE_DETAIL_VALUE						= 0;
	
	public static final String 		BITMAP_063_RULE_DETAIL_CU							= CREATE_USER;
	public static final Timestamp	BITMAP_063_RULE_DETAIL_CT							= CREATE_TIMESTAMP;
	public static final String		BITMAP_063_RULE_DETAIL_MU							= MODIFY_USER;
	public static final Timestamp	BITMAP_063_RULE_DETAIL_MT							= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------
	
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_ID					= 63000;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_FIELD				= 63;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_SUBFIELD			= 1;
	
	public static final boolean		NETWORK_ID_CODE_063_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	NETWORK_ID_CODE_063_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	NETWORK_ID_CODE_063_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	NETWORK_ID_CODE_063_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		NETWORK_ID_CODE_063_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		NETWORK_ID_CODE_063_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	NETWORK_ID_CODE_063_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		NETWORK_ID_CODE_063_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	NETWORK_ID_CODE_063_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------
	
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_ID				= 63000;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_FIELD			= 63;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_SUBFIELD			= 2;
	
	public static final boolean		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_TYPE				= UNASSIGNED_RULE_TYPE;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PREAUTH_TIME_LIMIT_063_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	PREAUTH_TIME_LIMIT_063_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	PREAUTH_TIME_LIMIT_063_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_SEQUENCE			= 0;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_POINTER			= DATE_TIME_RULE_ROUTINE;
	public static final int 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	PREAUTH_TIME_LIMIT_063_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		PREAUTH_TIME_LIMIT_063_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	PREAUTH_TIME_LIMIT_063_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------
	
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_ID				= 63000;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_FIELD			= 63;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_SUBFIELD		= 3;
	
	public static final boolean		MESSAGE_REASON_CODE_063_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_TYPE			= DATABASE_RULE_TYPE;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_GROUP			= CODE_RULE_GROUP;

	public static final BinLevel	MESSAGE_REASON_CODE_063_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	MESSAGE_REASON_CODE_063_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	MESSAGE_REASON_CODE_063_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		MESSAGE_REASON_CODE_063_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		MESSAGE_REASON_CODE_063_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	MESSAGE_REASON_CODE_063_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		MESSAGE_REASON_CODE_063_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	MESSAGE_REASON_CODE_063_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------
	
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_ID			= 63000;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_FIELD		= 63;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_SUBFIELD	= 4;
	
	public static final boolean		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_TYPE		= DATABASE_RULE_TYPE;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_GROUP		= CODE_RULE_GROUP;

	public static final BinLevel	STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_POINTER		= EXACT_RULE_ROUTINE;
	public static final int 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
