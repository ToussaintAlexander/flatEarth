package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE004 {
	
	public static final int 	NUMBER_OF_DE004_FIELDS				= 1;
	
	public static final int 	TRANSACTION_AMOUNT_004_INDEX 		= 0;

	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	TRANSACTION_AMOUNT_004_ID			= 4000;
	
	public static final int 	TRANSACTION_AMOUNT_004_FIELD		= 4;	
	public static final int 	TRANSACTION_AMOUNT_004_SUBFIELD		= 0;
	
	public static final int 	TRANSACTION_AMOUNT_004_FORMAT		= FIXED_FORMAT;
	
	public static final int 	TRANSACTION_AMOUNT_004_LENGTH		= 12;
	
	public static final int 	TRANSACTION_AMOUNT_004_ENCODING		= EBCDIC_ENCODING;
	public static final int 	TRANSACTION_AMOUNT_004_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	TRANSACTION_AMOUNT_004_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int		TRANSACTION_AMOUNT_004_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int		TRANSACTION_AMOUNT_004_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	TRANSACTION_AMOUNT_004_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	TRANSACTION_AMOUNT_004_VALUE		= "000000012500";

}
