package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE011 {

	public static final int NUMBER_OF_DE011_FIELDS	                    = 1;
	
	public static final int SYSTEM_TRACE_AUDIT_NUMBER_011_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_ID		= 11011;	 
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_FIELD		= 11;	 
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_SUBFIELD	= 0;
	
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_LENGTH	= 6;   	 
	
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_ENCODING	= EBCDIC_ENCODING;
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_DATATYPE	= NUMERIC_DATATYPE;
	
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	SYSTEM_TRACE_AUDIT_NUMBER_011_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	SYSTEM_TRACE_AUDIT_NUMBER_011_VALUE		= "123456";
	
}
