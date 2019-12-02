package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE001 {

	public static final int 	NUMBER_OF_DE001_FIELDS			= 1;
	
	public static final int 	PRIMARY_BITMAP_001_INDEX		= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	PRIMARY_BITMAP_001_ID			= 1000;
	
	public static final int 	PRIMARY_BITMAP_001_FIELD		= 1;	
	public static final int 	PRIMARY_BITMAP_001_SUBFIELD		= 0;
	
	public static final int 	PRIMARY_BITMAP_001_FORMAT		= FIXED_FORMAT;		 
	
	public static final int 	PRIMARY_BITMAP_001_LENGTH		= 64;
	
	public static final int 	PRIMARY_BITMAP_001_ENCODING		= EBCDIC_ENCODING;
	public static final int 	PRIMARY_BITMAP_001_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	PRIMARY_BITMAP_001_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	PRIMARY_BITMAP_001_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PRIMARY_BITMAP_001_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	PRIMARY_BITMAP_001_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	PRIMARY_BITMAP_001_VALUE		= "255";

}
