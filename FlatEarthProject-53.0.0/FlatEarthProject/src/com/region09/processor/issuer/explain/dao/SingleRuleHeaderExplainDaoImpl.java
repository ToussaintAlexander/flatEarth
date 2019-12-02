package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.SingleRuleHeaderExplainBean;

public class SingleRuleHeaderExplainDaoImpl implements SingleRuleHeaderExplainDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SingleRuleHeaderExplainBean singleRuleHeader){

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
						+ ",DATATYPE"
						+ ",SOURCE"
						+ ",DIRECTION"
						+ ",EXISTENCE"
						+ ",CHANGE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	singleRuleHeader.getField()				+	"'"
						+ ",'"	+	singleRuleHeader.getSubField()			+	"'"
						+ ",'"	+	singleRuleHeader.getFire()				+	"'"
						+ ",'"	+	singleRuleHeader.getFormat()			+	"'"
						+ ",'"	+	singleRuleHeader.getMinimumLength()		+	"'"
						+ ",'"	+	singleRuleHeader.getMaximumLength()		+	"'"
						+ ",'"	+	singleRuleHeader.getEncoding()			+	"'"
						+ ",'"	+	singleRuleHeader.getDataType()			+	"'"
						+ ",'"	+	singleRuleHeader.getSource()			+	"'"
						+ ",'"	+	singleRuleHeader.getDirection()			+	"'"
						+ ",'"	+	singleRuleHeader.getExistence()			+	"'"
						+ ",'"	+	singleRuleHeader.getChange()			+	"'"
						+ ",'"	+	singleRuleHeader.getCreateUser()		+	"'"
						+ ",'"	+	singleRuleHeader.getCreateTimestamp()	+	"'"
						+ ",'"	+	singleRuleHeader.getModifyUser()		+	"'"
						+ ",'"	+	singleRuleHeader.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SingleRuleHeaderExplainBean singleRuleHeader){
	
	String sql =
			
			" UPDATE RULE_HEADER_TABLE   " 	+
			
			"    SET FIELD 				= '" 	+ singleRuleHeader.getField() 				+	"'"	+
			"      , SUBFIELD 			= '"  	+ singleRuleHeader.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ singleRuleHeader.getFire()	 			+	"'"	+
			"      , FORMAT 			= '"  	+ singleRuleHeader.getFormat()		 		+	"'"	+
			"      , MINIMUM_LENGTH 	= '"  	+ singleRuleHeader.getMinimumLength() 		+	"'"	+
			"      , MAXIMUM_LENGTH 	= '"  	+ singleRuleHeader.getMaximumLength() 		+	"'"	+
			"      , ENCODING 			= '"  	+ singleRuleHeader.getEncoding() 			+	"'"	+
			"      , DATATYPE 			= '"  	+ singleRuleHeader.getDataType() 			+	"'"	+
			"      , SOURCE 			= '"  	+ singleRuleHeader.getSource() 				+	"'"	+
			"      , DIRECTION 			= '"  	+ singleRuleHeader.getDirection() 			+	"'"	+
			"      , EXISTENCE 			= '"  	+ singleRuleHeader.getExistence()	 		+	"'"	+
			"      , CHANGE 			= '"  	+ singleRuleHeader.getChange() 				+	"'"	+
			"      , MODIFY_USER		= '" 	+ singleRuleHeader.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ singleRuleHeader.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ singleRuleHeader.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RULE_HEADER_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public SingleRuleHeaderExplainBean selectSingleRuleHeaderExplainById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_HEADER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SingleRuleHeaderExplainBean>(SingleRuleHeaderExplainBean.class));
	
}

@Override
public List<SingleRuleHeaderExplainBean> select(){
	
	return template.query( "SELECT * FROM RULE_HEADER_TABLE "
						 ,new RowMapper<SingleRuleHeaderExplainBean>(){
		
		public SingleRuleHeaderExplainBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SingleRuleHeaderExplainBean singleRuleHeader = new SingleRuleHeaderExplainBean();
			
			singleRuleHeader.setId					(rs.getInt(1));
			singleRuleHeader.setField				(rs.getInt(2));
			singleRuleHeader.setSubField			(rs.getInt(3));
			singleRuleHeader.setFire				(rs.getInt(4));
			singleRuleHeader.setFormat				(rs.getInt(5));
			singleRuleHeader.setMinimumLength		(rs.getInt(6));
			singleRuleHeader.setMaximumLength		(rs.getInt(7));
			singleRuleHeader.setEncoding			(rs.getInt(8));
			singleRuleHeader.setDataType			(rs.getInt(9));
			singleRuleHeader.setSource				(rs.getInt(10));
			singleRuleHeader.setDirection			(rs.getInt(11));
			singleRuleHeader.setExistence			(rs.getInt(12));
			singleRuleHeader.setChange				(rs.getInt(13));
			singleRuleHeader.setCreateUser			(rs.getString(14));
			singleRuleHeader.setCreateTimestamp		(rs.getTimestamp(15));
			singleRuleHeader.setModifyUser			(rs.getString(16));
			singleRuleHeader.setModifyTimestamp		(rs.getTimestamp(17));
			
			return singleRuleHeader;
			
		}
	});
  }
}
