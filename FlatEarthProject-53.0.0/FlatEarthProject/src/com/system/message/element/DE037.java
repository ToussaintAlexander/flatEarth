package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE037 {

	public static final int NUMBER_OF_DE037_FIELDS	                   		= 4;
	
	public static final int RETRIEVAL_REFERENCE_NUMBER_037_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_ID				= 37000;	 
	public static final int 	TRANSMISSION_DATE_YEAR_037_FIELD			= 37;	 
	public static final int 	TRANSMISSION_DATE_YEAR_037_SUBFIELD			= 0;
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_LENGTH			= 1;   	 
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_DATE_YEAR_037_DATATYPE			= ALPHANUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_DATE_YEAR_037_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_DATE_YEAR_037_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_DATE_YEAR_037_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_DATE_YEAR_037_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_DATE_YEAR_037_VALUE			= "8";
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	JULIAN_DAY_MONTH_037_ID						= 37000;	 
	public static final int 	JULIAN_DAY_MONTH_037_FIELD					= 37;	 
	public static final int 	JULIAN_DAY_MONTH_037_SUBFIELD				= 1;
	
	public static final int 	JULIAN_DAY_MONTH_037_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	JULIAN_DAY_MONTH_037_LENGTH					= 3;   	 
	
	public static final int 	JULIAN_DAY_MONTH_037_ENCODING				= EBCDIC_ENCODING;
	public static final int 	JULIAN_DAY_MONTH_037_DATATYPE				= ALPHANUMERIC_DATATYPE;
	
	public static final int 	JULIAN_DAY_MONTH_037_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	JULIAN_DAY_MONTH_037_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	JULIAN_DAY_MONTH_037_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	JULIAN_DAY_MONTH_037_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	JULIAN_DAY_MONTH_037_VALUE					= "366";
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_ID				= 37000;	 
	public static final int 	TRANSMISSION_TIME_HOUR_037_FIELD			= 37;	 
	public static final int 	TRANSMISSION_TIME_HOUR_037_SUBFIELD			= 2;
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_LENGTH			= 2;   	 
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSMISSION_TIME_HOUR_037_DATATYPE			= ALPHANUMERIC_DATATYPE;
	
	public static final int 	TRANSMISSION_TIME_HOUR_037_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSMISSION_TIME_HOUR_037_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSMISSION_TIME_HOUR_037_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	TRANSMISSION_TIME_HOUR_037_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	TRANSMISSION_TIME_HOUR_037_VALUE			= "23";
	
	//---------------------------------------------------------------------------------------------------
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_ID			= 37000;	 
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_FIELD		= 37;	 
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_SUBFIELD		= 3;
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_LENGTH		= 6;   	 
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SYSTEMS_TRACE_AUDIT_NUMBER_037_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SYSTEMS_TRACE_AUDIT_NUMBER_037_VALUE		= "123456";
	
}
