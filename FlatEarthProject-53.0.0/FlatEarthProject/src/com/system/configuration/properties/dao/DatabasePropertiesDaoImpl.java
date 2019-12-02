package com.system.configuration.properties.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.configuration.properties.model.DatabasePropertiesBean;

public class DatabasePropertiesDaoImpl implements DatabasePropertiesDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(DatabasePropertiesBean databaseProperties){

			String sql 
			
				= "INSERT INTO DATABASE_PROPERTIES_TABLE "
						+ "("
						+ " DRIVER_NAME"
						+ ",SERVER_NAME"
						+ ",PORT_NUMBER"
						+ ",SYSTEM_IDENTIFIER"
						+ ",USER_NAME"
						+ ",PASSWORD"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	databaseProperties.getDriverName()			+	"'"
						+ ",'"	+	databaseProperties.getServerName()			+	"'"
						+ ",'"	+	databaseProperties.getPortNumber()			+	"'"
						+ ",'"	+	databaseProperties.getSystemIdentifier()	+	"'"
						+ ",'"	+	databaseProperties.getUserName()			+	"'"
						+ ",'"	+	databaseProperties.getPassword()			+	"'"
						+ ",'"	+	databaseProperties.getCreateUser()			+	"'"
						+ ",'"	+	databaseProperties.getCreateTimestamp()		+	"'"
						+ ",'"	+	databaseProperties.getModifyUser()			+	"'"
						+ ",'"	+	databaseProperties.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(DatabasePropertiesBean databaseProperties){
	
	String sql =
			
			" UPDATE DATABASE_PROPERTIES_TABLE 	   " 	+
			
			"    SET DRIVER_NAME 		= '" 	+ databaseProperties.getDriverName() 		+	"'"	+
			"      , SERVER_NAME 		= '"  	+ databaseProperties.getServerName()	 	+	"'"	+
			"      , PORT_NUMBER 		= '"  	+ databaseProperties.getPortNumber()		+	"'"	+
			"      , SYSTEM_IDENTIFIER 	= '"  	+ databaseProperties.getSystemIdentifier() 	+	"'"	+
			"      , USER_NAME 			= '"  	+ databaseProperties.getUserName() 			+	"'"	+
			"      , PASSWORD 			= '"  	+ databaseProperties.getPassword() 			+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ databaseProperties.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ databaseProperties.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ databaseProperties.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM DATABASE_PROPERTIES_TABLE " 	+
			"  WHERE ID = "								+
			         id									+
			"";
	
	return template.update(sql);
	
}

@Override
public DatabasePropertiesBean selectDatabasePropertiesById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM DATABASE_PROPERTIES_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<DatabasePropertiesBean>(DatabasePropertiesBean.class));
	
}

@Override
public List<DatabasePropertiesBean> select(){
	
	return template.query( "SELECT * from DATABASE_PROPERTIES_TABLE"
						 ,new RowMapper<DatabasePropertiesBean>(){
		
		public DatabasePropertiesBean mapRow(ResultSet rs, int row) throws SQLException {
			
			DatabasePropertiesBean databaseProperties = new DatabasePropertiesBean();
			
			databaseProperties.setId				(rs.getInt(1));
			databaseProperties.setDriverName		(rs.getString(2));
			databaseProperties.setServerName		(rs.getString(3));
			databaseProperties.setPortNumber		(rs.getString(4));
			databaseProperties.setSystemIdentifier	(rs.getString(5));
			databaseProperties.setUserName			(rs.getString(6));
			databaseProperties.setPassword			(rs.getString(7));
			
			databaseProperties.setCreateUser		(rs.getString(8));
			databaseProperties.setCreateTimestamp	(rs.getTimestamp(9));
			databaseProperties.setModifyUser		(rs.getString(10));
			databaseProperties.setModifyTimestamp	(rs.getTimestamp(11));
			
			return databaseProperties;
			
		}
	});
  }
}
