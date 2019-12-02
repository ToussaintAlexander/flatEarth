package com.system.language.logger.service;

import java.io.IOException;
import java.io.InputStream;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.system.language.logger.model.LoggerBean;

/*
    Best Practices
    
    There is a single global LogManager object that is used to maintain a set 
    of shared state about Loggers and log services.
 
	It is common practice to use the fully qualified name of each class whose
	activity is being logged as a message category because this allows developers
	to fine-tune log settings for each class. 
*/

public class LoggerManager {

	LoggerManager () {
		
		LogManager manager = LogManager.getLogManager();
		
//		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
        //remove all the associated handlers with this manager
        manager.reset();

		InputStream is = LoggerManager.class.getResourceAsStream("/logging.properties");
		
		try {
			
			manager.readConfiguration(is);
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	/******************************************************************************/
	// DAO Method Entry Message
	/******************************************************************************/
	public void logEvent ( 
						   int 				id
					     , Logger 			loggerName
					     , int 				handlerType
					     , Handler			fileHandler
					     , String			serverName
					     , int 				portNumber
					     , String			outputStream
					     , String 			fileNamePattern
					     , boolean 			fileAppend
					     , int 				maximumDiskFiles
					     , int 				fileLimitSize
					     , int 				maximumRecordBuffer
					     , int				filterCode
					     , String			filterValue
					     , int	    		pushLevel
					     , String			sourceClass
					     , String			sourceMethodName
					     , String			resourceBundle
					     , int 				formatCode
					 	 , String 			createUser			 
					 	 , Timestamp 		createTimestamp	 
					 	 , String 			modifyUser			 
					 	 , Timestamp 		modifyTimestamp
						 ) {

		System.out.println("Parent LogEvent ---> Get Properties from Properties File - kinda of - sort of");
		  
		LoggerBean loggerBean = new LoggerBean();
		
		loggerBean.setId(10);	
		
//		loggerBean.setLoggerName(Logger.getLogger(className));	
		
//		loggerBean.setHandlerType(CONSOLE_HANDLER);
		
		loggerBean.setFileHandler(null);						// For Memory Log File Only
		loggerBean.setServerName(null);							// For Socket Handler Only
		loggerBean.setPortNumber("127.0.0.52857");				// For Socket Handler Only
		loggerBean.setOutputStream(null);						// For OutputStream Only
		
		loggerBean.setFileNamePattern(null);					// For Non-Console Messages
		loggerBean.setFileAppend((short)1);						// For Non-Console Messages
		loggerBean.setMaximumDiskFiles(0);						// For Non-Console Messages
		loggerBean.setFileLimitSize(0);							// For Non-Console Messages
		loggerBean.setMaximumRecordBuffer(0);					// For Non-Console Messages
		
//		loggerBean.setFilterCode(MESSAGE_FILTER);
		
//		Vector<String> searchStringVector = retrieveFilterValue(keys);
		
		loggerBean.setFilterValue(null);						// Vector of Strings
		
//		loggerBean.setPushLevel(INFO_LEVEL);					// Was Level now int
		
//		loggerBean.setSourceClass(className);					// Dynamic Input
//		loggerBean.setSourceMethodName(methodName);				// Dynamic Input
		
		loggerBean.setResourceBundle(null);						// TBD
		
//		loggerBean.setFormatCode(PLAIN_FORMAT);
			
		loggerBean.getCreateUser();
		loggerBean.getCreateTimestamp();
		loggerBean.getModifyUser();
		loggerBean.getModifyTimestamp();
			
	}
}