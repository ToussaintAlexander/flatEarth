package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE007 {
	
	public static final int NUMBER_OF_DE007_FIELDS					= 5;
	
	public static final int TRANSMISSION_DATE_MONTH_INDEX 			= 0;
	public static final int TRANSMISSION_DATE_DAY_INDEX 			= 1;
	
	public static final int TRANSMISSION_TIME_HOUR_INDEX 			= 2;
	public static final int TRANSMISSION_TIME_MINUTE_INDEX 			= 3;
	public static final int TRANSMISSION_TIME_SECOND_INDEX 			= 4;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSMISSION_DATE_TIME_007_ID			= 7000;	
	public static final int		TRANSMISSION_DATE_TIME_007_FIELD		= 7;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_ID			= 7000;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_FIELD		= 7;	
	public static final int 	TRANSMISSION_DATE_MONTH_007_SUBFIELD	= 0;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_MONTH_007_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_MONTH_007_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSMISSION_DATE_MONTH_007_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSMISSION_DATE_MONTH_007_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_MONTH_007_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_DATE_MONTH_007_VALUE		= "12";

	//--------------------------------------------------------------- 
	
	public static final int 	TRANSMISSION_DATE_DAY_007_ID			= 7100;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_FIELD			= 7;	
	public static final int 	TRANSMISSION_DATE_DAY_007_SUBFIELD		= 1;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_DAY_007_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_DAY_007_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSMISSION_DATE_DAY_007_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSMISSION_DATE_DAY_007_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_DAY_007_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_DATE_DAY_007_VALUE			= "31";

	//--------------------------------------------------------------- 
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_ID			= 7200;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_FIELD		= 7;	
	public static final int 	TRANSMISSION_TIME_HOUR_007_SUBFIELD		= 2;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_HOUR_007_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_HOUR_007_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSMISSION_TIME_HOUR_007_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSMISSION_TIME_HOUR_007_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_HOUR_007_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_TIME_HOUR_007_VALUE		= "23";

	//--------------------------------------------------------------- 
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_ID			= 7300;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_FIELD		= 7;	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_SUBFIELD	= 3;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_MINUTE_007_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSMISSION_TIME_MINUTE_007_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSMISSION_TIME_MINUTE_007_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_MINUTE_007_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_TIME_MINUTE_007_VALUE		= "59";

	//--------------------------------------------------------------- 
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_ID			= 7400;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_FIELD		= 7;	
	public static final int 	TRANSMISSION_TIME_SECOND_007_SUBFIELD	= 4;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_LENGTH		= 2;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_ENCODING	= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_SECOND_007_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_SECOND_007_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSMISSION_TIME_SECOND_007_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSMISSION_TIME_SECOND_007_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_SECOND_007_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_TIME_SECOND_007_VALUE		= "59";
	
}
