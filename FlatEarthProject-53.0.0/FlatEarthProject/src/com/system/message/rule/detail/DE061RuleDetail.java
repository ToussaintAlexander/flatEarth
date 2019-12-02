package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE061RuleDetail {

	public static final int NUMBER_OF_DE061_FIELDS	                    = 2;
	
	public static final int TRANSACTION_OTHER_AMOUNT_061_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_ID					= 61000;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_FIELD				= 61;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_SUBFIELD			= 0;
	
	public static final boolean		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_GROUP				= CURRENCY_RULE_GROUP;

	public static final BinLevel	TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_POINTER			= CURRENCY_RULE_ROUTINE;
	public static final int 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------------------
	
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_ID			= 61000;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_FIELD		= 61;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_SUBFIELD	= 1;
	
	public static final boolean		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_GROUP		= CURRENCY_RULE_GROUP;

	public static final BinLevel	CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_POINTER		= CURRENCY_RULE_ROUTINE;
	public static final int 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
