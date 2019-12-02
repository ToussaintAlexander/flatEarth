package com.region02.bank.issuer.card.magstripe.model;

import java.sql.Timestamp;

public class Track2Bean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A		AN 19		35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N 2 		00
	
	private char startSentinel;					// SS = Hex 'B'	S 1   	 
//	private String primaryAccountNumber;
	private char fieldSeparator;				// FS = '^'		S 1
	
	private int expirationDateYear;				// YY
	private int expirationDateMonth;			// MM
	private int serviceCode;					// N 3
	private int pinValidationKeyIndex;			// N 1			PVKI
	private int pinVerificationValue;			// N 4			PVV
	private int cardVerificationValue;			// N 3			CVV
	
	private char endSentinel;					// Hex F ?		S 1 
	private char longRedundancyCheck;			// LRC			N 1

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public Track2Bean () {}

	public Track2Bean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, char startSentinel,
			char fieldSeparator, int expirationDateYear, int expirationDateMonth, int serviceCode,
			int pinValidationKeyIndex, int pinVerificationValue, int cardVerificationValue, char endSentinel,
			char longRedundancyCheck, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.startSentinel = startSentinel;
		this.fieldSeparator = fieldSeparator;
		this.expirationDateYear = expirationDateYear;
		this.expirationDateMonth = expirationDateMonth;
		this.serviceCode = serviceCode;
		this.pinValidationKeyIndex = pinValidationKeyIndex;
		this.pinVerificationValue = pinVerificationValue;
		this.cardVerificationValue = cardVerificationValue;
		this.endSentinel = endSentinel;
		this.longRedundancyCheck = longRedundancyCheck;
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

	public char getStartSentinel() {
		return startSentinel;
	}

	public void setStartSentinel(char startSentinel) {
		this.startSentinel = startSentinel;
	}

	public char getFieldSeparator() {
		return fieldSeparator;
	}

	public void setFieldSeparator(char fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}

	public int getExpirationDateYear() {
		return expirationDateYear;
	}

	public void setExpirationDateYear(int expirationDateYear) {
		this.expirationDateYear = expirationDateYear;
	}

	public int getExpirationDateMonth() {
		return expirationDateMonth;
	}

	public void setExpirationDateMonth(int expirationDateMonth) {
		this.expirationDateMonth = expirationDateMonth;
	}

	public int getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(int serviceCode) {
		this.serviceCode = serviceCode;
	}

	public int getPinValidationKeyIndex() {
		return pinValidationKeyIndex;
	}

	public void setPinValidationKeyIndex(int pinValidationKeyIndex) {
		this.pinValidationKeyIndex = pinValidationKeyIndex;
	}

	public int getPinVerificationValue() {
		return pinVerificationValue;
	}

	public void setPinVerificationValue(int pinVerificationValue) {
		this.pinVerificationValue = pinVerificationValue;
	}

	public int getCardVerificationValue() {
		return cardVerificationValue;
	}

	public void setCardVerificationValue(int cardVerificationValue) {
		this.cardVerificationValue = cardVerificationValue;
	}

	public char getEndSentinel() {
		return endSentinel;
	}

	public void setEndSentinel(char endSentinel) {
		this.endSentinel = endSentinel;
	}

	public char getLongRedundancyCheck() {
		return longRedundancyCheck;
	}

	public void setLongRedundancyCheck(char longRedundancyCheck) {
		this.longRedundancyCheck = longRedundancyCheck;
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
