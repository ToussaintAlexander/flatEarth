package com.region02.bank.issuer.card.chip.model;

import java.sql.Timestamp;

public class IssuerBean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A		AN 19	35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N 2 	00
	
	// The IBAN (International Bank Account Number) is a series of alphanumeric 
	// characters that uniquely identify an account held at a bank. It can be up to 34
	// characters long and contains at least one 2-character country code, 2 check digits, 
	// and the basic bank account number.
	
	private String intlBankAccountNumber;		// Tag 5F 53	AN 34  		IBAN	
	
	// A SWIFT code is an international bank code that identifies particular banks 
	// worldwide. It's also known as a Bank Identifier Code (BIC).
	
	private String bankIdentifierCode;			// Tag 5F 54	A 8 or 11	BIC
	
	// Your bank routing number is a nine-digit code that's based on the U.S. 
	// Bank location where your account was opened.
	
	private int bankIdentificationNumber;		// Tag 42		N 6  	31 32 33 34 35 36				i.e. 123456	(BIN)

	private String merchantCategoryCode;		// Tag 9F 15	N 4		35 35 34 32		AFD=5542
	private String merchantIdentifier;			// Tag 9F 16	ANS 15
	
	private String countryCode;					// Tag 5F 56	A 3		38 34 30						i.e. 840

	private short actionCodeDefault;			// Tag 9F 0D	B 5		F8 40 AC 28 00	Length=10 bits	short=16 bits	 
	private short actionCodeDenial;				// Tag 9F 0E	B 5		00 10 00 00 00	Length=10 bits	short=16 bits
	private short actionCodeOnline;				// Tag 9F 0F	B 5		F8 48 AC F8 00	Length=10 bits	short=16 bits
	
	private String publicKeyCertificate;		// Tag 90 64-248		4E 9A ED 65 93 FD B9 ED 74 A9	
												//						95 2A 49 55 2F 4C 2F FE 52 4F
												//						55 64 55 F6 99 F0 A0 B3 C9 CF
												//						CD 27 F8 91 EA 97 8B D7 6C 64
												//						B7 54 97 7E 52 67 58 82 9B 56
												//						A1 6F 17 E7 50 C8 5D 51 54 48 
												//						59 83 6B 29 FC 6C 11 A4 A4 E0
												//						0A A5 B6 B7 46 A4 29 7E 16 B4
												//						3C D7 BC 37 BD C9 54 0D D5 0A 
												//						32 3A 00 C0 35 FB AD 78 3B BB
												//						22 29 95 45 A7 D8 35 D9 6B 72 
												//						4B 08 B3 B4 68 D2 E2 BC A6 D5
												//						29 65 DE FB 0D 5C EB 3B 68 05
												//						7B C1 66 74 A2 CB FB 83 2C 4B
												//						11 62 36 59 F5 CA A1 0E 42 6C
												//						35 AD 27 F4 07 BF 30 6D FB 5A
												//						C0 FD 49 00 DD 75 47 8C 25 14
												//						54 44 2A 78 74 16
	
	private byte publicKeyExponent;				// Tag 9F 32	B 3		01 00 01 						bytes=8 bits
	
//	private byte publicKeyModulous;				// Tag 			B 		Value of the modulus part of 
												//						the Certification Authority Public Key	NCA up to 248
	
	private long publicKeyRemainder;			// Tag 92				85 BE 5F EB 42 E3 19 B7 8E 10	long=64 bits
												// var					C8 D9 CB 08 63 88 06 FC 9B 52 
												// NI - NCA + 36		8D 0C 6E C3 94 DC 34 81 53 61
												//						11 6B 33 5E 42 A3				
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public IssuerBean () {}

	public IssuerBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, String intlBankAccountNumber,
			String bankIdentifierCode, int bankIdentificationNumber, String merchantCategoryCode,
			String merchantIdentifier, String countryCode, short actionCodeDefault, short actionCodeDenial,
			short actionCodeOnline, String publicKeyCertificate, byte publicKeyExponent, long publicKeyRemainder,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.intlBankAccountNumber = intlBankAccountNumber;
		this.bankIdentifierCode = bankIdentifierCode;
		this.bankIdentificationNumber = bankIdentificationNumber;
		this.merchantCategoryCode = merchantCategoryCode;
		this.merchantIdentifier = merchantIdentifier;
		this.countryCode = countryCode;
		this.actionCodeDefault = actionCodeDefault;
		this.actionCodeDenial = actionCodeDenial;
		this.actionCodeOnline = actionCodeOnline;
		this.publicKeyCertificate = publicKeyCertificate;
		this.publicKeyExponent = publicKeyExponent;
		this.publicKeyRemainder = publicKeyRemainder;
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

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getMerchantIdentifier() {
		return merchantIdentifier;
	}

	public void setMerchantIdentifier(String merchantIdentifier) {
		this.merchantIdentifier = merchantIdentifier;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public short getActionCodeDefault() {
		return actionCodeDefault;
	}

	public void setActionCodeDefault(short actionCodeDefault) {
		this.actionCodeDefault = actionCodeDefault;
	}

	public short getActionCodeDenial() {
		return actionCodeDenial;
	}

	public void setActionCodeDenial(short actionCodeDenial) {
		this.actionCodeDenial = actionCodeDenial;
	}

	public short getActionCodeOnline() {
		return actionCodeOnline;
	}

	public void setActionCodeOnline(short actionCodeOnline) {
		this.actionCodeOnline = actionCodeOnline;
	}

	public String getPublicKeyCertificate() {
		return publicKeyCertificate;
	}

	public void setPublicKeyCertificate(String publicKeyCertificate) {
		this.publicKeyCertificate = publicKeyCertificate;
	}

	public byte getPublicKeyExponent() {
		return publicKeyExponent;
	}

	public void setPublicKeyExponent(byte publicKeyExponent) {
		this.publicKeyExponent = publicKeyExponent;
	}

	public long getPublicKeyRemainder() {
		return publicKeyRemainder;
	}

	public void setPublicKeyRemainder(long publicKeyRemainder) {
		this.publicKeyRemainder = publicKeyRemainder;
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
