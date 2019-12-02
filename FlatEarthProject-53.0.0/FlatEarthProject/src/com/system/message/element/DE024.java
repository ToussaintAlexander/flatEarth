package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE024 {

	public static final int NUMBER_OF_DE024_FIELDS	        = 1;
	
	public static final int FUNCTION_CODE_024_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	FUNCTION_CODE_024_ID		= 24000;	 
	public static final int 	FUNCTION_CODE_024_FIELD		= 24;	 
	public static final int 	FUNCTION_CODE_024_SUBFIELD	= 0;
	
	public static final int 	FUNCTION_CODE_024_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	FUNCTION_CODE_024_LENGTH	= 3;   	 
	
	public static final int 	FUNCTION_CODE_024_ENCODING	= EBCDIC_ENCODING;
	public static final int 	FUNCTION_CODE_024_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	FUNCTION_CODE_024_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	FUNCTION_CODE_024_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FUNCTION_CODE_024_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	FUNCTION_CODE_024_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	FUNCTION_CODE_024_VALUE		= "123";
	
}
