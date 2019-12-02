package com.system.message.rule.detail.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.rule.detail.model.RuleDetailBean;

public class RuleDetailDaoImpl implements RuleDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RuleDetailBean ruleDetail){

			String sql 
			
				= "INSERT INTO RULE_DETAIL_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ ",FIRE"
						+ ",TYPE"
						+ ",GROUP"
						+ ",BIN_LEVEL"
						+ ",ACCOUNT_LEVEL"
						+ ",TRANSACTION_LEVEL"
						+ ",POINTER"
						+ ",SEQ"
						+ ",FIELD_VALUE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	ruleDetail.getField()				+	"'"
						+ ",'"	+	ruleDetail.getSubField()			+	"'"
						+ ",'"	+	ruleDetail.getFire()				+	"'"
						+ ",'"	+	ruleDetail.getType()				+	"'"
						+ ",'"	+	ruleDetail.getGroup()				+	"'"
						+ ",'"	+	ruleDetail.getBinLevel()			+	"'"
						+ ",'"	+	ruleDetail.getAccountLevel()		+	"'"
						+ ",'"	+	ruleDetail.getTransactionLevel()	+	"'"
						+ ",'"	+	ruleDetail.getPointer()				+	"'"
						+ ",'"	+	ruleDetail.getSeq()					+	"'"
						+ ",'"	+	ruleDetail.getFieldValue()			+	"'"
						+ ",'"	+	ruleDetail.getCreateUser()			+	"'"
						+ ",'"	+	ruleDetail.getCreateTimestamp()		+	"'"
						+ ",'"	+	ruleDetail.getModifyUser()			+	"'"
						+ ",'"	+	ruleDetail.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RuleDetailBean ruleDetail){
	
	String sql =
			
			" UPDATE RULE_DETAIL_TABLE 	   " 	+
			
			"    SET FIELD 				= '" 	+ ruleDetail.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ ruleDetail.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ ruleDetail.getFire()		 		+	"'"	+
			"      , TYPE 				= '"  	+ ruleDetail.getType() 				+	"'"	+
			"      , GROUP 				= '"  	+ ruleDetail.getGroup() 			+	"'"	+
			"      , BIN_LEVEL 			= '"  	+ ruleDetail.getBinLevel() 			+	"'"	+
			"      , ACCOUNT_LEVEL 		= '"  	+ ruleDetail.getAccountLevel() 		+	"'"	+
			"      , TRANSACTION_LEVEL 	= '"  	+ ruleDetail.getTransactionLevel() 	+	"'"	+
			"      , POINTER 			= '"  	+ ruleDetail.getPointer()	 		+	"'"	+
			"      , SEQUENCE 			= '"  	+ ruleDetail.getSeq() 				+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ ruleDetail.getFieldValue() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ ruleDetail.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ ruleDetail.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ ruleDetail.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RULE_DETAIL_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public RuleDetailBean selectRuleDetailById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RuleDetailBean>(RuleDetailBean.class));
	
}

@Override
public List<RuleDetailBean> select(){
	
	return template.query( "SELECT * from RULE_DETAIL_TABLE WHERE ID < 11"
						 ,new RowMapper<RuleDetailBean>(){
		
		public RuleDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RuleDetailBean ruleDetail = new RuleDetailBean();
			
			ruleDetail.setId					(rs.getInt(1));
			ruleDetail.setField					(rs.getInt(2));
			ruleDetail.setSubField				(rs.getInt(3));
			ruleDetail.setFire					(rs.getInt(4));
			ruleDetail.setType					(rs.getInt(5));
			ruleDetail.setGroup					(rs.getInt(6));
			ruleDetail.setBinLevel				(rs.getInt(7));
			ruleDetail.setAccountLevel			(rs.getInt(8));
			ruleDetail.setTransactionLevel		(rs.getInt(9));
			ruleDetail.setPointer				(rs.getInt(10));
			ruleDetail.setSeq					(rs.getInt(11));
			ruleDetail.setFieldValue			(rs.getString(12));
			ruleDetail.setCreateUser			(rs.getString(13));
			ruleDetail.setCreateTimestamp		(rs.getTimestamp(14));
			ruleDetail.setModifyUser			(rs.getString(15));
			ruleDetail.setModifyTimestamp		(rs.getTimestamp(16));
			
			return ruleDetail;
			
		}
	});
  }
}
