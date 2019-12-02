package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.PlatformImpactBean;

public class PlatformImpactDaoImpl implements PlatformImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(PlatformImpactBean platform){

			String sql 
			
				= "INSERT INTO PLATFORM_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",PLATFORM"
						+ ",IMPACT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	platform.getEffectiveDate()		+	"'"
						+ ",'"	+	platform.getMajorVersion()		+	"'"
						+ ",'"	+	platform.getMinorVersion()		+	"'"
						+ ",'"	+	platform.getSection()			+	"'"
						+ ",'"	+	platform.getSubsection()		+	"'"
						+ ",'"	+	platform.getParagraph()			+	"'"
						+ ",'"	+	platform.getPlatform()			+	"'"
						+ ",'"	+	platform.getImpact()			+	"'"
						+ ",'"	+	platform.getCreateUser()		+	"'"
						+ ",'"	+	platform.getCreateTimestamp()	+	"'"
						+ ",'"	+	platform.getModifyUser()		+	"'"
						+ ",'"	+	platform.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(PlatformImpactBean platform){
	
	String sql =
			
			" UPDATE PLATFORM_IMPACT_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ platform.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ platform.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ platform.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ platform.getSection()				+	"'"	+
			"      , SUBSECTION 		= '"  	+ platform.getSubsection()			+	"'"	+
			"      , PARAGRAPH 			= '"  	+ platform.getParagraph()			+	"'"	+
			
			"      , PLATFORM 			= '"  	+ platform.getPlatform()			+	"'"	+
			"      , IMPACT 			= '"  	+ platform.getImpact()				+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ platform.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ platform.getModifyTimestamp()		+	"'"	+	
			
			"  WHERE ID 				= "		+ platform.getId()					+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM PLATFORM_IMPACT_TABLE "	+
			" WHERE ID = 		"					+
			       id								+
			" ";
	
	return template.update(sql);
	
}

@Override
public PlatformImpactBean selectPlatformImpactById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM PLATFORM_IMPACT_TABLE "		+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<PlatformImpactBean>(PlatformImpactBean.class));
	
}

@Override
public List<PlatformImpactBean> select(){
	
	return template.query( "SELECT * FROM PLATFORM_IMPACT_TABLE"
						 ,new RowMapper<PlatformImpactBean>(){
		
		public PlatformImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			PlatformImpactBean platform = new PlatformImpactBean();
			
			platform.setId					(rs.getInt(1));
			
			platform.setEffectiveDate		(rs.getDate(2));
			platform.setMajorVersion		(rs.getInt(3));
			platform.setMinorVersion		(rs.getInt(4));
			platform.setSection				(rs.getInt(5));
			platform.setSubsection			(rs.getInt(6));
			platform.setParagraph			(rs.getInt(7));
			
			platform.setPlatform			(rs.getString(8));
			platform.setImpact				(rs.getInt(9));
			
			platform.setCreateUser			(rs.getString(10));
			platform.setCreateTimestamp		(rs.getTimestamp(11));
			platform.setModifyUser			(rs.getString(12));
			platform.setModifyTimestamp		(rs.getTimestamp(13));
			
			return platform;
			
		}
	});
  }
}
