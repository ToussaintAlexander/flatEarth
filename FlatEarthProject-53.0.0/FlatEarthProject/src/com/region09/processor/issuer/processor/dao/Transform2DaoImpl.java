package com.region09.processor.issuer.processor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.processor.model.transform2Bean;

public class Transform2DaoImpl implements Transform2Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(transform2Bean processor){

			String sql 
			
				= "INSERT INTO TRANSFORM2_TABLE "
						+ "("
						+ " name"
						+ ",street"
						+ ",city"
						+ ",state"
						+ ",country"
						+ ",zip_code"
						+ ",phone_number"
						+ ",create_user"
						+ ",create_timestamp"
						+ ",modify_user"
						+ ",modify_timestamp"
						+ ") "
						+ "values"
						+ "('"	+	processor.getName()				+	"'"
						+ ",'"	+	processor.getStreet()			+	"'"
						+ ",'"	+	processor.getCity()				+	"'"
						+ ",'"	+	processor.getState()			+	"'"
						+ ",'"	+	processor.getCountry()			+	"'"
						+ ",'"	+	processor.getZipCode()			+	"'"
						+ ",'"	+	processor.getPhoneNumber()		+	"'"
						+ ",'"	+	processor.getCreateUser()		+	"'"
						+ ",'"	+	processor.getCreateTimestamp()	+	"'"
						+ ",'"	+	processor.getModifyUser()		+	"'"
						+ ",'"	+	processor.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(transform2Bean processor){
	
	String sql =
			
			" UPDATE TRANSFORM2_TABLE " 	+
			
			"    SET name 				= '" 	+ processor.getName() 				+	"'"	+
			"      , street 			= '"  	+ processor.getStreet()			 	+	"'"	+
			"      , city				= '" 	+ processor.getCity()  				+	"'"	+
			"      , state				= '" 	+ processor.getState()  			+	"'"	+
			"      , country			= '" 	+ processor.getCountry()  			+	"'"	+
			"      , zip_code			= '" 	+ processor.getZipCode()  			+	"'"	+
			"      , phone_number		= '" 	+ processor.getPhoneNumber()  		+	"'"	+
			"      , create_user		= '" 	+ processor.getCreateUser()  		+	"'"	+
			"      , create_timestamp	= '" 	+ processor.getCreateTimestamp()  	+	"'"	+
			"      , modify_user		= '" 	+ processor.getModifyUser()  		+	"'"	+
			"      , modify_timestamp	= '" 	+ processor.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE id 				= "		+ processor.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM TRANSFORM2_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public transform2Bean selectTransform2ById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM TRANSFORM2_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<transform2Bean>(transform2Bean.class));
	
}

@Override
public List<transform2Bean> select(){
	
	return template.query( "SELECT * FROM TRANSFORM2_TABLE"
						 ,new RowMapper<transform2Bean>(){
		
		public transform2Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			transform2Bean processor = new transform2Bean();
			
			processor.setId					(rs.getInt(1));
			processor.setName				(rs.getString(2));
			processor.setStreet				(rs.getString(3));
			processor.setCity				(rs.getString(4));
			processor.setState				(rs.getString(5));
			processor.setCountry			(rs.getString(6));
			processor.setZipCode			(rs.getString(7));
			processor.setPhoneNumber		(rs.getString(8));
			processor.setCreateUser			(rs.getString(9));
			processor.setCreateTimestamp	(rs.getTimestamp(10));
			processor.setModifyUser			(rs.getString(11));
			processor.setModifyTimestamp	(rs.getTimestamp(12));
			
			return processor;
			
		}
	});
  }
}