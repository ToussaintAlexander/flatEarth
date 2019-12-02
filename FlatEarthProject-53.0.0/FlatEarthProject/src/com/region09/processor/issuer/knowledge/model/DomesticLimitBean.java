package com.region09.processor.issuer.knowledge.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class DomesticLimitBean {

	private int 		id;
	
	private String 		lowBinRangeNumber;
	private String 		highBinRangeNumber;
	
	private int 		binLength;
	private int 		accountNumberLength;
	
	private BigDecimal 	singleMaximumAdvAmount;
	private BigDecimal 	singleMaximumAtmAmount;
	private BigDecimal 	singleMaximumBckAmount;
	private BigDecimal 	singleMaximumPosAmount;
	
	private BigDecimal 	dailyMaximumAdvAmount;
	private BigDecimal 	dailyMaximumAtmAmount;
	private BigDecimal 	dailyMaximumBckAmount;
	private BigDecimal 	dailyMaximumPosAmount;
	
	private int 		dailyMaximumAdvNumber;
	private int 		dailyMaximumAtmNumber;
	private int 		dailyMaximumBckNumber;
	private int 		dailyMaximumPosNumber;
	
	private int 		dailyMaximumDeclines;
	private int 		dailyMaximumBadPins;
	
	private String 		createUser;
	private Timestamp 	createTimestamp;
	private String 		modifyUser;
	private Timestamp 	modifyTimestamp;
	
	public DomesticLimitBean() {}

	public DomesticLimitBean(int id, String lowBinRangeNumber, String highBinRangeNumber, int binLength,
			int accountNumberLength, BigDecimal singleMaximumAdvAmount, BigDecimal singleMaximumAtmAmount,
			BigDecimal singleMaximumBckAmount, BigDecimal singleMaximumPosAmount, BigDecimal dailyMaximumAdvAmount,
			BigDecimal dailyMaximumAtmAmount, BigDecimal dailyMaximumBckAmount, BigDecimal dailyMaximumPosAmount,
			int dailyMaximumAdvNumber, int dailyMaximumAtmNumber, int dailyMaximumBckNumber, int dailyMaximumPosNumber,
			int dailyMaximumDeclines, int dailyMaximumBadPins, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.lowBinRangeNumber = lowBinRangeNumber;
		this.highBinRangeNumber = highBinRangeNumber;
		this.binLength = binLength;
		this.accountNumberLength = accountNumberLength;
		this.singleMaximumAdvAmount = singleMaximumAdvAmount;
		this.singleMaximumAtmAmount = singleMaximumAtmAmount;
		this.singleMaximumBckAmount = singleMaximumBckAmount;
		this.singleMaximumPosAmount = singleMaximumPosAmount;
		this.dailyMaximumAdvAmount = dailyMaximumAdvAmount;
		this.dailyMaximumAtmAmount = dailyMaximumAtmAmount;
		this.dailyMaximumBckAmount = dailyMaximumBckAmount;
		this.dailyMaximumPosAmount = dailyMaximumPosAmount;
		this.dailyMaximumAdvNumber = dailyMaximumAdvNumber;
		this.dailyMaximumAtmNumber = dailyMaximumAtmNumber;
		this.dailyMaximumBckNumber = dailyMaximumBckNumber;
		this.dailyMaximumPosNumber = dailyMaximumPosNumber;
		this.dailyMaximumDeclines = dailyMaximumDeclines;
		this.dailyMaximumBadPins = dailyMaximumBadPins;
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

	public String getLowBinRangeNumber() {
		return lowBinRangeNumber;
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

	public BigDecimal getSingleMaximumAdvAmount() {
		return singleMaximumAdvAmount;
	}

	public void setSingleMaximumAdvAmount(BigDecimal singleMaximumAdvAmount) {
		this.singleMaximumAdvAmount = singleMaximumAdvAmount;
	}

	public BigDecimal getSingleMaximumAtmAmount() {
		return singleMaximumAtmAmount;
	}

	public void setSingleMaximumAtmAmount(BigDecimal singleMaximumAtmAmount) {
		this.singleMaximumAtmAmount = singleMaximumAtmAmount;
	}

	public BigDecimal getSingleMaximumBckAmount() {
		return singleMaximumBckAmount;
	}

	public void setSingleMaximumBckAmount(BigDecimal singleMaximumBckAmount) {
		this.singleMaximumBckAmount = singleMaximumBckAmount;
	}

	public BigDecimal getSingleMaximumPosAmount() {
		return singleMaximumPosAmount;
	}

	public void setSingleMaximumPosAmount(BigDecimal singleMaximumPosAmount) {
		this.singleMaximumPosAmount = singleMaximumPosAmount;
	}

	public BigDecimal getDailyMaximumAdvAmount() {
		return dailyMaximumAdvAmount;
	}

	public void setDailyMaximumAdvAmount(BigDecimal dailyMaximumAdvAmount) {
		this.dailyMaximumAdvAmount = dailyMaximumAdvAmount;
	}

	public BigDecimal getDailyMaximumAtmAmount() {
		return dailyMaximumAtmAmount;
	}

	public void setDailyMaximumAtmAmount(BigDecimal dailyMaximumAtmAmount) {
		this.dailyMaximumAtmAmount = dailyMaximumAtmAmount;
	}

	public BigDecimal getDailyMaximumBckAmount() {
		return dailyMaximumBckAmount;
	}

	public void setDailyMaximumBckAmount(BigDecimal dailyMaximumBckAmount) {
		this.dailyMaximumBckAmount = dailyMaximumBckAmount;
	}

	public BigDecimal getDailyMaximumPosAmount() {
		return dailyMaximumPosAmount;
	}

	public void setDailyMaximumPosAmount(BigDecimal dailyMaximumPosAmount) {
		this.dailyMaximumPosAmount = dailyMaximumPosAmount;
	}

	public int getDailyMaximumAdvNumber() {
		return dailyMaximumAdvNumber;
	}

	public void setDailyMaximumAdvNumber(int dailyMaximumAdvNumber) {
		this.dailyMaximumAdvNumber = dailyMaximumAdvNumber;
	}

	public int getDailyMaximumAtmNumber() {
		return dailyMaximumAtmNumber;
	}

	public void setDailyMaximumAtmNumber(int dailyMaximumAtmNumber) {
		this.dailyMaximumAtmNumber = dailyMaximumAtmNumber;
	}

	public int getDailyMaximumBckNumber() {
		return dailyMaximumBckNumber;
	}

	public void setDailyMaximumBckNumber(int dailyMaximumBckNumber) {
		this.dailyMaximumBckNumber = dailyMaximumBckNumber;
	}

	public int getDailyMaximumPosNumber() {
		return dailyMaximumPosNumber;
	}

	public void setDailyMaximumPosNumber(int dailyMaximumPosNumber) {
		this.dailyMaximumPosNumber = dailyMaximumPosNumber;
	}

	public int getDailyMaximumDeclines() {
		return dailyMaximumDeclines;
	}

	public void setDailyMaximumDeclines(int dailyMaximumDeclines) {
		this.dailyMaximumDeclines = dailyMaximumDeclines;
	}

	public int getDailyMaximumBadPins() {
		return dailyMaximumBadPins;
	}

	public void setDailyMaximumBadPins(int dailyMaximumBadPins) {
		this.dailyMaximumBadPins = dailyMaximumBadPins;
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
