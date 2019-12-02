package com.system.configuration.constants;

public interface Table {

	/****************************************************************************
	 * ACQUIRER SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String ACQUIRER_SCREEN 					= "ACQUIRER_SCREEN";
	
//	final public static String ID_FIELD							= "ID_FIELD";
//	final public static String DESCRIPTION_FIELD				= "DESCRIPTION";
	
	/****************************************************************************
	 * BATCH CONSTANTS
	 ****************************************************************************/
	final public static String BATCH_MENU 						= "BATCH_MENU";
	
	final public static String BATCH_SCREEN 					= "BATCH_SCREEN";
	
	final public static String CSVDB_SCREEN 					= "CSVDB_SCREEN";
	
	final public static String CSVDB_TABLE 						= "RAW_REPORT";
	
	final public static String BATCH_ID_FIELD 					= "BATCH_ID_FIELD";
	final public static String BATCH_KEY_FIELD 					= "BATCH_KEY_FIELD";
	final public static String CONTEXT_FILE_FIELD 				= "CONTEXT_FILE_FIELD";
	final public static String DATABASE_CONFIG_FIELD 			= "DATABASE_CONFIG_FIELD";
	final public static String JOB_LAUNCHER_FIELD 				= "JOB_LAUNCHER_FIELD";
	final public static String JOB_REPORT_FIELD 				= "JOB_REPORT_FIELD";
	final public static String REPORT_JOB_FIELD 				= "REPORT_JOB_FIELD";
	
	/****************************************************************************
	 * DATABASE TABLE NAMES
	 ****************************************************************************/
	final public static String ACQUIRER_TABLE 					= "T_ACQUIRER";
	
	final public static String BATCH_TABLE 						= "T_BATCH";
	
	final public static String EXPRESSION_TABLE					= "T_EXPRESSION";
	
	final public static String EXTENSION_TABLE					= "T_EXTENSION";
	
	final public static String EXECUTIVE_TABLE					= "T_EXECUTIVE";
	final public static String FIELD_TABLE						= "T_FIELD";
	
	final public static String HIBERNATE_TABLE 					= "T_HIBERNATE";
	
	final public static String INCREMENT_TABLE					= "T_INCREMENT";
	final public static String INTELLIGENT_TABLE				= "T_INTELLIGENT";
	final public static String ISSUER_TABLE 					= "T_ISSUER";
	final public static String LOGGER_TABLE 					= "T_LOGGER";
	
	final public static String MARSHALL_TABLE 					= "T_MARSHALL";
	
	final public static String MENU_TABLE						= "T_MENU";
	final public static String MESSAGE_TABLE 					= "T_MESSAGE";
	
	final public static String MESSAGING_TABLE 					= "T_MESSAGING";
	
	final public static String PASSWORD_TABLE 					= "T_PASSWORD";
	final public static String PROCESS_TABLE 					= "T_PROCESS";
	final public static String PROCESSOR_TABLE 					= "T_PROCESSOR";
	
	final public static String PROFILE_TABLE 					= "T_PROFILE";
	
	final public static String PROPERTIES_FILE 					= "F_PROPERTIES";
	final public static String REGRESSION_TABLE 				= "T_REGRESSION";
	
	final public static String REMOTE_TABLE 					= "T_REMOTE";
	
	final public static String SCHEDULE_TABLE 					= "T_SCHEDULE";
	
	final public static String SCREEN_TABLE						= "T_SCREEN";
	final public static String SECURITY_TABLE					= "T_SECURITY";
	
	final public static String SOAP_TABLE 						= "T_SOAP";
	
	final public static String SYSPROPERTY_TABLE				= "T_SYSPROPERTY";
	
	final public static String TRANSACTION_TABLE				= "T_TRANSACTION";
	
	final public static String VERSION_TABLE 					= "T_VERSION";

	/****************************************************************************
	 * EVENTHANDLER CONSTANTS
	 ****************************************************************************/
	class Severity {
		final public static int DEBUG 							= 1;
		final public static int FATAL 							= 2;
		final public static int ERROR 							= 3;
	}
	/****************************************************************************
	 * DML EXECUTION RESULT CONSTANTS
	 ****************************************************************************/
	final public static int ROWS_FOUND 							= 1;
	final public static int NO_ROWS_FOUND 						= 2;
	final public static int SQL_EXCEPTION						= 3;
	
	/****************************************************************************
	 * EXECUTIVE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String EXECUTIVE_SCREEN 				= "EXECUTIVE_SCREEN";
	
	/****************************************************************************
	 * EXPRESSION RATING CONSTANTS
	 ****************************************************************************/
	final public static int POOR_RATING							= 1;
	final public static int GOOD_RATING							= 2;
	final public static int EXCELLENT_RATING					= 3;
	
