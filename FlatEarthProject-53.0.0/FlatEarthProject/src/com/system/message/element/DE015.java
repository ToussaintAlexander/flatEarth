package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE015 {

	public static final int NUMBER_OF_DE015_FIELDS	                = 2;
	
	public static final int SETTLEMENT_DATE_MONTH_015_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_ID		= 15015;	 
	public static final int 	SETTLEMENT_DATE_MONTH_015_FIELD		= 15;	 
	public static final int 	SETTLEMENT_DATE_MONTH_015_SUBFIELD	= 0;
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_LENGTH	= 2;   	 
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_DATE_MONTH_015_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_DATE_MONTH_015_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_DATE_MONTH_015_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_DATE_MONTH_015_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_DATE_MONTH_015_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_DATE_MONTH_015_VALUE		= "11";
	
	//------------------------------------------------------------------------------------------
	
	public static final int 	SETTLEMENT_DATE_DAY_015_ID			= 15015;	 
	public static final int 	SETTLEMENT_DATE_DAY_015_FIELD		= 15;	 
	public static final int 	SETTLEMENT_DATE_DAY_015_SUBFIELD	= 1;
	
	public static final int 	SETTLEMENT_DATE_DAY_015_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_DATE_DAY_015_LENGTH		= 2;   	 
	
	public static final int 	SETTLEMENT_DATE_DAY_015_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_DATE_DAY_015_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_DATE_DAY_015_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_DATE_DAY_015_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_DATE_DAY_015_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_DATE_DAY_015_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_DATE_DAY_015_VALUE		= "30";
	
}
