package com.system.message.rule.header;

import static com.system.configuration.constants.Element.*;

public abstract interface DE059RuleHeader {
 
	// DE059 Header - National POS Geographical Data Rule Header

  	/***********************************************************************************
   	 ***********************************************************************************
   	 */	
	
	public static final String 	DE059_RULE_HEADER_REPORT_TITLE						= "DE059 Rule Header";
	
	public static final int 	STATE_CODE_059_RULE_HEADER_ID						= 59000;	 
	public static final int 	STATE_CODE_059_RULE_HEADER_FIELD					= 59;	 
	public static final int 	STATE_CODE_059_RULE_HEADER_SUBFIELD					= 0;
	
	public static final boolean STATE_CODE_059_RULE_HEADER_FIRE						= RULE_NOT_FIRED_B;
	
	public static final int 	STATE_CODE_059_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	STATE_CODE_059_RULE_HEADER_MINIMUM_LENGTH			= 2;
	public static final int 	STATE_CODE_059_RULE_HEADER_MAXIMUM_LENGTH			= 2;   	 
	
	public static final int 	STATE_CODE_059_RULE_HEADER_ENCODING					= EBCDIC_ENCODING;
	public static final int 	STATE_CODE_059_RULE_HEADER_DATATYPE					= NUMERIC_DATATYPE;
	
	public static final int 	STATE_CODE_059_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	STATE_CODE_059_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	STATE_CODE_059_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	STATE_CODE_059_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	STATE_CODE_059_RULE_HEADER_VALUE					= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	COUNTY_CODE_059_RULE_HEADER_ID						= 59000;	 
	public static final int 	COUNTY_CODE_059_RULE_HEADER_FIELD					= 59;	 
	public static final int 	COUNTY_CODE_059_RULE_HEADER_SUBFIELD				= 1;
	
	public static final boolean COUNTY_CODE_059_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	COUNTY_CODE_059_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	COUNTY_CODE_059_RULE_HEADER_MINIMUM_LENGTH			= 3;
	public static final int 	COUNTY_CODE_059_RULE_HEADER_MAXIMUM_LENGTH			= 3;   	   	 
	
	public static final int 	COUNTY_CODE_059_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	COUNTY_CODE_059_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	COUNTY_CODE_059_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTY_CODE_059_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTY_CODE_059_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	COUNTY_CODE_059_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	COUNTY_CODE_059_RULE_HEADER_VALUE					= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_ID				= 59000;	 
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_FIELD			= 59;	 
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_SUBFIELD		= 2;
	
	public static final boolean POSTAL_SERVICE_CODE_059_RULE_HEADER_FIRE			= RULE_NOT_FIRED_B;
	
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_FORMAT			= FIXED_FORMAT;	
	
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_MINIMUM_LENGTH	= 9;
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_MAXIMUM_LENGTH	= 9;   	    	 
	
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_ENCODING		= EBCDIC_ENCODING;
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_DATATYPE		= NUMERIC_DATATYPE;
	
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_SOURCE			= ASSOCIATION_FROM_SOURCE;
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_DIRECTION		= ASSOCIATION_FROM_DIRECTION;
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_EXISTENCE		= MANDATORY_PRESENCE;
	public static final int 	POSTAL_SERVICE_CODE_059_RULE_HEADER_CHANGE			= ELEMENT_FIXED;
	
	public static final String 	POSTAL_SERVICE_CODE_059_RULE_HEADER_VALUE			= null;
	
	//-------------------------------------------------------------------------------------------
	
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_ID						= 59000;	 
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_FIELD					= 59;	 
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_SUBFIELD				= 3;
	
	public static final boolean COUNTRY_CODE_059_RULE_HEADER_FIRE					= RULE_NOT_FIRED_B;
	
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_FORMAT					= FIXED_FORMAT;	
	
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_MINIMUM_LENGTH			= 3;
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_MAXIMUM_LENGTH			= 3;   	    	 
	
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_ENCODING				= EBCDIC_ENCODING;
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_DATATYPE				= NUMERIC_DATATYPE;
	
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_SOURCE					= ASSOCIATION_FROM_SOURCE;
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_DIRECTION				= ASSOCIATION_FROM_DIRECTION;
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_EXISTENCE				= MANDATORY_PRESENCE;
	public static final int 	COUNTRY_CODE_059_RULE_HEADER_CHANGE					= ELEMENT_FIXED;
	
	public static final String 	COUNTRY_CODE_059_RULE_HEADER_VALUE					= null;
	
}
