package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE020 {

	public static final int NUMBER_OF_DE020_FIELDS	                    = 1;
	
	public static final int COUNTRY_CODE_PAN_EXTENDED_020_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_ID		= 20000;	 
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_FIELD		= 20;	 
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_SUBFIELD	= 0;
	
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_LENGTH	= 3;   	 
	
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_ENCODING	= EBCDIC_ENCODING;
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	COUNTRY_CODE_PAN_EXTENDED_020_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	COUNTRY_CODE_PAN_EXTENDED_020_VALUE		= "840";
	
}
