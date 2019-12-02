package com.system.language.logger.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.StreamHandler;

public class EventHandler {

	/******************************************************************************/
	/* Create Console Handler													 */
	/******************************************************************************/
	public ConsoleHandler createConsoleHandler () {
			
		ConsoleHandler consoleHandler = null;
			
		try {
		    	
			consoleHandler =  new ConsoleHandler();
				
		} catch (SecurityException e) {
				
			e.printStackTrace();
		}
		    
		    return consoleHandler;
	}
		
    /******************************************************************************/
	/* Create XML Formatted Log File											  */
    /******************************************************************************/
	public FileHandler createXmlFileHandler ( String 	fileName
									 		, boolean 	append
									 		) {
		
		FileHandler xmlFileHandler = null;
		
	    try {
	    	
			xmlFileHandler	= new FileHandler(fileName, append);
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
		}
	    
	    return xmlFileHandler;
	}
	
    /******************************************************************************/
	/* Create XML Formatted Log File											  */
    /******************************************************************************/
	public FileHandler createHtmlFileHandler ( String 	fileName
									 		,  boolean 	append
									 		) {
		
		FileHandler htmlFileHandler = null;
		
	    try {
	    	
			htmlFileHandler	= new FileHandler(fileName, append);
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
		}
	    
	    return htmlFileHandler;
	}
	
	/******************************************************************************/
	/* Create handler for memory file.
	 * > target    - the Handler to which to publish output.
	 * > size      - the number of log records to buffer (must be greater than zero)
	 * > pushLevel - message level to push on
	 */
	/******************************************************************************/
	 public MemoryHandler createMemoryHandler ( Handler		diskFileHandler
											  , int 		recordNumber
											  , Level    	levelValue
											  ) {
				
		MemoryHandler memoryHandler = null;
				
		try {
			    	
			memoryHandler = new MemoryHandler(diskFileHandler, recordNumber, levelValue);
					
		} catch (SecurityException e) {
					
			e.printStackTrace();
		}
			    
		    return memoryHandler;
	}
	 
    /******************************************************************************/
	/* Create a file handler with a limit of 2 megabytes						  */
    /******************************************************************************/
	public FileHandler createRollingLogHandler  ( String 	fileName
												, int 		limitFileSize
												, int 		maximumFileNumbers
												, boolean	append
												) {
		
		FileHandler logHandler = null;
		
	    try {
	    	
            logHandler = new FileHandler(fileName, limitFileSize, maximumFileNumbers, append);
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
		}
	    
	    return logHandler;
	}

	/******************************************************************************/
	/* Create stream handler.
	/******************************************************************************/
	public StreamHandler createStreamHandler (OutputStream outStream) {
					
		StreamHandler streamHandler = null;

		try {
				    	
			streamHandler = new StreamHandler(outStream, new SimpleFormatter());
						
		} catch (SecurityException e) {
						
			e.printStackTrace();
		}
				    
			return streamHandler;
	}	
	
	/******************************************************************************/
	/* Create stream handler.
	/******************************************************************************/
	public SocketHandler createSocketHandler (String host, int port) {
							
		SocketHandler socketHandler = null;

		try {
						    	
			socketHandler = new SocketHandler(host, port);
								
		} catch (SecurityException | IOException e) {
								
			e.printStackTrace();
		}
						    
		return socketHandler;
	}
	
}
/****************************************************************************************/
/****************************************************************************************/   