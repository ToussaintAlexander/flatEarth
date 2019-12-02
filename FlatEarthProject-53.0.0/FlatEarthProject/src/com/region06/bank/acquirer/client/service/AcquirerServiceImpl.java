package com.region06.bank.acquirer.client.service;

import java.sql.Timestamp;
import java.util.Random;

import com.region06.bank.acquirer.client.model.AcquirerBean;

public class AcquirerServiceImpl implements AcquirerService {

	//-----------------------------------------------------------
	public int getId() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setId(1234);
		return existingAcquirer.getId();
	}
	public String getName() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setName("Visa International");
		return "Name: " + existingAcquirer.getName();
	}
	public String getStreet() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setStreet("900 Metro Center Blvd");
		return "Street: " + existingAcquirer.getStreet();
	}
	public String getCity() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setCity("Foster City");
		return "City: " + existingAcquirer.getCity();
	}	
	public String getState() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setState("CA");
		return "State: " + existingAcquirer.getState();
	}
	public String getCountry() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setCountry("840");
		return "Country: " + existingAcquirer.getCountry();
	}
	public String getZipCode() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setZipCode("94404");
		return "Zip Code: " + existingAcquirer.getZipCode();
	}
	public String getPhoneNumber() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setPhoneNumber("6504323200");
		return "Phone Number: " + existingAcquirer.getPhoneNumber();
	}
	public String getCreateUser() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setCreateUser("TALEXAND");
		return "Create User: " + existingAcquirer.getCreateUser();
	}
	public String getCreateTimestamp() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingAcquirer.setCreateTimestamp(timestamp);
		return "Create Timestamp: " + existingAcquirer.getCreateTimestamp();
	}
	public String getModifyUser() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		existingAcquirer.setModifyUser("TALEXAND");
		return "Modify User: " + existingAcquirer.getModifyUser();
	}
	public String getModifyTimestamp() {
		AcquirerBean existingAcquirer = new AcquirerBean();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingAcquirer.setModifyTimestamp(timestamp);
		return "Modify Timestamp: " + existingAcquirer.getModifyTimestamp();
	}
	//-----------------------------------------------------------
	public AcquirerBean createAcquirer(AcquirerBean order) {
		
		AcquirerBean newAcquirer = new AcquirerBean();
		
		newAcquirer.setId(new Random().nextInt());
		newAcquirer.setName("Visa International");
		newAcquirer.setStreet("900 Metro Center Blvd");
		newAcquirer.setCity("Foster City");
		newAcquirer.setState("CA");
		newAcquirer.setCountry("840");
		newAcquirer.setZipCode("94404");
		newAcquirer.setPhoneNumber("6504323200");
		newAcquirer.setCreateUser("TALEXAND");
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		newAcquirer.setCreateTimestamp(timestamp);
		newAcquirer.setModifyUser("TALEXAND");
		newAcquirer.setModifyTimestamp(timestamp);
		
		return newAcquirer;
	}
	
}
