package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE040 {

	public static final int NUMBER_OF_DE040_FIELDS	                    = 1;
	
	public static final int SERVICE_RESTRICTION_CODE_040_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_ID			= 40000;	 
	public static final int 	SERVICE_RESTRICTION_CODE_040_FIELD		= 40;	 
	public static final int 	SERVICE_RESTRICTION_CODE_040_SUBFIELD	= 0;
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_LENGTH		= 3;   	 
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SERVICE_RESTRICTION_CODE_040_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	SERVICE_RESTRICTION_CODE_040_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SERVICE_RESTRICTION_CODE_040_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SERVICE_RESTRICTION_CODE_040_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SERVICE_RESTRICTION_CODE_040_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SERVICE_RESTRICTION_CODE_040_VALUE		= "123";
	
}
