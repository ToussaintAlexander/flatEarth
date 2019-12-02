package com.system.security.authorization.screenfield.model;

import java.sql.Timestamp;

public class ScreenFieldBean {

	private int 		id;
	private int 		groupId;
	private int 		userId;
	private int 		seq;
	private String 		menuName;
	private String 		screenName;
	private String 		fieldName;
	private boolean 	fieldVisible;
	private boolean 	fieldEditable;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public ScreenFieldBean () {}
	
	public ScreenFieldBean (
						 int 		id
						,int 		groupId
						,int 		userId
						,int 		seq
						,String 	menuName
						,String 	screenName
						,String 	fieldName
						,boolean 	fieldVisible
						,boolean 	fieldEditable
					 	,String 	createUser
					 	,Timestamp	createTimestamp
					 	,String 	modifyUser
					 	,Timestamp modifyTimestamp
					 	) {	
		
		 this.id				= id;	
		 this.groupId			= groupId;
		 this.userId			= userId;
		 this.seq				= seq;	
		 this.menuName			= menuName;	
		 this.screenName		= screenName;	
		 this.fieldName			= fieldName;	
		 this.fieldVisible		= fieldVisible;	
		 this.fieldEditable		= fieldEditable;	
		 this.createUser 		= createUser;
		 this.createTimestamp 	= createTimestamp;
		 this.modifyUser 		= modifyUser;
		 this.modifyTimestamp 	= modifyTimestamp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public boolean isFieldVisible() {
		return fieldVisible;
	}
	public void setFieldVisible(boolean fieldVisible) {
		this.fieldVisible = fieldVisible;
	}
	public boolean isFieldEditable() {
		return fieldEditable;
	}
	public void setFieldEditable(boolean fieldEditable) {
		this.fieldEditable = fieldEditable;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}
	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}
	
}