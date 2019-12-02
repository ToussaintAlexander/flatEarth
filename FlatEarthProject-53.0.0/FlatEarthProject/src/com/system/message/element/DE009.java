package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE009 {

	public static final int 	NUMBER_OF_DE009_FIELDS						= 1;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_ID			= 9000;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_FIELD		= 9;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_SUBFIELD		= 0;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_FORMAT		= FIXED_FORMAT;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_LENGTH		= 8;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_ENCODING		= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		SETTLEMENT_CONVERSION_RATE_009_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		SETTLEMENT_CONVERSION_RATE_009_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_CONVERSION_RATE_009_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_CONVERSION_RATE_009_VALUE		= "00002500";
	
}
