package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.DualElementExplainBean;

public class DualElementExplainDaoImpl implements DualElementExplainDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public int insert(DualElementExplainBean dualElementExplain) {
		String sql 
		
		= "INSERT INTO DUAL_ELEMENT_TABLE "
				+ "("
				
				+ " FIELD1"
				+ ",SUBFIELD1"
				+ ",FORMAT1"
				+ ",LENGTH1"
				+ ",ENCODING1"
				+ ",DATATYPE1"
				+ ",SOURCE1"
				+ ",DIRECTION1"
				+ ",EXISTENCE1"
				+ ",CHANGE1"
				+ ",FIELD_VALUE1"

				+ " FIELD2"
				+ ",SUBFIELD2"
				+ ",FORMAT2"
				+ ",LENGTH2"
				+ ",ENCODING2"
				+ ",DATATYPE2"
				+ ",SOURCE2"
				+ ",DIRECTION2"
				+ ",EXISTENCE2"
				+ ",CHANGE2"
				+ ",FIELD_VALUE2"
				
				+ ",CREATE_USER"
				+ ",CREATE_TIMESTAMP"
				+ ",MODIFY_USER"
				+ ",MODIFY_TIMESTAMP"
				+ ") "
				+ "VALUES "
				+ "('"	
				+			dualElementExplain.getField1()				+	"'"
				+ ",'"	+	dualElementExplain.getSubField1()			+	"'"
				+ ",'"	+	dualElementExplain.getFormat1()				+	"'"
				+ ",'"	+	dualElementExplain.getLength1()				+	"'"
				+ ",'"	+	dualElementExplain.getEncoding1()			+	"'"
				+ ",'"	+	dualElementExplain.getDataType1()			+	"'"
				+ ",'"	+	dualElementExplain.getSource1()				+	"'"
				+ ",'"	+	dualElementExplain.getDirection1()			+	"'"
				+ ",'"	+	dualElementExplain.getExistence1()			+	"'"
				+ ",'"	+	dualElementExplain.getChange1()				+	"'"
				+ ",'"	+	dualElementExplain.getFieldValue1()			+	"'"

				+ ",'"	+	dualElementExplain.getField2()				+	"'"
				+ ",'"	+	dualElementExplain.getSubField2()			+	"'"
				+ ",'"	+	dualElementExplain.getFormat2()				+	"'"
				+ ",'"	+	dualElementExplain.getLength2()				+	"'"
				+ ",'"	+	dualElementExplain.getEncoding2()			+	"'"
				+ ",'"	+	dualElementExplain.getDataType2()			+	"'"
				+ ",'"	+	dualElementExplain.getSource2()				+	"'"
				+ ",'"	+	dualElementExplain.getDirection2()			+	"'"
				+ ",'"	+	dualElementExplain.getExistence2()			+	"'"
				+ ",'"	+	dualElementExplain.getChange2()				+	"'"
				+ ",'"	+	dualElementExplain.getFieldValue2()			+	"'"
				
				+ ",'"	+	dualElementExplain.getCreateUser()			+	"'"
				+ ",'"	+	dualElementExplain.getCreateTimestamp()		+	"'"
				+ ",'"	+	dualElementExplain.getModifyUser()			+	"'"
				+ ",'"	+	dualElementExplain.getModifyTimestamp()		+	"'"
				+ ")";