	/****************************************************************************
	 * EXPRESSION SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String EXPRESSION_SCREEN 				= "EXPRESSION_SCREEN";
	
	final public static String EXPRESSION_ID_FIELD				= "EXPRESSION_ID_FIELD";
	final public static String SCREEN_NAME_FIELD				= "SCREEN_NAME_FIELD";
	final public static String FIELD_NAME_FIELD					= "FIELD_NAME_FIELD";
	final public static String FIELD_VALUE_FIELD				= "FIELD_VALUE_FIELD";
	final public static String EXPRESSION_FIELD					= "EXPRESSION_FIELD";
	final public static String RATING_FIELD						= "RATING_FIELD";
	final public static String DEFAULT_VALUE_FIELD				= "DEFAULT_VALUE_FIELD";
	final public static String STATUS_FIELD						= "STATUS_FIELD";

	
	/****************************************************************************
	 * EXTENSION SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String EXTENSION_SCREEN 				= "EXTENSION_SCREEN";
	
//	final public static String ID_FIELD							= "ID_FIELD";
	
	/****************************************************************************
	 * FIELD SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String FIELD_SCREEN 				= "FIELD_SCREEN";
	
//	final public static String ID_FIELD						= "ID_FIELD";
	
//	final public static String GROUP_ID_FIELD				= "GROUP_ID_FIELD";
//	final public static String USER_ID_FIELD				= "USER_ID_FIELD";
//	final public static String SEQUENCE_FIELD				= "SEQUENCE_FIELD";
	final public static String MENU_NAME_FIELD				= "MENU_NAME_FIELD";
//	final public static String SCREEN_NAME_FIELD			= "SCREEN_NAME_FIELD";
//	final public static String FIELD_NAME_FIELD				= "FIELD_NAME_FIELD";
	final public static String FIELD_VISIBLE_FIELD			= "FIELD_VISIBLE_FIELD";
	final public static String FIELD_EDITABLE_FIELD			= "FIELD_EDITABLE_FIELD";
//	final public static String CREATE_USER_FIELD			= "CREATE_USER_FIELD";			 
//	final public static String CREATE_TIMESTAMP_FIELD		= "CREATE_TIMESTAMP_FIELD";	 
//	final public static String MODIFY_USER_FIELD			= "MODIFY_USER_FIELD";			 
//	final public static String MODIFY_TIMESTAMP_FIELD		= "MODIFY_TIMESTAMP_FIELD";
	
	/****************************************************************************
	 * FUNCTION KEY CONSTANTS
	 *****************************************************************************/
	final public static int ACTIVATE_KEY						= 1;  
	final public static int NEXT_RECORD							= 2;
	final public static int PREVIOUS_RECORD						= 3;
	final public static int UPDATE_RECORD						= 4;
	final public static int ACTION_UNDEFINED					= 5;
	final public static int DELETE_RECORD						= 6;
	final public static int PREVIOUS_PAGE						= 7;
	final public static int NEXT_PAGE							= 8;
	final public static int HELP_SCREEN							= 9;
	final public static int INSERT_RECORD						= 10;
	final public static int CREATE_REPORT						= 11;
	final public static int EXIT_SCREEN							= 12;
	
	final public static int TRANSFER_RECORD						= 12;
	
	final public static int LOGIN_BUTTON						= 90;
	final public static int RESET_BUTTON						= 91;
	
	/****************************************************************************
	 * GENERIC SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String GENERIC_SCREEN 					= "GENERIC_SCREEN";
	
	/****************************************************************************
	 * HIBERNATE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String HIBERNATE_SCREEN 				= "HIBERNATE_SCREEN";
	
	/****************************************************************************
	 * HOST MACHINE CONSTANTS
	 ****************************************************************************/
	final public static int LOCAL_HOST							= 1; 
	final public static int REMOTE_HOST							= 2; 
	final public static int BACKUP_HOST							= 3; 

	/****************************************************************************
	 * INCREMENT CONSTANTS
	 ****************************************************************************/
	final public static int MAXIMUM_INCREMENT 					= 9999;
	
	/****************************************************************************
	 INCREMENT SCREEN CONSTANTS
	****************************************************************************/
	final public static String INCREMENT_SCREEN 				= "INCREMENT_SCREEN";
	
	final public static String ID_FIELD							= "ID_FIELD";  			
	final public static String TABLE_NAME_FIELD					= "TABLE_NAME_FIELD";
	
	/****************************************************************************
	 INTELLIGENT SCREEN CONSTANTS
	****************************************************************************/
	final public static String INTELLIGENT_SCREEN 				= "INTELLIGENT_SCREEN";
	
	/****************************************************************************
	 ISSUER SCREEN CONSTANTS
	****************************************************************************/
	final public static String ISSUER_SCREEN 					= "ISSUER_SCREEN";
	
	/****************************************************************************
	 * LOGGER FORMATTER CONSTANTS
	 ****************************************************************************/
	final public static int PACKAGE_LENGTH						= 30;  
	
	/****************************************************************************
	 * LOGGER FILTER CONSTANTS
	 ****************************************************************************/
	final public static int UNKNOWN_FILTER						= 0;  
	final public static int MESSAGE_FILTER						= 1;  
	final public static int PRIMITIVE_FILTER					= 2;
	final public static int OBJECT_FILTER						= 3;
	
	/****************************************************************************
	 * LOGGER FORMAT CONSTANTS
	 ****************************************************************************/
	final public static int PLAIN_FORMAT						= 1;  
	final public static int XML_FORMAT							= 2;
	final public static int HTML_FORMAT							= 3;
	final public static int UNKNOWN_FORMAT						= 9;  

	/****************************************************************************
	 * LOGGER HANDLER TYPES 
	 ****************************************************************************/
	final public static int CONSOLE_HANDLER						= 1; 
	final public static int XML_HANDLER							= 2; 
	final public static int HTML_HANDLER						= 3; 
	final public static int MEMORY_HANDLER						= 4; 
	final public static int ROLLING_HANDLER						= 5; 
	final public static int STREAM_HANDLER						= 6; 
	final public static int SOCKET_HANDLER						= 7; 
	
	/****************************************************************************
	 *  LOGGER PROPERTY NAMES 
	 ****************************************************************************/
	final public static int DRIVER_NAME							= 1; 
	final public static int PASSWORD 							= 2;
	final public static int PORT_NUMBER							= 3; 
	final public static int PROPERTY_FILE						= 4; 
	final public static int SERVER_NAME							= 5; 
	final public static int SITE_IDENTIFIER						= 6; 
	final public static int USER_NAME							= 7; 
		
