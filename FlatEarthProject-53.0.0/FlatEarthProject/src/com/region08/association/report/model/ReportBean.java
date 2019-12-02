package com.region08.association.report.model;

import java.sql.Timestamp;

@SuppressWarnings("unused")
public class ReportBean {

	// Acquirer Processor
	
	private int id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String phoneNumber;
	
	// Association
	
//	private int id;
	private String company;
	private String typeHeld;		// private, public company	Public
	private String symbol;			// trading symbol			V
	private String industry;		// 							Financial Services	
	private int founded;			//							1958
	private String founder;			//							Dee Hock
//	private String city;			// Headquarters				Foster City
//	private String state;			// Headquarters				CA
//	private String country;			// Headquarters				USA
	private String areaServed;		//							Worldwide
	private String keyPeople;		// CEO						Alfred F. Kelly
	private String products;		// 							Credit Cards
	private long revenue;			//							18.358 billion USD
	private long operatingIncome;	// Operating Income			12.144 billion USD
	private long netIncome;			// Net Income				699 billion USD
	private long totalAssets;		// 							67.977 billion USD
	private long totalEquity;		//							32.760 billion USD
	private int totalEmployees;		//							11,300
	private String website;			//		
	
	// Issuer Processor
/*	
	private int id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String phoneNumber;
*/	
	// Footprint
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	
}
