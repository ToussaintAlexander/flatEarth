package com.region09.processor.issuer.editor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.editor.model.RuleHeaderEditorBean;

public class RuleHeaderEditorDaoImpl implements RuleHeaderEditorDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RuleHeaderEditorBean ruleHeaderEditor){

			String sql 
			
				= "INSERT INTO RULE_HEADER_EDITOR_TABLE "
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
						+ "('"	+	ruleHeaderEditor.getField()				+	"'"
						+ ",'"	+	ruleHeaderEditor.getSubField()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getFire()				+	"'"
						+ ",'"	+	ruleHeaderEditor.getFormat()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getMinimumLength()		+	"'"
						+ ",'"	+	ruleHeaderEditor.getMaximumLength()		+	"'"
						+ ",'"	+	ruleHeaderEditor.getEncoding()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getDataType()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getSource()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getDirection()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getExistence()			+	"'"
						+ ",'"	+	ruleHeaderEditor.getCreateUser()		+	"'"
						+ ",'"	+	ruleHeaderEditor.getCreateTimestamp()	+	"'"
						+ ",'"	+	ruleHeaderEditor.getModifyUser()		+	"'"
						+ ",'"	+	ruleHeaderEditor.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RuleHeaderEditorBean ruleHeaderEditor){
	
	String sql =
			
			" UPDATE RULE_HEADER_EDITOR_TABLE 	   " 									+
			
			"    SET FIELD 				= '" 	+ ruleHeaderEditor.getField() 			+	"'"	+
			"      , SUBFIELD 			= '"  	+ ruleHeaderEditor.getSubField()	 	+	"'"	+
			"      , FIRE 				= '"  	+ ruleHeaderEditor.getFire()		 	+	"'"	+
			"      , FORMAT 			= '"  	+ ruleHeaderEditor.getFormat()		 	+	"'"	+
			"      , MINIMUM_LENGTH 	= '"  	+ ruleHeaderEditor.getMinimumLength() 	+	"'"	+
			"      , MAXIMUM_LENGTH 	= '"  	+ ruleHeaderEditor.getMaximumLength() 	+	"'"	+
			"      , ENCODING 			= '"  	+ ruleHeaderEditor.getEncoding() 		+	"'"	+
			"      , DATA_TYPE 			= '"  	+ ruleHeaderEditor.getDataType() 		+	"'"	+
			"      , SOURCE 			= '"  	+ ruleHeaderEditor.getSource() 			+	"'"	+
			"      , DIRECTION 			= '"  	+ ruleHeaderEditor.getDirection() 		+	"'"	+
			"      , EXISTENCE 			= '"  	+ ruleHeaderEditor.getExistence()	 	+	"'"	+
			"      , CHANGE 			= '"  	+ ruleHeaderEditor.getChange() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ ruleHeaderEditor.getModifyUser()  	+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ ruleHeaderEditor.getModifyTimestamp() +	"'"	+	
			
			"  WHERE ID 				= "		+ ruleHeaderEditor.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RULE_HEADER_EDITOR_TABLE " 	+
			"  WHERE ID = "								+
			         id									+
			"";
	
	return template.update(sql);
	
}

@Override
public RuleHeaderEditorBean selectRuleHeaderEditorById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RULE_HEADER_EDITOR_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RuleHeaderEditorBean>(RuleHeaderEditorBean.class));
	
}

@Override
public List<RuleHeaderEditorBean> select(){
	
	return template.query( "SELECT * FROM RULE_HEADER_EDITOR_TABLE"
						 ,new RowMapper<RuleHeaderEditorBean>(){
		
		public RuleHeaderEditorBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RuleHeaderEditorBean ruleHeaderEditor = new RuleHeaderEditorBean();
			
			ruleHeaderEditor.setId				(rs.getInt(1));
			ruleHeaderEditor.setField			(rs.getInt(2));
			ruleHeaderEditor.setSubField		(rs.getInt(3));
			ruleHeaderEditor.setFire			(rs.getInt(4));
			ruleHeaderEditor.setFormat			(rs.getInt(5));
			ruleHeaderEditor.setMinimumLength	(rs.getInt(6));
			ruleHeaderEditor.setMaximumLength	(rs.getInt(7));
			ruleHeaderEditor.setEncoding		(rs.getInt(8));
			ruleHeaderEditor.setDataType		(rs.getInt(9));
			ruleHeaderEditor.setSource			(rs.getInt(10));
			ruleHeaderEditor.setDirection		(rs.getInt(11));
			ruleHeaderEditor.setExistence		(rs.getInt(12));
			ruleHeaderEditor.setChange			(rs.getInt(13));
			ruleHeaderEditor.setCreateUser		(rs.getString(14));
			ruleHeaderEditor.setCreateTimestamp	(rs.getTimestamp(15));
			ruleHeaderEditor.setModifyUser		(rs.getString(16));
			ruleHeaderEditor.setModifyTimestamp	(rs.getTimestamp(17));
			
			return ruleHeaderEditor;
			
		}
	});
  }
}

					