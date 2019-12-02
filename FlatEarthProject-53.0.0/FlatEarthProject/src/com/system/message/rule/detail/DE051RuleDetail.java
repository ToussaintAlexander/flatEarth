package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE051RuleDetail {

	public static final int NUMBER_OF_DE051_FIELDS	                    						= 1;
	
	public static final int CARDHOLDER_BILLING_CURRENCY_CODE_051_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_ID			= 51000;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_FIELD		= 51;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_TYPE		= DATABASE_RULE_TYPE;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_GROUP		= CODE_RULE_GROUP;

	public static final BinLevel	CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_POINTER	= EXACT_RULE_ROUTINE;
	public static final int 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
