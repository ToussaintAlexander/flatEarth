package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE007RuleDetail {
	 
	// DE007 Rule Detail

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE007_RULE_DETAIL_REPORT_TITLE						= "DE007 Rule Detail";
	
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_ID			= 7000;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_FIELD		= 7;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;
	
	public static final BinLevel	TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_VALUE		= 12;
	
	public static final String 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------
	
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_ID			= 7100;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_FIELD			= 7;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_GROUP			= DATE_TIME_RULE_GROUP;
	
	public static final BinLevel	TRANSMISSION_DATE_DAY_007_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_DATE_DAY_007_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_DATE_DAY_007_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_VALUE			= 31;
	
	public static final String 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_DATE_DAY_007_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_DATE_DAY_007_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_DATE_DAY_007_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------
	
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_ID			= 7200;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_FIELD		= 7;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_SUBFIELD		= 2;
	
	public static final boolean		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;
	
	public static final BinLevel	TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_SEQUENCE		= 1;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_VALUE		= 23;
	
	public static final String 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------
	
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_ID			= 7300;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_FIELD		= 7;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_SUBFIELD	= 3;
	
	public static final boolean		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;
	
	public static final BinLevel	TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_SEQUENCE	= 2;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_POINTER	= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_VALUE		= 59;
	
	public static final String 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-----------------------------------------------------------------------------
	
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_ID			= 7400;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_FIELD		= 7;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_SUBFIELD	= 4;
	
	public static final boolean		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;
	
	public static final BinLevel	TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_SEQUENCE	= 3;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_POINTER	= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_VALUE		= 59;
	
	public static final String 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
