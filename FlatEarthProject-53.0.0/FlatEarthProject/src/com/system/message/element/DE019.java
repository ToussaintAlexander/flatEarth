package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE019 {

	public static final int NUMBER_OF_DE019_FIELDS	                    			= 1;
	
	public static final int ACQUIRING_INSTITUTION_COUNTRY_CODE_019_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_ID			= 19000;	 
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_FIELD		= 19;	 
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_SUBFIELD		= 0;
	
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_LENGTH		= 3;   	 
	
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_ENCODING		= EBCDIC_ENCODING;
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ACQUIRING_INSTITUTION_COUNTRY_CODE_019_VALUE		= "840";
	
}
