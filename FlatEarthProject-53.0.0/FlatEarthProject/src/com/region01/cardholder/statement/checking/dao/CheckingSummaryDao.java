package com.region01.cardholder.statement.checking.dao;

import java.util.List;

import com.region01.cardholder.statement.checking.model.CheckingSummaryBean;

public interface CheckingSummaryDao {

	public int insert(CheckingSummaryBean credit);
	public int update(CheckingSummaryBean credit);
	public int delete(int id);
	public CheckingSummaryBean selectCheckingSummaryById(int id);
	public List<CheckingSummaryBean> select();
	
}
