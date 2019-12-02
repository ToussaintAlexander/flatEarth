package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.BusinessOverviewBean;

public class BusinessOverviewDaoImpl implements BusinessOverviewDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(BusinessOverviewBean overview){

			String sql 
			
				= "INSERT INTO BUSINESS_OVERVIEW_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",TITLE"
						+ ",SENTENCE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	overview.getEffectiveDate()		+	"'"
						+ ",'"	+	overview.getMajorVersion()		+	"'"
						+ ",'"	+	overview.getMinorVersion()		+	"'"
						+ ",'"	+	overview.getSection()			+	"'"
						+ ",'"	+	overview.getSubsection()		+	"'"
						+ ",'"	+	overview.getParagraph()			+	"'"
						+ ",'"	+	overview.getTitle()				+	"'"
						+ ",'"	+	overview.getSentence()			+	"'"
						+ ",'"	+	overview.getCreateUser()		+	"'"
						+ ",'"	+	overview.getCreateTimestamp()	+	"'"
						+ ",'"	+	overview.getModifyUser()		+	"'"
						+ ",'"	+	overview.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(BusinessOverviewBean overview){
	
	String sql =
			
			" UPDATE BUSINESS_OVERVIEW_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ overview.getEffectiveDate()	+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ overview.getMajorVersion()	+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ overview.getMinorVersion()	+	"'"	+
			"      , SECTION 			= '"  	+ overview.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ overview.getSubsection()		+	"'"	+
			"      , PARAGRAPH 			= '"  	+ overview.getParagraph()		+	"'"	+
			"      , TITLE 				= '"  	+ overview.getTitle()			+	"'"	+
			"      , SENTENCE 			= '"  	+ overview.getSentence()		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ overview.getModifyUser()  	+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ overview.getModifyTimestamp() +	"'"	+	
			
			"  WHERE ID 				= "		+ overview.getId()				+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM BUSINESS_OVERVIEW_TABLE "	+
			" WHERE ID = 		"					+
			       id								+
			" ";
	
	return template.update(sql);
	
}

@Override
public BusinessOverviewBean selectBusinessOverviewById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM BUSINESS_OVERVIEW_TABLE "		+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<BusinessOverviewBean>(BusinessOverviewBean.class));
	
}

@Override
public List<BusinessOverviewBean> select(){
	
	return template.query( "SELECT * FROM BUSINESS_OVERVIEW_TABLE"
						 ,new RowMapper<BusinessOverviewBean>(){
		
		public BusinessOverviewBean mapRow(ResultSet rs, int row) throws SQLException {
			
			BusinessOverviewBean overview = new BusinessOverviewBean();
			
			overview.setId				(rs.getInt(1));
			
			overview.setEffectiveDate	(rs.getDate(2));
			overview.setMajorVersion	(rs.getInt(3));
			overview.setMinorVersion	(rs.getInt(4));
			overview.setSection			(rs.getInt(5));
			overview.setSubsection		(rs.getInt(6));
			overview.setParagraph		(rs.getInt(7));
			
			overview.setTitle			(rs.getString(8));
			overview.setSentence		(rs.getString(9));
			
			overview.setCreateUser		(rs.getString(10));
			overview.setCreateTimestamp	(rs.getTimestamp(11));
			overview.setModifyUser		(rs.getString(12));
			overview.setModifyTimestamp	(rs.getTimestamp(13));
			
			return overview;
			
		}
	});
  }
}