	/****************************************************************************
	 * LOGGER PUSH LEVEL CONSTANTS
	 ****************************************************************************/
	//
	// OFF     - is a special level that can be used to turn off logging. 
	//
	// SEVERE  - In general these should describe events that are of considerable 
	//	         importance and which will prevent normal program execution.
	//
	// WARNING - In general these messages should describe events that will be of
	//           interest to end users or system managers, or which indicate
	//           potential problems. 
	//
	// INFO    - Typically INFO messages will be written to the console or its 
	//           equivalent. 
	//
	// CONFIG  - CONFIG messages are intended to provide a variety of static 
	//           configuration information, to assist in debugging problems that
	//           may be associated with particular configurations. For example,
	//           CONFIG message might include the CPU type, the graphics depth, 
	//           the GUI look-and-feel, etc. 
	//
	// All of FINE, FINER, and FINEST are intended for relatively detailed 
	// tracing. The exact meaning of the three levels will vary between 
	// subsystems, but in general, FINEST should be used for the most voluminous
	// detailed output, FINER for somewhat less detailed output, and FINE for 
	// the lowest volume (and most important) messages. 
	//
	// FINE    - FINE messages might include things like minor (recoverable) 
	//           failures. Issues indicating potential performance problems are
	//           also worth logging as FINE. 
	//
	// FINER   - FINER indicates a fairly detailed tracing message. By default
	//           logging calls for entering, returning, or throwing an exception
	//           are traced at this level. 
	//
	// FINEST  - FINEST indicates a highly detailed tracing message.
	//
	// ALL     - ALL indicates that all messages should be logged.
	// 
	/****************************************************************************/
	final public static int OFF_LEVEL							= Integer.MAX_VALUE;	// 2147483647
	final public static int SEVERE_LEVEL						= 1000;
	final public static int WARNING_LEVEL						= 900;
	final public static int INFO_LEVEL							= 800;
	final public static int CONFIG_LEVEL						= 700;
	final public static int FINE_LEVEL							= 500;
	final public static int FINER_LEVEL							= 400;
	final public static int FINEST_LEVEL						= 300;
	final public static int ALL_LEVEL							= Integer.MIN_VALUE;	// -2147483648 
	
	/****************************************************************************
	 * LOGGER RESOURCE BUNDLE CONSTANTS
	 ****************************************************************************/	
	final public static String DATABASE_RESOURCES				= "DATABASE_RESOURCES";
	final public static String ENVIRONMENT_RESOURCES			= "ENVIRONMENT_RESOURCES";
	final public static String PROPERTIES_RESOURCES				= "PROPERTIES_RESOURCES";
	
	/****************************************************************************
	 * LOGGER SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String LOGGER_SCREEN 					= "LOGGER_SCREEN";
	
	final public static String LOGGER_ID_FIELD					= "LOGGER_ID_FIELD";  			 
	final public static String LOGGER_NAME_FIELD				= "LOGGER_NAME_FIELD";   			 
	final public static String HANDLER_TYPE_FIELD				= "HANDLER_TYPE_FIELD";	  
	final public static String FILE_HANDLER_FIELD				= "FILE_HANDLER_FIELD";
	final public static String SERVER_NAME_FIELD				= "SERVER_NAME_FIELD";
	final public static String PORT_NUMBER_FIELD				= "PORT_NUMBER_FIELD";
	final public static String OUTPUT_STREAM_FIELD				= "OUTPUT_STREAM_FIELD";
	final public static String FILE_NAME_PATTERN_FIELD			= "FILE_NAME_PATTERN_FIELD";  
	final public static String FILE_APPEND_FIELD				= "FILE_APPEND_FIELD";
	final public static String MAXIMUM_DISK_FILES_FIELD			= "MAXIMUM_DISK_FILES_FIELD";
	final public static String FILE_LIMIT_SIZE_FIELD			= "FILE_LIMIT_SIZE_FIELD";  
	final public static String MAXIMUM_RECORD_BUFFER_FIELD		= "MAXIMUM_RECORD_BUFFER_FIELD";
	final public static String FILTER_CODE_FIELD				= "FILTER_CODE_FIELD";
	final public static String FILTER_VALUE_FIELD				= "FILTER_VALUE_FIELD";
	final public static String PUSH_LEVEL_FIELD					= "PUSH_LEVEL_FIELD";
	final public static String SOURCE_CLASS_FIELD				= "SOURCE_CLASS_FIELD";
	final public static String SOURCE_METHOD_NAME_FIELD			= "SOURCE_METHOD_NAME_FIELD";
	final public static String RESOURCE_BUNDLE_FIELD			= "RESOURCE_BUNDLE_FIELD";
	final public static String FORMAT_CODE_FIELD				= "FORMAT_CODE_FIELD";  

	/****************************************************************************
	 * MARSHALL SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String MARSHALL_SCREEN 					= "MARSHALL_SCREEN";

	/****************************************************************************
	 * MENU CONSTANTS
	 ****************************************************************************/
	final public static int CLIENT_MENU							= 1; 
	final public static int CONFIG_MENU							= 2;
	final public static int EXTERNAL_MENU						= 3;
	final public static int INTERNAL_MENU						= 4;
	final public static int LANGUAGE_MENU						= 5;
	final public static int LOGGER_MENU							= 6;
	final public static int MAPPING_MENU						= 7;
	final public static int MONITOR_MENU						= 8;
	final public static int PLATFORM_MENU						= 9;
	final public static int PROPERTIES_MENU						= 10;
	final public static int SCHEDULE_MENU						= 11;
	final public static int SECURITY_MENU						= 12;
	final public static int SYSTEM_MENU							= 13;
	final public static int UNKNOWN_MENU						= 14;

