package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE041 {

	public static final int NUMBER_OF_DE041_FIELDS	                    			= 1;
	
	public static final int CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_ID		= 41000;	 
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_FIELD		= 41;	 
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_SUBFIELD	= 0;
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_LENGTH	= 8;   	 
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_DATATYPE	= ALPHANUMERIC_SPECIAL_DATATYPE;
	
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_VALUE		= "CATI0100";
	
}
