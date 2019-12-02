package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE053RuleDetail {

	public static final int NUMBER_OF_DE053_FIELDS	                = 7;
	
	public static final int KEY_MANAGEMENT_SCHEME_053_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_ID		= 53000;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_FIELD		= 53;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_POINTER	= 0;
	public static final int 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp	KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String		KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp	KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------

	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_ID			= 53000;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_FIELD		= 53;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_SUBFIELD		= 1;
	
	public static final boolean		KEY_SET_IDENTIFIER_053_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	KEY_SET_IDENTIFIER_053_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	KEY_SET_IDENTIFIER_053_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	KEY_SET_IDENTIFIER_053_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_POINTER		= 0;
	public static final int 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		KEY_SET_IDENTIFIER_053_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	KEY_SET_IDENTIFIER_053_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		KEY_SET_IDENTIFIER_053_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	KEY_SET_IDENTIFIER_053_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_ID			= 53000;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_FIELD		= 53;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_SUBFIELD	= 2;
	
	public static final boolean		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	ENCRYPTION_ALGORITHM_053_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	ENCRYPTION_ALGORITHM_053_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	ENCRYPTION_ALGORITHM_053_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_POINTER	= 0;
	public static final int 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	ENCRYPTION_ALGORITHM_053_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		ENCRYPTION_ALGORITHM_053_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	ENCRYPTION_ALGORITHM_053_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_ID					= 53000;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_FIELD				= 53;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_SUBFIELD				= 3;
	
	public static final boolean		KEY_LENGTH_053_RULE_DETAIL_FIRE					= RULE_NOT_FIRED_B;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_TYPE					= UNASSIGNED_RULE_TYPE;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_GROUP				= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	KEY_LENGTH_053_RULE_DETAIL_BL					= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	KEY_LENGTH_053_RULE_DETAIL_AL					= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	KEY_LENGTH_053_RULE_DETAIL_TL					= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_SEQUENCE				= 0;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_POINTER				= 0;
	public static final int 		KEY_LENGTH_053_RULE_DETAIL_VALUE				= 0;
	
	public static final String 		KEY_LENGTH_053_RULE_DETAIL_CU					= CREATE_USER;
	public static final Timestamp	KEY_LENGTH_053_RULE_DETAIL_CT					= CREATE_TIMESTAMP;
	public static final String		KEY_LENGTH_053_RULE_DETAIL_MU					= MODIFY_USER;
	public static final Timestamp	KEY_LENGTH_053_RULE_DETAIL_MT					= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_ID			= 53000;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_FIELD		= 53;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_SUBFIELD	= 4;
	
	public static final boolean		PROTECTION_MECHANISM_053_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	PROTECTION_MECHANISM_053_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	PROTECTION_MECHANISM_053_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	PROTECTION_MECHANISM_053_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_SEQUENCE	= 0;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_POINTER	= 0;
	public static final int 		PROTECTION_MECHANISM_053_RULE_DETAIL_VALUE		= 0;
	
	public static final String 		PROTECTION_MECHANISM_053_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	PROTECTION_MECHANISM_053_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		PROTECTION_MECHANISM_053_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	PROTECTION_MECHANISM_053_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_ID			= 53000;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_FIELD			= 53;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_SUBFIELD		= 5;
	
	public static final boolean		RESERVED_NATIONAL_053_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	RESERVED_NATIONAL_053_RULE_DETAIL_BL			= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	RESERVED_NATIONAL_053_RULE_DETAIL_AL			= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	RESERVED_NATIONAL_053_RULE_DETAIL_TL			= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_POINTER		= 0;
	public static final int 		RESERVED_NATIONAL_053_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		RESERVED_NATIONAL_053_RULE_DETAIL_CU			= CREATE_USER;
	public static final Timestamp	RESERVED_NATIONAL_053_RULE_DETAIL_CT			= CREATE_TIMESTAMP;
	public static final String		RESERVED_NATIONAL_053_RULE_DETAIL_MU			= MODIFY_USER;
	public static final Timestamp	RESERVED_NATIONAL_053_RULE_DETAIL_MT			= MODIFY_TIMESTAMP;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_ID				= 53000;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_FIELD			= 53;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_SUBFIELD		= 6;
	
	public static final boolean		RESERVED_PRIVATE_053_RULE_DETAIL_FIRE			= RULE_NOT_FIRED_B;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_TYPE			= UNASSIGNED_RULE_TYPE;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_GROUP			= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	RESERVED_PRIVATE_053_RULE_DETAIL_BL				= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	RESERVED_PRIVATE_053_RULE_DETAIL_AL				= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	RESERVED_PRIVATE_053_RULE_DETAIL_TL				= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_SEQUENCE		= 0;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_POINTER		= 0;
	public static final int 		RESERVED_PRIVATE_053_RULE_DETAIL_VALUE			= 0;
	
	public static final String 		RESERVED_PRIVATE_053_RULE_DETAIL_CU				= CREATE_USER;
	public static final Timestamp	RESERVED_PRIVATE_053_RULE_DETAIL_CT				= CREATE_TIMESTAMP;
	public static final String		RESERVED_PRIVATE_053_RULE_DETAIL_MU				= MODIFY_USER;
	public static final Timestamp	RESERVED_PRIVATE_053_RULE_DETAIL_MT				= MODIFY_TIMESTAMP;
	
}
