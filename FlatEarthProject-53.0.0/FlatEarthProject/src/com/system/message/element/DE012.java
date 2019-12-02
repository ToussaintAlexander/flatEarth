package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE012 {

	public static final int NUMBER_OF_DE012_FIELDS	                    	= 3;
	
	public static final int LOCAL_TRANSACTION_TIME_HOUR_012_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_ID			= 12100;	 
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_FIELD		= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_SUBFIELD	= 0;
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_LENGTH		= 2;   	 
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_ENCODING	= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_HOUR_012_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_HOUR_012_VALUE		= "23";
	
	//-------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_ID		= 12100;	 
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_FIELD		= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_SUBFIELD	= 1;
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_LENGTH	= 2;   	 
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_ENCODING	= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_MINUTE_012_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_MINUTE_012_VALUE		= "59";
	
	//-------------------------------------------------------------------------------------------------
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_ID		= 12200;	 
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_FIELD		= 12;	 
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_SUBFIELD	= 2;
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_LENGTH	= 2;   	 
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_ENCODING	= EBCDIC_ENCODING;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	LOCAL_TRANSACTION_TIME_SECOND_012_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	LOCAL_TRANSACTION_TIME_SECOND_012_VALUE		= "59";
	
}
