package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE054RuleHeader {
 
	// DE054 Header - Additional Amounts Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE054_RULE_HEADER_REPORT_TITLE					= "DE054 Rule Header";
	
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_ID					= 54000;	 
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_FIELD				= 54;	 
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean ACCOUNT_TYPE_054_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_TYPE_054_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_TYPE_054_RULE_HEADER_VALUE				= null;
	
	//----------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_ID					= 54000;	 
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_FIELD				= 54;	 
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_SUBFIELD			= 1;
	
	public static final boolean AMOUNT_TYPE_054_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_MAXIMUM_LENGTH		= 2;
		
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_TYPE_054_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_TYPE_054_RULE_HEADER_VALUE				= null;
	
	//----------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_ID				= 54000;	 
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_FIELD				= 54;	 
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_SUBFIELD			= 2;
	
	public static final boolean CURRENCY_CODE_054_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_MINIMUM_LENGTH	= 3;
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_MAXIMUM_LENGTH	= 3;
	
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_CODE_054_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_CODE_054_RULE_HEADER_VALUE				= null;
	
	//----------------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_ID				= 54000;	 
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_FIELD				= 54;	 
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean ACCOUNT_ENTRY_054_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_MAXIMUM_LENGTH	= 1;
	
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_DATATYPE			= ALPHABETIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_054_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_054_RULE_HEADER_VALUE				= null;
	
	//----------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_054_RULE_HEADER_ID						= 54000;	 
	public static final int 	AMOUNT_054_RULE_HEADER_FIELD					= 54;	 
	public static final int 	AMOUNT_054_RULE_HEADER_SUBFIELD					= 4;
	
	public static final boolean AMOUNT_054_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	AMOUNT_054_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	AMOUNT_054_RULE_HEADER_MINIMUM_LENGTH			= 12;
	public static final int 	AMOUNT_054_RULE_HEADER_MAXIMUM_LENGTH			= 12;
	
	public static final int 	AMOUNT_054_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	AMOUNT_054_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	AMOUNT_054_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_054_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_054_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_054_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	AMOUNT_054_RULE_HEADER_VALUE					= null;
	
}
