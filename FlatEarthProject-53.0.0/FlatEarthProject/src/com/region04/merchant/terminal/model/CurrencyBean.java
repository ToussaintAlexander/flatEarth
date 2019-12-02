package com.region04.merchant.terminal.model;

import java.sql.Timestamp;

public class CurrencyBean {

	private int id;
	
	private int acquirerIdentifier;					// Tag 9F01 N 6-11	Uniquely identifies the acquirer within each payment system	Terminal	n 6-11	 	6
	private String merchantIdentifier;				// Tag 9F16 ANS 15	When concatenated with the Acquirer Identifier, uniquely identifies a given merchant	Terminal	ans 15	 	15	15	primitive
	private String terminalIdentification;			// Tag 9F1C AN 8	Designates the unique location of a Terminal at a merchant	Terminal	an 8	 	8	8	primitive
	
	private int accountType;						// Tag 5F57 N 2		Indicates the type of account selected on the terminal, coded as specified in Annex G	Terminal	n 2	 	1	1	

	private int amountAuthorized;					// Tag 9F02 N 12	Authorized amount of the transaction (excluding adjustments)	Terminal	n 12	 	6	6	primitive	000000010000
	private int amountOther;						// Tag 9F03 N 12	Secondary amount associated with the transaction representing a cash back amount	Terminal	n 12	 	6	6	primitive	Always '00 00 00 00 00 00'

	private int amountReferenceCurrency;			// Tag 9F3A B 4-4	Authorized amount expressed in the reference currency	Terminal	binary	 	4	4	constructed	
	private int codeTransReferenceCode;				// Tag 9F3C N 3		Defining the common currency used by the terminal in case the Transaction Currency Code is different from the Application Currency Code	Terminal	n 3	 	2	2	constructed	 
	private int exponentTransReference;				// Tag 9F3D N 1		Indicates the implied position of the decimal point from the right of the transaction amount, with the Transaction Reference Currency Code represented according to ISO 4217	Terminal	n 1	 	1	1	constructed	 

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public CurrencyBean () {}

	public CurrencyBean(int id, int acquirerIdentifier, String merchantIdentifier, String terminalIdentification,
			int accountType, int amountAuthorized, int amountOther, int amountReferenceCurrency,
			int codeTransReferenceCode, int exponentTransReference, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.acquirerIdentifier = acquirerIdentifier;
		this.merchantIdentifier = merchantIdentifier;
		this.terminalIdentification = terminalIdentification;
		this.accountType = accountType;
		this.amountAuthorized = amountAuthorized;
		this.amountOther = amountOther;
		this.amountReferenceCurrency = amountReferenceCurrency;
		this.codeTransReferenceCode = codeTransReferenceCode;
		this.exponentTransReference = exponentTransReference;
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

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public int getAmountAuthorized() {
		return amountAuthorized;
	}

	public void setAmountAuthorized(int amountAuthorized) {
		this.amountAuthorized = amountAuthorized;
	}

	public int getAmountOther() {
		return amountOther;
	}

	public void setAmountOther(int amountOther) {
		this.amountOther = amountOther;
	}

	public int getAmountReferenceCurrency() {
		return amountReferenceCurrency;
	}

	public void setAmountReferenceCurrency(int amountReferenceCurrency) {
		this.amountReferenceCurrency = amountReferenceCurrency;
	}

	public int getCodeTransReferenceCode() {
		return codeTransReferenceCode;
	}

	public void setCodeTransReferenceCode(int codeTransReferenceCode) {
		this.codeTransReferenceCode = codeTransReferenceCode;
	}

	public int getExponentTransReference() {
		return exponentTransReference;
	}

	public void setExponentTransReference(int exponentTransReference) {
		this.exponentTransReference = exponentTransReference;
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