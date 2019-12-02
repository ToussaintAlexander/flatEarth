package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.SectionBean;

public class SectionDaoImpl implements SectionDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SectionBean section){

			String sql 
			
				= "INSERT INTO SECTION_TABLE "
						+ "("
						+ " TITLE"
						
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	section.getTitle()				+	"'"
						
						+ ",'"	+	section.getEffectiveDate()		+	"'"
						+ ",'"	+	section.getMajorVersion()		+	"'"
						+ ",'"	+	section.getMinorVersion()		+	"'"
						+ ",'"	+	section.getSection()			+	"'"
								
						+ ",'"	+	section.getCreateUser()			+	"'"
						+ ",'"	+	section.getCreateTimestamp()	+	"'"
						+ ",'"	+	section.getModifyUser()			+	"'"
						+ ",'"	+	section.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SectionBean section){
	
	String sql =
			
			" UPDATE SECTION_TABLE  " 	+
			
			"    SET TITLE 				= '" 	+ section.getTitle() 			+	"'"	+
			"      , EFFECTIVE_DATE 	= '"  	+ section.getEffectiveDate()	+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ section.getMajorVersion()	 	+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ section.getMinorVersion()	 	+	"'"	+
			"      , SECTION 			= '"  	+ section.getSection()	 		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ section.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ section.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ section.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM SECTION_TABLE 	"	+
			" WHERE ID 			= 		"	+
			        id						+
			" ";
	
	return template.update(sql);
	
}

@Override
public SectionBean selectSectionById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM SECTION_TABLE "			+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SectionBean>(SectionBean.class));
	
}

@Override
public List<SectionBean> select(){
	
	return template.query( "SELECT * FROM SECTION_TABLE"
						 ,new RowMapper<SectionBean>(){
		
		public SectionBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SectionBean section = new SectionBean();
			
			section.setId					(rs.getInt(1));
			section.setTitle				(rs.getString(2));
			section.setEffectiveDate		(rs.getDate(3));
			section.setMajorVersion			(rs.getInt(4));
			section.setMinorVersion			(rs.getInt(5));
			section.setSection				(rs.getInt(6));
			section.setCreateUser			(rs.getString(7));
			section.setCreateTimestamp		(rs.getTimestamp(8));
			section.setModifyUser			(rs.getString(9));
			section.setModifyTimestamp		(rs.getTimestamp(10));
			
			return section;
			
		}
	});
  }
}
