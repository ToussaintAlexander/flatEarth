package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE038 {

	public static final int NUMBER_OF_DE038_FIELDS	                    			= 1;
	
	public static final int AUTHORIZATION_IDENTIFICATION_RESPONSE_038_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_ID		= 38000;	 
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_FIELD		= 38;	 
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_SUBFIELD	= 0;
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_LENGTH	= 6;   	 
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_ENCODING	= EBCDIC_ENCODING;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	AUTHORIZATION_IDENTIFICATION_RESPONSE_038_VALUE		= "123456";
	
}
