package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE023 {

	public static final int NUMBER_OF_DE023_FIELDS	                    		= 1;
	
	public static final int APPLICATION_PAN_SEQUENCE_NUMBER_023_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_ID			= 23000;	 
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_FIELD		= 23;	 
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_SUBFIELD	= 0;
	
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_LENGTH		= 3;   	 
	
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_ENCODING	= EBCDIC_ENCODING;
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	APPLICATION_PAN_SEQUENCE_NUMBER_023_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	APPLICATION_PAN_SEQUENCE_NUMBER_023_VALUE		= "123";
	
}
