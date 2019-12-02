package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE031 {

	public static final int NUMBER_OF_DE031_FIELDS	                    		= 2;
	
	public static final int SETTLEMENT_PROCESSING_FEE_AMOUNT_031_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACCOUNT_ENTRY_031_ID							= 31000;	 
	public static final int 	ACCOUNT_ENTRY_031_FIELD							= 31;	 
	public static final int 	ACCOUNT_ENTRY_031_SUBFIELD						= 0;
	
	public static final int 	ACCOUNT_ENTRY_031_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	ACCOUNT_ENTRY_031_LENGTH						= 1;   	 
	
	public static final int 	ACCOUNT_ENTRY_031_ENCODING						= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_ENTRY_031_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_ENTRY_031_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_ENTRY_031_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_ENTRY_031_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_ENTRY_031_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_ENTRY_031_VALUE							= "C";
	
	//----------------------------------------------------------------------------------------------	
	
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_ID			= 31000;	 
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_FIELD		= 31;	 
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_SUBFIELD	= 1;
	
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_LENGTH		= 8;   	 
	
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_PROCESSING_FEE_AMOUNT_031_VALUE		= "41500";
	
}
