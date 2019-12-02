package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE028 {

	public static final int NUMBER_OF_DE028_FIELDS	                    = 2;
	
	public static final int TRANSACTION_FEE_AMOUNT_028_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACCOUNT_ENTRY_028_ID					= 28000;	 
	public static final int 	ACCOUNT_ENTRY_028_FIELD					= 28;	 
	public static final int 	ACCOUNT_ENTRY_028_SUBFIELD				= 0;
	
	public static final int 	ACCOUNT_ENTRY_028_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_028_LENGTH				= 1;   	 
	
	public static final int 	ACCOUNT_ENTRY_028_ENCODING				= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_028_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_028_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_028_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_028_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_028_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_028_VALUE					= "C";
	
	//----------------------------------------------------------------------------------------------
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_ID			= 28100;	 
	public static final int 	TRANSACTION_FEE_AMOUNT_028_FIELD		= 28;	 
	public static final int 	TRANSACTION_FEE_AMOUNT_028_SUBFIELD		= 1;
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_LENGTH		= 8;   	 
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_FEE_AMOUNT_028_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_FEE_AMOUNT_028_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_FEE_AMOUNT_028_VALUE		= "12500";
	
}
