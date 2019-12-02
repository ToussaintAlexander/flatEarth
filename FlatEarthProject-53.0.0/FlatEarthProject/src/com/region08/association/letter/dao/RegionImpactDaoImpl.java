package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.RegionImpactBean;

public class RegionImpactDaoImpl implements RegionImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RegionImpactBean region){

			String sql 
			
				= "INSERT INTO REGION_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",REGION"
						+ ",IMPACT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	region.getEffectiveDate()		+	"'"
						+ ",'"	+	region.getMajorVersion()		+	"'"
						+ ",'"	+	region.getMinorVersion()		+	"'"
						+ ",'"	+	region.getSection()				+	"'"
						+ ",'"	+	region.getSubsection()			+	"'"
						+ ",'"	+	region.getParagraph()			+	"'"
						+ ",'"	+	region.getRegion()				+	"'"
						+ ",'"	+	region.getImpact()				+	"'"
						+ ",'"	+	region.getCreateUser()			+	"'"
						+ ",'"	+	region.getCreateTimestamp()		+	"'"
						+ ",'"	+	region.getModifyUser()			+	"'"
						+ ",'"	+	region.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RegionImpactBean region){
	
	String sql =
			
			" UPDATE REGION_IMPACT_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ region.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ region.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ region.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ region.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ region.getSubsection()		+	"'"	+
			"      , PARAGRAPH 			= '"  	+ region.getParagraph()			+	"'"	+
			
			"      , REGION 			= '"  	+ region.getRegion()			+	"'"	+
			"      , IMPACT 			= '"  	+ region.getImpact()			+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ region.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ region.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ region.getId()				+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM REGION_IMPACT_TABLE "	+
			" WHERE ID = 		"					+
			       id								+
			" ";
	
	return template.update(sql);
	
}

@Override
public RegionImpactBean selectRegionImpactById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM REGION_IMPACT_TABLE "		+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RegionImpactBean>(RegionImpactBean.class));
	
}

@Override
public List<RegionImpactBean> select(){
	
	return template.query( "SELECT * FROM REGION_IMPACT_TABLE"
						 ,new RowMapper<RegionImpactBean>(){
		
		public RegionImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RegionImpactBean region = new RegionImpactBean();
			
			region.setId					(rs.getInt(1));
			
			region.setEffectiveDate			(rs.getDate(2));
			region.setMajorVersion			(rs.getInt(3));
			region.setMinorVersion			(rs.getInt(4));
			region.setSection				(rs.getInt(5));
			region.setSubsection			(rs.getInt(6));
			region.setParagraph				(rs.getInt(7));
			
			region.setRegion				(rs.getString(8));
			region.setImpact				(rs.getInt(9));
			
			region.setCreateUser			(rs.getString(10));
			region.setCreateTimestamp		(rs.getTimestamp(11));
			region.setModifyUser			(rs.getString(12));
			region.setModifyTimestamp		(rs.getTimestamp(13));
			
			return region;
			
		}
	});
  }
}
