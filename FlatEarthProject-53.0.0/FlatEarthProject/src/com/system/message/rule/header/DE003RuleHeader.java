package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE003RuleHeader {

	// DE003 Rule Header - Processing Code Rule Header
	
   	/***********************************************************************************
   	 ***********************************************************************************
   	 */
	
	public static final String 	DE003_HEADER_REPORT_TITLE							= "DE003 Rule Header";
	
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_ID					= 3000;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_FIELD				= 3;	
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean	TRANSACTION_TYPE_003_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_FORMAT				= FIXED_FORMAT;
	
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_TYPE_003_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	//-----------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_ID				= 3100;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIELD				= 3;	
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean	ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_FORMAT			= FIXED_FORMAT;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_FROM_TYPE_003_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	//-----------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_ID					= 3200;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_FIELD				= 3;	
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_SUBFIELD			= 2;
	
	public static final boolean	ACCOUNT_TO_TYPE_003_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_FORMAT				= FIXED_FORMAT;
	
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_TO_TYPE_003_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
}
