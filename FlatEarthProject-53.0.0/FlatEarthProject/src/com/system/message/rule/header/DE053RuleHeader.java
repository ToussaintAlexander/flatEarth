package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE053RuleHeader {
 
	// DE053 Header - Security Related Control Information Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE053_RULE_HEADER_REPORT_TITLE							= "DE053 Rule Header";
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_ID				= 53000;	 
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FIELD				= 53;	 
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_SUBFIELD			= 0;
	
	public static final boolean KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_MINIMUM_LENGTH	= 64;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_MAXIMUM_LENGTH	= 64;	 
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_DATATYPE			= BINARY_DATATYPE;
	
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------------------

	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_ID					= 53000;	 
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_FIELD				= 53;	 
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_SUBFIELD				= 1;
	
	public static final boolean KEY_SET_IDENTIFIER_053_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_MINIMUM_LENGTH		= 1;
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_MAXIMUM_LENGTH		= 1;
	
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_DATATYPE				= BINARY_DATATYPE;
	
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	KEY_SET_IDENTIFIER_053_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	KEY_SET_IDENTIFIER_053_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_ID					= 53000;	 
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_FIELD				= 53;	 
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_SUBFIELD			= 2;
	
	public static final boolean ENCRYPTION_ALGORITHM_053_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_MINIMUM_LENGTH		= 1;
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_MAXIMUM_LENGTH		= 1;
	
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_DATATYPE			= BINARY_DATATYPE;
	
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	ENCRYPTION_ALGORITHM_053_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	KEY_LENGTH_053_RULE_HEADER_ID							= 53000;	 
	public static final int 	KEY_LENGTH_053_RULE_HEADER_FIELD						= 53;	 
	public static final int 	KEY_LENGTH_053_RULE_HEADER_SUBFIELD						= 3;
	
	public static final boolean KEY_LENGTH_053_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	KEY_LENGTH_053_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	KEY_LENGTH_053_RULE_HEADER_MINIMUM_LENGTH				= 1;
	public static final int 	KEY_LENGTH_053_RULE_HEADER_MAXIMUM_LENGTH				= 1;
	
	public static final int 	KEY_LENGTH_053_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	KEY_LENGTH_053_RULE_HEADER_DATATYPE						= BINARY_DATATYPE;
	
	public static final int 	KEY_LENGTH_053_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	KEY_LENGTH_053_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	KEY_LENGTH_053_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	KEY_LENGTH_053_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	KEY_LENGTH_053_RULE_HEADER_VALUE						= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_ID					= 53000;	 
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_FIELD				= 53;	 
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_SUBFIELD			= 4;
	
	public static final boolean PROTECTION_MECHANISM_053_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_MINIMUM_LENGTH		= 1;
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_MAXIMUM_LENGTH		= 1;
	 
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_DATATYPE			= BINARY_DATATYPE;
	
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	PROTECTION_MECHANISM_053_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	PROTECTION_MECHANISM_053_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_ID					= 53000;	 
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_FIELD					= 53;	 
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_SUBFIELD				= 5;
	
	public static final boolean RESERVED_NATIONAL_053_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_MINIMUM_LENGTH		= 1;
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_MAXIMUM_LENGTH		= 1;
	
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_DATATYPE				= BINARY_DATATYPE;
	
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	RESERVED_NATIONAL_053_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	RESERVED_NATIONAL_053_RULE_HEADER_VALUE					= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_ID						= 53000;	 
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_FIELD					= 53;	 
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_SUBFIELD				= 6;
	
	public static final boolean RESERVED_PRIVATE_053_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_MINIMUM_LENGTH			= 1;
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_MAXIMUM_LENGTH			= 1;
	
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_DATATYPE				= BINARY_DATATYPE;
	
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	RESERVED_PRIVATE_053_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	RESERVED_PRIVATE_053_RULE_HEADER_VALUE					= null;
	
}
