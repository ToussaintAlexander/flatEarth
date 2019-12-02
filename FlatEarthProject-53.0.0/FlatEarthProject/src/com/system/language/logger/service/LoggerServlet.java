package com.system.language.logger.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.StreamHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.configuration.constants.Screen;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.dao.LoggerDaoImpl;
import com.system.language.logger.dao.LoggerDao;
import com.system.language.logger.model.LoggerBean;

import static com.system.configuration.constants.Table.*;

public class LoggerServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 			id;
	private String			loggerName;				// Type=Logger;
	private String			handlerType;
	private String			fileHandler;			// Type=Handler;	diskFileHandler, needed for memoryHandler	
	private String			serverName;
	private String 			portNumber;
	private String			outputStream;			// Was Object now String
    private String 			fileNamePattern;		// diskFileName
    private short 			fileAppend;
    private int 			maximumDiskFiles;		// maximumFileNumbers 
    private int 			fileLimitSize;
    private int 			maximumRecordBuffer;	// recordNumber		
    private int				filterCode;
    private String			filterValue;
    private int	    		pushLevel; 				// levelValue	
    private String			sourceClass;
    private String			sourceMethodName;
    private String			resourceBundle;
    private int				formatCode; 
    
	private String 			createUser;			 
	private Timestamp 		createTimestamp;	 
	private String 			modifyUser;			 
	private Timestamp 		modifyTimestamp;	 
	
	private boolean  		loggerReady;
	
	public String 			className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public LoggerBean formatLoggerBean (HttpServletRequest request) {
		
		System.out.println("LoggerServlet ---> formatLoggerBean()");
		
		id 						= Integer.valueOf(request.getParameter("loggerId"));
		
		loggerName 				= Logger.getLogger(request.getParameter("loggerName")).getName();
		
		handlerType 			= request.getParameter("handlerType");
		
		fileHandler 			= request.getParameter("fileHandler");
		
		serverName				= request.getParameter("serverName");
		portNumber 				= request.getParameter("portNumber");
		
		outputStream			= request.getParameter("outputStream");
		
		OutputStream actualStrm = new LoggerServlet().formatOutputStream(outputStream); 
		
		fileNamePattern 		= request.getParameter("fileNamePattern");
		
		fileAppend 				= new LoggerServlet().formatFileAppend(request);
		
		maximumDiskFiles 		= Integer.valueOf(request.getParameter("maximumDiskFiles"));
		fileLimitSize 			= Integer.valueOf(request.getParameter("fileLimitSize"));
		maximumRecordBuffer 	= Integer.valueOf(request.getParameter("maximumRecordBuffer"));
		filterCode 				= Integer.valueOf(request.getParameter("filterCode"));
		
//		filterValue 			= stringVector.add(request.getParameter("filterValue"));
		
		filterValue				= null;
		
		pushLevel 				= Integer.valueOf(request.getParameter("pushLevel"));
		
		Level actualLevel		= new LoggerServlet().formatPushLevel(pushLevel); 
		
		sourceClass 			= request.getParameter("sourceClass");
		sourceMethodName 		= request.getParameter("sourceMethodName");
		resourceBundle 			= request.getParameter("resourceBundle");	
		
		formatCode				= Integer.valueOf(request.getParameter("formatCode"));
		
		
		Handler memoryHandler 	= new LoggerServlet().formatMemoryHandler("MemoryFileLog%u.%g.log");
		
		fileHandler 			= new LoggerServlet().formatFileHandler( 1 //handlerType
																	   , memoryHandler
			     													   , serverName
			     													   , portNumber
			     													   , actualStrm
			     													   , fileNamePattern
			     													   , true //fileAppend
			     													   , maximumDiskFiles
			     													   , fileLimitSize
			     													   , maximumRecordBuffer
			     													   , actualLevel
			     													   ).toString();
		
		createUser 				= request.getParameter("createUser");
		createTimestamp 		= Timestamp.valueOf(request.getParameter("createTimestamp"));
		modifyUser 				= request.getParameter("modifyUser");
		modifyTimestamp 		= Timestamp.valueOf(request.getParameter("modifyTimestamp"));
	    
		LoggerBean loggerBean = new LoggerBean (id
											   ,loggerName
											   ,handlerType
											   ,fileHandler
											   ,serverName
											   ,portNumber
											   ,outputStream
											   ,fileNamePattern
											   ,fileAppend
											   ,maximumDiskFiles
											   ,fileLimitSize
											   ,maximumRecordBuffer
											   ,filterCode
											   ,filterValue
											   ,pushLevel
											   ,sourceClass
											   ,sourceMethodName
											   ,resourceBundle
											   ,formatCode
											   ,createUser
											   ,createTimestamp
											   ,modifyUser
											   ,modifyTimestamp
											   );
		
		return loggerBean;

	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public Handler formatMemoryHandler (String	handler) {
		
		Handler memoryHandler = null;
		
		try {
			
			memoryHandler = new FileHandler("MemoryFileLog%u.%g.log");
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
			return null;
		}
		return memoryHandler;
	}
			
	/***********************************************************************************
	 ***********************************************************************************/
	public Handler formatFileHandler (int			handlerType	
								     ,Handler		memoryHandler
								     ,String		serverName
								     ,String		portNumber
								     ,OutputStream	outputStream
									 ,String 		fileNamePattern
									 ,boolean		fileAppend
									 ,int			maximumDiskFiles
									 ,int 			fileLimitSize
									 ,int 			maximumRecordBuffer
									 ,Level    		pushLevel) {
									 
		switch (handlerType) {
		
			case	CONSOLE_HANDLER: 	
				
						return new ConsoleHandler();
						
			case 	XML_HANDLER:		
				
						try {
							return new FileHandler(fileNamePattern, fileAppend);
						} catch (SecurityException | IOException e) {
							e.printStackTrace();
						}
						
			case 	HTML_HANDLER:		
				
						try {
							return new FileHandler(fileNamePattern, fileAppend);
						} catch (SecurityException | IOException e) {
							e.printStackTrace();
						}	
						
			case 	MEMORY_HANDLER:		
				
						System.out.println(" ");
						System.out.println("File Handler = " + memoryHandler);
						System.out.println("Maximum Record Buffer = " + maximumRecordBuffer);
						System.out.println("Push Level = " + pushLevel);
						System.out.println(" ");
						
								// File Handler = null
								// Maximum Record Buffer = 50
								// Push Level = ALL
						
						return  new MemoryHandler(memoryHandler, maximumRecordBuffer, pushLevel);	
						
			case 	ROLLING_HANDLER:	
				
						try {
							return new FileHandler(fileNamePattern, fileLimitSize, maximumDiskFiles, fileAppend);
						} catch (SecurityException | IOException e) {
							e.printStackTrace();
						}
						
			case 	STREAM_HANDLER:		
				
						return new StreamHandler(outputStream, new SimpleFormatter());	
						
			case 	SOCKET_HANDLER:		
						
						try {
							new SocketHandler(serverName, portNumber.length());		//	*** KLUDGE *** 
						} catch (IOException e) {
							e.printStackTrace();
						}
						
			default:					
				
						return new ConsoleHandler();
		}
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public OutputStream formatOutputStream(String inStream) {
		
		OutputStream outputStream = null;
		
		try {
			
			outputStream = new FileOutputStream(inStream);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return outputStream;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public short formatFileAppend (HttpServletRequest request) {
		
		if(request.getParameter("fileAppend").equalsIgnoreCase("Yes")) {
			
			return (short)1;
			
		} else {
			
			return (short)0;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public Level formatPushLevel (int pushLevel) {
		
		Level result = null;
		
		switch (pushLevel) {
		
			case ALL_LEVEL:		result = Level.ALL;
			case FINEST_LEVEL: 	result = Level.FINEST;
			case FINER_LEVEL: 	result = Level.FINER;
			case FINE_LEVEL: 	result = Level.FINE;
			case CONFIG_LEVEL: 	result = Level.CONFIG;
			case INFO_LEVEL: 	result = Level.INFO;
			case WARNING_LEVEL: result = Level.WARNING;	
			case SEVERE_LEVEL: 	result = Level.SEVERE;
			case OFF_LEVEL: 	result = Level.OFF;	
			
			default: 			result = Level.ALL;
	    }	
	    
	    return result;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkLoggerBeanFieldFormat(LoggerBean loggerBean) {
		
		if ((checkLoggerIdFormat			(loggerBean))
		&&  (checkLoggerNameFormat 			(loggerBean))
		&&  (checkHandlerTypeFormat 		(loggerBean))
		&&  (checkFileHandlerFormat 		(loggerBean))
		&&  (checkServerNameFormat 			(loggerBean))
		&&  (checkPortNumberFormat			(loggerBean))
		&&  (checkOutputStreamFormat		(loggerBean))
		&&  (checkFileNamePatternFormat 	(loggerBean))
		&&  (checkFileAppendFormat 			(loggerBean))
		&&  (checkMaximumDiskFilesFormat	(loggerBean))
		&&  (checkFileLimitSizeFormat 		(loggerBean))
		&&  (checkMaximumRecordBufferFormat (loggerBean))
		&&  (checkFilterCodeFormat 			(loggerBean))
		&&  (checkFilterValueFormat 		(loggerBean))
		&&  (checkPushLevelFormat 			(loggerBean))
		&&  (checkSourceClassFormat 		(loggerBean))
		&&  (checkSourceMethodNameFormat 	(loggerBean))
		&&  (checkResourceBundleFormat 		(loggerBean))		
		&&  (checkFormatCodeFormat 			(loggerBean))
		
		&&  (checkCreateUserFormat 			(loggerBean))
		&&  (checkCreateTimestampFormat 	(loggerBean))
		&&  (checkModifyUserFormat 			(loggerBean))
		&&  (checkModifyTimestampFormat 	(loggerBean))) {
			
			return true;
			
		} else {
			
//			return false;										// stub out
			return true;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkLoggerIdFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(LOGGER_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getId()));
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkLoggerNameFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(LOGGER_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getLoggerName()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkHandlerTypeFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(HANDLER_TYPE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getHandlerType()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileHandlerFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILE_HANDLER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
												    ,String.valueOf(loggerBean.getFileHandler()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkServerNameFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(SERVER_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getServerName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPortNumberFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(PORT_NUMBER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
												    ,String.valueOf(loggerBean.getPortNumber()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkOutputStreamFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(OUTPUT_STREAM_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
												    ,String.valueOf(loggerBean.getPortNumber()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileNamePatternFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILE_NAME_PATTERN_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getFileNamePattern());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileAppendFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILE_APPEND_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
											        ,String.valueOf(loggerBean.getFileAppend()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMaximumDiskFilesFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(MAXIMUM_DISK_FILES_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getMaximumDiskFiles()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileLimitSizeFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILE_LIMIT_SIZE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
												    ,String.valueOf(loggerBean.getFileLimitSize()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMaximumRecordBufferFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(MAXIMUM_RECORD_BUFFER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getMaximumRecordBuffer()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFilterCodeFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILTER_CODE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getFilterCode()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFilterValueFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FILTER_VALUE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getFilterValue()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPushLevelFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(PUSH_LEVEL_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getPushLevel()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSourceClassFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(SOURCE_CLASS_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getSourceClass());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSourceMethodNameFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(SOURCE_METHOD_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getSourceMethodName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkResourceBundleFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(RESOURCE_BUNDLE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getResourceBundle());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFormatCodeFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGGER_SCREEN);
		expressionBean.setFieldName(FORMAT_CODE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(loggerBean.getFormatCode()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(LoggerBean loggerBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,loggerBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request
									  ,LoggerBean 			loggerBean
									  ) {
	
		boolean result = false;
		
		LoggerDao loggerDao	= new LoggerDaoImpl();
		
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			 result = (loggerDao.select() != null)? true: false;
			 break;
			
		case INSERT_RECORD:
			 result = loggerDao.insert(loggerBean);
			 break;
			 
		case UPDATE_RECORD:
			 result = loggerDao.update(loggerBean);
			 break;
			
		case DELETE_RECORD:
			 result = loggerDao.delete(loggerBean.getId());
			 break;
			
		default:
			 System.out.println("LoggerServlet ---> Button Not Depressed");
			 result = false;
			 break;
		}
	   
		loggerReady = result;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayLoggerForm (HttpServletRequest  request
								    ,HttpServletResponse response
								    ) {
		
		System.out.println("LoggerServlet ---> redisplayLoggerForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/logger.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showLoggerForm (HttpServletRequest request
							   ,HttpServletResponse response
							   ) {
		
		System.out.println("LoggerServlet ---> Entering showLoggerForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayLoggerTable.jsp");

		try {
			
			rd.include(request, response);
			
		} catch (ServletException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

	  System.out.println("LoggerServlet ---> doGet()");
	  
	  LoggerBean loggerBean = new LoggerServlet().formatLoggerBean(request);
	  
	  if ((loggerBean != null )
	  && new LoggerServlet().checkLoggerBeanFieldFormat(loggerBean)) {
		  performDatabaseAction (request, loggerBean);
	  } else {
		  redisplayLoggerForm (request,response);
		  return;
	  }
	  
	  if (loggerReady)
		  showLoggerForm (request,response);
	  else
		  redisplayLoggerForm (request,response);
    }
}