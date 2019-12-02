package com.system.configuration.constants;

public interface Validate {
	
/*
Rule Header ID.............: 0
Rule Header Field......... :      0 :  Unassigned Data Element
Rule Header Sub Field..... :      0 :  Unassigned Data Element
Rule Header Fire.......... :      0 :  false
Rule Header Rule Type..... :     10 :  Unassigned Rule Type		correct / incorrect / missing
Rule Header Rule Group.... :      0 :  Unassigned Rule Group
Rule Header Format........ :      0 :  Unassigned Format
Rule Header Minimum Length.:           0
Rule Header Maximum Length.:           0
Rule Header Encoding.......:      2 :  EBCDIC
Rule Header Data Type......:      6 :  Numeric
Rule Header Source.........:      9 :  From Association
Rule Header Direction......:      4 :  Association ->	Issuer
Rule Header Existence......:      4 :  Prohibited Data Element
Rule Header Change.........:      3 :  Element Removed
Rule Header Value..........:   null :  null	
 */

	//------------------------------------------------------------
	// Validate Rule Header ID
	//------------------------------------------------------------
	
	public static final int ELEMENT_ID_CORRECT				= 1000;
	public static final int ELEMENT_ID_INCORRECT 			= 1001;
	
	//------------------------------------------------------------
	// Validate Rule Header Field
	//------------------------------------------------------------
	
	public static final int ELEMENT_FIELD_CORRECT			= 2000;
	public static final int ELEMENT_FIELD_INCORRECT 		= 2001;
	
	//------------------------------------------------------------
	// Validate Rule Header Subfield
	//------------------------------------------------------------
	
	public static final int ELEMENT_SUBFIELD_CORRECT		= 3000;
	public static final int ELEMENT_SUBFIELD_INCORRECT 		= 3001;
	
	//------------------------------------------------------------
	// Validate Rule Header Fire
	//------------------------------------------------------------
	
	public static final int ELEMENT_FIRE_CORRECT			= 3500;
	public static final int ELEMENT_FIRE_INCORRECT 			= 3501;
	
	//Rule Header Rule Type..... :     10 :  Unassigned Rule Type		correct / incorrect / missing
	//Rule Header Rule Group.... :      0 :  Unassigned Rule Group
	
	//------------------------------------------------------------
	// Element Format	
	//------------------------------------------------------------
	
	public static final int ELEMENT_FORMAT_CORRECT			= 4000;
	public static final int ELEMENT_FORMAT_INCORRECT 		= 4001;
	
	//------------------------------------------------------------
	// Element Length
	//------------------------------------------------------------
	
	public static final int ELEMENT_LENGTH_CORRECT			= 5000;
	public static final int ELEMENT_LENGTH_TOO_SHORT 		= 5001;
	public static final int ELEMENT_LENGTH_TOO_LONG 		= 5002;
	
	//------------------------------------------------------------
	// Element Encoding
	//------------------------------------------------------------
	
	public static final int ELEMENT_ENCODING_CORRECT		= 6000;
	public static final int ELEMENT_ENCODING_INCORRECT 		= 6001;
	
	//------------------------------------------------------------
	// Element Data Type
	//------------------------------------------------------------
	
	public static final int ELEMENT_DATATYPE_CORRECT		= 7000;
	public static final int ELEMENT_DATATYPE_INCORRECT 		= 7001;
	
	//------------------------------------------------------------
	// Element Source
	//------------------------------------------------------------
	
	public static final int ELEMENT_SOURCE_CORRECT			= 8000;
	public static final int ELEMENT_SOURCE_INCORRECT 		= 8001;
	
	//------------------------------------------------------------
	// Element Direction
	//------------------------------------------------------------
	
	public static final int ELEMENT_DIRECTION_CORRECT		= 9000;
	public static final int ELEMENT_DIRECTION_INCORRECT 	= 9001;
	
	//------------------------------------------------------------
	// Element Existence
	//------------------------------------------------------------
	
