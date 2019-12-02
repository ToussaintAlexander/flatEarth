package com.system.language.message.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.language.message.model.MessageBean;

public class MessageDaoImpl implements MessageDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(MessageBean message){

			String sql 
			
				= "INSERT INTO MESSAGE_TABLE "
						+ "("
						+ ",code"
						+ ",description"
						+ ",cause"
						+ ",effect"
						+ ",recovery"
						+ ",create_user"
						+ ",create_timestamp"
						+ ",modify_user"
						+ ",modify_timestamp"
						+ ") "
						+ "values"
						+ "('"	+	message.getCode()				+	"'"
						+ ",'"	+	message.getDescription()		+	"'"
						+ ",'"	+	message.getCause()				+	"'"
						+ ",'"	+	message.getEffect()				+	"'"
						+ ",'"	+	message.getRecovery()			+	"'"
						+ ",'"	+	message.getCreateUser()			+	"'"
						+ ",'"	+	message.getCreateTimestamp()	+	"'"
						+ ",'"	+	message.getModifyUser()			+	"'"
						+ ",'"	+	message.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(MessageBean message){
	
	String sql =
			
			" UPDATE MESSAGE_TABLE " 			+
			
			"    SET code 				= '"  	+ message.getCode()				+	"'"	+
			"      , description		= '" 	+ message.getDescription()  	+	"'"	+
			"      , cause				= '" 	+ message.getCause()  			+	"'"	+
			"      , effect				= '" 	+ message.getEffect()  			+	"'"	+
			"      , recovery			= '" 	+ message.getRecovery()  		+	"'"	+
			"      , modify_user		= '" 	+ message.getModifyUser()  		+	"'"	+
			"      , modify_timestamp	= '" 	+ message.getModifyTimestamp()  +	"'"	+	
			
			"  WHERE id 				= "		+ message.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM MESSAGE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public MessageBean selectMessageById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM MESSAGE_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<MessageBean>(MessageBean.class));
	
}

@Override
public List<MessageBean> select(){
	
	return template.query( "SELECT * FROM MESSAGE_TABLE"
						 ,new RowMapper<MessageBean>(){
		
		public MessageBean mapRow(ResultSet rs, int row) throws SQLException {
			
			MessageBean message = new MessageBean();
			
			message.setId				(rs.getInt(1));
			message.setCode				(rs.getInt(2));
			message.setDescription		(rs.getString(3));
			message.setCause			(rs.getString(4));
			message.setEffect			(rs.getString(5));
			message.setRecovery			(rs.getString(6));
			message.setCreateUser		(rs.getString(7));
			message.setCreateTimestamp	(rs.getTimestamp(8));
			message.setModifyUser		(rs.getString(9));
			message.setModifyTimestamp	(rs.getTimestamp(10));
			
			return message;
			
		}
	});
  }
}
