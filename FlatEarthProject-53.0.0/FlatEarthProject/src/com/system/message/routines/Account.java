package com.system.message.routines;

import java.math.BigDecimal;

public class Account {

	// Account Key
	private int clientNumber;					// PIC 9(04)
	private int applicationID;					// PIC 9(12)
	private int referenceNumber;				// PIC 9(04)
	
	private int sequenceNumber;					// PIC 9(02)
	private int scoreFlag;						// PIC 9(03)
	private char riskCharacter;					// PIC X(01)
	private int fraudScoreFlag;					// PIC 9(03)
	private char cyclesPastDue;					// PIC X(01)
	private char nsfFlag;						// PIC X(01)
	private char firstUseFlag;					// PIC X(01)
	private char tlaFlag;						// PIC X(01)
	
	private char balanceFlag;					// PIC X(01)
	
	// Available
	private BigDecimal availableMoney;			// PIC S9(07)V99
	private BigDecimal availableCash;			// PIC S9(07)V99
	private BigDecimal netAdjustedMoney;		// PIC S9(07)V99
	private BigDecimal netAdjustedCash;			// PIC S9(07)V99
	
	// Limits
	private BigDecimal currentBalance;			// PIC S9(07)V99
	private BigDecimal creditLimit;				// PIC S9(07)V99
	private BigDecimal discountRate;			// PIC V99
	private char discountFlag;					// PIC X(01)
	private BigDecimal cashLimit;				// PIC S9(07)V99
		
	// Balances
	private BigDecimal outstandingAuths;		// PIC S9(07)V99
	private BigDecimal paymentDue;				// PIC S9(07)V99
	private int paymentDueDate;					// PIC 9(08)
	private BigDecimal lastStatementBalance;	// PIC S9(07)V99
	private BigDecimal cashBalance;				// PIC S9(07)V99
	
	/***************************************************************
	 ***************************************************************
	 */
	public int getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}
	public int getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}
	public int getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public int getScoreFlag() {
		return scoreFlag;
	}
	public void setScoreFlag(int scoreFlag) {
		this.scoreFlag = scoreFlag;
	}
	public char getRiskCharacter() {
		return riskCharacter;
	}
	public void setRiskCharacter(char riskCharacter) {
		this.riskCharacter = riskCharacter;
	}
	public int getFraudScoreFlag() {
		return fraudScoreFlag;
	}
	public void setFraudScoreFlag(int fraudScoreFlag) {
		this.fraudScoreFlag = fraudScoreFlag;
	}
	public char getCyclesPastDue() {
		return cyclesPastDue;
	}
	public void setCyclesPastDue(char cyclesPastDue) {
		this.cyclesPastDue = cyclesPastDue;
	}
	public char getNsfFlag() {
		return nsfFlag;
	}
	public void setNsfFlag(char nsfFlag) {
		this.nsfFlag = nsfFlag;
	}
	public char getFirstUseFlag() {
		return firstUseFlag;
	}
	public void setFirstUseFlag(char firstUseFlag) {
		this.firstUseFlag = firstUseFlag;
	}
	public char getTlaFlag() {
		return tlaFlag;
	}
	public void setTlaFlag(char tlaFlag) {
		this.tlaFlag = tlaFlag;
	}
	public char getBalanceFlag() {
		return balanceFlag;
	}
	public void setBalanceFlag(char balanceFlag) {
		this.balanceFlag = balanceFlag;
	}
	public BigDecimal getAvailableMoney() {
		return availableMoney;
	}
	public void setAvailableMoney(BigDecimal availableMoney) {
		this.availableMoney = availableMoney;
	}
	public BigDecimal getAvailableCash() {
		return availableCash;
	}
	public void setAvailableCash(BigDecimal availableCash) {
		this.availableCash = availableCash;
	}
	public BigDecimal getNetAdjustedMoney() {
		return netAdjustedMoney;
	}
	public void setNetAdjustedMoney(BigDecimal netAdjustedMoney) {
		this.netAdjustedMoney = netAdjustedMoney;
	}
	public BigDecimal getNetAdjustedCash() {
		return netAdjustedCash;
	}
	public void setNetAdjustedCash(BigDecimal netAdjustedCash) {
		this.netAdjustedCash = netAdjustedCash;
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	public BigDecimal getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
	public char getDiscountFlag() {
		return discountFlag;
	}
	public void setDiscountFlag(char discountFlag) {
		this.discountFlag = discountFlag;
	}
	public BigDecimal getCashLimit() {
		return cashLimit;
	}
	public void setCashLimit(BigDecimal cashLimit) {
		this.cashLimit = cashLimit;
	}
	public BigDecimal getOutstandingAuths() {
		return outstandingAuths;
	}
	public void setOutstandingAuths(BigDecimal outstandingAuths) {
		this.outstandingAuths = outstandingAuths;
	}
	public BigDecimal getPaymentDue() {
		return paymentDue;
	}
	public void setPaymentDue(BigDecimal paymentDue) {
		this.paymentDue = paymentDue;
	}
	public int getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(int paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public BigDecimal getLastStatementBalance() {
		return lastStatementBalance;
	}
	public void setLastStatementBalance(BigDecimal lastStatementBalance) {
		this.lastStatementBalance = lastStatementBalance;
	}
	public BigDecimal getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}
	
}
