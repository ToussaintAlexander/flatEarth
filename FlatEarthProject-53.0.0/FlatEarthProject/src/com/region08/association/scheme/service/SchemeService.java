package com.region08.association.scheme.service;

import com.region08.association.scheme.model.SchemeBean;

public interface SchemeService {

	public int getId();
	public String getName();
	public String getIndustry();
	public String getCity();
	public String getState();
	public String getCountry();
	public String getZipCode();
	public String getPhoneNumber();
	public String getCreateUser();
	public String getCreateTimestamp();
	public String getModifyUser();
	public String getModifyTimestamp();
	
	public SchemeBean createScheme(SchemeBean scheme);
	
}
