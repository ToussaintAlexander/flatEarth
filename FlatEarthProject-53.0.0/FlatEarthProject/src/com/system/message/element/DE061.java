package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE061 {

	public static final int NUMBER_OF_DE061_FIELDS	                    = 2;
	
	public static final int TRANSACTION_OTHER_AMOUNT_061_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_ID					= 61000;	 
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_FIELD				= 61;	 
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_SUBFIELD			= 0;
	
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_LENGTH				= 12;   	 
	
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_OTHER_AMOUNT_061_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_OTHER_AMOUNT_061_VALUE				= "34500";
	
	//----------------------------------------------------------------------------------------------
	
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_ID			= 61000;	 
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_FIELD		= 61;	 
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_SUBFIELD	= 1;
	
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_LENGTH		= 12;   	 
	
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_OTHER_AMOUNT_061_VALUE		= "10500";
	
}
