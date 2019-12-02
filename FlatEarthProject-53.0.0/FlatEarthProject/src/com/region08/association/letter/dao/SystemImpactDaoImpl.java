package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.SystemImpactBean;

public class SystemImpactDaoImpl implements SystemImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SystemImpactBean system){

			String sql 
			
				= "INSERT INTO SYSTEM_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",SYSTEM"
						+ ",TESTING_AVAILABLE"
						+ ",TESTING_REQUIRED"
						+ ",ACTIVATION_REQUIRED"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	system.getEffectiveDate()		+	"'"
						+ ",'"	+	system.getMajorVersion()		+	"'"
						+ ",'"	+	system.getMinorVersion()		+	"'"
						+ ",'"	+	system.getSection()				+	"'"
						+ ",'"	+	system.getSubsection()			+	"'"
						+ ",'"	+	system.getParagraph()			+	"'"
						+ ",'"	+	system.getSystem()				+	"'"
						+ ",'"	+	system.getTestingAvailable()	+	"'"
						+ ",'"	+	system.getTestingRequired()		+	"'"
						+ ",'"	+	system.getActivationRequired()	+	"'"
						+ ",'"	+	system.getCreateUser()			+	"'"
						+ ",'"	+	system.getCreateTimestamp()		+	"'"
						+ ",'"	+	system.getModifyUser()			+	"'"
						+ ",'"	+	system.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SystemImpactBean system){
	
	String sql =
			
			" UPDATE SYSTEM_IMPACT_TABLE " 			+
			
			"    SET EFFECTIVE_DATE 		= '"  	+ system.getEffectiveDate()			+	"'"	+
			"      , MAJOR_VERSION 			= '"  	+ system.getMajorVersion()			+	"'"	+
			"      , MINOR_VERSION 			= '"  	+ system.getMinorVersion()			+	"'"	+
			"      , SECTION 				= '"  	+ system.getSection()				+	"'"	+
			"      , SUBSECTION 			= '"  	+ system.getSubsection()			+	"'"	+
			"      , PARAGRAPH 				= '"  	+ system.getParagraph()				+	"'"	+
			
			"      , SYSTEM 				= '"  	+ system.getSystem()				+	"'"	+
			"      , TESTING_AVAILABLE 		= '"  	+ system.getTestingAvailable()		+	"'"	+
			"      , TESTING_REQUIRED 		= '"  	+ system.getTestingRequired()		+	"'"	+
			"      , ACTIVATION_REQUIRED 	= '"  	+ system.getActivationRequired()	+	"'"	+
			
			"      , MODIFY_USER			= '" 	+ system.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ system.getModifyTimestamp()		+	"'"	+	
			
			"  WHERE ID 					= "		+ system.getId()					+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM SYSTEM_IMPACT_TABLE "	+
			" WHERE ID = 		"				+
			       id							+
			" ";
	
	return template.update(sql);
	
}

@Override
public SystemImpactBean selectSystemImpactById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM SYSTEM_IMPACT_TABLE "		+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SystemImpactBean>(SystemImpactBean.class));
	
}

@Override
public List<SystemImpactBean> select(){
	
	return template.query( "SELECT * FROM SYSTEM_IMPACT_TABLE"
						 ,new RowMapper<SystemImpactBean>(){
		
		public SystemImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SystemImpactBean system = new SystemImpactBean();
			
			system.setId					(rs.getInt(1));
			
			system.setEffectiveDate			(rs.getDate(2));
			system.setMajorVersion			(rs.getInt(3));
			system.setMinorVersion			(rs.getInt(4));
			system.setSection				(rs.getInt(5));
			system.setSubsection			(rs.getInt(6));
			system.setParagraph				(rs.getInt(7));
			
			system.setSystem				(rs.getString(8));
			system.setTestingAvailable		(rs.getInt(9));
			system.setTestingRequired		(rs.getInt(10));
			system.setActivationRequired	(rs.getInt(11));
			
			system.setCreateUser			(rs.getString(12));
			system.setCreateTimestamp		(rs.getTimestamp(13));
			system.setModifyUser			(rs.getString(14));
			system.setModifyTimestamp		(rs.getTimestamp(15));
			
			return system;
			
		}
	});
  }
}
