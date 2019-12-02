package com.region08.association.scheme.model;

import java.sql.Timestamp;

public class SchemeBean {

	private int id;
	private String company;
	private String typeHeld;		// private, public company	Public
	private String symbol;			// trading symbol			V
	private String industry;		// 							Financial Services	
	private int founded;			//							1958
	private String founder;			//							Dee Hock
	private String city;			// Headquarters				Foster City
	private String state;			// Headquarters				CA
	private String country;			// Headquarters				USA
	private String areaServed;		//							Worldwide
	private String keyPeople;		// CEO						Alfred F. Kelly
	private String products;		// 							Credit Cards
	private long revenue;			//							18.358 billion USD
	private long operatingIncome;	// Operating Income			12.144 billion USD
	private long netIncome;			// Net Income				699 billion USD
	private long totalAssets;		// 							67.977 billion USD
	private long totalEquity;		//							32.760 billion USD
	private int totalEmployees;		//							11,300
	private String website;			//							visa.com
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public SchemeBean () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTypeHeld() {
		return typeHeld;
	}

	public void setTypeHeld(String typeHeld) {
		this.typeHeld = typeHeld;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public int getFounded() {
		return founded;
	}

	public void setFounded(int founded) {
		this.founded = founded;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
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

	public String getAreaServed() {
		return areaServed;
	}

	public void setAreaServed(String areaServed) {
		this.areaServed = areaServed;
	}

	public String getKeyPeople() {
		return keyPeople;
	}

	public void setKeyPeople(String keyPeople) {
		this.keyPeople = keyPeople;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}

	public long getOperatingIncome() {
		return operatingIncome;
	}

	public void setOperatingIncome(long operatingIncome) {
		this.operatingIncome = operatingIncome;
	}

	public long getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(long netIncome) {
		this.netIncome = netIncome;
	}

	public long getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(long totalAssets) {
		this.totalAssets = totalAssets;
	}

	public long getTotalEquity() {
		return totalEquity;
	}

	public void setTotalEquity(long totalEquity) {
		this.totalEquity = totalEquity;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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