	/****************************************************************************
	 * MENU PATH CONSTANTS
	 ****************************************************************************/
	final public static String BATCH_MENU_PATH			= "client/system/table/mapping/batch/menu/batchMenu";
	final public static String CLIENT_MENU_PATH			= "client/menu/clientMenu";
	final public static String CONFIGURATION_MENU_PATH	= "client/system/table/configuration/menu/configurationMenu";
	final public static String EXTERNAL_MENU_PATH 		= "client/external/menu/externalMenu";  
	final public static String INTERNAL_MENU_PATH 		= "client/internal/menu/internalMenu";
	final public static String LANGUAGE_MENU_PATH		= "client/system/table/language/menu/languageMenu";
    final public static String LOGGER_MENU_PATH			= "client/system/table/monitor/logger/menu/loggerMenu"; 
	final public static String MAPPING_MENU_PATH		= "client/system/table/mapping/menu/mappingMenu";
	final public static String MONITOR_MENU_PATH		= "client/system/table/monitor/menu/monitorMenu";
	final public static String PLATFORM_MENU_PATH		= "client/system/table/platform/menu/platformMenu";
	final public static String PROPERTIES_MENU_PATH		= "client/system/table/configuration/properties/menu/propertiesMenu";
	final public static String SCHEDULE_MENU_PATH		= "client/system/table/schedule/menu/scheduleMenu";
	final public static String SECURITY_MENU_PATH		= "client/system/table/security/smenu/securityMenu";
	final public static String SYSTEM_MENU_PATH			= "client/system/table/menu/systemTableMenu";
	final public static String UNKNOWN_MENU_PATH		= "client/menu/unknownMenu";

	/****************************************************************************
	 * MENU PATH LITERALS
	 ****************************************************************************/
	final public static String BATCH_MENU_LITERAL			= "BATCH_MENU";
	final public static String CLIENT_MENU_LITERAL			= "CLIENT_MENU";
	final public static String CONFIG_MENU_LITERAL			= "CONFIG_MENU";
	final public static String EXTERNAL_MENU_LITERAL 		= "EXTERNAL_MENU";  
	final public static String INTERNAL_MENU_LITERAL 		= "INTERNAL_MENU";
	final public static String LANGUAGE_MENU_LITERAL		= "LANGUAGE_MENU";
    final public static String LOGGER_MENU_LITERAL			= "LOGGER_MENU"; 
	final public static String MAPPING_MENU_LITERAL			= "MAPPING_MENU";
	final public static String MONITOR_MENU_LITERAL			= "MONITOR_MENU";
	final public static String PLATFORM_MENU_LITERAL		= "PLATFORM_MENU";
	final public static String PROPERTIES_MENU_LITERAL		= "PROPERTIES_MENU";
	final public static String SCHEDULE_MENU_LITERAL		= "SCHEDULE_MENU";
	final public static String SECURITY_MENU_LITERAL		= "SECURITY_MENU";
	final public static String SYSTEM_MENU_LITERAL			= "SYSTEM_MENU";
	final public static String UNKNOWN_MENU_LITERAL			= "UNKNOWN_MENU";
	
	/****************************************************************************
	 * MENU SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String MENU_SCREEN 					= "MENU_SCREEN";
	
//	final public static String ID_FIELD						= "ID_FIELD";
	
//	final public static String GROUP_ID_FIELD				= "GROUP_ID_FIELD";
//	final public static String USER_ID_FIELD				= "USER_ID_FIELD";
//	final public static String SEQUENCE_FIELD				= "SEQUENCE_FIELD";
//	final public static String MENU_NAME_FIELD				= "MENU_NAME_FIELD";
//	final public static String CREATE_USER_FIELD			= "CREATE_USER_FIELD";			 
//	final public static String CREATE_TIMESTAMP_FIELD		= "CREATE_TIMESTAMP_FIELD";	 
//	final public static String MODIFY_USER_FIELD			= "MODIFY_USER_FIELD";			 
//	final public static String MODIFY_TIMESTAMP_FIELD		= "MODIFY_TIMESTAMP_FIELD";
	
	/****************************************************************************
	 * MESSAGE IDS
	 ****************************************************************************/
	
	final public static int BUTTON_NOT_DEFINED 					= 100;
	
	final public static int BUTTON_INSERT_PRESSED 				= 110;
	final public static int BUTTON_SELECT_PRESSED 				= 120;
	final public static int BUTTON_UPDATE_PRESSED 				= 130;
	final public static int BUTTON_DELETE_PRESSED 				= 140;

	final public static int GET_PARAMETER_FOUND 				= 200;
	final public static int GET_PARAMETER_MISSING 				= 210;
	final public static int PARAMETER_DATATYPE_INVALID 			= 220;

	final public static int PROPERTY_FILE_PROPERTY_FOUND		= 300;
	final public static int PROPERTY_FILE_PROPERTY_MISSING		= 305;
	
	final public static int DRIVER_NAME_PROPERTY_FOUND			= 310;
	final public static int DRIVER_NAME_PROPERTY_MISSING		= 315;
	
	final public static int SERVER_NAME_PROPERTY_FOUND			= 320;
	final public static int SERVER_NAME_PROPERTY_MISSING		= 325;
	
	final public static int PORT_NUMBER_PROPERTY_FOUND			= 330;
	final public static int PORT_NUMBER_PROPERTY_MISSING		= 335;
	
	final public static int SITE_IDENTIFIER_PROPERTY_FOUND		= 340;
	final public static int SITE_IDENTIFIER_PROPERTY_MISSING	= 345;
	
	final public static int USERNAME_PROPERTY_FOUND				= 350;
	final public static int USERNAME_PROPERTY_MISSING			= 355;
	
	final public static int PASSWORD_PROPERTY_FOUND				= 360;
	final public static int PASSWORD_PROPERTY_MISSING			= 365;
	
	final public static int DRIVER_PROPERTIES_LOAD_SUCCESS		= 370;
	final public static int DRIVER_PROPERTIES_LOAD_FAILURE		= 375;
	
	final public static int LOAD_REGISTER_DRIVER_NAME_SUCCESS	= 380;
	final public static int LOAD_REGISTER_DRIVER_NAME_ERROR		= 385;
	
