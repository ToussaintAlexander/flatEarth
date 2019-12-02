package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.RejectCodeBean;

public class RejectCodeDaoImpl implements RejectCodeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RejectCodeBean rejectCode){

			String sql 
			
				= "INSERT INTO REJECT_CODE_TABLE "
						+ "("
						+ " FIELD"
						+ ",SUBFIELD"
						+ " SEQUENCE"
						+ ",CODE"
						+ " NAME"
						+ ",DESCRIPTION"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	rejectCode.getField()			+	"'"
						+ ",'"	+	rejectCode.getSubfield()		+	"'"
						+ ",'"	+	rejectCode.getSeq()				+	"'"
						+ ",'"	+	rejectCode.getCode()			+	"'"
						+ ",'"	+	rejectCode.getName()			+	"'"
						+ ",'"	+	rejectCode.getDescription()		+	"'"
						
						+ ",'"	+	rejectCode.getCreateUser()		+	"'"
						+ ",'"	+	rejectCode.getCreateTimestamp()	+	"'"
						+ ",'"	+	rejectCode.getModifyUser()		+	"'"
						+ ",'"	+	rejectCode.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RejectCodeBean rejectCode){
	
	String sql =
			
			" UPDATE REJECT_CODE_TABLE  " 	+
			
			"    SET CODE 				= '" 	+ rejectCode.getCode() 				+	"'"	+
			"      , NAME 				= '"  	+ rejectCode.getName()	 			+	"'"	+
			"      , DESCRIPTION 		= '"  	+ rejectCode.getDescription()	 	+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ rejectCode.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ rejectCode.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE FIELD 				= "		+ rejectCode.getId()				+	"'"	+
			"    AND SUBFIELD 			= "		+ rejectCode.getSubfield()			+	"'"	+
			"    AND SEQ 			= "		+ rejectCode.getSeq()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int field, int subfield, int seq){
	
	String sql =
			
			"DELETE FROM REJECT_CODE_TABLE 	"	+
			" WHERE FIELD 		= 			"	+
			"   AND SUBFIELD 	= 			"	+
			"   AND SEQ 	= 				"	+
			        field						+
			","									+
	                subfield					+
			","									+
			        seq							+
			" ";
	
	return template.update(sql);
	
}

@Override
public RejectCodeBean selectRejectCodeById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM REJECT_CODE_TABLE "		+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RejectCodeBean>(RejectCodeBean.class));
	
}

@Override
public List<RejectCodeBean> select(){
	
	return template.query( "SELECT * FROM REJECT_CODE_TABLE"
						 ,new RowMapper<RejectCodeBean>(){
		
		public RejectCodeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RejectCodeBean rejectCode = new RejectCodeBean();
			
			rejectCode.setId					(rs.getInt(1));
			rejectCode.setField					(rs.getInt(2));
			rejectCode.setSubfield				(rs.getInt(3));
			rejectCode.setSeq					(rs.getInt(4));
			rejectCode.setCode					(rs.getString(5));
			rejectCode.setName					(rs.getString(6));
			rejectCode.setDescription			(rs.getString(7));
			rejectCode.setCreateUser			(rs.getString(8));
			rejectCode.setCreateTimestamp		(rs.getTimestamp(9));
			rejectCode.setModifyUser			(rs.getString(10));
			rejectCode.setModifyTimestamp		(rs.getTimestamp(11));
			
			return rejectCode;
			
		}
	});
  }
}
