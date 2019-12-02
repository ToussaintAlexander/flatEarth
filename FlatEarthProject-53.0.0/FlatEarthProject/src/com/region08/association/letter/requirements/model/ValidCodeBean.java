package com.region08.association.letter.requirements.model;

import java.sql.Timestamp;

public class ValidCodeBean {
	
	private int 		id;
	
	private int 		field;
	private int 		subfield;
	private int 		seq;
	
	private String 		code;
	private String 		name;
	private String 		description;
	
	public String 		createUser;
	public Timestamp 	createTimestamp;
	public String 		modifyUser;
	public Timestamp 	modifyTimestamp;
	
	public ValidCodeBean () {}

	public ValidCodeBean(int id, int field, int subfield, int seq, String code, String name, String description,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field = field;
		this.subfield = subfield;
		this.seq = seq;
		this.code = code;
		this.name = name;
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

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	public int getSubfield() {
		return subfield;
	}

	public void setSubfield(int subfield) {
		this.subfield = subfield;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
