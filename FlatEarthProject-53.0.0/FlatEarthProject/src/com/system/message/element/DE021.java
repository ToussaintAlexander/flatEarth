package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE021 {

	public static final int NUMBER_OF_DE021_FIELDS	                    			= 1;
	
	public static final int FORWARDING_INSTITUTION_COUNTRY_CODE_021_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_ID			= 21000;	 
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_FIELD		= 21;	 
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_SUBFIELD	= 0;
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_LENGTH		= 3;   	 
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_ENCODING	= EBCDIC_ENCODING;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	FORWARDING_INSTITUTION_COUNTRY_CODE_021_VALUE		= "840";
	
}
