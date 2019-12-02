package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.DualRuleHeaderExplainBean;

public class DualRuleHeaderExplainDaoImpl implements DualRuleHeaderExplainDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(DualRuleHeaderExplainBean dualRuleHeaderExplain){

			String sql 
			
				= "INSERT INTO DUAL_RULE_HEADER_TABLE "
						+ "("
						+ " FIELD1"
						+ ",SUBFIELD1"
						+ ",FIRE1"
						+ ",FORMAT1"
						+ ",MINIMUM_LENGTH1"
						+ ",MAXIMUM_LENGTH1"
						+ ",ENCODING1"
						+ ",DATATYPE1"
						+ ",SOURCE1"
						+ ",DIRECTION1"
						+ ",EXISTENCE1"
						+ ",CHANGE1"

						+ " FIELD2"
						+ ",SUBFIELD2"
						+ ",FIRE2"
						+ ",FORMAT2"
						+ ",MINIMUM_LENGTH2"
						+ ",MAXIMUM_LENGTH2"
						+ ",ENCODING2"
						+ ",DATATYPE2"
						+ ",SOURCE2"
						+ ",DIRECTION2"
						+ ",EXISTENCE2"
						+ ",CHANGE2"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	
						+			dualRuleHeaderExplain.getField1()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getSubField1()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getFire1()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getFormat1()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getMinimumLength1()		+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getMaximumLength1()		+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getEncoding1()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getDataType1()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getSource1()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getDirection1()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getExistence1()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getChange1()				+	"'"

						+ ",'"	+	dualRuleHeaderExplain.getField2()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getSubField2()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getFire2()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getFormat2()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getMinimumLength2()		+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getMaximumLength2()		+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getEncoding2()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getDataType2()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getSource2()				+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getDirection2()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getExistence2()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getChange2()				+	"'"
						
