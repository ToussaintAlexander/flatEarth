package com.region02.bank.issuer.card.magstripe.model;

import java.sql.Timestamp;

public class Track3Bean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A	AN 19		35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N 2 		00
	
	private char startSentinel;					// SS = 'B'	S 1   	 
	private char formatCode;					// A 2			 
//	private String primaryAccountNumber;
	private char fieldSeparator;				// FS = '^'	S 1
	private int countryCode;					// N 3
	private int currencyCode;					// N 3
	private int currencyExponent;				// N 1
	private int amountAuthorizedPerCycle;		// N 4
	private int amountRemainingThisCycle;		// N 4
	private int cycleBeginYear;					// N 1 i.e. 8	i.e. 2018
	private int cycleBeginDay;					// N 3 i.e. 366
	private int cycleLength;					// N 2
	private int retryCount;						// N 1
	private String pinControlParameters;		// AN 6
	private int interchangeControls;			// N 1
	private int panServiceRestriction;			// N 2
	private int san1ServiceRestriction;			// N 2
	private int san2ServiceRestriction;			// N 2
	private int expirationDateYear;				// YY
	private int expirationDateMonth;			// MM
	private int cardSequenceNumber;				// N 1
	private int cardSecurityNumber;				// N 9
	private char relayMarker;					// A 1
	private int cryptographicCheckDigits;		// n ^
	private char endSentinel;					// Hex F ?	S 1 
	private char longRedundancyCheck;			// LRC		N 1

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public Track3Bean () {}
	
	public Track3Bean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, char startSentinel,
			char formatCode, char fieldSeparator, int countryCode, int currencyCode, int currencyExponent,
			int amountAuthorizedPerCycle, int amountRemainingThisCycle, int cycleBeginYear, int cycleBeginDay,
			int cycleLength, int retryCount, String pinControlParameters, int interchangeControls,
			int panServiceRestriction, int san1ServiceRestriction, int san2ServiceRestriction, int expirationDateYear,
			int expirationDateMonth, int cardSequenceNumber, int cardSecurityNumber, char relayMarker,
			int cryptographicCheckDigits, char endSentinel, char longRedundancyCheck, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.startSentinel = startSentinel;
		this.formatCode = formatCode;
		this.fieldSeparator = fieldSeparator;
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.currencyExponent = currencyExponent;
		this.amountAuthorizedPerCycle = amountAuthorizedPerCycle;
		this.amountRemainingThisCycle = amountRemainingThisCycle;
		this.cycleBeginYear = cycleBeginYear;
		this.cycleBeginDay = cycleBeginDay;
		this.cycleLength = cycleLength;
		this.retryCount = retryCount;
		this.pinControlParameters = pinControlParameters;
		this.interchangeControls = interchangeControls;
		this.panServiceRestriction = panServiceRestriction;
		this.san1ServiceRestriction = san1ServiceRestriction;
		this.san2ServiceRestriction = san2ServiceRestriction;
		this.expirationDateYear = expirationDateYear;
		this.expirationDateMonth = expirationDateMonth;
		this.cardSequenceNumber = cardSequenceNumber;
		this.cardSecurityNumber = cardSecurityNumber;
		this.relayMarker = relayMarker;
		this.cryptographicCheckDigits = cryptographicCheckDigits;
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
	public char getFormatCode() {
		return formatCode;
	}
	public void setFormatCode(char formatCode) {
		this.formatCode = formatCode;
	}
	public char getFieldSeparator() {
		return fieldSeparator;
	}
	public void setFieldSeparator(char fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(int currencyCode) {
		this.currencyCode = currencyCode;
	}
	public int getCurrencyExponent() {
		return currencyExponent;
	}
	public void setCurrencyExponent(int currencyExponent) {
		this.currencyExponent = currencyExponent;
	}
	public int getAmountAuthorizedPerCycle() {
		return amountAuthorizedPerCycle;
	}
	public void setAmountAuthorizedPerCycle(int amountAuthorizedPerCycle) {
		this.amountAuthorizedPerCycle = amountAuthorizedPerCycle;
	}
	public int getAmountRemainingThisCycle() {
		return amountRemainingThisCycle;
	}
	public void setAmountRemainingThisCycle(int amountRemainingThisCycle) {
		this.amountRemainingThisCycle = amountRemainingThisCycle;
	}
	public int getCycleBeginYear() {
		return cycleBeginYear;
	}
	public void setCycleBeginYear(int cycleBeginYear) {
		this.cycleBeginYear = cycleBeginYear;
	}
	public int getCycleBeginDay() {
		return cycleBeginDay;
	}
	public void setCycleBeginDay(int cycleBeginDay) {
		this.cycleBeginDay = cycleBeginDay;
	}
	public int getCycleLength() {
		return cycleLength;
	}
	public void setCycleLength(int cycleLength) {
		this.cycleLength = cycleLength;
	}
	public int getRetryCount() {
		return retryCount;
	}
	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}
	public String getPinControlParameters() {
		return pinControlParameters;
	}
	public void setPinControlParameters(String pinControlParameters) {
		this.pinControlParameters = pinControlParameters;
	}
	public int getInterchangeControls() {
		return interchangeControls;
	}
	public void setInterchangeControls(int interchangeControls) {
		this.interchangeControls = interchangeControls;
	}
	public int getPanServiceRestriction() {
		return panServiceRestriction;
	}
	public void setPanServiceRestriction(int panServiceRestriction) {
		this.panServiceRestriction = panServiceRestriction;
	}
	public int getSan1ServiceRestriction() {
		return san1ServiceRestriction;
	}
	public void setSan1ServiceRestriction(int san1ServiceRestriction) {
		this.san1ServiceRestriction = san1ServiceRestriction;
	}
	public int getSan2ServiceRestriction() {
		return san2ServiceRestriction;
	}
	public void setSan2ServiceRestriction(int san2ServiceRestriction) {
		this.san2ServiceRestriction = san2ServiceRestriction;
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
	public int getCardSequenceNumber() {
		return cardSequenceNumber;
	}
	public void setCardSequenceNumber(int cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}
	public int getCardSecurityNumber() {
		return cardSecurityNumber;
	}
	public void setCardSecurityNumber(int cardSecurityNumber) {
		this.cardSecurityNumber = cardSecurityNumber;
	}
	public char getRelayMarker() {
		return relayMarker;
	}
	public void setRelayMarker(char relayMarker) {
		this.relayMarker = relayMarker;
	}
	public int getCryptographicCheckDigits() {
		return cryptographicCheckDigits;
	}
	public void setCryptographicCheckDigits(int cryptographicCheckDigits) {
		this.cryptographicCheckDigits = cryptographicCheckDigits;
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
