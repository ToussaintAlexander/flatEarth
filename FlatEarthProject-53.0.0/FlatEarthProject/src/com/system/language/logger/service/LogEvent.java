package com.system.language.logger.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.system.language.logger.service.LogFormatter;
import com.system.language.message.dao.MessageDao;
import com.system.language.message.dao.MessageDaoImpl;
import com.system.language.message.model.MessageBean;
import com.system.configuration.constants.Message;
import com.system.language.logger.model.LoggerBean;
import com.system.language.logger.service.EventHandler;
import com.system.security.authentication.password.model.PasswordBean;

import static com.system.configuration.constants.Table.*;

public class LogEvent {

@SuppressWarnings("unused")
private String myClassName;
@SuppressWarnings("unused")
private String myProcName;
@SuppressWarnings("unused")
private int myLogLevel;

/*******************************************************************************************	
  		loggerBean.setFileHandler(null);						// For Memory Log File Only
		loggerBean.setServerName(null);							// For Socket Handler Only
		loggerBean.setPortNumber(0);							// For Socket Handler Only
		loggerBean.setOutputStream(null);						// For OutputStream Only
		
		loggerBean.setFileNamePattern(null);					// For Non-Console Messages
		loggerBean.setFileAppend(false);						// For Non-Console Messages
		loggerBean.setMaximumDiskFiles(0);						// For Non-Console Messages
		loggerBean.setFileLimitSize(0);							// For Non-Console Messages
		loggerBean.setMaximumRecordBuffer(0);					// For Non-Console Messages
****************************************************************************************/
	
	public LogEvent () {}

	public LogEvent ( String 	myClassName
			        , String 	myProcName
			        , int		myLogLevel
			        ) {
	
		this.myClassName = myClassName;
		this.myProcName	 = myProcName;
		this.myLogLevel  = myLogLevel;
		
	}
	
	public void logTextEvent (String className
						     ,String processName
						     ,String item
						     ,int severity
						     )
	{
		
	}	
	
	public void logException (String item1
							 ,String item2
							 ,Exception exception
							 ,String item3
							 ,int severity
							 ) {
		
	}
	
	
	private static Class<LogEvent> cls = LogEvent.class;

	/******************************************************************************
	 * Called by Expression Method
	 *  
	 * [msg id] Field [xxxxxxxx] on Screen [xxxxxxxx] with Value [xxxxxxxx] Validated 
	 * Successfully Using Expression: [xxxxxxxx].
	 *****************************************************************************/	
	public String replaceMessageXXX(String 	message1
								   ,String 	fieldName
								   ,String 	screenName
								   ,String 	fieldValue
								   ,String 	expression
									) {
		
//		System.out.println("LogEvent --> replaceMessageXXX");
		
		message1 = message1.replace("fieldName"		, fieldName);
		message1 = message1.replace("screenName"	, screenName);
		message1 = message1.replace("fieldValue"	, fieldValue);
		message1 = message1.replace("expression"	, expression);
		
		return message1;
	}
	
	/******************************************************************************
	 * Expression Validation Execution
	 ******************************************************************************/
	synchronized public void logEvent (
								        String		className
								      , String		methodName
									  , int			id
						 			  , String		screenName
						 			  , String		fieldName
						 			  , String		fieldValue
						 			  , String		expression
						 			  , boolean		result
						 			  , int 		messageId
						 			  ) {	
		
//		System.out.println("LogEvent --> logEvent");
		 
		@SuppressWarnings("unused")
		LogEvent log = null;
			
		Vector<String> messages = new Vector<String>();
		
		Logger logger = Logger.getLogger(cls.getPackage().toString());
		 
		logger = Logger.getLogger(logger.getName());
		 
		logger.setUseParentHandlers	(false);
		 
		LoggerBean loggerBean = new LoggerBean();
		
		loggerBean.setLoggerName  (logger.toString());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);
		 
		ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();
    	 
		consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));
       	 
		logger.addHandler(consoleHandler); 
		 
		//MessageDao messageDao = new MessageDaoImpl(MESSAGE_TABLE, log);
		MessageBean messageBean = new MessageBean();
		messageBean.setId(messageId);
		String answer = new MessageDaoImpl().selectMessageById(messageBean.getId()).getDescription(); // bad - called logEvent recursion !!!
		
