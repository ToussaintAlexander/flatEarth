package com.region01.cardholder.statement.credit.model;

import java.sql.Timestamp;
import java.util.Date;

public class CreditSummaryBean {
	
		private int id;
		
		private String primaryAccountNumber;		 
		private int primaryAccountNumberSeq;		 
		private Date closingDate;
		
		private String bankName;	
		private String associationName;			 
		
		private int creditLine;
		private int availableCredit;
		
		private int previousBalance;			 
		private int credits;	
		private int payments;
		private int purchases;
		private int charges;
		private int cashAdvances;
		private int financeCharge;
		private int newBalance;
	
		private String createUser;
		private Timestamp createTimestamp;
		private String modifyUser;
		private Timestamp modifyTimestamp;
		
		public CreditSummaryBean () {}

		public CreditSummaryBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, Date closingDate,
				String bankName, String associationName, int creditLine, int availableCredit, int previousBalance,
				int credits, int payments, int purchases, int charges, int cashAdvances, int financeCharge,
				int newBalance, String createUser, Timestamp createTimestamp, String modifyUser,
				Timestamp modifyTimestamp) {
			super();
			this.id = id;
			this.primaryAccountNumber = primaryAccountNumber;
			this.primaryAccountNumberSeq = primaryAccountNumberSeq;
			this.closingDate = closingDate;
			this.bankName = bankName;
			this.associationName = associationName;
			this.creditLine = creditLine;
			this.availableCredit = availableCredit;
			this.previousBalance = previousBalance;
			this.credits = credits;
			this.payments = payments;
			this.purchases = purchases;
			this.charges = charges;
			this.cashAdvances = cashAdvances;
			this.financeCharge = financeCharge;
			this.newBalance = newBalance;
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

		public int getCreditLine() {
			return creditLine;
		}

		public void setCreditLine(int creditLine) {
			this.creditLine = creditLine;
		}

		public int getAvailableCredit() {
			return availableCredit;
		}

		public void setAvailableCredit(int availableCredit) {
			this.availableCredit = availableCredit;
		}

		public int getPreviousBalance() {
			return previousBalance;
		}

		public void setPreviousBalance(int previousBalance) {
			this.previousBalance = previousBalance;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		public int getPayments() {
			return payments;
		}

		public void setPayments(int payments) {
			this.payments = payments;
		}

		public int getPurchases() {
			return purchases;
		}

		public void setPurchases(int purchases) {
			this.purchases = purchases;
		}

		public int getCharges() {
			return charges;
		}

		public void setCharges(int charges) {
			this.charges = charges;
		}

		public int getCashAdvances() {
			return cashAdvances;
		}

		public void setCashAdvances(int cashAdvances) {
			this.cashAdvances = cashAdvances;
		}

		public int getFinanceCharge() {
			return financeCharge;
		}

		public void setFinanceCharge(int financeCharge) {
			this.financeCharge = financeCharge;
		}

		public int getNewBalance() {
			return newBalance;
		}

		public void setNewBalance(int newBalance) {
			this.newBalance = newBalance;
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
