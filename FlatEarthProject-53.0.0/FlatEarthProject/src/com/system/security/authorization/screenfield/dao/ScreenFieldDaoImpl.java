package com.system.security.authorization.screenfield.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.security.authorization.screenfield.model.ScreenFieldBean;

public class ScreenFieldDaoImpl implements ScreenFieldDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ScreenFieldBean field){

			String sql 
			
				= "INSERT INTO SCREEN_FIELD_TABLE "
						+ "("
						+ " GROUP_ID"
						+ ",USER_ID"
						+ ",SEQ"
						+ ",MENU_NAME"
						+ ",SCREEN_NAME"
						+ ",FIELD_NAME"
						+ ",FIELD_VISIBLE"
						+ ",FIELD_EDITABLE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	field.getGroupId()				+	"'"
						+ ",'"	+	field.getUserId()				+	"'"
						+ ",'"	+	field.getSeq()					+	"'"
						+ ",'"	+	field.getMenuName()				+	"'"
						+ ",'"	+	field.getScreenName()			+	"'"
						+ ",'"	+	field.getFieldName()			+	"'"
						+ ",'"	+	field.isFieldVisible()			+	"'"
						+ ",'"	+	field.isFieldEditable()			+	"'"
						+ ",'"	+	field.getCreateUser()			+	"'"
						+ ",'"	+	field.getCreateTimestamp()		+	"'"
						+ ",'"	+	field.getModifyUser()			+	"'"
						+ ",'"	+	field.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ScreenFieldBean field){
	
	String sql =
			
			" UPDATE SCREEN_FIELD_TABLE " 		+
			
			"    SET GROUP_ID 			= '" 	+ field.getGroupId() 			+	"'"	+
			"      , USER_ID 			= '"  	+ field.getUserId()			 	+	"'"	+
			"      , SEQ				= '" 	+ field.getSeq()  				+	"'"	+
			"      , MENU_NAME			= '" 	+ field.getMenuName()  			+	"'"	+
			"      , SCREEN_NAME		= '" 	+ field.getScreenName()  		+	"'"	+
			"      , FIELD_NAME			= '" 	+ field.getFieldName()  		+	"'"	+
			"      , FIELD_VISIBLE		= '" 	+ field.isFieldVisible()  		+	"'"	+
			"      , FIELD_EDITABLE		= '" 	+ field.isFieldEditable()  		+	"'"	+
			"      , MODIFY_USER		= '" 	+ field.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ field.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ field.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM SCREEN_FIELD_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public ScreenFieldBean selectFieldById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM SCREEN_FIELD_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ScreenFieldBean>(ScreenFieldBean.class));
	
}

@Override
public List<ScreenFieldBean> select(){
	
	return template.query( "SELECT * FROM SCREEN_FIELD_TABLE"
						 ,new RowMapper<ScreenFieldBean>(){
		
		public ScreenFieldBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ScreenFieldBean field = new ScreenFieldBean();
			
			field.setId					(rs.getInt(1));
			field.setGroupId			(rs.getInt(2));
			field.setUserId				(rs.getInt(3));
			field.setSeq				(rs.getInt(4));
			field.setMenuName			(rs.getString(5));
			field.setScreenName			(rs.getString(6));
			field.setFieldName			(rs.getString(7));
			field.setFieldVisible		(rs.getBoolean(8));
			field.setFieldEditable		(rs.getBoolean(9));
			field.setCreateUser			(rs.getString(10));
			field.setCreateTimestamp	(rs.getTimestamp(11));
			field.setModifyUser			(rs.getString(12));
			field.setModifyTimestamp	(rs.getTimestamp(13));
			
			return field;
			
		}
	});
  }
}
