package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE062 {

	public static final int NUMBER_OF_DE062_FIELDS	                    = 1;
	
	public static final int UNASSIGNED_DATA_ELEMENT_062_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	FIELD_BITMAP_062_ID							= 62000;	 
	public static final int 	FIELD_BITMAP_062_FIELD						= 62;	 
	public static final int 	FIELD_BITMAP_062_SUBFIELD					= 0;
	
	public static final int 	FIELD_BITMAP_062_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	FIELD_BITMAP_062_LENGTH						= 0;   	 
	
	public static final int 	FIELD_BITMAP_062_ENCODING					= EBCDIC_ENCODING;
	public static final int 	FIELD_BITMAP_062_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	FIELD_BITMAP_062_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	FIELD_BITMAP_062_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FIELD_BITMAP_062_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	FIELD_BITMAP_062_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	FIELD_BITMAP_062_VALUE						= " ";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	AUTH_CHAR_INDICATOR_062_ID					= 62000;	 
	public static final int 	AUTH_CHAR_INDICATOR_062_FIELD				= 62;	 
	public static final int 	AUTH_CHAR_INDICATOR_062_SUBFIELD			= 1;
	
	public static final int 	AUTH_CHAR_INDICATOR_062_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	AUTH_CHAR_INDICATOR_062_LENGTH				= 1;   	 
	
	public static final int 	AUTH_CHAR_INDICATOR_062_ENCODING			= EBCDIC_ENCODING;
	public static final int 	AUTH_CHAR_INDICATOR_062_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	AUTH_CHAR_INDICATOR_062_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	AUTH_CHAR_INDICATOR_062_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AUTH_CHAR_INDICATOR_062_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	AUTH_CHAR_INDICATOR_062_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	AUTH_CHAR_INDICATOR_062_VALUE				= "A";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	TRANS_IDENTIFIER_062_ID						= 62000;	 
	public static final int 	TRANS_IDENTIFIER_062_FIELD					= 62;	 
	public static final int 	TRANS_IDENTIFIER_062_SUBFIELD				= 2;
	
	public static final int 	TRANS_IDENTIFIER_062_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	TRANS_IDENTIFIER_062_LENGTH					= 1;   	 
	
	public static final int 	TRANS_IDENTIFIER_062_ENCODING				= EBCDIC_ENCODING;
	public static final int 	TRANS_IDENTIFIER_062_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	TRANS_IDENTIFIER_062_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANS_IDENTIFIER_062_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANS_IDENTIFIER_062_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	TRANS_IDENTIFIER_062_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	TRANS_IDENTIFIER_062_VALUE					= "A";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_ID			= 62000;	 
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_FIELD		= 62;	 
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_SUBFIELD		= 3;
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_LENGTH		= 1;   	 
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_ENCODING		= EBCDIC_ENCODING;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	MARKET_SPECIFIC_DATA_IDTFR_062_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	MARKET_SPECIFIC_DATA_IDTFR_062_VALUE		= "B";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	MERCHANT_VV_062_ID							= 62000;	 
	public static final int 	MERCHANT_VV_062_FIELD						= 62;	 
	public static final int 	MERCHANT_VV_062_SUBFIELD					= 4;
	
	public static final int 	MERCHANT_VV_062_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	MERCHANT_VV_062_LENGTH						= 1;   	 
	
	public static final int 	MERCHANT_VV_062_ENCODING					= EBCDIC_ENCODING;
	public static final int 	MERCHANT_VV_062_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	MERCHANT_VV_062_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	MERCHANT_VV_062_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MERCHANT_VV_062_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	MERCHANT_VV_062_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	MERCHANT_VV_062_VALUE						= "V";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	CARD_LEVEL_RESULTS_062_ID					= 62000;	 
	public static final int 	CARD_LEVEL_RESULTS_062_FIELD				= 62;	 
	public static final int 	CARD_LEVEL_RESULTS_062_SUBFIELD				= 5;
	
	public static final int 	CARD_LEVEL_RESULTS_062_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	CARD_LEVEL_RESULTS_062_LENGTH				= 1;   	 
	
	public static final int 	CARD_LEVEL_RESULTS_062_ENCODING				= EBCDIC_ENCODING;
	public static final int 	CARD_LEVEL_RESULTS_062_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	CARD_LEVEL_RESULTS_062_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_LEVEL_RESULTS_062_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_LEVEL_RESULTS_062_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	CARD_LEVEL_RESULTS_062_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	CARD_LEVEL_RESULTS_062_VALUE				= "X";
	
	//-----------------------------------------------------------------------------------------------
	
	public static final int 	PROGRAM_IDENTIFIER_062_ID					= 62000;	 
	public static final int 	PROGRAM_IDENTIFIER_062_FIELD				= 62;	 
	public static final int 	PROGRAM_IDENTIFIER_062_SUBFIELD				= 6;
	
	public static final int 	PROGRAM_IDENTIFIER_062_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	PROGRAM_IDENTIFIER_062_LENGTH				= 1;   	 
	
	public static final int 	PROGRAM_IDENTIFIER_062_ENCODING				= EBCDIC_ENCODING;
	public static final int 	PROGRAM_IDENTIFIER_062_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	PROGRAM_IDENTIFIER_062_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	PROGRAM_IDENTIFIER_062_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PROGRAM_IDENTIFIER_062_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	PROGRAM_IDENTIFIER_062_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	PROGRAM_IDENTIFIER_062_VALUE				= "P";
	
}
