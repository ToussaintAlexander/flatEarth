package com.region02.bank.issuer.card.magstripe.model;

import java.sql.Timestamp;

public class Track1Bean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A		AN 19		35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N 2 		00
	
	private char startSentinel;					// SS = '%'		S 1   
	
	/*
	 	FC: Format Code. 1 character (alphabetic only):
	 	
	 	A: 		Reserved for proprietary use of card issuer.
		B: 		Bank/financial. This is the format described here.
		C-M: 	Reserved for use by ANSI Subcommittee X3B10.
		N-Z: 	Available for use by individual card issuers.
	 */
	
	private char formatCode;				 	// FC = 'A'		A 1
//	private String primaryAccountNumber;
	
	/*
	 	NM: Name. 2-26 characters:
	 
		Surname(s) (separated by space if necessary).
		Surname separator: /.
		First name(s) or initial(s) (separated by space if necessary).
		Period (when followed by title).
		Title (when used).
	 */
	
	
	
	private char fieldSeparator1;				// FS = '^'		S 1
	private String fullName;					// 				AN 26
	private char fieldSeparator2;				// FS = '^'		S 1
	
	private int expirationDateYear;				// YY
	private int expirationDateMonth;			// MM
	
	/*
	 	SC: Service Code. 3 digits:
	 
	 	Digit 1 (most significant): Interchange and technology:
	 
	 	0: Reserved for future use by ISO.
		1: Available for international interchange.
		2: Available for international interchange and with integrated circuit, which should be used for the financial transaction when feasible.
		3: Reserved for future use by ISO.
		4: Reserved for future use by ISO.
		5: Available for national interchange only, except under bilateral agreement.
		6: Available for national interchange only, except under bilateral agreement, and with integrated circuit, which should be used for the financial transaction when feasible.
		7: Not available for general interchange, except under bilateral agreement.
		8: Reserved for future use by ISO.
		9: Test.
		
		Digit 2: Authorization processing:
		
		0: Transactions are authorized following the normal rules.
		1: Reserved for future use by ISO.
		2: Transactions are authorized by issuer and should be online.
		3: Reserved for future use by ISO.
		4: Transactions are authorized by issuer and should be online, except under bilateral agreement.
		5-9: Reserved for future use by ISO.
		
		Digit 3 (least significant): Range of services and PIN requirements:
		
		0: No restrictions and PIN required.
		1: No restrictions.
		2: Goods and services only (no cash).
		3: ATM only and PIN required.
		4: Cash only.
		5: Goods and services only (no cash) and PIN required.
		6: No restrictions and require PIN when feasible.
		7: Goods and services only (no cash) and require PIN when feasible.
		8: Reserved for future use by ISO.
		9: Reserved for future use by ISO.
	 */
	
	private int serviceCode;					// N 3
	
	private int pinValidationKeyIndex;			// N 1			PVKI
	private int pinVerificationValue;			// N 4			PVV
	private int cardVerificationValue;			// N 3			CVV
	
	private char endSentinel;					// Hex F ?		S 1 
	private char longRedundancyCheck;			// LRC			A 1

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public Track1Bean () {}

	public Track1Bean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, char startSentinel,
			char formatCode, char fieldSeparator1, String fullName, char fieldSeparator2, int expirationDateYear,
			int expirationDateMonth, int serviceCode, int pinValidationKeyIndex, int pinVerificationValue,
			int cardVerificationValue, char endSentinel, char longRedundancyCheck, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.startSentinel = startSentinel;
		this.formatCode = formatCode;
		this.fieldSeparator1 = fieldSeparator1;
		this.fullName = fullName;
		this.fieldSeparator2 = fieldSeparator2;
		this.expirationDateYear = expirationDateYear;
		this.expirationDateMonth = expirationDateMonth;
		this.serviceCode = serviceCode;
		this.pinValidationKeyIndex = pinValidationKeyIndex;
		this.pinVerificationValue = pinVerificationValue;
		this.cardVerificationValue = cardVerificationValue;
		this.endSentinel = endSentinel;
		this.longRedundancyCheck = longRedundancyCheck;
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

	public char getStartSentinel() {
		return startSentinel;
	}

	public void setStartSentinel(char startSentinel) {
		this.startSentinel = startSentinel;
	}

	public char getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(char formatCode) {
		this.formatCode = formatCode;
	}

	public char getFieldSeparator1() {
		return fieldSeparator1;
	}

	public void setFieldSeparator1(char fieldSeparator1) {
		this.fieldSeparator1 = fieldSeparator1;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public char getFieldSeparator2() {
		return fieldSeparator2;
	}

	public void setFieldSeparator2(char fieldSeparator2) {
		this.fieldSeparator2 = fieldSeparator2;
	}

	public int getExpirationDateYear() {
		return expirationDateYear;
	}

	public void setExpirationDateYear(int expirationDateYear) {
		this.expirationDateYear = expirationDateYear;
	}

	public int getExpirationDateMonth() {
		return expirationDateMonth;
	}

	public void setExpirationDateMonth(int expirationDateMonth) {
		this.expirationDateMonth = expirationDateMonth;
	}

	public int getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(int serviceCode) {
		this.serviceCode = serviceCode;
	}

	public int getPinValidationKeyIndex() {
		return pinValidationKeyIndex;
	}

	public void setPinValidationKeyIndex(int pinValidationKeyIndex) {
		this.pinValidationKeyIndex = pinValidationKeyIndex;
	}

	public int getPinVerificationValue() {
		return pinVerificationValue;
	}

	public void setPinVerificationValue(int pinVerificationValue) {
		this.pinVerificationValue = pinVerificationValue;
	}

	public int getCardVerificationValue() {
		return cardVerificationValue;
	}

	public void setCardVerificationValue(int cardVerificationValue) {
		this.cardVerificationValue = cardVerificationValue;
	}

	public char getEndSentinel() {
		return endSentinel;
	}

	public void setEndSentinel(char endSentinel) {
		this.endSentinel = endSentinel;
	}

	public char getLongRedundancyCheck() {
		return longRedundancyCheck;
	}

	public void setLongRedundancyCheck(char longRedundancyCheck) {
		this.longRedundancyCheck = longRedundancyCheck;
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
