package com.region08.association.letter.requirements.model;

import java.sql.Timestamp;

public class FieldEditHeaderBean {
	
	private int id;
	private int field;
	private int subfield;
	private int format;
	private int minimumLength;
	private int maximumLength;
	private int encoding;
	private int datatype;
	private int source;
	private int direction;
	private int existence;
	private int change;
	
	private String 		createUser;
	private Timestamp 	createTimestamp;
	private String 		modifyUser;
	private Timestamp 	modifyTimestamp;
	
	public FieldEditHeaderBean () {}

	public FieldEditHeaderBean(int id, int field, int subfield, int format, int minimumLength,
			int maximumLength, int encoding, int datatype, int source, int direction, int existence, int change,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field = field;
		this.subfield = subfield;
		this.format = format;
		this.minimumLength = minimumLength;
		this.maximumLength = maximumLength;
		this.encoding = encoding;
		this.datatype = datatype;
		this.source = source;
		this.direction = direction;
		this.existence = existence;
		this.change = change;
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

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getMinimumLength() {
		return minimumLength;
	}

	public void setMinimumLength(int minimumLength) {
		this.minimumLength = minimumLength;
	}

	public int getMaximumLength() {
		return maximumLength;
	}

	public void setMaximumLength(int maximumLength) {
		this.maximumLength = maximumLength;
	}

	public int getEncoding() {
		return encoding;
	}

	public void setEncoding(int encoding) {
		this.encoding = encoding;
	}

	public int getDatatype() {
		return datatype;
	}

	public void setDatatype(int datatype) {
		this.datatype = datatype;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getExistence() {
		return existence;
	}

	public void setExistence(int existence) {
		this.existence = existence;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
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