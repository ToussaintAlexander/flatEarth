package com.system.configuration.properties.service;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.system.configuration.properties.model.PropertiesBean;

public interface PropertiesDao {


	public boolean createProperties								(PropertiesBean 		properties);
		
	public Properties setPropertyValues							(PropertiesBean 		properties);
	
	public OutputStream createOutputStream 						(PropertiesBean 		properties
										   						,File 					propertiesFile);
		
	public boolean formatPropertiesFile 						(PropertiesBean 		bean
									    						,Properties 			properties
									    						,OutputStream 			outputStream
									    						,File					propertiesFile);

	public boolean handleXmlFormat								(PropertiesBean 		bean
							      								,Properties 			properties
							      								,OutputStream 			outputStream
							      								,File					propertiesFile);
		
	public boolean handlePlainFormat							(PropertiesBean			bean
		      					    							,Properties 			properties
		      					    							,OutputStream 			outputStream
		      					    							,File					propertiesFile);

	public void closeOutputStream 								(PropertiesBean 		bean
								  								,OutputStream 			os
								  								,File 					propertiesFile);
	
	public PropertiesBean readProperties						(PropertiesBean 		bean);
		
	public InputStream loadPropertiesFromCurrentDirectory		(PropertiesBean 		propertiesBean);
		
	public InputStream loadPropertiesFromClasspath				(PropertiesBean 		bean);

	public PropertiesBean loadPropertiesFile 					(PropertiesBean 		bean
											 					,Properties 	 		props
											 					,InputStream 			is);
		
	public PropertiesBean formatPropertiesBean 					(PropertiesBean 		bean
											   					,Properties 			props);
	
	public PropertiesBean loadDefaultProperties 				(PropertiesBean 		bean
											    				,Properties 			props);

	public PropertiesBean setFileInputStream 					(PropertiesBean 		bean
										     					,Properties 			props);

	public PropertiesBean setFileOutputStream 					(PropertiesBean 		propertiesBeanIn
		     								  					,Properties 			props);

	public void closeInputStream 								(PropertiesBean 		bean
						         								,InputStream 			is);
		
}