	final public static int DATABASE_CONNECTION_SUCCESS			= 390;
	final public static int DATABASE_CONNECTION_FAILURE			= 395;
	
	final public static int DATABASE_CONNECTION_CLOSE_SUCCESS	= 397;
	final public static int DATABASE_CONNECTION_CLOSE_ERROR		= 399;
	
	final public static int CREATE_OUTPUT_STREAM_SUCCESS		= 400;	
	final public static int CREATE_OUTPUT_STREAM_ERROR			= 405;
	
	final public static int PROPS_WRITE_XML_FORMAT_SUCCESS		= 410;
	final public static int PROPS_WRITE_XML_FORMAT_ERROR		= 415;
	
	final public static int PROPS_WRITE_PLAIN_FORMAT_SUCCESS	= 420;
	final public static int PROPS_WRITE_PLAIN_FORMAT_ERROR		= 425;
	
	final public static int CLOSE_OUTPUT_STREAM_SUCCESS			= 430;
	final public static int CLOSE_OUTPUT_STREAM_ERROR			= 435;
	
	final public static int CURRENT_DIR_PROPERTIES_LOAD_SUCCESS	= 440;
	final public static int CURRENT_DIR_PROPERTIES_LOAD_ERROR	= 445;
	
	final public static int CLASSPATH_LOAD_PROPERTIES_SUCCESS	= 450;
	final public static int CLASSPATH_LOAD_PROPERTIES_ERROR		= 455;
	
	final public static int LOAD_PROPERTIES_FILE_SUCCESS		= 460;
	final public static int LOAD_PROPERTIES_FILE_ERROR			= 465;
	
	final public static int SET_FILE_INPUT_STREAM_SUCCESS		= 470;
	final public static int SET_FILE_INPUT_STREAM_ERROR			= 475;
	
	final public static int SET_FILE_OUTPUT_STREAM_SUCCESS		= 480;
	final public static int SET_FILE_OUTPUT_STREAM_ERROR		= 485;
	
	final public static int CLOSE_INPUT_STREAM_SUCCESS			= 490;
	final public static int CLOSE_INPUT_STREAM_ERROR			= 495;
	
	final public static int STMT_INSERTION_SUCCESS				= 600;
	final public static int STMT_INSERTION_WARN					= 605;
	final public static int STMT_INSERTION_ERROR				= 610;
	
	final public static int STMT_SELECTION_SUCCESS				= 615;
	final public static int STMT_SELECTION_WARN					= 620;
	final public static int STMT_SELECTION_ERROR				= 625;
	
	final public static int STMT_UPDATE_SUCCESS					= 630;
	final public static int STMT_UPDATE_WARN					= 635;
	final public static int STMT_UPDATE_ERROR					= 640;

	final public static int STMT_DELETION_SUCCESS				= 645;
	final public static int STMT_DELETION_WARN					= 650;
	final public static int STMT_DELETION_ERROR					= 655;
	
	final public static int TABLE_INSERTION_SUCCESS				= 700;
	final public static int TABLE_INSERTION_WARN				= 705;
	final public static int TABLE_INSERTION_ERROR	  			= 710;
	
	final public static int TABLE_SELECTION_SUCCESS		  		= 715;
	final public static int TABLE_SELECTION_WARN  				= 720;
	final public static int TABLE_SELECTION_ERROR  				= 725;
	
	final public static int TABLE_UPDATE_SUCCESS 				= 730;
	final public static int TABLE_UPDATE_WARN 					= 735;
	final public static int TABLE_UPDATE_ERROR 					= 740;
	
	final public static int TABLE_DELETION_SUCCESS  			= 745;
	final public static int TABLE_DELETION_WARN  				= 750;
	final public static int TABLE_DELETION_ERROR  				= 755;

	final public static int FIELD_VALIDATION_SUCCESS 			= 800;
	final public static int FIELD_VALIDATION_ERROR 				= 810;

	final public static int PASSWORD_ACCOUNT_STATUS 			= 900;
	final public static int PASSWORD_ACCOUNT_TYPE 				= 910;
	
	final public static int PASSWORD_GROUP_ITEMS 				= 915;
	
	final public static int PASSWORD_LAST_ACCESS 				= 920;
	
	final public static int PASSWORD_NOT_FOUND 					= 925;
	
	final public static int PASSWORD_LAST_CHANGE 				= 930;
	final public static int PASSWORD_FAILED_ATTEMPTS 			= 940;
	
	final public static int PASWORD_CHANGE_SUCCESS 				= 950;
	final public static int PASWORD_CHANGE_ERROR 				= 960;
	
	final public static int MAXIMUM_PASSWORD_COUNT				= 0; 
	
	/****************************************************************************
	 * MESSAGE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String BLANK_LINE 						= "BLANK_LINE";
	
	/****************************************************************************
	 * MESSAGE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String MESSAGE_SCREEN 					= "MESSAGE_SCREEN";
	
	final public static String MESSAGE_ID_FIELD 				= "MESSAGE_ID_FIELD";
	final public static String TYPE_ID_FIELD 					= "TYPE_ID_FIELD";
	final public static String CLASSIFICATION_FIELD 			= "CLASSIFICATION_FIELD";
	
//	final public static String DESCRIPTION_FIELD 				= "DESCRIPTION_FIELD";
	final public static String CAUSE_FIELD 						= "CAUSE_FIELD";
	final public static String EFFECT_FIELD 					= "EFFECT_FIELD";
	final public static String RECOVERY_FIELD 					= "RECOVERY_FIELD";
	
	/****************************************************************************
	 * MESSAGE TABLE CONSTANTS
	 ****************************************************************************/
	public final static int INFORMATIONAL 						= 1;	// TYPE IDs
	public final static int WARNING 							= 2;
	public final static int ERROR 								= 3;
	
