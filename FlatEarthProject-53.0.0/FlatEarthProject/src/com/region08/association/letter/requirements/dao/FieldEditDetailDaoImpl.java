package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.FieldEditDetailBean;

public class FieldEditDetailDaoImpl implements FieldEditDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(FieldEditDetailBean fieldEditDetail){

			String sql 
			
				= "INSERT INTO FIELD_EDIT_DETAIL_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",SEQ"
						+ ",FIRE"
						+ ",TYPE"
						+ ",GROUP"
						+ ",BIN_LAYER"
						+ ",ACCOUNT_LAYER"
						+ ",TRANSACTION_LAYER"
						+ ",ROUTINE_SEQUENCE"
						+ ",POINTER"
						+ ",FIELD_VALUE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	fieldEditDetail.getField()				+	"'"
						+ ",'"	+	fieldEditDetail.getSubfield()			+	"'"
						+ ",'"	+	fieldEditDetail.getSeq()				+	"'"
						+ ",'"	+	fieldEditDetail.getFire()				+	"'"
						+ ",'"	+	fieldEditDetail.getType()				+	"'"
						+ ",'"	+	fieldEditDetail.getGroup()				+	"'"
						+ ",'"	+	fieldEditDetail.getBinLayer()			+	"'"
						+ ",'"	+	fieldEditDetail.getAccountLayer()		+	"'"
						+ ",'"	+	fieldEditDetail.getTransactionLayer()	+	"'"
						+ ",'"	+	fieldEditDetail.getRoutineSequence()	+	"'"
						+ ",'"	+	fieldEditDetail.getPointer()			+	"'"
						+ ",'"	+	fieldEditDetail.getFieldValue()			+	"'"
						+ ",'"	+	fieldEditDetail.getCreateUser()			+	"'"
						+ ",'"	+	fieldEditDetail.getCreateTimestamp()	+	"'"
						+ ",'"	+	fieldEditDetail.getModifyUser()			+	"'"
						+ ",'"	+	fieldEditDetail.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(FieldEditDetailBean fieldEditDetail){
	
	String sql =
			
			" UPDATE FIELD_EDIT_DETAIL_TABLE  "	+
			
			"    SET FIELD 				= '" 	+ fieldEditDetail.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ fieldEditDetail.getSubfield()	 		+	"'"	+
			"      , SEQUENCE 			= '"  	+ fieldEditDetail.getSeq()				+	"'"	+
			"      , FIRE 				= '"  	+ fieldEditDetail.getFire()	 			+	"'"	+
			"      , TYPE 				= '"  	+ fieldEditDetail.getType()				+	"'"	+
			"      , GROUP 				= '"  	+ fieldEditDetail.getGroup()	 		+	"'"	+
			"      , BIN_LAYER 			= '"  	+ fieldEditDetail.getBinLayer()			+	"'"	+
			"      , ACCOUNT_LAYER 		= '"  	+ fieldEditDetail.getAccountLayer()	 	+	"'"	+
			"      , TRANSACTION_LAYER 	= '"  	+ fieldEditDetail.getTransactionLayer()	+	"'"	+
			"      , ROUTINE_SEQUENCE 	= '"  	+ fieldEditDetail.getRoutineSequence()	+	"'"	+
			"      , POINTER 			= '"  	+ fieldEditDetail.getPointer()			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ fieldEditDetail.getFieldValue()		+	"'"	+			
			"      , MODIFY_USER		= '" 	+ fieldEditDetail.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ fieldEditDetail.getModifyTimestamp()  +	"'"	+	
			
			"  WHERE ID 				= "		+ fieldEditDetail.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id, int seq){
	
	String sql =
			
			"DELETE FROM FIELD_EDIT_DETAIL_TABLE "	+
			" WHERE ID = 		"					+
			"   AND SEQ = 		"					+	
			       id								+
			","										+       
			       seq								+       
			" ";
	
	return template.update(sql);
	
}

@Override
public FieldEditDetailBean selectFieldEditDetailById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM FIELD_EDIT_DETAIL_TABLE "	+
		 "  WHERE ID		   	= ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<FieldEditDetailBean>(FieldEditDetailBean.class));
	
}

@Override
public List<FieldEditDetailBean> select(){
	
	return template.query( "SELECT * FROM FIELD_EDIT_DETAIL_TABLE"
						 ,new RowMapper<FieldEditDetailBean>(){
		
		public FieldEditDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			FieldEditDetailBean fieldEditDetail = new FieldEditDetailBean();
			
			fieldEditDetail.setId				(rs.getInt(1));
			fieldEditDetail.setField			(rs.getInt(2));
			fieldEditDetail.setSubfield			(rs.getInt(3));
			fieldEditDetail.setFire				(rs.getInt(4));
			fieldEditDetail.setType				(rs.getInt(5));
			fieldEditDetail.setGroup			(rs.getInt(6));
			fieldEditDetail.setBinLayer			(rs.getInt(7));
			fieldEditDetail.setAccountLayer		(rs.getInt(8));
			fieldEditDetail.setTransactionLayer	(rs.getInt(10));
			fieldEditDetail.setRoutineSequence	(rs.getInt(10));
			fieldEditDetail.setPointer			(rs.getInt(11));
			fieldEditDetail.setFieldValue		(rs.getString(12));
			
			fieldEditDetail.setCreateUser		(rs.getString(13));
			fieldEditDetail.setCreateTimestamp	(rs.getTimestamp(14));
			fieldEditDetail.setModifyUser		(rs.getString(15));
			fieldEditDetail.setModifyTimestamp	(rs.getTimestamp(16));
			
			return fieldEditDetail;
			
		}
	});
  }
}
