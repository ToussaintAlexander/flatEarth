package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE016 {

	public static final int NUMBER_OF_DE016_FIELDS	                = 2;
	
	public static final int CONVERSION_DATE_MONTH_016_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CONVERSION_DATE_MONTH_016_ID		= 16000;	 
	public static final int 	CONVERSION_DATE_MONTH_016_FIELD		= 16;	 
	public static final int 	CONVERSION_DATE_MONTH_016_SUBFIELD	= 0;
	
	public static final int 	CONVERSION_DATE_MONTH_016_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	CONVERSION_DATE_MONTH_016_LENGTH	= 2;   	 
	
	public static final int 	CONVERSION_DATE_MONTH_016_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CONVERSION_DATE_MONTH_016_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CONVERSION_DATE_MONTH_016_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	CONVERSION_DATE_MONTH_016_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CONVERSION_DATE_MONTH_016_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CONVERSION_DATE_MONTH_016_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	CONVERSION_DATE_MONTH_016_VALUE		= "10";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	CONVERSION_DATE_DAY_016_ID			= 16100;	 
	public static final int 	CONVERSION_DATE_DAY_016_FIELD		= 16;	 
	public static final int 	CONVERSION_DATE_DAY_016_SUBFIELD	= 1;
	
	public static final int 	CONVERSION_DATE_DAY_016_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CONVERSION_DATE_DAY_016_LENGTH		= 2;   	 
	
	public static final int 	CONVERSION_DATE_DAY_016_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CONVERSION_DATE_DAY_016_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CONVERSION_DATE_DAY_016_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CONVERSION_DATE_DAY_016_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CONVERSION_DATE_DAY_016_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CONVERSION_DATE_DAY_016_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CONVERSION_DATE_DAY_016_VALUE		= "31";
	
}
