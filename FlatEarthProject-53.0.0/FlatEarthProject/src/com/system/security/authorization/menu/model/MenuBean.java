package com.system.security.authorization.menu.model;

import java.sql.Timestamp;

public class MenuBean implements Comparable<MenuBean> {

	private int			id;
	private int 		groupId;			 
	private int 		userId;				 
	private int 		seq;			 
	private String 		parentMenu;
	private String 		childMenu;
	private int			profileStatus;
	private int			parentMenuStatus;
	private String 		viewJspPath;
	private int			childMenuStatus;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;

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

	public String getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(String parentMenu) {
		this.parentMenu = parentMenu;
	}

	public String getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(String childMenu) {
		this.childMenu = childMenu;
	}

	public int getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(int profileStatus) {
		this.profileStatus = profileStatus;
	}

	public int getParentMenuStatus() {
		return parentMenuStatus;
	}

	public void setParentMenuStatus(int parentMenuStatus) {
		this.parentMenuStatus = parentMenuStatus;
	}

	public String getViewJspPath() {
		return viewJspPath;
	}

	public void setViewJspPath(String viewJspPath) {
		this.viewJspPath = viewJspPath;
	}

	public int getChildMenuStatus() {
		return childMenuStatus;
	}

	public void setChildMenuStatus(int childMenuStatus) {
		this.childMenuStatus = childMenuStatus;
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

	@Override
	public int compareTo(MenuBean arg0) {
		return 0;
	}
}