package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE064 {

	public static final int NUMBER_OF_DE064_FIELDS	                    	= 1;
	
	public static final int MESSAGE_AUTHENTICATION_CODE_064_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_ID			= 640000;	 
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_FIELD		= 64;	 
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_SUBFIELD	= 0;
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_LENGTH		= 16;   	 
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_ENCODING	= EBCDIC_ENCODING;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_DATATYPE	= BINARY_DATATYPE;
	
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	MESSAGE_AUTHENTICATION_CODE_064_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	MESSAGE_AUTHENTICATION_CODE_064_VALUE		= "493874";
	
}
