package com.system.message.routines;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CardActivity {

	// Card Activity Key
	private String cardNumber;					// PIC X(19)
	private int sequenceNumber;					// PIC X(02)
	
	// Account Key
	private int clientNumber;					// PIC 9(04)
	private int applicationID;					// PIC 9(12)
	private int referenceNumber;				// PIC 9(04)
	
	// Account Key 2
	private int applicationId;					// PICS S9(12) COMP
	
	// CVV Reject Information
	private char cVVRejectFlag;					// PIC X(01)
	private Timestamp rejectTimestamp;			// PIC S9(08) COMP + PIC S9(06) COMP
	private Timestamp resetTimestamp;			// PIC S9(08) COMP + PIC S9(06) COMP
	
	private int numberBadPins;					// PIC S9(04) COMP
	
	// Daily Logged Counts
	private int numberAuthorizations;			// PIC S9(04) COMP
	private BigDecimal amountAuthorizations;	// PIC S9(07)V99
	
	private int numberCash;						// PIC S9(04) COMP
	private BigDecimal amountCash;				// PIC S9(07)V99
	
	private int numberATM;						// PIC S9(04) COMP
	private BigDecimal amountATM;				// PIC S9(07)V99
	
	private int numberPurchase;					// PIC S9(04) COMP
	private BigDecimal amountPurchase;			// PIC S9(07)V99
	
	private int numberMailTelephone;			// PIC S9(04) COMP
	private BigDecimal amountMailTelephone;		// PIC S9(07)V99
	
	private int numberDecline;					// PIC S9(04) COMP
	private BigDecimal amountDecline;			// PIC S9(07)V99
	
	private int numberRefer;					// PIC S9(04) COMP
	private BigDecimal amountRefer;				// PIC S9(07)V99
	
	private int numberReversals;				// PIC S9(04) COMP
	private BigDecimal amountReversals;			// PIC S9(07)V99
	
	private int numberCashBack;					// PIC S9(04) COMP
	private BigDecimal amountCashBack;			// PIC S9(07)V99
	
	private int numberPayments;					// PIC S9(04) COMP
	private BigDecimal amountPayments;			// PIC S9(07)V99
	
	private int numberExcessive;				// PIC S9(04) COMP
	private BigDecimal amountExcessive;			// PIC S9(07)V99
	
	/***************************************************************
	 ***************************************************************
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
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
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public char getcVVRejectFlag() {
		return cVVRejectFlag;
	}
	public void setcVVRejectFlag(char cVVRejectFlag) {
		this.cVVRejectFlag = cVVRejectFlag;
	}
	public Timestamp getRejectTimestamp() {
		return rejectTimestamp;
	}
	public void setRejectTimestamp(Timestamp rejectTimestamp) {
		this.rejectTimestamp = rejectTimestamp;
	}
	public Timestamp getResetTimestamp() {
		return resetTimestamp;
	}
	public void setResetTimestamp(Timestamp resetTimestamp) {
		this.resetTimestamp = resetTimestamp;
	}
	public int getNumberBadPins() {
		return numberBadPins;
	}
	public void setNumberBadPins(int numberBadPins) {
		this.numberBadPins = numberBadPins;
	}
	public int getNumberAuthorizations() {
		return numberAuthorizations;
	}
	public void setNumberAuthorizations(int numberAuthorizations) {
		this.numberAuthorizations = numberAuthorizations;
	}
	public BigDecimal getAmountAuthorizations() {
		return amountAuthorizations;
	}
	public void setAmountAuthorizations(BigDecimal amountAuthorizations) {
		this.amountAuthorizations = amountAuthorizations;
	}
	public int getNumberCash() {
		return numberCash;
	}
	public void setNumberCash(int numberCash) {
		this.numberCash = numberCash;
	}
	public BigDecimal getAmountCash() {
		return amountCash;
	}
	public void setAmountaCash(BigDecimal amountCash) {
		this.amountCash = amountCash;
	}
	public int getNumberATM() {
		return numberATM;
	}
	public void setNumberATM(int numberATM) {
		this.numberATM = numberATM;
	}
	public BigDecimal getAmountATM() {
		return amountATM;
	}
	public void setAmountATM(BigDecimal amountATM) {
		this.amountATM = amountATM;
	}
	public int getNumberPurchase() {
		return numberPurchase;
	}
	public void setNumberPurchase(int numberPurchase) {
		this.numberPurchase = numberPurchase;
	}
	public BigDecimal getAmountPurchase() {
		return amountPurchase;
	}
	public void setAmountPurchase(BigDecimal amountPurchase) {
		this.amountPurchase = amountPurchase;
	}
	public int getNumberMailTelephone() {
		return numberMailTelephone;
	}
	public void setNumberMailTelephone(int numberMailTelephone) {
		this.numberMailTelephone = numberMailTelephone;
	}
	public BigDecimal getAmountMailTelephone() {
		return amountMailTelephone;
	}
	public void setAmountMailTelephone(BigDecimal amountMailTelephone) {
		this.amountMailTelephone = amountMailTelephone;
	}
	public int getNumberDecline() {
		return numberDecline;
	}
	public void setNumberDecline(int numberDecline) {
		this.numberDecline = numberDecline;
	}
	public BigDecimal getAmountDecline() {
		return amountDecline;
	}
	public void setAmountDecline(BigDecimal amountDecline) {
		this.amountDecline = amountDecline;
	}
	public int getNumberRefer() {
		return numberRefer;
	}
	public void setNumberRefer(int numberRefer) {
		this.numberRefer = numberRefer;
	}
	public BigDecimal getAmountRefer() {
		return amountRefer;
	}
	public void setAmountRefer(BigDecimal amountRefer) {
		this.amountRefer = amountRefer;
	}
	public int getNumberReversals() {
		return numberReversals;
	}
	public void setNumberReversals(int numberReversals) {
		this.numberReversals = numberReversals;
	}
	public BigDecimal getAmountReversals() {
		return amountReversals;
	}
	public void setAmountReversals(BigDecimal amountReversals) {
		this.amountReversals = amountReversals;
	}
	public int getNumberCashBack() {
		return numberCashBack;
	}
	public void setNumberCashBack(int numberCashBack) {
		this.numberCashBack = numberCashBack;
	}
	public BigDecimal getAmountCashBack() {
		return amountCashBack;
	}
	public void setAmountCashBack(BigDecimal amountCashBack) {
		this.amountCashBack = amountCashBack;
	}
	public int getNumberPayments() {
		return numberPayments;
	}
	public void setNumberPayments(int numberPayments) {
		this.numberPayments = numberPayments;
	}
	public BigDecimal getAmountPayments() {
		return amountPayments;
	}
	public void setAmountPayments(BigDecimal amountPayments) {
		this.amountPayments = amountPayments;
	}
	public int getNumberExcessive() {
		return numberExcessive;
	}
	public void setNumberExcessive(int numberExcessive) {
		this.numberExcessive = numberExcessive;
	}
	public BigDecimal getAmountExcessive() {
		return amountExcessive;
	}
	public void setAmountExcessive(BigDecimal amountExcessive) {
		this.amountExcessive = amountExcessive;
	}
	public void setAmountCash(BigDecimal amountCash) {
		this.amountCash = amountCash;
	}
	
}