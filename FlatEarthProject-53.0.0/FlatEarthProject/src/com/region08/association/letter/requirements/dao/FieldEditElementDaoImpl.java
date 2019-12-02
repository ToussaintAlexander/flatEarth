package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.FieldEditElementBean;

public class FieldEditElementDaoImpl implements FieldEditElementDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(FieldEditElementBean fieldEditElement){

			String sql 
			
				= "INSERT INTO FIELD_EDIT_ELEMENT_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FORMAT"
						+ ",LENGTH"
						+ ",ENCODING"
						+ ",DATATYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",CHANGE"
						+ ",FIELD_VALUE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	fieldEditElement.getField()				+	"'"
						+ ",'"	+	fieldEditElement.getSubField()			+	"'"
						+ ",'"	+	fieldEditElement.getFormat()			+	"'"
						+ ",'"	+	fieldEditElement.getLength()			+	"'"
						+ ",'"	+	fieldEditElement.getEncoding()			+	"'"
						+ ",'"	+	fieldEditElement.getDataType()			+	"'"
						+ ",'"	+	fieldEditElement.getSource()			+	"'"
						+ ",'"	+	fieldEditElement.getDirection()			+	"'"
						+ ",'"	+	fieldEditElement.getExistence()			+	"'"
						+ ",'"	+	fieldEditElement.getChange()			+	"'"
						+ ",'"	+	fieldEditElement.getFieldValue()		+	"'"
						+ ",'"	+	fieldEditElement.getCreateUser()		+	"'"
						+ ",'"	+	fieldEditElement.getCreateTimestamp()	+	"'"
						+ ",'"	+	fieldEditElement.getModifyUser()		+	"'"
						+ ",'"	+	fieldEditElement.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(FieldEditElementBean fieldEditElement){
	
	String sql =
			
			" UPDATE FIELD_EDIT_ELEMENT_TABLE 	   " 		+
			
			"    SET FIELD 				= '" 	+ fieldEditElement.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ fieldEditElement.getSubField()	 	+	"'"	+
			"      , FORMAT 			= '"  	+ fieldEditElement.getFormat()		 	+	"'"	+
			"      , LENGTH 			= '"  	+ fieldEditElement.getLength() 			+	"'"	+
			"      , ENCODING 			= '"  	+ fieldEditElement.getEncoding() 		+	"'"	+
			"      , DATATYPE 			= '"  	+ fieldEditElement.getDataType() 		+	"'"	+
			"      , SOURCE 			= '"  	+ fieldEditElement.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ fieldEditElement.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ fieldEditElement.getExistence()	 	+	"'"	+
			"      , CHANGE 			= '"  	+ fieldEditElement.getChange() 			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ fieldEditElement.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ fieldEditElement.getModifyUser()  	+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ fieldEditElement.getModifyTimestamp() +	"'"	+	
			
			"  WHERE ID 				= "		+ fieldEditElement.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM FIELD_EDIT_ELEMENT_TABLE " 		+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public FieldEditElementBean selectFieldEditElementById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM FIELD_EDIT_ELEMENT_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<FieldEditElementBean>(FieldEditElementBean.class));
	
}

@Override
public List<FieldEditElementBean> select(){
	
	return template.query( "SELECT * FROM FIELD_EDIT_ELEMENT_TABLE WHERE ID < 11"
						 ,new RowMapper<FieldEditElementBean>(){
		
		public FieldEditElementBean mapRow(ResultSet rs, int row) throws SQLException {
			
			FieldEditElementBean fieldEditElement = new FieldEditElementBean();
			
			fieldEditElement.setId				(rs.getInt(1));
			fieldEditElement.setField			(rs.getInt(2));
			fieldEditElement.setSubField		(rs.getInt(3));
			fieldEditElement.setFormat			(rs.getInt(4));
			fieldEditElement.setLength			(rs.getInt(5));
			fieldEditElement.setEncoding		(rs.getInt(6));
			fieldEditElement.setDataType		(rs.getInt(7));
			fieldEditElement.setSource			(rs.getInt(8));
			fieldEditElement.setDirection		(rs.getInt(9));
			fieldEditElement.setExistence		(rs.getInt(10));
			fieldEditElement.setChange			(rs.getInt(11));
			fieldEditElement.setFieldValue		(rs.getString(12));
			fieldEditElement.setCreateUser		(rs.getString(13));
			fieldEditElement.setCreateTimestamp	(rs.getTimestamp(14));
			fieldEditElement.setModifyUser		(rs.getString(15));
			fieldEditElement.setModifyTimestamp	(rs.getTimestamp(16));
			
			return fieldEditElement;
			
		}
	});
  }
}
