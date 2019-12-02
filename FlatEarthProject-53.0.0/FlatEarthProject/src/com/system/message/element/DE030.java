package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE030 {

	public static final int NUMBER_OF_DE030_FIELDS	                   			= 2;
	
	public static final int TRANSACTION_PROCESSING_FEE_AMOUNT_030_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACCOUNT_ENTRY_030_ID							= 30000;	 
	public static final int 	ACCOUNT_ENTRY_030_FIELD							= 30;	 
	public static final int 	ACCOUNT_ENTRY_030_SUBFIELD						= 0;
	
	public static final int 	ACCOUNT_ENTRY_030_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_030_LENGTH						= 1;   	 
	
	public static final int 	ACCOUNT_ENTRY_030_ENCODING						= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_030_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_030_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_030_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_030_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_030_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_030_VALUE							= "D";
	
	//----------------------------------------------------------------------------------------------	
	
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_ID 		= 30000;	 
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_FIELD		= 30;	 
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_SUBFIELD	= 1;
	
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_LENGTH	= 8;   	 
	
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_PROCESSING_FEE_AMOUNT_030_VALUE		="27500";
	
}
