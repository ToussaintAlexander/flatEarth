package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE008 {

	public static final int 	NUMBER_OF_DE008_FIELDS						= 1;
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_ID		= 8000;
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_FIELD		= 8;
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_SUBFIELD	= 0;
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_FORMAT	= FIXED_FORMAT;
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_LENGTH	= 7;
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int		CARDHOLDER_BILLING_FEE_AMOUNT_008_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		CARDHOLDER_BILLING_FEE_AMOUNT_008_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_FEE_AMOUNT_008_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_FEE_AMOUNT_008_VALUE		= "00003450";
	
}
