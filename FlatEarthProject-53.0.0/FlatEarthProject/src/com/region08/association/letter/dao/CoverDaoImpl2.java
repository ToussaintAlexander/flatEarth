package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.CoverBean;

public class CoverDaoImpl2 implements CoverDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CoverBean cover){

			String sql 
			
				= "INSERT INTO COVER_TABLE "
						+ "("
						+ " TITLE"
						+ ",SUBTITLE"
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	cover.getTitle()			+	"'"
						+ ",'"	+	cover.getSubtitle()			+	"'"
						+ ",'"	+	cover.getEffectiveDate()	+	"'"
						+ ",'"	+	cover.getMajorVersion()		+	"'"
						+ ",'"	+	cover.getMinorVersion()		+	"'"
						+ ",'"	+	cover.getCreateUser()		+	"'"
						+ ",'"	+	cover.getCreateTimestamp()	+	"'"
						+ ",'"	+	cover.getModifyUser()		+	"'"
						+ ",'"	+	cover.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CoverBean cover){
	
	String sql =
			
			" UPDATE COVER_TABLE 	  	   " 	+
			
			"    SET TITLE 				= '" 	+ cover.getTitle() 				+	"'"	+
			"      , SUBTITLE 			= '"  	+ cover.getSubtitle()	 		+	"'"	+
			"      , EFFECTIVE_DATE		= '"  	+ cover.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ cover.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ cover.getMinorVersion()		+	"'"	+
			"      , MODIFY_USER		= '" 	+ cover.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ cover.getModifyTimestamp() 	+	"'"	+	
			
			"  WHERE ID 				= "		+ cover.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM COVER_TABLE "	+
			" WHERE ID = 		"		+
			       id					+       
			" ";
	
	return template.update(sql);
	
}

@Override
public CoverBean selectCoverById(int id){
	
	String sql 
	
		= "SELECT * "					+
		 "   FROM COVER_TABLE "			+
		 "  WHERE ID			 = ? "	+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<CoverBean>(CoverBean.class));
	
}

@Override
public List<CoverBean> select(){
	
	return template.query( "SELECT * FROM COVER_TABLE"
						 ,new RowMapper<CoverBean>(){
		
		public CoverBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CoverBean cover = new CoverBean();
			
			cover.setId					(rs.getInt(1));
			cover.setTitle				(rs.getString(2));
			cover.setSubtitle			(rs.getString(3));
//			cover.setEffectiveDate		(rs.getDate(4));
			cover.setMajorVersion		(rs.getInt(5));
			cover.setMinorVersion		(rs.getInt(6));
			cover.setCreateUser			(rs.getString(7));
//			cover.setCreateTimestamp	(rs.getTimestamp(8));
			cover.setModifyUser			(rs.getString(9));
//			cover.setModifyTimestamp	(rs.getTimestamp(10));
			
			return cover;
			
		}
	});
  }
}
