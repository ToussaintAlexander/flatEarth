package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE005 {

	public static final int 	NUMBER_OF_DE005_FIELDS			= 1;
	
	public static final int 	SETTLEMENT_AMOUNT_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SETTLEMENT_AMOUNT_005_ID		= 5000;
	
	public static final int 	SETTLEMENT_AMOUNT_005_FIELD		= 5;	
	public static final int 	SETTLEMENT_AMOUNT_005_SUBFIELD	= 0;
	
	public static final int 	SETTLEMENT_AMOUNT_005_FORMAT	= FIXED_FORMAT;
	
	public static final int 	SETTLEMENT_AMOUNT_005_LENGTH	= 12;
	
	public static final int 	SETTLEMENT_AMOUNT_005_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SETTLEMENT_AMOUNT_005_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SETTLEMENT_AMOUNT_005_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int		SETTLEMENT_AMOUNT_005_DIRECTION	= ASSOCIATION_FROM_DIRECTION;		 
	public static final int		SETTLEMENT_AMOUNT_005_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SETTLEMENT_AMOUNT_005_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	SETTLEMENT_AMOUNT_005_VALUE		= "17500";
	
}
