package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.FieldEditHeaderBean;

public class FieldEditHeaderDaoImpl implements FieldEditHeaderDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(FieldEditHeaderBean fieldEditHeader){

			String sql 
			
				= "INSERT INTO FIELD_EDIT_HEADER_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FORMAT"
						+ ",MINIMUM_LENGTH"
						+ ",MAXIMUM_LENGTH"
						+ ",ENCODING"
						+ ",DATA_TYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",CHANGE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	fieldEditHeader.getField()				+	"'"
						+ ",'"	+	fieldEditHeader.getSubfield()			+	"'"
						+ ",'"	+	fieldEditHeader.getFormat()				+	"'"
						+ ",'"	+	fieldEditHeader.getMinimumLength()		+	"'"
						+ ",'"	+	fieldEditHeader.getMaximumLength()		+	"'"
						+ ",'"	+	fieldEditHeader.getEncoding()			+	"'"
						+ ",'"	+	fieldEditHeader.getDatatype()			+	"'"
						+ ",'"	+	fieldEditHeader.getSource()				+	"'"
						+ ",'"	+	fieldEditHeader.getDirection()			+	"'"
						+ ",'"	+	fieldEditHeader.getExistence()			+	"'"
						+ ",'"	+	fieldEditHeader.getChange()				+	"'"
						+ ",'"	+	fieldEditHeader.getCreateUser()			+	"'"
						+ ",'"	+	fieldEditHeader.getCreateTimestamp()	+	"'"
						+ ",'"	+	fieldEditHeader.getModifyUser()			+	"'"
						+ ",'"	+	fieldEditHeader.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(FieldEditHeaderBean fieldEditHeader){
	
	String sql =
			
			" UPDATE FIELD_EDIT_HEADER_TABLE  "	+
			
			"    SET FIELD 				= '" 	+ fieldEditHeader.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ fieldEditHeader.getSubfield()	 		+	"'"	+
			"      , FORMAT 			= '"  	+ fieldEditHeader.getFormat()			+	"'"	+
			"      , MINIMUM_LENGTH 	= '"  	+ fieldEditHeader.getMinimumLength()	 	+	"'"	+
			"      , MAXIMUM_LENGTH 	= '"  	+ fieldEditHeader.getMaximumLength()		+	"'"	+
			"      , ENCODING 			= '"  	+ fieldEditHeader.getEncoding()	 		+	"'"	+
			"      , DATA_TYPE 			= '"  	+ fieldEditHeader.getDatatype()			+	"'"	+
			"      , SOURCE 			= '"  	+ fieldEditHeader.getSource()	 		+	"'"	+
			"      , DIRECTION 			= '"  	+ fieldEditHeader.getDirection()			+	"'"	+
			"      , EXISTENCE 			= '"  	+ fieldEditHeader.getExistence()	 		+	"'"	+
			"      , CHANGE 			= '"  	+ fieldEditHeader.getChange()			+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ fieldEditHeader.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ fieldEditHeader.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ fieldEditHeader.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id, int sequence){
	
	String sql =
			
			"DELETE FROM FIELD_EDIT_HEADER_TABLE "	+
			" WHERE ID = 		"					+
			"   AND SEQUENCE = "					+	
			       id								+
			","										+       
			       sequence							+       
			" ";
	
	return template.update(sql);
	
}

@Override
public FieldEditHeaderBean selectFieldEditHeaderById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM FIELD_EDIT_HEADER_TABLE "	+
		 "  WHERE ID		   = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<FieldEditHeaderBean>(FieldEditHeaderBean.class));
	
}

@Override
public List<FieldEditHeaderBean> select(){
	
	return template.query( "SELECT * FROM FIELD_EDIT_HEADER_TABLE"
						 ,new RowMapper<FieldEditHeaderBean>(){
		
		public FieldEditHeaderBean mapRow(ResultSet rs, int row) throws SQLException {
			
			FieldEditHeaderBean fieldEditHeader = new FieldEditHeaderBean();
			
			fieldEditHeader.setId				(rs.getInt(1));
			fieldEditHeader.setField				(rs.getInt(3));
			fieldEditHeader.setSubfield			(rs.getInt(4));
			fieldEditHeader.setFormat			(rs.getInt(5));
			fieldEditHeader.setMinimumLength		(rs.getInt(6));
			fieldEditHeader.setMaximumLength		(rs.getInt(7));
			fieldEditHeader.setEncoding			(rs.getInt(8));
			fieldEditHeader.setDatatype			(rs.getInt(9));
			fieldEditHeader.setSource			(rs.getInt(10));
			fieldEditHeader.setDirection			(rs.getInt(11));
			fieldEditHeader.setExistence			(rs.getInt(12));
			fieldEditHeader.setChange			(rs.getInt(13));
			
			fieldEditHeader.setCreateUser		(rs.getString(14));
			fieldEditHeader.setCreateTimestamp	(rs.getTimestamp(15));
			fieldEditHeader.setModifyUser		(rs.getString(16));
			fieldEditHeader.setModifyTimestamp	(rs.getTimestamp(17));
			
			return fieldEditHeader;
			
		}
	});
  }
}
