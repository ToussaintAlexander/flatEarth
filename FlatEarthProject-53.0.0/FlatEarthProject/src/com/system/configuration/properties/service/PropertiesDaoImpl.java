package com.system.configuration.properties.service;

import static com.system.configuration.constants.Table.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Properties;

import com.system.configuration.properties.model.PropertiesBean;
import com.system.language.logger.service.LogEvent;

public class PropertiesDaoImpl implements PropertiesDao {

	public Class<?> className	= this.getClass();
	public String classNameStr	= className.getSimpleName().toString();
	
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public boolean createProperties(PropertiesBean propertiesBean) {
		
		boolean result = false;
		
		Properties properties = new Properties();
		
		File propertiesFile = null;
			
		properties = setPropertyValues(propertiesBean);
			
		propertiesFile = new File(propertiesBean.getPropertiesLocation());
			
		OutputStream outputStream = createOutputStream(propertiesBean,propertiesFile);
			
		if (outputStream != null) {
			formatPropertiesFile(propertiesBean,properties,outputStream,propertiesFile);
			
			closeOutputStream (propertiesBean,outputStream,propertiesFile);
		}
		
		return result;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public Properties setPropertyValues(PropertiesBean propertiesBean) {
	
		Properties properties = new Properties();
		
		properties.setProperty("propertiesId"		, Integer.toString(propertiesBean.getId()));
		
		properties.setProperty("propertiesFile"		, propertiesBean.getPropertiesFile()				);
		
		properties.setProperty("defaultProperties"	, propertiesBean.getDefaultProperties()				);
		properties.setProperty("propertiesLocation"	, propertiesBean.getPropertiesLocation()			);
		
		properties.setProperty("inputFileName"		, propertiesBean.getInputFileName()					);
		properties.setProperty("outputFileName"		, propertiesBean.getOutputFileName()				);
		
		String xmlFormatStr = (propertiesBean.isXmlFormat()) ? "Yes": "No";
		
		properties.setProperty("xmlFormat"			, xmlFormatStr										);
		
		properties.setProperty("encoding"			, propertiesBean.getEncoding()						);
		properties.setProperty("path"				, propertiesBean.getPath().toString()				);
		properties.setProperty("file"				, propertiesBean.getFile().toString()				);
		properties.setProperty("fileInputStream"	, propertiesBean.getFileInputStream().toString()	);
		properties.setProperty("fileOutputStream"	, propertiesBean.getFileOutputStream().toString()	);
		properties.setProperty("driverName"			, propertiesBean.getDriverName()					);
		properties.setProperty("serverName"			, propertiesBean.getServerName()					);
		properties.setProperty("portNumber"			, propertiesBean.getPortNumber()					);
		properties.setProperty("sid"				, propertiesBean.getSid()							);
		properties.setProperty("userName"			, propertiesBean.getUserName()						);
		properties.setProperty("password"			, propertiesBean.getPassword()						);
		
		properties.setProperty("createUser"			, propertiesBean.getCreateUser()					);
		properties.setProperty("createTimestamp"	, propertiesBean.getCreateTimestamp().toString()	);
		properties.setProperty("modifyUser"			, propertiesBean.getModifyUser()					);
		properties.setProperty("modifyTimestamp"	, propertiesBean.getModifyTimestamp().toString()	);
		
		return properties;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public OutputStream createOutputStream (PropertiesBean 	propertiesBean
										   ,File 			propertiesFile) {
		
		OutputStream outputStream = null;
		
		try {
			
			outputStream = new FileOutputStream(propertiesFile);
			
			new LogEvent().logEvent (classNameStr
				    				,"createOutputStream"
				    				,propertiesFile.toString()
				    				,"store/storeToXML"
				    				,String.valueOf(propertiesBean.getId())
				    				,CREATE_OUTPUT_STREAM_SUCCESS
									);
			
		} catch (FileNotFoundException e) {
			
			new LogEvent().logEvent (classNameStr
								    ,"createOutputStream"
								    ,propertiesFile
								    ,e
								    ,"store/storeToXML"
								    ,String.valueOf(propertiesBean.getId())
								    ,CREATE_OUTPUT_STREAM_ERROR
									);
		}
		
		return outputStream;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public boolean formatPropertiesFile (PropertiesBean 	propertiesBean
									    ,Properties 		properties
									    ,OutputStream 		outputStream
									    ,File				propertiesFile) {

		boolean result = false;
		
		if (propertiesBean.isXmlFormat() ) {
			
			result = handleXmlFormat(propertiesBean
									,properties
									,outputStream
									,propertiesFile
									);
			
		} else {
			
			result = handlePlainFormat(propertiesBean
									  ,properties
									  ,outputStream
									  ,propertiesFile
									  );
		}
		
		return result;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public boolean handleXmlFormat(PropertiesBean 	propertiesBean
							      ,Properties 		properties
							      ,OutputStream 	outputStream
							      ,File				propertiesFile) {
		
		boolean result = false;
		
		try {
			
			properties.storeToXML(outputStream, "This is an optional XML header comment string");
			
			result = true;
			
			new LogEvent().logEvent (classNameStr
									,"formatPropertiesFile"
									,propertiesFile.toString()
									,"store/storeToXML"
									,String.valueOf(propertiesBean.getId())
									,PROPS_WRITE_XML_FORMAT_SUCCESS 
									);
			
		} catch (IOException ioe) {

			result = false;
			
			new LogEvent().logEvent (classNameStr
									,"createProperties"
									,propertiesFile
									,ioe
									,"store/storeToXML"
									,String.valueOf(propertiesBean.getId())
									,PROPS_WRITE_XML_FORMAT_ERROR 
									);
			
		}
		
		return result;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public boolean handlePlainFormat(PropertiesBean	propertiesBean
		      					    ,Properties 	properties
		      					    ,OutputStream 	outputStream
		      					    ,File			propertiesFile) { 

		boolean result = false;
		
		try {
			
			properties.store(outputStream, "This is an optional Regular header comment string");
			
			result = true;
			
			new LogEvent().logEvent (classNameStr
									,"formatPropertiesFile"
									,propertiesFile.toString()
									,"store/storeToXML"
									,String.valueOf(propertiesBean.getId())
									,PROPS_WRITE_PLAIN_FORMAT_SUCCESS 
									);
			
		} catch (IOException ioe) {

			result = false;
			
			new LogEvent().logEvent (classNameStr
									,"createProperties"
									,propertiesFile
									,ioe
									,"store/storeToXML"
									,String.valueOf(propertiesBean.getId())
									,PROPS_WRITE_PLAIN_FORMAT_ERROR
									);
			
		}
		
		return result;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public void closeOutputStream (PropertiesBean 	propertiesBean
								  ,OutputStream 	os
								  ,File 			propertiesFile) {
		
		try {
			
			os.close();
			
			new LogEvent().logEvent (classNameStr
									,"closeOutputStream"
									,propertiesFile.toString()
									,"Properties"
									,String.valueOf(propertiesBean.getId())
									,CLOSE_OUTPUT_STREAM_SUCCESS
									);
			
		} catch (IOException ioe) {
			
			new LogEvent().logEvent (classNameStr
									,"closeOutputStream"
									,propertiesFile
									,ioe
									,"Properties"
									,String.valueOf(propertiesBean.getId())
									,CLOSE_OUTPUT_STREAM_ERROR
									);
			
		}
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public PropertiesBean readProperties(PropertiesBean propertiesBeanIn) {
		 
		Properties props = new Properties();
		PropertiesBean propertiesBeanOut = null;
		InputStream is = null;
		 
		is = loadPropertiesFromCurrentDirectory(propertiesBeanIn);  // 440
		 
//		if (is != null) {
			
//			propertiesBeanOut = loadPropertiesFile(propertiesBeanIn,props,is);  // 460
			
//		} else {
			 
//			is = loadPropertiesFromClasspath(propertiesBeanIn);
			 
//			if (is == null) {
				  
				propertiesBeanOut = loadDefaultProperties(propertiesBeanIn,props);
				 
//			}
//		}
		
		closeInputStream (propertiesBeanIn,is);
		
		return propertiesBeanOut;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public InputStream loadPropertiesFromCurrentDirectory(PropertiesBean propertiesBean) {
		
		InputStream is = null;
		
		try {

			File f = new File(propertiesBean.getPropertiesLocation());
			is = new FileInputStream( f );
//			System.out.println("is = " + is);
			new LogEvent().logEvent (classNameStr
									,"loadPropertiesFromCurrentDirectory"
									,propertiesBean.getPropertiesFile().toString() ///xxx
									,"Properties"
									,String.valueOf(propertiesBean.getId())
									,CURRENT_DIR_PROPERTIES_LOAD_SUCCESS
									);
			
		}
		
		catch ( IOException ioe ) { 
			
			is = null;
			
			new LogEvent().logEvent (classNameStr
									,"readProperties"
									,new File(propertiesBean.getPropertiesFile().toString()) ///xxx
									,ioe
									,"Properties"
									,String.valueOf(propertiesBean.getId())
									,CURRENT_DIR_PROPERTIES_LOAD_ERROR
									);
			
		}

		return is;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public InputStream loadPropertiesFromClasspath(PropertiesBean propertiesBean) {
/*		
		System.out.println("hello = " + propertiesBean.getPropertiesLocation());
		InputStream is = getClass().getResourceAsStream(propertiesBean.getPropertiesLocation());
		Properties prop = new Properties();
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String filePath = prop.getProperty("json.filepath");
		System.out.println("hello = " +  filePath);
*/		
		InputStream is = getClass().getClassLoader().getResourceAsStream("config.properties");
		
		if (is != null) {
			
			new LogEvent().logEvent (classNameStr
									,"readProperties"
									,propertiesBean.getPropertiesFile().toString() 
									,"Properties"
									,String.valueOf(propertiesBean.getId())
									,CLASSPATH_LOAD_PROPERTIES_SUCCESS
									);
		
		} else {
			
			new LogEvent().logEvent (classNameStr
								    ,"readProperties"
								    ,propertiesBean.getPropertiesFile().toString() 
								    ,"Properties"
								    ,String.valueOf(propertiesBean.getId())
								    ,CLASSPATH_LOAD_PROPERTIES_ERROR
									);
			
		}
			
		return is;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public PropertiesBean loadPropertiesFile (PropertiesBean 	propertiesBeanIn
											 ,Properties 	 	props
											 ,InputStream 		is) {
		
		try {
			
			props.load(is);
			
			new LogEvent().logEvent (classNameStr
								    ,"loadPropertiesFile"
								    ,propertiesBeanIn.getPropertiesFile().toString() 
								    ,"Properties"
								    ,String.valueOf(propertiesBeanIn.getId())
								    ,LOAD_PROPERTIES_FILE_SUCCESS
									);
			
		} catch (IOException ioe) {
			
			new LogEvent().logEvent (classNameStr
								    ,"loadPropertiesFile"
								    ,new File(propertiesBeanIn.getPropertiesFile().toString()) 
								    ,ioe
								    ,"Properties"
								    ,String.valueOf(propertiesBeanIn.getId())
								    ,LOAD_PROPERTIES_FILE_ERROR
									);
			
		}
		
		PropertiesBean 	propertiesBeanOut = formatPropertiesBean (propertiesBeanIn, props);
	
		return propertiesBeanOut;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public PropertiesBean formatPropertiesBean (PropertiesBean 	propertiesBean
											   ,Properties 		props) {
	
        propertiesBean.setId				(Integer.valueOf(props.getProperty("propertiesId")));
        
        propertiesBean.setPropertiesFile	(props.getProperty("propertiesFile"));
        
        
        propertiesBean.setDefaultProperties	(props.getProperty("defaultProperties"));
        propertiesBean.setPropertiesLocation(props.getProperty("propertiesLocation"));
        propertiesBean.setInputFileName		(props.getProperty("inputFileName"));
        propertiesBean.setOutputFileName	(props.getProperty("outputFileName"));
        
        if (props.getProperty("xmlFormat").trim().equalsIgnoreCase("Yes")) {
        	propertiesBean.setXmlFormat	(true);
        } else {
        	propertiesBean.setXmlFormat	(true);
        }
        
        propertiesBean.setEncoding			(props.getProperty("encoding"));
        
        File f = new File(props.getProperty("file"));
        propertiesBean.setPath				(f.getPath());
        
        propertiesBean.setFile				(new File(props.getProperty("file")));
        
        propertiesBean = setFileInputStream (propertiesBean,props);
        
        propertiesBean = setFileOutputStream (propertiesBean,props);
        
        propertiesBean.setDriverName		(props.getProperty("driverName"));
        propertiesBean.setServerName		(props.getProperty("serverName"));
        propertiesBean.setPortNumber		(props.getProperty("portNumber","8080"));
        propertiesBean.setSid				(props.getProperty("sid"));
        propertiesBean.setUserName			(props.getProperty("userName"));
        propertiesBean.setPassword			(props.getProperty("password"));
        
        propertiesBean.setCreateUser		(props.getProperty("createUser"));
//      propertiesBean.setCreateTimestamp	(Timestamp.valueOf(props.getProperty("createTimestamp")));
        propertiesBean.setCreateTimestamp	(Timestamp.valueOf("2014-4-23 11:45:30.123456"));
        
//      System.out.println(props.getProperty("createTimestamp"));
        
        propertiesBean.setModifyUser		(props.getProperty("modifyUser"));
//      propertiesBean.setModifyTimestamp	(Timestamp.valueOf(props.getProperty("modifyTimestamp")));
        propertiesBean.setModifyTimestamp	(Timestamp.valueOf("2014-4-23 11:45:30.123456"));
        
        return propertiesBean;
	
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public PropertiesBean loadDefaultProperties (PropertiesBean propertiesBean
											    ,Properties 	props) {
		
		String defaultId 					= "11";
		String defaultPropertiesFile		= "defaultPropertiesFile";
		String defaultDefaultProperties		= "defaultDefaultProperties";
		String defaultPropertiesLocation	= "defaultPropertiesLocation";
		String defaultInputFileName			= "java.io.FileInputStream@dfb87a";
		String defaultOutputFileName		= "java.io.FileOutputStream@dfb87a";
		
		boolean defaultXmlFormat			= false;
		
		String defaultEncoding				= "defaultEncoding";
		String defaultFile					= "defaultFile";
		String defaultDriverName			= "defaultDriverName";
		String defaultServerName 			= "defaultServerName";
		String defaultPort 					= "8081";
		String defaultSid					= "test";
		String defaultUserName 				= "NoName";
		String defaultPassword 				= "P@SSW0RD";
		
		String defaultCreateUser			= "dfltUser";
		String defaultCreateTimestamp		= "2014-12-31 12:59:59.000000";
		String defaultModifyUser			= "dfltUser";		
		String defaultModifyTimestamp		= "2014-12-31 12:59:59.000000"; 
		
        propertiesBean.setId				(Integer.valueOf(props.getProperty("propertiesId",defaultId)));
        
        propertiesBean.setPropertiesFile	(props.getProperty("propertiesFile"		,defaultPropertiesFile));
        
        propertiesBean.setDefaultProperties	(props.getProperty("defaultProperties"	,defaultDefaultProperties));
        propertiesBean.setPropertiesLocation(props.getProperty("propertiesLocation"	,defaultPropertiesLocation));
        
        propertiesBean.setInputFileName		(props.getProperty("inputFileName"		,defaultInputFileName));
        propertiesBean.setOutputFileName	(props.getProperty("outputFileName"		,defaultOutputFileName));
      
        propertiesBean.setXmlFormat	(defaultXmlFormat);
        
//        if (props.getProperty("xmlFormat").trim().equalsIgnoreCase(defaultXmlFormat)) {
//        	propertiesBean.setXmlFormat	(false);
//        } else {
//        	propertiesBean.setXmlFormat	(true);
//        }
   
        propertiesBean.setEncoding			(props.getProperty("encoding"			,defaultEncoding));
        
        File f = new File(props.getProperty(defaultFile,"appProps2.txt"));
        propertiesBean.setPath				(f.getPath());
        
        propertiesBean.setFile				(new File(props.getProperty("file"		,defaultFile)));
        
//      propertiesBean = setFileInputStream (propertiesBean,props);
//      propertiesBean = setFileOutputStream (propertiesBean,props);
        
        propertiesBean.setDriverName		(props.getProperty("driverName"	,defaultDriverName));
        propertiesBean.setServerName		(props.getProperty("serverName"	,defaultServerName));
        propertiesBean.setPortNumber		(props.getProperty("portNumber"	,defaultPort));
        propertiesBean.setSid				(props.getProperty("sid"		,defaultSid));
        propertiesBean.setUserName			(props.getProperty("userName"	,defaultUserName));
        propertiesBean.setPassword			(props.getProperty("password"	,defaultPassword));
        
        propertiesBean.setCreateUser		(props.getProperty("createUser",defaultCreateUser));
        propertiesBean.setCreateTimestamp	(Timestamp.valueOf(props.getProperty("createTimestamp",defaultCreateTimestamp)));
        propertiesBean.setModifyUser		(props.getProperty("modifyUser",defaultModifyUser));
        propertiesBean.setModifyTimestamp	(Timestamp.valueOf(props.getProperty("modifyTimestamp",defaultModifyTimestamp)));
		
		return propertiesBean;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public PropertiesBean setFileInputStream (PropertiesBean 	propertiesBeanIn
										     ,Properties 		props) {
		
//		System.out.println("PropertiesDaoImpl -> setFileInputStream:fileInputStream = " + props.getProperty("fileInputStream"));
		
		try {
			
				propertiesBeanIn.setFileInputStream (new FileInputStream(props.getProperty("fileInputStream")));
				
				new LogEvent().logEvent (classNameStr
					    				,"setFileInputStream"
					    				,propertiesBeanIn.getPropertiesFile().toString()
					    				,"Properties"
					    				,String.valueOf(propertiesBeanIn.getId())
					    				,SET_FILE_INPUT_STREAM_SUCCESS
										);
				
		} catch (FileNotFoundException fne) {
			
				new LogEvent().logEvent (classNameStr
				    					,"setFileInputStream"
//				    					,new File(propertiesBeanIn.getPropertiesFile().toString())  
				    					,new File("fileInputStream")
				    					,fne
				    					,"Properties"
				    					,String.valueOf(propertiesBeanIn.getId())
				    					,SET_FILE_INPUT_STREAM_ERROR
										);
				
		}
		
		return propertiesBeanIn;
		
	}
	/*******************************************************************************/
	/*******************************************************************************/	
	@Override
	public PropertiesBean setFileOutputStream (PropertiesBean 	propertiesBeanIn
		     								  ,Properties 		props) {

		try {

			propertiesBeanIn.setFileOutputStream (new FileOutputStream(props.getProperty("fileOutputStream")));

			new LogEvent().logEvent (classNameStr
									,"setFileInputStream"
									,propertiesBeanIn.getPropertiesFile().toString()
									,"Properties"
									,String.valueOf(propertiesBeanIn.getId())
									,SET_FILE_OUTPUT_STREAM_SUCCESS
									);

		} catch (FileNotFoundException fne) {

			new LogEvent().logEvent (classNameStr
									,"setFileInputStream"
//									,new File(propertiesBeanIn.getPropertiesFile().toString())
									,new File("fileOutputStream")
									,fne
									,"Properties"
									,String.valueOf(propertiesBeanIn.getId())
									,SET_FILE_OUTPUT_STREAM_ERROR
									);

		}

		return propertiesBeanIn;

	}	
	/*******************************************************************************/
	/*******************************************************************************/
	@Override
	public void closeInputStream (PropertiesBean 	propertiesBeanIn
						         ,InputStream 		is) {
		
		try {
			
			is.close();
			
			new LogEvent().logEvent (classNameStr
									,"closeInputStream"
									,propertiesBeanIn.getPropertiesFile().toString()
									,"Properties"
									,String.valueOf(propertiesBeanIn.getId())
									,CLOSE_INPUT_STREAM_SUCCESS
									);
			
		} catch (IOException ioe) {
			
			new LogEvent().logEvent (classNameStr
									,"closeInputStream"
									,new File(propertiesBeanIn.getPropertiesFile().toString())
									,ioe
									,"Properties"
									,String.valueOf(propertiesBeanIn.getId())
									,CLOSE_INPUT_STREAM_ERROR
									);
			
		}
		
	}
		
}
