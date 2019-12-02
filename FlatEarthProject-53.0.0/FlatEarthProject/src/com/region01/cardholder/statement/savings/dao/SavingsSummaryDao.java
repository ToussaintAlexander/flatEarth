package com.region01.cardholder.statement.savings.dao;

import java.util.List;

import com.region01.cardholder.statement.savings.model.SavingsSummaryBean;

public interface SavingsSummaryDao {

	public int insert(SavingsSummaryBean savings);
	public int update(SavingsSummaryBean savings);
	public int delete(int id);
	public SavingsSummaryBean selectSavingsSummaryById(int id);
	public List<SavingsSummaryBean> select();
	
}
