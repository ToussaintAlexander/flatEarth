package com.region09.processor.issuer.explain.model;

import java.sql.Timestamp;

public class SingleRuleDetailExplainBean {

	private int id;
	private int field;
	private int subField;
	
	private int fire;
	
	private int type;
	private int group;
	
	private int binLevel;
	private int accountLevel;
	private int transactionLevel;
	
	private int pointer;
	private int sequence;
	private String value;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public SingleRuleDetailExplainBean () {}

	public SingleRuleDetailExplainBean(int id, int field, int subField, int fire, int type, int group, int binLevel,
			int accountLevel, int transactionLevel, int pointer, int sequence, String value, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field = field;
		this.subField = subField;
		this.fire = fire;
		this.type = type;
		this.group = group;
		this.binLevel = binLevel;
		this.accountLevel = accountLevel;
		this.transactionLevel = transactionLevel;
		this.pointer = pointer;
		this.sequence = sequence;
		this.value = value;
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

	public int getSubField() {
		return subField;
	}

	public void setSubField(int subField) {
		this.subField = subField;
	}

	public int getFire() {
		return fire;
	}

	public void setFire(int fire) {
		this.fire = fire;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getBinLevel() {
		return binLevel;
	}

	public void setBinLevel(int binLevel) {
		this.binLevel = binLevel;
	}

	public int getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(int accountLevel) {
		this.accountLevel = accountLevel;
	}

	public int getTransactionLevel() {
		return transactionLevel;
	}

	public void setTransactionLevel(int transactionLevel) {
		this.transactionLevel = transactionLevel;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
