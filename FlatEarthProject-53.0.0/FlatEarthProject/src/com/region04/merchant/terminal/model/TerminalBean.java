package com.region04.merchant.terminal.model;

import java.sql.Timestamp;

public class TerminalBean {

	private int id;
	
	private long acquirerIdentifier;				// Tag 9F01 N 6-11	Uniquely identifies the acquirer within each payment system	Terminal	n 6-11	 	6
	private String merchantIdentifier;				// Tag 9F16 ANS 15	When concatenated with the Acquirer Identifier, uniquely identifies a given merchant	Terminal	ans 15	 	15	15	primitive
	private String terminalIdentification;			// Tag 9F1C AN 8	Designates the unique location of a Terminal at a merchant	Terminal	an 8	 	8	8	primitive
	
	private int merchantCategoryCode;				// Tag 9F15 N 4		(MCC) Classifies the type of business being done by the merchant, represented according to ISO 8583:1993 for Card Acceptor Business Code	Terminal	n 4	 	2	2	primitive
	private String merchantNameAndLocation;			// Tag 9F4E	ANS		Indicates the name and location of the merchant	Terminal	ans	 	var.	var.	primitive
	
	private String interfaceDeviceSerialNumber;		// Tag 9F1E AN 8	(IFD) Unique and permanent serial number assigned to the IFD by the manufacturer	Terminal	an 8	 	8	8	primitive
	private int terminalType;						// Tag 9F35 N 2		Indicates the environment of the terminal, its communications capability, and its operational control	Terminal	n 2	 	1	1	constructed	 
	private int terminalCountryCode;				// Tag 9F1A N 3		Indicates the country of the terminal, represented according to ISO 3166	Terminal	n 3	 	2	2	primitive
	
	private int terminalCapabilities;				// Tag 9F33 B 3		Indicates the card data input, CVM, and security capabilities of the Terminal and Reader. The CVM capability (Byte 2) is instantiated with values depending on the transaction amount. The Terminal Capabilities is coded according to Annex A.2 of [EMV Book 4].	Terminal	binary	 	3	3	constructed
	private int kernel4ReaderCapabilities;			// Tag 9F6D B 3		A proprietary data element with bits 8, 7, and 4 only used to indicate a terminal's capability to support Kernel 4 mag-stripe or EMV contactless. This data element is OR'd with Terminal Type, Tag '9F35', resulting in a modified Tag '9F35', which is passed to the card when requested.	Terminal	n 2	 	1	1	 
	private int additionalTermCapabilities;			// Tag 9F40 B 5		(ATC) Indicates the data input and output capabilities of the Terminal and Reader. The Additional Terminal Capabilities is coded according to Annex A.3 of [EMV Book 4].	Terminal	binary	 	5	5	primitive
	private int terminalTransQualifiers;			// Tag 9F66 B 32	4-4 (TTQ)	Indicates reader capabilities, requirements, and preferences to the card. TTQ byte 2 bits 8-7 are transient values, and reset to zero at the beginning of the transaction. All other TTQ bits are static values, and not modified based on transaction conditions. TTQ byte 3 bit 7 shall be set by the acquirer-merchant to 1b.	Terminal	binary 32	 	4	4
	
	private int vLPTermSupportIndicator;			// Tag 9F7B N 1		If present indicates offline and/or online support. If absent indicates online only support	Terminal	n 1	 	1	1
	private int vLPTermTransactionLimit;			// Tag 9F7C B 32	? ?		Terminal	H	 	 
	
	private int terminalFloorLimit;					// Tag 9F1B B 32 	4-4	Indicates the floor limit in the terminal in conjunction with the AID	Terminal	binary 32	 	4	4	primitive
	
	private int actionCodeDefault;					// Tag DF56	B 5		Terminal	H Because Issuer data type + length
	private int actionCodeDecline;					// Tag DF57	B 5		Terminal	H
	private int actionCodeOnline;					// Tag ????	B 5		Terminal	H
	
	private int riskManagementData;					// Tag 9F1D B 1-8	Application-specific value used by the card for risk management purposes	Terminal	binary	 	1	8	primitive
	
	private int verificationResults;				// Tag   95	B 5-5	(TVR)	Status of the different functions from the Terminal perspective. The Terminal Verification Results is coded according to Annex C.5 of [EMV Book 3].	Terminal	binary	 	5	5	primitive

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public TerminalBean () {}

