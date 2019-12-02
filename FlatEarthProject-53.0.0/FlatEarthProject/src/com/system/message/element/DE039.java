package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE039 {

	public static final int NUMBER_OF_DE039_FIELDS	        = 1;
	
	public static final int RESPONSE_CODE_039_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	RESPONSE_CODE_039_ID		= 39000;	 
	public static final int 	RESPONSE_CODE_039_FIELD		= 39;	 
	public static final int 	RESPONSE_CODE_039_SUBFIELD	= 0;
	
	public static final int 	RESPONSE_CODE_039_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	RESPONSE_CODE_039_LENGTH	= 2;   	 
	
	public static final int 	RESPONSE_CODE_039_ENCODING	= EBCDIC_ENCODING;
	public static final int 	RESPONSE_CODE_039_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	RESPONSE_CODE_039_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESPONSE_CODE_039_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESPONSE_CODE_039_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	RESPONSE_CODE_039_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	RESPONSE_CODE_039_VALUE		= "05";
	
}
