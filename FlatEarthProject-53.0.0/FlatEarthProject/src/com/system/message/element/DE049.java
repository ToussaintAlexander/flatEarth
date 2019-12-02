package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE049 {

	public static final int NUMBER_OF_DE049_FIELDS	                    = 1;
	
	public static final int TRANSACTION_CURRENCY_CODE_049_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSACTION_CURRENCY_CODE_049_ID		= 49000;	 
	public static final int 	TRANSACTION_CURRENCY_CODE_049_FIELD		= 49;	 
	public static final int 	TRANSACTION_CURRENCY_CODE_049_SUBFIELD	= 0;
	
	public static final int 	TRANSACTION_CURRENCY_CODE_049_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_CURRENCY_CODE_049_LENGTH	= 3;   	 
	
	public static final int 	TRANSACTION_CURRENCY_CODE_049_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_CURRENCY_CODE_049_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_CURRENCY_CODE_049_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_CURRENCY_CODE_049_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_CURRENCY_CODE_049_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_CURRENCY_CODE_049_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_CURRENCY_CODE_049_VALUE		= "840";
	
}
