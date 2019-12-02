package com.main.execute.simulation.model;

import java.sql.Timestamp;

public class SimulationBean {

	private int id;
	
	private String primaryAccountNumber;				// DE002	PIC X(19)
	
	// Processing Code								  
	
	private String transactionType;						// DE003	PIC X(02)	
	private String accountFromType;						// DE003	PIC X(02)
	private String accountToType;						// DE003	PIC X(02)
	
	private long transactionAmount;						// DE004	PIC 9(12)
	private String expirationDate;						// DE014	PIC X(04)	YY MM	
	private String merchantCategoryCode;				// DE018	PIC X(04)
	private String acquireInstCountryCode;				// DE019	PIC X(03)	 
	private String forwardInstCountryCode;				// DE021	PIC X(03)
	
	// Point of Service Entry Mode
	
	private String transactionEntryMode;				// DE022	PIC X(02)
	private String pinEntryMode;						// DE022	PIC X(01)
	
	private String posConditionCode;					// DE025	PIC X(02)
	private String transactionFeeAmount;				// DE028	PIC X(01) + PIC X(08)
	private String responseCode;						// DE039	PIC X(03)
	private String transactionCurrencyCode;				// DE049	PIC X(03)
	
	// Additional Amounts
	
	private String accountType;							// DE054	PIC X(02)
	private String amountType;							// DE054	PIC X(02)
	private String currencyCode;						// DE054	PIC X(03)
	private String accountEntry;						// DE054	PIC X(01)
	private String amount;								// DE054	PIC X(12)
	
	private String networkManagementCode;				// DE070	PIC X(03)
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public SimulationBean () {}

	public SimulationBean(int id, String primaryAccountNumber, String transactionType, String accountFromType,
			String accountToType, long transactionAmount, String expirationDate, String merchantCategoryCode,
			String acquiringInstitutionCountryCode, String forwardingInstitutionCountryCode,
			String transactionEntryMode, String pinEntryMode, String pointOfServiceConditionCode,
			String transactionFeeAmount, String responseCode, String transactionCurrencyCode, String accountType,
			String amountType, String currencyCode, String accountEntry, String amount, String networkManagementCode,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.transactionType = transactionType;
		this.accountFromType = accountFromType;
		this.accountToType = accountToType;
		this.transactionAmount = transactionAmount;
		this.expirationDate = expirationDate;
		this.merchantCategoryCode = merchantCategoryCode;
		this.acquireInstCountryCode = acquiringInstitutionCountryCode;
		this.forwardInstCountryCode = forwardingInstitutionCountryCode;
		this.transactionEntryMode = transactionEntryMode;
		this.pinEntryMode = pinEntryMode;
		this.posConditionCode = pointOfServiceConditionCode;
		this.transactionFeeAmount = transactionFeeAmount;
		this.responseCode = responseCode;
		this.transactionCurrencyCode = transactionCurrencyCode;
		this.accountType = accountType;
		this.amountType = amountType;
		this.currencyCode = currencyCode;
		this.accountEntry = accountEntry;
		this.amount = amount;
		this.networkManagementCode = networkManagementCode;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getAccountFromType() {
		return accountFromType;
	}

	public void setAccountFromType(String accountFromType) {
		this.accountFromType = accountFromType;
	}

	public String getAccountToType() {
		return accountToType;
	}

	public void setAccountToType(String accountToType) {
		this.accountToType = accountToType;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getAcquireInstCountryCode() {
		return acquireInstCountryCode;
	}

	public void setAcquireInstCountryCode(String acquireInstCountryCode) {
		this.acquireInstCountryCode = acquireInstCountryCode;
	}

	public String getForwardInstCountryCode() {
		return forwardInstCountryCode;
	}

	public void setForwardInstCountryCode(String forwardInstCountryCode) {
		this.forwardInstCountryCode = forwardInstCountryCode;
	}

	public String getTransactionEntryMode() {
		return transactionEntryMode;
	}

	public void setTransactionEntryMode(String transactionEntryMode) {
		this.transactionEntryMode = transactionEntryMode;
	}

	public String getPinEntryMode() {
		return pinEntryMode;
	}

	public void setPinEntryMode(String pinEntryMode) {
		this.pinEntryMode = pinEntryMode;
	}

	public String getPOSConditionCode() {
		return posConditionCode;
	}

	public void setPOSConditionCode(String posConditionCode) {
		this.posConditionCode = posConditionCode;
	}

	public String getTransactionFeeAmount() {
		return transactionFeeAmount;
	}

	public void setTransactionFeeAmount(String transactionFeeAmount) {
		this.transactionFeeAmount = transactionFeeAmount;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}

	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getAccountEntry() {
		return accountEntry;
	}

	public void setAccountEntry(String accountEntry) {
		this.accountEntry = accountEntry;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getNetworkManagementCode() {
		return networkManagementCode;
	}

	public void setNetworkManagementCode(String networkManagementCode) {
		this.networkManagementCode = networkManagementCode;
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
