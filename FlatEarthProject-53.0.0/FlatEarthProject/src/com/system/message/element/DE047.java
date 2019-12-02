package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE047 {

	public static final int NUMBER_OF_DE047_FIELDS	            = 1;
	
	public static final int ADDITIONAL_DATA_047_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ADDITIONAL_DATA_047_ID			= 47000;	 
	public static final int 	ADDITIONAL_DATA_047_FIELD		= 47;	 
	public static final int 	ADDITIONAL_DATA_047_SUBFIELD	= 0;
	
	public static final int 	ADDITIONAL_DATA_047_FORMAT		= VARIABLE_FORMAT;	
	
	public static final int 	ADDITIONAL_DATA_047_LENGTH		= 999;   	 
	
	public static final int 	ADDITIONAL_DATA_047_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ADDITIONAL_DATA_047_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDITIONAL_DATA_047_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDITIONAL_DATA_047_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDITIONAL_DATA_047_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ADDITIONAL_DATA_047_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ADDITIONAL_DATA_047_VALUE		= "BCD234";
	
}