	public static final int ELEMENT_EXISTENCE_CORRECT 		= 10000;
	public static final int ELEMENT_EXISTENCE_INCORRECT 	= 10001;
	
	//------------------------------------------------------------
	// Element Change
	//------------------------------------------------------------
	
	public static final int ELEMENT_CHANGE_CORRECT			= 11000;
	public static final int ELEMENT_CHANGE_INCORRECT 		= 11001;

	//------------------------------------------------------------
	// Element Value
	//------------------------------------------------------------
	
	public static final int ELEMENT_VALUE_CORRECT			= 12000;
	public static final int ELEMENT_VALUE_INCORRECT 		= 12001;
	
	//------------------------------------------------------------
	// Element Encoding
	//------------------------------------------------------------
	
	public static final int ASCII_ENCODING					= 1;
	public static final int EBCDIC_ENCODING 				= 2;
	
	//------------------------------------------------------------
	// Data Type
	//------------------------------------------------------------
	
	public static final int ALPHABETIC_DATATYPE				= 1;
	public static final int ALPHANUMERIC_DATATYPE 			= 2;
	public static final int ALPHANUMERIC_SPECIAL_DATATYPE	= 3;
	public static final int BINARY_DATATYPE 				= 4;
	public static final int DATE_DATATYPE 					= 5;
	public static final int NUMERIC_DATATYPE 				= 6;
	public static final int NUMERIC_SPECIAL_DATATYPE 		= 7;
	public static final int SPECIAL_DATATYPE 				= 8;
	public static final int TIMESTAMP_DATATYPE 				= 9;
	
	//------------------------------------------------------------
	// Source
	//------------------------------------------------------------
	
	public static final int CARDHOLDER_TO_SOURCE			= 1;
	public static final int MERCHANT_TO_SOURCE				= 2;
	public static final int ACQUIRER_TO_SOURCE				= 3;
	public static final int ASSOCIATION_TO_SOURCE			= 4;
	public static final int ISSUER_TO_SOURCE				= 5;
	public static final int CLIENT_TO_SOURCE				= 6;
	public static final int CLIENT_FROM_SOURCE				= 7;
	public static final int ISSUER_FROM_SOURCE				= 8;
	public static final int ASSOCIATION_FROM_SOURCE			= 9;
	public static final int ACQUIRER_FROM_SOURCE			= 10;
	public static final int MERCHANT_FROM_SOURCE			= 11;
	public static final int CARDHOLDER_FROM_SOURCE			= 12;
	
	//------------------------------------------------------------
	// Direction
	//------------------------------------------------------------
	
	public static final int CARDHOLDER_FROM_DIRECTION		= 1;
	public static final int MERCHANT_FROM_DIRECTION			= 2;
	public static final int ACQUIRER_FROM_DIRECTION			= 3;
	public static final int ASSOCIATION_FROM_DIRECTION		= 4;
	public static final int ISSUER_FROM_DIRECTION			= 5;
	public static final int CLIENT_FROM_DIRECTION			= 6;
	public static final int ISSUER_TO_DIRECTION				= 7;
	public static final int ASSOCIATION_TO_DIRECTION		= 8;
	public static final int ACQUIRER_TO_DIRECTION			= 9;
	public static final int MERCHANT_TO_DIRECTION			= 10;
	
	//------------------------------------------------------------
	// Existence  
	//------------------------------------------------------------
	
	public static final int MANDATORY_ECHO_EXISTENCE		= 1;
	public static final int MANDATORY_EXISTENCE				= 2;
	public static final int CONDITIONAL_EXISTENCE			= 3;
	public static final int PROHIBITED_EXISTENCE			= 4;
	
	//------------------------------------------------------------
	// Change	
	//------------------------------------------------------------
	
	public static final int ELEMENT_FIXED					= 1;
	public static final int ELEMENT_ADDED					= 2;
	public static final int ELEMENT_REMOVED					= 3;
	public static final int ELEMENT_CHANGE					= 4;
	
}
