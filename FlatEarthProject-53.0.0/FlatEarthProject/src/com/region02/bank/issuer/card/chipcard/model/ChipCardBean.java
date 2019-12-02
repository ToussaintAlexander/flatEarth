package com.region02.bank.issuer.card.chipcard.model;

import java.sql.Date;
import java.sql.Timestamp;

public class ChipCardBean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A		AN 19		35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N  2 		00
	
	private String associationName;			 
	private String bankName;			 
	private String brandName;			 
	
	private String cardholderFirstName;			// Tag 5F 20	ANS 2-26	54 6f 75 73 73 61 69 6e 74 20 41 6c 65 78 61 6e 64 65 72
	private String cardholderMiddleName;		// Tag 5F 20	ANS 2-26	54 6f 75 73 73 61 69 6e 74 20 41 6c 65 78 61 6e 64 65 72
	private String cardholderLastName;			// Tag 5F 20	ANS 2-26	54 6f 75 73 73 61 69 6e 74 20 41 6c 65 78 61 6e 64 65 72
	
	private Date cardExpirationDate;			// Tag 59		N  6 		18 12 31	YY MM DD
	
	private int cardVerificationValue;				
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public ChipCardBean () {}

	public ChipCardBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, String associationName,
			String bankName, String brandName, String cardholderFirstName, String cardholderMiddleName,
			String cardholderLastName, Date cardExpirationDate, int cardVerificationValue, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.associationName = associationName;
		this.bankName = bankName;
		this.brandName = brandName;
		this.cardholderFirstName = cardholderFirstName;
		this.cardholderMiddleName = cardholderMiddleName;
		this.cardholderLastName = cardholderLastName;
		this.cardExpirationDate = cardExpirationDate;
		this.cardVerificationValue = cardVerificationValue;
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

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCardholderFirstName() {
		return cardholderFirstName;
	}

	public void setCardholderFirstName(String cardholderFirstName) {
		this.cardholderFirstName = cardholderFirstName;
	}

	public String getCardholderMiddleName() {
		return cardholderMiddleName;
	}

	public void setCardholderMiddleName(String cardholderMiddleName) {
		this.cardholderMiddleName = cardholderMiddleName;
	}

	public String getCardholderLastName() {
		return cardholderLastName;
	}

	public void setCardholderLastName(String cardholderLastName) {
		this.cardholderLastName = cardholderLastName;
	}

	public Date getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(Date cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	public int getCardVerificationValue() {
		return cardVerificationValue;
	}

	public void setCardVerificationValue(int cardVerificationValue) {
		this.cardVerificationValue = cardVerificationValue;
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
