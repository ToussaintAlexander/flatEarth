package com.region02.bank.issuer.card.chip.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AmountBean {

	private int id;
	private String primaryAccountNumber;			// Tag 5A		AN 19	35 69 99 00 10 08 22 11					 
	private int primaryAccountNumberSeq;			// Tag 5F 34	N 2
	
	private int currencyCodeApplication;			// Tag 5F 2A	N 3		38 34 30				i.e. 840	
	private int currencyConversionFactor;			// Tag 9F 73	N 8	
	private int currencyExponentApplication;		// Tag 5F 36	N 1		03
	
	private int secondaryApplCurrencyCode;			// Tag 9F 76	N 3		38 34 30				i.e. 840
	
	private byte	consecutDomOfflineCtr;			//  			B 1		FE
	private byte	consecutDomOfflineLwrLmt;		// 9F 14		B 1		FE						LCOL
	private byte	consecutDomOfflineUprLmt; 		// 9F 23		B 1		FE						UCOL
	
	private byte	consecutIntlOfflineCtr;			//				B 1		00
	private byte	consecutIntlOfflineLwrLmt;		// 9F 5A		B 1		FE						LCIOL
	private byte	consecutIntlOfflineUprLmt;		// 9F 59		B 1		FE						UCIOL
	
	private BigDecimal cumTotDomTransAmount;		//				N 12	00 00 00 00 00 00	 
	private BigDecimal cumTotDomTransAmtLwrLmt;		// Tag 9F ??	N 12	00 00 00 01 00 00	  	CTTALL		LCOTA 	 
	private BigDecimal cumTotDomTransAmtUprLmt;		// Tag 9F 5C	N 12	00 00 00 01 00 00	  	CTTAUL		UCOTA 
	
	private BigDecimal cumTotIntlTransAmount;		//				N 12	00 00 00 00 00 00	 
	private BigDecimal cumTotIntlTransAmtLwrLmt;	// Tag 9F ??	N 12	00 00 00 01 00 00	  	CTTALL		LCOTA 	 
	private BigDecimal cumTotIntlTransAmtUprLmt;	// Tag 9F 5C	N 12	00 00 00 01 00 00	  	CTTAUL		UCOTA 
	
	private int encryptedPin;						// Tag 9F 62	N 4		00 00					1234	 
	private byte pinTryCounter;						// Tag 9F 17	B 1		14
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public AmountBean() {}

	public AmountBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, int currencyCodeApplication,
			int currencyConversionFactor, int currencyExponentApplication, int secondaryApplCurrencyCode,
			byte consecutDomOfflineCtr, byte consecutDomOfflineLwrLmt, byte consecutDomOfflineUprLmt,
			byte consecutIntlOfflineCtr, byte consecutIntlOfflineLwrLmt, byte consecutIntlOfflineUprLmt,
			BigDecimal cumTotDomTransAmount, BigDecimal cumTotDomTransAmtLwrLmt, BigDecimal cumTotDomTransAmtUprLmt,
			BigDecimal cumTotIntlTransAmount, BigDecimal cumTotIntlTransAmtLwrLmt, BigDecimal cumTotIntlTransAmtUprLmt,
			int encryptedPin, byte pinTryCounter, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.currencyCodeApplication = currencyCodeApplication;
		this.currencyConversionFactor = currencyConversionFactor;
		this.currencyExponentApplication = currencyExponentApplication;
		this.secondaryApplCurrencyCode = secondaryApplCurrencyCode;
		this.consecutDomOfflineCtr = consecutDomOfflineCtr;
		this.consecutDomOfflineLwrLmt = consecutDomOfflineLwrLmt;
		this.consecutDomOfflineUprLmt = consecutDomOfflineUprLmt;
		this.consecutIntlOfflineCtr = consecutIntlOfflineCtr;
		this.consecutIntlOfflineLwrLmt = consecutIntlOfflineLwrLmt;
		this.consecutIntlOfflineUprLmt = consecutIntlOfflineUprLmt;
		this.cumTotDomTransAmount = cumTotDomTransAmount;
		this.cumTotDomTransAmtLwrLmt = cumTotDomTransAmtLwrLmt;
		this.cumTotDomTransAmtUprLmt = cumTotDomTransAmtUprLmt;
		this.cumTotIntlTransAmount = cumTotIntlTransAmount;
		this.cumTotIntlTransAmtLwrLmt = cumTotIntlTransAmtLwrLmt;
		this.cumTotIntlTransAmtUprLmt = cumTotIntlTransAmtUprLmt;
		this.encryptedPin = encryptedPin;
		this.pinTryCounter = pinTryCounter;
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

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public int getPrimaryAccountNumberSeq() {
		return primaryAccountNumberSeq;
	}

	public void setPrimaryAccountNumberSeq(int primaryAccountNumberSeq) {
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
	}

	public int getCurrencyCodeApplication() {
		return currencyCodeApplication;
	}

	public void setCurrencyCodeApplication(int currencyCodeApplication) {
		this.currencyCodeApplication = currencyCodeApplication;
	}

	public int getCurrencyConversionFactor() {
		return currencyConversionFactor;
	}

	public void setCurrencyConversionFactor(int currencyConversionFactor) {
		this.currencyConversionFactor = currencyConversionFactor;
	}

	public int getCurrencyExponentApplication() {
		return currencyExponentApplication;
	}

	public void setCurrencyExponentApplication(int currencyExponentApplication) {
		this.currencyExponentApplication = currencyExponentApplication;
	}

	public int getSecondaryApplCurrencyCode() {
		return secondaryApplCurrencyCode;
	}

	public void setSecondaryApplCurrencyCode(int secondaryApplCurrencyCode) {
		this.secondaryApplCurrencyCode = secondaryApplCurrencyCode;
	}

	public byte getConsecutDomOfflineCtr() {
		return consecutDomOfflineCtr;
	}

	public void setConsecutDomOfflineCtr(byte consecutDomOfflineCtr) {
		this.consecutDomOfflineCtr = consecutDomOfflineCtr;
	}

	public byte getConsecutDomOfflineLwrLmt() {
		return consecutDomOfflineLwrLmt;
	}

	public void setConsecutDomOfflineLwrLmt(byte consecutDomOfflineLwrLmt) {
		this.consecutDomOfflineLwrLmt = consecutDomOfflineLwrLmt;
	}

	public byte getConsecutDomOfflineUprLmt() {
		return consecutDomOfflineUprLmt;
	}

	public void setConsecutDomOfflineUprLmt(byte consecutDomOfflineUprLmt) {
		this.consecutDomOfflineUprLmt = consecutDomOfflineUprLmt;
	}

	public byte getConsecutIntlOfflineCtr() {
		return consecutIntlOfflineCtr;
	}

	public void setConsecutIntlOfflineCtr(byte consecutIntlOfflineCtr) {
		this.consecutIntlOfflineCtr = consecutIntlOfflineCtr;
	}

	public byte getConsecutIntlOfflineLwrLmt() {
		return consecutIntlOfflineLwrLmt;
	}

	public void setConsecutIntlOfflineLwrLmt(byte consecutIntlOfflineLwrLmt) {
		this.consecutIntlOfflineLwrLmt = consecutIntlOfflineLwrLmt;
	}

	public byte getConsecutIntlOfflineUprLmt() {
		return consecutIntlOfflineUprLmt;
	}

	public void setConsecutIntlOfflineUprLmt(byte consecutIntlOfflineUprLmt) {
		this.consecutIntlOfflineUprLmt = consecutIntlOfflineUprLmt;
	}

	public BigDecimal getCumTotDomTransAmount() {
		return cumTotDomTransAmount;
	}

	public void setCumTotDomTransAmount(BigDecimal cumTotDomTransAmount) {
		this.cumTotDomTransAmount = cumTotDomTransAmount;
	}

	public BigDecimal getCumTotDomTransAmtLwrLmt() {
		return cumTotDomTransAmtLwrLmt;
	}

	public void setCumTotDomTransAmtLwrLmt(BigDecimal cumTotDomTransAmtLwrLmt) {
		this.cumTotDomTransAmtLwrLmt = cumTotDomTransAmtLwrLmt;
	}

	public BigDecimal getCumTotDomTransAmtUprLmt() {
		return cumTotDomTransAmtUprLmt;
	}

	public void setCumTotDomTransAmtUprLmt(BigDecimal cumTotDomTransAmtUprLmt) {
		this.cumTotDomTransAmtUprLmt = cumTotDomTransAmtUprLmt;
	}

	public BigDecimal getCumTotIntlTransAmount() {
		return cumTotIntlTransAmount;
	}

	public void setCumTotIntlTransAmount(BigDecimal cumTotIntlTransAmount) {
		this.cumTotIntlTransAmount = cumTotIntlTransAmount;
	}

	public BigDecimal getCumTotIntlTransAmtLwrLmt() {
		return cumTotIntlTransAmtLwrLmt;
	}

	public void setCumTotIntlTransAmtLwrLmt(BigDecimal cumTotIntlTransAmtLwrLmt) {
		this.cumTotIntlTransAmtLwrLmt = cumTotIntlTransAmtLwrLmt;
	}

	public BigDecimal getCumTotIntlTransAmtUprLmt() {
		return cumTotIntlTransAmtUprLmt;
	}

	public void setCumTotIntlTransAmtUprLmt(BigDecimal cumTotIntlTransAmtUprLmt) {
		this.cumTotIntlTransAmtUprLmt = cumTotIntlTransAmtUprLmt;
	}

	public int getEncryptedPin() {
		return encryptedPin;
	}

	public void setEncryptedPin(int encryptedPin) {
		this.encryptedPin = encryptedPin;
	}

	public byte getPinTryCounter() {
		return pinTryCounter;
	}

	public void setPinTryCounter(byte pinTryCounter) {
		this.pinTryCounter = pinTryCounter;
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
