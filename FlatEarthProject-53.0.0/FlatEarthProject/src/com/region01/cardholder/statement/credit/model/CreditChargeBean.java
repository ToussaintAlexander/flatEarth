package com.region01.cardholder.statement.credit.model;

import java.sql.Timestamp;
import java.util.Date;

public class CreditChargeBean {

	private int id;
	
	private String primaryAccountNumber;		 
	private int primaryAccountNumberSeq;		 
	private Date closingDate;
	
	private String bankName;	
	private String associationName;			 
	
	private int purchaseAPR;	// Annual Percentage Rate
	private int purchaseFCR;	// Finance Charge Rate
	private int purchaseADB;	// Average Daily Balance
	
	private int advanceAPR;		// Annual Percentage Rate
	private int advanceFCR;		// Finance Charge Rate
	private int advanceADB;		// Average Daily Balance
	
	private int compositeAPR;	// Annual Percentage Rate
	
	private int totalFeesChargedThisPeriod;
	
	// Interest Charged
	
	private int purchaseVariableAPR;
	private int purchaseBalanceSubject;
	private int purchaseDaysInBillingCycle;
	private int purchaseInterestCharge;	
	
	private int cashAdvanceVariableAPR;
	private int cashAdvanceBalanceSubject;
	private int cashAdvanceDaysInBillingCycle;
	private int cashAdvanceInterestCharge;		  
	
	// Totals Year-to-Date
	
	private int totalFeesChargedYTD;
	private int totalInterestChargedYTD;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public CreditChargeBean () {}

	public CreditChargeBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, Date closingDate,
			String bankName, String associationName, int purchaseAPR, int purchaseFCR, int purchaseADB, int advanceAPR,
			int advanceFCR, int advanceADB, int compositeAPR, int totalFeesChargedThisPeriod, int purchaseVariableAPR,
			int purchaseBalanceSubject, int purchaseDaysInBillingCycle, int purchaseInterestCharge,
			int cashAdvanceVariableAPR, int cashAdvanceBalanceSubject, int cashAdvanceDaysInBillingCycle,
			int cashAdvanceInterestCharge, int totalFeesChargedYTD, int totalInterestChargedYTD, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.closingDate = closingDate;
		this.bankName = bankName;
		this.associationName = associationName;
		this.purchaseAPR = purchaseAPR;
		this.purchaseFCR = purchaseFCR;
		this.purchaseADB = purchaseADB;
		this.advanceAPR = advanceAPR;
		this.advanceFCR = advanceFCR;
		this.advanceADB = advanceADB;
		this.compositeAPR = compositeAPR;
		this.totalFeesChargedThisPeriod = totalFeesChargedThisPeriod;
		this.purchaseVariableAPR = purchaseVariableAPR;
		this.purchaseBalanceSubject = purchaseBalanceSubject;
		this.purchaseDaysInBillingCycle = purchaseDaysInBillingCycle;
		this.purchaseInterestCharge = purchaseInterestCharge;
		this.cashAdvanceVariableAPR = cashAdvanceVariableAPR;
		this.cashAdvanceBalanceSubject = cashAdvanceBalanceSubject;
		this.cashAdvanceDaysInBillingCycle = cashAdvanceDaysInBillingCycle;
		this.cashAdvanceInterestCharge = cashAdvanceInterestCharge;
		this.totalFeesChargedYTD = totalFeesChargedYTD;
		this.totalInterestChargedYTD = totalInterestChargedYTD;
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

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	public int getPurchaseAPR() {
		return purchaseAPR;
	}

	public void setPurchaseAPR(int purchaseAPR) {
		this.purchaseAPR = purchaseAPR;
	}

	public int getPurchaseFCR() {
		return purchaseFCR;
	}

	public void setPurchaseFCR(int purchaseFCR) {
		this.purchaseFCR = purchaseFCR;
	}

	public int getPurchaseADB() {
		return purchaseADB;
	}

	public void setPurchaseADB(int purchaseADB) {
		this.purchaseADB = purchaseADB;
	}

	public int getAdvanceAPR() {
		return advanceAPR;
	}

	public void setAdvanceAPR(int advanceAPR) {
		this.advanceAPR = advanceAPR;
	}

	public int getAdvanceFCR() {
		return advanceFCR;
	}

	public void setAdvanceFCR(int advanceFCR) {
		this.advanceFCR = advanceFCR;
	}

	public int getAdvanceADB() {
		return advanceADB;
	}

	public void setAdvanceADB(int advanceADB) {
		this.advanceADB = advanceADB;
	}

	public int getCompositeAPR() {
		return compositeAPR;
	}

	public void setCompositeAPR(int compositeAPR) {
		this.compositeAPR = compositeAPR;
	}

	public int getTotalFeesChargedThisPeriod() {
		return totalFeesChargedThisPeriod;
	}

	public void setTotalFeesChargedThisPeriod(int totalFeesChargedThisPeriod) {
		this.totalFeesChargedThisPeriod = totalFeesChargedThisPeriod;
	}

	public int getPurchaseVariableAPR() {
		return purchaseVariableAPR;
	}

	public void setPurchaseVariableAPR(int purchaseVariableAPR) {
		this.purchaseVariableAPR = purchaseVariableAPR;
	}

	public int getPurchaseBalanceSubject() {
		return purchaseBalanceSubject;
	}

	public void setPurchaseBalanceSubject(int purchaseBalanceSubject) {
		this.purchaseBalanceSubject = purchaseBalanceSubject;
	}

	public int getPurchaseDaysInBillingCycle() {
		return purchaseDaysInBillingCycle;
	}

	public void setPurchaseDaysInBillingCycle(int purchaseDaysInBillingCycle) {
		this.purchaseDaysInBillingCycle = purchaseDaysInBillingCycle;
	}

	public int getPurchaseInterestCharge() {
		return purchaseInterestCharge;
	}

	public void setPurchaseInterestCharge(int purchaseInterestCharge) {
		this.purchaseInterestCharge = purchaseInterestCharge;
	}

	public int getCashAdvanceVariableAPR() {
		return cashAdvanceVariableAPR;
	}

	public void setCashAdvanceVariableAPR(int cashAdvanceVariableAPR) {
		this.cashAdvanceVariableAPR = cashAdvanceVariableAPR;
	}

	public int getCashAdvanceBalanceSubject() {
		return cashAdvanceBalanceSubject;
	}

	public void setCashAdvanceBalanceSubject(int cashAdvanceBalanceSubject) {
		this.cashAdvanceBalanceSubject = cashAdvanceBalanceSubject;
	}

	public int getCashAdvanceDaysInBillingCycle() {
		return cashAdvanceDaysInBillingCycle;
	}

	public void setCashAdvanceDaysInBillingCycle(int cashAdvanceDaysInBillingCycle) {
		this.cashAdvanceDaysInBillingCycle = cashAdvanceDaysInBillingCycle;
	}

	public int getCashAdvanceInterestCharge() {
		return cashAdvanceInterestCharge;
	}

	public void setCashAdvanceInterestCharge(int cashAdvanceInterestCharge) {
		this.cashAdvanceInterestCharge = cashAdvanceInterestCharge;
	}

	public int getTotalFeesChargedYTD() {
		return totalFeesChargedYTD;
	}

	public void setTotalFeesChargedYTD(int totalFeesChargedYTD) {
		this.totalFeesChargedYTD = totalFeesChargedYTD;
	}

	public int getTotalInterestChargedYTD() {
		return totalInterestChargedYTD;
	}

	public void setTotalInterestChargedYTD(int totalInterestChargedYTD) {
		this.totalInterestChargedYTD = totalInterestChargedYTD;
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
