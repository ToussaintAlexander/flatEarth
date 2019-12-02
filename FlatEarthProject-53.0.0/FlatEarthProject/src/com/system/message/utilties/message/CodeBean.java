package com.system.message.utilties.message;

import java.sql.Timestamp;

public class CodeBean {

	private int 			id;
	private int 			codeField;
	private int 			codeSubfield;
	private String 			codeValue;
	private String 			codeName;
	private String 			description;
	
	private String			createUser;
	private Timestamp		createTimestamp;
	private String			modifyUser;
	private Timestamp		modifyTimestamp;
	
	public CodeBean () {}

	public CodeBean(int id, int codeField, int codeSubfield, String codeValue, String codeName, String description,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.codeField = codeField;
		this.codeSubfield = codeSubfield;
		this.codeValue = codeValue;
		this.codeName = codeName;
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

	public int getCodeField() {
		return codeField;
	}

	public void setCodeField(int codeField) {
		this.codeField = codeField;
	}

	public int getCodeSubfield() {
		return codeSubfield;
	}

	public void setCodeSubfield(int codeSubfield) {
		this.codeSubfield = codeSubfield;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeNumber) {
		this.codeValue = codeNumber;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
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
