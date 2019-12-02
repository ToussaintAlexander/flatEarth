package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE043RuleDetail {

	public static final int NUMBER_OF_DE043_FIELDS	                    							= 4;
	
	public static final int CARD_ACCEPTOR_NAME_LOCATION_043_INDEX									= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_ID			= 43000;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_FIELD		= 43;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_TYPE		= ADDRESS_RULE_TYPE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_GROUP		= ADDRESS_RULE_GROUP;

	public static final BinLevel	CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_POINTER		= ADDRESS_RULE_ROUTINE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------------------------------

	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_ID				= 43000;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_FIELD			= 43;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_TYPE			= ADDRESS_RULE_TYPE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_GROUP			= CITY_RULE_GROUP;

	public static final BinLevel	CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_POINTER		= ADDRESS_RULE_ROUTINE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------------------------------
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_ID			= 43000;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_FIELD			= 43;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_SUBFIELD		= 2;
	
	public static final boolean		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_TYPE			= ADDRESS_RULE_TYPE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_GROUP			= STATE_RULE_GROUP;

	public static final BinLevel	CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_SEQUENCE		= 10;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_POINTER		= ADDRESS_RULE_ROUTINE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_VALUE			= 30;
	
	public static final String 		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//--------------------------------------------------------------------------------------------------------------
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_ID			= 43000;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_FIELD		= 43;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_SUBFIELD	= 3;
	
	public static final boolean		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_TYPE		= ADDRESS_RULE_TYPE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_GROUP		= COUNTRY_RULE_GROUP;

	public static final BinLevel	CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_POINTER		= ADDRESS_RULE_ROUTINE;
	public static final int 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
}
