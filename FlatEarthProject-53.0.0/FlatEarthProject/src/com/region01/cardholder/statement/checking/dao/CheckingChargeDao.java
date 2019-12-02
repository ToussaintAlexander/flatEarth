package com.region01.cardholder.statement.checking.dao;

import java.util.List;

import com.region01.cardholder.statement.checking.model.CheckingChargeBean;

public interface CheckingChargeDao {

	public int insert(CheckingChargeBean charge);
	public int update(CheckingChargeBean charge);
	public int delete(int id);
	public CheckingChargeBean selectCheckingChargeById(int id);
	public List<CheckingChargeBean> select();

}
