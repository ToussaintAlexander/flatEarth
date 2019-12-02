package com.region06.bank.acquirer.client.service;

import com.region06.bank.acquirer.client.model.AcquirerBean;

public interface AcquirerService {

	public int getId();
	public String getName();
	public String getStreet();
	public String getCity();
	public String getState();
	public String getCountry();
	public String getZipCode();
	public String getPhoneNumber();
	public String getCreateUser();
	public String getCreateTimestamp();
	public String getModifyUser();
	public String getModifyTimestamp();
	
	public AcquirerBean createAcquirer(AcquirerBean acquirer);
	
}
