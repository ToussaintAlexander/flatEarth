package com.system.security.authorization.menu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.security.authorization.menu.model.MenuBean;

public class MenuDaoImpl implements MenuDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(MenuBean menu){

			String sql 
			
				= "INSERT INTO MENU_TABLE "
						+ "("
						+ " GROUP_ID"
						+ ",USER_ID"
						+ ",SEQ"
						+ ",PARENT_MENU"
						+ ",CHILD_MENU"
						+ ",PROFILE_STATUS"
						+ ",PARENT_MENU_STATUS"
						+ ",VIEW_JSP_PATH"
						+ ",CHILD_MENU_STATUS"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	menu.getGroupId()			+	"'"
						+ ",'"	+	menu.getUserId()			+	"'"
						+ ",'"	+	menu.getSeq()				+	"'"
						+ ",'"	+	menu.getParentMenu()		+	"'"
						+ ",'"	+	menu.getChildMenu()			+	"'"
						+ ",'"	+	menu.getProfileStatus()		+	"'"
						+ ",'"	+	menu.getParentMenuStatus()	+	"'"
						+ ",'"	+	menu.getViewJspPath()		+	"'"
						+ ",'"	+	menu.getChildMenuStatus()	+	"'"
						+ ",'"	+	menu.getCreateUser()		+	"'"
						+ ",'"	+	menu.getCreateTimestamp()	+	"'"
						+ ",'"	+	menu.getModifyUser()		+	"'"
						+ ",'"	+	menu.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(MenuBean menu){
	
	String sql =
			
			" UPDATE MENU_TABLE 	   		   " 	+
			
			"    SET GROUP_ID 				= '" 	+ menu.getGroupId() 			+	"'"	+
			"      , USER_ID 				= '"  	+ menu.getUserId()	 			+	"'"	+
			"      , SEQ 					= '"  	+ menu.getSeq()		 			+	"'"	+
			"      , PARENT_MENU 			= '"  	+ menu.getParentMenu() 			+	"'"	+
			"      , CHILD_MENU 			= '"  	+ menu.getChildMenu() 			+	"'"	+
			"      , PROFILE_STATUS 		= '"  	+ menu.getProfileStatus() 		+	"'"	+
			"      , PARENT_MENU_STATUS 	= '"  	+ menu.getParentMenuStatus() 	+	"'"	+
			"      , VIEW_JSP_PATH 			= '"  	+ menu.getViewJspPath() 		+	"'"	+
			"      , CHILD_MENU_STATUS 		= '"  	+ menu.getChildMenuStatus()	 	+	"'"	+
			"      , MODIFY_USER			= '" 	+ menu.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ menu.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 					= "		+ menu.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM MENU_TABLE " 	+
			"  WHERE ID = "				+
			         id					+
			"";
	
	return template.update(sql);
	
}

@Override
public MenuBean selectMenuById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM MENU_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<MenuBean>(MenuBean.class));
}

@Override
public List<MenuBean> selectChildMenuByParentMenu(String parentMenu){
	
	return template.query( "SELECT * FROM MENU_TABLE WHERE PARENT_MENU = ? ORDER BY ID"
						 ,new Object[] { parentMenu }
			 			 ,new RowMapper<MenuBean>(){

		public MenuBean mapRow(ResultSet rs, int row) throws SQLException {

		   MenuBean menu = new MenuBean();

		   menu.setId					(rs.getInt(1));
		   menu.setGroupId				(rs.getInt(2));
		   menu.setUserId				(rs.getInt(3));
		   menu.setSeq					(rs.getInt(4));
		   menu.setParentMenu			(rs.getString(5));
		   menu.setChildMenu			(rs.getString(6));
		   menu.setProfileStatus		(rs.getInt(7));
		   menu.setParentMenuStatus		(rs.getInt(8));
		   menu.setViewJspPath			(rs.getString(9));
		   menu.setChildMenuStatus		(rs.getInt(10));
		   menu.setCreateUser			(rs.getString(11));
		   menu.setCreateTimestamp		(rs.getTimestamp(12));
		   menu.setModifyUser			(rs.getString(13));
		   menu.setModifyTimestamp		(rs.getTimestamp(14));

		   return menu;

		}
	});
}

@Override
public List<MenuBean> select(){
	
	return template.query( "SELECT * FROM MENU_TABLE WHERE ID < 11"
						 ,new RowMapper<MenuBean>(){
		
		public MenuBean mapRow(ResultSet rs, int row) throws SQLException {
			
			MenuBean menu = new MenuBean();
			
			menu.setId					(rs.getInt(1));
			menu.setGroupId				(rs.getInt(2));
			menu.setUserId				(rs.getInt(3));
			menu.setSeq					(rs.getInt(4));
			menu.setParentMenu			(rs.getString(5));
			menu.setChildMenu			(rs.getString(6));
			menu.setProfileStatus		(rs.getInt(7));
			menu.setParentMenuStatus	(rs.getInt(8));
			menu.setViewJspPath			(rs.getString(9));
			menu.setChildMenuStatus		(rs.getInt(10));
			menu.setCreateUser			(rs.getString(11));
			menu.setCreateTimestamp		(rs.getTimestamp(12));
			menu.setModifyUser			(rs.getString(13));
			menu.setModifyTimestamp		(rs.getTimestamp(14));
			
			return menu;
			
		}
	});
  }
}
