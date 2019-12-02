package com.region09.processor.issuer.explain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.explain.model.DualRuleDetailExplainBean;

public class DualRuleDetailExplainDaoImpl implements DualRuleDetailExplainDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(DualRuleDetailExplainBean dualRuleDetailExplain){

			String sql 
			
				= "INSERT INTO DUAL_RULE_DETAIL_TABLE "
						+ "("
						+ " FIELD1"
						+ ",SUBFIELD1"
						+ ",FIRE1"
						+ ",TYPE1"
						+ ",GROUP1"
						+ ",BIN_LEVEL1"
						+ ",ACCOUNT_LEVEL1"
						+ ",TRANSACTION_LEVEL1"
						+ ",POINTER1"
						+ ",SEQUENCE1"
						+ ",VALUE1"

						+ " FIELD2"
						+ ",SUBFIELD2"
						+ ",FIRE2"
						+ ",TYPE2"
						+ ",GROUP2"
						+ ",BIN_LEVEL2"
						+ ",ACCOUNT_LEVEL2"
						+ ",TRANSACTION_LEVEL2"
						+ ",POINTER2"
						+ ",SEQUENCE2"
						+ ",VALUE2"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	dualRuleDetailExplain.getField1()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getSubField1()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getFire1()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getType1()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getGroup1()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getBinLevel1()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getAccountLevel1()		+	"'"
						+ ",'"	+	dualRuleDetailExplain.getTransactionLevel1()	+	"'"
						+ ",'"	+	dualRuleDetailExplain.getPointer1()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getSequence1()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getValue1()				+	"'"

						+ ",'"	+	dualRuleDetailExplain.getField2()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getSubField2()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getFire2()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getType2()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getGroup2()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getBinLevel2()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getAccountLevel2()		+	"'"
						+ ",'"	+	dualRuleDetailExplain.getTransactionLevel2()	+	"'"
						+ ",'"	+	dualRuleDetailExplain.getPointer2()				+	"'"
						+ ",'"	+	dualRuleDetailExplain.getSequence2()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getValue2()				+	"'"
						
