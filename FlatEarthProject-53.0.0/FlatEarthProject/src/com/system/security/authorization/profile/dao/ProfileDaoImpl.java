                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      package com.system.security.authorization.profile.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.security.authorization.profile.model.ProfileBean;

public class ProfileDaoImpl implements ProfileDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/***********************************************************************************/
	/***********************************************************************************/
	@Override
	public boolean insert(ProfileBean profile) {
		
		String sql 
		
			= "INSERT INTO PROFILE_TABLE "
					+ "("
					+ ",GROUP_ID"
					+ ",USER_ID"
					+ ",SEQ"
					+ ",MENU_NAME"
					+ ",SCREEN_NAME"
					+ ",FIELD_NAME"
					+ ",PROFILE_STATUS"
					+ ",MENU_STATUS"
					+ ",VIEW_JSP"
					+ ",SCREEN_STATUS"
					+ ",CONTROLLER_BEAN"
					+ ",CREATE_STATUS"
					+ ",READ_STATUS"
					+ ",UPDATE_STATUS"
					+ ",DELETE_STATUS"
					+ ",FIELD_VISIBLE"
					+ ",FIELD_EDITABLE"
					
					+ ",CREATE_USER"
					+ ",CREATE_TIMESTAMP"
					+ ",MODIFY_USER"
					+ ",MODIFY_TIMESTAMP"
					+ ") "
					+ "VALUES"
					+ "('"	+	profile.getGroupId()			+	"'"
					+ ",'"	+	profile.getUserId()				+	"'"
					+ ",'"	+	profile.getSeq()				+	"'"
					+ ",'"	+	profile.getMenuName()			+	"'"
					+ ",'"	+	profile.getScreenName()			+	"'"
					+ ",'"	+	profile.getFieldName()			+	"'"
					+ ",'"	+	profile.getProfileStatus()		+	"'"
					+ ",'"	+	profile.getMenuStatus()			+	"'"
					+ ",'"	+	profile.getViewJsp()			+	"'"
					+ ",'"	+	profile.getScreenStatus()		+	"'"
					+ ",'"	+	profile.getControllerBean()		+	"'"
					+ ",'"	+	profile.getCreateStatus()		+	"'"
					+ ",'"	+	profile.getReadStatus()			+	"'"
					+ ",'"	+	profile.getUpdateStatus()		+	"'"
					+ ",'"	+	profile.getDeleteStatus()		+	"'"
					+ ",'"	+	profile.getFieldVisible()		+	"'"
					+ ",'"	+	profile.getFieldEditable()		+	"'"
							
					+ ",'"	+	profile.getCreateUser()			+	"'"
					+ ",'"	+	profile.getCreateTimestamp()	+	"'"
					+ ",'"	+	profile.getModifyUser()			+	"'"
					+ ",'"	+	profile.getModifyTimestamp()	+	"'"
					+ ")";

		return template.update(sql) == 1 ? true : false;

	}
	/***********************************************************************************/
	/***********************************************************************************/
	@Override
	public boolean update(ProfileBean profile) {
		
		String sql =
				
				" UPDATE PROFILE_TABLE " 			+
				
				"    SET GROUP_ID 			= '"  	+ profile.getGroupId()			+	"'"	+
				"      , USER_ID			= '" 	+ profile.getUserId()  			+	"'"	+
				"      , SEQ				= '" 	+ profile.getSeq()  			+	"'"	+
				"      , MENU_NAME			= '" 	+ profile.getMenuName()  		+	"'"	+
				"      , SCREEN_NAME		= '" 	+ profile.getScreenName()  		+	"'"	+
				"      , FIELD_NAME			= '" 	+ profile.getFieldName()  		+	"'"	+
				"      , PROFILE_STATUS		= '" 	+ profile.getProfileStatus()  	+	"'"	+
				"      , MENU_STATUS		= '" 	+ profile.getMenuStatus()  		+	"'"	+
				"      , VIEW_JSP			= '" 	+ profile.getViewJsp()  		+	"'"	+
				"      , SCREEN_STATUS		= '" 	+ profile.getScreenStatus()  	+	"'"	+
				"      , CONTROLLER_BEAN	= '" 	+ profile.getControllerBean()  	+	"'"	+
				"      , CREATE_STATUS		= '" 	+ profile.getCreateStatus()  	+	"'"	+
				"      , READ_STATUS		= '" 	+ profile.getReadStatus()  		+	"'"	+
				"      , UPDATE_STATUS		= '" 	+ profile.getUpdateStatus()  	+	"'"	+
				"      , DELETE_STATUS		= '" 	+ profile.getDeleteStatus()  	+	"'"	+
				"      , FIELD_VISIBLE		= '" 	+ profile.getFieldVisible()  	+	"'"	+
				"      , FIELD_EDITABLE		= '" 	+ profile.getFieldEditable() 	+	"'"	+
				
				"      , MODIFY_USER		= '" 	+ profile.getModifyUser()  		+	"'"	+
				"      , MODIFY_TIMESTAMP	= '" 	+ profile.getModifyTimestamp()  +	"'"	+	
				
				"  WHERE ID 				= "		+ profile.getId()				+ 	"";
		
		return template.update(sql) == 1 ? true : false;	
			
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public boolean delete(int id) {
		
			String sql =
					
					 " DELETE FROM PROFILE_TABLE "		+
					 "  WHERE ID 		=   	 "		+ id		+
					 " ";
			
			return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************
	***********************************************************************************/	
	@Override
	public ProfileBean selectProfileById(int id){
		
		String sql 
		
			= "SELECT * "
			+ "  FROM PROFILE_TABLE "
			+ " WHERE ID = ?";
		
		return template.queryForObject( sql
									  , new Object[]{id}
									  , new BeanPropertyRowMapper<ProfileBean>(ProfileBean.class));
		
	}
	/***********************************************************************************
	***********************************************************************************/	
	@Override
	public List<ProfileBean> select() {
		
		return template.query( "SELECT * FROM PROFILE_TABLE"
							 ,new RowMapper<ProfileBean>(){
					
				public ProfileBean mapRow(ResultSet rs1, int row) throws SQLException {
						
						ProfileBean profileBean = new ProfileBean();
						
						profileBean.setId				(rs1.getInt			("ID"));
						profileBean.setGroupId			(rs1.getInt			("GROUP_ID"));
						profileBean.setUserId			(rs1.getInt			("USER_ID"));
						profileBean.setSeq				(rs1.getInt			("SEQ"));
						profileBean.setMenuName			(rs1.getString		("MENU_NAME"));
						profileBean.setScreenName		(rs1.getString		("SCREEN_NAME"));
						profileBean.setFieldName		(rs1.getString		("FIELD_NAME"));
						profileBean.setProfileStatus	(rs1.getInt			("PROFILE_STATUS"));
						profileBean.setMenuStatus		(rs1.getInt			("MENU_STATUS"));
						profileBean.setViewJsp			(rs1.getString		("VIEW_JSP"));
						profileBean.setScreenStatus		(rs1.getInt			("SCREEN_STATUS"));
						profileBean.setControllerBean	(rs1.getString		("CONTROLLER_BEAN"));
						profileBean.setCreateStatus		(rs1.getInt			("CREATE_STATUS"));
						profileBean.setReadStatus		(rs1.getInt			("READ_STATUS"));
						profileBean.setUpdateStatus		(rs1.getInt			("UPDATE_STATUS"));
						profileBean.setDeleteStatus		(rs1.getInt			("DELETE_STATUS"));
						profileBean.setFieldVisible		(rs1.getInt			("FIELD_VISIBLE"));
						profileBean.setFieldEditable	(rs1.getInt			("FIELD_EDITABLE"));
						profileBean.setCreateUser		(rs1.getString		("CREATE_USER"));
						profileBean.setCreateTimestamp	(rs1.getTimestamp	("CREATE_TIMESTAMP"));
						profileBean.setModifyUser		(rs1.getString		("MODIFY_USER"));
						profileBean.setModifyTimestamp	(rs1.getTimestamp	("MODIFY_TIMESTAMP"));
						
						return profileBean;
						
					}
				});
	}

}
