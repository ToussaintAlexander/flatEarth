package com.region09.processor.issuer.engine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.engine.model.EngineBean;

public class EngineDaoImpl implements EngineDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(EngineBean engine){

			String sql 
			
				= "INSERT INTO ENGINE_TABLE "
						+ "("
						+ " NAME"
						+ ",STREET"
						+ ",CITY"
						+ ",STATE"
						+ ",COUNTRY"
						+ ",ZIP_CODE"
						+ ",PHONE_NUMBER"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	engine.getName()			+	"'"
						+ ",'"	+	engine.getStreet()			+	"'"
						+ ",'"	+	engine.getCity()			+	"'"
						+ ",'"	+	engine.getState()			+	"'"
						+ ",'"	+	engine.getCountry()			+	"'"
						+ ",'"	+	engine.getZipCode()			+	"'"
						+ ",'"	+	engine.getPhoneNumber()		+	"'"
						+ ",'"	+	engine.getCreateUser()		+	"'"
						+ ",'"	+	engine.getCreateTimestamp()	+	"'"
						+ ",'"	+	engine.getModifyUser()		+	"'"
						+ ",'"	+	engine.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(EngineBean engine){
	
	String sql =
			
			" UPDATE ENGINE_TABLE " 	+
			
			"    SET NAME 				= '" 	+ engine.getName() 				+	"'"	+
			"      , STREET 			= '"  	+ engine.getStreet()			+	"'"	+
			"      , CITY				= '" 	+ engine.getCity()  			+	"'"	+
			"      , STATE				= '" 	+ engine.getState()  			+	"'"	+
			"      , COUNTRY			= '" 	+ engine.getCountry()  			+	"'"	+
			"      , ZIP_CODE			= '" 	+ engine.getZipCode()  			+	"'"	+
			"      , PHONE_NUMBER		= '" 	+ engine.getPhoneNumber()  		+	"'"	+
			"      , MODIFY_USER		= '" 	+ engine.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ engine.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ engine.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM ENGINE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public EngineBean selectEngineById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM ENGINE_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<EngineBean>(EngineBean.class));
	
}

@Override
public List<EngineBean> select(){
	
	return template.query( "SELECT * from ENGINE_TABLE"
						 ,new RowMapper<EngineBean>(){
		
		public EngineBean mapRow(ResultSet rs, int row) throws SQLException {
			
			EngineBean engine = new EngineBean();
			
			engine.setId				(rs.getInt("ID"));
			engine.setName				(rs.getString("NAME"));
			engine.setStreet			(rs.getString("STREET"));
			engine.setCity				(rs.getString("CITY"));
			engine.setState				(rs.getString("STATE"));
			engine.setCountry			(rs.getString("COUNTRY"));
			engine.setZipCode			(rs.getString("ZIP_CODE"));
			engine.setPhoneNumber		(rs.getString("PHONE_NUMBER"));
			engine.setCreateUser		(rs.getString("CREATE_USER"));
			engine.setCreateTimestamp	(rs.getTimestamp("CREATE_TIMESTAMP"));
			engine.setModifyUser		(rs.getString("MODIFY_USER"));
			engine.setModifyTimestamp	(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return engine;
			
		}
	});
  }
}
