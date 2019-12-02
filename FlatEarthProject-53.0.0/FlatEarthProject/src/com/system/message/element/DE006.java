package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE006 {
	
	public static final int 	NUMBER_OF_DE006_FIELDS						= 1;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_INDEX 		= 0;

	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_ID			= 6000;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_FIELD			= 6;	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_SUBFIELD		= 0;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_FORMAT		= FIXED_FORMAT;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_LENGTH		= 12;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		CARDHOLDER_BILLING_AMOUNT_006_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int		CARDHOLDER_BILLING_AMOUNT_006_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARDHOLDER_BILLING_AMOUNT_006_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CARDHOLDER_BILLING_AMOUNT_006_VALUE			= "000000012500";

}
