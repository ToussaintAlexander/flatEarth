package com.main.testing.feature.model;

import java.sql.Timestamp;

public class FeatureBean {

	private int id;
	
	private String unknownParameter;
	private String independentVariable;
	private String dependentVariable;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public FeatureBean () {}

	public FeatureBean(int id, String unknownParameter, String independentVariable, String dependentVariable,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.unknownParameter = unknownParameter;
		this.independentVariable = independentVariable;
		this.dependentVariable = dependentVariable;
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

	public String getUnknownParameter() {
		return unknownParameter;
	}

	public void setUnknownParameter(String unknownParameter) {
		this.unknownParameter = unknownParameter;
	}

	public String getIndependentVariable() {
		return independentVariable;
	}

	public void setIndependentVariable(String independentVariable) {
		this.independentVariable = independentVariable;
	}

	public String getDependentVariable() {
		return dependentVariable;
	}

	public void setDependentVariable(String dependentVariable) {
		this.dependentVariable = dependentVariable;
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
