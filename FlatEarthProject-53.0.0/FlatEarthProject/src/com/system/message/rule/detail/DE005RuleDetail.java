package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE005RuleDetail {
	 
	// DE005 Rule Detail

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 		DE005_RULE_DETAIL_REPORT_TITLE				= "DE005 Rule Detail";
	
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_ID		= 5000;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_FIELD		= 5;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		SETTLEMENT_AMOUNT_005_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_GROUP		= CURRENCY_RULE_GROUP;
	
	public static final BinLevel	SETTLEMENT_AMOUNT_005_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SETTLEMENT_AMOUNT_005_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SETTLEMENT_AMOUNT_005_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_POINTER	= CURRENCY_RULE_ROUTINE;
	public static final int 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_VALUE		= 17500;
	
	public static final String 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	SETTLEMENT_AMOUNT_005_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		SETTLEMENT_AMOUNT_005_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	SETTLEMENT_AMOUNT_005_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
}
