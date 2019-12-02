package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE054 {

	public static final int NUMBER_OF_DE054_FIELDS	        = 5;
	
	public static final int AMOUNT_054_INDEX				= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACCOUNT_TYPE_054_ID			= 54000;	 
	public static final int 	ACCOUNT_TYPE_054_FIELD		= 54;	 
	public static final int 	ACCOUNT_TYPE_054_SUBFIELD	= 0;
	
	public static final int 	ACCOUNT_TYPE_054_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_TYPE_054_LENGTH		= 2;   	 
	
	public static final int 	ACCOUNT_TYPE_054_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_TYPE_054_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_TYPE_054_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_TYPE_054_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_TYPE_054_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_TYPE_054_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_TYPE_054_VALUE		= "10";
	
	//----------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_TYPE_054_ID			= 54000;	 
	public static final int 	AMOUNT_TYPE_054_FIELD		= 54;	 
	public static final int 	AMOUNT_TYPE_054_SUBFIELD	= 1;
		
	public static final int 	AMOUNT_TYPE_054_FORMAT		= FIXED_FORMAT;	
		
	public static final int 	AMOUNT_TYPE_054_LENGTH		= 2;   	 
		
	public static final int 	AMOUNT_TYPE_054_ENCODING	= EBCDIC_ENCODING;
	public static final int 	AMOUNT_TYPE_054_DATATYPE	= NUMERIC_DATATYPE;
		
	public static final int 	AMOUNT_TYPE_054_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_TYPE_054_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_TYPE_054_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_TYPE_054_CHANGE		= ELEMENT_FIXED;
		
	public static final String 	AMOUNT_TYPE_054_VALUE		= "20";
	
	//----------------------------------------------------------------------------------
	
	public static final int 	CURRENCY_CODE_054_ID		= 54000;	 
	public static final int 	CURRENCY_CODE_054_FIELD		= 54;	 
	public static final int 	CURRENCY_CODE_054_SUBFIELD	= 2;
	
	public static final int 	CURRENCY_CODE_054_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	CURRENCY_CODE_054_LENGTH	= 3;   	 
	
	public static final int 	CURRENCY_CODE_054_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CURRENCY_CODE_054_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CURRENCY_CODE_054_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	CURRENCY_CODE_054_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CURRENCY_CODE_054_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CURRENCY_CODE_054_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	CURRENCY_CODE_054_VALUE		= "840";
	
	//----------------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_ENTRY_054_ID		= 54000;	 
	public static final int 	ACCOUNT_ENTRY_054_FIELD		= 54;	 
	public static final int 	ACCOUNT_ENTRY_054_SUBFIELD	= 3;
	
	public static final int 	ACCOUNT_ENTRY_054_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_054_LENGTH	= 1;   	 
	
	public static final int 	ACCOUNT_ENTRY_054_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_054_DATATYPE	= ALPHABETIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_054_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_054_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_054_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_054_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_054_VALUE		= "C";
	
	//----------------------------------------------------------------------------------
	
	public static final int 	AMOUNT_054_ID				= 54000;	 
	public static final int 	AMOUNT_054_FIELD			= 54;	 
	public static final int 	AMOUNT_054_SUBFIELD			= 4;
	
	public static final int 	AMOUNT_054_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	AMOUNT_054_LENGTH			= 12;   	 
	
	public static final int 	AMOUNT_054_ENCODING			= EBCDIC_ENCODING;
	public static final int 	AMOUNT_054_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	AMOUNT_054_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	AMOUNT_054_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AMOUNT_054_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	AMOUNT_054_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	AMOUNT_054_VALUE			= "12500";
	
}