//		System.out.println("Answer = " + answer);
		
		String message1 = className + " " + methodName + " " + messageId + " " + answer;
			
		String message = replaceMessageXXX(message1,fieldName,screenName,fieldValue,expression);
		
		messages.clear();
		messages.add(message);
		Enumeration<String> e = messages.elements();
		
		while(e.hasMoreElements()){
			logger.log(Level.INFO,  e.nextElement());	
		}
		
		consoleHandler.flush();
		consoleHandler.close();
		
		logger.removeHandler(consoleHandler);
		
	}
	
	/******************************************************************************
	 * Called by logEvent
	 * 
	 * For Password Rules Validation
	 ******************************************************************************/	
	public String replaceMessage( int				messageId
								 ,int				dmlResult
								 ,String 			message1
								 ,PasswordBean		passwordBean
								 ) {
		
		message1 = message1.replace("userName"	, passwordBean.getUsername());
		message1 = message1.replace("domain"	, passwordBean.getDomain());
		
		String statusStr 			= null;
		String typeStr				= null;
		String lastAccessStr		= null;
		String passwordChangeStr	= null;
		
		switch (passwordBean.getAccountStatus()) {
			case ACTIVE_STATUS:		statusStr = "Active";		break;
			case INACTIVE_STATUS:	statusStr = "Inactive";		break;
			case FROZEN_STATUS:		statusStr = "Frozen";		break;
			case DELETE_STATUS:		statusStr = "Delete";		break;
		}
		
		switch (passwordBean.getPasswordType()) {
			case PERMANENT_TYPE:	typeStr = "Permanent";		break;
			case TEMPORARY_TYPE:	typeStr = "Temporary";		break;
	}
		
		switch (messageId) {
		
			case PASSWORD_ACCOUNT_STATUS:
				
				message1 = message1.replace("status", statusStr);
				break;
						
			case PASSWORD_ACCOUNT_TYPE: 
				
				message1 = message1.replace("type",typeStr);
				break;
				
			case PASSWORD_GROUP_ITEMS:
				
				lastAccessStr 	  = passwordBean.getLastAccess().toString();
				passwordChangeStr = passwordBean.getPasswordChange().toString();
				
				message1 = message1.replace("lastAccess"	, lastAccessStr);
				message1 = message1.replace("passwordChange", passwordChangeStr);
				break;
				
			case PASSWORD_LAST_ACCESS: 	
				
				lastAccessStr = passwordBean.getLastAccess().toString();
				
				message1 = message1.replace("status", statusStr);
				message1 = message1.replace("lastAccess", lastAccessStr);
				break;
				
			case PASSWORD_NOT_FOUND:
				
				break;
				
			case PASSWORD_LAST_CHANGE: 		
				
				passwordBean.getPasswordChange().toString();
				message1 = message1.replace("lastChange", passwordBean.getPasswordChange().toString());
				break;
				
			case PASSWORD_FAILED_ATTEMPTS: 			 
		
				message1 = message1.replace("attempts"	,String.valueOf(passwordBean.getPasswordAttempts()));
				message1 = message1.replace("status"	, statusStr);
				break;
				
			case PASWORD_CHANGE_SUCCESS: 	
				
				break;
				
			case PASWORD_CHANGE_ERROR: 	
				
				break;
				
			default:
				
				message1 = message1.replace("status"	, statusStr);
				message1 = message1.replace("type"		, typeStr);
				message1 = message1.replace("lastAccess", String.valueOf(passwordBean.getLastAccess()));
				message1 = message1.replace("status"	, statusStr);
				message1 = message1.replace("attempts"	, String.valueOf(passwordBean.getPasswordAttempts()));
				break;		
				
		}
		
		return message1;
	}
	
	/******************************************************************************/
	// Password Rules Logging
	/******************************************************************************/
	synchronized public void logEvent ( String			className
						 			  , String			methodName
						 			  , String			tableName
						 			  , String			queryString
						 			  , PasswordBean	passwordBean			
						 			  , int				messageId	// PASSWORD_ACCOUNT_STATUS
						 			  , int			  	dmlResult	// TABLE_SELECTION_SUCCESS
						 			  ) {	
		 
		@SuppressWarnings("unused")
		LogEvent log = null;
		
		Vector<String> messages = new Vector<String>();
		
		LoggerBean loggerBean = new LoggerBean();
		 
		Logger logger = Logger.getLogger(cls.getPackage().toString());
		 
		logger.setUseParentHandlers	(false);
		 
		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);
		 
    	ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();
    	 
       	consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));
       	 
		logger.addHandler(consoleHandler); 
		 
		MessageDao messageDao = new MessageDaoImpl();
		MessageBean messageBean = new MessageBean();
		messageBean.setId(messageId);
		String answer = messageDao.selectMessageById(messageBean.getId()).getDescription();
			
		String message1 = className + " " + methodName + " " + messageId + " " + answer;
			
		String message = replaceMessage(messageId,dmlResult,message1,passwordBean);
		
		messages.clear();
		messages.add(message);
		
		Enumeration<String> e = messages.elements();

		while(e.hasMoreElements()){
			logger.log(Level.INFO,  e.nextElement());	
		}
		
		consoleHandler.flush();
		consoleHandler.close();
		
		logger.removeHandler(consoleHandler);
		
	}
	
	/******************************************************************************
	 * Called by Expression Method
	 *  
	 * [msg id] Field [xxxxxxxx] on Screen [xxxxxxxx] with Value [xxxxxxxx] Validated 
	 * Successfully Using Expression: [xxxxxxxx].
	 *****************************************************************************/	
	public String replaceMessageX(String 	message
								 ,String 	tableName
								 ,String	primaryKey 	
								 ) {
		
		message = message.replace("tableName"	, tableName);
		message = message.replace("primaryKey"	, primaryKey);
		
		return message;
	}
	
	/******************************************************************************/
	// Successful DML Statement Execution
	/******************************************************************************/
	synchronized public void logEvent ( String			className
						 			  , String			methodName
						 			  , String			tableName
						 			  , String			queryString
						 			  , String			primaryKey
						 			  , int			  	messageId
						 			  ) {	
		 
		@SuppressWarnings("unused")
		LogEvent log = null;
		
		Vector<String> messages = new Vector<String>();
		
		LoggerBean loggerBean = new LoggerBean();
		 
		Logger logger = Logger.getLogger(cls.getPackage().toString());
		 
		logger.setUseParentHandlers	(false);
		 
		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);
		 
    	ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();
    	 
       	consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));
       	 
		logger.addHandler(consoleHandler); 
		 
		MessageDao messageDao = new MessageDaoImpl();
		MessageBean messageBean = new MessageBean();
		messageBean.setId(messageBean.getId());
		String answer = messageDao.selectMessageById(messageBean.getId()).getDescription();
		
		String template = replaceMessageX(answer,tableName,primaryKey);
		
		String message1 = className + " " + methodName + " " + messageId + " " + template;
		
		messages.clear();
		messages.add(message1);
		
		Enumeration<String> e = messages.elements();

		while(e.hasMoreElements()){
			logger.log(Level.INFO,  e.nextElement());	
		}
		
		consoleHandler.flush();
		consoleHandler.close();
		
		logger.removeHandler(consoleHandler);
		
	}
	
	/******************************************************************************/
	// SQL Warning on DML Statement Execution
	//
	// This will accept both:
	//
	//		SQLWarning 	statementWarnings
	//		SQLWarning 	resultsetWarning
	/******************************************************************************/
	synchronized public void logEvent ( String			className
			 			 			  , String			methodName
			 			 			  , String			tableName
			 			 			  , String			queryString
			 			 			  , String			primaryKey
			 			 			  , SQLWarning		sqlWarning
			 			 			  , int				messageId
			 						  ) {	
		
		System.out.println("LogEvent ---> SQL Warning on DML Statement Executionz");
		System.out.println("=======================================");
		System.out.println("LogEvent ---> className = " + className);
		System.out.println("LogEvent ---> methodName = " + methodName);
		System.out.println("LogEvent ---> tableName = " + tableName);
		System.out.println("LogEvent ---> queryString = " + queryString.substring(0, 10));
		System.out.println("LogEvent ---> primaryKey = " + primaryKey);
		System.out.println("LogEvent ---> sqlWarning = " + sqlWarning);
		System.out.println("LogEvent ---> messageId = " + messageId);		
		System.out.println("=======================================");
		
		String message1 = null;
		
		Vector<String> messages = new Vector<String>();
		
		LoggerBean loggerBean = new LoggerBean();
		 
		Logger logger = Logger.getLogger(cls.getPackage().toString());
		 
		logger.setUseParentHandlers	(false);
		 
		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);
		 
    	ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();
    	 
    	String filterValue1 = "LogEvent";
    	String filterValue2 = "Class";
    	String filterValue3 = "Query";
    	
    	Message messageSearch = new Message ();
    	
    	messageSearch.getStringVector().add(filterValue1);
    	messageSearch.getStringVector().add(filterValue2);
    	messageSearch.getStringVector().add(filterValue3);
    	
