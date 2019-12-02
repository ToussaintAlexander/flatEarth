package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE013 {

	public static final int NUMBER_OF_DE013_FIELDS	                    	= 2;
	
	public static final int LOCAL_TRANSACTION_DATE_MONTH_013_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_ID			= 13013;	 
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_FIELD		= 13;	 
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_SUBFIELD	= 0;
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_LENGTH		= 2;   	 
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_ENCODING	= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_DATE_MONTH_013_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_DATE_MONTH_013_VALUE		= "12";
	
	//--------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_ID			= 13100;	 
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_FIELD		= 13;	 
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_SUBFIELD		= 1;
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_LENGTH		= 2;   	 
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_ENCODING		= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_DATE_DAY_013_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_DATE_DAY_013_VALUE		= "31";
	
}
