package com.system.message.validate.detail.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.validate.detail.model.ValidateDetailBean;

public class ValidateDetailDaoImpl implements ValidateDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ValidateDetailBean validateDetail){

			String sql 
			
				= "INSERT INTO VALIDATE_DETAIL_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FIRE"
						+ ",TYPE"
						+ ",GROUP"
						+ ",BIN_LEVEL"
						+ ",ACCOUNT_LEVEL"
						+ ",TRANSACTION_LEVEL"
						+ ",POINTER"
						+ ",SEQ"
						+ ",FIELD_VALUE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	validateDetail.getField()				+	"'"
						+ ",'"	+	validateDetail.getSubField()			+	"'"
						+ ",'"	+	validateDetail.getFire()				+	"'"
						+ ",'"	+	validateDetail.getType()				+	"'"
						+ ",'"	+	validateDetail.getGroup()				+	"'"
						+ ",'"	+	validateDetail.getBinLevel()			+	"'"
						+ ",'"	+	validateDetail.getAccountLevel()		+	"'"
						+ ",'"	+	validateDetail.getTransactionLevel()	+	"'"
						+ ",'"	+	validateDetail.getPointer()				+	"'"
						+ ",'"	+	validateDetail.getSeq()					+	"'"
						+ ",'"	+	validateDetail.getFieldValue()			+	"'"
						+ ",'"	+	validateDetail.getCreateUser()			+	"'"
						+ ",'"	+	validateDetail.getCreateTimestamp()		+	"'"
						+ ",'"	+	validateDetail.getModifyUser()			+	"'"
						+ ",'"	+	validateDetail.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ValidateDetailBean validateDetail){
	
	String sql =
			
			" UPDATE VALIDATE_DETAIL_TABLE 	   " 	+
			
			"    SET FIELD 				= '" 	+ validateDetail.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ validateDetail.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ validateDetail.getFire()		 		+	"'"	+
			"      , TYPE 				= '"  	+ validateDetail.getType() 				+	"'"	+
			"      , GROUP 				= '"  	+ validateDetail.getGroup() 			+	"'"	+
			"      , BIN_LEVEL 			= '"  	+ validateDetail.getBinLevel() 			+	"'"	+
			"      , ACCOUNT_LEVEL 		= '"  	+ validateDetail.getAccountLevel() 		+	"'"	+
			"      , TRANSACTION_LEVEL 	= '"  	+ validateDetail.getTransactionLevel() 	+	"'"	+
			"      , POINTER 			= '"  	+ validateDetail.getPointer()	 		+	"'"	+
			"      , SEQ 				= '"  	+ validateDetail.getSeq() 				+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ validateDetail.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ validateDetail.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ validateDetail.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ validateDetail.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM VALIDATE_DETAIL_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public ValidateDetailBean selectValidateDetailById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM VALIDATE_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ValidateDetailBean>(ValidateDetailBean.class));
	
}

@Override
public List<ValidateDetailBean> select(){
	
	return template.query( "SELECT * from VALIDATE_DETAIL_TABLE"
						 ,new RowMapper<ValidateDetailBean>(){
		
		public ValidateDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ValidateDetailBean validateDetail = new ValidateDetailBean();
			
			validateDetail.setId					(rs.getInt(1));
			validateDetail.setField					(rs.getInt(2));
			validateDetail.setSubField				(rs.getInt(3));
			validateDetail.setFire					(rs.getInt(4));
			validateDetail.setType					(rs.getInt(5));
			validateDetail.setGroup					(rs.getInt(6));
			validateDetail.setBinLevel				(rs.getInt(7));
			validateDetail.setAccountLevel			(rs.getInt(8));
			validateDetail.setTransactionLevel		(rs.getInt(9));
			validateDetail.setPointer				(rs.getInt(10));
			validateDetail.setSeq					(rs.getInt(11));
			validateDetail.setFieldValue			(rs.getInt(12));
			validateDetail.setCreateUser			(rs.getString(13));
			validateDetail.setCreateTimestamp		(rs.getTimestamp(14));
			validateDetail.setModifyUser			(rs.getString(15));
			validateDetail.setModifyTimestamp		(rs.getTimestamp(16));
			
			return validateDetail;
			
		}
	});
  }
}
