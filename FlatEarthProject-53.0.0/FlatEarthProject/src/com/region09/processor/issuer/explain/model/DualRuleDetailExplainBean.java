package com.region09.processor.issuer.explain.model;

import java.sql.Timestamp;

public class DualRuleDetailExplainBean {

	private int id;
	
	private int field1;
	private int subField1;
	private int fire1;
	private int type1;
	private int group1;
	private int binLevel1;
	private int accountLevel1;
	private int transactionLevel1;
	private int pointer1;
	private int sequence1;
	private String value1;
	
	private int field2;
	private int subField2;
	private int fire2;
	private int type2;
	private int group2;
	private int binLevel2;
	private int accountLevel2;
	private int transactionLevel2;
	
	private int pointer2;
	private int sequence2;
	private String value2;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public DualRuleDetailExplainBean () {}

	public DualRuleDetailExplainBean(int id, int field1, int subField1, int fire1, int type1, int group1, int binLevel1,
			int accountLevel1, int transactionLevel1, int pointer1, int sequence1, String value1, int field2, int subField2,int fire2,
			int type2, int group2, int binLevel2, int accountLevel2, int transactionLevel2, int pointer2, int sequence2,
			String value2, String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field1 = field1;
		this.subField1 = subField1;
		this.fire1 = fire1;
		this.type1 = type1;
		this.group1 = group1;
		this.binLevel1 = binLevel1;
		this.accountLevel1 = accountLevel1;
		this.transactionLevel1 = transactionLevel1;
		this.pointer1 = pointer1;
		this.sequence1 = sequence1;
		this.value1 = value1;
		this.field2 = field2;		
		this.subField2 = subField2;
		this.fire2 = fire2;
		this.type2 = type2;
		this.group2 = group2;
		this.binLevel2 = binLevel2;
		this.accountLevel2 = accountLevel2;
		this.transactionLevel2 = transactionLevel2;
		this.pointer2 = pointer2;
		this.sequence2 = sequence2;
		this.value2 = value2;
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

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public int getSubField1() {
		return subField1;
	}

	public void setSubField1(int subField1) {
		this.subField1 = subField1;
	}

	public int getFire1() {
		return fire1;
	}

	public void setFire1(int fire1) {
		this.fire1 = fire1;
	}

	public int getType1() {
		return type1;
	}

	public void setType1(int type1) {
		this.type1 = type1;
	}

	public int getGroup1() {
		return group1;
	}

	public void setGroup1(int group1) {
		this.group1 = group1;
	}

	public int getBinLevel1() {
		return binLevel1;
	}

	public void setBinLevel1(int binLevel1) {
		this.binLevel1 = binLevel1;
	}

	public int getAccountLevel1() {
		return accountLevel1;
	}

	public void setAccountLevel1(int accountLevel1) {
		this.accountLevel1 = accountLevel1;
	}

	public int getTransactionLevel1() {
		return transactionLevel1;
	}

	public void setTransactionLevel1(int transactionLevel1) {
		this.transactionLevel1 = transactionLevel1;
	}

	public int getPointer1() {
		return pointer1;
	}

	public void setPointer1(int pointer1) {
		this.pointer1 = pointer1;
	}

	public int getSequence1() {
		return sequence1;
	}

	public void setSequence1(int sequence1) {
		this.sequence1 = sequence1;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	public int getField2() {
		return field2;
	}

	public void setField2(int field2) {
		this.field2 = field2;
	}

	public int getSubField2() {
		return subField2;
	}

	public void setSubField2(int subField2) {
		this.subField2 = subField2;
	}
	
	public int getFire2() {
		return fire2;
	}

	public void setFire2(int fire2) {
		this.fire2 = fire2;
	}

	public int getType2() {
		return type2;
	}

	public void setType2(int type2) {
		this.type2 = type2;
	}

	public int getGroup2() {
		return group2;
	}

	public void setGroup2(int group2) {
		this.group2 = group2;
	}

	public int getBinLevel2() {
		return binLevel2;
	}

	public void setBinLevel2(int binLevel2) {
		this.binLevel2 = binLevel2;
	}

	public int getAccountLevel2() {
		return accountLevel2;
	}

	public void setAccountLevel2(int accountLevel2) {
		this.accountLevel2 = accountLevel2;
	}

	public int getTransactionLevel2() {
		return transactionLevel2;
	}

	public void setTransactionLevel2(int transactionLevel2) {
		this.transactionLevel2 = transactionLevel2;
	}

	public int getPointer2() {
		return pointer2;
	}

	public void setPointer2(int pointer2) {
		this.pointer2 = pointer2;
	}

	public int getSequence2() {
		return sequence2;
	}

	public void setSequence2(int sequence2) {
		this.sequence2 = sequence2;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
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
