package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE003 {
	
	public static final int 	NUMBER_OF_DE003_FIELDS		= 3;
	
	public static final int 	TRANSACTION_TYPE_INDEX 		= 0;
	public static final int 	ACCOUNT_FROM_TYPE_INDEX		= 1;
	public static final int		ACCOUNT_TO_TYPE_INDEX		= 2;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	PROCESSING_CODE_003_ID			= 3000;		 
	public static final int 	PROCESSING_CODE_003_FIELD		= 3;		 
	
	public static final int 	TRANSACTION_TYPE_003_ID			= 3000;
	public static final int 	TRANSACTION_TYPE_003_FIELD		= 3;	
	public static final int 	TRANSACTION_TYPE_003_SUBFIELD	= 0;
	
	public static final int 	TRANSACTION_TYPE_003_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSACTION_TYPE_003_LENGTH		= 2;
	
	public static final int 	TRANSACTION_TYPE_003_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_TYPE_003_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_TYPE_003_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_TYPE_003_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_TYPE_003_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_TYPE_003_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_TYPE_003_VALUE		= "10";
	
	//-----------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_FROM_TYPE_003_ID		= 3100;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_FIELD		= 3;	
	public static final int 	ACCOUNT_FROM_TYPE_003_SUBFIELD	= 1;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_FORMAT	= FIXED_FORMAT;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_LENGTH	= 2;
	public static final int 	ACCOUNT_FROM_TYPE_003_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_FROM_TYPE_003_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_FROM_TYPE_003_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_FROM_TYPE_003_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_FROM_TYPE_003_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_FROM_TYPE_003_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_FROM_TYPE_003_VALUE		= "20";
		
	//-----------------------------------------------------------------------------
	
	public static final int 	ACCOUNT_TO_TYPE_003_ID			= 3200;
	
	public static final int 	ACCOUNT_TO_TYPE_003_FIELD		= 3;	
	public static final int 	ACCOUNT_TO_TYPE_003_SUBFIELD	= 2;
	
	public static final int 	ACCOUNT_TO_TYPE_003_FORMAT		= FIXED_FORMAT;
	
	public static final int 	ACCOUNT_TO_TYPE_003_LENGTH		= 2;
	public static final int 	ACCOUNT_TO_TYPE_003_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ACCOUNT_TO_TYPE_003_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	ACCOUNT_TO_TYPE_003_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACCOUNT_TO_TYPE_003_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACCOUNT_TO_TYPE_003_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACCOUNT_TO_TYPE_003_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ACCOUNT_TO_TYPE_003_VALUE		= "30";
	
}
