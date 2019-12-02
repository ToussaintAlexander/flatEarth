package com.system.security.authorization.screen.model;

import java.sql.Timestamp;

public class ScreenBean {

	private int 		id;
	private int 		groupId;
	private int 		userId;
	private int 		seq;
	private String 		menuName;
	private String 		screenName;
	private int			createOperation;
	private int 		readOperation;
	private int 		updateOperation;
	private int			deleteOperation;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public ScreenBean () {}

	public ScreenBean(int id, int groupId, int userId, int seq, String menuName, String screenName,
			int createOperation, int readOperation, int updateOperation, int deleteOperation,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.userId = userId;
		this.seq = seq;
		this.menuName = menuName;
		this.screenName = screenName;
		this.createOperation = createOperation;
		this.readOperation = readOperation;
		this.updateOperation = updateOperation;
		this.deleteOperation = deleteOperation;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
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

	public int getCreateOperation() {
		return createOperation;
	}

	public void setCreateOperation(int createOperation) {
		this.createOperation = createOperation;
	}

	public int getReadOperation() {
		return readOperation;
	}

	public void setReadOperation(int readOperation) {
		this.readOperation = readOperation;
	}

	public int getUpdateOperation() {
		return updateOperation;
	}

	public void setUpdateOperation(int updateOperation) {
		this.updateOperation = updateOperation;
	}

	public int getDeleteOperation() {
		return deleteOperation;
	}

	public void setDeleteOperation(int deleteOperation) {
		this.deleteOperation = deleteOperation;
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