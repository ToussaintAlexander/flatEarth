package com.region01.cardholder.statement.checking.dao;

import java.util.List;

import com.region01.cardholder.statement.checking.model.CheckingDetailBean;

public interface CheckingDetailDao {

	public int insert(CheckingDetailBean credit);
	public int update(CheckingDetailBean credit);
	public int delete(int id);
	public CheckingDetailBean selectCheckingDetailById(int id);
	public List<CheckingDetailBean> select();
	
}
