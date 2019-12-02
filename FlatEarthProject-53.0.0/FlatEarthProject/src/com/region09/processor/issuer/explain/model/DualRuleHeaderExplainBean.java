package com.region09.processor.issuer.explain.model;

import java.sql.Timestamp;

public class DualRuleHeaderExplainBean {

	private int id;
	
	private int field1;
	private int subField1;
	private int fire1;
	private int format1;
	private int minimumLength1;
	private int maximumLength1;
	private int encoding1;
	private int dataType1;
	private int source1;
	private int direction1;
	private int existence1;
	private int change1;
	
	private int field2;
	private int subField2;
	private int fire2;
	private int format2;
	private int minimumLength2;
	private int maximumLength2;
	private int encoding2;
	private int dataType2;
	private int source2;
	private int direction2;
	private int existence2;
	private int change2;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public DualRuleHeaderExplainBean () {}

	public DualRuleHeaderExplainBean(int id, int field1, int subField1, int fire1, int format1, int minimumLength1,
			int maximumLength1, int encoding1, int dataType1, int source1, int direction1, int existence1, int change1,
			int field2, int subField2, int fire2, int format2, int minimumLength2, int maximumLength2,
			int encoding2, int dataType2, int source2, int direction2, int existence2, int change2, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field1 = field1;
		this.subField1 = subField1;
		this.fire1 = fire1;
		this.format1 = format1;
		this.minimumLength1 = minimumLength1;
		this.maximumLength1 = maximumLength1;
		this.encoding1 = encoding1;
		this.dataType1 = dataType1;
		this.source1 = source1;
		this.direction1 = direction1;
		this.existence1 = existence1;
		this.change1 = change1;
		this.field2 = field2;
		this.subField2 = subField2;
		this.fire2 = fire2;
		this.format2 = format2;
		this.minimumLength2 = minimumLength2;
		this.maximumLength2 = maximumLength2;
		this.encoding2 = encoding2;
		this.dataType2 = dataType2;
		this.source2 = source2;
		this.direction2 = direction2;
		this.existence2 = existence2;
		this.change2 = change2;
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

	public int getFormat1() {
		return format1;
	}

	public void setFormat1(int format1) {
		this.format1 = format1;
	}

	public int getMinimumLength1() {
		return minimumLength1;
	}

	public void setMinimumLength1(int minimumLength1) {
		this.minimumLength1 = minimumLength1;
	}

	public int getMaximumLength1() {
		return maximumLength1;
	}

	public void setMaximumLength1(int maximumLength1) {
		this.maximumLength1 = maximumLength1;
	}

	public int getEncoding1() {
		return encoding1;
	}

	public void setEncoding1(int encoding1) {
		this.encoding1 = encoding1;
	}

	public int getDataType1() {
		return dataType1;
	}

	public void setDataType1(int dataType1) {
		this.dataType1 = dataType1;
	}

	public int getSource1() {
		return source1;
	}

	public void setSource1(int source1) {
		this.source1 = source1;
	}

	public int getDirection1() {
		return direction1;
	}

	public void setDirection1(int direction1) {
		this.direction1 = direction1;
	}

	public int getExistence1() {
		return existence1;
	}

	public void setExistence1(int existence1) {
		this.existence1 = existence1;
	}

	public int getChange1() {
		return change1;
	}

	public void setChange1(int change1) {
		this.change1 = change1;
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

	public int getFormat2() {
		return format2;
	}

	public void setFormat2(int format2) {
		this.format2 = format2;
	}

	public int getMinimumLength2() {
		return minimumLength2;
	}

	public void setMinimumLength2(int minimumLength2) {
		this.minimumLength2 = minimumLength2;
	}

	public int getMaximumLength2() {
		return maximumLength2;
	}

	public void setMaximumLength2(int maximumLength2) {
		this.maximumLength2 = maximumLength2;
	}

	public int getEncoding2() {
		return encoding2;
	}

	public void setEncoding2(int encoding2) {
		this.encoding2 = encoding2;
	}

	public int getDataType2() {
		return dataType2;
	}

	public void setDataType2(int dataType2) {
		this.dataType2 = dataType2;
	}

	public int getSource2() {
		return source2;
	}

	public void setSource2(int source2) {
		this.source2 = source2;
	}

	public int getDirection2() {
		return direction2;
	}

	public void setDirection2(int direction2) {
		this.direction2 = direction2;
	}

	public int getExistence2() {
		return existence2;
	}

	public void setExistence2(int existence2) {
		this.existence2 = existence2;
	}

	public int getChange2() {
		return change2;
	}

	public void setChange2(int change2) {
		this.change2 = change2;
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
