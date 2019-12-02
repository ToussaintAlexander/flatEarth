package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE063RuleHeader {
 
	// DE063 Header - Bitmap Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE063_RULE_HEADER_REPORT_TITLE							= "DE063 Rule Header";
	
	public static final int 	BITMAP_063_RULE_HEADER_ID								= 63000;	 
	public static final int 	BITMAP_063_RULE_HEADER_FIELD							= 63;	 
	public static final int 	BITMAP_063_RULE_HEADER_SUBFIELD							= 0;
	
	public static final boolean BITMAP_063_RULE_HEADER_FIRE								= RULE_NOT_FIRED_B;
	
	public static final int 	BITMAP_063_RULE_HEADER_FORMAT							= FIXED_FORMAT;	
	
	public static final int 	BITMAP_063_RULE_HEADER_MINIMUM_LENGTH					= 2;
	public static final int 	BITMAP_063_RULE_HEADER_MAXIMUM_LENGTH					= 2;
	
	public static final int 	BITMAP_063_RULE_HEADER_ENCODING							= EBCDIC_ENCODING;
	public static final int 	BITMAP_063_RULE_HEADER_DATATYPE							= NUMERIC_DATATYPE;
	
	public static final int 	BITMAP_063_RULE_HEADER_SOURCE							= ASSOCIATION_FROM_SOURCE;
	public static final int 	BITMAP_063_RULE_HEADER_DIRECTION						= ASSOCIATION_FROM_DIRECTION;
	public static final int 	BITMAP_063_RULE_HEADER_EXISTENCE						= MANDATORY_PRESENCE;
	public static final int 	BITMAP_063_RULE_HEADER_CHANGE							= ELEMENT_FIXED;
	
	public static final String 	BITMAP_063_RULE_HEADER_VALUE							= null;
	
	//-------------------------------------------------------------------------------
	
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_ID						= 63000;	 
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_FIELD					= 63;	 
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_SUBFIELD				= 1;
	
	public static final boolean NETWORK_ID_CODE_063_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_MAXIMUM_LENGTH			= 2;
	
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	NETWORK_ID_CODE_063_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	NETWORK_ID_CODE_063_RULE_HEADER_VALUE					= null;
	
	//-------------------------------------------------------------------------------
	
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_ID					= 63000;	 
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_FIELD				= 63;	 
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_SUBFIELD				= 2;
	
	public static final boolean PREAUTH_TIME_LIMIT_063_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	PREAUTH_TIME_LIMIT_063_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------
	
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_ID					= 63000;	 
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_FIELD				= 63;	 
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_SUBFIELD			= 3;
	
	public static final boolean MESSAGE_REASON_CODE_063_RULE_HEADER_FIRE				= RULE_NOT_FIRED_B;
	
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_FORMAT				= FIXED_FORMAT;	
	
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_MINIMUM_LENGTH		= 2;
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_MAXIMUM_LENGTH		= 2;
	
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_ENCODING			= EBCDIC_ENCODING;
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_DATATYPE			= NUMERIC_DATATYPE;
	
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_SOURCE				= ASSOCIATION_FROM_SOURCE;
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_DIRECTION			= ASSOCIATION_FROM_DIRECTION;
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_EXISTENCE			= MANDATORY_PRESENCE;
	public static final int 	MESSAGE_REASON_CODE_063_RULE_HEADER_CHANGE				= ELEMENT_FIXED;
	
	public static final String 	MESSAGE_REASON_CODE_063_RULE_HEADER_VALUE				= null;
	
	//-------------------------------------------------------------------------------
	
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_ID				= 63000;	 
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FIELD			= 63;	 
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_SUBFIELD		= 4;
	
	public static final boolean STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_MINIMUM_LENGTH	= 2;
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_MAXIMUM_LENGTH	= 2;
	
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	STIP_SWITCH_REASON_CODE_063_RULE_HEADER_VALUE			= null;
	
}
