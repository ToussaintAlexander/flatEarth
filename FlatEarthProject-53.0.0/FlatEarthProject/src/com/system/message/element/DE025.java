package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE025 {

	public static final int NUMBER_OF_DE025_FIELDS	                    		= 1;
	
	public static final int POINT_OF_SERVICE_CONDITION_CODE_025_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_ID			= 25000;	 
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_FIELD		= 25;	 
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_SUBFIELD	= 0;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_FORMAT		= FIXED_FORMAT;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_LENGTH		= 2;   	 
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_ENCODING	= EBCDIC_ENCODING;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	POINT_OF_SERVICE_CONDITION_CODE_025_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	POINT_OF_SERVICE_CONDITION_CODE_025_VALUE		= "00";
	
}