	public TerminalBean(int id, long acquirerIdentifier, String merchantIdentifier, String terminalIdentification,
			int merchantCategoryCode, String merchantNameAndLocation, String interfaceDeviceSerialNumber,
			int terminalType, int terminalCountryCode, int terminalCapabilities, int kernel4ReaderCapabilities,
			int additionalTermCapabilities, int terminalTransQualifiers, int vLPTermSupportIndicator,
			int vLPTermTransactionLimit, int terminalFloorLimit, int actionCodeDefault, int actionCodeDecline,
			int actionCodeOnline, int riskManagementData, int verificationResults, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.acquirerIdentifier = acquirerIdentifier;
		this.merchantIdentifier = merchantIdentifier;
		this.terminalIdentification = terminalIdentification;
		this.merchantCategoryCode = merchantCategoryCode;
		this.merchantNameAndLocation = merchantNameAndLocation;
		this.interfaceDeviceSerialNumber = interfaceDeviceSerialNumber;
		this.terminalType = terminalType;
		this.terminalCountryCode = terminalCountryCode;
		this.terminalCapabilities = terminalCapabilities;
		this.kernel4ReaderCapabilities = kernel4ReaderCapabilities;
		this.additionalTermCapabilities = additionalTermCapabilities;
		this.terminalTransQualifiers = terminalTransQualifiers;
		this.vLPTermSupportIndicator = vLPTermSupportIndicator;
		this.vLPTermTransactionLimit = vLPTermTransactionLimit;
		this.terminalFloorLimit = terminalFloorLimit;
		this.actionCodeDefault = actionCodeDefault;
		this.actionCodeDecline = actionCodeDecline;
		this.actionCodeOnline = actionCodeOnline;
		this.riskManagementData = riskManagementData;
		this.verificationResults = verificationResults;
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

	public long getAcquirerIdentifier() {
		return acquirerIdentifier;
	}

	public void setAcquirerIdentifier(long acquirerIdentifier) {
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

	public int getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(int merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getMerchantNameAndLocation() {
		return merchantNameAndLocation;
	}

	public void setMerchantNameAndLocation(String merchantNameAndLocation) {
		this.merchantNameAndLocation = merchantNameAndLocation;
	}

	public String getInterfaceDeviceSerialNumber() {
		return interfaceDeviceSerialNumber;
	}

	public void setInterfaceDeviceSerialNumber(String interfaceDeviceSerialNumber) {
		this.interfaceDeviceSerialNumber = interfaceDeviceSerialNumber;
	}

	public int getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(int terminalType) {
		this.terminalType = terminalType;
	}

	public int getTerminalCountryCode() {
		return terminalCountryCode;
	}

	public void setTerminalCountryCode(int terminalCountryCode) {
		this.terminalCountryCode = terminalCountryCode;
	}

	public int getTerminalCapabilities() {
		return terminalCapabilities;
	}

	public void setTerminalCapabilities(int terminalCapabilities) {
		this.terminalCapabilities = terminalCapabilities;
	}

	public int getKernel4ReaderCapabilities() {
		return kernel4ReaderCapabilities;
	}

	public void setKernel4ReaderCapabilities(int kernel4ReaderCapabilities) {
		this.kernel4ReaderCapabilities = kernel4ReaderCapabilities;
	}

	public int getAdditionalTermCapabilities() {
		return additionalTermCapabilities;
	}

	public void setAdditionalTermCapabilities(int additionalTermCapabilities) {
		this.additionalTermCapabilities = additionalTermCapabilities;
	}

	public int getTerminalTransQualifiers() {
		return terminalTransQualifiers;
	}

	public void setTerminalTransQualifiers(int terminalTransQualifiers) {
		this.terminalTransQualifiers = terminalTransQualifiers;
	}

	public int getvLPTermSupportIndicator() {
		return vLPTermSupportIndicator;
	}

	public void setvLPTermSupportIndicator(int vLPTermSupportIndicator) {
		this.vLPTermSupportIndicator = vLPTermSupportIndicator;
	}

	public int getvLPTermTransactionLimit() {
		return vLPTermTransactionLimit;
	}

	public void setvLPTermTransactionLimit(int vLPTermTransactionLimit) {
		this.vLPTermTransactionLimit = vLPTermTransactionLimit;
	}

	public int getTerminalFloorLimit() {
		return terminalFloorLimit;
	}

	public void setTerminalFloorLimit(int terminalFloorLimit) {
		this.terminalFloorLimit = terminalFloorLimit;
	}

	public int getActionCodeDefault() {
		return actionCodeDefault;
	}

	public void setActionCodeDefault(int actionCodeDefault) {
		this.actionCodeDefault = actionCodeDefault;
	}

	public int getActionCodeDecline() {
		return actionCodeDecline;
	}

	public void setActionCodeDecline(int actionCodeDecline) {
		this.actionCodeDecline = actionCodeDecline;
	}

	public int getActionCodeOnline() {
		return actionCodeOnline;
	}

	public void setActionCodeOnline(int actionCodeOnline) {
		this.actionCodeOnline = actionCodeOnline;
	}

	public int getRiskManagementData() {
		return riskManagementData;
	}

	public void setRiskManagementData(int riskManagementData) {
		this.riskManagementData = riskManagementData;
	}

	public int getVerificationResults() {
		return verificationResults;
	}

	public void setVerificationResults(int verificationResults) {
		this.verificationResults = verificationResults;
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