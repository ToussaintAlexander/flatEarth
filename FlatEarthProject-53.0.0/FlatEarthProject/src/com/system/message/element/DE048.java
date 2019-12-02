package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE048 {

	public static final int NUMBER_OF_DE048_FIELDS	            = 1;
	
	public static final int ADDITIONAL_DATA_048_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ADDITIONAL_DATA_048_ID			= 48000;	 
	public static final int 	ADDITIONAL_DATA_048_FIELD		= 48;	 
	public static final int 	ADDITIONAL_DATA_048_SUBFIELD	= 0;
	
	public static final int 	ADDITIONAL_DATA_048_FORMAT		= VARIABLE_FORMAT;	
	
	public static final int 	ADDITIONAL_DATA_048_LENGTH		= 999;   	 
	
	public static final int 	ADDITIONAL_DATA_048_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ADDITIONAL_DATA_048_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDITIONAL_DATA_048_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDITIONAL_DATA_048_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDITIONAL_DATA_048_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ADDITIONAL_DATA_048_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ADDITIONAL_DATA_048_VALUE		= "345CDE";
	
}
