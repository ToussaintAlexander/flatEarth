package com.region01.cardholder.statement.credit.dao;

import java.util.List;

import com.region01.cardholder.statement.credit.model.CreditDetailBean;

public interface CreditDetailDao {

	public int insert(CreditDetailBean credit);
	public int update(CreditDetailBean credit);
	public int delete(int id);
	public CreditDetailBean selectCreditDetailById(int id);
	public List<CreditDetailBean> select();
	
}
