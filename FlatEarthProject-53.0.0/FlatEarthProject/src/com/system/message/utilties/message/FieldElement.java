package com.system.message.utilties.message;

import java.sql.Timestamp;
import java.util.List;

public class FieldElement {

	private int							id;
	private String 						fieldName;
	
	private List<String>				subFieldName;
	
	private String 						createUser;
	private Timestamp 					createTimestamp;
	private String 						modifyUser;
	private Timestamp 					modifyTimestamp;
	
	public FieldElement () {}

	public FieldElement(int id, String fieldName, List<String> subFieldName, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.fieldName = fieldName;
		this.subFieldName = subFieldName;
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

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<String> getSubFieldName() {
		return subFieldName;
	}

	public void setSubFieldName(List<String> subFieldName) {
		this.subFieldName = subFieldName;
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