						+ ",'"	+	dualRuleDetailExplain.getCreateUser()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getCreateTimestamp()		+	"'"
						+ ",'"	+	dualRuleDetailExplain.getModifyUser()			+	"'"
						+ ",'"	+	dualRuleDetailExplain.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(DualRuleDetailExplainBean dualDetail){
	
	String sql =
			
			" UPDATE DUAL_RULE_DETAIL_TABLE 	       " 	+
	
			"    SET FIELD1 				= '" 	+ 	dualDetail.getField1() 				+	"'"	+
			"      , SUBFIELD1 				= '"  	+ 	dualDetail.getSubField1()	 		+	"'"	+
			"      , FIRE1 					= '"  	+	dualDetail.getFire1()				+	"'"	+
			"      , TYPE1 					= '"  	+	dualDetail.getType1()				+	"'"	+
			"      , GROUP1 				= '"  	+	dualDetail.getGroup1()				+	"'"	+
			"      , BIN_LEVEL1 			= '"  	+	dualDetail.getBinLevel1()			+	"'"	+
			"      , ACCOUNT_LEVEL1 		= '"  	+	dualDetail.getAccountLevel1()		+	"'"	+
			"      , TRANSACTION_LEVEL1 	= '"  	+	dualDetail.getTransactionLevel1()	+	"'"	+
			"      , POINTER1 				= '"  	+	dualDetail.getPointer1()			+	"'"	+
			"      , SEQUENCE1 				= '"  	+	dualDetail.getSequence1()			+	"'"	+
			"      , VALUE1 				= '"  	+	dualDetail.getValue1()				+	"'"	+

			"      , FIELD2 				= '" 	+ 	dualDetail.getField2() 				+	"'"	+
			"      , SUBFIELD2 				= '"  	+ 	dualDetail.getSubField2()	 		+	"'"	+
			"      , FIRE2 					= '"  	+	dualDetail.getFire2()				+	"'"	+
			"      , TYPE2 					= '"  	+	dualDetail.getType2()				+	"'"	+
			"      , GROUP2 				= '"  	+	dualDetail.getGroup2()				+	"'"	+
			"      , BIN_LEVEL2 			= '"  	+	dualDetail.getBinLevel2()			+	"'"	+
			"      , ACCOUNT_LEVEL2 		= '"  	+	dualDetail.getAccountLevel2()		+	"'"	+
			"      , TRANSACTION_LEVEL2 	= '"  	+	dualDetail.getTransactionLevel2()	+	"'"	+
			"      , POINTER2 				= '"  	+	dualDetail.getPointer2()			+	"'"	+
			"      , SEQUENCE2 				= '"  	+	dualDetail.getSequence2()			+	"'"	+
			"      , VALUE2 				= '"  	+	dualDetail.getValue2()				+	"'"	+
						
			"      , MODIFY_USER			= '" 	+ dualDetail.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ dualDetail.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 					= "		+ dualDetail.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM DUAL_RULE_DETAIL_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public DualRuleDetailExplainBean selectDualRuleDetailExplainById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM DUAL_RULE_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<DualRuleDetailExplainBean>(DualRuleDetailExplainBean.class));
	
}

@Override
public List<DualRuleDetailExplainBean> select(){
	
	return template.query( "SELECT * FROM DUAL_RULE_DETAIL_TABLE WHERE ID = 1"
						 ,new RowMapper<DualRuleDetailExplainBean>(){
		
		public DualRuleDetailExplainBean mapRow(ResultSet rs, int row) throws SQLException {
			
			DualRuleDetailExplainBean dualRuleDetailExplain = new DualRuleDetailExplainBean();
			
			dualRuleDetailExplain.setId					(rs.getInt(1));
			
			dualRuleDetailExplain.setField1				(rs.getInt(2));
			dualRuleDetailExplain.setSubField1			(rs.getInt(3));
			dualRuleDetailExplain.setFire1				(rs.getInt(4));
			dualRuleDetailExplain.setType1				(rs.getInt(5));
			dualRuleDetailExplain.setGroup1				(rs.getInt(6));
			dualRuleDetailExplain.setBinLevel1			(rs.getInt(7));
			dualRuleDetailExplain.setAccountLevel1		(rs.getInt(8));
			dualRuleDetailExplain.setTransactionLevel1	(rs.getInt(9));
			dualRuleDetailExplain.setPointer1			(rs.getInt(10));
			dualRuleDetailExplain.setSequence1			(rs.getInt(11));
			dualRuleDetailExplain.setValue1				(rs.getString(12));

			dualRuleDetailExplain.setField2				(rs.getInt(13));
			dualRuleDetailExplain.setSubField2			(rs.getInt(14));
			dualRuleDetailExplain.setFire2				(rs.getInt(15));
			dualRuleDetailExplain.setType2				(rs.getInt(16));
			dualRuleDetailExplain.setGroup2				(rs.getInt(17));
			dualRuleDetailExplain.setBinLevel2			(rs.getInt(18));
			dualRuleDetailExplain.setAccountLevel2		(rs.getInt(19));
			dualRuleDetailExplain.setTransactionLevel2	(rs.getInt(20));
			dualRuleDetailExplain.setPointer2			(rs.getInt(21));
			dualRuleDetailExplain.setSequence2			(rs.getInt(22));
			dualRuleDetailExplain.setValue2				(rs.getString(23));
			
			dualRuleDetailExplain.setCreateUser			(rs.getString(24));
			dualRuleDetailExplain.setCreateTimestamp	(rs.getTimestamp(25));
			dualRuleDetailExplain.setModifyUser			(rs.getString(26));
			dualRuleDetailExplain.setModifyTimestamp	(rs.getTimestamp(27));
			
			return dualRuleDetailExplain;
			
		}
	});
  }
}
