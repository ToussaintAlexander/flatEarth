package com.region05.merchant.retailer.dao;

import java.util.List;

import com.region05.merchant.retailer.model.RetailerBean;

public interface RetailerDao {

	public int insert(RetailerBean retailer);
	public int update(RetailerBean retailer);
	public int delete(int id);
	public RetailerBean selectRetailerById(int id);
	public List<RetailerBean> select();

}
