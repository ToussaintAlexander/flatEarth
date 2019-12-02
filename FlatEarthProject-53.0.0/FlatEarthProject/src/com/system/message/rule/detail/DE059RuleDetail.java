package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE059RuleDetail {

	public static final int NUMBER_OF_DE059_FIELDS	                				= 1;
	
	public static final int NATIONAL_POS_GEO_DATA_059_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_ID		= 59000;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_FIELD		= 59;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_POINTER	= 0;
	public static final int 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp	NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String		NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp	NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
}
