package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE051 {

	public static final int NUMBER_OF_DE051_FIELDS	                    		= 1;
	
	public static final int CARDHOLDER_BILLING_CURRENCY_CODE_051_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_ID			= 51000;	 
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_FIELD		= 51;	 
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_SUBFIELD	= 0;
	
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_LENGTH		= 3;   	 
	
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_CURRENCY_CODE_051_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_CURRENCY_CODE_051_VALUE		= "840";
	
}
