package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE058RuleDetail {
	 
	// DE058 Rule Detail

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 		DE058_RULE_DETAIL_REPORT_TITLE						= "DE058 Rule Detail";
	
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_ID			= 0;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_FIELD		= 0;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_POINTER		= NO_OPERATION_RTN;
	public static final int 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
