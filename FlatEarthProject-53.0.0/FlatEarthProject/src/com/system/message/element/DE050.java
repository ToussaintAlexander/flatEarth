package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE050 {

	public static final int NUMBER_OF_DE050_FIELDS	                    = 1;
	
	public static final int SETTLEMENT_CURRENCY_CODE_050_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_ID			= 50000;	 
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_FIELD		= 50;	 
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_SUBFIELD	= 0;
	
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_LENGTH		= 3;   	 
	
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_CURRENCY_CODE_050_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_CURRENCY_CODE_050_VALUE		= "840";
	
}
