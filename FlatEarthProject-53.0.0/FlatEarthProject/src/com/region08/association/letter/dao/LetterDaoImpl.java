package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.LetterBean;

public class LetterDaoImpl implements LetterDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(LetterBean letter){

			String sql 
			
				= "INSERT INTO LETTER_TABLE "
						+ "("
						+ " ASSOCIATION"
						+ ",TITLE"
						+ ",SUBTITLE"
						+ ",VERSION"
						+ ",EFFECTIVE_DATE"
						+ ",RELEASE_OVERVIEW"
						+ ",SECTION"
						+ ",APPENDIX"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	letter.getAssociation()		+	"'"
						+ ",'"	+	letter.getTitle()			+	"'"
						+ ",'"	+	letter.getSubtitle()		+	"'"
						+ ",'"	+	letter.getVersion()			+	"'"
						+ ",'"	+	letter.getEffectiveDate()	+	"'"
						+ ",'"	+	letter.getReleaseOverview()	+	"'"
						+ ",'"	+	letter.getSection()			+	"'"
						+ ",'"	+	letter.getAppendix()		+	"'"
						
						+ ",'"	+	letter.getCreateUser()		+	"'"
						+ ",'"	+	letter.getCreateTimestamp()	+	"'"
						+ ",'"	+	letter.getModifyUser()		+	"'"
						+ ",'"	+	letter.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(LetterBean letter){
	
	String sql =
			
			" UPDATE LETTER_TABLE 	  	   " 	+
			
			"    SET ASSOCIATION 		= '" 	+ letter.getAssociation() 		+	"'"	+
			"      , TITLE 				= '"  	+ letter.getTitle()	 			+	"'"	+
			"      , SUBTITLE 			= '"  	+ letter.getSubtitle()			+	"'"	+
			"      , VERSION 			= '"  	+ letter.getVersion()			+	"'"	+
			"      , EFFECTIVE_DATE		= '" 	+ letter.getEffectiveDate()  	+	"'"	+
			"      , RELEASE_OVERVIEW	= '" 	+ letter.getReleaseOverview()  	+	"'"	+
			"      , SECTION			= '" 	+ letter.getSection()  			+	"'"	+
			"      , APPENDIX			= '" 	+ letter.getAppendix()  		+	"'"	+	
			
			"      , CREATE_USER		= '" 	+ letter.getCreateUser()  		+	"'"	+
			"      , CREATE_TIMESTAMP	= '" 	+ letter.getCreateTimestamp()  	+	"'"	+
			"      , MODIFY_USER		= '" 	+ letter.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ letter.getModifyTimestamp() 	+	"'"	+	
			
			"  WHERE ID 				= "		+ letter.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM LETTER_TABLE "	+
			" WHERE ID = 		"			+
			       id						+
			" ";
	
	return template.update(sql);
	
}

@Override
public LetterBean selectLetterById(int id){
	
	String sql 
	
		= "SELECT * "					+
		  "  FROM LETTER_TABLE "		+
		  " WHERE ID			 = ? "	+
		  "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<LetterBean>(LetterBean.class));
	
}

@Override
public List<LetterBean> select(){
	
	return template.query( "SELECT * FROM LETTER_TABLE"
						 ,new RowMapper<LetterBean>(){
		
		public LetterBean mapRow(ResultSet rs, int row) throws SQLException {
			
			LetterBean letter = new LetterBean();
			
			letter.setId				(rs.getInt(1));
			letter.setAssociation		(rs.getString(2));
			letter.setTitle				(rs.getString(3));
			letter.setSubtitle			(rs.getString(4));
			letter.setVersion			(rs.getString(5));
			letter.setEffectiveDate		(rs.getDate(6));
			letter.setReleaseOverview	(rs.getInt(7));
			letter.setSection			(rs.getInt(8));
			letter.setAppendix			(rs.getInt(9));	 		
			
			letter.setCreateUser		(rs.getString(10));
			letter.setCreateTimestamp	(rs.getTimestamp(11));
			letter.setModifyUser		(rs.getString(12));
			letter.setModifyTimestamp	(rs.getTimestamp(13));
			
			return letter;
			
		}
	});
  }
}
