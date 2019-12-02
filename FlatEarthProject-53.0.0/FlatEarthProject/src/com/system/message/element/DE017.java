package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE017 {

	public static final int NUMBER_OF_DE017_FIELDS	                = 2;
	
	public static final int CAPTURE_DATE_MONTH_017_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CAPTURE_DATE_MONTH_017_ID			= 17000;	 
	public static final int 	CAPTURE_DATE_MONTH_017_FIELD		= 17;	 
	public static final int 	CAPTURE_DATE_MONTH_017_SUBFIELD		= 0;
	
	public static final int 	CAPTURE_DATE_MONTH_017_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CAPTURE_DATE_MONTH_017_LENGTH		= 2;   	 
	
	public static final int 	CAPTURE_DATE_MONTH_017_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CAPTURE_DATE_MONTH_017_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CAPTURE_DATE_MONTH_017_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAPTURE_DATE_MONTH_017_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAPTURE_DATE_MONTH_017_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CAPTURE_DATE_MONTH_017_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CAPTURE_DATE_MONTH_017_VALUE		= "09";
	
	//-----------------------------------------------------------------------------------------
	
	public static final int 	CAPTURE_DATE_DAY_017_ID				= 17100;	 
	public static final int 	CAPTURE_DATE_DAY_017_FIELD			= 17;	 
	public static final int 	CAPTURE_DATE_DAY_017_SUBFIELD		= 1;
	
	public static final int 	CAPTURE_DATE_DAY_017_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CAPTURE_DATE_DAY_017_LENGTH			= 2;   	 
	
	public static final int 	CAPTURE_DATE_DAY_017_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CAPTURE_DATE_DAY_017_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CAPTURE_DATE_DAY_017_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAPTURE_DATE_DAY_017_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAPTURE_DATE_DAY_017_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CAPTURE_DATE_DAY_017_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CAPTURE_DATE_DAY_017_VALUE			= "30";
	
}
