package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE046 {

	public static final int NUMBER_OF_DE046_FIELDS	            = 1;
	
	public static final int ADDITIONAL_DATA_046_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ADDITIONAL_DATA_046_ID			= 46000;	 
	public static final int 	ADDITIONAL_DATA_046_FIELD		= 46;	 
	public static final int 	ADDITIONAL_DATA_046_SUBFIELD	= 0;
	
	public static final int 	ADDITIONAL_DATA_046_FORMAT		= VARIABLE_FORMAT;	
	
	public static final int 	ADDITIONAL_DATA_046_LENGTH		= 999;   	 
	
	public static final int 	ADDITIONAL_DATA_046_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ADDITIONAL_DATA_046_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDITIONAL_DATA_046_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDITIONAL_DATA_046_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDITIONAL_DATA_046_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ADDITIONAL_DATA_046_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ADDITIONAL_DATA_046_VALUE		= "123ABC";
	
}
