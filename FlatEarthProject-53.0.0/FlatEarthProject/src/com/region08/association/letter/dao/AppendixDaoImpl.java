package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.AppendixBean;

public class AppendixDaoImpl implements AppendixDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AppendixBean appendix){

			String sql 
			
				= "INSERT INTO APPENDIX_TABLE "
						+ "("
						+ " VALID_CODES"
						+ ",REJECT_CODES"
						+ ",ACRONYMS"
						+ ",RELATED_DOCUMENTS"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	appendix.getValidCodes()		+	"'"
						+ ",'"	+	appendix.getRejectCodes()		+	"'"
						+ ",'"	+	appendix.getAcronyms()			+	"'"
						+ ",'"	+	appendix.getRelatedDocuments()	+	"'"
						+ ",'"	+	appendix.getCreateUser()		+	"'"
						+ ",'"	+	appendix.getCreateTimestamp()	+	"'"
						+ ",'"	+	appendix.getModifyUser()		+	"'"
						+ ",'"	+	appendix.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AppendixBean appendix){
	
	String sql =
			
			" UPDATE APPENDIX_TABLE 	   " 	+
			
			"    SET VALID_CODES 		= '" 	+ appendix.getValidCodes() 			+	"'"	+
			"      , REJECT_CODES 		= '"  	+ appendix.getRejectCodes()	 		+	"'"	+
			"      , ACRONYMS 			= '"  	+ appendix.getAcronyms()			+	"'"	+
			"      , RELATED_DOCUMENTS 	= '"  	+ appendix.getRelatedDocuments()	+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ appendix.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ appendix.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ appendix.getId()					+ 	"'" +
			"    AND SEQUENCE 			= "		+ appendix.getSequence()			+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id, int sequence){
	
	String sql =
			
			"DELETE FROM APPENDIX_TABLE "	+
			" WHERE ID = 		"			+
			"   AND SEQUENCE = "			+	
			       id						+
			","								+       
			       sequence					+       
			" ";
	
	return template.update(sql);
	
}

@Override
public AppendixBean selectAppendixById(int id,int sequence){
	
	String sql 
	
	   = "SELECT * "					+
		 "  FROM APPENDIX_TABLE "		+
		 " WHERE ID			   = ? "	+
		 "   AND SEQUENCE      = ? "	+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id, sequence}
								  , new BeanPropertyRowMapper<AppendixBean>(AppendixBean.class));
	
}

@Override
public List<AppendixBean> select(){
	
	return template.query( "SELECT * FROM APPENDIX_TABLE"
						 ,new RowMapper<AppendixBean>(){
		
		public AppendixBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AppendixBean appendix = new AppendixBean();
			
			appendix.setId					(rs.getInt(1));
			appendix.setSequence			(rs.getInt(2));
			appendix.setValidCodes			(rs.getInt(3));
			appendix.setRejectCodes			(rs.getInt(4));
			appendix.setAcronyms			(rs.getInt(5));
			appendix.setRelatedDocuments	(rs.getInt(6));
			appendix.setCreateUser			(rs.getString(7));
			appendix.setCreateTimestamp		(rs.getTimestamp(8));
			appendix.setModifyUser			(rs.getString(9));
			appendix.setModifyTimestamp		(rs.getTimestamp(10));
			
			return appendix;
			
		}
	});
  }
}
