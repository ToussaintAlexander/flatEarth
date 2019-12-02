package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.SingleElementExplainBean;

public class SingleElementExplainDaoImpl implements SingleElementExplainDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SingleElementExplainBean singleElementExplain){

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
						+ "('"	+	singleElementExplain.getField()				+	"'"
						+ ",'"	+	singleElementExplain.getSubField()			+	"'"
						+ ",'"	+	singleElementExplain.getFormat()			+	"'"
						+ ",'"	+	singleElementExplain.getLength()			+	"'"
						+ ",'"	+	singleElementExplain.getEncoding()			+	"'"
						+ ",'"	+	singleElementExplain.getDataType()			+	"'"
						+ ",'"	+	singleElementExplain.getSource()			+	"'"
						+ ",'"	+	singleElementExplain.getDirection()			+	"'"
						+ ",'"	+	singleElementExplain.getExistence()			+	"'"
						+ ",'"	+	singleElementExplain.getChange()			+	"'"
						+ ",'"	+	singleElementExplain.getFieldValue()		+	"'"
						+ ",'"	+	singleElementExplain.getCreateUser()		+	"'"
						+ ",'"	+	singleElementExplain.getCreateTimestamp()	+	"'"
						+ ",'"	+	singleElementExplain.getModifyUser()		+	"'"
						+ ",'"	+	singleElementExplain.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SingleElementExplainBean singleElementExplain){
	
	String sql =
			
			" UPDATE ELEMENT_TABLE 	   " 		+
			
			"    SET FIELD 				= '" 	+ singleElementExplain.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ singleElementExplain.getSubField()	 	+	"'"	+
			"      , FORMAT 			= '"  	+ singleElementExplain.getFormat()		 	+	"'"	+
			"      , LENGTH 			= '"  	+ singleElementExplain.getLength() 			+	"'"	+
			"      , ENCODING 			= '"  	+ singleElementExplain.getEncoding() 		+	"'"	+
			"      , DATATYPE 			= '"  	+ singleElementExplain.getDataType() 		+	"'"	+
			"      , SOURCE 			= '"  	+ singleElementExplain.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ singleElementExplain.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ singleElementExplain.getExistence()	 	+	"'"	+
			"      , CHANGE 			= '"  	+ singleElementExplain.getChange() 			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ singleElementExplain.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ singleElementExplain.getModifyUser()  	+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ singleElementExplain.getModifyTimestamp() +	"'"	+	
			
			"  WHERE ID 				= "		+ singleElementExplain.getId()				+ 	"";
	
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
public SingleElementExplainBean selectSingleElementExplainById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM ELEMENT_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SingleElementExplainBean>(SingleElementExplainBean.class));
	
}

@Override
public List<SingleElementExplainBean> select(){
	
	return template.query( "SELECT * FROM ELEMENT_TABLE WHERE ID < 11"
						 ,new RowMapper<SingleElementExplainBean>(){
		
		public SingleElementExplainBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SingleElementExplainBean singleElementExplain = new SingleElementExplainBean();
			
			singleElementExplain.setId				(rs.getInt(1));
			singleElementExplain.setField			(rs.getInt(2));
			singleElementExplain.setSubField		(rs.getInt(3));
			singleElementExplain.setFormat			(rs.getInt(4));
			singleElementExplain.setLength			(rs.getInt(5));
			singleElementExplain.setEncoding		(rs.getInt(6));
			singleElementExplain.setDataType		(rs.getInt(7));
			singleElementExplain.setSource			(rs.getInt(8));
			singleElementExplain.setDirection		(rs.getInt(9));
			singleElementExplain.setExistence		(rs.getInt(10));
			singleElementExplain.setChange			(rs.getInt(11));
			singleElementExplain.setFieldValue		(rs.getString(12));
			singleElementExplain.setCreateUser		(rs.getString(13));
			singleElementExplain.setCreateTimestamp	(rs.getTimestamp(14));
			singleElementExplain.setModifyUser		(rs.getString(15));
			singleElementExplain.setModifyTimestamp	(rs.getTimestamp(16));
			
			return singleElementExplain;
			
		}
	});
  }
}
