package com.region10.bank.issuer.master.model;

import java.sql.Timestamp;
import java.util.Date;

public class IssuerMasterFileBean {

	private int id;
	
	private String intlBankAccountNumber;	// PIC X(34)
	private String bankIdentifierCode;		// PIC X(11)
	private int bankIdentificationNumber;	// PIC 9(6)
	
	// Cardholder Data	 
	
	private String firstName;				// A 30			Toussaint			54 6f 75 73 73 61 69 6e 74 20
	private String middleName;				// A 30			Immanuel			49 6d 6d 61 6e 75 65 6c 20 20
	private String lastName;				// A 30			Alexander			41 6c 65 78 61 6e 64 65 72 20		
	
	private String socialSecurity;			// A  9			573313383			35 37 33 33 31 33 33 38 33 
	
	// Card Data
	
	private String primaryAccountNumber;	// Tag 5A		AN 19		35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;	// Tag 5F 34	N  2 		00
	
	private String associationName;			 
	private String bankName;			 
	private String brandName;			 
	
	private Date cardExpirationDate;			// Tag 59		N  6 		18 12 31	YY MM DD
	
	private int cardVerificationValue;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public IssuerMasterFileBean () {}

	public IssuerMasterFileBean(int id, String intlBankAccountNumber, String bankIdentifierCode,
			int bankIdentificationNumber, String firstName, String middleName, String lastName, String socialSecurity,
			String primaryAccountNumber, int primaryAccountNumberSeq, String associationName, String bankName,
			String brandName, Date cardExpirationDate, int cardVerificationValue, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.intlBankAccountNumber = intlBankAccountNumber;
		this.bankIdentifierCode = bankIdentifierCode;
		this.bankIdentificationNumber = bankIdentificationNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.associationName = associationName;
		this.bankName = bankName;
		this.brandName = brandName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
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
