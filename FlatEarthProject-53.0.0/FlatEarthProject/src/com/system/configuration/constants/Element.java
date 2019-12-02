package com.system.configuration.constants;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

/***********************************************************************************************************************
 *  Source						Direction							Existence							Change						 
 *  
 *  0	Cardholder				0	Cardholder 	->	Merchant		1   Mandatory					1	Element Fixed	
 *  1	Merchant				1	Merchant	->	Acquirer 		2	Mandatory Echo				2   Element Added			
 *  2	Acquirer Processor		2	Acquirer	->	Association		3	Conditional					3   Element Removed
 *  3	Association				3	Association	->	Issuer			4	Prohibited					4   Element Change	 
 *  4	Issuer Processor		4	Issuer		->	Client										 
 *  5	Client Bank				5	Client		->	Issuer										 						
 *  6	Issuer Processor		6	Issuer 		->	Association									 							
 *  7	Association				7   Association	->	Acquirer									 
 *  8 	Acquirer				8	Acquirer	->	Merchant
 *  9	Merchant				9	Merchant	->	Cardholder
 ***********************************************************************************************************************
 */

public interface Element {

	//------------------------------------------------------------
	// Attribute Positions  
	//------------------------------------------------------------
	
	public static final int ID_POSITION 									= 0;
	public static final int FIELD_POSITION 									= 1;
	public static final int SUBFIELD_POSITION 								= 2;
	
	public static final int FIRE_POSITION 									= 3;
	public static final int TYPE_POSITION 									= 4;
	public static final int GROUP_POSITION 									= 5;

	public static final int SEQUENCE_POSITION 								= 6;
	public static final int POINTER_POSITION 								= 7;
	public static final int VALUE_POSITION 									= 8;
	
	//------------------------------------------------------------
	// Field
	//------------------------------------------------------------
	
	public static final int RULE_NOT_FIRED 					= 0;
	public static final int RULE_FIRED 						= 1;
	
	public static final int RULE_FIRE_POSITION 				= 3;
	public static final int RULE_HAS_FIRED 					= 777;
	public static final int RULE_HAS_MISFIRED 				= 1;
	
	public static final boolean RULE_NOT_FIRED_B 			= false;
	public static final boolean RULE_FIRED_B 				= true;
	
	//------------------------------------------------------------
	// Rule Type
	//------------------------------------------------------------
	
	public static final int ADDRESS_RULE_TYPE				= 10;
	public static final int COMPOSITE_RULE_TYPE				= 20;
	public static final int CONSTANT_RULE_TYPE				= 30;
	public static final int DATABASE_RULE_TYPE				= 40;
	public static final int NUMERIC_RULE_TYPE				= 50;
	public static final int UNASSIGNED_RULE_TYPE			= 99;
	
	//------------------------------------------------------------
	// Rule Group
	//------------------------------------------------------------
	
	public static final int ADDRESS_RULE_GROUP				= 10;
	public static final int ARITHMETIC_RULE_GROUP			= 15;
	public static final int BITMAP_RULE_GROUP				= 20;
	public static final int CHARACTER_RULE_GROUP			= 25;
	public static final int CITY_RULE_GROUP					= 30;
	public static final int CODE_RULE_GROUP					= 35;
	public static final int COUNTRY_RULE_GROUP				= 40;
	public static final int CURRENCY_RULE_GROUP				= 45;
	public static final int DATE_TIME_RULE_GROUP			= 50;
	public static final int EXACT_RULE_GROUP				= 55;
	public static final int RANGE_RULE_GROUP				= 60;
	public static final int RATE_RULE_GROUP					= 65;
	public static final int SEQUENCE_RULE_GROUP				= 70;
	public static final int STATE_RULE_GROUP				= 75;
	public static final int UNASSIGNED_RULE_GROUP			= 99;
	
	//------------------------------------------------------------
	// BIN Level
	//------------------------------------------------------------
	
	public static final BinLevel BIN_LEVEL					= null;
	
	//------------------------------------------------------------
	// Account Level
	//------------------------------------------------------------
	
	public static final AcctLevel ACCOUNT_LEVEL				= null;
	
	//------------------------------------------------------------
	// Transaction Level
	//------------------------------------------------------------
	
	public static final TransLevel TRANS_LEVEL				= null;	

	//------------------------------------------------------------
	// Format
	//------------------------------------------------------------
	
	public static final int FIXED_FORMAT					= 10;
	public static final int VARIABLE_FORMAT 				= 20;
	public static final int UNASSIGNED_FORMAT 				= 99;
	
	//------------------------------------------------------------
	// Encoding
	//------------------------------------------------------------
	
	public static final int ASCII_ENCODING					= 10;
	public static final int EBCDIC_ENCODING 				= 20;
	
	//------------------------------------------------------------
	// Data Type
	//------------------------------------------------------------
	
	public static final int ALPHABETIC_DATATYPE				= 10;
	public static final int ALPHANUMERIC_DATATYPE 			= 20;
	public static final int ALPHANUMERIC_SPECIAL_DATATYPE	= 30;
	public static final int BINARY_DATATYPE 				= 40;
	public static final int DATE_DATATYPE 					= 50;
	public static final int NUMERIC_DATATYPE 				= 60;
	public static final int NUMERIC_SPECIAL_DATATYPE 		= 70;
	public static final int SPECIAL_DATATYPE 				= 80;
	public static final int TIMESTAMP_DATATYPE 				= 90;
	
	//------------------------------------------------------------
	// Source
	//------------------------------------------------------------
	
