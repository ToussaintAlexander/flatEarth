package com.system.language.code.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.utilties.message.CodeBean;

public class CodeDaoImpl implements CodeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int insert(CodeBean code){

			String sql 
			
				= "INSERT INTO CODE_TABLE "
						+ "("
						+ " CODE_FIELD"
						+ ",CODE_SUBFIELD"
						+ ",CODE_VALUE"
						+ ",CODE_NAME"
						+ ",DESCRIPTION"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	code.getCodeField()			+	"'"
						+ ",'"	+	code.getCodeSubfield()		+	"'"
						+ ",'"	+	code.getCodeValue()			+	"'"
						+ ",'"	+	code.getCodeName()			+	"'"
						+ ",'"	+	code.getDescription()		+	"'"
						+ ",'"	+	code.getCreateUser()		+	"'"
						+ ",'"	+	code.getCreateTimestamp()	+	"'"
						+ ",'"	+	code.getModifyUser()		+	"'"
						+ ",'"	+	code.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int update(CodeBean code){
	
	String sql =
			
			" UPDATE CODE_TABLE " 				+
			
			"    SET CODE_FIELD 		= '" 	+ code.getCodeField() 		+	"'"	+
			"      , CODE_SUBFIELD 		= '"  	+ code.getCodeSubfield()	+	"'"	+
			"      , CODE_VALUE			= '" 	+ code.getCodeValue()  		+	"'"	+
			"      , CODE_NAME			= '" 	+ code.getCodeName()  		+	"'"	+
			"      , DESCRIPTION		= '" 	+ code.getDescription()  	+	"'"	+
			"      , CREATE_USER		= '" 	+ code.getCreateUser()  	+	"'"	+
			"      , CREATE_TIMESTAMP	= '" 	+ code.getCreateTimestamp() +	"'"	+
			"      , MODIFY_USER		= '" 	+ code.getModifyUser()  	+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ code.getModifyTimestamp() +	"'"	+	
			
			"  WHERE ID 				= "		+ code.getId()				+ 	"";
	
	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CODE_TABLE "
			+ "WHERE ID = "
			+ id
			+ " ";
	
	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public CodeBean selectCodeById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM CODE_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<CodeBean>(CodeBean.class));
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public List<CodeBean> select(){
	
	return template.query( "SELECT * FROM CODE_TABLE WHERE ID < 11"
						 ,new RowMapper<CodeBean>(){
		
		public CodeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CodeBean code = new CodeBean();
			
			code.setId						(rs.getInt(1));
			code.setCodeField				(rs.getInt(2));
			code.setCodeSubfield			(rs.getInt(3));
			code.setCodeValue				(rs.getString(4));
			code.setCodeName				(rs.getString(5));
			code.setDescription				(rs.getString(6));
			code.setCreateUser				(rs.getString(7));
			code.setCreateTimestamp			(rs.getTimestamp(8));
			code.setModifyUser				(rs.getString(9));
			code.setModifyTimestamp			(rs.getTimestamp(10));
			
			return code;
			
		}
	});
  }

/***********************************************************************************/
/***********************************************************************************/	
public void displayCode (CodeBean code) {
	
	System.out.println("CodeDaoImpl ---> ID 				= " + code.getId()				);
	System.out.println("CodeDaoImpl ---> Code Field 		= " + code.getCodeField()		);
	System.out.println("CodeDaoImpl ---> Code Subfield 		= " + code.getCodeSubfield()	);
	System.out.println("CodeDaoImpl ---> Code Value 		= " + code.getCodeValue()		);
	System.out.println("CodeDaoImpl ---> Code Name 			= " + code.getCodeName()		);
	System.out.println("CodeDaoImpl ---> Description 		= " + code.getDescription()		);
	
	System.out.println("CodeDaoImpl ---> CreateUser 		= " + code.getCreateUser()		);
	System.out.println("CodeDaoImpl ---> CreateTimestamp	= " + code.getCreateTimestamp()	);
	System.out.println("CodeDaoImpl ---> ModifyUser 		= " + code.getModifyUser()		);
	System.out.println("CodeDaoImpl ---> ModifyTimestamp	= " + code.getModifyTimestamp()	);
	
	}
}