	public final static int APPLICATION_CLASS 					= 1;
	public final static int DATABASE_CLASS 						= 2;
	
	/****************************************************************************
	 * MESSAGING SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String MESSAGING_SCREEN 				= "MESSAGING_SCREEN";
	
	/****************************************************************************
	 * PASSWORD ACCOUNT CONSTANTS
	 ****************************************************************************/
	final public static int NEW_STATUS 							= 0;	// NEW
	
	final public static int ACTIVE_STATUS 						= 1;	// ACTIVE;	Changed from String to int
	final public static int INACTIVE_STATUS 					= 2;	// INACTIVE
	final public static int FROZEN_STATUS 						= 3;	// FROZEN
	final public static int DELETE_STATUS 						= 4;	// DELETE

	final public static int UNKNOWN_TYPE 						= 0;
	final public static int PERMANENT_TYPE 						= 1;	// PERM;	Changed from String to int
	final public static int TEMPORARY_TYPE 						= 2;	// TEMP		Changed from String to int
	
	final public static int LAST_ACCESS_DAYS					= 90; 
	final public static int LAST_PLUS_FLOOR						= 30;
	final public static int LAST_MINUS_CEILING					= 90;
	final public static int MAXIMUM_ATTEMPTS					= 3;
	final public static int NUMBER_OF_MONTHS					= 3; 
	
	final public static int ZERO_FAILED_ATTEMPTS				= 0; 
	final public static int ONE_FAILED_ATTEMPT					= 1; 
	final public static int TWO_FAILED_ATTEMPTS					= 2; 
	final public static int THREE_FAILED_ATTEMPTS				= 3; 
	
	/****************************************************************************
	 * PASSWORD SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String PASSWORD_SCREEN 					= "PASSWORD_SCREEN";
	final public static String LOGIN_SCREEN 					= "LOGIN_SCREEN";
	
	final public static String GROUP_ID_FIELD					= "GROUP_ID_FIELD";				 
	final public static String USER_ID_FIELD					= "USER_ID_FIELD";				 
	final public static String SEQUENCE_FIELD					= "SEQUENCE_FIELD";				 
	final public static String USERNAME_FIELD					= "USERNAME_FIELD";			 
	final public static String PASSWORD_FIELD					= "PASSWORD_FIELD";			 
	final public static String DOMAIN_FIELD						= "DOMAIN_FIELD";			 
	final public static String REMEMBER_ME_FIELD				= "REMEMBER_ME_FIELD";				 
	final public static String PASSWORD_TYPE_FIELD				= "PASSWORD_TYPE_FIELD";		 
	final public static String FIRST_NAME_FIELD					= "FIRST_NAME_FIELD";			 
	final public static String LAST_NAME_FIELD					= "LAST_NAME_FIELD";			 
	final public static String ACCOUNT_STATUS_FIELD				= "ACCOUNT_STATUS_FIELD";		 
	final public static String LAST_ACCESS_FIELD				= "LAST_ACCESS_FIELD";		 
	final public static String PASSWORD_CHANGE_FIELD			= "PASSWORD_CHANGE_FIELD";	 
	final public static String PASSWORD_ATTEMPTS_FIELD			= "PASSWORD_ATTEMPTS_FIELD";		 
	final public static String COMPUTER_NAME_FIELD				= "COMPUTER_NAME_FIELD";		 
	final public static String CREATE_USER_FIELD				= "CREATE_USER_FIELD";			 
	final public static String CREATE_TIMESTAMP_FIELD			= "CREATE_TIMESTAMP_FIELD";	 
	final public static String MODIFY_USER_FIELD				= "MODIFY_USER_FIELD";			  
//	final public static String MODIFY_TIMESTAMP_FIELD			= "MODIFY_TIMESTAMP_FIELD";	 	

	/****************************************************************************
	 * PAYMENT TERM CONSTANTS
	 ****************************************************************************/
	final public static int TERM_1_10_NET_30					= 1;	// TERM_1_10_NET_30			
	final public static int TERM_2_10_NET_30					= 2;	// TERM_2_10_NET_30
	final public static int TERM_NET_30							= 3;	// TERM_NET_30
	final public static int PROX_25TH							= 4;	// PROX_25TH
	final public static int NET_90								= 5;	// NET_90
	
	/****************************************************************************
	 * PROCESSOR SCREEN CONSTANTS
	 ****************************************************************************/	
	final public static String PROCESSOR_SCREEN 				= "PROCESSOR_SCREEN";
	
	/****************************************************************************
	 * PROCESS SCREEN CONSTANTS
	 ****************************************************************************/	
	final public static String PROCESS_SCREEN 					= "PROCESS_SCREEN";
	
	final public static String PROCESS_NAME_FIELD 				= "PROCESS_NAME_FIELD";
	final public static String PROCESS_IDENTIFIER_FIELD 		= "PROCESS_IDENTIFIER_FIELD";
	final public static String TERMINATION_CODE_FIELD 			= "TERMINATION_CODE_FIELD";
	final public static String START_TIMESTAMP_FIELD 			= "START_TIMESTAMP_FIELD";
	final public static String END_TIMESTAMP_FIELD 				= "END_TIMESTAMP_FIELD";
	
	/****************************************************************************
	 * PROCESS STATE CONSTANTS
	 ****************************************************************************/	
	final public static int CREATED 							= 00;
	final public static int WAITING 							= 01;
	final public static int BLOCKED 							= 02;
	final public static int RUNNING 							= 03;
	final public static int TERMINATED 							= 04;
	
