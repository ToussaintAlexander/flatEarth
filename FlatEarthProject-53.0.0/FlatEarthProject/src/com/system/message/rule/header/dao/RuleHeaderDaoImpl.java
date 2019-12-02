package com.system.message.rule.header.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.rule.header.model.RuleHeaderBean;

public class RuleHeaderDaoImpl implements RuleHeaderDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RuleHeaderBean ruleHeader){

			String sql 
			
				= "INSERT INTO RULE_HEADER_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FIRE"
						+ ",FORMAT"
						+ ",MINIMUM_LENGTH"
						+ ",MAXIMUM_LENGTH"
						+ ",ENCODING"
						+ ",DATA_TYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",DATE_OF_BIRTH"
						+ ",CHANGE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	ruleHeader.getField()				+	"'"
						+ ",'"	+	ruleHeader.getSubField()			+	"'"
						+ ",'"	+	ruleHeader.getFire()				+	"'"
						+ ",'"	+	ruleHeader.getFormat()				+	"'"
						+ ",'"	+	ruleHeader.getMinimumLength()		+	"'"
						+ ",'"	+	ruleHeader.getMaximumLength()		+	"'"
						+ ",'"	+	ruleHeader.getEncoding()			+	"'"
						+ ",'"	+	ruleHeader.getDataType()			+	"'"
						+ ",'"	+	ruleHeader.getSource()				+	"'"
						+ ",'"	+	ruleHeader.getDirection()			+	"'"
						+ ",'"	+	ruleHeader.getExistence()			+	"'"
						+ ",'"	+	ruleHeader.getCreateUser()			+	"'"
						+ ",'"	+	ruleHeader.getCreateTimestamp()		+	"'"
						+ ",'"	+	ruleHeader.getModifyUser()			+	"'"
						+ ",'"	+	ruleHeader.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RuleHeaderBean ruleHeader){
	
	String sql =
			
			" UPDATE RULE_HEADER_TABLE 	   " 	+
			
			"    SET FIELD 				= '" 	+ ruleHeader.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ ruleHeader.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ ruleHeader.getFire()		 		+	"'"	+
			"      , FORMAT 			= '"  	+ ruleHeader.getFormat()		 	+	"'"	+
			"      , MINIMUM_LENGTH 	= '"  	+ ruleHeader.getMinimumLength() 	+	"'"	+
			"      , MAXIMUM_LENGTH 	= '"  	+ ruleHeader.getMaximumLength() 	+	"'"	+
			"      , ENCODING 			= '"  	+ ruleHeader.getEncoding() 			+	"'"	+
			"      , DATA_TYPE 			= '"  	+ ruleHeader.getDataType() 			+	"'"	+
			"      , SOURCE 			= '"  	+ ruleHeader.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ ruleHeader.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ ruleHeader.getExistence()	 		+	"'"	+
			"      , CHANGE 			= '"  	+ ruleHeader.getChange() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ ruleHeader.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ ruleHeader.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ ruleHeader.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RULE_HEADER_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public RuleHeaderBean selectRuleHeaderById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_HEADER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RuleHeaderBean>(RuleHeaderBean.class));
	
}

@Override
public List<RuleHeaderBean> select(){
	
	return template.query( "SELECT * FROM RULE_HEADER_TABLE"
						 ,new RowMapper<RuleHeaderBean>(){
		
		public RuleHeaderBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RuleHeaderBean ruleHeader = new RuleHeaderBean();
			
			ruleHeader.setId				(rs.getInt(1));
			ruleHeader.setField				(rs.getInt(2));
			ruleHeader.setSubField			(rs.getInt(3));
			ruleHeader.setFire				(rs.getInt(4));
			ruleHeader.setFormat			(rs.getInt(5));
			ruleHeader.setMinimumLength		(rs.getInt(6));
			ruleHeader.setMaximumLength		(rs.getInt(7));
			ruleHeader.setEncoding			(rs.getInt(8));
			ruleHeader.setDataType			(rs.getInt(9));
			ruleHeader.setSource			(rs.getInt(10));
			ruleHeader.setDirection			(rs.getInt(11));
			ruleHeader.setExistence			(rs.getInt(12));
			ruleHeader.setChange			(rs.getInt(13));
			ruleHeader.setCreateUser		(rs.getString(14));
			ruleHeader.setCreateTimestamp	(rs.getTimestamp(15));
			ruleHeader.setModifyUser		(rs.getString(16));
			ruleHeader.setModifyTimestamp	(rs.getTimestamp(17));
			
			return ruleHeader;
			
		}
	});
  }
}

					