						+ ",'"	+	dualRuleHeaderExplain.getCreateUser()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getCreateTimestamp()		+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getModifyUser()			+	"'"
						+ ",'"	+	dualRuleHeaderExplain.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(DualRuleHeaderExplainBean dualRuleHeaderExplain){
	
	String sql =
			
			" UPDATE DUAL_RULE_HEADER_TABLE    " 	+
			
			"    SET FIELD1 			= '" 	+ dualRuleHeaderExplain.getField1() 			+	"'"	+
			"      , SUBFIELD1 			= '"  	+ dualRuleHeaderExplain.getSubField1()	 		+	"'"	+
			"      , FIRE1 				= '"  	+ dualRuleHeaderExplain.getFire1()	 			+	"'"	+
			"      , FORMAT1 			= '"  	+ dualRuleHeaderExplain.getFormat1()		 	+	"'"	+
			"      , MINIMUM_LENGTH1 	= '"  	+ dualRuleHeaderExplain.getMinimumLength1() 	+	"'"	+
			"      , MAXIMUM_LENGTH1 	= '"  	+ dualRuleHeaderExplain.getMaximumLength1() 	+	"'"	+
			"      , ENCODING1 			= '"  	+ dualRuleHeaderExplain.getEncoding1() 			+	"'"	+
			"      , DATATYPE1 			= '"  	+ dualRuleHeaderExplain.getDataType1() 			+	"'"	+
			"      , SOURCE1 			= '"  	+ dualRuleHeaderExplain.getSource1() 			+	"'"	+
			"      , DIRECTION1 		= '"  	+ dualRuleHeaderExplain.getDirection1() 		+	"'"	+
			"      , EXISTENCE1 		= '"  	+ dualRuleHeaderExplain.getExistence1()	 		+	"'"	+
			"      , CHANGE1 			= '"  	+ dualRuleHeaderExplain.getChange1() 			+	"'"	+

			"      , FIELD2 			= '" 	+ dualRuleHeaderExplain.getField2() 			+	"'"	+
			"      , SUBFIELD2 			= '"  	+ dualRuleHeaderExplain.getSubField2()	 		+	"'"	+
			"      , FIRE2 				= '"  	+ dualRuleHeaderExplain.getFire2()	 			+	"'"	+
			"      , FORMAT2 			= '"  	+ dualRuleHeaderExplain.getFormat2()		 	+	"'"	+
			"      , MINIMUM_LENGTH2 	= '"  	+ dualRuleHeaderExplain.getMinimumLength2() 	+	"'"	+
			"      , MAXIMUM_LENGTH2 	= '"  	+ dualRuleHeaderExplain.getMaximumLength2() 	+	"'"	+
			"      , ENCODING2 			= '"  	+ dualRuleHeaderExplain.getEncoding2() 			+	"'"	+
			"      , DATATYPE2 			= '"  	+ dualRuleHeaderExplain.getDataType2() 			+	"'"	+
			"      , SOURCE2 			= '"  	+ dualRuleHeaderExplain.getSource2() 			+	"'"	+
			"      , DIRECTION2 		= '"  	+ dualRuleHeaderExplain.getDirection2() 		+	"'"	+
			"      , EXISTENCE2 		= '"  	+ dualRuleHeaderExplain.getExistence2()	 		+	"'"	+
			"      , CHANGE2 			= '"  	+ dualRuleHeaderExplain.getChange2() 			+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ dualRuleHeaderExplain.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ dualRuleHeaderExplain.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ dualRuleHeaderExplain.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM DUAL_RULE_HEADER_TABLE " 		+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public DualRuleHeaderExplainBean selectDualRuleHeaderExplainById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM DUAL_RULE_HEADER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<DualRuleHeaderExplainBean>(DualRuleHeaderExplainBean.class));
	
}

@Override
public List<DualRuleHeaderExplainBean> select(){
	
	return template.query( "SELECT * FROM DUAL_RULE_HEADER_TABLE WHERE ID = 10 "
						 ,new RowMapper<DualRuleHeaderExplainBean>(){
		
		public DualRuleHeaderExplainBean mapRow(ResultSet rs, int row) throws SQLException {
			
			DualRuleHeaderExplainBean dualRuleHeaderExplain = new DualRuleHeaderExplainBean();
			
			dualRuleHeaderExplain.setId					(rs.getInt(1));
			
			dualRuleHeaderExplain.setField1				(rs.getInt(2));
			dualRuleHeaderExplain.setSubField1			(rs.getInt(3));
			dualRuleHeaderExplain.setFire1				(rs.getInt(4));
			dualRuleHeaderExplain.setFormat1			(rs.getInt(5));
			dualRuleHeaderExplain.setMinimumLength1		(rs.getInt(6));
			dualRuleHeaderExplain.setMaximumLength1		(rs.getInt(7));
			dualRuleHeaderExplain.setEncoding1			(rs.getInt(8));
			dualRuleHeaderExplain.setDataType1			(rs.getInt(9));
			dualRuleHeaderExplain.setSource1			(rs.getInt(10));
			dualRuleHeaderExplain.setDirection1			(rs.getInt(11));
			dualRuleHeaderExplain.setExistence1			(rs.getInt(12));
			dualRuleHeaderExplain.setChange1			(rs.getInt(13));

			dualRuleHeaderExplain.setField2				(rs.getInt(14));
			dualRuleHeaderExplain.setSubField2			(rs.getInt(15));
			dualRuleHeaderExplain.setFire2				(rs.getInt(16));
			dualRuleHeaderExplain.setFormat2			(rs.getInt(17));
			dualRuleHeaderExplain.setMinimumLength2		(rs.getInt(18));
			dualRuleHeaderExplain.setMaximumLength2		(rs.getInt(19));
			dualRuleHeaderExplain.setEncoding2			(rs.getInt(20));
			dualRuleHeaderExplain.setDataType2			(rs.getInt(21));
			dualRuleHeaderExplain.setSource2			(rs.getInt(22));
			dualRuleHeaderExplain.setDirection2			(rs.getInt(23));
			dualRuleHeaderExplain.setExistence2			(rs.getInt(24));
			dualRuleHeaderExplain.setChange2			(rs.getInt(25));
			
			dualRuleHeaderExplain.setCreateUser			(rs.getString(26));
			dualRuleHeaderExplain.setCreateTimestamp	(rs.getTimestamp(27));
			dualRuleHeaderExplain.setModifyUser			(rs.getString(28));
			dualRuleHeaderExplain.setModifyTimestamp	(rs.getTimestamp(29));
			
			return dualRuleHeaderExplain;
			
		}
	});
  }
}
