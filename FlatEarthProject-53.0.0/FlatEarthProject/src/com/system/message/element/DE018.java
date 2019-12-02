package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE018 {

	public static final int NUMBER_OF_DE018_FIELDS	        = 1;
	
	public static final int MERCHANT_TYPE_018_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	MERCHANT_TYPE_018_ID		= 18000;	 
	public static final int 	MERCHANT_TYPE_018_FIELD		= 18;	 
	public static final int 	MERCHANT_TYPE_018_SUBFIELD	= 0;
	
	public static final int 	MERCHANT_TYPE_018_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	MERCHANT_TYPE_018_LENGTH	= 4;   	 
	
	public static final int 	MERCHANT_TYPE_018_ENCODING	= EBCDIC_ENCODING;
	public static final int 	MERCHANT_TYPE_018_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	MERCHANT_TYPE_018_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	MERCHANT_TYPE_018_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MERCHANT_TYPE_018_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	MERCHANT_TYPE_018_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	MERCHANT_TYPE_018_VALUE		= "1234";
	
}
