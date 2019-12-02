package com.system.message.routines;

import java.sql.Timestamp;

public class Code {

	private int 			id;
	private int 			codeName;
	private int 			codeValue;
	private String 			description;
	
	private String			createUser;
	private Timestamp		createTimestamp;
	private String			modifyUser;
	private Timestamp		modifyTimestamp;
	
	public Code () {}

	public Code(int id, int codeName, int codeValue, String description, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.codeName = codeName;
		this.codeValue = codeValue;
		this.description = description;
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

	public int getCodeName() {
		return codeName;
	}

	public void setCodeName(int codeName) {
		this.codeName = codeName;
	}

	public int getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(int codeValue) {
		this.codeValue = codeValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
