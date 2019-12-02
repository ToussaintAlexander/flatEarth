package com.system.message.element.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.element.model.ElementBean;

public class ElementDaoImpl implements ElementDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ElementBean element){

			String sql 
			
				= "INSERT INTO ELEMENT_TABLE "
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
						+ "('"	+	element.getField()				+	"'"
						+ ",'"	+	element.getSubField()			+	"'"
						+ ",'"	+	element.getFormat()				+	"'"
						+ ",'"	+	element.getLength()				+	"'"
						+ ",'"	+	element.getEncoding()			+	"'"
						+ ",'"	+	element.getDataType()			+	"'"
						+ ",'"	+	element.getSource()				+	"'"
						+ ",'"	+	element.getDirection()			+	"'"
						+ ",'"	+	element.getExistence()			+	"'"
						+ ",'"	+	element.getChange()				+	"'"
						+ ",'"	+	element.getFieldValue()			+	"'"
						+ ",'"	+	element.getCreateUser()			+	"'"
						+ ",'"	+	element.getCreateTimestamp()	+	"'"
						+ ",'"	+	element.getModifyUser()			+	"'"
						+ ",'"	+	element.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ElementBean element){
	
	String sql =
			
			" UPDATE ELEMENT_TABLE 	   " 		+
			
			"    SET FIELD 				= '" 	+ element.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ element.getSubField()	 		+	"'"	+
			"      , FORMAT 			= '"  	+ element.getFormat()		 	+	"'"	+
			"      , LENGTH 			= '"  	+ element.getLength() 			+	"'"	+
			"      , ENCODING 			= '"  	+ element.getEncoding() 		+	"'"	+
			"      , DATATYPE 			= '"  	+ element.getDataType() 		+	"'"	+
			"      , SOURCE 			= '"  	+ element.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ element.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ element.getExistence()	 	+	"'"	+
			"      , CHANGE 			= '"  	+ element.getChange() 			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ element.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ element.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ element.getModifyTimestamp()  +	"'"	+	
			
			"  WHERE ID 				= "		+ element.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM ELEMENT_TABLE " 		+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public ElementBean selectElementById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM ELEMENT_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ElementBean>(ElementBean.class));
	
}

@Override
public List<ElementBean> select(){
	
	return template.query( "SELECT * FROM ELEMENT_TABLE WHERE ID < 11"
						 ,new RowMapper<ElementBean>(){
		
		public ElementBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ElementBean element = new ElementBean();
			
			element.setId				(rs.getInt(1));
			element.setField			(rs.getInt(2));
			element.setSubField			(rs.getInt(3));
			element.setFormat			(rs.getInt(4));
			element.setLength			(rs.getInt(5));
			element.setEncoding			(rs.getInt(6));
			element.setDataType			(rs.getInt(7));
			element.setSource			(rs.getInt(8));
			element.setDirection		(rs.getInt(9));
			element.setExistence		(rs.getInt(10));
			element.setChange			(rs.getInt(11));
			element.setFieldValue		(rs.getString(12));
			element.setCreateUser		(rs.getString(13));
			element.setCreateTimestamp	(rs.getTimestamp(14));
			element.setModifyUser		(rs.getString(15));
			element.setModifyTimestamp	(rs.getTimestamp(16));
			
			return element;
			
		}
	});
  }
}
