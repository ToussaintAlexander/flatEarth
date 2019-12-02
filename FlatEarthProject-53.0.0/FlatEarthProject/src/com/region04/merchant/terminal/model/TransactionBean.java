package com.region04.merchant.terminal.model;

import java.sql.Timestamp;

public class TransactionBean {

	private int id;
	
	private int acquirerIdentifier;					// Tag 9F01 N 6-11	Uniquely identifies the acquirer within each payment system	Terminal	n 6-11	 	6
	private String merchantIdentifier;				// Tag 9F16 ANS 15	When concatenated with the Acquirer Identifier, uniquely identifies a given merchant	Terminal	ans 15	 	15	15	primitive
	private String terminalIdentification;			// Tag 9F1C AN 8	Designates the unique location of a Terminal at a merchant	Terminal	an 8	 	8	8	primitive
	
	private short statusInformation;				// Tag   9B B 2		(TSI) Indicates the functions performed in a transaction	Terminal	binary	 	2	2	primitive	
	private int formFactorIndicator;				// Tag 9F6E B 32	4-4	(qVSDC)	Indicates the form factor of the consumer payment device and the type of contactless interface over which the transaction was conducted. This information is made available to the issuer host.	Card/Terminal	binary 32	 	4	4
	private int pointofServiceEntryMode;			// Tag 9F39 N 2		(POS) Indicates the method by which the PAN was entered, according to the first two digits of the ISO 8583:1987 POS Entry Mode	Terminal	n 2	 	1	1	constructed	 
	
	private int transactionPIN;						// Tag   99 B		(PIN) Data	Data entered by the cardholder for the purpose of the PIN verification	Terminal	binary	 	var.	var.	primitive
	
	private int transactionType;					// Tag   9C N 2		Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system	Terminal	n 2	 	1	1	primitive	Always '00'
	private int transactionDate;					// Tag   9A N 6		YYMMDD	Local date that the transaction was authorized	Terminal	n 6 (YYMMDD)	 	3	3	primitive
	private int transactionTime;					// Tag 9F21 N 6		HHMMSS	Local time at which the transaction was performed.	Terminal	n 6 (HHMMSS)	 	3	3	constructed
	
	private int countryCode;						// Tag 9F1A N 3
	
	private int currencyCode;						// Tag 5F2A N 3		Indicates the currency code of the transaction according to ISO 4217	Terminal	n 3
	private int currencyExponent;					// Tag 5F36 N 1		Identifies the decimal point position from the right of the transaction amount according to ISO 4217	Terminal	n 1
	private int referenceCurrencyCode;				// Tag 5F3C N 3		Identifies the common currency used by the terminal	Terminal	binary 2
	private int referenceCurrencyExponent;			// Tag 5F3D N 1		Identifies the decimal point position from the right of the terminal common currency	Terminal	n 1

	private int transactionCertificate;				// Tag   98 B 20	(TC) Hash Value	Result of a hash function specified in Book 2, Annex B3.1	Terminal	binary	 	20	20	primitive
	private String authorizationResponseCode;		// Tag   8A AN 2	(ARC) Indicates the transaction disposition of the transaction received from the issuer for online authorizations.	Issuer/Terminal	an 2	 	2	2	primitive	

	private int sequenceCounter;					// Tag 9F41 N 4-8	Counter maintained by the terminal that is incremented by one for each transaction	Terminal	n 4-8	 	2	4	primitive

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public TransactionBean () {}

	public TransactionBean(int id, int acquirerIdentifier, String merchantIdentifier, String terminalIdentification,
			short statusInformation, int formFactorIndicator, int pointofServiceEntryMode, int transactionPIN,
			int transactionType, int transactionDate, int transactionTime, int countryCode, int currencyCode,
			int currencyExponent, int referenceCurrencyCode, int referenceCurrencyExponent, int transactionCertificate,
			String authorizationResponseCode, int sequenceCounter, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.acquirerIdentifier = acquirerIdentifier;
		this.merchantIdentifier = merchantIdentifier;
		this.terminalIdentification = terminalIdentification;
		this.statusInformation = statusInformation;
		this.formFactorIndicator = formFactorIndicator;
		this.pointofServiceEntryMode = pointofServiceEntryMode;
		this.transactionPIN = transactionPIN;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.currencyExponent = currencyExponent;
		this.referenceCurrencyCode = referenceCurrencyCode;
		this.referenceCurrencyExponent = referenceCurrencyExponent;
		this.transactionCertificate = transactionCertificate;
		this.authorizationResponseCode = authorizationResponseCode;
		this.sequenceCounter = sequenceCounter;
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

	public int getAcquirerIdentifier() {
		return acquirerIdentifier;
	}

	public void setAcquirerIdentifier(int acquirerIdentifier) {
		this.acquirerIdentifier = acquirerIdentifier;
	}

	public String getMerchantIdentifier() {
		return merchantIdentifier;
	}

	public void setMerchantIdentifier(String merchantIdentifier) {
		this.merchantIdentifier = merchantIdentifier;
	}

	public String getTerminalIdentification() {
		return terminalIdentification;
	}

	public void setTerminalIdentification(String terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
	}

	public short getStatusInformation() {
		return statusInformation;
	}

	public void setStatusInformation(short statusInformation) {
		this.statusInformation = statusInformation;
	}

	public int getFormFactorIndicator() {
		return formFactorIndicator;
	}

	public void setFormFactorIndicator(int formFactorIndicator) {
		this.formFactorIndicator = formFactorIndicator;
	}

	public int getPointofServiceEntryMode() {
		return pointofServiceEntryMode;
	}

	public void setPointofServiceEntryMode(int pointofServiceEntryMode) {
		this.pointofServiceEntryMode = pointofServiceEntryMode;
	}

	public int getTransactionPIN() {
		return transactionPIN;
	}

	public void setTransactionPIN(int transactionPIN) {
		this.transactionPIN = transactionPIN;
	}

	public int getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	}

	public int getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(int transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(int transactionTime) {
		this.transactionTime = transactionTime;
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

	public int getReferenceCurrencyCode() {
		return referenceCurrencyCode;
	}

	public void setReferenceCurrencyCode(int referenceCurrencyCode) {
		this.referenceCurrencyCode = referenceCurrencyCode;
	}

	public int getReferenceCurrencyExponent() {
		return referenceCurrencyExponent;
	}

	public void setReferenceCurrencyExponent(int referenceCurrencyExponent) {
		this.referenceCurrencyExponent = referenceCurrencyExponent;
	}

	public int getTransactionCertificate() {
		return transactionCertificate;
	}

	public void setTransactionCertificate(int transactionCertificate) {
		this.transactionCertificate = transactionCertificate;
	}

	public String getAuthorizationResponseCode() {
		return authorizationResponseCode;
	}

	public void setAuthorizationResponseCode(String authorizationResponseCode) {
		this.authorizationResponseCode = authorizationResponseCode;
	}

	public int getSequenceCounter() {
		return sequenceCounter;
	}

	public void setSequenceCounter(int sequenceCounter) {
		this.sequenceCounter = sequenceCounter;
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

