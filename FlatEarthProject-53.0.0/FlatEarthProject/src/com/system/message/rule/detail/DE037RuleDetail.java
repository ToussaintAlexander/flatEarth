package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE037RuleDetail {

	public static final int NUMBER_OF_DE037_FIELDS	                   					= 4;
	
	public static final int RETRIEVAL_REFERENCE_NUMBER_037_INDEX						= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_ID			= 37000;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_FIELD		= 37;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_SUBFIELD		= 0;
	
	public static final boolean		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_ID					= 37000;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_FIELD				= 37;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_SUBFIELD			= 1;
	
	public static final boolean		JULIAN_DAY_MONTH_037_RULE_DETAIL_FIRE				= RULE_NOT_FIRED_B;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_TYPE				= NUMERIC_RULE_TYPE;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_GROUP				= DATE_TIME_RULE_GROUP;

	public static final BinLevel	JULIAN_DAY_MONTH_037_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	JULIAN_DAY_MONTH_037_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	JULIAN_DAY_MONTH_037_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_SEQUENCE			= 10;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_POINTER			= DATE_TIME_RULE_ROUTINE;
	public static final int 		JULIAN_DAY_MONTH_037_RULE_DETAIL_VALUE				= 30;
	
	public static final String 		JULIAN_DAY_MONTH_037_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp 	JULIAN_DAY_MONTH_037_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String 		JULIAN_DAY_MONTH_037_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp 	JULIAN_DAY_MONTH_037_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_ID			= 37000;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_FIELD		= 37;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_SUBFIELD		= 2;
	
	public static final boolean		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_TYPE			= NUMERIC_RULE_TYPE;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_GROUP		= DATE_TIME_RULE_GROUP;

	public static final BinLevel	TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_POINTER		= DATE_TIME_RULE_ROUTINE;
	public static final int 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp 	TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String 		TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp 	TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_ID		= 37000;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_FIELD	= 37;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_SUBFIELD	= 3;
	
	public static final boolean		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_TYPE		= NUMERIC_RULE_TYPE;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_GROUP	= SEQUENCE_RULE_GROUP;

	public static final BinLevel	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_POINTER	= SEQUENCE_RULE_ROUTINE;
	public static final int 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_VALUE	= 30;
	
	public static final String 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String 		SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp 	SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
}
