package com.system.configuration.address.dao;

import java.util.List;

import com.system.configuration.address.model.AddressBean;

public interface AddressDao {

	public int insert(AddressBean address);
	public int update(AddressBean address);
	public int delete(int id);
	public AddressBean getAddressById(int id);
	public List<AddressBean> select();

}
