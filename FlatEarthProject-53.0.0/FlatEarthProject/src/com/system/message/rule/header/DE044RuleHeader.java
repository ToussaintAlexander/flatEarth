package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE044RuleHeader {
 
	// DE044 Header - Additional Response Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_ID								= 44000;	 
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_FIELD							= 44;	 
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_SUBFIELD						= 0;
	
	public static final boolean	RESPONSE_SOURCE_044_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;	
	
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_MAXIMUM_LENGTH					= 1;   	 
	
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
	
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	RESPONSE_SOURCE_044_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	RESPONSE_SOURCE_044_RULE_HEADER_VALUE							= "1";

	//----------------------------------------------------------------------------------------------
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_ID				= 44000;	 
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FIELD			= 44;	 
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_SUBFIELD		= 1;
	
	public static final boolean	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_MAXIMUM_LENGTH	= 1;    	 
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
		
	public static final String 	ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_VALUE			= "A";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_ID								= 44000;	 
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_FIELD							= 44;	 
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_SUBFIELD						= 2;
	
	public static final boolean	CVV_RESULTS_CODE_044_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH					= 1;
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH					= 1;    	 
	
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	CVV_RESULTS_CODE_044_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	CVV_RESULTS_CODE_044_RULE_HEADER_VALUE							= "1";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_ID				= 44000;	 
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FIELD			= 44;	 
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_SUBFIELD		= 3;
	
	public static final boolean	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH	= 1;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH	= 1;   	 
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_DATATYPE		= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_VALUE			= "1";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_ID							= 44000;	 
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_FIELD							= 44;	 
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_SUBFIELD						= 4;
	
	public static final boolean	CVV2_RESULTS_CODE_044_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH				= 1;
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH				= 1;    	 
	
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	CVV2_RESULTS_CODE_044_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CVV2_RESULTS_CODE_044_RULE_HEADER_VALUE							= "C";

	//----------------------------------------------------------------------------------------------

	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_ID							= 44000;	 
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_FIELD							= 44;	 
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_SUBFIELD						= 5;
	
	public static final boolean	CAVV_RESULTS_CODE_044_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH				= 1;
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH				= 1;    	 
	
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_DATATYPE						= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	CAVV_RESULTS_CODE_044_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CAVV_RESULTS_CODE_044_RULE_HEADER_VALUE							= "0";
	
}
