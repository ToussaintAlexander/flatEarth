package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE022RuleHeader {
 
	// DE022 Header - Point of Service Entry Mode Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE022_RULE_HEADER_REPORT_TITLE							= "DE022 Rule Header";
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_ID				= 22000;	 
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FIELD			= 22;	 
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_ENTRY_MODE_022_RULE_HEADER_VALUE			= "01";
	
	//--------------------------------------------------------------------------------------------------
	
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_ID						= 22000;	 
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_FIELD					= 22;	 
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_SUBFIELD					= 1;
	
	public static final boolean PIN_ENTRY_MODE_022_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_MAXIMUM_LENGTH			= 1;
	
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	PIN_ENTRY_MODE_022_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	PIN_ENTRY_MODE_022_RULE_HEADER_VALUE					= "2";
	
}
