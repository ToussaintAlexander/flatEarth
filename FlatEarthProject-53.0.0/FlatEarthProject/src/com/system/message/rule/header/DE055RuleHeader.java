package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE055RuleHeader {
 
	// DE055 Header - ICC Data Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE055_RULE_HEADER_REPORT_TITLE									= "DE055 Rule Header";
	
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_ID							= 55000;	 
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FIELD						= 55;	 
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_SUBFIELD					= 0;
	
	public static final boolean TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_MINIMUM_LENGTH				= 3;
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_MAXIMUM_LENGTH				= 3;
	
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	TRAN_CURR_CODE_055_5F2A_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------

	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_ID							= 55000;	 
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_FIELD						= 55;	 
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_SUBFIELD					= 1;
	
	public static final boolean ISSUER_SCRIPTS_055_7100_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	ISSUER_SCRIPTS_055_7100_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_ID							= 55000;	 
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_FIELD						= 55;	 
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_SUBFIELD					= 2;
	
	public static final boolean ISSUER_SCRIPTS_055_7200_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	ISSUER_SCRIPTS_055_7200_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_ID				= 55000;	 
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FIELD				= 55;	 
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_VALUE				= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_ID							= 55000;	 
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_FIELD						= 55;	 
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_SUBFIELD					= 4;
	
	public static final boolean DEDICATED_FNAME_055_8400_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	DEDICATED_FNAME_055_8400_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	DEDICATED_FNAME_055_8400_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_ID								= 55000;	 
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_FIELD							= 55;	 
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_SUBFIELD						= 5;
	
	public static final boolean ISSUER_ARPC_055_9100_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_MINIMUM_LENGTH					= 2;
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_MAXIMUM_LENGTH					= 2;
	
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	ISSUER_ARPC_055_9100_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	ISSUER_ARPC_055_9100_RULE_HEADER_VALUE							= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_ID								= 55000;	 
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_FIELD							= 55;	 
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_SUBFIELD							= 6;
	
	public static final boolean TVR_FLAGS_055_9500_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_MINIMUM_LENGTH					= 2;
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_MAXIMUM_LENGTH					= 2;
	
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	TVR_FLAGS_055_9500_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	TVR_FLAGS_055_9500_RULE_HEADER_VALUE							= null;

	//-------------------------------------------------------------------------------------------
	// Transaction Date	(YYMMDD)
	//-------------------------------------------------------------------------------------------
	
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_ID									= 55000;	 
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_FIELD								= 55;	 
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_SUBFIELD							= 7;
	
	public static final boolean TRAN_DATE_055_9A_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_MINIMUM_LENGTH						= 6;
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_MAXIMUM_LENGTH						= 6;
	
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	TRAN_DATE_055_9A_RULE_HEADER_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	TRAN_DATE_055_9A_RULE_HEADER_VALUE								= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_ID									= 55000;	 
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_FIELD								= 55;	 
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_SUBFIELD							= 8;
	
	public static final boolean TRAN_TYPE_055_9C_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_FORMAT								= FIXED_FORMAT;	
	
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_MINIMUM_LENGTH						= 2;
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_MAXIMUM_LENGTH						= 2;
	
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_SOURCE								= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_DIRECTION							= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_EXISTENCE							= MANDATORY_PRESENCE;
	public static final int 	TRAN_TYPE_055_9C_RULE_HEADER_CHANGE								= ELEMENT_FIXED;
	
	public static final String 	TRAN_TYPE_055_9C_RULE_HEADER_VALUE								= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_ID								= 55000;	 
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_FIELD							= 55;	 
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_SUBFIELD						= 9;
	
	public static final boolean TRAN_AMOUNT_055_9F02_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
		
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_MINIMUM_LENGTH					= 12;
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_MAXIMUM_LENGTH					= 12;
	
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	TRAN_AMOUNT_055_9F02_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	TRAN_AMOUNT_055_9F02_RULE_HEADER_VALUE							= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_ID						= 55000;	 
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FIELD					= 55;	 
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_SUBFIELD				= 10;
	
	public static final boolean OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_MINIMUM_LENGTH			= 12;
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_MAXIMUM_LENGTH			= 12;
	
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_VALUE					= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_ID						= 55000;	 
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_FIELD						= 55;	 
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_SUBFIELD					= 11;
	
	public static final boolean APPL_VERSION_NBR_055_9F09_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_MINIMUM_LENGTH			= 3;
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_MAXIMUM_LENGTH			= 3;
	
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	APPL_VERSION_NBR_055_9F09_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_ID						= 55000;	 
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FIELD					= 55;	 
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_SUBFIELD					= 12;
	
	public static final boolean TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_MINIMUM_LENGTH			= 3;
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_MAXIMUM_LENGTH			= 3;
	
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_VALUE					= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_ID							= 55000;	 
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FIELD						= 55;	 
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_SUBFIELD					= 13;
	
	public static final boolean TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_MINIMUM_LENGTH				= 8;
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_MAXIMUM_LENGTH				= 8;
	
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_DATATYPE					= ALPHANUMERIC_DATATYPE;
	
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_VALUE						= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_ID						= 55000;	 
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FIELD						= 55;	 
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_SUBFIELD					= 14;
	
	public static final boolean CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_MAXIMUM_LENGTH			= 2;
	
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_DATATYPE					= BINARY_DATATYPE;
	
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_ID					= 55000;	 
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FIELD				= 55;	 
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_SUBFIELD			= 15;
	
	public static final boolean TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_VALUE				= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_ID						= 55000;	 
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_FIELD					= 55;	 
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_SUBFIELD					= 16;
	
	public static final boolean TERMINAL_TYPE_055_9F35_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_MAXIMUM_LENGTH			= 2;
	
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
		
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	TERMINAL_TYPE_055_9F35_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	TERMINAL_TYPE_055_9F35_RULE_HEADER_VALUE					= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_ID							= 55000;	 
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_FIELD							= 55;	 
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_SUBFIELD						= 17;
	
	public static final boolean ATC_DATA_055_9F36_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	ATC_DATA_055_9F36_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	ATC_DATA_055_9F36_RULE_HEADER_VALUE							= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_ID					= 55000;	 
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FIELD				= 55;	 
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_SUBFIELD				= 18;
	
	public static final boolean UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_VALUE				= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_ID						= 55000;	 
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FIELD						= 55;	 
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_SUBFIELD					= 19;
	
	public static final boolean TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_MAXIMUM_LENGTH			= 2;
	
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	TRAN_SEQ_CTR_055_9F41_RULE_HEADER_VALUE						= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_ID					= 55000;	 
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FIELD				= 55;	 
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_SUBFIELD			= 20;
	
	public static final boolean TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_VALUE				= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_ID					= 55000;	 
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FIELD				= 55;	 
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_SUBFIELD			= 21;
	
	public static final boolean ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_VALUE				= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_ID							= 55000;	 
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_FIELD						= 55;	 
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_SUBFIELD					= 22;
	
	public static final boolean FORM_FACTOR_055_9F6E_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_FORMAT						= FIXED_FORMAT;	
	
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_MINIMUM_LENGTH				= 2;
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_MAXIMUM_LENGTH				= 2;
	
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_SOURCE						= ASSOCIATION_FROM_SOURCE;
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_DIRECTION					= ASSOCIATION_FROM_DIRECTION;
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_EXISTENCE					= MANDATORY_PRESENCE;
	public static final int 	FORM_FACTOR_055_9F6E_RULE_HEADER_CHANGE						= ELEMENT_FIXED;
	
	public static final String 	FORM_FACTOR_055_9F6E_RULE_HEADER_VALUE						= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_ID						= 55000;	 
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FIELD					= 55;	 
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_SUBFIELD				= 23;
	
	public static final boolean ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_MAXIMUM_LENGTH			= 2;
	
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_VALUE					= null;

	//-------------------------------------------------------------------------------------------
	
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_ID								= 55000;	 
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_FIELD							= 55;	 
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_SUBFIELD						= 24;
	
	public static final boolean NEW_PIN_BLOCK_055_HC_RULE_HEADER_FIRE							= RULE_NOT_FIRED_B;
	
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_MINIMUM_LENGTH					= 2;
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_MAXIMUM_LENGTH					= 2;
	
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_ENCODING						= EBCDIC_ENCODING;
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_DATATYPE						= NUMERIC_DATATYPE;
	
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	NEW_PIN_BLOCK_055_HC_RULE_HEADER_VALUE							= null;
	
}
