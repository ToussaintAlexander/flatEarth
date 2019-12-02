package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE022 {

	public static final int NUMBER_OF_DE022_FIELDS	                    	= 2;
	
	public static final int POINT_OF_SERVICE_ENTRY_MODE_022_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_ID			= 22000;	 
	public static final int 	TRANSACTION_ENTRY_MODE_022_FIELD		= 22;	 
	public static final int 	TRANSACTION_ENTRY_MODE_022_SUBFIELD		= 0;
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_LENGTH		= 2;   	 
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_ENTRY_MODE_022_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_ENTRY_MODE_022_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_ENTRY_MODE_022_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_ENTRY_MODE_022_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_ENTRY_MODE_022_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_ENTRY_MODE_022_VALUE		= "01";
	
	//--------------------------------------------------------------------------------------------------
	
	public static final int 	PIN_ENTRY_MODE_022_ID					= 22000;	 
	public static final int 	PIN_ENTRY_MODE_022_FIELD				= 22;	 
	public static final int 	PIN_ENTRY_MODE_022_SUBFIELD				= 1;
	
	public static final int 	PIN_ENTRY_MODE_022_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	PIN_ENTRY_MODE_022_LENGTH				= 1;   	 
	
	public static final int 	PIN_ENTRY_MODE_022_ENCODING				= EBCDIC_ENCODING;
	public static final int 	PIN_ENTRY_MODE_022_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	PIN_ENTRY_MODE_022_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	PIN_ENTRY_MODE_022_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PIN_ENTRY_MODE_022_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	PIN_ENTRY_MODE_022_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	PIN_ENTRY_MODE_022_VALUE				= "2";
	
}
