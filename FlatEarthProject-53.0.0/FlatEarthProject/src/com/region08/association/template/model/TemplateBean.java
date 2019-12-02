package com.region08.association.template.model;

import java.sql.Date;
import java.sql.Timestamp;

public class TemplateBean {

	private int id;
	
	private String processingCode;				// DE003	N 6		transaction type, from account, to account
	private String pointOfServiceEntryMode;		// DE022	N 3		transaction entry mode	+ pin entry mode
	private byte pointOfServiceConditionCode;	// DE025	N 2		normal presentment / customer not present / card not present
	
	private String primaryAccountNumber;		// DE002	N 19

	private short merchantType;					// DE018	N 4
	private Date expirationDate;				// DE014	YYMM

	private String track2Data;					// DE035	Z..37		Contains CVV; PVV + PVKI + rightmost 11 PAN digits minus the checksum
	
	private long transactionAmount;				// DE004	N 12
	private String additionalAmounts;			// DE054	AN 120		Account Type/Amount Type/Currency Code/Account Entry/Amount	x 6 occurrences
	
	private short personalIdentificationNumber;	// 1234
	
	private String responseCode;				// DE039	AN 2
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public TemplateBean () {}

	public TemplateBean(int id, String processingCode, String pointOfServiceEntryMode, byte pointOfServiceConditionCode,
			String primaryAccountNumber, short merchantType, Date expirationDate, String track2Data,
			long transactionAmount, String additionalAmounts, short personalIdentificationNumber, String responseCode, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.processingCode = processingCode;
		this.pointOfServiceEntryMode = pointOfServiceEntryMode;
		this.pointOfServiceConditionCode = pointOfServiceConditionCode;
		this.primaryAccountNumber = primaryAccountNumber;
		this.merchantType = merchantType;
		this.expirationDate = expirationDate;
		this.track2Data = track2Data;
		this.transactionAmount = transactionAmount;
		this.additionalAmounts = additionalAmounts;
		this.personalIdentificationNumber = personalIdentificationNumber;
		this.responseCode = responseCode;
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

	public String getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(String processingCode) {
		this.processingCode = processingCode;
	}

	public String getPointOfServiceEntryMode() {
		return pointOfServiceEntryMode;
	}

	public void setPointOfServiceEntryMode(String pointOfServiceEntryMode) {
		this.pointOfServiceEntryMode = pointOfServiceEntryMode;
	}

	public byte getPointOfServiceConditionCode() {
		return pointOfServiceConditionCode;
	}

	public void setPointOfServiceConditionCode(byte pointOfServiceConditionCode) {
		this.pointOfServiceConditionCode = pointOfServiceConditionCode;
	}

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public short getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(short merchantType) {
		this.merchantType = merchantType;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getTrack2Data() {
		return track2Data;
	}

	public void setTrack2Data(String track2Data) {
		this.track2Data = track2Data;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getAdditionalAmounts() {
		return additionalAmounts;
	}

	public void setAdditionalAmounts(String additionalAmounts) {
		this.additionalAmounts = additionalAmounts;
	}

	public short getPersonalIdentificationNumber() {
		return personalIdentificationNumber;
	}

	public void setPersonalIdentificationNumber(short personalIdentificationNumber) {
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
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