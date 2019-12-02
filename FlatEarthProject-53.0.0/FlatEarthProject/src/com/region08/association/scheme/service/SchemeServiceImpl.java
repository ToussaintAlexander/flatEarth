package com.region08.association.scheme.service;

import java.sql.Timestamp;
import java.util.Random;

import com.region08.association.scheme.model.SchemeBean;

public class SchemeServiceImpl implements SchemeService {

	//-----------------------------------------------------------
	public int getId() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setId(1234);
		return existingScheme.getId();
	}
	public String getName() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setCompany("Visa International");
		return "Company: " + existingScheme.getCompany();
	}
	public String getIndustry() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setIndustry("900 Metro Center Blvd");
		return "Industry: " + existingScheme.getIndustry();
	}
	public String getCity() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setCity("Foster City");
		return "City: " + existingScheme.getCity();
	}	
	public String getState() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setState("CA");
		return "State: " + existingScheme.getState();
	}
	public String getCountry() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setCountry("840");
		return "Country: " + existingScheme.getCountry();
	}
	public String getZipCode() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setProducts("94404");
		return "Zip Code: " + existingScheme.getProducts();
	}
	public String getPhoneNumber() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setWebsite("6504323200");
		return "Phone Number: " + existingScheme.getWebsite();
	}
	public String getCreateUser() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setCreateUser("TALEXAND");
		return "Create User: " + existingScheme.getCreateUser();
	}
	public String getCreateTimestamp() {
		SchemeBean existingScheme = new SchemeBean();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingScheme.setCreateTimestamp(timestamp);
		return "Create Timestamp: " + existingScheme.getCreateTimestamp();
	}
	public String getModifyUser() {
		SchemeBean existingScheme = new SchemeBean();
		existingScheme.setModifyUser("TALEXAND");
		return "Modify User: " + existingScheme.getModifyUser();
	}
	public String getModifyTimestamp() {
		SchemeBean existingScheme = new SchemeBean();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingScheme.setModifyTimestamp(timestamp);
		return "Modify Timestamp: " + existingScheme.getModifyTimestamp();
	}
	//-----------------------------------------------------------
	public SchemeBean createScheme(SchemeBean order) {
		
		SchemeBean newScheme = new SchemeBean();
		
		newScheme.setId(new Random().nextInt());
		newScheme.setIndustry("Visa International");
		newScheme.setProducts("900 Metro Center Blvd");
		newScheme.setCity("Foster City");
		newScheme.setState("CA");
		newScheme.setCountry("840");
		newScheme.setProducts("94404");
		newScheme.setWebsite	("6504323200");
		newScheme.setCreateUser("TALEXAND");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		newScheme.setCreateTimestamp(timestamp);
		newScheme.setModifyUser("TALEXAND");
		newScheme.setModifyTimestamp(timestamp);
		
		return newScheme;
	}
	
}
