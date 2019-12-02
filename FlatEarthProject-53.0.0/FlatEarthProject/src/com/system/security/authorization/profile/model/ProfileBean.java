package com.system.security.authorization.profile.model;

import java.sql.Timestamp;

public class ProfileBean implements Comparable<ProfileBean> {

	private int			id;
	
	private int 		groupId;			 
	private int 		userId;				 
	private int 		seq;			 
	
	private String 		menuName;
	private String 		screenName;
	private String 		fieldName;
	
	private int			profileStatus;
	private int			menuStatus;
	
	private String 		viewJsp;
	private int			screenStatus;
	private String 		controllerBean;
	
	private int			createStatus;
	private	int			readStatus;
	private int			updateStatus;
	private int			deleteStatus;
	
	private int			fieldVisible;
	private int			fieldEditable;
	
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public ProfileBean () {}

	public ProfileBean ( 
			     int 		id 		
			    ,int 		groupId 			 
			    ,int 		userId 				 
			    ,int		seq 			 
			    ,String 	menuName 
			    ,String 	screenName 
			    ,String 	fieldName 
			    ,int		profileStatus
			    ,int		menuStatus
			    ,String 	viewJsp
			    ,int		screenStatus
			    ,String 	controllerBean
			    ,int		createStatus
			    ,int		readStatus
			    ,int		updateStatus
			    ,int		deleteStatus
			    ,int		fieldVisible 
			    ,int		fieldEditable 
			    ,String 	createUser 			 
			    ,Timestamp 	createTimestamp 	 
			    ,String 	modifyUser 			 
			    ,Timestamp 	modifyTimestamp 		
			    ) {
		
		this.id 				= id;
		this.groupId 			= groupId;
		this.userId 			= userId;
		this.seq 				= seq;
		this.menuName 			= menuName;
		this.screenName 		= screenName;
		this.fieldName 			= fieldName;
		this.profileStatus 		= profileStatus;
		this.menuStatus 		= menuStatus;
		
		this.viewJsp 			= viewJsp;
		
		this.screenStatus 		= screenStatus;
		
		this.controllerBean 	= controllerBean;
		
		this.createStatus 		= createStatus;
		this.readStatus 		= readStatus;
		this.updateStatus 		= updateStatus;
		this.deleteStatus 		= deleteStatus;
		this.fieldVisible 		= fieldVisible;
		this.fieldEditable 		= fieldEditable;
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

	public int getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(int profileStatus) {
		this.profileStatus = profileStatus;
	}

	public int getMenuStatus() {
		return menuStatus;
	}

	public void setMenuStatus(int menuStatus) {
		this.menuStatus = menuStatus;
	}

	public String getViewJsp() {
		return viewJsp;
	}

	public void setViewJsp(String viewJsp) {
		this.viewJsp = viewJsp;
	}

	public int getScreenStatus() {
		return screenStatus;
	}

	public void setScreenStatus(int screenStatus) {
		this.screenStatus = screenStatus;
	}

	public String getControllerBean() {
		return controllerBean;
	}

	public void setControllerBean(String controllerBean) {
		this.controllerBean = controllerBean;
	}

	public int getCreateStatus() {
		return createStatus;
	}

	public void setCreateStatus(int createStatus) {
		this.createStatus = createStatus;
	}

	public int getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(int readStatus) {
		this.readStatus = readStatus;
	}

	public int getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(int updateStatus) {
		this.updateStatus = updateStatus;
	}

	public int getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(int deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public int getFieldVisible() {
		return fieldVisible;
	}

	public void setFieldVisible(int fieldVisible) {
		this.fieldVisible = fieldVisible;
	}

	public int getFieldEditable() {
		return fieldEditable;
	}

	public void setFieldEditable(int fieldEditable) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((controllerBean == null) ? 0 : controllerBean.hashCode());
		result = prime * result + createStatus;
		result = prime * result
				+ ((createTimestamp == null) ? 0 : createTimestamp.hashCode());
		result = prime * result
				+ ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + deleteStatus;
		result = prime * result + fieldEditable;
		result = prime * result
				+ ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + fieldVisible;
		result = prime * result + groupId;
		result = prime * result + id;
		result = prime * result
				+ ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + menuStatus;
		result = prime * result
				+ ((modifyTimestamp == null) ? 0 : modifyTimestamp.hashCode());
		result = prime * result
				+ ((modifyUser == null) ? 0 : modifyUser.hashCode());
		result = prime * result + profileStatus;
		result = prime * result + readStatus;
		result = prime * result
				+ ((screenName == null) ? 0 : screenName.hashCode());
		result = prime * result + screenStatus;
		result = prime * result + seq;
		result = prime * result + updateStatus;
		result = prime * result + userId;
		result = prime * result + ((viewJsp == null) ? 0 : viewJsp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileBean other = (ProfileBean) obj;
		if (controllerBean == null) {
			if (other.controllerBean != null)
				return false;
		} else if (!controllerBean.equals(other.controllerBean))
			return false;
		if (createStatus != other.createStatus)
			return false;
		if (createTimestamp == null) {
			if (other.createTimestamp != null)
				return false;
		} else if (!createTimestamp.equals(other.createTimestamp))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (deleteStatus != other.deleteStatus)
			return false;
		if (fieldEditable != other.fieldEditable)
			return false;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
			return false;
		if (fieldVisible != other.fieldVisible)
			return false;
		if (groupId != other.groupId)
			return false;
		if (id != other.id)
			return false;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (menuStatus != other.menuStatus)
			return false;
		if (modifyTimestamp == null) {
			if (other.modifyTimestamp != null)
				return false;
		} else if (!modifyTimestamp.equals(other.modifyTimestamp))
			return false;
		if (modifyUser == null) {
			if (other.modifyUser != null)
				return false;
		} else if (!modifyUser.equals(other.modifyUser))
			return false;
		if (profileStatus != other.profileStatus)
			return false;
		if (readStatus != other.readStatus)
			return false;
		if (screenName == null) {
			if (other.screenName != null)
				return false;
		} else if (!screenName.equals(other.screenName))
			return false;
		if (screenStatus != other.screenStatus)
			return false;
		if (seq != other.seq)
			return false;
		if (updateStatus != other.updateStatus)
			return false;
		if (userId != other.userId)
			return false;
		if (viewJsp == null) {
			if (other.viewJsp != null)
				return false;
		} else if (!viewJsp.equals(other.viewJsp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProfileBean [id=" + id + ", groupId=" + groupId + ", userId="
				+ userId + ", sequence=" + seq + ", menuName=" + menuName
				+ ", screenName=" + screenName + ", fieldName=" + fieldName
				+ ", profileStatus=" + profileStatus + ", menuStatus="
				+ menuStatus + ", viewJsp=" + viewJsp + ", screenStatus="
				+ screenStatus + ", controllerBean=" + controllerBean
				+ ", createStatus=" + createStatus + ", readStatus="
				+ readStatus + ", updateStatus=" + updateStatus
				+ ", deleteStatus=" + deleteStatus + ", fieldVisible="
				+ fieldVisible + ", fieldEditable=" + fieldEditable
				+ ", createUser=" + createUser + ", createTimestamp="
				+ createTimestamp + ", modifyUser=" + modifyUser
				+ ", modifyTimestamp=" + modifyTimestamp + "]";
	}

	public int compare(ProfileBean arg0, ProfileBean arg1) {
		return arg0.getId() - arg1.getId();
	}

	@Override
	public int compareTo(ProfileBean o) {
		return this.id - o.id;
	}
	
}