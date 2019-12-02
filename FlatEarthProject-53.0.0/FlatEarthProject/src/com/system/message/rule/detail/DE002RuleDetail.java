package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE002RuleDetail {
	 
	// DE002 Rule Detail

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 		DE002_RULE_DETAIL_REPORT_TITLE			= "DE002 Rule Detail";
	
	public static final int 		BIN_002_RULE_DETAIL_ID					= 2000;
	public static final int 		BIN_002_RULE_DETAIL_FIELD				= 2;
	public static final int 		BIN_002_RULE_DETAIL_SUBFIELD			= 0;
	
	public static final boolean		BIN_002_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		BIN_002_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		BIN_002_RULE_DETAIL_GROUP				= RANGE_RULE_GROUP;	
	
	public static final BinLevel	BIN_002_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	BIN_002_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	BIN_002_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		BIN_002_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		BIN_002_RULE_DETAIL_POINTER				= EXACT_RULE_ROUTINE;
	public static final int 		BIN_002_RULE_DETAIL_VALUE				= 450250;
	
	public static final String 		BIN_002_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	BIN_002_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		BIN_002_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	BIN_002_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		PAN_002_RULE_DETAIL_ID					= 2100;
	public static final int 		PAN_002_RULE_DETAIL_FIELD				= 2;
	public static final int 		PAN_002_RULE_DETAIL_SUBFIELD			= 1;
	
	public static final boolean		PAN_002_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		PAN_002_RULE_DETAIL_TYPE				= DATABASE_RULE_TYPE;
	public static final int 		PAN_002_RULE_DETAIL_GROUP				= EXACT_RULE_GROUP;	
	
	public static final BinLevel	PAN_002_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	PAN_002_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	PAN_002_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PAN_002_RULE_DETAIL_SEQUENCE			= 2;
	public static final int 		PAN_002_RULE_DETAIL_POINTER				= RANGE_RULE_ROUTINE;
	public static final int 		PAN_002_RULE_DETAIL_VALUE				= 123456789;
	
	public static final String 		PAN_002_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	PAN_002_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		PAN_002_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	PAN_002_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//----------------------------------------------------------------------------------
	
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_ID			= 2200;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_FIELD		= 2;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_SUBFIELD	= 2;
	
	public static final boolean		CHECK_DIGIT_002_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_GROUP		= ARITHMETIC_RULE_GROUP;	
	
	public static final BinLevel	CHECK_DIGIT_002_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	CHECK_DIGIT_002_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	CHECK_DIGIT_002_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_SEQUENCE	= 1;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_POINTER		= ARITHMETIC_RULE_ROUTINE;
	public static final int 		CHECK_DIGIT_002_RULE_DETAIL_VALUE		= 5;
	
	public static final String 		CHECK_DIGIT_002_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	CHECK_DIGIT_002_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		CHECK_DIGIT_002_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	CHECK_DIGIT_002_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
