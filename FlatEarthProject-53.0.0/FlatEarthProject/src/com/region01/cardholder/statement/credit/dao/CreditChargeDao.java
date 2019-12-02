package com.region01.cardholder.statement.credit.dao;

import java.util.List;

import com.region01.cardholder.statement.credit.model.CreditChargeBean;

public interface CreditChargeDao {

	public int insert(CreditChargeBean charge);
	public int update(CreditChargeBean charge);
	public int delete(int id);
	public CreditChargeBean selectCreditChargeById(int id);
	public List<CreditChargeBean> select();

}