//    	loggerBean.setFilterValue(messageSearch);
    	
//    	consoleHandler.setFilter(new LogFilter().getFilter(loggerBean.getFilterCode(), loggerBean.getFilterValue()));
    	 
       	consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));
       	 
		logger.addHandler(consoleHandler); 
		 
		if (sqlWarning != null) {
			String warningMessage = sqlWarning.getMessage();
			String warningSQLState = sqlWarning.getSQLState();
			int warningErrorCode = sqlWarning.getErrorCode();
			message1 = "Statement warning : " + warningErrorCode +" Message : " + warningMessage + " SQL state " + warningSQLState;
			sqlWarning = sqlWarning.getNextWarning();
		}

		messages.add(message1);

//		Enumeration<String> e = messages.elements();
		
//		System.out.println("hello c");
//		while(e.hasMoreElements()){
//			logger.log(Level.INFO,  e.nextElement());	
//		}
//		System.out.println("hello d");
		
		consoleHandler.flush();
		consoleHandler.close();
		 
		logger.removeHandler(consoleHandler);
		 
	}
	
	/******************************************************************************/
	// SQL Exception on DML Statement Execution
	/******************************************************************************/
	synchronized public void logEvent ( String			className
			 			 		      , String			methodName
			 			 		      , String			tableName
			 			 		      , SQLException	sqe
			 			 		      , String			queryString
			 			 		      , String			tableRowKey
			 			 		      , int				messageId
			 						  ) {	

		System.out.println("LogEvent ---> SQL Exception on DML Statement ExecutionXXX");
		
		System.out.println("========================================");
		System.out.println("LogEvent ---> className      = " + className);
		System.out.println("LogEvent ---> methodName     = " + methodName);
		System.out.println("LogEvent ---> tableName      = " + tableName);
		System.out.println("LogEvent ---> sqe Message    = " + sqe.getMessage());
		System.out.println("LogEvent ---> sqe Error Code = " + sqe.getErrorCode());
		System.out.println("LogEvent ---> sqe SQL State  = " + sqe.getSQLState());
		System.out.println("LogEvent ---> queryString    = " + queryString.subSequence(0, 25));
//		System.out.println("LogEvent ---> queryString    = " + queryString);
		System.out.println("LogEvent ---> tableRowKey    = " + tableRowKey);
		System.out.println("LogEvent ---> messageId      = " + messageId);
		System.out.println("========================================");
		
		Vector<String> messages = new Vector<String>();
		
		LoggerBean loggerBean = new LoggerBean();
		 
		Logger logger = Logger.getLogger(cls.getPackage().toString());
		 
		logger.setUseParentHandlers	(false);
		 
		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);
		 
    	ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();
    	 
    	String filterValue1 = "LogEvent";
    	String filterValue2 = "Class";
    	String filterValue3 = "Query";
    	
    	Message messageSearch = new Message ();
    	
    	messageSearch.getStringVector().add(filterValue1);
    	messageSearch.getStringVector().add(filterValue2);
    	messageSearch.getStringVector().add(filterValue3);
    	
