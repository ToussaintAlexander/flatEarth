package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE053 {

	public static final int NUMBER_OF_DE053_FIELDS	                = 7;
	
	public static final int KEY_MANAGEMENT_SCHEME_053_INDEX			= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_ID		= 53000;	 
	public static final int 	KEY_MANAGEMENT_SCHEME_053_FIELD		= 53;	 
	public static final int 	KEY_MANAGEMENT_SCHEME_053_SUBFIELD	= 0;
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_FORMAT	= FIXED_FORMAT;	
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_LENGTH	= 64;   	 
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_ENCODING	= EBCDIC_ENCODING;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_DATATYPE	= BINARY_DATATYPE;
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_SOURCE	= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_CHANGE	= ELEMENT_FIXED;
	
	public static final String 	KEY_MANAGEMENT_SCHEME_053_VALUE		= "12345678";
	
	//-------------------------------------------------------------------------------------------

	public static final int 	KEY_SET_IDENTIFIER_053_ID			= 53000;	 
	public static final int 	KEY_SET_IDENTIFIER_053_FIELD		= 53;	 
	public static final int 	KEY_SET_IDENTIFIER_053_SUBFIELD		= 1;
	
	public static final int 	KEY_SET_IDENTIFIER_053_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	KEY_SET_IDENTIFIER_053_LENGTH		= 1;   	 
	
	public static final int 	KEY_SET_IDENTIFIER_053_ENCODING		= EBCDIC_ENCODING;
	public static final int 	KEY_SET_IDENTIFIER_053_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	KEY_SET_IDENTIFIER_053_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_SET_IDENTIFIER_053_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_SET_IDENTIFIER_053_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	KEY_SET_IDENTIFIER_053_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	KEY_SET_IDENTIFIER_053_VALUE		= "K";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	ENCRYPTION_ALGORITHM_053_ID			= 53000;	 
	public static final int 	ENCRYPTION_ALGORITHM_053_FIELD		= 53;	 
	public static final int 	ENCRYPTION_ALGORITHM_053_SUBFIELD	= 2;
	
	public static final int 	ENCRYPTION_ALGORITHM_053_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	ENCRYPTION_ALGORITHM_053_LENGTH		= 1;   	 
	
	public static final int 	ENCRYPTION_ALGORITHM_053_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ENCRYPTION_ALGORITHM_053_DATATYPE	= BINARY_DATATYPE;
	
	public static final int 	ENCRYPTION_ALGORITHM_053_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ENCRYPTION_ALGORITHM_053_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ENCRYPTION_ALGORITHM_053_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ENCRYPTION_ALGORITHM_053_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ENCRYPTION_ALGORITHM_053_VALUE		= "9";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	KEY_LENGTH_053_ID					= 53000;	 
	public static final int 	KEY_LENGTH_053_FIELD				= 53;	 
	public static final int 	KEY_LENGTH_053_SUBFIELD				= 3;
	
	public static final int 	KEY_LENGTH_053_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	KEY_LENGTH_053_LENGTH				= 1;   	 
	
	public static final int 	KEY_LENGTH_053_ENCODING				= EBCDIC_ENCODING;
	public static final int 	KEY_LENGTH_053_DATATYPE				= BINARY_DATATYPE;
	
	public static final int 	KEY_LENGTH_053_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_LENGTH_053_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_LENGTH_053_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	KEY_LENGTH_053_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	KEY_LENGTH_053_VALUE				= "4";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	PROTECTION_MECHANISM_053_ID			= 53000;	 
	public static final int 	PROTECTION_MECHANISM_053_FIELD		= 53;	 
	public static final int 	PROTECTION_MECHANISM_053_SUBFIELD	= 4;
	
	public static final int 	PROTECTION_MECHANISM_053_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	PROTECTION_MECHANISM_053_LENGTH		= 1;   	 
	
	public static final int 	PROTECTION_MECHANISM_053_ENCODING	= EBCDIC_ENCODING;
	public static final int 	PROTECTION_MECHANISM_053_DATATYPE	= BINARY_DATATYPE;
	
	public static final int 	PROTECTION_MECHANISM_053_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	PROTECTION_MECHANISM_053_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PROTECTION_MECHANISM_053_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	PROTECTION_MECHANISM_053_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	PROTECTION_MECHANISM_053_VALUE		= "2";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	RESERVED_NATIONAL_053_ID			= 53000;	 
	public static final int 	RESERVED_NATIONAL_053_FIELD			= 53;	 
	public static final int 	RESERVED_NATIONAL_053_SUBFIELD		= 5;
	
	public static final int 	RESERVED_NATIONAL_053_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	RESERVED_NATIONAL_053_LENGTH		= 1;   	 
	
	public static final int 	RESERVED_NATIONAL_053_ENCODING		= EBCDIC_ENCODING;
	public static final int 	RESERVED_NATIONAL_053_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	RESERVED_NATIONAL_053_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESERVED_NATIONAL_053_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESERVED_NATIONAL_053_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	RESERVED_NATIONAL_053_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	RESERVED_NATIONAL_053_VALUE			= "8";
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	RESERVED_PRIVATE_053_ID				= 53000;	 
	public static final int 	RESERVED_PRIVATE_053_FIELD			= 53;	 
	public static final int 	RESERVED_PRIVATE_053_SUBFIELD		= 6;
	
	public static final int 	RESERVED_PRIVATE_053_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	RESERVED_PRIVATE_053_LENGTH			= 1;   	 
	
	public static final int 	RESERVED_PRIVATE_053_ENCODING		= EBCDIC_ENCODING;
	public static final int 	RESERVED_PRIVATE_053_DATATYPE		= BINARY_DATATYPE;
	
	public static final int 	RESERVED_PRIVATE_053_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESERVED_PRIVATE_053_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESERVED_PRIVATE_053_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	RESERVED_PRIVATE_053_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	RESERVED_PRIVATE_053_VALUE			= "1";
	
}
