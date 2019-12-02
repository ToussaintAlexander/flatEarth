package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.AcronymBean;

public class AcronymDaoImpl implements AcronymDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AcronymBean acronym){

			String sql 
			
				= "INSERT INTO ACRONYM_TABLE "
						+ "("
						+ " SEQ"
						+ " ACRONYM"
						+ ",FULL_NAME"
						+ ",DESCRIPTION"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	acronym.getSeq()				+	"'"
						+ ",'"	+	acronym.getAcronym()			+	"'"
						+ ",'"	+	acronym.getFullName()			+	"'"
						+ ",'"	+	acronym.getDescription()		+	"'"
						+ ",'"	+	acronym.getCreateUser()			+	"'"
						+ ",'"	+	acronym.getCreateTimestamp()	+	"'"
						+ ",'"	+	acronym.getModifyUser()			+	"'"
						+ ",'"	+	acronym.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AcronymBean acronym){
	
	String sql =
			
			" UPDATE ACRONYM_TABLE 	  	   " 	+
			
			"    SET SEQ 				= '" 	+ acronym.getSeq() 				+	"'"	+
			"      , ACRONYM 			= '" 	+ acronym.getAcronym()	 		+	"'"	+
			"      , FULL_NAME 			= '"  	+ acronym.getFullName()	 		+	"'"	+
			"      , DESCRIPTION 		= '"  	+ acronym.getDescription()		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ acronym.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ acronym.getModifyTimestamp()  +	"'"	+	
			
			"  WHERE ID 				= "		+ acronym.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id, int seq){
	
	String sql =
			
			"DELETE FROM ACRONYM_TABLE "	+
			" WHERE ID = 		"			+
			       id						+
			" ";
	
	return template.update(sql);
	
}

@Override
public AcronymBean selectAcronymById(int id){
	
	String sql 
	
		= "SELECT * "					+
		 "   FROM ACRONYM_TABLE "		+
		 "  WHERE ID			 = ? "	+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<AcronymBean>(AcronymBean.class));
	
}

@Override
public List<AcronymBean> select(){
	
	return template.query( "SELECT * FROM ACRONYM_TABLE"
						 ,new RowMapper<AcronymBean>(){
		
		public AcronymBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AcronymBean acronym = new AcronymBean();
			
			acronym.setId				(rs.getInt(1));
			acronym.setSeq				(rs.getInt(2));
			acronym.setAcronym			(rs.getString(3));
			acronym.setFullName			(rs.getString(4));
			acronym.setDescription		(rs.getString(5));
			acronym.setCreateUser		(rs.getString(6));
			acronym.setCreateTimestamp	(rs.getTimestamp(7));
			acronym.setModifyUser		(rs.getString(8));
			acronym.setModifyTimestamp	(rs.getTimestamp(9));
			
			return acronym;
			
		}
	});
  }
}