//    	loggerBean.setFilterValue(messageSearch);
    	
//   	consoleHandler.setFilter(new LogFilter().getFilter(loggerBean.getFilterCode(), loggerBean.getFilterValue()));
    	 
       	consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));
       	 
		logger.addHandler(consoleHandler); 
		 
		String message1 = "SQL Exception Get Error Code  = " + sqe.getErrorCode();
		String message2 = "SQL Exception Get SQL State   = " + sqe.getSQLState();
		String message3 = "SQL Exception Get Message 	 = " + sqe.getMessage().substring(11, sqe.getMessage().length());
		
		messages.add(message1);
		messages.add(message2);
		messages.add(message3);
		
		Enumeration<String> e = messages.elements();

		while(e.hasMoreElements()){
			logger.log(Level.INFO,  e.nextElement());	
		}
		
		consoleHandler.flush();
		consoleHandler.close();
		
		logger.removeHandler(consoleHandler);
		
	}
	
	/******************************************************************************
	 *****************************************************************************/	
	public String replaceMessage(String 	className
					            ,String		methodName
								,String 	propertyName
								,String 	propertyValue
								,int		messageId
								) {
		
		String message = new String("");
		
		message = message.replace(propertyName	, propertyValue);
		
		StringBuffer message1 = new StringBuffer(message);
		
		String answer = " 5092  2014-03-09 07:43:48  7704@PB288L7  *PROPERTY.1.00  INFO  "
				      + className
				      + " "
				      + methodName 
				      + " "
			          + messageId 
			          + " " 
			          + message1;
		
		return answer;
		
	}
	
	/******************************************************************************
	* Log Property Values
	******************************************************************************/
	public void logEvent  ( String 	className
						  , String	methodName
						  , String	propertyName
						  , String 	propertyValue
			 			  , int     messageId
			 			  ) {	
		
//		LogEvent log = null;
//		Vector<String> messages = new Vector<String>();

		LoggerBean loggerBean = new LoggerBean();

		Logger logger = Logger.getLogger(cls.getPackage().toString());

		logger.setUseParentHandlers	(false);

		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);

		ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();

		consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));

		logger.addHandler(consoleHandler); 

