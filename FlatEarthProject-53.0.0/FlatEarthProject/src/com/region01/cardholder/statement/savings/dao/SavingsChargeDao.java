package com.region01.cardholder.statement.savings.dao;

import java.util.List;

import com.region01.cardholder.statement.savings.model.SavingsChargeBean;

public interface SavingsChargeDao {

	public int insert(SavingsChargeBean charge);
	public int update(SavingsChargeBean charge);
	public int delete(int id);
	public SavingsChargeBean selectSavingsChargeById(int id);
	public List<SavingsChargeBean> select();

}
