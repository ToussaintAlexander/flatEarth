package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE014 {

	public static final int NUMBER_OF_DE014_FIELDS	                = 2;
	
	public static final int EXPIRATION_DATE_YEAR_014_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	EXPIRATION_DATE_YEAR_014_ID			= 14014;	 
	public static final int 	EXPIRATION_DATE_YEAR_014_FIELD		= 14;	 
	public static final int 	EXPIRATION_DATE_YEAR_014_SUBFIELD	= 0;
	
	public static final int 	EXPIRATION_DATE_YEAR_014_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_YEAR_014_LENGTH		= 2;   	 
	
	public static final int 	EXPIRATION_DATE_YEAR_014_ENCODING	= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_YEAR_014_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_YEAR_014_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_YEAR_014_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_YEAR_014_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_YEAR_014_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_YEAR_014_VALUE		= "17";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	EXPIRATION_DATE_MONTH_014_ID		= 14014;	 
	public static final int 	EXPIRATION_DATE_MONTH_014_FIELD		= 14;	 
	public static final int 	EXPIRATION_DATE_MONTH_014_SUBFIELD	= 1;
	
	public static final int 	EXPIRATION_DATE_MONTH_014_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	EXPIRATION_DATE_MONTH_014_LENGTH	= 2;   	 
	
	public static final int 	EXPIRATION_DATE_MONTH_014_ENCODING	= EBCDIC_ENCODING;
	public static final int 	EXPIRATION_DATE_MONTH_014_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	EXPIRATION_DATE_MONTH_014_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	EXPIRATION_DATE_MONTH_014_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	EXPIRATION_DATE_MONTH_014_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	EXPIRATION_DATE_MONTH_014_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	EXPIRATION_DATE_MONTH_014_VALUE		= "12";
	
	
}
