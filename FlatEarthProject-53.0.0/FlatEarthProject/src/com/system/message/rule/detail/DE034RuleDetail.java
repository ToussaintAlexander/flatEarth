package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE034RuleDetail {

	public static final int NUMBER_OF_DE034_FIELDS	                    						= 1;
	
	public static final int EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_ID			= 34000;	 
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_FIELD		= 34;	 
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_POINTER		= NO_OPERATION_RTN;
	public static final int 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_MT			= CREATE_TIMESTAMP;
	
}
