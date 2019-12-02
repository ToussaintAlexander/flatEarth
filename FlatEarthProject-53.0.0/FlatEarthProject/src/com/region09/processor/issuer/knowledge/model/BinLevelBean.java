package com.region09.processor.issuer.knowledge.model;

import java.sql.Date;
import java.sql.Timestamp;

public class BinLevelBean {

	private int id;
	
	private String lowBinRangeNumber;
	private String highBinRangeNumber;
	
	private int binLength;
	private int accountNumberLength;

	private String cardType;
	private String cardSubtype;
	private String productGroup;
	private String productType;
	private String countryCode;
	private String currencyCode;

	private boolean atmOverdraftSwitch;
	private boolean posOverdraftSwitch;

	private boolean checkingSwitch;
	private boolean savingsSwitch;

	private String rangeLevelAll;
	private boolean partialAuthorization;
	private String deriviationType;

	private Date expirationDate;
	private Date productionDate;
	private Date certificationDate;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public BinLevelBean() {}
	
	public BinLevelBean(int id, String lowBinRangeNumber, String highBinRangeNumber, int binLength, int accountNumberLength,
			String cardType, String cardSubtype, String productGroup, String productType, String countryCode,
			String currencyCode, boolean atmOverdraftSwitch, boolean posOverdraftSwitch, boolean checkingSwitch,
			boolean savingsSwitch, String rangeLevelAll, boolean partialAuthorization, String deriviationType,
			Date expirationDate, Date productionDate, Date certificationDate, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.lowBinRangeNumber = lowBinRangeNumber;
		this.highBinRangeNumber = highBinRangeNumber;
		this.binLength = binLength;
		this.accountNumberLength = accountNumberLength;
		this.cardType = cardType;
		this.cardSubtype = cardSubtype;
		this.productGroup = productGroup;
		this.productType = productType;
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.atmOverdraftSwitch = atmOverdraftSwitch;
		this.posOverdraftSwitch = posOverdraftSwitch;
		this.checkingSwitch = checkingSwitch;
		this.savingsSwitch = savingsSwitch;
		this.rangeLevelAll = rangeLevelAll;
		this.partialAuthorization = partialAuthorization;
		this.deriviationType = deriviationType;
		this.expirationDate = expirationDate;
		this.productionDate = productionDate;
		this.certificationDate = certificationDate;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
	}

	/***************************************************************
	 ***************************************************************
	 */
	
	public String getLowBinRangeNumber() {
		return lowBinRangeNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLowBinRangeNumber(String lowBinRangeNumber) {
		this.lowBinRangeNumber = lowBinRangeNumber;
	}

	public String getHighBinRangeNumber() {
		return highBinRangeNumber;
	}

	public void setHighBinRangeNumber(String highBinRangeNumber) {
		this.highBinRangeNumber = highBinRangeNumber;
	}

	public int getBinLength() {
		return binLength;
	}

	public void setBinLength(int binLength) {
		this.binLength = binLength;
	}

	public int getAccountNumberLength() {
		return accountNumberLength;
	}

	public void setAccountNumberLength(int accountNumberLength) {
		this.accountNumberLength = accountNumberLength;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardSubtype() {
		return cardSubtype;
	}

	public void setCardSubtype(String cardSubtype) {
		this.cardSubtype = cardSubtype;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public boolean isAtmOverdraftSwitch() {
		return atmOverdraftSwitch;
	}

	public void setAtmOverdraftSwitch(boolean atmOverdraftSwitch) {
		this.atmOverdraftSwitch = atmOverdraftSwitch;
	}

	public boolean isPosOverdraftSwitch() {
		return posOverdraftSwitch;
	}

	public void setPosOverdraftSwitch(boolean posOverdraftSwitch) {
		this.posOverdraftSwitch = posOverdraftSwitch;
	}

	public boolean isCheckingSwitch() {
		return checkingSwitch;
	}

	public void setCheckingSwitch(boolean checkingSwitch) {
		this.checkingSwitch = checkingSwitch;
	}

	public boolean isSavingsSwitch() {
		return savingsSwitch;
	}

	public void setSavingsSwitch(boolean savingsSwitch) {
		this.savingsSwitch = savingsSwitch;
	}

	public String getRangeLevelAll() {
		return rangeLevelAll;
	}

	public void setRangeLevelAll(String rangeLevelAll) {
		this.rangeLevelAll = rangeLevelAll;
	}

	public boolean isPartialAuthorization() {
		return partialAuthorization;
	}

	public void setPartialAuthorization(boolean partialAuthorization) {
		this.partialAuthorization = partialAuthorization;
	}

	public String getDeriviationType() {
		return deriviationType;
	}

	public void setDeriviationType(String deriviationType) {
		this.deriviationType = deriviationType;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Date getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(Date certificationDate) {
		this.certificationDate = certificationDate;
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
