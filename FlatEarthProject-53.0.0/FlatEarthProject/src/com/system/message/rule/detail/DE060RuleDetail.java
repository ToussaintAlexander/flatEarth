package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE060RuleDetail {

	public static final int NUMBER_OF_DE060_FIELDS	                    					= 5;
	
	public static final int TERMINAL_TYPE_060_INDEX											= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_ID						= 60000;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_FIELD						= 60;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_SUBFIELD					= 0;
	
	public static final boolean		TERMINAL_TYPE_060_RULE_DETAIL_FIRE						= RULE_NOT_FIRED_B;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_TYPE						= DATABASE_RULE_TYPE;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_GROUP						= CODE_RULE_GROUP;

	public static final BinLevel	TERMINAL_TYPE_060_RULE_DETAIL_BL						= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERMINAL_TYPE_060_RULE_DETAIL_AL						= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERMINAL_TYPE_060_RULE_DETAIL_TL						= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_SEQUENCE					= 10;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_POINTER					= EXACT_RULE_ROUTINE;
	public static final int 		TERMINAL_TYPE_060_RULE_DETAIL_VALUE						= 30;
	
	public static final String 		TERMINAL_TYPE_060_RULE_DETAIL_CU						= CREATE_USER;
	public static final Timestamp	TERMINAL_TYPE_060_RULE_DETAIL_CT						= CREATE_TIMESTAMP;
	public static final String		TERMINAL_TYPE_060_RULE_DETAIL_MU						= MODIFY_USER;
	public static final Timestamp	TERMINAL_TYPE_060_RULE_DETAIL_MT						= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_ID			= 60000;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_FIELD			= 60;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_TYPE			= DATABASE_RULE_TYPE;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_GROUP			= CODE_RULE_GROUP;

	public static final BinLevel	TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_POINTER		= EXACT_RULE_ROUTINE;
	public static final int 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_ID			= 60000;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_FIELD		= 60;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_SUBFIELD	= 2;
	
	public static final boolean		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_POINTER		= EXACT_RULE_ROUTINE;
	public static final int 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_ID			= 60000;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_FIELD		= 60;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_SUBFIELD		= 3;
	
	public static final boolean		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_POINTER		= EXACT_RULE_ROUTINE;
	public static final int 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------
	
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_ID				= 60000;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_FIELD			= 60;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_SUBFIELD			= 4;
	
	public static final boolean		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_TYPE				= CONSTANT_RULE_TYPE;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_GROUP			= CHARACTER_RULE_GROUP;

	public static final BinLevel	PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
}
