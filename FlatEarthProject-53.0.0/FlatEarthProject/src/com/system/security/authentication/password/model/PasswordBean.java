package com.system.security.authentication.password.model;

import java.sql.Timestamp;

public class PasswordBean {

	private int 		id;
	private int 		groupId;			// NUMBER(03)	100-999		---> GROUP TABLE
	private int 		userId;				// NUMBER(03)	100-999		---> SHADOW TABLE
	private int 		seq;				// NUMBER (03)
	private String 		username;			// VARCHAR (08)
	private String 		password;			// VARCHAR (08)
	private String 		domain;				// VARCHAR (20)
	private String 		computerName;		// PB288L7
	private boolean		rememberMe;			// TRUE or FALSE
	private int 		passwordType;		// PERMANENT, TEMPORARY				---> Changed from String to int
	private String 		firstName;			// VARCHAR (20)
	private String 		lastName;			// VARCHAR (20)
	private int 		accountStatus;		// ACTIVE, INACTIVE, FROZEN, DELETED---> Changed from String to int
	private Timestamp 	lastAccess;			// TIMESTAMP
	private Timestamp 	passwordChange;		// TIMESTAMP
	private int 		passwordAttempts;	// 3 maximum = frozen
	private String 		createUser;			// VARCHAR(08)
	private Timestamp 	createTimestamp;	// TIMESTAMP(6)
	private String 		modifyUser;			// VARCHAR(08)
	private Timestamp 	modifyTimestamp;	// TIMESTAMP(6)
	
	public PasswordBean () {}
	
	public PasswordBean ( 
						   int id
			 			  ,int groupId 				 
			 			  ,int userId 					 
			 			  ,int seq 				 
			 			  ,String username 			 
			 			  ,String password 			 
			 			  ,String domain 				 
			 			  ,boolean rememberMe 			 
			 			  ,int passwordType 		 
			 			  ,String firstName 			 
			 			  ,String lastName 			 
			 			  ,int accountStatus 		 
			 			  ,Timestamp lastAccess 		 
			 			  ,Timestamp passwordChange 	 
			 			  ,int passwordAttempts 		 
			 			  ,String computerName 		 
			 			  ,String createUser 			 
			 			  ,Timestamp createTimestamp 	 
			 			  ,String modifyUser 			 
			 			  ,Timestamp modifyTimestamp 	 
			) {
		
		   this.id 					= id;
		   this.groupId 			= groupId;			 
		   this.userId 				= userId;				 
		   this.seq 				= seq;			 
		   this.username 			= username;		 
		   this.password 			= password;		 
		   this.domain 				= domain;	 
		   this.rememberMe 			= rememberMe;	 
		   this.passwordType 		= passwordType;	 
		   this.firstName 			= firstName;	 
		   this.lastName 			= lastName; 
		   this.accountStatus 		= accountStatus; 
		   this.lastAccess 			= lastAccess;
		   this.passwordChange 		= passwordChange;
		   this.passwordAttempts	= passwordAttempts;	 
		   this.computerName 		= computerName;
		   this.createUser 		 	= createUser;
		   this.createTimestamp 	= createTimestamp;
		   this.modifyUser 			= modifyUser;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public boolean getRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public int getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(int passwordType) {
		this.passwordType = passwordType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Timestamp getLastAccess() {
		return lastAccess;
	}
	public void setLastAccess(Timestamp lastAccess) {
		this.lastAccess = lastAccess;
	}
	public Timestamp getPasswordChange() {
		return passwordChange;
	}
	public void setPasswordChange(Timestamp passwordChange) {
		this.passwordChange = passwordChange;
	}
	public int getPasswordAttempts() {
		return passwordAttempts;
	}
	public void setPasswordAttempts(int passwordAttempts) {
		this.passwordAttempts = passwordAttempts;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
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