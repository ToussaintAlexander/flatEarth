package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE010RuleDetail {

	public static final int 	NUMBER_OF_DE010_FIELDS	                    						= 1;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_INDEX						= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_ID			= 10000;	 
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_FIELD		= 10;	 
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_SUBFIELD		= 0;
	
	public static final boolean		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_GROUP		= RATE_RULE_GROUP;

	public static final BinLevel	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_POINTER		= RATE_RULE_ROUTINE;
	public static final int 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_VALUE		= 30;

	public static final String 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
