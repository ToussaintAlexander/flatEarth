package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.SubSectionBean;

public class SubSectionDaoImpl implements SubSectionDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SubSectionBean subsection){

			String sql 
			
				= "INSERT INTO SUBSECTION_TABLE "
						+ "("
						+ " TITLE"
						
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	subsection.getTitle()				+	"'"
						
						+ ",'"	+	subsection.getEffectiveDate()		+	"'"
						+ ",'"	+	subsection.getMajorVersion()		+	"'"
						+ ",'"	+	subsection.getMinorVersion()		+	"'"
						+ ",'"	+	subsection.getSection()				+	"'"
						+ ",'"	+	subsection.getSubSection()			+	"'"
								
						+ ",'"	+	subsection.getCreateUser()			+	"'"
						+ ",'"	+	subsection.getCreateTimestamp()	+	"'"
						+ ",'"	+	subsection.getModifyUser()			+	"'"
						+ ",'"	+	subsection.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SubSectionBean subsection){
	
	String sql =
			
			" UPDATE SECTION_TABLE  " 	+
			
			"    SET TITLE 				= '" 	+ subsection.getTitle() 			+	"'"	+
			"      , EFFECTIVE_DATE 	= '"  	+ subsection.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ subsection.getMajorVersion()	 	+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ subsection.getMinorVersion()	 	+	"'"	+
			"      , SECTION 			= '"  	+ subsection.getSection()	 		+	"'"	+
			"      , SUBSECTION 		= '"  	+ subsection.getSubSection()	 	+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ subsection.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ subsection.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ subsection.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM SUBSECTION_TABLE 	"	+
			" WHERE ID 			= 		"	+
			        id						+
			" ";
	
	return template.update(sql);
	
}

@Override
public SubSectionBean selectSubSectionById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM SUBSECTION_TABLE "			+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SubSectionBean>(SubSectionBean.class));
	
}

@Override
public List<SubSectionBean> select(){
	
	return template.query( "SELECT * FROM SUBSECTION_TABLE"
						 ,new RowMapper<SubSectionBean>(){
		
		public SubSectionBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SubSectionBean subsection = new SubSectionBean();
			
			subsection.setId				(rs.getInt(1));
			subsection.setTitle				(rs.getString(2));
			subsection.setEffectiveDate		(rs.getDate(3));
			subsection.setMajorVersion		(rs.getInt(4));
			subsection.setMinorVersion		(rs.getInt(5));
			subsection.setSection			(rs.getInt(6));
			subsection.setSubSection		(rs.getInt(7));
			subsection.setCreateUser		(rs.getString(8));
			subsection.setCreateTimestamp	(rs.getTimestamp(9));
			subsection.setModifyUser		(rs.getString(10));
			subsection.setModifyTimestamp	(rs.getTimestamp(11));
			
			return subsection;
			
		}
	});
  }
}
