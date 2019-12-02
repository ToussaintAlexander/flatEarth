package com.external.bank.issuer.card.model;

/*
The IBAN consists of up to 34 alphanumeric characters, as follows:

country code using ISO 3166-1 alpha-2 – two letters,
check digits – two digits, and
Basic Bank Account Number (BBAN) – up to 30 alphanumeric characters that are country-specific.[1]
The check digits enable a sanity check of the bank account number to confirm its integrity before submitting a transaction.

The BIC
TBNF - 4 character bank code
FR - 2 character ISO country code
43 - 2 character location code
PAR - 3 character branch code (optional)
 */

public class CardBean {

	private int id;
	private int issuerIdentificationNumber;			// tag   42		n 6	Card Issuer (BIN)
	private String cardExpirationDate;			// tag   59
	private String primaryAccountNumber;			// tag   5a		up to 19 characters
	private String cardholderName;				// tag 5F20		ans 2 - 26	
	private String track1Data;				// tag 5F21   	 
	private String track2Data;				// tag 5F22   	 
	private String track3Data;				// tag 5F23  	 
	private String issuerCountryCode1;			// tag 5F28		n 3  	
	private int primaryAccountNumberSequence;		// tag 5F34		n 2  	
	private String internationalBankAccountNumber;		// tag 5F53		an 34  	
	private String bankIdentifierCode;			// tag 5F54		a 8 - 11
	private String issuerCountryCode2;			// tag 5F55		a 2
	private String issuerCountryCode3;			// tag 5F56		a 3
	private String cardholderVerificationMethodList;	// tag 8E	1 - 252
	private int certificationAuthorityPubicKeyIndex;	// tag 8F
	private int issuerPublicKeyCertificate;			// tag 90	binary 512 - 1984
	private int issuerPublicKeyRemainder;			// tag 92	binary 512 - 1984
	private int applicationDiscretionaryData;		//  tag 9F05	binary
	private int applicationUsageControl;			//  tag 9F07	binary
	private String cardholderNameExtended;			//  tag 9F0B	ans 27- 45
	private int issuerActionCodeDefault;			//  tag 9F0D	binary
	private int issuerActionCodeDenial;			//  tag 9F0E	binary
	private int issuerActionOnline;				//  tag 9F0F	binary
	private int lastOnlineapplicationTransactionCounter;	//  tag 9F13	binary
	private int lowerConsecutiveOfflineLimit;		//  tag 9F14	binary
	private int merchantCategoryCode;			//  tag 9F15	n 4
	private int merchantIdentifier;				//  tag 9F16	ans 15
	private int personalIdentificationNumberTryCounter;	//  tag 9F17	binary
	private int upperConsecutiveOfflineLimit;		//  tag 9F23	binary
	private String paymentAccountReference;			//  tag 9F24	ans 24
	private int applicationCryptogram;			//  tag 9F26	binary
	private int cryptogramInformationData;			//  tag 9F27	binary
	private int iccPINEnciphermentPublicKeyCertificate;	//  tag 9F2D	binary
	private int iccPINEnciphermentPublicKeyExponent;	//  tag 9F2E	binary
	private int iccPINEnciphermentPublicKeyremainder;	//  tag 9F2F	binary
	private int issuerPublicKeyExponent;			//  tag 9F32	binary
	private int applicationTransactionCounter;		//  tag 9F36	binary
	private int pointOfServiceEntryMode;			//  tag 9F39	n 2
	private int currencyCodeApplication;			//  tag 9F42	n 3
	private int currencyExponentApplication;		//  tag 9F44	n 1
	private int iccPublicKeyCertificate;			//  tag 9F46	binary
	private int iccPublicKeyExponent;			//  tag 9F47	binary
	private int iccPublicKeyRemainder;			//  tag 9F48	binary
	private int iccDynamicNumber;				//  tag 9F4C	binary
	private int cardholderVerificationStatus;		//  tag 9F50	binary
	private int cumulativeTotalTransactionAmountUpperLimit;	// tag 9F5C	n 12
	private int availableOfflineSpendingAmount;		// tag 9F5D	binary
	private int consecutiveTransactionIntlUpperLimit;	// tag 9F5E	binary
	private int offlineBalance;				// tag 9F5F	n 12
	private int CVC3Track1;					// tag 9F60	binary
	private int CVC3Track2;					// tag 9F61	binary
	private int EncryptedPin;				// tag 9F62	binary
	private int NATCTrack2;					// tag 9F67	binary
	private int unpredictableNumber;			// tag 9F6A	binary
	private int formFactorIndicator;			// tag 9F6E	binary
	private int mobileCvmResults;				// tag 9F71	binary
	private int consecutiveTransactionIntlLimit;		// tag 9F72	binary
	private int currencyConversionParameters;		// tag 9F73	binary
	private int cumulativeTotalTransactionAmountLimit;	// tag 9F75	n 12
	private int secondaryApplicationCurrencyCode;		// tag 9F76	n 3
	private int mobileSupportIndicator;			// tag 9F7E		 
	
	private String createUser;
	private String createTimestamp;
	private String modifyUser;
	private String modifyTimestamp;

	public CardBean () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(String modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
