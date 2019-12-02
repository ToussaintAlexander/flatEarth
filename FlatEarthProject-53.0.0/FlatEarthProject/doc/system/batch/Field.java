package com.system.message.utilties;

import java.sql.Timestamp;
import java.util.List;

import com.region08.association.letter.dao.FieldEditHeaderDao;
import com.region08.association.letter.model.RejectCodeBean;
import com.region08.association.letter.model.UsageBean;
import com.region08.association.letter.model.ValidCodeBean;

public class Field {

	private int							dataElementId;
	private String 						name;
	private String 						description;
	private List<Storage> 				storage;
	private List<UsageBean> 			usage;
	private List<ValidCodeBean> 		validCodes;
	private List<FieldEditHeaderDao> 	fieldEdits;
	private List<RejectCodeBean> 		rejectCodes;
	private List<FileMaintCodes> 		fileMaintCodes;
	private boolean 					mandatory;
	private boolean 					echoElement;
	private boolean 					logElement;
	
	private String 						createUser;
	private Timestamp 					createTimestamp;
	private String 						modifyUser;
	private Timestamp 					modifyTimestamp;
	
	public Field () {}

	public Field(int dataElementId, String name, String description, List<Storage> storage, List<UsageBean> usage,
			List<ValidCodeBean> validCodes, List<FieldEditHeaderDao> fieldEdits, List<RejectCodeBean> rejectCodes,
			List<FileMaintCodes> fileMaintCodes, boolean mandatory, boolean echoElement, boolean logElement,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.dataElementId = dataElementId;
		this.name = name;
		this.description = description;
		this.storage = storage;
		this.usage = usage;
		this.validCodes = validCodes;
		this.fieldEdits = fieldEdits;
		this.rejectCodes = rejectCodes;
		this.fileMaintCodes = fileMaintCodes;
		this.mandatory = mandatory;
		this.echoElement = echoElement;
		this.logElement = logElement;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
	}

	public int getDataElementId() {
		return dataElementId;
	}

	public void setDataElementId(int dataElementId) {
		this.dataElementId = dataElementId;
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

	public List<Storage> getStorage() {
		return storage;
	}

	public void setStorage(List<Storage> storage) {
		this.storage = storage;
	}

	public List<UsageBean> getUsage() {
		return usage;
	}

	public void setUsage(List<UsageBean> usage) {
		this.usage = usage;
	}

	public List<ValidCodeBean> getValidCodes() {
		return validCodes;
	}

	public void setValidCodes(List<ValidCodeBean> validCodes) {
		this.validCodes = validCodes;
	}

	public List<FieldEditHeaderDao> getFieldEdits() {
		return fieldEdits;
	}

	public void setFieldEdits(List<FieldEditHeaderDao> fieldEdits) {
		this.fieldEdits = fieldEdits;
	}

	public List<RejectCodeBean> getRejectCodes() {
		return rejectCodes;
	}

	public void setRejectCodes(List<RejectCodeBean> rejectCodes) {
		this.rejectCodes = rejectCodes;
	}

	public List<FileMaintCodes> getFileMaintCodes() {
		return fileMaintCodes;
	}

	public void setFileMaintCodes(List<FileMaintCodes> fileMaintCodes) {
		this.fileMaintCodes = fileMaintCodes;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public boolean isEchoElement() {
		return echoElement;
	}

	public void setEchoElement(boolean echoElement) {
		this.echoElement = echoElement;
	}

	public boolean isLogElement() {
		return logElement;
	}

	public void setLogElement(boolean logElement) {
		this.logElement = logElement;
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
