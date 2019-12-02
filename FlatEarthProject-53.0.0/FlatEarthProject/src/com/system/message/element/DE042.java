package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE042 {

	public static final int NUMBER_OF_DE042_FIELDS	                   			 = 1;
	
	public static final int CARD_ACCEPTOR_IDENTIFICATION_CODE_042_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_ID		= 42000;	 
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_FIELD		= 42;	 
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_SUBFIELD	= 0;
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_LENGTH	= 15;   	 
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_DATATYPE	= ALPHANUMERIC_SPECIAL_DATATYPE;
	
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	CARD_ACCEPTOR_IDENTIFICATION_CODE_042_VALUE		= "CAIC0100";
	
}
