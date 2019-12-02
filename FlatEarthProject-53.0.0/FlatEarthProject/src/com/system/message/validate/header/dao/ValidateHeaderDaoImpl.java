package com.system.message.validate.header.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.validate.header.model.ValidateHeaderBean;

public class ValidateHeaderDaoImpl implements ValidateHeaderDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ValidateHeaderBean validateHeader){

			String sql 
			
				= "INSERT INTO VALIDATE_HEADER_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FIRE"
						+ ",FORMAT"
						+ ",MINIMUM_LENGTH"
						+ ",MAXIMUM_LENGTH"
						+ ",ENCODING"
						+ ",DATA_TYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",DATE_OF_BIRTH"
						+ ",CHANGE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	validateHeader.getField()				+	"'"
						+ ",'"	+	validateHeader.getSubField()			+	"'"
						+ ",'"	+	validateHeader.getFire()				+	"'"
						+ ",'"	+	validateHeader.getFormat()				+	"'"
						+ ",'"	+	validateHeader.getMinimumLength()		+	"'"
						+ ",'"	+	validateHeader.getMaximumLength()		+	"'"
						+ ",'"	+	validateHeader.getEncoding()			+	"'"
						+ ",'"	+	validateHeader.getDataType()			+	"'"
						+ ",'"	+	validateHeader.getSource()				+	"'"
						+ ",'"	+	validateHeader.getDirection()			+	"'"
						+ ",'"	+	validateHeader.getExistence()			+	"'"
						+ ",'"	+	validateHeader.getCreateUser()			+	"'"
						+ ",'"	+	validateHeader.getCreateTimestamp()		+	"'"
						+ ",'"	+	validateHeader.getModifyUser()			+	"'"
						+ ",'"	+	validateHeader.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ValidateHeaderBean validateHeader){
	
	String sql =
			
			" UPDATE VALIDATE_HEADER_TABLE 	   " 	+
			
			"    SET FIELD 				= '" 	+ validateHeader.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ validateHeader.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ validateHeader.getFire()		 		+	"'"	+
			"      , FORMAT 			= '"  	+ validateHeader.getFormat()		 	+	"'"	+
			"      , MINIMUM_LENGTH 	= '"  	+ validateHeader.getMinimumLength() 	+	"'"	+
			"      , MAXIMUM_LENGTH 	= '"  	+ validateHeader.getMaximumLength() 	+	"'"	+
			"      , ENCODING 			= '"  	+ validateHeader.getEncoding() 			+	"'"	+
			"      , DATA_TYPE 			= '"  	+ validateHeader.getDataType() 			+	"'"	+
			"      , SOURCE 			= '"  	+ validateHeader.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ validateHeader.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ validateHeader.getExistence()	 		+	"'"	+
			"      , CHANGE 			= '"  	+ validateHeader.getChange() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ validateHeader.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ validateHeader.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ validateHeader.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM VALIDATE_HEADER_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public ValidateHeaderBean selectValidateHeaderById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM VALIDATE_HEADER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ValidateHeaderBean>(ValidateHeaderBean.class));
	
}

@Override
public List<ValidateHeaderBean> select(){
	
	return template.query( "SELECT * FROM VALIDATE_HEADER_TABLE"
						 ,new RowMapper<ValidateHeaderBean>(){
		
		public ValidateHeaderBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ValidateHeaderBean validateHeader = new ValidateHeaderBean();
			
			validateHeader.setId				(rs.getInt(1));
			validateHeader.setField				(rs.getInt(2));
			validateHeader.setSubField			(rs.getInt(3));
			validateHeader.setFire				(rs.getInt(4));
			validateHeader.setFormat			(rs.getInt(4));
			validateHeader.setMinimumLength		(rs.getInt(5));
			validateHeader.setMaximumLength		(rs.getInt(5));
			validateHeader.setEncoding			(rs.getInt(6));
			validateHeader.setDataType			(rs.getInt(7));
			validateHeader.setSource			(rs.getInt(8));
			validateHeader.setDirection			(rs.getInt(9));
			validateHeader.setExistence			(rs.getInt(10));
			validateHeader.setChange			(rs.getInt(11));
			validateHeader.setCreateUser		(rs.getString(13));
			validateHeader.setCreateTimestamp	(rs.getTimestamp(14));
			validateHeader.setModifyUser		(rs.getString(15));
			validateHeader.setModifyTimestamp	(rs.getTimestamp(16));
			
			return validateHeader;
			
		}
	});
  }
}

					