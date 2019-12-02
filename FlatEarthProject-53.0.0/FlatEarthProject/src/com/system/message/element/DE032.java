package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE032 {

	public static final int NUMBER_OF_DE032_FIELDS	                    				= 1;
	
	public static final int ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_ID			= 32000;	 
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_FIELD		= 32;	 
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_SUBFIELD	= 0;
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_FORMAT		= VARIABLE_FORMAT;	
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_LENGTH		= 11;   	 
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_VALUE		= "ACQ01250";
	
}
