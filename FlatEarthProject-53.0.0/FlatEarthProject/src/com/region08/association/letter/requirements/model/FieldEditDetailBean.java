package com.region08.association.letter.requirements.model;

import java.sql.Timestamp;

public class FieldEditDetailBean {
	
	private int id;
	private int field;
	private int subfield;
	private int seq;
	private int fire;
	private int type;
	private int group;
	private int binLayer;
	private int accountLayer;
	private int transactionLayer;
	private int routineSequence;
	private int pointer;
	private String fieldValue;
	
	private String 		createUser;
	private Timestamp 	createTimestamp;
	private String 		modifyUser;
	private Timestamp 	modifyTimestamp;
	
	public FieldEditDetailBean () {}

	public FieldEditDetailBean(int id, int field, int subfield, int seq, int fire, int type, int group,
			int binLayer, int accountLayer, int transactionLayer, int routineSequence, int pointer, String fieldValue,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field = field;
		this.subfield = subfield;
		this.seq = seq;
		this.fire = fire;
		this.type = type;
		this.group = group;
		this.binLayer = binLayer;
		this.accountLayer = accountLayer;
		this.transactionLayer = transactionLayer;
		this.routineSequence = routineSequence;
		this.pointer = pointer;
		this.fieldValue = fieldValue;
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

	public int getBinLayer() {
		return binLayer;
	}

	public void setBinLayer(int binLayer) {
		this.binLayer = binLayer;
	}

	public int getAccountLayer() {
		return accountLayer;
	}

	public void setAccountLayer(int accountLayer) {
		this.accountLayer = accountLayer;
	}

	public int getTransactionLayer() {
		return transactionLayer;
	}

	public void setTransactionLayer(int transactionLayer) {
		this.transactionLayer = transactionLayer;
	}

	public int getRoutineSequence() {
		return routineSequence;
	}

	public void setRoutineSequence(int routineSequence) {
		this.routineSequence = routineSequence;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
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