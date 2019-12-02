package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE003RuleDetail {
	 
	// DE003 Rule Detail

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 		DE003_RULE_DETAIL_REPORT_TITLE				= "DE003 Rule Detail";
	
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_ID			= 3000;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_FIELD		= 3;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		TRANSACTION_TYPE_003_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_TYPE		= DATABASE_RULE_TYPE;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_GROUP		= CODE_RULE_GROUP;	
	
	public static final BinLevel	TRANSACTION_TYPE_003_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSACTION_TYPE_003_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSACTION_TYPE_003_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_POINTER	= EXACT_RULE_ROUTINE;
	public static final int 		TRANSACTION_TYPE_003_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		TRANSACTION_TYPE_003_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSACTION_TYPE_003_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSACTION_TYPE_003_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSACTION_TYPE_003_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_ID		= 3000;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_FIELD		= 3;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_SUBFIELD	= 1;
	
	public static final boolean		ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_HEADER_TYPE		= DATABASE_RULE_TYPE;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_HEADER_GROUP		= CODE_RULE_GROUP;	
	
	public static final BinLevel	ACCOUNT_FROM_TYPE_003_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	ACCOUNT_FROM_TYPE_003_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	ACCOUNT_FROM_TYPE_003_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_SEQUENCE	= 1;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_POINTER	= EXACT_RULE_ROUTINE;
	public static final int 		ACCOUNT_FROM_TYPE_003_RULE_HEADER_VALUE		= 20;
	
	public static final String 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	ACCOUNT_FROM_TYPE_003_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		ACCOUNT_FROM_TYPE_003_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	ACCOUNT_FROM_TYPE_003_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_ID			= 3000;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_FIELD		= 3;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_SUBFIELD	= 2;
	
	public static final boolean		ACCOUNT_TO_TYPE_003_RULE_HEADER_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_HEADER_TYPE		= DATABASE_RULE_TYPE;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_HEADER_GROUP		= CODE_RULE_GROUP;	
	
	public static final BinLevel	ACCOUNT_TO_TYPE_003_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	ACCOUNT_TO_TYPE_003_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	ACCOUNT_TO_TYPE_003_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_SEQUENCE	= 2;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_POINTER		= EXACT_RULE_ROUTINE;
	public static final int 		ACCOUNT_TO_TYPE_003_RULE_HEADER_VALUE		= 30;
	
	public static final String 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	ACCOUNT_TO_TYPE_003_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		ACCOUNT_TO_TYPE_003_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	ACCOUNT_TO_TYPE_003_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
