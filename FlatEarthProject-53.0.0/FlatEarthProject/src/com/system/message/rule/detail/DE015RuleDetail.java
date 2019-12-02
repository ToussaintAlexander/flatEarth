package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE015RuleDetail {

	public static final int NUMBER_OF_DE015_FIELDS	                = 2;
	
	public static final int SETTLEMENT_DATE_MONTH_015_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_ID		= 15000;	 
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_FIELD		= 15;	 
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_POINTER	= DATE_TIME_RULE_ROUTINE;
	public static final int 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_VALUE		= 30;

	public static final String 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
	//------------------------------------------------------------------------------------------
	
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_ID			= 15000;	 
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_FIELD		= 15;	 
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_SUBFIELD	= 1;
	
	public static final boolean		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	SETTLEMENT_DATE_DAY_015_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SETTLEMENT_DATE_DAY_015_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SETTLEMENT_DATE_DAY_015_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_VALUE		= 30;

	public static final String 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	SETTLEMENT_DATE_DAY_015_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		SETTLEMENT_DATE_DAY_015_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	SETTLEMENT_DATE_DAY_015_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
