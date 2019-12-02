package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE028RuleHeader {
 
	// DE028 Header - Transaction Fee Amount Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE028_RULE_HEADER_REPORT_TITLE							= "DE028 Rule Header";
	
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_ID						= 28000;	 
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_FIELD						= 28;	 
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_SUBFIELD					= 0;
	
	public static final boolean ACCOUNT_ENTRY_028_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_MAXIMUM_LENGTH			= 1;
	
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_028_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_028_RULE_HEADER_VALUE						= null;
	
	//----------------------------------------------------------------------------------------------
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_ID				= 28100;	 
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FIELD			= 28;	 
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_MINIMUM_LENGTH	= 8;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_MAXIMUM_LENGTH	= 8; 
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_VALUE			= null;
	
}
