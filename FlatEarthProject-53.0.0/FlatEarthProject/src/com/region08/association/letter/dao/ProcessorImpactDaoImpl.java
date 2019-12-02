package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.ProcessorImpactBean;

public class ProcessorImpactDaoImpl implements ProcessorImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ProcessorImpactBean processor){

			String sql 
			
				= "INSERT INTO PROCESSOR_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",PROCESSOR"
						+ ",IMPACT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	processor.getEffectiveDate()	+	"'"
						+ ",'"	+	processor.getMajorVersion()		+	"'"
						+ ",'"	+	processor.getMinorVersion()		+	"'"
						+ ",'"	+	processor.getSection()			+	"'"
						+ ",'"	+	processor.getSubsection()		+	"'"
						+ ",'"	+	processor.getParagraph()		+	"'"
						+ ",'"	+	processor.getProcessor()		+	"'"
						+ ",'"	+	processor.getImpact()			+	"'"
						+ ",'"	+	processor.getCreateUser()		+	"'"
						+ ",'"	+	processor.getCreateTimestamp()	+	"'"
						+ ",'"	+	processor.getModifyUser()		+	"'"
						+ ",'"	+	processor.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ProcessorImpactBean processor){
	
	String sql =
			
			" UPDATE PROCESSOR_IMPACT_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ processor.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ processor.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ processor.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ processor.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ processor.getSubsection()			+	"'"	+
			"      , PARAGRAPH 			= '"  	+ processor.getParagraph()			+	"'"	+
			
			"      , PROCESSOR 			= '"  	+ processor.getProcessor()			+	"'"	+
			"      , IMPACT 			= '"  	+ processor.getImpact()				+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ processor.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ processor.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ processor.getId()					+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM PROCESSOR_IMPACT_TABLE "	+
			" WHERE ID = 		"					+
			       id								+
			" ";
	
	return template.update(sql);
	
}

@Override
public ProcessorImpactBean selectProcessorImpactById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM PROCESSOR_IMPACT_TABLE "		+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ProcessorImpactBean>(ProcessorImpactBean.class));
	
}

@Override
public List<ProcessorImpactBean> select(){
	
	return template.query( "SELECT * FROM PROCESSOR_IMPACT_TABLE"
						 ,new RowMapper<ProcessorImpactBean>(){
		
		public ProcessorImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ProcessorImpactBean processor = new ProcessorImpactBean();
			
			processor.setId					(rs.getInt(1));
			
			processor.setEffectiveDate		(rs.getDate(2));
			processor.setMajorVersion		(rs.getInt(3));
			processor.setMinorVersion		(rs.getInt(4));
			processor.setSection			(rs.getInt(5));
			processor.setSubsection			(rs.getInt(6));
			processor.setParagraph			(rs.getInt(7));
			
			processor.setProcessor			(rs.getString(8));
			processor.setImpact				(rs.getInt(9));
			
			processor.setCreateUser			(rs.getString(10));
			processor.setCreateTimestamp	(rs.getTimestamp(11));
			processor.setModifyUser			(rs.getString(12));
			processor.setModifyTimestamp	(rs.getTimestamp(13));
			
			return processor;
			
		}
	});
  }
}
