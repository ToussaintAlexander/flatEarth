package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE059 {

	public static final int NUMBER_OF_DE059_FIELDS	                = 4;
	
	public static final int NATIONAL_POS_GEO_DATA_059_INDEX			= 0;
	
	/***************************************************************
	 * state 1 - 2  county 3 - 5 postal service code 6 - 14 country code 15 - 17
	 ***************************************************************
	 */
	
	public static final int 	STATE_CODE_059_ID					= 59000;	 
	public static final int 	STATE_CODE_059_FIELD				= 59;	 
	public static final int 	STATE_CODE_059_SUBFIELD				= 0;
	
	public static final int 	STATE_CODE_059_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	STATE_CODE_059_LENGTH				= 2;   	 
	
	public static final int 	STATE_CODE_059_ENCODING				= EBCDIC_ENCODING;
	public static final int 	STATE_CODE_059_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	STATE_CODE_059_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	STATE_CODE_059_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	STATE_CODE_059_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	STATE_CODE_059_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	STATE_CODE_059_VALUE				= "10";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	COUNTY_CODE_059_ID					= 59000;	 
	public static final int 	COUNTY_CODE_059_FIELD				= 59;	 
	public static final int 	COUNTY_CODE_059_SUBFIELD			= 1;
	
	public static final int 	COUNTY_CODE_059_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	COUNTY_CODE_059_LENGTH				= 3;   	 
	
	public static final int 	COUNTY_CODE_059_ENCODING			= EBCDIC_ENCODING;
	public static final int 	COUNTY_CODE_059_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	COUNTY_CODE_059_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTY_CODE_059_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTY_CODE_059_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	COUNTY_CODE_059_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	COUNTY_CODE_059_VALUE				= "840";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	POSTAL_SERVICE_CODE_059_ID			= 59000;	 
	public static final int 	POSTAL_SERVICE_CODE_059_FIELD		= 59;	 
	public static final int 	POSTAL_SERVICE_CODE_059_SUBFIELD	= 2;
	
	public static final int 	POSTAL_SERVICE_CODE_059_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	POSTAL_SERVICE_CODE_059_LENGTH		= 9;   	 
	
	public static final int 	POSTAL_SERVICE_CODE_059_ENCODING	= EBCDIC_ENCODING;
	public static final int 	POSTAL_SERVICE_CODE_059_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	POSTAL_SERVICE_CODE_059_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	POSTAL_SERVICE_CODE_059_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	POSTAL_SERVICE_CODE_059_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	POSTAL_SERVICE_CODE_059_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	POSTAL_SERVICE_CODE_059_VALUE		= "950141234";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	COUNTRY_CODE_059_ID					= 59000;	 
	public static final int 	COUNTRY_CODE_059_FIELD				= 59;	 
	public static final int 	COUNTRY_CODE_059_SUBFIELD			= 3;
	
	public static final int 	COUNTRY_CODE_059_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	COUNTRY_CODE_059_LENGTH				= 3;   	 
	
	public static final int 	COUNTRY_CODE_059_ENCODING			= EBCDIC_ENCODING;
	public static final int 	COUNTRY_CODE_059_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	COUNTRY_CODE_059_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTRY_CODE_059_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTRY_CODE_059_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	COUNTRY_CODE_059_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	COUNTRY_CODE_059_VALUE				= "840";
}
