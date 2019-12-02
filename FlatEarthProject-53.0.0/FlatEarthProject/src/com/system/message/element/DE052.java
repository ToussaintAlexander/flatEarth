package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE052 {

	public static final int NUMBER_OF_DE052_FIELDS	                   			= 1;
	
	public static final int PERSONAL_IDENTIFICATION_NUMBER_052_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_ID			= 52000;	 
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_FIELD		= 52;	 
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_SUBFIELD		= 0;
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_LENGTH		= 64;   	 
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	PERSONAL_IDENTIFICATION_NUMBER_052_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	PERSONAL_IDENTIFICATION_NUMBER_052_VALUE		= "1234";
	
}
