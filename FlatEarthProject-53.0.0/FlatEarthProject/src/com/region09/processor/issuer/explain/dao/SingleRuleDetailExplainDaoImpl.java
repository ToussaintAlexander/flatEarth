package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.SingleRuleDetailExplainBean;

public class SingleRuleDetailExplainDaoImpl implements SingleRuleDetailExplainDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SingleRuleDetailExplainBean singleRuleDetail){

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
						+ ",SEQUENCE"
						+ ",VALUE"

						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	singleRuleDetail.getField()				+	"'"
						+ ",'"	+	singleRuleDetail.getSubField()			+	"'"
						+ ",'"	+	singleRuleDetail.getFire()				+	"'"
						+ ",'"	+	singleRuleDetail.getType()				+	"'"
						+ ",'"	+	singleRuleDetail.getGroup()				+	"'"
						+ ",'"	+	singleRuleDetail.getBinLevel()			+	"'"
						+ ",'"	+	singleRuleDetail.getAccountLevel()		+	"'"
						+ ",'"	+	singleRuleDetail.getTransactionLevel()	+	"'"
						+ ",'"	+	singleRuleDetail.getPointer()			+	"'"
						+ ",'"	+	singleRuleDetail.getSequence()			+	"'"
						+ ",'"	+	singleRuleDetail.getValue()				+	"'"

						+ ",'"	+	singleRuleDetail.getCreateUser()		+	"'"
						+ ",'"	+	singleRuleDetail.getCreateTimestamp()	+	"'"
						+ ",'"	+	singleRuleDetail.getModifyUser()		+	"'"
						+ ",'"	+	singleRuleDetail.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SingleRuleDetailExplainBean singleRuleDetail){
	
	String sql =
			
			" UPDATE RULE_DETAIL_TABLE   " 	+
			
			"    SET FIELD 				= '" 	+ 	singleRuleDetail.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ 	singleRuleDetail.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+	singleRuleDetail.getFire()				+	"'"	+
			"      , TYPE 				= '"  	+	singleRuleDetail.getType()				+	"'"	+
			"      , GROUP 				= '"  	+	singleRuleDetail.getGroup()				+	"'"	+
			"      , BIN_LEVEL 			= '"  	+	singleRuleDetail.getBinLevel()			+	"'"	+
			"      , ACCOUNT_LEVEL 		= '"  	+	singleRuleDetail.getAccountLevel()		+	"'"	+
			"      , TRANSACTION_LEVEL 	= '"  	+	singleRuleDetail.getTransactionLevel()	+	"'"	+
			"      , POINTER 			= '"  	+	singleRuleDetail.getPointer()			+	"'"	+
			"      , SEQUENCE 			= '"  	+	singleRuleDetail.getSequence()			+	"'"	+
			"      , VALUE 				= '"  	+	singleRuleDetail.getValue()				+	"'"	+

			"      , MODIFY_USER		= '" 	+ 	singleRuleDetail.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ 	singleRuleDetail.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ 	singleRuleDetail.getId()				+ 	"";
	
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
public SingleRuleDetailExplainBean selectSingleRuleDetailExplainById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SingleRuleDetailExplainBean>(SingleRuleDetailExplainBean.class));
	
}

@Override
public List<SingleRuleDetailExplainBean> select(){
	
	return template.query( "SELECT * FROM RULE_DETAIL_TABLE "
						 ,new RowMapper<SingleRuleDetailExplainBean>(){
		
		public SingleRuleDetailExplainBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SingleRuleDetailExplainBean singleRuleDetail = new SingleRuleDetailExplainBean();
			
			singleRuleDetail.setId					(rs.getInt(1));
			singleRuleDetail.setField				(rs.getInt(2));
			singleRuleDetail.setSubField			(rs.getInt(3));
			singleRuleDetail.setFire				(rs.getInt(4));
			singleRuleDetail.setType				(rs.getInt(5));
			singleRuleDetail.setGroup				(rs.getInt(6));
			singleRuleDetail.setBinLevel			(rs.getInt(7));
			singleRuleDetail.setAccountLevel		(rs.getInt(8));
			singleRuleDetail.setTransactionLevel	(rs.getInt(9));
			singleRuleDetail.setPointer				(rs.getInt(10));
			singleRuleDetail.setSequence			(rs.getInt(11));
			singleRuleDetail.setValue				(rs.getString(12));

			singleRuleDetail.setCreateUser			(rs.getString(13));
			singleRuleDetail.setCreateTimestamp		(rs.getTimestamp(14));
			singleRuleDetail.setModifyUser			(rs.getString(15));
			singleRuleDetail.setModifyTimestamp		(rs.getTimestamp(16));
			
			return singleRuleDetail;
			
		}
	});
  }
}
