package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE062RuleHeader {
 
	// DE062 Header - Field Bitmap Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE062_RULE_HEADER_REPORT_TITLE								= "DE062 Rule Header";
	
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_ID								= 62000;	 
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_FIELD							= 62;	 
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_SUBFIELD						= 0;
	
	public static final boolean FIELD_BITMAP_062_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_MAXIMUM_LENGTH					= 1;
	
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	FIELD_BITMAP_062_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	FIELD_BITMAP_062_RULE_HEADER_VALUE							= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_ID						= 62000;	 
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_FIELD					= 62;	 
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_SUBFIELD				= 1;
	
	public static final boolean AUTH_CHAR_INDICATOR_062_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_MAXIMUM_LENGTH			= 1;  	 
	
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	AUTH_CHAR_INDICATOR_062_RULE_HEADER_VALUE					= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_ID							= 62000;	 
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_FIELD						= 62;	 
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_SUBFIELD					= 2;
	
	public static final boolean TRANS_IDENTIFIER_062_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_MINIMUM_LENGTH				= 1;
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_MAXIMUM_LENGTH				= 1;	 
	
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	TRANS_IDENTIFIER_062_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	TRANS_IDENTIFIER_062_RULE_HEADER_VALUE						= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_ID				= 62000;	 
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FIELD			= 62;	 
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_MAXIMUM_LENGTH	= 1;   	 
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_VALUE			= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	MERCHANT_VV_062_RULE_HEADER_ID								= 62000;	 
	public static final int 	MERCHANT_VV_062_RULE_HEADER_FIELD							= 62;	 
	public static final int 	MERCHANT_VV_062_RULE_HEADER_SUBFIELD						= 4;
	
	public static final boolean MERCHANT_VV_062_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	MERCHANT_VV_062_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	MERCHANT_VV_062_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	MERCHANT_VV_062_RULE_HEADER_MAXIMUM_LENGTH					= 1;  	 
	
	public static final int 	MERCHANT_VV_062_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	MERCHANT_VV_062_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	MERCHANT_VV_062_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	MERCHANT_VV_062_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MERCHANT_VV_062_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	MERCHANT_VV_062_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	MERCHANT_VV_062_RULE_HEADER_VALUE							= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_ID						= 62000;	 
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_FIELD					= 62;	 
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_SUBFIELD					= 5;
	
	public static final boolean CARD_LEVEL_RESULTS_062_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_MAXIMUM_LENGTH			= 1; 	 
	
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	CARD_LEVEL_RESULTS_062_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CARD_LEVEL_RESULTS_062_RULE_HEADER_VALUE					= null;
	
	//-----------------------------------------------------------------------------------
	
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_ID						= 62000;	 
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_FIELD					= 62;	 
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_SUBFIELD					= 6;
	
	public static final boolean PROGRAM_IDENTIFIER_062_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_MAXIMUM_LENGTH			= 1;   	 
	
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	PROGRAM_IDENTIFIER_062_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	PROGRAM_IDENTIFIER_062_RULE_HEADER_VALUE					= null;
	
}
