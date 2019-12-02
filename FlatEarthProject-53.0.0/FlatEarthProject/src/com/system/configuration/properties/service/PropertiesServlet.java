package com.system.configuration.properties.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.configuration.constants.Screen;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.service.LogEvent;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.configuration.properties.dao.FilePropertiesDao;
import com.system.configuration.properties.dao.FilePropertiesDaoImpl;
import com.system.configuration.properties.model.PropertiesBean;

import static com.system.configuration.constants.Table.*;

public class PropertiesServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	// General file-access properties
	
	private int 				id;
	
	private String				propertiesFile;
	
	private String 				defaultProperties;
	private String				propertiesLocation;
	
	private String 				inputFileName;
	private String 				outputFileName;
	
	private boolean				xmlFormat;
	
	private String 				encoding;
	private String 				path;
	private File 				file;
	private FileInputStream 	fileInputStream;
	private FileOutputStream 	fileOutputStream;
	
	// Database-related properties
	
	private String 				driverName;
	private String 				serverName;
	private String 				portNumber;
	private String 				sid;
	private String 				userName;
	private String 				password;
	
	// Administrative columns
	
	private String 				createUser;			 
	private Timestamp 			createTimestamp;	 
	private String 				modifyUser;			 
	private Timestamp 			modifyTimestamp;
	
	private boolean  			propertiesReady;
	
	protected LogEvent 			myLog;
	public String 				className = this.getClass().getName();
	
	public Properties 			defaultProps;
	public FileInputStream 		in;
	
	/***********************************************************************************
	 ***********************************************************************************/
	public String loadDefaultProperties(HttpServletRequest	request) { 
		
		defaultProperties = request.getParameter("defaultProperties");
		
		Properties defaultProps = new Properties();
		
		try {
			
			in = new FileInputStream(defaultProperties);
			defaultProps.load(in);
			in.close();
			
		} catch (IOException e) {
			
			System.out.println("Missing loadDefaultProperties");
			e.printStackTrace();
		}
		
		return defaultProperties;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public String loadApplicationProperties(HttpServletRequest request) {
		
		propertiesLocation = request.getParameter("propertiesLocation");
		
		// Create application properties with default
		Properties applicationProps = new Properties(defaultProps);
		
		// Now load properties from last invocation
		try {
			
			in = new FileInputStream(propertiesLocation);	
			applicationProps.load(in);
			in.close();
			
		} catch (IOException e) {
			
			System.out.println("Missing loadApplicationProperties");
			e.printStackTrace();
		}
		
		return propertiesLocation;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public FileInputStream loadFileInputStream (HttpServletRequest request) {
		
		try {
			
			fileInputStream = new FileInputStream(request.getParameter("fileInputStream"));
			System.out.println("hello = " + fileInputStream);
		} catch (FileNotFoundException e) {
			
			System.out.println("loadFileInputStream");
			e.printStackTrace();
		}
		
		return fileInputStream;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public FileOutputStream loadFileOutputStream (HttpServletRequest request) {
		
		try {
			
			fileOutputStream = new FileOutputStream(request.getParameter("fileOutputStream"));
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Missing loadFileOutputStream");
			e.printStackTrace();
		}
		
		return fileOutputStream;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean loadXmlFormat (HttpServletRequest request) {
		
		String xmlFormatStr = request.getParameter("xmlFormat");
		
		xmlFormat = (xmlFormatStr.equalsIgnoreCase("Yes")) ? true : false;

		return xmlFormat;
	}
	
	/**
	 * @throws FileNotFoundException *********************************************************************************
	 ***********************************************************************************/
	public PropertiesBean formatPropertiesBean (HttpServletRequest request) throws FileNotFoundException {
		
		id 					= Integer.valueOf(request.getParameter("id"));
		
		propertiesFile 		= request.getParameter("propertiesFile");

		defaultProperties 	= new PropertiesServlet().loadDefaultProperties(request);
		propertiesLocation	= new PropertiesServlet().loadApplicationProperties(request);
		
		inputFileName 		= request.getParameter("inputFileName");
		outputFileName 		= request.getParameter("outputFileName");
		encoding 			= request.getParameter("encoding");
		
		path 				= request.getParameter("path");
		
		String filesStr		= request.getParameter("file");
		file 				= new File(filesStr);		

//		fileInputStream		= new PropertiesServlet().loadFileInputStream(request);
//		fileOutputStream	= new PropertiesServlet().loadFileOutputStream(request);
	
		String fileInputStream 		= request.getParameter("fileInputStream");
		String fileOutputStream		= request.getParameter("fileOutputStream");
		
		System.out.println("fileInputStream = " + fileInputStream);
		System.out.println("fileOutputStream = " + fileOutputStream);
		
		inputFileName 		= request.getParameter("inputFileName");
		outputFileName 		= request.getParameter("outputFileName");
		encoding 			= request.getParameter("encoding");
		
		xmlFormat			= new PropertiesServlet().loadXmlFormat(request);
		
		path 				= request.getParameter("path");
		
		driverName 			= request.getParameter("driverName");
		serverName 			= request.getParameter("serverName");
		portNumber 			= request.getParameter("portNumber");
		sid 				= request.getParameter("sid");
		userName 			= request.getParameter("userName");
		password 			= request.getParameter("password");
		
		createUser 			= request.getParameter("createUser");
//		createTimestamp 	= Timestamp.valueOf(request.getParameter("createTimestamp"));
		
		// yyyy-mm-dd hh:mm:ss[.fffffffff]
		
		createTimestamp 	= Timestamp.valueOf("2014-2-7 08:59:30.000000");
		
//		System.out.println("createT = " + createTimestamp);
		modifyUser 			= request.getParameter("modifyUser");
//		modifyTimestamp 	= Timestamp.valueOf(request.getParameter("modifyTimestamp"));
		
		modifyTimestamp 	= Timestamp.valueOf("2014-2-7 08:59:30.0");
		
//		System.out.println("modifyT = " + modifyTimestamp);
		
		PropertiesBean propertiesBean = new PropertiesBean( id
												          , propertiesFile
														  , defaultProperties
														  , propertiesLocation
														  , inputFileName
														  , outputFileName
														  , xmlFormat
														  , encoding
														  , path
														  , file
														  , new FileInputStream(fileInputStream)
														  , new FileOutputStream(fileOutputStream)
														  , driverName
														  , serverName
														  , portNumber
														  , sid
														  , userName
														  , password
														  , createUser
														  , createTimestamp
														  , modifyUser
														  , modifyTimestamp
														  );
		
		return propertiesBean;

	} 
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPropertiesBeanFieldFormat(PropertiesBean propertiesBean) {
		
		if ((checkIdFormat					(propertiesBean))
				
		&&  (checkPropertiesFileFormat 		(propertiesBean))	
		
		&&  (checkDefaultPropertiesFormat 	(propertiesBean))
		&&  (checkPropertiesLocationFormat 	(propertiesBean))
		&&  (checkInputFileNameFormat 		(propertiesBean))
		&&  (checkOutputFileNameFormat 		(propertiesBean))
		&&  (checkXmlFormat 				(propertiesBean))
		&&  (checkEncodingFormat			(propertiesBean))
		&&  (checkPathFormat 				(propertiesBean))
		&&  (checkFileFormat 				(propertiesBean))
		&&  (checkFileInputStreamFormat 	(propertiesBean))
		&&  (checkFileOutputStreamFormat	(propertiesBean))
		&&  (checkDriverNameFormat 			(propertiesBean))
		&&  (checkServerNameFormat 			(propertiesBean))
		&&  (checkPortNumberFormat 			(propertiesBean))
		&&  (checkSidFormat 				(propertiesBean))
		&&  (checkUserNameFormat 			(propertiesBean))
		&&  (checkPasswordFormat 			(propertiesBean))
		&&  (checkCreateUserFormat 			(propertiesBean))
		&&  (checkCreateTimestampFormat 	(propertiesBean))
		&&  (checkModifyUserFormat 			(propertiesBean))
		&&  (checkModifyTimestampFormat 	(propertiesBean))) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(PROPERTIES_ID_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,String.valueOf(propertiesBean.getId()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPropertiesFileFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(PROPERTIES_FILE_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,String.valueOf(propertiesBean.getPropertiesFile()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDefaultPropertiesFormat (PropertiesBean propertiesBean) {
	
		ExpressionDao expressionDao = new ExpressionDaoImpl();
	
		ExpressionBean expressionBean = new ExpressionBean();
	
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(DEFAULT_PROPERTIES_FIELD);
	
		return expressionDao.validateScreenField(expressionBean
													,String.valueOf(propertiesBean.getId()));
	}

	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPropertiesLocationFormat (PropertiesBean propertiesBean) {
	
		ExpressionDao expressionDao = new ExpressionDaoImpl();
	
		ExpressionBean expressionBean = new ExpressionBean();
	
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(PROPERTIES_LOCATION_FIELD);
	
		return expressionDao.validateScreenField(expressionBean
													,String.valueOf(propertiesBean.getId()));
	}

	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkInputFileNameFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(INPUT_FILE_NAME_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getInputFileName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkOutputFileNameFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(OUTPUT_FILE_NAME_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getOutputFileName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkXmlFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(XML_FORMAT_FIELD);
		
		String xmlFormatStr = (propertiesBean.isXmlFormat()) ? "Yes" : "No";
		
		return expressionDao.validateScreenField(expressionBean, xmlFormatStr);
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkEncodingFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(ENCODING_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getEncoding());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPathFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(PATH_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getPath().toString());
	}
	
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(FILE_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getFile().toString());
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileInputStreamFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(FILE_INPUT_STREAM_FIELD);
		System.out.println(propertiesBean);
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getFileInputStream().toString());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFileOutputStreamFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(FILE_OUTPUT_STREAM_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getFileOutputStream().toString());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDriverNameFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(DRIVER_NAME_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getDriverName());
	}
	
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkServerNameFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(SERVER_NAME_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getServerName());
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPortNumberFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(PORT_NUMBER_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getPortNumber());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSidFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROPERTIES_SCREEN);
		expressionBean.setFieldName(SID_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getSid());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUserNameFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(USERNAME_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getUserName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPasswordFormat (PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(PASSWORD_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getPassword());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(PropertiesBean propertiesBean) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionDao.validateScreenField(expressionBean
													,propertiesBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 * Remember:
	 * 
	 * The Read Function passes the location of the Properties File on disk
	 * so we can load all the properties.
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request
									  ,PropertiesBean 		propertiesBean) {
	
		@SuppressWarnings("unused")
		LogEvent inLog = null;
		boolean result = false;
		
		@SuppressWarnings("unused")
		FilePropertiesDao propertiesDao = new FilePropertiesDaoImpl();
		
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:	
//			result = (propertiesDao.readProperties(propertiesBean) != null)? true: false;
			break;
			
		case INSERT_RECORD:
//			 result = propertiesDao.createProperties(propertiesBean);
			 break;
			 
		default:
			System.out.println("PropertieServlet ---> Button Not Depressed");
			result = false;
			break;
		}
	   
		propertiesReady = result;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayPropertiesForm (HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("PropertiesServlet ---> redisplayPropertiesForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/properties.jsp");

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
	public void showPropertiesForm (HttpServletRequest request,HttpServletResponse response) {
		
//		System.out.println("PropertiesServlet ---> Entering showPropertiesForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayPropertiesFile.jsp");

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
    public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  PropertiesBean propertiesBean = new PropertiesServlet().formatPropertiesBean(request);
	  
	  if ((propertiesBean != null )
	  && new PropertiesServlet().checkPropertiesBeanFieldFormat(propertiesBean)) {
		  performDatabaseAction (request, propertiesBean);
	  } else {
		  redisplayPropertiesForm (request,response);
		  return;
	  }
	  
	  if (propertiesReady)
		  showPropertiesForm (request,response);
	  else
		  redisplayPropertiesForm (request,response);
    }
}