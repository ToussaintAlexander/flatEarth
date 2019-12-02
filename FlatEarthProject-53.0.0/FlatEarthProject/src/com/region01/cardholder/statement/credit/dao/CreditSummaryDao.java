package com.region01.cardholder.statement.credit.dao;

import java.util.List;

import com.region01.cardholder.statement.credit.model.CreditSummaryBean;

public interface CreditSummaryDao {

	public int insert(CreditSummaryBean credit);
	public int update(CreditSummaryBean credit);
	public int delete(int id);
	public CreditSummaryBean selectCreditSummaryById(int id);
	public List<CreditSummaryBean> select();
	
}
