package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE013RuleDetail {

	public static final int NUMBER_OF_DE013_FIELDS	                    	= 2;
	
	public static final int LOCAL_TRANSACTION_DATE_MONTH_013_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_ID			= 13000;	 
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_FIELD		= 13;	 
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_POINTER	= DATE_TIME_RULE_ROUTINE;
	public static final int 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_VALUE		= 30;

	public static final String 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------------------
	
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_ID			= 11000;	 
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_FIELD		= 13;	 
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_VALUE		= 30;

	public static final String 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}