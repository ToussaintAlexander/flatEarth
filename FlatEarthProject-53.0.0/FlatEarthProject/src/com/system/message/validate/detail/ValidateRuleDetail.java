package com.system.message.validate.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface ValidateRuleDetail {
	 
  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 		VALIDATE_DETAIL_REPORT_TITLE	= "Validate Detail";
	
	public static final int 		VALIDATE_RULE_DETAIL_ID			= 0;
	public static final int 		VALIDATE_RULE_DETAIL_FIELD		= 0;
	public static final int 		VALIDATE_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final int			VALIDATE_RULE_DETAIL_FIRE		= 0;
	public static final int 		VALIDATE_RULE_DETAIL_TYPE		= 0;
	public static final int 		VALIDATE_RULE_DETAIL_GROUP		= 0;
	
	public static final BinLevel	VALIDATE_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	VALIDATE_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	VALIDATE_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		VALIDATE_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		VALIDATE_RULE_DETAIL_POINTER	= 0;
	public static final int 		VALIDATE_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		VALIDATE_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	VALIDATE_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		VALIDATE_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	VALIDATE_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