		return template.update(sql);
	}

	@Override
	public int update(DualElementExplainBean dualElementExplain) {
		
		String sql =
				
				" UPDATE DUAL_ELEMENT_TABLE    " 	+
				
				"    SET FIELD1 			= '" 	+ dualElementExplain.getField1() 			+	"'"	+
				"      , SUBFIELD1 			= '"  	+ dualElementExplain.getSubField1()	 		+	"'"	+
				"      , FORMAT1 			= '"  	+ dualElementExplain.getFormat1()		 	+	"'"	+
				"      , LENGTH1 			= '"  	+ dualElementExplain.getLength1() 			+	"'"	+
				"      , ENCODING1 			= '"  	+ dualElementExplain.getEncoding1() 		+	"'"	+
				"      , DATATYPE1 			= '"  	+ dualElementExplain.getDataType1() 		+	"'"	+
				"      , SOURCE1 			= '"  	+ dualElementExplain.getSource1() 			+	"'"	+
				"      , DIRECTION1 		= '"  	+ dualElementExplain.getDirection1() 		+	"'"	+
				"      , EXISTENCE1 		= '"  	+ dualElementExplain.getExistence1()	 	+	"'"	+
				"      , CHANGE1 			= '"  	+ dualElementExplain.getChange1() 			+	"'"	+
				"      , FIELD_VALUE1 		= '"  	+ dualElementExplain.getFieldValue1() 		+	"'"	+

				"      , FIELD2 			= '" 	+ dualElementExplain.getField2() 			+	"'"	+
				"      , SUBFIELD2 			= '"  	+ dualElementExplain.getSubField2()	 		+	"'"	+
				"      , FORMAT2 			= '"  	+ dualElementExplain.getFormat2()		 	+	"'"	+
				"      , LENGTH2 			= '"  	+ dualElementExplain.getLength2() 			+	"'"	+
				"      , ENCODING2 			= '"  	+ dualElementExplain.getEncoding2() 		+	"'"	+
				"      , DATATYPE2 			= '"  	+ dualElementExplain.getDataType2() 		+	"'"	+
				"      , SOURCE2 			= '"  	+ dualElementExplain.getSource2() 			+	"'"	+
				"      , DIRECTION2 		= '"  	+ dualElementExplain.getDirection2() 		+	"'"	+
				"      , EXISTENCE2 		= '"  	+ dualElementExplain.getExistence2()	 	+	"'"	+
				"      , CHANGE2 			= '"  	+ dualElementExplain.getChange2() 			+	"'"	+
				"      , FIELD_VALUE2 		= '"  	+ dualElementExplain.getFieldValue2() 		+	"'"	+
				
				"      , MODIFY_USER		= '" 	+ dualElementExplain.getModifyUser()  		+	"'"	+
				"      , MODIFY_TIMESTAMP	= '" 	+ dualElementExplain.getModifyTimestamp()  +	"'"	+	
				
				"  WHERE ID 				= "		+ dualElementExplain.getId()				+ 	"";
		
		return template.update(sql);
	}

	@Override
	public int delete(int id) {
		
		String sql =
				
				" DELETE FROM DUAL_ELEMENT_TABLE " 	+
				"  WHERE ID = "						+
				         id							+
				"";
		
		return template.update(sql);
	}

	@Override
	public DualElementExplainBean selectDualElementExplainById(int id) {
		
		String sql 
		
		= "SELECT * "
		+ "  FROM DUAL_ELEMENT_TABLE "
		+ " WHERE ID = ?";
	
		return template.queryForObject( sql
								      , new Object[]{id}
								      , new BeanPropertyRowMapper<DualElementExplainBean>(DualElementExplainBean.class));
	
	}

	@Override
	public List<DualElementExplainBean> select() {
		return template.query( "SELECT * FROM DUAL_ELEMENT_TABLE WHERE ID = 2"
				             ,new RowMapper<DualElementExplainBean>(){

	       public DualElementExplainBean mapRow(ResultSet rs, int row) throws SQLException {
	
	    	   DualElementExplainBean element = new DualElementExplainBean();
	
	    	   element.setId				(rs.getInt(1));
	    	   
	    	   element.setField1			(rs.getInt(2));
	    	   element.setSubField1			(rs.getInt(3));
	    	   element.setFormat1			(rs.getInt(4));
	    	   element.setLength1			(rs.getInt(5));
	    	   element.setEncoding1			(rs.getInt(6));
	    	   element.setDataType1			(rs.getInt(7));
	    	   element.setSource1			(rs.getInt(8));
	    	   element.setDirection1		(rs.getInt(9));
	    	   element.setExistence1		(rs.getInt(10));
	    	   element.setChange1			(rs.getInt(11));
	    	   element.setFieldValue1		(rs.getString(12));
	    	   
	    	   element.setField2			(rs.getInt(13));
	    	   element.setSubField2			(rs.getInt(14));
	    	   element.setFormat2			(rs.getInt(15));
	    	   element.setLength2			(rs.getInt(16));
	    	   element.setEncoding2			(rs.getInt(17));
	    	   element.setDataType2			(rs.getInt(18));
	    	   element.setSource2			(rs.getInt(19));
	    	   element.setDirection2		(rs.getInt(20));
	    	   element.setExistence2		(rs.getInt(21));
	    	   element.setChange2			(rs.getInt(22));
	    	   element.setFieldValue2		(rs.getString(23));
	    	   
	    	   element.setCreateUser		(rs.getString(24));
	    	   element.setCreateTimestamp	(rs.getTimestamp(25));
	    	   element.setModifyUser		(rs.getString(26));
	    	   element.setModifyTimestamp	(rs.getTimestamp(27));
	
	    	   return element;
	
	       }
	 });
   }
}
