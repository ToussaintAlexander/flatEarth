package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.ProcessingImpactBean;

public class ProcessingImpactDaoImpl implements ProcessingImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ProcessingImpactBean processing){

			String sql 
			
				= "INSERT INTO PROCESSING_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",PROCESSING"
						+ ",IMPACT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	processing.getEffectiveDate()	+	"'"
						+ ",'"	+	processing.getMajorVersion()	+	"'"
						+ ",'"	+	processing.getMinorVersion()	+	"'"
						+ ",'"	+	processing.getSection()			+	"'"
						+ ",'"	+	processing.getSubsection()		+	"'"
						+ ",'"	+	processing.getParagraph()		+	"'"
						+ ",'"	+	processing.getProcessing()		+	"'"
						+ ",'"	+	processing.getImpact()			+	"'"
						+ ",'"	+	processing.getCreateUser()		+	"'"
						+ ",'"	+	processing.getCreateTimestamp()	+	"'"
						+ ",'"	+	processing.getModifyUser()		+	"'"
						+ ",'"	+	processing.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ProcessingImpactBean processing){
	
	String sql =
			
			" UPDATE PROCESSING_IMPACT_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ processing.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ processing.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ processing.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ processing.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ processing.getSubsection()		+	"'"	+
			"      , PARAGRAPH 			= '"  	+ processing.getParagraph()			+	"'"	+
			
			"      , PROCESSING 		= '"  	+ processing.getProcessing()		+	"'"	+
			"      , IMPACT 			= '"  	+ processing.getImpact()			+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ processing.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ processing.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ processing.getId()				+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM PROCESSING_IMPACT_TABLE "	+
			" WHERE ID = 		"					+
			       id								+
			" ";
	
	return template.update(sql);
	
}

@Override
public ProcessingImpactBean selectProcessingImpactById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM PROCESSING_IMPACT_TABLE "		+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ProcessingImpactBean>(ProcessingImpactBean.class));
	
}

@Override
public List<ProcessingImpactBean> select(){
	
	return template.query( "SELECT * FROM PROCESSING_IMPACT_TABLE"
						 ,new RowMapper<ProcessingImpactBean>(){
		
		public ProcessingImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ProcessingImpactBean processing = new ProcessingImpactBean();
			
			processing.setId				(rs.getInt(1));
			
			processing.setEffectiveDate		(rs.getDate(2));
			processing.setMajorVersion		(rs.getInt(3));
			processing.setMinorVersion		(rs.getInt(4));
			processing.setSection			(rs.getInt(5));
			processing.setSubsection		(rs.getInt(6));
			processing.setParagraph			(rs.getInt(7));
			
			processing.setProcessing		(rs.getString(8));
			processing.setImpact			(rs.getInt(9));
			
			processing.setCreateUser		(rs.getString(10));
			processing.setCreateTimestamp	(rs.getTimestamp(11));
			processing.setModifyUser		(rs.getString(12));
			processing.setModifyTimestamp	(rs.getTimestamp(13));
			
			return processing;
			
		}
	});
  }
}
