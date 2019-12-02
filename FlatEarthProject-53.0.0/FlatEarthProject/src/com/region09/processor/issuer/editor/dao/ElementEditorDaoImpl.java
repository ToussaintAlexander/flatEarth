package com.region09.processor.issuer.editor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.editor.model.ElementEditorBean;

public class ElementEditorDaoImpl implements ElementEditorDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ElementEditorBean elementScreen){

			String sql 
			
				= "INSERT INTO ELEMENT_EDITOR_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FORMAT"
						+ ",LENGTH"
						+ ",ENCODING"
						+ ",DATA_TYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",DATE_OF_BIRTH"
						+ ",CHANGE"
						+ ",FIELD_VALUE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	elementScreen.getField()			+	"'"
						+ ",'"	+	elementScreen.getSubField()			+	"'"
						+ ",'"	+	elementScreen.getFormat()			+	"'"
						+ ",'"	+	elementScreen.getLength()			+	"'"
						+ ",'"	+	elementScreen.getEncoding()			+	"'"
						+ ",'"	+	elementScreen.getDataType()			+	"'"
						+ ",'"	+	elementScreen.getSource()			+	"'"
						+ ",'"	+	elementScreen.getDirection()		+	"'"
						+ ",'"	+	elementScreen.getExistence()		+	"'"
						+ ",'"	+	elementScreen.getChange()			+	"'"
						+ ",'"	+	elementScreen.getFieldValue()		+	"'"
						+ ",'"	+	elementScreen.getCreateUser()		+	"'"
						+ ",'"	+	elementScreen.getCreateTimestamp()	+	"'"
						+ ",'"	+	elementScreen.getModifyUser()		+	"'"
						+ ",'"	+	elementScreen.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ElementEditorBean elementScreen){
	
	String sql =
			
			" UPDATE ELEMENT_EDITOR_TABLE  " 	+
			
			"    SET FIELD 				= '" 	+ elementScreen.getField() 				+	"'"	+
			"      , SUBFIELD 			= '"  	+ elementScreen.getSubField()	 		+	"'"	+
			"      , FORMAT 			= '"  	+ elementScreen.getFormat()		 		+	"'"	+
			"      , LENGTH 			= '"  	+ elementScreen.getLength() 			+	"'"	+
			"      , ENCODING 			= '"  	+ elementScreen.getEncoding() 			+	"'"	+
			"      , DATA_TYPE 			= '"  	+ elementScreen.getDataType() 			+	"'"	+
			"      , SOURCE 			= '"  	+ elementScreen.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ elementScreen.getDirection() 			+	"'"	+
			"      , EXISTENCE 			= '"  	+ elementScreen.getExistence()	 		+	"'"	+
			"      , CHANGE 			= '"  	+ elementScreen.getChange() 			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ elementScreen.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ elementScreen.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ elementScreen.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ elementScreen.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM ELEMENT_EDITOR_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public ElementEditorBean selectElementEditorById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM ELEMENT_EDITOR_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ElementEditorBean>(ElementEditorBean.class));
	
}

@Override
public List<ElementEditorBean> select(){
	
	return template.query( "SELECT * FROM ELEMENT_EDITOR_TABLE WHERE ID < 11"
						 ,new RowMapper<ElementEditorBean>(){
		
		public ElementEditorBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ElementEditorBean elementScreen = new ElementEditorBean();
			
			elementScreen.setId					(rs.getInt(1));
			elementScreen.setField				(rs.getInt(2));
			elementScreen.setSubField			(rs.getInt(3));
			elementScreen.setFormat				(rs.getInt(4));
			elementScreen.setLength				(rs.getInt(5));
			elementScreen.setEncoding			(rs.getInt(6));
			elementScreen.setDataType			(rs.getInt(7));
			elementScreen.setSource				(rs.getInt(8));
			elementScreen.setDirection			(rs.getInt(9));
			elementScreen.setExistence			(rs.getInt(10));
			elementScreen.setChange				(rs.getInt(11));
			elementScreen.setFieldValue			(rs.getString(12));
			elementScreen.setCreateUser			(rs.getString(13));
			elementScreen.setCreateTimestamp	(rs.getTimestamp(14));
			elementScreen.setModifyUser			(rs.getString(15));
			elementScreen.setModifyTimestamp	(rs.getTimestamp(16));
			
			return elementScreen;
			
		}
	});
  }
}