	/****************************************************************************
	 * PRODUCT SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String PRODUCT_SCREEN 					= "PRODUCT_SCREEN";
	
	final public static String PRODUCT_ID_FIELD					= "PRODUCT_ID_FIELD";			 
	final public static String DESCRIPTION_FIELD				= "DESCRIPTION_FIELD";		 
	final public static String PRICE_FIELD						= "PRICE_FIELD";	

	/****************************************************************************
	 * PRODUCT DELIVERY TYPES
	 ****************************************************************************/
	final public static int REGULAR_DELIVERY 					= 1;	// REGULAR
	final public static int SPECIAL_DELIVERY 					= 2;	// SPECIAL

	/****************************************************************************
	 * PROFILE SCREEN CONSTANTS
	 ****************************************************************************/	
	final public static String PROFILE_SCREEN 					= "PROFILE_SCREEN";
	
//	final public static String GROUP_ID_FIELD				= "GROUP_ID_FIELD";
//	final public static String USER_ID_FIELD				= "USER_ID_FIELD";
//	final public static String SEQUENCE_FIELD				= "SEQUENCE_FIELD";
//	final public static String MENU_NAME_FIELD				= "MENU_NAME_FIELD";
//	final public static String SCREEN_NAME_FIELD			= "SCREEN_NAME_FIELD";
//	final public static String FIELD_NAME_FIELD				= "FIELD_NAME_FIELD";
	
	final public static String PROFILE_FIELD				= "PROFILE_FIELD";
//	final public static String STATUS_FIELD					= "STATUS_FIELD";
	
	/****************************************************************************
	 * PROPERTIES SCREEN CONSTANTS
	 ****************************************************************************/	
	final public static String PROPERTIES_SCREEN 				= "PROPERTIES_SCREEN";
	
	final public static String PROPERTIES_ID_FIELD				= "PROPERTIES_ID_FIELD";
	
	final public static String PROPERTIES_FILE_FIELD			= "PROPERTIES_FILE_FIELD";

	final public static String DEFAULT_PROPERTIES_FIELD			= "DEFAULT_PROPERTIES_FIELD";
	final public static String PROPERTIES_LOCATION_FIELD		= "PROPERTIES_LOCATION_FIELD";
	
	final public static String INPUT_FILE_NAME_FIELD			= "INPUT_FILE_NAME_FIELD";
	final public static String OUTPUT_FILE_NAME_FIELD			= "OUTPUT_FILE_NAME_FIELD";
	final public static String XML_FORMAT_FIELD					= "XML_FORMAT_FIELD";
	final public static String ENCODING_FIELD					= "ENCODING_FIELD";
	final public static String PATH_FIELD						= "PATH_FIELD";
	final public static String FILE_FIELD						= "FILE_FIELD";
	final public static String PROPERTIES_FIELD					= "PROPERTIES_FIELD";
	final public static String FILE_INPUT_STREAM_FIELD			= "FILE_INPUT_STREAM_FIELD";
	final public static String FILE_OUTPUT_STREAM_FIELD			= "FILE_OUTPUT_STREAM_FIELD";
	final public static String DRIVER_NAME_FIELD				= "DRIVER_NAME_FIELD";
//	final public static String SERVER_NAME_FIELD				= "SERVER_NAME_FIELD";
//	final public static String PORT_NUMBER_FIELD				= "PORT_NUMBER_FIELD";
	final public static String SID_FIELD						= "SID_FIELD";
//	final public static String USERNAME_FIELD					= "USERNAME_FIELD";
//	final public static String PASSWORD_FIELD					= "PASSWORD_FIELD"; 	

	/****************************************************************************
	 * REGRESSION SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String REGRESSION_SCREEN 				= "REGRESSION_SCREEN";
	
	/****************************************************************************
	 * REMOTE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String REMOTE_SCREEN 					= "REMOTE_SCREEN";
	
	/****************************************************************************
	 * SCHEDULE SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String SCHEDULE_SCREEN 					= "SCHEDULE_SCREEN";

	/****************************************************************************
	 * SCREEN PATHS
	 ****************************************************************************/
	final public static String EXECUTIVE_VIEW_SCREEN_PATH		= "client/external/executive/executiveView";
	final public static String INTELLIGENT_ADVISOR_SCREEN_PATH	= "client/external/intelligent/intelligentAdvisor";
	final public static String REGRESSION_SUITE_SCREEN_PATH		= "client/external/regression/regressionSuite";
	
	/****************************************************************************
	 * SCREEN LITERALS
	 ****************************************************************************/
	final public static String EXECUTIVE_VIEW_SCREEN_LITERAL		= "EXECUTIVE_VIEW";
	final public static String INTELLIGENT_ADVISOR_SCREEN_LITERAL	= "INTELLIGENT_ADVISOR";
	final public static String REGRESSION_SUITE_SCREEN_LITERAL		= "REGRESSION_SUITE";
	
