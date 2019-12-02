package com.system.configuration.properties.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.configuration.properties.model.FilePropertiesBean;

public class FilePropertiesDaoImpl implements FilePropertiesDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(FilePropertiesBean fileProperties){

			String sql 
			
				= "INSERT INTO FILE_PROPERTIES_TABLE "
						+ "("
						+ " PROPERTIES_FILE"
						+ ",DEFAULT_PROPERTIES"
						+ ",PROPERTIES_LOCATION"
						+ ",INPUT_FILENAME"
						+ ",OUTPUT_FILENAME"
						+ ",XML_FORMAT_SWITCH"
						
						+ ",ENCODING_FORMAT"
						+ ",PATHNAME"
						+ ",FILENAME"
						+ ",FILE_INPUT_STREAM"
						+ ",FILE_OUTPUT_STREAM"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	fileProperties.getPropertiesFile()		+	"'"
						+ ",'"	+	fileProperties.getDefaultProperties()	+	"'"
						+ ",'"	+	fileProperties.getPropertiesLocation()	+	"'"
						+ ",'"	+	fileProperties.getInputFileName()		+	"'"
						+ ",'"	+	fileProperties.getOutputFileName()		+	"'"
						+ ",'"	+	fileProperties.isXmlFormatSwitch()		+	"'"
						
						+ ",'"	+	fileProperties.getEncodingFormat()		+	"'"
						+ ",'"	+	fileProperties.getPathName()			+	"'"
						+ ",'"	+	fileProperties.getFileName()			+	"'"
						+ ",'"	+	fileProperties.getFileInputStream()		+	"'"
						+ ",'"	+	fileProperties.getFileOutputStream()	+	"'"
						
						+ ",'"	+	fileProperties.getCreateUser()			+	"'"
						+ ",'"	+	fileProperties.getCreateTimestamp()		+	"'"
						+ ",'"	+	fileProperties.getModifyUser()			+	"'"
						+ ",'"	+	fileProperties.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(FilePropertiesBean fileProperties){
	
	String sql =
			
			" UPDATE FILE_PROPERTIES_TABLE 	   " 	+
			
			"    SET DRIVER_NAME 		= '" 	+ fileProperties.getPropertiesFile() 		+	"'"	+
			"      , SERVER_NAME 		= '"  	+ fileProperties.getDefaultProperties()	 	+	"'"	+
			"      , PORT_NUMBER 		= '"  	+ fileProperties.getPropertiesLocation()	+	"'"	+
			"      , SYSTEM_IDENTIFIER 	= '"  	+ fileProperties.getInputFileName() 		+	"'"	+
			"      , USER_NAME 			= '"  	+ fileProperties.getOutputFileName() 		+	"'"	+
			"      , PASSWORD 			= '"  	+ fileProperties.isXmlFormatSwitch() 		+	"'"	+
			
			"      , SERVER_NAME 		= '"  	+ fileProperties.getEncodingFormat()	 	+	"'"	+
			"      , PORT_NUMBER 		= '"  	+ fileProperties.getPathName()				+	"'"	+
			"      , SYSTEM_IDENTIFIER 	= '"  	+ fileProperties.getFileName() 				+	"'"	+
			"      , USER_NAME 			= '"  	+ fileProperties.getFileInputStream() 		+	"'"	+
			"      , PASSWORD 			= '"  	+ fileProperties.getFileOutputStream() 		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ fileProperties.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ fileProperties.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 				= "		+ fileProperties.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM FILE_PROPERTIES_TABLE " 	+
			"  WHERE ID = "							+
			         id								+
			"";
	
	return template.update(sql);
	
}

@Override
public FilePropertiesBean selectFilePropertiesById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM FILE_PROPERTIES_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<FilePropertiesBean>(FilePropertiesBean.class));
	
}

@Override
public List<FilePropertiesBean> select(){
	
	return template.query( "SELECT * FROM FILE_PROPERTIES_TABLE"
						 ,new RowMapper<FilePropertiesBean>(){
		
		public FilePropertiesBean mapRow(ResultSet rs, int row) throws SQLException {
			
			FilePropertiesBean fileProperties = new FilePropertiesBean();
			
			fileProperties.setId					(rs.getInt(1));
			
			fileProperties.setPropertiesFile		(rs.getString(2));
			fileProperties.setDefaultProperties		(rs.getString(3));
			fileProperties.setPropertiesLocation	(rs.getString(4));
			fileProperties.setInputFileName			(rs.getString(5));
			fileProperties.setOutputFileName		(rs.getString(6));
			fileProperties.setXmlFormatSwitch		(rs.getBoolean(7));
			
			fileProperties.setEncodingFormat		(rs.getString(8));
			fileProperties.setPathName				(rs.getString(9));
			fileProperties.setFileName				(new File(rs.getObject(10).toString()));
			
			try {
				fileProperties.setFileInputStream	(new FileInputStream (rs.getString(11)));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println("FileInputStream = " + fileProperties.getFileInputStream() );
			
			try {
				fileProperties.setFileOutputStream	(new FileOutputStream (rs.getString(12)));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			fileProperties.setCreateUser			(rs.getString(13));
			fileProperties.setCreateTimestamp		(rs.getTimestamp(14));
			fileProperties.setModifyUser			(rs.getString(15));
			fileProperties.setModifyTimestamp		(rs.getTimestamp(16));
			
			return fileProperties;
			
		}
	});
  }
}
