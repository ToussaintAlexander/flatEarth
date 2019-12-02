package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.MessageTypeImpactBean;

public class MessageTypeImpactDaoImpl implements MessageTypeImpactDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(MessageTypeImpactBean messageTypeImpact){

			String sql 
			
				= "INSERT INTO MESSAGE_TYPE_IMPACT_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",MESSAGE_TYPE"
						+ ",IMPACT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	messageTypeImpact.getEffectiveDate()	+	"'"
						+ ",'"	+	messageTypeImpact.getMajorVersion()		+	"'"
						+ ",'"	+	messageTypeImpact.getMinorVersion()		+	"'"
						+ ",'"	+	messageTypeImpact.getSection()			+	"'"
						+ ",'"	+	messageTypeImpact.getSubsection()		+	"'"
						+ ",'"	+	messageTypeImpact.getParagraph()		+	"'"
						+ ",'"	+	messageTypeImpact.getMessageType()		+	"'"
						+ ",'"	+	messageTypeImpact.getImpact()			+	"'"
						+ ",'"	+	messageTypeImpact.getCreateUser()		+	"'"
						+ ",'"	+	messageTypeImpact.getCreateTimestamp()	+	"'"
						+ ",'"	+	messageTypeImpact.getModifyUser()		+	"'"
						+ ",'"	+	messageTypeImpact.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(MessageTypeImpactBean messageTypeImpact){
	
	String sql =
			
			" UPDATE MESSAGE_TYPE_IMPACT_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ messageTypeImpact.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ messageTypeImpact.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ messageTypeImpact.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ messageTypeImpact.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ messageTypeImpact.getSubsection()			+	"'"	+
			"      , PARAGRAPH 			= '"  	+ messageTypeImpact.getParagraph()			+	"'"	+
			
			"      , MESSAGE_TYPE 		= '"  	+ messageTypeImpact.getMessageType()		+	"'"	+
			"      , IMPACT 			= '"  	+ messageTypeImpact.getImpact()				+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ messageTypeImpact.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ messageTypeImpact.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ messageTypeImpact.getId()					+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM MESSAGE_TYPE_IMPACT_TABLE "	+
			" WHERE ID = 		"						+
			       id									+
			" ";
	
	return template.update(sql);
	
}

@Override
public MessageTypeImpactBean selectMessageTypeImpactById(int id){
	
	String sql 
	
		= "SELECT * "							+
		 "   FROM MESSAGE_TYPE_IMPACT_TABLE "	+
		 "  WHERE ID			 = ? "			+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<MessageTypeImpactBean>(MessageTypeImpactBean.class));
	
}

@Override
public List<MessageTypeImpactBean> select(){
	
	return template.query( "SELECT * FROM MESSAGE_TYPE_IMPACT_TABLE"
						 ,new RowMapper<MessageTypeImpactBean>(){
		
		public MessageTypeImpactBean mapRow(ResultSet rs, int row) throws SQLException {
			
			MessageTypeImpactBean messageTypeImpact = new MessageTypeImpactBean();
			
			messageTypeImpact.setId					(rs.getInt(1));
			
			messageTypeImpact.setEffectiveDate		(rs.getDate(2));
			messageTypeImpact.setMajorVersion		(rs.getInt(3));
			messageTypeImpact.setMinorVersion		(rs.getInt(4));
			messageTypeImpact.setSection			(rs.getInt(5));
			messageTypeImpact.setSubsection			(rs.getInt(6));
			messageTypeImpact.setParagraph			(rs.getInt(7));
			
			messageTypeImpact.setMessageType		(rs.getString(8));
			messageTypeImpact.setImpact				(rs.getInt(9));
			
			messageTypeImpact.setCreateUser			(rs.getString(10));
			messageTypeImpact.setCreateTimestamp	(rs.getTimestamp(11));
			messageTypeImpact.setModifyUser			(rs.getString(12));
			messageTypeImpact.setModifyTimestamp	(rs.getTimestamp(13));
			
			return messageTypeImpact;
			
		}
	});
  }
}
