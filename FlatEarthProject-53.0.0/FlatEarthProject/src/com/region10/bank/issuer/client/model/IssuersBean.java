package com.region10.bank.issuer.client.model;

import java.sql.Timestamp;

public class IssuersBean {

	private int id;
	
	private String intlBankAccountNumber;	// PIC X(34)
	private String bankIdentifierCode;		// PIC X(11)
	private int bankIdentificationNumber;	// PIC 9(6)
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String phoneNumber;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public IssuersBean () {}

	public IssuersBean(int id, String intlBankAccountNumber, String bankIdentifierCode, int bankIdentificationNumber,
			String name, String street, String city, String state, String country, String zipCode, String phoneNumber,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.intlBankAccountNumber = intlBankAccountNumber;
		this.bankIdentifierCode = bankIdentifierCode;
		this.bankIdentificationNumber = bankIdentificationNumber;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
