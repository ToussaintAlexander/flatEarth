package com.region06.bank.acquirer.master.model;

import java.sql.Timestamp;

public class AcquirerMasterFileBean {

	private int id;
	
	private String intlBankAccountNumber;	// PIC X(34)
	private String bankIdentifierCode;		// PIC X(11)
	private int bankIdentificationNumber;	// PIC 9(6)
	
	// Merchant Data	 
	
	private String merchantIdentifier;		// PIC X(19)		
	private String merchantCategoryCode;	// PIC X(04)	
	
	// Terminals
	
	private long acquirerIdentifier;				// Tag 9F01 N 6-11	Uniquely identifies the acquirer within each payment system	Terminal	n 6-11	 	6
//	private String merchantIdentifier;				// Tag 9F16 ANS 15	When concatenated with the Acquirer Identifier, uniquely identifies a given merchant	Terminal	ans 15	 	15	15	primitive
	private String terminalIdentification;			// Tag 9F1C AN 8	Designates the unique location of a Terminal at a merchant	Terminal	an 8	 	8	8	primitive
	
	private String interfaceDeviceSerialNumber;		// Tag 9F1E AN 8	(IFD) Unique and permanent serial number assigned to the IFD by the manufacturer	Terminal	an 8	 	8	8	primitive
	private int terminalType;						// Tag 9F35 N 2		Indicates the environment of the terminal, its communications capability, and its operational control	Terminal	n 2	 	1	1	constructed	 

	private int terminalCountryCode;				// Tag 
	private int countryCode;						// Tag 9F1A N 3
	private int currencyCode;						// Tag 5F2A N 3		Indicates the currency code of the transaction according to ISO 4217	Terminal	n 3
	
	private int formFactorIndicator;				// Tag 9F6E B 32	4-4	(qVSDC)	Indicates the form factor of the consumer payment device and the type of contactless interface over which the transaction was conducted. This information is made available to the issuer host.	Card/Terminal	binary 32	 	4	4
	private int pointofServiceEntryMode;			// Tag 9F39 N 2		(POS) Indicates the method by which the PAN was entered, according to the first two digits of the ISO 8583:1987 POS Entry Mode	Terminal	n 2	 	1	1	constructed	 

	private int transactionType;					// Tag   9C N 2		Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system	Terminal	n 2	 	1	1	primitive	Always '00'
	private int transactionDate;					// Tag   9A N 6		YYMMDD	Local date that the transaction was authorized	Terminal	n 6 (YYMMDD)	 	3	3	primitive
	private int transactionTime;		

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public AcquirerMasterFileBean () {}

	public AcquirerMasterFileBean(int id, String intlBankAccountNumber, String bankIdentifierCode,
			int bankIdentificationNumber, String merchantIdentifier, String merchantCategoryCode,
			long acquirerIdentifier, String terminalIdentification, String interfaceDeviceSerialNumber,
			int terminalType, int terminalCountryCode, int countryCode, int currencyCode, int formFactorIndicator,
			int pointofServiceEntryMode, int transactionType, int transactionDate, int transactionTime,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.intlBankAccountNumber = intlBankAccountNumber;
		this.bankIdentifierCode = bankIdentifierCode;
		this.bankIdentificationNumber = bankIdentificationNumber;
		this.merchantIdentifier = merchantIdentifier;
		this.merchantCategoryCode = merchantCategoryCode;
		this.acquirerIdentifier = acquirerIdentifier;
		this.terminalIdentification = terminalIdentification;
		this.interfaceDeviceSerialNumber = interfaceDeviceSerialNumber;
		this.terminalType = terminalType;
		this.terminalCountryCode = terminalCountryCode;
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.formFactorIndicator = formFactorIndicator;
		this.pointofServiceEntryMode = pointofServiceEntryMode;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
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

	public String getIntlBankAccountNumber() {
		return intlBankAccountNumber;
	}

	public void setIntlBankAccountNumber(String intlBankAccountNumber) {
		this.intlBankAccountNumber = intlBankAccountNumber;
	}

	public String getBankIdentifierCode() {
		return bankIdentifierCode;
	}

	public void setBankIdentifierCode(String bankIdentifierCode) {
		this.bankIdentifierCode = bankIdentifierCode;
	}

	public int getBankIdentificationNumber() {
		return bankIdentificationNumber;
	}

	public void setBankIdentificationNumber(int bankIdentificationNumber) {
		this.bankIdentificationNumber = bankIdentificationNumber;
	}

	public String getMerchantIdentifier() {
		return merchantIdentifier;
	}

	public void setMerchantIdentifier(String merchantIdentifier) {
		this.merchantIdentifier = merchantIdentifier;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public long getAcquirerIdentifier() {
		return acquirerIdentifier;
	}

	public void setAcquirerIdentifier(long acquirerIdentifier) {
		this.acquirerIdentifier = acquirerIdentifier;
	}

	public String getTerminalIdentification() {
		return terminalIdentification;
	}

	public void setTerminalIdentification(String terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
	}

	public String getInterfaceDeviceSerialNumber() {
		return interfaceDeviceSerialNumber;
	}

	public void setInterfaceDeviceSerialNumber(String interfaceDeviceSerialNumber) {
		this.interfaceDeviceSerialNumber = interfaceDeviceSerialNumber;
	}

	public int getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(int terminalType) {
		this.terminalType = terminalType;
	}

	public int getTerminalCountryCode() {
		return terminalCountryCode;
	}

	public void setTerminalCountryCode(int terminalCountryCode) {
		this.terminalCountryCode = terminalCountryCode;
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
