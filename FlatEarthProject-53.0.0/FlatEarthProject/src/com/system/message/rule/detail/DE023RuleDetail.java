package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE023RuleDetail {

	public static final int NUMBER_OF_DE023_FIELDS	                    						= 1;
	
	public static final int APPLICATION_PAN_SEQUENCE_NUMBER_023_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_ID			= 23000;	 
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_FIELD		= 23;	 
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_GROUP		= SEQUENCE_RULE_GROUP;

	public static final BinLevel	APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;

	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_POINTER		= SEQUENCE_RULE_ROUTINE;
	public static final int 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
