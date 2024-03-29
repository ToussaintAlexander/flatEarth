package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE029RuleDetail {

	public static final int NUMBER_OF_DE029_FIELDS	               	 				= 2;
	
	public static final int SETTLEMENT_FEE_AMOUNT_029_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_ID				= 29000;	 
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_FIELD				= 29;	 
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_SUBFIELD			= 0;
	
	public static final boolean		ACCOUNT_ENTRY_029_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_GROUP				= CODE_RULE_GROUP;

	public static final BinLevel	ACCOUNT_ENTRY_029_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	ACCOUNT_ENTRY_029_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	ACCOUNT_ENTRY_029_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_POINTER			= EXACT_RULE_ROUTINE;
	public static final int 		ACCOUNT_ENTRY_029_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		ACCOUNT_ENTRY_029_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp 	ACCOUNT_ENTRY_029_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String 		ACCOUNT_ENTRY_029_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp 	ACCOUNT_ENTRY_029_RULE_DETAIL_MT				= CREATE_TIMESTAMP;
	
	//----------------------------------------------------------------------------------------------
		
	
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_ID		= 29000;	 
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_FIELD		= 29;	 
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_SUBFIELD	= 1;
	
	public static final boolean		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_GROUP		= CURRENCY_RULE_GROUP;

	public static final BinLevel	SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_POINTER	= CURRENCY_RULE_ROUTINE;
	public static final int 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_MT		= CREATE_TIMESTAMP;
	
}
