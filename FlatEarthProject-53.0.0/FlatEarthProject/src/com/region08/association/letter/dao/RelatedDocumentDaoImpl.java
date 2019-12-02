package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.RelatedDocumentBean;

public class RelatedDocumentDaoImpl implements RelatedDocumentDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RelatedDocumentBean relatedDocument){

			String sql 
			
				= "INSERT INTO RELATED_DOCUMENT_TABLE "
						+ "("
						+ " SEQ"
						+ " DOCUMENT"
						+ ",VERSION"
						+ ",AUTHOR"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	relatedDocument.getSeq()				+	"'"
						+ ",'"	+	relatedDocument.getDocument()			+	"'"
						+ ",'"	+	relatedDocument.getVersion()			+	"'"
						+ ",'"	+	relatedDocument.getAuthor()				+	"'"
						
						+ ",'"	+	relatedDocument.getCreateUser()			+	"'"
						+ ",'"	+	relatedDocument.getCreateTimestamp()	+	"'"
						+ ",'"	+	relatedDocument.getModifyUser()			+	"'"
						+ ",'"	+	relatedDocument.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RelatedDocumentBean relatedDocument){
	
	String sql =
			
			" UPDATE RELATED_DOCUMENT_TABLE  " 	+
			
			"    SET SEQ 				= '" 	+ relatedDocument.getSeq() 				+	"'"	+
			"      , DOCUMENT 			= '" 	+ relatedDocument.getDocument()	 		+	"'"	+
			"      , VERSION 			= '"  	+ relatedDocument.getVersion()	 		+	"'"	+
			"      , AUTHOR 			= '"  	+ relatedDocument.getAuthor()	 		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ relatedDocument.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ relatedDocument.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ relatedDocument.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM RELATED_DOCUMENT_TABLE 	"	+
			" WHERE ID 			= 					"	+
			        id									+
			" ";
	
	return template.update(sql);
	
}

@Override
public RelatedDocumentBean selectRelatedDocumentById(int id){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM RELATED_DOCUMENT_TABLE "	+
		 "  WHERE ID			 = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RelatedDocumentBean>(RelatedDocumentBean.class));
	
}

@Override
public List<RelatedDocumentBean> select(){
	
	return template.query( "SELECT * FROM RELATED_DOCUMENT_TABLE"
						 ,new RowMapper<RelatedDocumentBean>(){
		
		public RelatedDocumentBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RelatedDocumentBean relatedDocument = new RelatedDocumentBean();
			
			relatedDocument.setId					(rs.getInt(1));
			relatedDocument.setSeq					(rs.getInt(2));
			relatedDocument.setDocument				(rs.getString(3));
			relatedDocument.setVersion				(rs.getString(4));
			relatedDocument.setAuthor				(rs.getString(5));
			relatedDocument.setCreateUser			(rs.getString(6));
			relatedDocument.setCreateTimestamp		(rs.getTimestamp(7));
			relatedDocument.setModifyUser			(rs.getString(8));
			relatedDocument.setModifyTimestamp		(rs.getTimestamp(9));
			
			return relatedDocument;
			
		}
	});
  }
}