//		MessageDao messageDao = new MessageDaoImpl(MESSAGE_TABLE, log);
		MessageBean messageBean = new MessageBean();
		messageBean.setId(messageId);
//		String answer = messageDao.readMessage(messageBean).getDescription();
//		String message1 = className + " " + methodName + " " + messageId + " " + answer;
		
		String messageOut = replaceMessage(className,methodName,propertyName, propertyValue,messageId);
		
		logger.log(Level.INFO,messageOut);	
		
		consoleHandler.flush();
		consoleHandler.close();

		logger.removeHandler(consoleHandler);
		
	}
	
	/******************************************************************************
	* Log Property Values
	******************************************************************************/
	public void logEvent  ( String 		className
						  , String		methodName
						  , File		propertiesFile
						  , IOException ioe
						  , String 		propertyMethod
			 			  , String		primaryKey
			 			  , int     	messageId
			 			  ) {	
		
//		LogEvent log = null;
//		Vector<String> messages = new Vector<String>();

		LoggerBean loggerBean = new LoggerBean();

		Logger logger = Logger.getLogger(cls.getPackage().toString());

		logger.setUseParentHandlers	(false);

		loggerBean.setLoggerName  (logger.getName());
		loggerBean.setFilterCode  (MESSAGE_FILTER);
//		loggerBean.setFilterValue (null);
		loggerBean.setFormatCode  (PLAIN_FORMAT);

		ConsoleHandler consoleHandler = new EventHandler().createConsoleHandler();

		consoleHandler.setFormatter(new LogFormatter().getFormatter(loggerBean.getFormatCode()));

		logger.addHandler(consoleHandler); 

//		MessageDao messageDao = new MessageDaoImpl(MESSAGE_TABLE, log);
		MessageBean messageBean = new MessageBean();
		messageBean.setId(messageId);
//		String messageIn = messageDao.readMessage(messageBean).getDescription();
		
//		String messageOut = replaceMessage(className,methodName,propertiesFile,propertyName,propertyValue,driverName,messageId);
		
//		System.err.println(messageOut);
		
//		logger.log(Level.INFO,answer);	
		
		consoleHandler.flush();
		consoleHandler.close();

		logger.removeHandler(consoleHandler);
		
	}
	
}