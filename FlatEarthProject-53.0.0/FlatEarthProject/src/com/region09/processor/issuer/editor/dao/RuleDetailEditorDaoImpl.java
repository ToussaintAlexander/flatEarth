package com.region09.processor.issuer.editor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.editor.model.RuleDetailEditorBean;

public class RuleDetailEditorDaoImpl implements RuleDetailEditorDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RuleDetailEditorBean ruleDetailEditor){

			String sql 
			
				= "INSERT INTO RULE_DETAIL_EDITOR_TABLE "
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
						+ "('"	+	ruleDetailEditor.getField()				+	"'"
						+ ",'"	+	ruleDetailEditor.getSubField()			+	"'"
						+ ",'"	+	ruleDetailEditor.isFire()				+	"'"
						+ ",'"	+	ruleDetailEditor.getType()				+	"'"
						+ ",'"	+	ruleDetailEditor.getGroup()				+	"'"
						+ ",'"	+	ruleDetailEditor.getBinLevel()			+	"'"
						+ ",'"	+	ruleDetailEditor.getAccountLevel()		+	"'"
						+ ",'"	+	ruleDetailEditor.getTransactionLevel()	+	"'"
						+ ",'"	+	ruleDetailEditor.getPointer()			+	"'"
						+ ",'"	+	ruleDetailEditor.getSeq()				+	"'"
						+ ",'"	+	ruleDetailEditor.getFieldValue()		+	"'"
						+ ",'"	+	ruleDetailEditor.getCreateUser()		+	"'"
						+ ",'"	+	ruleDetailEditor.getCreateTimestamp()	+	"'"
						+ ",'"	+	ruleDetailEditor.getModifyUser()		+	"'"
						+ ",'"	+	ruleDetailEditor.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RuleDetailEditorBean ruleDetailEditor){
	
	String sql =
			
			" UPDATE RULE_DETAIL_EDITOR_TABLE "	+
			
			"    SET FIELD 				= '" 	+ ruleDetailEditor.getField() 				+	"'"	+
			"      , SUBFIELD 			= '"  	+ ruleDetailEditor.getSubField()	 		+	"'"	+
			"      , FIRE 				= '"  	+ ruleDetailEditor.isFire()		 			+	"'"	+
			"      , TYPE 				= '"  	+ ruleDetailEditor.getType() 				+	"'"	+
			"      , GROUP 				= '"  	+ ruleDetailEditor.getGroup() 				+	"'"	+
			"      , BIN_LEVEL 			= '"  	+ ruleDetailEditor.getBinLevel() 			+	"'"	+
			"      , ACCOUNT_LEVEL 		= '"  	+ ruleDetailEditor.getAccountLevel() 		+	"'"	+
			"      , TRANSACTION_LEVEL 	= '"  	+ ruleDetailEditor.getTransactionLevel() 	+	"'"	+
			"      , POINTER 			= '"  	+ ruleDetailEditor.getPointer()	 			+	"'"	+
			"      , SEQ 				= '"  	+ ruleDetailEditor.getSeq() 				+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ ruleDetailEditor.getFieldValue() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ ruleDetailEditor.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ ruleDetailEditor.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ ruleDetailEditor.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RULE_DETAIL_EDITOR_TABLE " 	+
			"  WHERE ID = "								+
			         id									+
			"";
	
	return template.update(sql);
	
}

@Override
public RuleDetailEditorBean selectRuleDetailEditorById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_DETAIL_EDITOR_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RuleDetailEditorBean>(RuleDetailEditorBean.class));
	
}

@Override
public List<RuleDetailEditorBean> select(){
	
	return template.query( "SELECT * from RULE_DETAIL_EDITOR_TABLE"
						 ,new RowMapper<RuleDetailEditorBean>(){
		
		public RuleDetailEditorBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RuleDetailEditorBean ruleDetailEditor = new RuleDetailEditorBean();
			
			ruleDetailEditor.setId					(rs.getInt(1));
			ruleDetailEditor.setField				(rs.getInt(2));
			ruleDetailEditor.setSubField			(rs.getInt(3));
			ruleDetailEditor.setFire				(rs.getBoolean(4));
			ruleDetailEditor.setType				(rs.getInt(5));
			ruleDetailEditor.setGroup				(rs.getInt(6));
			ruleDetailEditor.setBinLevel			(rs.getInt(7));
			ruleDetailEditor.setAccountLevel		(rs.getInt(8));
			ruleDetailEditor.setTransactionLevel	(rs.getInt(9));
			ruleDetailEditor.setPointer				(rs.getInt(10));
			ruleDetailEditor.setSeq					(rs.getInt(11));
			ruleDetailEditor.setFieldValue			(rs.getString(12));
			ruleDetailEditor.setCreateUser			(rs.getString(13));
			ruleDetailEditor.setCreateTimestamp		(rs.getTimestamp(14));
			ruleDetailEditor.setModifyUser			(rs.getString(15));
			ruleDetailEditor.setModifyTimestamp		(rs.getTimestamp(16));
			
			return ruleDetailEditor;
			
		}
	});
  }
}
