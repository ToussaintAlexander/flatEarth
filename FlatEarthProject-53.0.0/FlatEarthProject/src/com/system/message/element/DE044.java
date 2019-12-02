package com.system.message.element;

import static com.system.configuration.constants.Element.*;

public abstract interface DE044 {

	public static final int NUMBER_OF_DE044_FIELDS	                   			= 6;
	
	public static final int ADDITIONAL_RESPONSE_DATA_044_INDEX					= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 	RESPONSE_SOURCE_044_ID							= 44000;	 
	public static final int 	RESPONSE_SOURCE_044_FIELD						= 44;	 
	public static final int 	RESPONSE_SOURCE_044_SUBFIELD					= 0;
	
	public static final int 	RESPONSE_SOURCE_044_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	RESPONSE_SOURCE_044_LENGTH						= 1;   	 
	
	public static final int 	RESPONSE_SOURCE_044_ENCODING					= EBCDIC_ENCODING;
	public static final int 	RESPONSE_SOURCE_044_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	RESPONSE_SOURCE_044_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	RESPONSE_SOURCE_044_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	RESPONSE_SOURCE_044_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	RESPONSE_SOURCE_044_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	RESPONSE_SOURCE_044_VALUE						= "1";

	//----------------------------------------------------------------------------------------------
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_ID			= 44000;	 
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_FIELD		= 44;	 
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_SUBFIELD	= 1;
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_LENGTH		= 1;   	 
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_ENCODING	= EBCDIC_ENCODING;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	ADDRESS_VERIFICATION_RESULT_CODE_044_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	ADDRESS_VERIFICATION_RESULT_CODE_044_VALUE		= "A";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CVV_RESULTS_CODE_044_ID							= 44000;	 
	public static final int 	CVV_RESULTS_CODE_044_FIELD						= 44;	 
	public static final int 	CVV_RESULTS_CODE_044_SUBFIELD					= 2;
	
	public static final int 	CVV_RESULTS_CODE_044_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	CVV_RESULTS_CODE_044_LENGTH						= 1;   	 
	
	public static final int 	CVV_RESULTS_CODE_044_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CVV_RESULTS_CODE_044_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CVV_RESULTS_CODE_044_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	CVV_RESULTS_CODE_044_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CVV_RESULTS_CODE_044_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CVV_RESULTS_CODE_044_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	CVV_RESULTS_CODE_044_VALUE						= "1";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_ID			= 44000;	 
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_FIELD		= 44;	 
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_SUBFIELD	= 3;
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_FORMAT		= FIXED_FORMAT;	
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_LENGTH		= 1;   	 
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_ENCODING	= EBCDIC_ENCODING;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_DATATYPE	= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_SOURCE		= ASSOCIATION_FROM_SOURCE;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_DIRECTION	= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_EXISTENCE	= MANDATORY_PRESENCE;
	public static final int 	CARD_AUTHENTICATION_RESULTS_CODE_044_CHANGE		= ELEMENT_FIXED;
	
	public static final String 	CARD_AUTHENTICATION_RESULTS_CODE_044_VALUE		= "1";
	

	//----------------------------------------------------------------------------------------------

	public static final int 	CVV2_RESULTS_CODE_044_ID						= 44000;	 
	public static final int 	CVV2_RESULTS_CODE_044_FIELD						= 44;	 
	public static final int 	CVV2_RESULTS_CODE_044_SUBFIELD					= 4;
	
	public static final int 	CVV2_RESULTS_CODE_044_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CVV2_RESULTS_CODE_044_LENGTH					= 1;   	 
	
	public static final int 	CVV2_RESULTS_CODE_044_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CVV2_RESULTS_CODE_044_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CVV2_RESULTS_CODE_044_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CVV2_RESULTS_CODE_044_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CVV2_RESULTS_CODE_044_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CVV2_RESULTS_CODE_044_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CVV2_RESULTS_CODE_044_VALUE						= "C";

	//----------------------------------------------------------------------------------------------

	public static final int 	CAVV_RESULTS_CODE_044_ID						= 44000;	 
	public static final int 	CAVV_RESULTS_CODE_044_FIELD						= 44;	 
	public static final int 	CAVV_RESULTS_CODE_044_SUBFIELD					= 5;
	
	public static final int 	CAVV_RESULTS_CODE_044_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CAVV_RESULTS_CODE_044_LENGTH					= 1;   	 
	
	public static final int 	CAVV_RESULTS_CODE_044_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CAVV_RESULTS_CODE_044_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	CAVV_RESULTS_CODE_044_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CAVV_RESULTS_CODE_044_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CAVV_RESULTS_CODE_044_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CAVV_RESULTS_CODE_044_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CAVV_RESULTS_CODE_044_VALUE						= "0";
	
}