	/****************************************************************************
	 * SCREEN SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String SCREEN_SCREEN 				= "SCREEN_SCREEN";
	
//	final public static String ID_FIELD						= "ID_FIELD";
	
//	final public static String GROUP_ID_FIELD				= "GROUP_ID_FIELD";
//	final public static String USER_ID_FIELD				= "USER_ID_FIELD";
//	final public static String SEQUENCE_FIELD				= "SEQUENCE_FIELD";
//	final public static String MENU_NAME_FIELD				= "MENU_NAME_FIELD";
//	final public static String SCREEN_NAME_FIELD			= "SCREEN_NAME_FIELD";
	final public static String CREATE_OP_FIELD				= "CREATE_OP_FIELD";
	final public static String READ_OP_FIELD				= "READ_OP_FIELD";
	final public static String UPDATE_OP_FIELD				= "UPDATE_OP_FIELD";
	final public static String DELETE_OP_FIELD				= "DELETE_OP_FIELD";
//	final public static String CREATE_USER_FIELD			= "CREATE_USER_FIELD";			 
//	final public static String CREATE_TIMESTAMP_FIELD		= "CREATE_TIMESTAMP_FIELD";	 
//	final public static String MODIFY_USER_FIELD			= "MODIFY_USER_FIELD";			 
//	final public static String MODIFY_TIMESTAMP_FIELD		= "MODIFY_TIMESTAMP_FIELD";

	/****************************************************************************
	 * SECURITY SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String SECURITY_SCREEN 					= "SECURITY_SCREEN";

//	final public static String ID_FIELD							= "ID_FIELD";
	
//	final public static String GROUP_ID_FIELD					= "GROUP_ID_FIELD";
//	final public static String USER_ID_FIELD					= "USER_ID_FIELD";
//	final public static String SEQUENCE_FIELD					= "SEQUENCE_FIELD";
//	final public static String MENU_NAME_FIELD					= "MENU_NAME_FIELD";
//	final public static String SCREEN_NAME_FIELD				= "SCREEN_NAME_FIELD";
//	final public static String FIELD_NAME_FIELD					= "FIELD_NAME_FIELD";
//	final public static String FIELD_VISIBLE_FIELD				= "FIELD_VISIBLE_FIELD";
//	final public static String FIELD_EDITABLE_FIELD				= "FIELD_EDITABLE_FIELD";
	
//	final public static String GROUP_ID_FIELD					= "GROUP_ID_FIELD";				 
//	final public static String USER_ID_FIELD					= "USER_ID_FIELD";				 
//	final public static String SEQUENCE_FIELD					= "SEQUENCE_FIELD";				 
//	final public static String USERNAME_FIELD					= "USERNAME_FIELD";			 
//	final public static String PASSWORD_FIELD					= "PASSWORD_FIELD";			 
//	final public static String DOMAIN_FIELD						= "DOMAIN_FIELD";			 
//	final public static String REMEMBER_ME_FIELD				= "REMEMBER_ME_FIELD";				 
//	final public static String PASSWORD_TYPE_FIELD				= "PASSWORD_TYPE_FIELD";		 
//	final public static String FIRST_NAME_FIELD					= "FIRST_NAME_FIELD";			 
//	final public static String LAST_NAME_FIELD					= "LAST_NAME_FIELD";			 
//	final public static String ACCOUNT_STATUS_FIELD				= "ACCOUNT_STATUS_FIELD";		 
//	final public static String LAST_ACCESS_FIELD				= "LAST_ACCESS_FIELD";		 
//	final public static String PASSWORD_CHANGE_FIELD			= "PASSWORD_CHANGE_FIELD";	 
//	final public static String PASSWORD_ATTEMPTS_FIELD			= "PASSWORD_ATTEMPTS_FIELD";		 
//	final public static String COMPUTER_NAME_FIELD				= "COMPUTER_NAME_FIELD";		 
//	final public static String CREATE_USER_FIELD				= "CREATE_USER_FIELD";			 
//	final public static String CREATE_TIMESTAMP_FIELD			= "CREATE_TIMESTAMP_FIELD";	 
//	final public static String MODIFY_USER_FIELD				= "MODIFY_USER_FIELD";			  
	final public static String MODIFY_TIMESTAMP_FIELD			= "MODIFY_TIMESTAMP_FIELD";	 	

	/****************************************************************************
	 * SOAP SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String SOAP_SCREEN 						= "SOAP_SCREEN";
	
	/****************************************************************************
	 * SYSPROPERTY SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String SYSPROPERTY_SCREEN 				= "SYSPROPERTY_SCREEN";
	
//	final public static String PROCESS_NAME_FIELD				= "PROCESS_NAME_FIELD";	
	final public static String PROPERTY_NAME_FIELD				= "PROPERTY_NAME_FIELD";						
	final public static String PROPERTY_VALUE_FIELD				= "PROPERTY_VALUE_FIELD";
	
	/****************************************************************************
	 * TRANSACTION SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String TRANSACTION_SCREEN 				= "TRANSACTION_SCREEN";
	
	/****************************************************************************
	 * VERSION SCREEN CONSTANTS
	 ****************************************************************************/
	final public static String VERSION_SCREEN 					= "VERSION_SCREEN";
	
	final public static String PROJECT_VERSION_FIELD			= "PROJECT_VERSION_FIELD";	
	final public static String PROJECT_VERSION_NAME_FIELD		= "PROJECT_VERSION_NAME_FIELD";
	final public static String SERVER_PLATFORM_FIELD			= "SERVER_PLATFORM_FIELD";						
	final public static String PHYSICAL_ENVIRONMENT_FIELD		= "PHYSICAL_ENVIRONMENT_FIELD";
	
	final public static String SCHEMA_MAJOR_VERSION_FIELD		= "SCHEMA_MAJOR_VERSION_FIELD";
	final public static String SCHEMA_MINOR_VERSION_FIELD		= "SCHEMA_MINOR_VERSION_FIELD";
	final public static String SCHEMA_VERSION_NAME_FIELD		= "SCHEMA_VERSION_NAME_FIELD";
	final public static String SCHEMA_VERSION_DESCRIPTION_FIELD	= "SCHEMA_VERSION_DESCRIPTION_FIELD";
	
	final public static String CODE_MAJOR_VERSION_FIELD			= "CODE_MAJOR_VERSION_FIELD";
	final public static String CODE_MINOR_VERSION_FIELD			= "CODE_MINOR_VERSION_FIELD";
	final public static String CODE_BUILD_VERSION_FIELD			= "CODE_BUILD_VERSION_FIELD";
	final public static String CODE_REVISION_FIELD				= "CODE_REVISION_FIELD";
	final public static String CODE_VERSION_NAME_FIELD			= "CODE_VERSION_NAME_FIELD";
	final public static String CODE_VERSION_DESCRIPTION_FIELD	= "CODE_VERSION_DESCRIPTION_FIELD";

}