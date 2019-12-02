package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE033 {

	public static final int NUMBER_OF_DE033_FIELDS	                    					= 1;
	
	public static final int FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_ID			= 33000;	 
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_FIELD		= 33;	 
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_SUBFIELD		= 0;
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_FORMAT		= VARIABLE_FORMAT;	
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_LENGTH		= 11;   	 
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_ENCODING		= EBCDIC_ENCODING;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_VALUE		= "FIIC01250";
	
}
