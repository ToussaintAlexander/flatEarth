package com.region08.association.certification.model;

import java.sql.Timestamp;
import java.util.Date;

public class CertificationBean {

	private int id;
	private String processorName;
	private int processorNumber;
	
	private String projectManager;
	private String telephoneNumber1;
	private String emailAddress1;
	
	private String processorTester;
	private String telephoneNumber2;
	private String emailAddress2;
	
	// Testing Date + Times
	
	private Date testDates1;
	private Timestamp testTime1;
	private Date testDates2;
	private Timestamp testTime2;
	private Date testDates3;
	private Timestamp testTime3;
	
	// Testing Purpose (boolean)
	
	private int newProcessor;
	private int processorUpgrade;
	private int disasterRecovery;
	private int connectivityOnly;
	private int keyEncryptionKey;
	private int fraudSystem;
	
	// Card Verification (boolean)
	
	private int cVV1;
	private int cVV2;
	private int iCVV;
	private int dCVV;
	
	private int pinValidation;
	
	// Credit Card Products (boolean)
	
	private int pinlessBillPay;
	private int eCommerceSupported;
	private int accountToAccount;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public CertificationBean () {}

	public CertificationBean(int id, String processorName, int processorNumber, String projectManager,
			String telephoneNumber1, String emailAddress1, String processorTester, String telephoneNumber2,
			String emailAddress2, Date testDates1, Timestamp testTime1, Date testDates2, Timestamp testTime2,
			Date testDates3, Timestamp testTime3, int newProcessor, int processorUpgrade,
			int disasterRecovery, int connectivityOnly, int keyEncryptionKey, int fraudSystem,
			int cVV1, int cVV2, int iCVV, int dCVV, int pinValidation, int pinlessBillPay,
			int eCommerceSupported, int accountToAccount, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.processorName = processorName;
		this.processorNumber = processorNumber;
		this.projectManager = projectManager;
		this.telephoneNumber1 = telephoneNumber1;
		this.emailAddress1 = emailAddress1;
		this.processorTester = processorTester;
		this.telephoneNumber2 = telephoneNumber2;
		this.emailAddress2 = emailAddress2;
		this.testDates1 = testDates1;
		this.testTime1 = testTime1;
		this.testDates2 = testDates2;
		this.testTime2 = testTime2;
		this.testDates3 = testDates3;
		this.testTime3 = testTime3;
		this.newProcessor = newProcessor;
		this.processorUpgrade = processorUpgrade;
		this.disasterRecovery = disasterRecovery;
		this.connectivityOnly = connectivityOnly;
		this.keyEncryptionKey = keyEncryptionKey;
		this.fraudSystem = fraudSystem;
		this.cVV1 = cVV1;
		this.cVV2 = cVV2;
		this.iCVV = iCVV;
		this.dCVV = dCVV;
		this.pinValidation = pinValidation;
		this.pinlessBillPay = pinlessBillPay;
		this.eCommerceSupported = eCommerceSupported;
		this.accountToAccount = accountToAccount;
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

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public int getProcessorNumber() {
		return processorNumber;
	}

	public void setProcessorNumber(int processorNumber) {
		this.processorNumber = processorNumber;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getTelephoneNumber1() {
		return telephoneNumber1;
	}

	public void setTelephoneNumber1(String telephoneNumber1) {
		this.telephoneNumber1 = telephoneNumber1;
	}

	public String getEmailAddress1() {
		return emailAddress1;
	}

	public void setEmailAddress1(String emailAddress1) {
		this.emailAddress1 = emailAddress1;
	}

	public String getProcessorTester() {
		return processorTester;
	}

	public void setProcessorTester(String processorTester) {
		this.processorTester = processorTester;
	}

	public String getTelephoneNumber2() {
		return telephoneNumber2;
	}

	public void setTelephoneNumber2(String telephoneNumber2) {
		this.telephoneNumber2 = telephoneNumber2;
	}

	public String getEmailAddress2() {
		return emailAddress2;
	}

	public void setEmailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}

	public Date getTestDates1() {
		return testDates1;
	}

	public void setTestDates1(Date testDates1) {
		this.testDates1 = testDates1;
	}

	public Timestamp getTestTime1() {
		return testTime1;
	}

	public void setTestTime1(Timestamp testTime1) {
		this.testTime1 = testTime1;
	}

	public Date getTestDates2() {
		return testDates2;
	}

	public void setTestDates2(Date testDates2) {
		this.testDates2 = testDates2;
	}

	public Timestamp getTestTime2() {
		return testTime2;
	}

	public void setTestTime2(Timestamp testTime2) {
		this.testTime2 = testTime2;
	}

	public Date getTestDates3() {
		return testDates3;
	}

	public void setTestDates3(Date testDates3) {
		this.testDates3 = testDates3;
	}

	public Timestamp getTestTime3() {
		return testTime3;
	}

	public void setTestTime3(Timestamp testTime3) {
		this.testTime3 = testTime3;
	}

	public int getNewProcessor() {
		return newProcessor;
	}

	public void setNewProcessor(int newProcessor) {
		this.newProcessor = newProcessor;
	}

	public int getProcessorUpgrade() {
		return processorUpgrade;
	}

	public void setProcessorUpgrade(int processorUpgrade) {
		this.processorUpgrade = processorUpgrade;
	}

	public int getDisasterRecovery() {
		return disasterRecovery;
	}

	public void setDisasterRecovery(int disasterRecovery) {
		this.disasterRecovery = disasterRecovery;
	}

	public int getConnectivityOnly() {
		return connectivityOnly;
	}

	public void setConnectivityOnly(int connectivityOnly) {
		this.connectivityOnly = connectivityOnly;
	}

	public int getKeyEncryptionKey() {
		return keyEncryptionKey;
	}

	public void setKeyEncryptionKey(int keyEncryptionKey) {
		this.keyEncryptionKey = keyEncryptionKey;
	}

	public int getFraudSystem() {
		return fraudSystem;
	}

	public void setFraudSystem(int fraudSystem) {
		this.fraudSystem = fraudSystem;
	}

	public int getcVV1() {
		return cVV1;
	}

	public void setcVV1(int cVV1) {
		this.cVV1 = cVV1;
	}

	public int getcVV2() {
		return cVV2;
	}

	public void setcVV2(int cVV2) {
		this.cVV2 = cVV2;
	}

	public int getiCVV() {
		return iCVV;
	}

	public void setiCVV(int iCVV) {
		this.iCVV = iCVV;
	}

	public int getdCVV() {
		return dCVV;
	}

	public void setdCVV(int dCVV) {
		this.dCVV = dCVV;
	}

	public int getPinValidation() {
		return pinValidation;
	}

	public void setPinValidation(int pinValidation) {
		this.pinValidation = pinValidation;
	}

	public int getPinlessBillPay() {
		return pinlessBillPay;
	}

	public void setPinlessBillPay(int pinlessBillPay) {
		this.pinlessBillPay = pinlessBillPay;
	}

	public int geteCommerceSupported() {
		return eCommerceSupported;
	}

	public void seteCommerceSupported(int eCommerceSupported) {
		this.eCommerceSupported = eCommerceSupported;
	}

	public int getAccountToAccount() {
		return accountToAccount;
	}

	public void setAccountToAccount(int accountToAccount) {
		this.accountToAccount = accountToAccount;
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
