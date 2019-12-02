package com.region01.cardholder.statement.savings.dao;

import java.util.List;

import com.region01.cardholder.statement.savings.model.SavingsDetailBean;

public interface SavingsDetailDao {

	public int insert(SavingsDetailBean savings);
	public int update(SavingsDetailBean savings);
	public int delete(int id);
	public SavingsDetailBean selectSavingsDetailById(int id);
	public List<SavingsDetailBean> select();
	
}
