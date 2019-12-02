package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE010 {

	public static final int 	NUMBER_OF_DE010_FIELDS	                    		= 1;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_INDEX		= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_ID			= 10100;	 
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_FIELD		= 10;	 
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_SUBFIELD		= 0;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_LENGTH		= 8;   	 
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_CONVERSION_RATE_010_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_CONVERSION_RATE_010_VALUE		= "00000125";
	
}
