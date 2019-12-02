package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.ValidCodeBean;

public class ValidCodeDaoImpl implements ValidCodeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ValidCodeBean validCode){

			String sql 
			
				= "INSERT INTO VALID_CODE_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ " SEQ"
						+ ",CODE"
						+ " NAME"
						+ ",DESCRIPTION"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	validCode.getField()			+	"'"
						+ ",'"	+	validCode.getSubfield()			+	"'"
						+ ",'"	+	validCode.getSeq()				+	"'"
						+ ",'"	+	validCode.getCode()				+	"'"
						+ ",'"	+	validCode.getName()				+	"'"
						+ ",'"	+	validCode.getDescription()		+	"'"
						
						+ ",'"	+	validCode.getCreateUser()		+	"'"
						+ ",'"	+	validCode.getCreateTimestamp()	+	"'"
						+ ",'"	+	validCode.getModifyUser()		+	"'"
						+ ",'"	+	validCode.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ValidCodeBean validCode){
	
	String sql =
			
			" UPDATE VALID_CODE_TABLE  " 	+
			
			"    SET CODE 				= '" 	+ validCode.getCode() 				+	"'"	+
			"      , NAME 				= '"  	+ validCode.getName()	 			+	"'"	+
			"      , DESCRIPTION 		= '"  	+ validCode.getDescription()	 	+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ validCode.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ validCode.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE FIELD 				= "		+ validCode.getId()					+	"'"	+
			"    AND SUBFIELD 			= "		+ validCode.getSubfield()			+	"'"	+
			"    AND SEQ 				= "		+ validCode.getSeq()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int field, int subfield, int seq){
	
	String sql =
			
			"DELETE FROM VALID_CODE_TABLE 	"	+
			" WHERE FIELD 		= 			"	+
			"   AND SUBFIELD 	= 			"	+
			"   AND SEQ 		= 			"	+
			        field						+
			","									+
	                subfield					+
			","									+
			        seq							+
			" ";
	
	return template.update(sql);
	
}

@Override
public ValidCodeBean selectValidCodeById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM VALID_CODE_TABLE "		+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ValidCodeBean>(ValidCodeBean.class));
	
}

@Override
public List<ValidCodeBean> select(){
	
	return template.query( "SELECT * FROM VALID_CODE_TABLE"
						 ,new RowMapper<ValidCodeBean>(){
		
		public ValidCodeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ValidCodeBean validCode = new ValidCodeBean();
			
			validCode.setId					(rs.getInt(1));
			validCode.setField				(rs.getInt(2));
			validCode.setSubfield			(rs.getInt(3));
			validCode.setSeq				(rs.getInt(4));
			validCode.setCode				(rs.getString(5));
			validCode.setName				(rs.getString(6));
			validCode.setDescription		(rs.getString(7));
			validCode.setCreateUser			(rs.getString(8));
			validCode.setCreateTimestamp	(rs.getTimestamp(9));
			validCode.setModifyUser			(rs.getString(10));
			validCode.setModifyTimestamp	(rs.getTimestamp(11));
			
			return validCode;
			
		}
	});
  }
}
