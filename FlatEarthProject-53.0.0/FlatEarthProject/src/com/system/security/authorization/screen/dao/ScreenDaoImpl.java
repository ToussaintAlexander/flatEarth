package com.system.security.authorization.screen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.security.authorization.screen.model.ScreenBean;

public class ScreenDaoImpl implements ScreenDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ScreenBean screen){

			String sql 
			
				= "INSERT INTO SCREEN_TABLE "
						+ "("
						+ " GROUP_ID"
						+ ",USER_ID"
						+ ",SEQ"
						+ ",MENU_NAME"
						+ ",SCREEN_NAME"
						+ ",CREATE_OPERATION"
						+ ",READ_OPERATION"
						+ ",UPDATE_OPERATION"
						+ ",DELETE_OPERATION"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	screen.getGroupId()				+	"'"
						+ ",'"	+	screen.getUserId()				+	"'"
						+ ",'"	+	screen.getSeq()					+	"'"
						+ ",'"	+	screen.getMenuName()			+	"'"
						+ ",'"	+	screen.getScreenName()			+	"'"
						+ ",'"	+	screen.getCreateOperation()		+	"'"
						+ ",'"	+	screen.getReadOperation()		+	"'"
						+ ",'"	+	screen.getUpdateOperation()		+	"'"
						+ ",'"	+	screen.getDeleteOperation()		+	"'"
						+ ",'"	+	screen.getCreateUser()			+	"'"
						+ ",'"	+	screen.getCreateTimestamp()		+	"'"
						+ ",'"	+	screen.getModifyUser()			+	"'"
						+ ",'"	+	screen.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ScreenBean screen){
	
	String sql =
			
			" UPDATE SCREEN_TABLE " 				+
			
			"    SET GROUP_ID 				= '" 	+ screen.getGroupId() 				+	"'"	+
			"      , USER_ID 				= '"  	+ screen.getUserId()			 	+	"'"	+
			"      , SEQ					= '" 	+ screen.getSeq()  					+	"'"	+
			"      , MENU_NAME				= '" 	+ screen.getMenuName()  			+	"'"	+
			"      , SCREEN_NAME			= '" 	+ screen.getScreenName()  			+	"'"	+
			"      , CREATE_OPERATION		= '" 	+ screen.getCreateOperation()  		+	"'"	+
			"      , READ_OPERATION			= '" 	+ screen.getReadOperation()  		+	"'"	+
			"      , UPDATE_OPERATION		= '" 	+ screen.getUpdateOperation()  		+	"'"	+
			"      , DELETE_OPERATION		= '" 	+ screen.getDeleteOperation()  		+	"'"	+
			"      , MODIFY_USER			= '" 	+ screen.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ screen.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 					= "		+ screen.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM SCREEN_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public ScreenBean selectScreenById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM SCREEN_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ScreenBean>(ScreenBean.class));
	
}

@Override
public List<ScreenBean> select(){
	
	return template.query( "SELECT * FROM SCREEN_TABLE"
						 ,new RowMapper<ScreenBean>(){
		
		public ScreenBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ScreenBean screen = new ScreenBean();
			
			screen.setId				(rs.getInt(1));
			screen.setGroupId			(rs.getInt(2));
			screen.setUserId			(rs.getInt(3));
			screen.setSeq				(rs.getInt(4));
			screen.setMenuName			(rs.getString(5));
			screen.setScreenName		(rs.getString(6));
			screen.setCreateOperation	(rs.getInt(7));
			screen.setReadOperation		(rs.getInt(8));
			screen.setUpdateOperation	(rs.getInt(9));
			screen.setDeleteOperation	(rs.getInt(10));
			screen.setCreateUser		(rs.getString(11));
			screen.setCreateTimestamp	(rs.getTimestamp(12));
			screen.setModifyUser		(rs.getString(13));
			screen.setModifyTimestamp	(rs.getTimestamp(14));
			
			return screen;
			
		}
	});
  }
}