	public static final int CARDHOLDER_TO_SOURCE			= 10;
	public static final int MERCHANT_TO_SOURCE				= 15;
	public static final int ACQUIRER_TO_SOURCE				= 20;
	public static final int ASSOCIATION_TO_SOURCE			= 25;
	public static final int ISSUER_TO_SOURCE				= 30;
	public static final int CLIENT_TO_SOURCE				= 35;
	public static final int CLIENT_FROM_SOURCE				= 40;
	public static final int ISSUER_FROM_SOURCE				= 45;
	public static final int ASSOCIATION_FROM_SOURCE			= 50;
	public static final int ACQUIRER_FROM_SOURCE			= 55;
	public static final int MERCHANT_FROM_SOURCE			= 60;
	public static final int CARDHOLDER_FROM_SOURCE			= 65;
	
	//------------------------------------------------------------
	// Direction
	//------------------------------------------------------------
	
	public static final int CARDHOLDER_FROM_DIRECTION		= 10;
	public static final int MERCHANT_FROM_DIRECTION			= 15;
	public static final int ACQUIRER_FROM_DIRECTION			= 20;
	public static final int ASSOCIATION_FROM_DIRECTION		= 25;
	public static final int ISSUER_FROM_DIRECTION			= 30;
	public static final int CLIENT_FROM_DIRECTION			= 35;
	public static final int ISSUER_TO_DIRECTION				= 40;
	public static final int ASSOCIATION_TO_DIRECTION		= 45;
	public static final int ACQUIRER_TO_DIRECTION			= 50;
	public static final int MERCHANT_TO_DIRECTION			= 55;
	
	//------------------------------------------------------------
	// Existence  Field / Value
	//------------------------------------------------------------
	
	public static final int CONDITIONAL_ADDED				= 10;
	public static final int CONDITIONAL_PRESENCE			= 20;
	public static final int CONDITIONAL_REMOVED				= 30;
	
	public static final int MANDATORY_ADDED					= 40;
	public static final int MANDATORY_PRESENCE				= 50;
	public static final int MANDATORY_REMOVED				= 60;
	
	public static final int OPTIONAL_ADDED					= 70;
	public static final int OPTIONAL_PRESENCE				= 80;
	public static final int OPTIONAL_REMOVED				= 90;
	
	//------------------------------------------------------------
	// Change	
	//------------------------------------------------------------
	
	public static final int ELEMENT_FIXED					= 10;
	public static final int ELEMENT_ADDED					= 20;
	public static final int ELEMENT_REMOVED					= 30;
	public static final int ELEMENT_CHANGED					= 40;
	
	//------------------------------------------------------------
	// BIN Weight Detail Rule 	
	//------------------------------------------------------------
	
	public static final int BIN_WEIGHT_LEFT					= 1;
	public static final int BIN_WEIGHT_CENTER				= 2;
	public static final int BIN_WEIGHT_RIGHT				= 3;
	
	//------------------------------------------------------------
	// Account Weight Detail Rule	
	//------------------------------------------------------------
	
	public static final int ACCOUNT_WEIGHT_LEFT				= 4;
	public static final int ACCOUNT_WEIGHT_CENTER			= 5;
	public static final int ACCOUNT_WEIGHT_RIGHT			= 6;
	
	//------------------------------------------------------------
	// Transaction Weight Detail Rule	
	//------------------------------------------------------------
	
	public static final int TRANSACTION_WEIGHT_LEFT			= 7;
	public static final int TRANSACTION_WEIGHT_CENTER		= 8;
	public static final int TRANSACTION_WEIGHT_RIGHT		= 9;
	
	//------------------------------------------------------------
	// Rule Detail Pointer		
	//------------------------------------------------------------
	
	public static final int ADDRESS_RULE_ROUTINE			= 10;
	public static final int ARITHMETIC_RULE_ROUTINE			= 15;
	public static final int BITMAP_RULE_ROUTINE				= 20;
	public static final int CHARACTER_RULE_ROUTINE			= 25;
	public static final int CITY_RULE_ROUTINE				= 30;
	public static final int CODE_RULE_ROUTINE				= 35;
	public static final int COUNTRY_RULE_ROUTINE			= 40;
	public static final int CURRENCY_RULE_ROUTINE			= 45;
	public static final int DATE_TIME_RULE_ROUTINE			= 50;
	public static final int EXACT_RULE_ROUTINE				= 55;
	public static final int RANGE_RULE_ROUTINE				= 60;
	public static final int RATE_RULE_ROUTINE				= 65;
	public static final int SEQUENCE_RULE_ROUTINE			= 70;
	public static final int STATE_RULE_ROUTINE				= 75;
	public static final int NO_OPERATION_RTN				= 9975;
	
	//------------------------------------------------------------
	// Rule Detail Value	
	//------------------------------------------------------------
	
	public static final int VALIDATION_SUCCESS				= 0;
	public static final int VALIDATION_FAILURE				= 1;
	
	//------------------------------------------------------------
	// Create / Modify User 	
	//------------------------------------------------------------
	
	public static final String CREATE_USER					= "TALEXAND";
	public static final String MODIFY_USER 					= "TALEXAND";
	
	//------------------------------------------------------------
	// Create / Modify Time stamp	
	//------------------------------------------------------------
	
	public static final Timestamp CREATE_TIMESTAMP			= new Timestamp(System.currentTimeMillis());
	public static final Timestamp MODIFY_TIMESTAMP 			= new Timestamp(System.currentTimeMillis());
	
}
