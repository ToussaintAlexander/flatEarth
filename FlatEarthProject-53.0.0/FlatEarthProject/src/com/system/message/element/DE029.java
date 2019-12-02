package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE029 {

	public static final int NUMBER_OF_DE029_FIELDS	               	 	= 2;
	
	public static final int SETTLEMENT_FEE_AMOUNT_029_INDEX				= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACCOUNT_ENTRY_029_ID					= 29000;	 
	public static final int 	ACCOUNT_ENTRY_029_FIELD					= 29;	 
	public static final int 	ACCOUNT_ENTRY_029_SUBFIELD				= 0;
	
	public static final int 	ACCOUNT_ENTRY_029_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_029_LENGTH				= 1;   	 
	
	public static final int 	ACCOUNT_ENTRY_029_ENCODING				= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_029_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_029_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_029_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_029_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_029_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_029_VALUE					= "D";
	
	//----------------------------------------------------------------------------------------------
		
	
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_ID			= 29000;	 
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_FIELD			= 29;	 
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_SUBFIELD		= 1;
	
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_LENGTH		= 8;   	 
	
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_FEE_AMOUNT_029_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_FEE_AMOUNT_029_VALUE			= "9500";
	
}
