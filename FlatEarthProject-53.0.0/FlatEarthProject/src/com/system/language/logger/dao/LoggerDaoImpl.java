package com.system.language.logger.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.language.logger.dao.LoggerDao;
import com.system.language.logger.model.LoggerBean;

public class LoggerDaoImpl implements LoggerDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/***********************************************************************************/
	/***********************************************************************************/
	@Override
	public boolean insert (LoggerBean logger) {

		String sql 
		
		= "INSERT INTO LOGGER_TABLE "
				+ "("
				+ ",LOGGER_NAME"
				+ ",HANDLER_TYPE"
				+ ",FILE_HANDLER"
				+ ",SERVER_NAME"
				+ ",PORT_NUMBER"
				+ ",OUTPUT_STREAM"
				+ ",FILENAME_PATTERN"
				+ ",FILE_APPEND"
				+ ",MAXIMUM_DISK_FILES"
				+ ",FILE_LIMIT_SIZE"
				+ ",MAXIMUM_RECORD_BUFFER"
				+ ",FILTER_CODE"
				+ ",FILTER_VALUE"
				+ ",PUSH_LEVEL"
				+ ",SOURCE_CLASS"
				+ ",SOURCE_METHOD"
				+ ",RESOURCE_BUNDLE"
				+ ",FORMAT_CODE"
				
				+ ",CREATE_USER"
				+ ",CREATE_TIMESTAMP"
				+ ",MODIFY_USER"
				+ ",MODIFY_TIMESTAMP"
				+ ") "
				+ "VALUES"
				+ "('"	+	logger.getLoggerName()			+	"'"
				+ ",'"	+	logger.getHandlerType()			+	"'"
				+ ",'"	+	logger.getFileHandler()			+	"'"
				+ ",'"	+	logger.getServerName()			+	"'"
				+ ",'"	+	logger.getPortNumber()			+	"'"
				+ ",'"	+	logger.getOutputStream()		+	"'"
				+ ",'"	+	logger.getFileNamePattern()		+	"'"
				+ ",'"	+	logger.getFileAppend()			+	"'"
				+ ",'"	+	logger.getMaximumDiskFiles()	+	"'"
				+ ",'"	+	logger.getFileLimitSize()		+	"'"
				+ ",'"	+	logger.getMaximumRecordBuffer()	+	"'"
				+ ",'"	+	logger.getFilterCode()			+	"'"
				+ ",'"	+	logger.getFilterValue()			+	"'"
				+ ",'"	+	logger.getPushLevel()			+	"'"
				+ ",'"	+	logger.getSourceClass()			+	"'"
				+ ",'"	+	logger.getSourceMethodName()	+	"'"
				+ ",'"	+	logger.getResourceBundle()		+	"'"
				+ ",'"	+	logger.getFormatCode()			+	"'"
				
				+ ",'"	+	logger.getCreateUser()			+	"'"
				+ ",'"	+	logger.getCreateTimestamp()		+	"'"
				+ ",'"	+	logger.getModifyUser()			+	"'"
				+ ",'"	+	logger.getModifyTimestamp()		+	"'"
				+ ")";

		return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public List<LoggerBean> select() {

		return template.query( "SELECT * FROM LOGGER_TABLE"
				 			 ,new RowMapper<LoggerBean>(){

			public LoggerBean mapRow(ResultSet rs1, int row) throws SQLException {
	
				LoggerBean logger = new LoggerBean();
	
	            	logger.setId					(rs1.getInt		("ID"));
//	            	logger.setLoggerName			(Logger.getLogger(rs1.getString	("LOGGER_NAME")));	// String -> Logger
	            	logger.setLoggerName			(rs1.getString	("LOGGER_NAME"));	 
	            	logger.setHandlerType			(rs1.getString	("HANDLER_TYPE"));
	            	
//	            	logger.setFileHandler			(rs1.getObject	("FILE_HANDLER"));					// String -> Handler
	            	logger.setFileHandler			(rs1.getString	("FILE_HANDLER"));					// String -> Handler
	            	
//	            	logger.setFileHandler			(new ConsoleHandler());								// Stub
	            	
	            	logger.setServerName			(rs1.getString	("SERVER_NAME"));
	            	logger.setPortNumber			(rs1.getString	("PORT_NUMBER"));
	            	 
	            	logger.setOutputStream			(rs1.getString	("OUTPUT_STREAM"));
	            	logger.setFileNamePattern		(rs1.getString	("FILENAME_PATTERN"));
	            	
//	            	if (rs1.getString("FILE_APPEND").equalsIgnoreCase("YES")) {
//	            		logger.setFileAppend (true);
//	            	} else {
//	            		logger.setFileAppend (false);
//	            	}
	            	
	            	logger.setFileAppend			(rs1.getShort		("FILE_APPEND"));
	            	logger.setMaximumDiskFiles		(rs1.getInt			("MAXIMUM_DISK_FILES"));
	            	logger.setFileLimitSize			(rs1.getInt			("FILE_LIMIT_SIZE"));
	            	logger.setMaximumRecordBuffer	(rs1.getInt			("MAXIMUM_RECORD_BUFFER"));
	            	logger.setFilterCode			(rs1.getInt			("FILTER_CODE"));
	            	logger.setFilterValue			(rs1.getString		("FILENAME_VALUE"));
	            	logger.setPushLevel				(rs1.getInt			("PUSH_LEVEL"));
	            	logger.setSourceClass			(rs1.getString		("SOURCE_CLASS"));
	            	logger.setSourceMethodName		(rs1.getString		("SOURCE_METHOD"));
	            	logger.setResourceBundle		(rs1.getString		("RESOURCE_BUNDLE"));
	            	logger.setFormatCode			(rs1.getInt			("FORMAT_CODE"));
	            	
	            	logger.setCreateUser			(rs1.getString		("CREATE_USER"));
	            	logger.setCreateTimestamp		(rs1.getTimestamp	("CREATE_TIMESTAMP"));
	            	logger.setModifyUser			(rs1.getString		("MODIFY_USER"));
	            	logger.setModifyTimestamp		(rs1.getTimestamp	("MODIFY_TIMESTAMP"));
	            	
	            	return logger;
		
			}		 
		});
	 }
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public boolean update (LoggerBean logger) {

		String sql =
				
				" UPDATE LOGGER_TABLE " 				+
				
				"    SET LOGGER_NAME 			= '"  	+ logger.getLoggerName().toString()		+	"'"	+
				"      , HANDLER_TYPE			= '" 	+ logger.getHandlerType()  				+	"'"	+
				"      , FILE_HANDLER			= '" 	+ logger.getFileHandler().toString()  	+	"'"	+
				"      , SERVER_NAME			= '" 	+ logger.getServerName()  				+	"'"	+
				"      , PORT_NUMBER			= '" 	+ logger.getPortNumber()  				+	"'"	+
				"      , OUTPUT_STREAM			= '" 	+ logger.getOutputStream()  			+	"'"	+
				"      , FILENAME_PATTERN		= '" 	+ logger.getFileNamePattern()  			+	"'"	+
				"      , FILE_APPEND			= '" 	+ logger.getFileAppend()  				+	"'"	+
				"      , MAXIMUM_DISK_FILES		= '" 	+ logger.getMaximumDiskFiles()  		+	"'"	+
				"      , FILE_LIMIT_SIZE		= '" 	+ logger.getFileLimitSize()  			+	"'"	+
				"      , MAXIMUM_RECORD_BUFFER	= '" 	+ logger.getMaximumRecordBuffer()  		+	"'"	+
				"      , FILTER_CODE			= '" 	+ logger.getFilterCode()  				+	"'"	+
				"      , FILTER_VALUE			= '" 	+ logger.getFilterValue()  				+	"'"	+
				"      , PUSH_LEVEL				= '" 	+ logger.getPushLevel()  				+	"'"	+
				"      , SOURCE_CLASS			= '" 	+ logger.getSourceClass()  				+	"'"	+
				"      , SOURCE_METHOD			= '" 	+ logger.getSourceMethodName()  		+	"'"	+
				"      , RESOURCE_BUNDLE		= '" 	+ logger.getResourceBundle()  			+	"'"	+
				"      , FORMAT_CODE			= '" 	+ logger.getFormatCode()  				+	"'"	+
				
				"      , CREATE_USER			= '" 	+ logger.getCreateTimestamp()  			+	"'"	+
				"      , CREATE_TIMESTAMP		= '" 	+ logger.getCreateTimestamp()  			+	"'"	+
				"      , MODIFY_USER			= '" 	+ logger.getModifyUser()  				+	"'"	+
				"      , MODIFY_TIMESTAMP		= '" 	+ logger.getModifyTimestamp() 			+	"'"	+	
				
				"  WHERE  ID					= "		+ logger.getId()						+ 	"";
		
		return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public boolean delete (int id) {

		String sql =
				
				  "  DELETE FROM LOGGER_TABLE "
				+ "   WHERE ID = "
				+ id
				+ "";
		
		return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	public void loggerBeanPrint (LoggerBean logger) {
		
		System.out.println(" 1 " + logger.getId()					);
		System.out.println(" 2 " + logger.getLoggerName()			);
		System.out.println(" 3 " + logger.getHandlerType()			);
		System.out.println(" 4 " + logger.getFileHandler()			);
		System.out.println(" 5 " + logger.getServerName()			);
		System.out.println(" 6 " + logger.getPortNumber()			);
		System.out.println(" 7 " + logger.getOutputStream()			);
		System.out.println(" 8 " + logger.getFileNamePattern()		);
		System.out.println(" 9 " + logger.getFileAppend()			);
		System.out.println(" 10 " + logger.getMaximumDiskFiles()	);
		System.out.println(" 11 " + logger.getFileLimitSize()		);
		System.out.println(" 12 " + logger.getMaximumRecordBuffer()	);
		System.out.println(" 13 " + logger.getFilterCode()			);
		System.out.println(" 14 " + logger.getFilterValue()			);
		System.out.println(" 15 " + logger.getPushLevel()			);
		System.out.println(" 16 " + logger.getSourceClass()			);
		System.out.println(" 17 " + logger.getSourceMethodName()	);
		System.out.println(" 18 " + logger.getResourceBundle()		);
		System.out.println(" 19 " + logger.getFormatCode()			);
		
		System.out.println(" 20 " + logger.getCreateUser()			);
		System.out.println(" 21 " + logger.getCreateTimestamp()		);
		System.out.println(" 22 " + logger.getModifyUser()			);
		System.out.println(" 23 " + logger.getModifyTimestamp()		);
    	
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public LoggerBean selectLoggerById(int id) {
		
		String sql 
		
		= "SELECT * "
		+ "  FROM LOGGER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<LoggerBean>(LoggerBean.class));
	}
	
}
